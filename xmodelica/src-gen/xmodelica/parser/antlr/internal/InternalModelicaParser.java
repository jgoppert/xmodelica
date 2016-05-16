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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_STRING", "RULE_UNSIGNED_NUMBER", "RULE_TRUE_FALSE", "RULE_NONDIGIT", "RULE_DIGIT", "RULE_Q_IDENT", "RULE_UNSIGNED_INTEGER", "RULE_S_CHAR", "RULE_S_ESCAPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_Q_CHAR", "'within'", "';'", "'final'", "'encapsulated'", "'partial'", "'class'", "'model'", "'operator'", "'record'", "'block'", "'expandable'", "'connector'", "'type'", "'package'", "'pure'", "'impure'", "'function'", "'end'", "'='", "','", "'public'", "'protected'", "'external'", "'('", "')'", "'redeclare'", "'inner'", "'outer'", "'replaceable'", "'import'", "'*'", "'extends'", "'constrainedby'", "'flow'", "'stream'", "'discrete'", "'parameter'", "'constant'", "'input'", "'output'", "'if'", "':='", "'each'", "'enumeration'", "':'", "'initial'", "'equation'", "'algorithm'", "'break'", "'return'", "'then'", "'elseif'", "'else'", "'for'", "'loop'", "'in'", "'while'", "'when'", "'elsewhen'", "'connect'", "'or'", "'and'", "'not'", "'<'", "'<='", "'>'", "'>='", "'=='", "'<>'", "'+'", "'-'", "'.+'", "'.-'", "'/'", "'.*'", "'./'", "'^'", "'.^'", "'['", "']'", "'{'", "'}'", "'der'", "'.'", "'annotation'"
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
    public static final int RULE_DIGIT=9;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int RULE_S_ESCAPE=13;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_TRUE_FALSE=7;
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
    public static final int RULE_S_CHAR=12;
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
    public static final int RULE_UNSIGNED_INTEGER=11;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_Q_CHAR=17;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_Q_IDENT=10;
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
    public static final int RULE_NONDIGIT=8;
    public static final int RULE_SL_COMMENT=15;
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
    public static final int RULE_WS=16;
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
    // InternalModelica.g:71:1: ruleStoredDefinition returns [EObject current=null] : ( (otherlv_0= 'within' ( (lv_within_1_0= ruleName ) ) otherlv_2= ';' )? ( ( (lv_classes_3_0= ruleClassDefinitionWithFinal ) ) otherlv_4= ';' )* ) ;
    public final EObject ruleStoredDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_within_1_0 = null;

        EObject lv_classes_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:77:2: ( ( (otherlv_0= 'within' ( (lv_within_1_0= ruleName ) ) otherlv_2= ';' )? ( ( (lv_classes_3_0= ruleClassDefinitionWithFinal ) ) otherlv_4= ';' )* ) )
            // InternalModelica.g:78:2: ( (otherlv_0= 'within' ( (lv_within_1_0= ruleName ) ) otherlv_2= ';' )? ( ( (lv_classes_3_0= ruleClassDefinitionWithFinal ) ) otherlv_4= ';' )* )
            {
            // InternalModelica.g:78:2: ( (otherlv_0= 'within' ( (lv_within_1_0= ruleName ) ) otherlv_2= ';' )? ( ( (lv_classes_3_0= ruleClassDefinitionWithFinal ) ) otherlv_4= ';' )* )
            // InternalModelica.g:79:3: (otherlv_0= 'within' ( (lv_within_1_0= ruleName ) ) otherlv_2= ';' )? ( ( (lv_classes_3_0= ruleClassDefinitionWithFinal ) ) otherlv_4= ';' )*
            {
            // InternalModelica.g:79:3: (otherlv_0= 'within' ( (lv_within_1_0= ruleName ) ) otherlv_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalModelica.g:80:4: otherlv_0= 'within' ( (lv_within_1_0= ruleName ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getStoredDefinitionAccess().getWithinKeyword_0_0());
                    			
                    // InternalModelica.g:84:4: ( (lv_within_1_0= ruleName ) )
                    // InternalModelica.g:85:5: (lv_within_1_0= ruleName )
                    {
                    // InternalModelica.g:85:5: (lv_within_1_0= ruleName )
                    // InternalModelica.g:86:6: lv_within_1_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getStoredDefinitionAccess().getWithinNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_within_1_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStoredDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"within",
                    							lv_within_1_0,
                    							"xmodelica.Modelica.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getStoredDefinitionAccess().getSemicolonKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalModelica.g:108:3: ( ( (lv_classes_3_0= ruleClassDefinitionWithFinal ) ) otherlv_4= ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=20 && LA2_0<=34)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalModelica.g:109:4: ( (lv_classes_3_0= ruleClassDefinitionWithFinal ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:109:4: ( (lv_classes_3_0= ruleClassDefinitionWithFinal ) )
            	    // InternalModelica.g:110:5: (lv_classes_3_0= ruleClassDefinitionWithFinal )
            	    {
            	    // InternalModelica.g:110:5: (lv_classes_3_0= ruleClassDefinitionWithFinal )
            	    // InternalModelica.g:111:6: lv_classes_3_0= ruleClassDefinitionWithFinal
            	    {

            	    						newCompositeNode(grammarAccess.getStoredDefinitionAccess().getClassesClassDefinitionWithFinalParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_classes_3_0=ruleClassDefinitionWithFinal();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStoredDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"classes",
            	    							lv_classes_3_0,
            	    							"xmodelica.Modelica.ClassDefinitionWithFinal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getStoredDefinitionAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleClassDefinitionWithFinal"
    // InternalModelica.g:137:1: entryRuleClassDefinitionWithFinal returns [EObject current=null] : iv_ruleClassDefinitionWithFinal= ruleClassDefinitionWithFinal EOF ;
    public final EObject entryRuleClassDefinitionWithFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionWithFinal = null;


        try {
            // InternalModelica.g:137:65: (iv_ruleClassDefinitionWithFinal= ruleClassDefinitionWithFinal EOF )
            // InternalModelica.g:138:2: iv_ruleClassDefinitionWithFinal= ruleClassDefinitionWithFinal EOF
            {
             newCompositeNode(grammarAccess.getClassDefinitionWithFinalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDefinitionWithFinal=ruleClassDefinitionWithFinal();

            state._fsp--;

             current =iv_ruleClassDefinitionWithFinal; 
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
    // $ANTLR end "entryRuleClassDefinitionWithFinal"


    // $ANTLR start "ruleClassDefinitionWithFinal"
    // InternalModelica.g:144:1: ruleClassDefinitionWithFinal returns [EObject current=null] : ( ( (lv_final_0_0= 'final' ) )? ( (lv_encapsulated_1_0= 'encapsulated' ) )? ruleClassPrefixes this_ClassSpecifier_3= ruleClassSpecifier ) ;
    public final EObject ruleClassDefinitionWithFinal() throws RecognitionException {
        EObject current = null;

        Token lv_final_0_0=null;
        Token lv_encapsulated_1_0=null;
        EObject this_ClassSpecifier_3 = null;



        	enterRule();

        try {
            // InternalModelica.g:150:2: ( ( ( (lv_final_0_0= 'final' ) )? ( (lv_encapsulated_1_0= 'encapsulated' ) )? ruleClassPrefixes this_ClassSpecifier_3= ruleClassSpecifier ) )
            // InternalModelica.g:151:2: ( ( (lv_final_0_0= 'final' ) )? ( (lv_encapsulated_1_0= 'encapsulated' ) )? ruleClassPrefixes this_ClassSpecifier_3= ruleClassSpecifier )
            {
            // InternalModelica.g:151:2: ( ( (lv_final_0_0= 'final' ) )? ( (lv_encapsulated_1_0= 'encapsulated' ) )? ruleClassPrefixes this_ClassSpecifier_3= ruleClassSpecifier )
            // InternalModelica.g:152:3: ( (lv_final_0_0= 'final' ) )? ( (lv_encapsulated_1_0= 'encapsulated' ) )? ruleClassPrefixes this_ClassSpecifier_3= ruleClassSpecifier
            {
            // InternalModelica.g:152:3: ( (lv_final_0_0= 'final' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalModelica.g:153:4: (lv_final_0_0= 'final' )
                    {
                    // InternalModelica.g:153:4: (lv_final_0_0= 'final' )
                    // InternalModelica.g:154:5: lv_final_0_0= 'final'
                    {
                    lv_final_0_0=(Token)match(input,20,FOLLOW_6); 

                    					newLeafNode(lv_final_0_0, grammarAccess.getClassDefinitionWithFinalAccess().getFinalFinalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDefinitionWithFinalRule());
                    					}
                    					setWithLastConsumed(current, "final", true, "final");
                    				

                    }


                    }
                    break;

            }

            // InternalModelica.g:166:3: ( (lv_encapsulated_1_0= 'encapsulated' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalModelica.g:167:4: (lv_encapsulated_1_0= 'encapsulated' )
                    {
                    // InternalModelica.g:167:4: (lv_encapsulated_1_0= 'encapsulated' )
                    // InternalModelica.g:168:5: lv_encapsulated_1_0= 'encapsulated'
                    {
                    lv_encapsulated_1_0=(Token)match(input,21,FOLLOW_6); 

                    					newLeafNode(lv_encapsulated_1_0, grammarAccess.getClassDefinitionWithFinalAccess().getEncapsulatedEncapsulatedKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDefinitionWithFinalRule());
                    					}
                    					setWithLastConsumed(current, "encapsulated", true, "encapsulated");
                    				

                    }


                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getClassDefinitionWithFinalAccess().getClassPrefixesParserRuleCall_2());
            		
            pushFollow(FOLLOW_7);
            ruleClassPrefixes();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getClassDefinitionWithFinalAccess().getClassSpecifierParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_ClassSpecifier_3=ruleClassSpecifier();

            state._fsp--;


            			current = this_ClassSpecifier_3;
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
    // $ANTLR end "ruleClassDefinitionWithFinal"


    // $ANTLR start "entryRuleClassDefinition"
    // InternalModelica.g:199:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalModelica.g:199:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalModelica.g:200:2: iv_ruleClassDefinition= ruleClassDefinition EOF
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
    // InternalModelica.g:206:1: ruleClassDefinition returns [EObject current=null] : ( ( (lv_encapsulated_0_0= 'encapsulated' ) )? ruleClassPrefixes this_ClassSpecifier_2= ruleClassSpecifier ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_encapsulated_0_0=null;
        EObject this_ClassSpecifier_2 = null;



        	enterRule();

        try {
            // InternalModelica.g:212:2: ( ( ( (lv_encapsulated_0_0= 'encapsulated' ) )? ruleClassPrefixes this_ClassSpecifier_2= ruleClassSpecifier ) )
            // InternalModelica.g:213:2: ( ( (lv_encapsulated_0_0= 'encapsulated' ) )? ruleClassPrefixes this_ClassSpecifier_2= ruleClassSpecifier )
            {
            // InternalModelica.g:213:2: ( ( (lv_encapsulated_0_0= 'encapsulated' ) )? ruleClassPrefixes this_ClassSpecifier_2= ruleClassSpecifier )
            // InternalModelica.g:214:3: ( (lv_encapsulated_0_0= 'encapsulated' ) )? ruleClassPrefixes this_ClassSpecifier_2= ruleClassSpecifier
            {
            // InternalModelica.g:214:3: ( (lv_encapsulated_0_0= 'encapsulated' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalModelica.g:215:4: (lv_encapsulated_0_0= 'encapsulated' )
                    {
                    // InternalModelica.g:215:4: (lv_encapsulated_0_0= 'encapsulated' )
                    // InternalModelica.g:216:5: lv_encapsulated_0_0= 'encapsulated'
                    {
                    lv_encapsulated_0_0=(Token)match(input,21,FOLLOW_6); 

                    					newLeafNode(lv_encapsulated_0_0, grammarAccess.getClassDefinitionAccess().getEncapsulatedEncapsulatedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "encapsulated", true, "encapsulated");
                    				

                    }


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
    // InternalModelica.g:247:1: entryRuleClassPrefixes returns [String current=null] : iv_ruleClassPrefixes= ruleClassPrefixes EOF ;
    public final String entryRuleClassPrefixes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassPrefixes = null;


        try {
            // InternalModelica.g:247:53: (iv_ruleClassPrefixes= ruleClassPrefixes EOF )
            // InternalModelica.g:248:2: iv_ruleClassPrefixes= ruleClassPrefixes EOF
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
    // InternalModelica.g:254:1: ruleClassPrefixes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'partial' )? (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' ) ) ;
    public final AntlrDatatypeRuleToken ruleClassPrefixes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:260:2: ( ( (kw= 'partial' )? (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' ) ) )
            // InternalModelica.g:261:2: ( (kw= 'partial' )? (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' ) )
            {
            // InternalModelica.g:261:2: ( (kw= 'partial' )? (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' ) )
            // InternalModelica.g:262:3: (kw= 'partial' )? (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' )
            {
            // InternalModelica.g:262:3: (kw= 'partial' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalModelica.g:263:4: kw= 'partial'
                    {
                    kw=(Token)match(input,22,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getPartialKeyword_0());
                    			

                    }
                    break;

            }

            // InternalModelica.g:269:3: (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' )
            int alt11=9;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalModelica.g:270:4: kw= 'class'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getClassKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:276:4: kw= 'model'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getModelKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalModelica.g:282:4: ( (kw= 'operator' )? kw= 'record' )
                    {
                    // InternalModelica.g:282:4: ( (kw= 'operator' )? kw= 'record' )
                    // InternalModelica.g:283:5: (kw= 'operator' )? kw= 'record'
                    {
                    // InternalModelica.g:283:5: (kw= 'operator' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==25) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalModelica.g:284:6: kw= 'operator'
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
                    // InternalModelica.g:297:4: kw= 'block'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getBlockKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalModelica.g:303:4: ( (kw= 'expandable' )? kw= 'connector' )
                    {
                    // InternalModelica.g:303:4: ( (kw= 'expandable' )? kw= 'connector' )
                    // InternalModelica.g:304:5: (kw= 'expandable' )? kw= 'connector'
                    {
                    // InternalModelica.g:304:5: (kw= 'expandable' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==28) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalModelica.g:305:6: kw= 'expandable'
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
                    // InternalModelica.g:318:4: kw= 'type'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getTypeKeyword_1_5());
                    			

                    }
                    break;
                case 7 :
                    // InternalModelica.g:324:4: kw= 'package'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getPackageKeyword_1_6());
                    			

                    }
                    break;
                case 8 :
                    // InternalModelica.g:330:4: ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' )
                    {
                    // InternalModelica.g:330:4: ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' )
                    // InternalModelica.g:331:5: (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function'
                    {
                    // InternalModelica.g:331:5: (kw= 'pure' | kw= 'impure' )?
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
                            // InternalModelica.g:332:6: kw= 'pure'
                            {
                            kw=(Token)match(input,32,FOLLOW_11); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getPureKeyword_1_7_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalModelica.g:338:6: kw= 'impure'
                            {
                            kw=(Token)match(input,33,FOLLOW_11); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getClassPrefixesAccess().getImpureKeyword_1_7_0_1());
                            					

                            }
                            break;

                    }

                    // InternalModelica.g:344:5: (kw= 'operator' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==25) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalModelica.g:345:6: kw= 'operator'
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
                    // InternalModelica.g:358:4: kw= 'operator'
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
    // InternalModelica.g:368:1: entryRuleClassSpecifier returns [EObject current=null] : iv_ruleClassSpecifier= ruleClassSpecifier EOF ;
    public final EObject entryRuleClassSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassSpecifier = null;


        try {
            // InternalModelica.g:368:55: (iv_ruleClassSpecifier= ruleClassSpecifier EOF )
            // InternalModelica.g:369:2: iv_ruleClassSpecifier= ruleClassSpecifier EOF
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
    // InternalModelica.g:375:1: ruleClassSpecifier returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_str_comment_1_0= ruleStringComment ) ) ( (lv_composition_2_0= ruleComposition ) ) otherlv_3= 'end' ( (lv_name_end_4_0= RULE_IDENT ) ) ) | ( ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_prefix_7_0= ruleBasePrefix ) ) ( (lv_name2_8_0= ruleName ) ) ( (lv_subs_9_0= ruleArraySubscripts ) )? ( (lv_mod_10_0= ruleClassModification ) )? ) ) ;
    public final EObject ruleClassSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_3=null;
        Token lv_name_end_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_str_comment_1_0 = null;

        EObject lv_composition_2_0 = null;

        AntlrDatatypeRuleToken lv_prefix_7_0 = null;

        AntlrDatatypeRuleToken lv_name2_8_0 = null;

        EObject lv_subs_9_0 = null;

        EObject lv_mod_10_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:381:2: ( ( ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_str_comment_1_0= ruleStringComment ) ) ( (lv_composition_2_0= ruleComposition ) ) otherlv_3= 'end' ( (lv_name_end_4_0= RULE_IDENT ) ) ) | ( ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_prefix_7_0= ruleBasePrefix ) ) ( (lv_name2_8_0= ruleName ) ) ( (lv_subs_9_0= ruleArraySubscripts ) )? ( (lv_mod_10_0= ruleClassModification ) )? ) ) )
            // InternalModelica.g:382:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_str_comment_1_0= ruleStringComment ) ) ( (lv_composition_2_0= ruleComposition ) ) otherlv_3= 'end' ( (lv_name_end_4_0= RULE_IDENT ) ) ) | ( ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_prefix_7_0= ruleBasePrefix ) ) ( (lv_name2_8_0= ruleName ) ) ( (lv_subs_9_0= ruleArraySubscripts ) )? ( (lv_mod_10_0= ruleClassModification ) )? ) )
            {
            // InternalModelica.g:382:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_str_comment_1_0= ruleStringComment ) ) ( (lv_composition_2_0= ruleComposition ) ) otherlv_3= 'end' ( (lv_name_end_4_0= RULE_IDENT ) ) ) | ( ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_prefix_7_0= ruleBasePrefix ) ) ( (lv_name2_8_0= ruleName ) ) ( (lv_subs_9_0= ruleArraySubscripts ) )? ( (lv_mod_10_0= ruleClassModification ) )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_IDENT) ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>=RULE_IDENT && LA14_1<=RULE_STRING)||(LA14_1>=20 && LA14_1<=35)||(LA14_1>=38 && LA14_1<=40)||(LA14_1>=43 && LA14_1<=47)||LA14_1==49||(LA14_1>=51 && LA14_1<=57)||(LA14_1>=63 && LA14_1<=65)||(LA14_1>=101 && LA14_1<=102)) ) {
                    alt14=1;
                }
                else if ( (LA14_1==36) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalModelica.g:383:3: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_str_comment_1_0= ruleStringComment ) ) ( (lv_composition_2_0= ruleComposition ) ) otherlv_3= 'end' ( (lv_name_end_4_0= RULE_IDENT ) ) )
                    {
                    // InternalModelica.g:383:3: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_str_comment_1_0= ruleStringComment ) ) ( (lv_composition_2_0= ruleComposition ) ) otherlv_3= 'end' ( (lv_name_end_4_0= RULE_IDENT ) ) )
                    // InternalModelica.g:384:4: ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_str_comment_1_0= ruleStringComment ) ) ( (lv_composition_2_0= ruleComposition ) ) otherlv_3= 'end' ( (lv_name_end_4_0= RULE_IDENT ) )
                    {
                    // InternalModelica.g:384:4: ( (lv_name_0_0= RULE_IDENT ) )
                    // InternalModelica.g:385:5: (lv_name_0_0= RULE_IDENT )
                    {
                    // InternalModelica.g:385:5: (lv_name_0_0= RULE_IDENT )
                    // InternalModelica.g:386:6: lv_name_0_0= RULE_IDENT
                    {
                    lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_13); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getClassSpecifierAccess().getNameIDENTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassSpecifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"xmodelica.Modelica.IDENT");
                    					

                    }


                    }

                    // InternalModelica.g:402:4: ( (lv_str_comment_1_0= ruleStringComment ) )
                    // InternalModelica.g:403:5: (lv_str_comment_1_0= ruleStringComment )
                    {
                    // InternalModelica.g:403:5: (lv_str_comment_1_0= ruleStringComment )
                    // InternalModelica.g:404:6: lv_str_comment_1_0= ruleStringComment
                    {

                    						newCompositeNode(grammarAccess.getClassSpecifierAccess().getStr_commentStringCommentParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_str_comment_1_0=ruleStringComment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassSpecifierRule());
                    						}
                    						set(
                    							current,
                    							"str_comment",
                    							lv_str_comment_1_0,
                    							"xmodelica.Modelica.StringComment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelica.g:421:4: ( (lv_composition_2_0= ruleComposition ) )
                    // InternalModelica.g:422:5: (lv_composition_2_0= ruleComposition )
                    {
                    // InternalModelica.g:422:5: (lv_composition_2_0= ruleComposition )
                    // InternalModelica.g:423:6: lv_composition_2_0= ruleComposition
                    {

                    						newCompositeNode(grammarAccess.getClassSpecifierAccess().getCompositionCompositionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_composition_2_0=ruleComposition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassSpecifierRule());
                    						}
                    						set(
                    							current,
                    							"composition",
                    							lv_composition_2_0,
                    							"xmodelica.Modelica.Composition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,35,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassSpecifierAccess().getEndKeyword_0_3());
                    			
                    // InternalModelica.g:444:4: ( (lv_name_end_4_0= RULE_IDENT ) )
                    // InternalModelica.g:445:5: (lv_name_end_4_0= RULE_IDENT )
                    {
                    // InternalModelica.g:445:5: (lv_name_end_4_0= RULE_IDENT )
                    // InternalModelica.g:446:6: lv_name_end_4_0= RULE_IDENT
                    {
                    lv_name_end_4_0=(Token)match(input,RULE_IDENT,FOLLOW_2); 

                    						newLeafNode(lv_name_end_4_0, grammarAccess.getClassSpecifierAccess().getName_endIDENTTerminalRuleCall_0_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassSpecifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name_end",
                    							lv_name_end_4_0,
                    							"xmodelica.Modelica.IDENT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:464:3: ( ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_prefix_7_0= ruleBasePrefix ) ) ( (lv_name2_8_0= ruleName ) ) ( (lv_subs_9_0= ruleArraySubscripts ) )? ( (lv_mod_10_0= ruleClassModification ) )? )
                    {
                    // InternalModelica.g:464:3: ( ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_prefix_7_0= ruleBasePrefix ) ) ( (lv_name2_8_0= ruleName ) ) ( (lv_subs_9_0= ruleArraySubscripts ) )? ( (lv_mod_10_0= ruleClassModification ) )? )
                    // InternalModelica.g:465:4: ( (lv_name_5_0= RULE_IDENT ) ) otherlv_6= '=' ( (lv_prefix_7_0= ruleBasePrefix ) ) ( (lv_name2_8_0= ruleName ) ) ( (lv_subs_9_0= ruleArraySubscripts ) )? ( (lv_mod_10_0= ruleClassModification ) )?
                    {
                    // InternalModelica.g:465:4: ( (lv_name_5_0= RULE_IDENT ) )
                    // InternalModelica.g:466:5: (lv_name_5_0= RULE_IDENT )
                    {
                    // InternalModelica.g:466:5: (lv_name_5_0= RULE_IDENT )
                    // InternalModelica.g:467:6: lv_name_5_0= RULE_IDENT
                    {
                    lv_name_5_0=(Token)match(input,RULE_IDENT,FOLLOW_15); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getClassSpecifierAccess().getNameIDENTTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassSpecifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"xmodelica.Modelica.IDENT");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassSpecifierAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalModelica.g:487:4: ( (lv_prefix_7_0= ruleBasePrefix ) )
                    // InternalModelica.g:488:5: (lv_prefix_7_0= ruleBasePrefix )
                    {
                    // InternalModelica.g:488:5: (lv_prefix_7_0= ruleBasePrefix )
                    // InternalModelica.g:489:6: lv_prefix_7_0= ruleBasePrefix
                    {

                    						newCompositeNode(grammarAccess.getClassSpecifierAccess().getPrefixBasePrefixParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_prefix_7_0=ruleBasePrefix();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassSpecifierRule());
                    						}
                    						set(
                    							current,
                    							"prefix",
                    							lv_prefix_7_0,
                    							"xmodelica.Modelica.BasePrefix");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelica.g:506:4: ( (lv_name2_8_0= ruleName ) )
                    // InternalModelica.g:507:5: (lv_name2_8_0= ruleName )
                    {
                    // InternalModelica.g:507:5: (lv_name2_8_0= ruleName )
                    // InternalModelica.g:508:6: lv_name2_8_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getClassSpecifierAccess().getName2NameParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_name2_8_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassSpecifierRule());
                    						}
                    						set(
                    							current,
                    							"name2",
                    							lv_name2_8_0,
                    							"xmodelica.Modelica.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelica.g:525:4: ( (lv_subs_9_0= ruleArraySubscripts ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==96) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalModelica.g:526:5: (lv_subs_9_0= ruleArraySubscripts )
                            {
                            // InternalModelica.g:526:5: (lv_subs_9_0= ruleArraySubscripts )
                            // InternalModelica.g:527:6: lv_subs_9_0= ruleArraySubscripts
                            {

                            						newCompositeNode(grammarAccess.getClassSpecifierAccess().getSubsArraySubscriptsParserRuleCall_1_4_0());
                            					
                            pushFollow(FOLLOW_18);
                            lv_subs_9_0=ruleArraySubscripts();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getClassSpecifierRule());
                            						}
                            						set(
                            							current,
                            							"subs",
                            							lv_subs_9_0,
                            							"xmodelica.Modelica.ArraySubscripts");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalModelica.g:544:4: ( (lv_mod_10_0= ruleClassModification ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==41) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalModelica.g:545:5: (lv_mod_10_0= ruleClassModification )
                            {
                            // InternalModelica.g:545:5: (lv_mod_10_0= ruleClassModification )
                            // InternalModelica.g:546:6: lv_mod_10_0= ruleClassModification
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
    // InternalModelica.g:568:1: entryRuleBasePrefix returns [String current=null] : iv_ruleBasePrefix= ruleBasePrefix EOF ;
    public final String entryRuleBasePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasePrefix = null;


        try {
            // InternalModelica.g:568:50: (iv_ruleBasePrefix= ruleBasePrefix EOF )
            // InternalModelica.g:569:2: iv_ruleBasePrefix= ruleBasePrefix EOF
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
    // InternalModelica.g:575:1: ruleBasePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_TypePrefix_0= ruleTypePrefix ;
    public final AntlrDatatypeRuleToken ruleBasePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypePrefix_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:581:2: (this_TypePrefix_0= ruleTypePrefix )
            // InternalModelica.g:582:2: this_TypePrefix_0= ruleTypePrefix
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
    // InternalModelica.g:595:1: entryRuleEnumList returns [EObject current=null] : iv_ruleEnumList= ruleEnumList EOF ;
    public final EObject entryRuleEnumList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumList = null;


        try {
            // InternalModelica.g:595:49: (iv_ruleEnumList= ruleEnumList EOF )
            // InternalModelica.g:596:2: iv_ruleEnumList= ruleEnumList EOF
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
    // InternalModelica.g:602:1: ruleEnumList returns [EObject current=null] : ( ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )* ) ;
    public final EObject ruleEnumList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_enums_0_0 = null;

        EObject lv_enums_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:608:2: ( ( ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )* ) )
            // InternalModelica.g:609:2: ( ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )* )
            {
            // InternalModelica.g:609:2: ( ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )* )
            // InternalModelica.g:610:3: ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )*
            {
            // InternalModelica.g:610:3: ( (lv_enums_0_0= ruleEnumerationLiteral ) )
            // InternalModelica.g:611:4: (lv_enums_0_0= ruleEnumerationLiteral )
            {
            // InternalModelica.g:611:4: (lv_enums_0_0= ruleEnumerationLiteral )
            // InternalModelica.g:612:5: lv_enums_0_0= ruleEnumerationLiteral
            {

            					newCompositeNode(grammarAccess.getEnumListAccess().getEnumsEnumerationLiteralParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalModelica.g:629:3: (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalModelica.g:630:4: otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEnumListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:634:4: ( (lv_enums_2_0= ruleEnumerationLiteral ) )
            	    // InternalModelica.g:635:5: (lv_enums_2_0= ruleEnumerationLiteral )
            	    {
            	    // InternalModelica.g:635:5: (lv_enums_2_0= ruleEnumerationLiteral )
            	    // InternalModelica.g:636:6: lv_enums_2_0= ruleEnumerationLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getEnumListAccess().getEnumsEnumerationLiteralParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    break loop15;
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
    // InternalModelica.g:658:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalModelica.g:658:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalModelica.g:659:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalModelica.g:665:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_id_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleComment ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_comment_1_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:671:2: ( ( ( (lv_id_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleComment ) ) ) )
            // InternalModelica.g:672:2: ( ( (lv_id_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleComment ) ) )
            {
            // InternalModelica.g:672:2: ( ( (lv_id_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleComment ) ) )
            // InternalModelica.g:673:3: ( (lv_id_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleComment ) )
            {
            // InternalModelica.g:673:3: ( (lv_id_0_0= RULE_IDENT ) )
            // InternalModelica.g:674:4: (lv_id_0_0= RULE_IDENT )
            {
            // InternalModelica.g:674:4: (lv_id_0_0= RULE_IDENT )
            // InternalModelica.g:675:5: lv_id_0_0= RULE_IDENT
            {
            lv_id_0_0=(Token)match(input,RULE_IDENT,FOLLOW_20); 

            					newLeafNode(lv_id_0_0, grammarAccess.getEnumerationLiteralAccess().getIdIDENTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"xmodelica.Modelica.IDENT");
            				

            }


            }

            // InternalModelica.g:691:3: ( (lv_comment_1_0= ruleComment ) )
            // InternalModelica.g:692:4: (lv_comment_1_0= ruleComment )
            {
            // InternalModelica.g:692:4: (lv_comment_1_0= ruleComment )
            // InternalModelica.g:693:5: lv_comment_1_0= ruleComment
            {

            					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getCommentCommentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_comment_1_0=ruleComment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
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
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleComposition"
    // InternalModelica.g:714:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalModelica.g:714:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalModelica.g:715:2: iv_ruleComposition= ruleComposition EOF
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
    // InternalModelica.g:721:1: ruleComposition returns [EObject current=null] : ( ( (lv_priv_elist_0_0= ruleElementList ) ) ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )? ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_priv_elist_0_0 = null;

        EObject lv_pub_elist_2_0 = null;

        EObject lv_protected_elist_4_0 = null;

        EObject lv_eq_secs_5_0 = null;

        EObject lv_alg_secs_6_0 = null;

        AntlrDatatypeRuleToken lv_ext_lang_spec_8_0 = null;

        EObject lv_ext_func_call_9_0 = null;

        EObject lv_ext_anno_10_0 = null;

        EObject lv_anno_12_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:727:2: ( ( ( (lv_priv_elist_0_0= ruleElementList ) ) ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )? ) )
            // InternalModelica.g:728:2: ( ( (lv_priv_elist_0_0= ruleElementList ) ) ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )? )
            {
            // InternalModelica.g:728:2: ( ( (lv_priv_elist_0_0= ruleElementList ) ) ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )? )
            // InternalModelica.g:729:3: ( (lv_priv_elist_0_0= ruleElementList ) ) ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )?
            {
            // InternalModelica.g:729:3: ( (lv_priv_elist_0_0= ruleElementList ) )
            // InternalModelica.g:730:4: (lv_priv_elist_0_0= ruleElementList )
            {
            // InternalModelica.g:730:4: (lv_priv_elist_0_0= ruleElementList )
            // InternalModelica.g:731:5: lv_priv_elist_0_0= ruleElementList
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getPriv_elistElementListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_priv_elist_0_0=ruleElementList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"priv_elist",
            						lv_priv_elist_0_0,
            						"xmodelica.Modelica.ElementList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:748:3: ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )*
            loop16:
            do {
                int alt16=5;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    alt16=1;
                    }
                    break;
                case 39:
                    {
                    alt16=2;
                    }
                    break;
                case 63:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (LA16_4==65) ) {
                        alt16=4;
                    }
                    else if ( (LA16_4==64) ) {
                        alt16=3;
                    }


                    }
                    break;
                case 64:
                    {
                    alt16=3;
                    }
                    break;
                case 65:
                    {
                    alt16=4;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalModelica.g:749:4: (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) )
            	    {
            	    // InternalModelica.g:749:4: (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) )
            	    // InternalModelica.g:750:5: otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_22); 

            	    					newLeafNode(otherlv_1, grammarAccess.getCompositionAccess().getPublicKeyword_1_0_0());
            	    				
            	    // InternalModelica.g:754:5: ( (lv_pub_elist_2_0= ruleElementList ) )
            	    // InternalModelica.g:755:6: (lv_pub_elist_2_0= ruleElementList )
            	    {
            	    // InternalModelica.g:755:6: (lv_pub_elist_2_0= ruleElementList )
            	    // InternalModelica.g:756:7: lv_pub_elist_2_0= ruleElementList
            	    {

            	    							newCompositeNode(grammarAccess.getCompositionAccess().getPub_elistElementListParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
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
            	    // InternalModelica.g:775:4: (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) )
            	    {
            	    // InternalModelica.g:775:4: (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) )
            	    // InternalModelica.g:776:5: otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) )
            	    {
            	    otherlv_3=(Token)match(input,39,FOLLOW_22); 

            	    					newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getProtectedKeyword_1_1_0());
            	    				
            	    // InternalModelica.g:780:5: ( (lv_protected_elist_4_0= ruleElementList ) )
            	    // InternalModelica.g:781:6: (lv_protected_elist_4_0= ruleElementList )
            	    {
            	    // InternalModelica.g:781:6: (lv_protected_elist_4_0= ruleElementList )
            	    // InternalModelica.g:782:7: lv_protected_elist_4_0= ruleElementList
            	    {

            	    							newCompositeNode(grammarAccess.getCompositionAccess().getProtected_elistElementListParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
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
            	    // InternalModelica.g:801:4: ( (lv_eq_secs_5_0= ruleEquationSection ) )
            	    {
            	    // InternalModelica.g:801:4: ( (lv_eq_secs_5_0= ruleEquationSection ) )
            	    // InternalModelica.g:802:5: (lv_eq_secs_5_0= ruleEquationSection )
            	    {
            	    // InternalModelica.g:802:5: (lv_eq_secs_5_0= ruleEquationSection )
            	    // InternalModelica.g:803:6: lv_eq_secs_5_0= ruleEquationSection
            	    {

            	    						newCompositeNode(grammarAccess.getCompositionAccess().getEq_secsEquationSectionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    // InternalModelica.g:821:4: ( (lv_alg_secs_6_0= ruleAlgorithmSection ) )
            	    {
            	    // InternalModelica.g:821:4: ( (lv_alg_secs_6_0= ruleAlgorithmSection ) )
            	    // InternalModelica.g:822:5: (lv_alg_secs_6_0= ruleAlgorithmSection )
            	    {
            	    // InternalModelica.g:822:5: (lv_alg_secs_6_0= ruleAlgorithmSection )
            	    // InternalModelica.g:823:6: lv_alg_secs_6_0= ruleAlgorithmSection
            	    {

            	    						newCompositeNode(grammarAccess.getCompositionAccess().getAlg_secsAlgorithmSectionParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    break loop16;
                }
            } while (true);

            // InternalModelica.g:841:3: (otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModelica.g:842:4: otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';'
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getCompositionAccess().getExternalKeyword_2_0());
                    			
                    // InternalModelica.g:846:4: ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_STRING) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalModelica.g:847:5: (lv_ext_lang_spec_8_0= ruleLanguageSpecification )
                            {
                            // InternalModelica.g:847:5: (lv_ext_lang_spec_8_0= ruleLanguageSpecification )
                            // InternalModelica.g:848:6: lv_ext_lang_spec_8_0= ruleLanguageSpecification
                            {

                            						newCompositeNode(grammarAccess.getCompositionAccess().getExt_lang_specLanguageSpecificationParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_24);
                            lv_ext_lang_spec_8_0=ruleLanguageSpecification();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCompositionRule());
                            						}
                            						set(
                            							current,
                            							"ext_lang_spec",
                            							lv_ext_lang_spec_8_0,
                            							"xmodelica.Modelica.LanguageSpecification");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalModelica.g:865:4: ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_IDENT||LA18_0==101) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalModelica.g:866:5: (lv_ext_func_call_9_0= ruleExternalFunctionCall )
                            {
                            // InternalModelica.g:866:5: (lv_ext_func_call_9_0= ruleExternalFunctionCall )
                            // InternalModelica.g:867:6: lv_ext_func_call_9_0= ruleExternalFunctionCall
                            {

                            						newCompositeNode(grammarAccess.getCompositionAccess().getExt_func_callExternalFunctionCallParserRuleCall_2_2_0());
                            					
                            pushFollow(FOLLOW_25);
                            lv_ext_func_call_9_0=ruleExternalFunctionCall();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCompositionRule());
                            						}
                            						set(
                            							current,
                            							"ext_func_call",
                            							lv_ext_func_call_9_0,
                            							"xmodelica.Modelica.ExternalFunctionCall");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalModelica.g:884:4: ( (lv_ext_anno_10_0= ruleAnnotation ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==102) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalModelica.g:885:5: (lv_ext_anno_10_0= ruleAnnotation )
                            {
                            // InternalModelica.g:885:5: (lv_ext_anno_10_0= ruleAnnotation )
                            // InternalModelica.g:886:6: lv_ext_anno_10_0= ruleAnnotation
                            {

                            						newCompositeNode(grammarAccess.getCompositionAccess().getExt_annoAnnotationParserRuleCall_2_3_0());
                            					
                            pushFollow(FOLLOW_4);
                            lv_ext_anno_10_0=ruleAnnotation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCompositionRule());
                            						}
                            						set(
                            							current,
                            							"ext_anno",
                            							lv_ext_anno_10_0,
                            							"xmodelica.Modelica.Annotation");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_26); 

                    				newLeafNode(otherlv_11, grammarAccess.getCompositionAccess().getSemicolonKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalModelica.g:908:3: ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==102) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalModelica.g:909:4: ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';'
                    {
                    // InternalModelica.g:909:4: ( (lv_anno_12_0= ruleAnnotation ) )
                    // InternalModelica.g:910:5: (lv_anno_12_0= ruleAnnotation )
                    {
                    // InternalModelica.g:910:5: (lv_anno_12_0= ruleAnnotation )
                    // InternalModelica.g:911:6: lv_anno_12_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getAnnoAnnotationParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_anno_12_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
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
    // InternalModelica.g:937:1: entryRuleLanguageSpecification returns [String current=null] : iv_ruleLanguageSpecification= ruleLanguageSpecification EOF ;
    public final String entryRuleLanguageSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLanguageSpecification = null;


        try {
            // InternalModelica.g:937:61: (iv_ruleLanguageSpecification= ruleLanguageSpecification EOF )
            // InternalModelica.g:938:2: iv_ruleLanguageSpecification= ruleLanguageSpecification EOF
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
    // InternalModelica.g:944:1: ruleLanguageSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleLanguageSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalModelica.g:950:2: (this_STRING_0= RULE_STRING )
            // InternalModelica.g:951:2: this_STRING_0= RULE_STRING
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
    // InternalModelica.g:961:1: entryRuleExternalFunctionCall returns [EObject current=null] : iv_ruleExternalFunctionCall= ruleExternalFunctionCall EOF ;
    public final EObject entryRuleExternalFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalFunctionCall = null;


        try {
            // InternalModelica.g:961:61: (iv_ruleExternalFunctionCall= ruleExternalFunctionCall EOF )
            // InternalModelica.g:962:2: iv_ruleExternalFunctionCall= ruleExternalFunctionCall EOF
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
    // InternalModelica.g:968:1: ruleExternalFunctionCall returns [EObject current=null] : ( ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')' ) ;
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
            // InternalModelica.g:974:2: ( ( ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')' ) )
            // InternalModelica.g:975:2: ( ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')' )
            {
            // InternalModelica.g:975:2: ( ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')' )
            // InternalModelica.g:976:3: ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')'
            {
            // InternalModelica.g:976:3: ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==101) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_IDENT) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==RULE_IDENT||LA22_2==36||LA22_2==96||LA22_2==101) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalModelica.g:977:4: ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '='
                    {
                    // InternalModelica.g:977:4: ( (lv_lhs_0_0= ruleComponentReference ) )
                    // InternalModelica.g:978:5: (lv_lhs_0_0= ruleComponentReference )
                    {
                    // InternalModelica.g:978:5: (lv_lhs_0_0= ruleComponentReference )
                    // InternalModelica.g:979:6: lv_lhs_0_0= ruleComponentReference
                    {

                    						newCompositeNode(grammarAccess.getExternalFunctionCallAccess().getLhsComponentReferenceParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    otherlv_1=(Token)match(input,36,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getExternalFunctionCallAccess().getEqualsSignKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalModelica.g:1001:3: ( (lv_name_2_0= RULE_IDENT ) )
            // InternalModelica.g:1002:4: (lv_name_2_0= RULE_IDENT )
            {
            // InternalModelica.g:1002:4: (lv_name_2_0= RULE_IDENT )
            // InternalModelica.g:1003:5: lv_name_2_0= RULE_IDENT
            {
            lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_27); 

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

            otherlv_3=(Token)match(input,41,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalFunctionCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalModelica.g:1023:3: ( (lv_args_4_0= ruleExpressionList ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_IDENT && LA23_0<=RULE_TRUE_FALSE)||LA23_0==35||LA23_0==58||LA23_0==63||LA23_0==80||(LA23_0>=87 && LA23_0<=90)||LA23_0==96||LA23_0==98||(LA23_0>=100 && LA23_0<=101)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalModelica.g:1024:4: (lv_args_4_0= ruleExpressionList )
                    {
                    // InternalModelica.g:1024:4: (lv_args_4_0= ruleExpressionList )
                    // InternalModelica.g:1025:5: lv_args_4_0= ruleExpressionList
                    {

                    					newCompositeNode(grammarAccess.getExternalFunctionCallAccess().getArgsExpressionListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_29);
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

            otherlv_5=(Token)match(input,42,FOLLOW_2); 

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
    // InternalModelica.g:1050:1: entryRuleElementList returns [EObject current=null] : iv_ruleElementList= ruleElementList EOF ;
    public final EObject entryRuleElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementList = null;


        try {
            // InternalModelica.g:1050:52: (iv_ruleElementList= ruleElementList EOF )
            // InternalModelica.g:1051:2: iv_ruleElementList= ruleElementList EOF
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
    // InternalModelica.g:1057:1: ruleElementList returns [EObject current=null] : ( () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )* ) ;
    public final EObject ruleElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_elem_1_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1063:2: ( ( () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )* ) )
            // InternalModelica.g:1064:2: ( () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )* )
            {
            // InternalModelica.g:1064:2: ( () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )* )
            // InternalModelica.g:1065:3: () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )*
            {
            // InternalModelica.g:1065:3: ()
            // InternalModelica.g:1066:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElementListAccess().getElementListAction_0(),
            					current);
            			

            }

            // InternalModelica.g:1072:3: ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_IDENT||(LA24_0>=20 && LA24_0<=34)||(LA24_0>=43 && LA24_0<=47)||LA24_0==49||(LA24_0>=51 && LA24_0<=57)||LA24_0==101) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalModelica.g:1073:4: ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';'
            	    {
            	    // InternalModelica.g:1073:4: ( (lv_elem_1_0= ruleElement ) )
            	    // InternalModelica.g:1074:5: (lv_elem_1_0= ruleElement )
            	    {
            	    // InternalModelica.g:1074:5: (lv_elem_1_0= ruleElement )
            	    // InternalModelica.g:1075:6: lv_elem_1_0= ruleElement
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

            	    otherlv_2=(Token)match(input,19,FOLLOW_30); 

            	    				newLeafNode(otherlv_2, grammarAccess.getElementListAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalModelica.g:1101:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalModelica.g:1101:48: (iv_ruleElement= ruleElement EOF )
            // InternalModelica.g:1102:2: iv_ruleElement= ruleElement EOF
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
    // InternalModelica.g:1108:1: ruleElement returns [EObject current=null] : (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) ) ) ;
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
            // InternalModelica.g:1114:2: ( (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) ) ) )
            // InternalModelica.g:1115:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) ) )
            {
            // InternalModelica.g:1115:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt32=1;
                }
                break;
            case 49:
                {
                alt32=2;
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
            case 43:
            case 44:
            case 45:
            case 46:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 101:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalModelica.g:1116:3: this_ImportClause_0= ruleImportClause
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
                    // InternalModelica.g:1125:3: this_ExtendsClause_1= ruleExtendsClause
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
                    // InternalModelica.g:1134:3: ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) )
                    {
                    // InternalModelica.g:1134:3: ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) )
                    // InternalModelica.g:1135:4: (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) )
                    {
                    // InternalModelica.g:1135:4: (otherlv_2= 'redeclare' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==43) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalModelica.g:1136:5: otherlv_2= 'redeclare'
                            {
                            otherlv_2=(Token)match(input,43,FOLLOW_31); 

                            					newLeafNode(otherlv_2, grammarAccess.getElementAccess().getRedeclareKeyword_2_0());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:1141:4: (otherlv_3= 'final' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==20) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalModelica.g:1142:5: otherlv_3= 'final'
                            {
                            otherlv_3=(Token)match(input,20,FOLLOW_31); 

                            					newLeafNode(otherlv_3, grammarAccess.getElementAccess().getFinalKeyword_2_1());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:1147:4: (otherlv_4= 'inner' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==44) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalModelica.g:1148:5: otherlv_4= 'inner'
                            {
                            otherlv_4=(Token)match(input,44,FOLLOW_32); 

                            					newLeafNode(otherlv_4, grammarAccess.getElementAccess().getInnerKeyword_2_2());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:1153:4: (otherlv_5= 'outer' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==45) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalModelica.g:1154:5: otherlv_5= 'outer'
                            {
                            otherlv_5=(Token)match(input,45,FOLLOW_33); 

                            					newLeafNode(otherlv_5, grammarAccess.getElementAccess().getOuterKeyword_2_3());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:1159:4: ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==EOF||LA31_0==RULE_IDENT||(LA31_0>=21 && LA31_0<=34)||(LA31_0>=51 && LA31_0<=57)||LA31_0==101) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==46) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalModelica.g:1160:5: (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause )
                            {
                            // InternalModelica.g:1160:5: (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause )
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( ((LA29_0>=21 && LA29_0<=34)) ) {
                                alt29=1;
                            }
                            else if ( (LA29_0==EOF||LA29_0==RULE_IDENT||(LA29_0>=51 && LA29_0<=57)||LA29_0==101) ) {
                                alt29=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 29, 0, input);

                                throw nvae;
                            }
                            switch (alt29) {
                                case 1 :
                                    // InternalModelica.g:1161:6: this_ClassDefinition_6= ruleClassDefinition
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
                                    // InternalModelica.g:1170:6: this_ComponentClause_7= ruleComponentClause
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
                            // InternalModelica.g:1180:5: (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) )
                            {
                            // InternalModelica.g:1180:5: (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) )
                            // InternalModelica.g:1181:6: otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause )
                            {
                            otherlv_8=(Token)match(input,46,FOLLOW_34); 

                            						newLeafNode(otherlv_8, grammarAccess.getElementAccess().getReplaceableKeyword_2_4_1_0());
                            					
                            // InternalModelica.g:1185:6: (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause )
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( ((LA30_0>=21 && LA30_0<=34)) ) {
                                alt30=1;
                            }
                            else if ( (LA30_0==EOF||LA30_0==RULE_IDENT||(LA30_0>=51 && LA30_0<=57)||LA30_0==101) ) {
                                alt30=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 30, 0, input);

                                throw nvae;
                            }
                            switch (alt30) {
                                case 1 :
                                    // InternalModelica.g:1186:7: this_ClassDefinition_9= ruleClassDefinition
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
                                    // InternalModelica.g:1195:7: this_ComponentClause_10= ruleComponentClause
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
    // InternalModelica.g:1211:1: entryRuleImportClause returns [EObject current=null] : iv_ruleImportClause= ruleImportClause EOF ;
    public final EObject entryRuleImportClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportClause = null;


        try {
            // InternalModelica.g:1211:53: (iv_ruleImportClause= ruleImportClause EOF )
            // InternalModelica.g:1212:2: iv_ruleImportClause= ruleImportClause EOF
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
    // InternalModelica.g:1218:1: ruleImportClause returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? ) ) ( (lv_comment_10_0= ruleComment ) ) ) ;
    public final EObject ruleImportClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_list_8_0 = null;

        EObject lv_comment_10_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1224:2: ( (otherlv_0= 'import' ( ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? ) ) ( (lv_comment_10_0= ruleComment ) ) ) )
            // InternalModelica.g:1225:2: (otherlv_0= 'import' ( ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? ) ) ( (lv_comment_10_0= ruleComment ) ) )
            {
            // InternalModelica.g:1225:2: (otherlv_0= 'import' ( ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? ) ) ( (lv_comment_10_0= ruleComment ) ) )
            // InternalModelica.g:1226:3: otherlv_0= 'import' ( ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? ) ) ( (lv_comment_10_0= ruleComment ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportClauseAccess().getImportKeyword_0());
            		
            // InternalModelica.g:1230:3: ( ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_IDENT) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==EOF||LA36_1==RULE_STRING||LA36_1==19||LA36_1==37||LA36_1==41||LA36_1==48||(LA36_1>=101 && LA36_1<=102)) ) {
                    alt36=2;
                }
                else if ( (LA36_1==36) ) {
                    alt36=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA36_0==101) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalModelica.g:1231:4: ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) )
                    {
                    // InternalModelica.g:1231:4: ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) )
                    // InternalModelica.g:1232:5: ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) )
                    {
                    // InternalModelica.g:1232:5: ( (lv_id_1_0= RULE_IDENT ) )
                    // InternalModelica.g:1233:6: (lv_id_1_0= RULE_IDENT )
                    {
                    // InternalModelica.g:1233:6: (lv_id_1_0= RULE_IDENT )
                    // InternalModelica.g:1234:7: lv_id_1_0= RULE_IDENT
                    {
                    lv_id_1_0=(Token)match(input,RULE_IDENT,FOLLOW_15); 

                    							newLeafNode(lv_id_1_0, grammarAccess.getImportClauseAccess().getIdIDENTTerminalRuleCall_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getImportClauseRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"id",
                    								lv_id_1_0,
                    								"xmodelica.Modelica.IDENT");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,36,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getImportClauseAccess().getEqualsSignKeyword_1_0_1());
                    				
                    // InternalModelica.g:1254:5: ( (lv_name_3_0= ruleName ) )
                    // InternalModelica.g:1255:6: (lv_name_3_0= ruleName )
                    {
                    // InternalModelica.g:1255:6: (lv_name_3_0= ruleName )
                    // InternalModelica.g:1256:7: lv_name_3_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getImportClauseAccess().getNameNameParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_name_3_0=ruleName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getImportClauseRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"xmodelica.Modelica.Name");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:1275:4: ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? )
                    {
                    // InternalModelica.g:1275:4: ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? )
                    // InternalModelica.g:1276:5: ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )?
                    {

                    					newCompositeNode(grammarAccess.getImportClauseAccess().getNameParserRuleCall_1_1_0());
                    				
                    pushFollow(FOLLOW_35);
                    ruleName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalModelica.g:1283:5: ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==37||LA35_0==41||LA35_0==48) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalModelica.g:1284:6: (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) )
                            {
                            // InternalModelica.g:1284:6: (otherlv_5= ',' )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==37) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // InternalModelica.g:1285:7: otherlv_5= ','
                                    {
                                    otherlv_5=(Token)match(input,37,FOLLOW_36); 

                                    							newLeafNode(otherlv_5, grammarAccess.getImportClauseAccess().getCommaKeyword_1_1_1_0());
                                    						

                                    }
                                    break;

                            }

                            // InternalModelica.g:1290:6: (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) )
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==48) ) {
                                alt34=1;
                            }
                            else if ( (LA34_0==41) ) {
                                alt34=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 34, 0, input);

                                throw nvae;
                            }
                            switch (alt34) {
                                case 1 :
                                    // InternalModelica.g:1291:7: otherlv_6= '*'
                                    {
                                    otherlv_6=(Token)match(input,48,FOLLOW_20); 

                                    							newLeafNode(otherlv_6, grammarAccess.getImportClauseAccess().getAsteriskKeyword_1_1_1_1_0());
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalModelica.g:1296:7: (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' )
                                    {
                                    // InternalModelica.g:1296:7: (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' )
                                    // InternalModelica.g:1297:8: otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')'
                                    {
                                    otherlv_7=(Token)match(input,41,FOLLOW_7); 

                                    								newLeafNode(otherlv_7, grammarAccess.getImportClauseAccess().getLeftParenthesisKeyword_1_1_1_1_1_0());
                                    							
                                    // InternalModelica.g:1301:8: ( (lv_list_8_0= ruleImportList ) )
                                    // InternalModelica.g:1302:9: (lv_list_8_0= ruleImportList )
                                    {
                                    // InternalModelica.g:1302:9: (lv_list_8_0= ruleImportList )
                                    // InternalModelica.g:1303:10: lv_list_8_0= ruleImportList
                                    {

                                    										newCompositeNode(grammarAccess.getImportClauseAccess().getListImportListParserRuleCall_1_1_1_1_1_1_0());
                                    									
                                    pushFollow(FOLLOW_29);
                                    lv_list_8_0=ruleImportList();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getImportClauseRule());
                                    										}
                                    										set(
                                    											current,
                                    											"list",
                                    											lv_list_8_0,
                                    											"xmodelica.Modelica.ImportList");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }

                                    otherlv_9=(Token)match(input,42,FOLLOW_20); 

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

            // InternalModelica.g:1329:3: ( (lv_comment_10_0= ruleComment ) )
            // InternalModelica.g:1330:4: (lv_comment_10_0= ruleComment )
            {
            // InternalModelica.g:1330:4: (lv_comment_10_0= ruleComment )
            // InternalModelica.g:1331:5: lv_comment_10_0= ruleComment
            {

            					newCompositeNode(grammarAccess.getImportClauseAccess().getCommentCommentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_comment_10_0=ruleComment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportClauseRule());
            					}
            					set(
            						current,
            						"comment",
            						lv_comment_10_0,
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
    // $ANTLR end "ruleImportClause"


    // $ANTLR start "entryRuleImportList"
    // InternalModelica.g:1352:1: entryRuleImportList returns [EObject current=null] : iv_ruleImportList= ruleImportList EOF ;
    public final EObject entryRuleImportList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportList = null;


        try {
            // InternalModelica.g:1352:51: (iv_ruleImportList= ruleImportList EOF )
            // InternalModelica.g:1353:2: iv_ruleImportList= ruleImportList EOF
            {
             newCompositeNode(grammarAccess.getImportListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportList=ruleImportList();

            state._fsp--;

             current =iv_ruleImportList; 
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
    // InternalModelica.g:1359:1: ruleImportList returns [EObject current=null] : ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) ) )? ) ;
    public final EObject ruleImportList() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1365:2: ( ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) ) )? ) )
            // InternalModelica.g:1366:2: ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) ) )? )
            {
            // InternalModelica.g:1366:2: ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) ) )? )
            // InternalModelica.g:1367:3: ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) ) )?
            {
            // InternalModelica.g:1367:3: ( (lv_id_0_0= RULE_IDENT ) )
            // InternalModelica.g:1368:4: (lv_id_0_0= RULE_IDENT )
            {
            // InternalModelica.g:1368:4: (lv_id_0_0= RULE_IDENT )
            // InternalModelica.g:1369:5: lv_id_0_0= RULE_IDENT
            {
            lv_id_0_0=(Token)match(input,RULE_IDENT,FOLLOW_19); 

            					newLeafNode(lv_id_0_0, grammarAccess.getImportListAccess().getIdIDENTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"xmodelica.Modelica.IDENT");
            				

            }


            }

            // InternalModelica.g:1385:3: (otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalModelica.g:1386:4: otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getImportListAccess().getCommaKeyword_1_0());
                    			
                    // InternalModelica.g:1390:4: ( (lv_list_2_0= ruleImportList ) )
                    // InternalModelica.g:1391:5: (lv_list_2_0= ruleImportList )
                    {
                    // InternalModelica.g:1391:5: (lv_list_2_0= ruleImportList )
                    // InternalModelica.g:1392:6: lv_list_2_0= ruleImportList
                    {

                    						newCompositeNode(grammarAccess.getImportListAccess().getListImportListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_list_2_0=ruleImportList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportListRule());
                    						}
                    						set(
                    							current,
                    							"list",
                    							lv_list_2_0,
                    							"xmodelica.Modelica.ImportList");
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
    // $ANTLR end "ruleImportList"


    // $ANTLR start "entryRuleExtendsClause"
    // InternalModelica.g:1414:1: entryRuleExtendsClause returns [EObject current=null] : iv_ruleExtendsClause= ruleExtendsClause EOF ;
    public final EObject entryRuleExtendsClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendsClause = null;


        try {
            // InternalModelica.g:1414:54: (iv_ruleExtendsClause= ruleExtendsClause EOF )
            // InternalModelica.g:1415:2: iv_ruleExtendsClause= ruleExtendsClause EOF
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
    // InternalModelica.g:1421:1: ruleExtendsClause returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )? ) ;
    public final EObject ruleExtendsClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_mod_2_0 = null;

        EObject lv_anno_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1427:2: ( (otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )? ) )
            // InternalModelica.g:1428:2: (otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )? )
            {
            // InternalModelica.g:1428:2: (otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )? )
            // InternalModelica.g:1429:3: otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendsClauseAccess().getExtendsKeyword_0());
            		
            // InternalModelica.g:1433:3: ( (lv_name_1_0= ruleName ) )
            // InternalModelica.g:1434:4: (lv_name_1_0= ruleName )
            {
            // InternalModelica.g:1434:4: (lv_name_1_0= ruleName )
            // InternalModelica.g:1435:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getExtendsClauseAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalModelica.g:1452:3: ( (lv_mod_2_0= ruleClassModification ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalModelica.g:1453:4: (lv_mod_2_0= ruleClassModification )
                    {
                    // InternalModelica.g:1453:4: (lv_mod_2_0= ruleClassModification )
                    // InternalModelica.g:1454:5: lv_mod_2_0= ruleClassModification
                    {

                    					newCompositeNode(grammarAccess.getExtendsClauseAccess().getModClassModificationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_26);
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

            // InternalModelica.g:1471:3: ( (lv_anno_3_0= ruleAnnotation ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==102) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalModelica.g:1472:4: (lv_anno_3_0= ruleAnnotation )
                    {
                    // InternalModelica.g:1472:4: (lv_anno_3_0= ruleAnnotation )
                    // InternalModelica.g:1473:5: lv_anno_3_0= ruleAnnotation
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
    // InternalModelica.g:1494:1: entryRuleConstrainingClause returns [EObject current=null] : iv_ruleConstrainingClause= ruleConstrainingClause EOF ;
    public final EObject entryRuleConstrainingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrainingClause = null;


        try {
            // InternalModelica.g:1494:59: (iv_ruleConstrainingClause= ruleConstrainingClause EOF )
            // InternalModelica.g:1495:2: iv_ruleConstrainingClause= ruleConstrainingClause EOF
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
    // InternalModelica.g:1501:1: ruleConstrainingClause returns [EObject current=null] : (otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ) ;
    public final EObject ruleConstrainingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_mod_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1507:2: ( (otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ) )
            // InternalModelica.g:1508:2: (otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? )
            {
            // InternalModelica.g:1508:2: (otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? )
            // InternalModelica.g:1509:3: otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstrainingClauseAccess().getConstrainedbyKeyword_0());
            		
            // InternalModelica.g:1513:3: ( (lv_name_1_0= ruleName ) )
            // InternalModelica.g:1514:4: (lv_name_1_0= ruleName )
            {
            // InternalModelica.g:1514:4: (lv_name_1_0= ruleName )
            // InternalModelica.g:1515:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getConstrainingClauseAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalModelica.g:1532:3: ( (lv_mod_2_0= ruleClassModification ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalModelica.g:1533:4: (lv_mod_2_0= ruleClassModification )
                    {
                    // InternalModelica.g:1533:4: (lv_mod_2_0= ruleClassModification )
                    // InternalModelica.g:1534:5: lv_mod_2_0= ruleClassModification
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
    // InternalModelica.g:1555:1: entryRuleComponentClause returns [EObject current=null] : iv_ruleComponentClause= ruleComponentClause EOF ;
    public final EObject entryRuleComponentClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClause = null;


        try {
            // InternalModelica.g:1555:56: (iv_ruleComponentClause= ruleComponentClause EOF )
            // InternalModelica.g:1556:2: iv_ruleComponentClause= ruleComponentClause EOF
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
    // InternalModelica.g:1562:1: ruleComponentClause returns [EObject current=null] : ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_subs_2_0= ruleArraySubscripts ) )? ( (lv_comps_3_0= ruleComponentList ) ) ) ;
    public final EObject ruleComponentClause() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_prefix_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_subs_2_0 = null;

        EObject lv_comps_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1568:2: ( ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_subs_2_0= ruleArraySubscripts ) )? ( (lv_comps_3_0= ruleComponentList ) ) ) )
            // InternalModelica.g:1569:2: ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_subs_2_0= ruleArraySubscripts ) )? ( (lv_comps_3_0= ruleComponentList ) ) )
            {
            // InternalModelica.g:1569:2: ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_subs_2_0= ruleArraySubscripts ) )? ( (lv_comps_3_0= ruleComponentList ) ) )
            // InternalModelica.g:1570:3: ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_subs_2_0= ruleArraySubscripts ) )? ( (lv_comps_3_0= ruleComponentList ) )
            {
            // InternalModelica.g:1570:3: ( (lv_prefix_0_0= ruleTypePrefix ) )
            // InternalModelica.g:1571:4: (lv_prefix_0_0= ruleTypePrefix )
            {
            // InternalModelica.g:1571:4: (lv_prefix_0_0= ruleTypePrefix )
            // InternalModelica.g:1572:5: lv_prefix_0_0= ruleTypePrefix
            {

            					newCompositeNode(grammarAccess.getComponentClauseAccess().getPrefixTypePrefixParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_prefix_0_0=ruleTypePrefix();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentClauseRule());
            					}
            					set(
            						current,
            						"prefix",
            						lv_prefix_0_0,
            						"xmodelica.Modelica.TypePrefix");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:1589:3: ( (lv_type_1_0= ruleTypeSpecifier ) )
            // InternalModelica.g:1590:4: (lv_type_1_0= ruleTypeSpecifier )
            {
            // InternalModelica.g:1590:4: (lv_type_1_0= ruleTypeSpecifier )
            // InternalModelica.g:1591:5: lv_type_1_0= ruleTypeSpecifier
            {

            					newCompositeNode(grammarAccess.getComponentClauseAccess().getTypeTypeSpecifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_type_1_0=ruleTypeSpecifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentClauseRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"xmodelica.Modelica.TypeSpecifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:1608:3: ( (lv_subs_2_0= ruleArraySubscripts ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==96) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalModelica.g:1609:4: (lv_subs_2_0= ruleArraySubscripts )
                    {
                    // InternalModelica.g:1609:4: (lv_subs_2_0= ruleArraySubscripts )
                    // InternalModelica.g:1610:5: lv_subs_2_0= ruleArraySubscripts
                    {

                    					newCompositeNode(grammarAccess.getComponentClauseAccess().getSubsArraySubscriptsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_subs_2_0=ruleArraySubscripts();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentClauseRule());
                    					}
                    					set(
                    						current,
                    						"subs",
                    						lv_subs_2_0,
                    						"xmodelica.Modelica.ArraySubscripts");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalModelica.g:1627:3: ( (lv_comps_3_0= ruleComponentList ) )
            // InternalModelica.g:1628:4: (lv_comps_3_0= ruleComponentList )
            {
            // InternalModelica.g:1628:4: (lv_comps_3_0= ruleComponentList )
            // InternalModelica.g:1629:5: lv_comps_3_0= ruleComponentList
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
    // InternalModelica.g:1650:1: entryRuleTypePrefix returns [String current=null] : iv_ruleTypePrefix= ruleTypePrefix EOF ;
    public final String entryRuleTypePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypePrefix = null;


        try {
            // InternalModelica.g:1650:50: (iv_ruleTypePrefix= ruleTypePrefix EOF )
            // InternalModelica.g:1651:2: iv_ruleTypePrefix= ruleTypePrefix EOF
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
    // InternalModelica.g:1657:1: ruleTypePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )? ) ;
    public final AntlrDatatypeRuleToken ruleTypePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:1663:2: ( ( (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )? ) )
            // InternalModelica.g:1664:2: ( (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )? )
            {
            // InternalModelica.g:1664:2: ( (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )? )
            // InternalModelica.g:1665:3: (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )?
            {
            // InternalModelica.g:1665:3: (kw= 'flow' | kw= 'stream' )?
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==51) ) {
                alt42=1;
            }
            else if ( (LA42_0==52) ) {
                alt42=2;
            }
            switch (alt42) {
                case 1 :
                    // InternalModelica.g:1666:4: kw= 'flow'
                    {
                    kw=(Token)match(input,51,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getFlowKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:1672:4: kw= 'stream'
                    {
                    kw=(Token)match(input,52,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getStreamKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalModelica.g:1678:3: (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )?
            int alt43=4;
            switch ( input.LA(1) ) {
                case 53:
                    {
                    alt43=1;
                    }
                    break;
                case 54:
                    {
                    alt43=2;
                    }
                    break;
                case 55:
                    {
                    alt43=3;
                    }
                    break;
            }

            switch (alt43) {
                case 1 :
                    // InternalModelica.g:1679:4: kw= 'discrete'
                    {
                    kw=(Token)match(input,53,FOLLOW_40); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getDiscreteKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:1685:4: kw= 'parameter'
                    {
                    kw=(Token)match(input,54,FOLLOW_40); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getParameterKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalModelica.g:1691:4: kw= 'constant'
                    {
                    kw=(Token)match(input,55,FOLLOW_40); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getConstantKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalModelica.g:1697:3: (kw= 'input' | kw= 'output' )?
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==56) ) {
                alt44=1;
            }
            else if ( (LA44_0==57) ) {
                alt44=2;
            }
            switch (alt44) {
                case 1 :
                    // InternalModelica.g:1698:4: kw= 'input'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getInputKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:1704:4: kw= 'output'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

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
    // InternalModelica.g:1714:1: entryRuleTypeSpecifier returns [EObject current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final EObject entryRuleTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecifier = null;


        try {
            // InternalModelica.g:1714:54: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // InternalModelica.g:1715:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getTypeSpecifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeSpecifier=ruleTypeSpecifier();

            state._fsp--;

             current =iv_ruleTypeSpecifier; 
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
    // InternalModelica.g:1721:1: ruleTypeSpecifier returns [EObject current=null] : ( ( ruleName ) ) ;
    public final EObject ruleTypeSpecifier() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalModelica.g:1727:2: ( ( ( ruleName ) ) )
            // InternalModelica.g:1728:2: ( ( ruleName ) )
            {
            // InternalModelica.g:1728:2: ( ( ruleName ) )
            // InternalModelica.g:1729:3: ( ruleName )
            {
            // InternalModelica.g:1729:3: ( ruleName )
            // InternalModelica.g:1730:4: ruleName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeSpecifierRule());
            				}
            			

            				newCompositeNode(grammarAccess.getTypeSpecifierAccess().getNameClassDefinitionCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;


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
    // $ANTLR end "ruleTypeSpecifier"


    // $ANTLR start "entryRuleComponentList"
    // InternalModelica.g:1747:1: entryRuleComponentList returns [EObject current=null] : iv_ruleComponentList= ruleComponentList EOF ;
    public final EObject entryRuleComponentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentList = null;


        try {
            // InternalModelica.g:1747:54: (iv_ruleComponentList= ruleComponentList EOF )
            // InternalModelica.g:1748:2: iv_ruleComponentList= ruleComponentList EOF
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
    // InternalModelica.g:1754:1: ruleComponentList returns [EObject current=null] : ( ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )* ) ;
    public final EObject ruleComponentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_comps_0_0 = null;

        EObject lv_comps_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1760:2: ( ( ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )* ) )
            // InternalModelica.g:1761:2: ( ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )* )
            {
            // InternalModelica.g:1761:2: ( ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )* )
            // InternalModelica.g:1762:3: ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )*
            {
            // InternalModelica.g:1762:3: ( (lv_comps_0_0= ruleComponentDeclaration ) )
            // InternalModelica.g:1763:4: (lv_comps_0_0= ruleComponentDeclaration )
            {
            // InternalModelica.g:1763:4: (lv_comps_0_0= ruleComponentDeclaration )
            // InternalModelica.g:1764:5: lv_comps_0_0= ruleComponentDeclaration
            {

            					newCompositeNode(grammarAccess.getComponentListAccess().getCompsComponentDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalModelica.g:1781:3: (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==37) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalModelica.g:1782:4: otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_38); 

            	    				newLeafNode(otherlv_1, grammarAccess.getComponentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:1786:4: ( (lv_comps_2_0= ruleComponentDeclaration ) )
            	    // InternalModelica.g:1787:5: (lv_comps_2_0= ruleComponentDeclaration )
            	    {
            	    // InternalModelica.g:1787:5: (lv_comps_2_0= ruleComponentDeclaration )
            	    // InternalModelica.g:1788:6: lv_comps_2_0= ruleComponentDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getComponentListAccess().getCompsComponentDeclarationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    break loop45;
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
    // InternalModelica.g:1810:1: entryRuleComponentDeclaration returns [EObject current=null] : iv_ruleComponentDeclaration= ruleComponentDeclaration EOF ;
    public final EObject entryRuleComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDeclaration = null;


        try {
            // InternalModelica.g:1810:61: (iv_ruleComponentDeclaration= ruleComponentDeclaration EOF )
            // InternalModelica.g:1811:2: iv_ruleComponentDeclaration= ruleComponentDeclaration EOF
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
    // InternalModelica.g:1817:1: ruleComponentDeclaration returns [EObject current=null] : ( ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) ) ) ;
    public final EObject ruleComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_decl_0_0 = null;

        EObject lv_cond_1_0 = null;

        EObject lv_comment_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1823:2: ( ( ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) ) ) )
            // InternalModelica.g:1824:2: ( ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) ) )
            {
            // InternalModelica.g:1824:2: ( ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) ) )
            // InternalModelica.g:1825:3: ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) )
            {
            // InternalModelica.g:1825:3: ( (lv_decl_0_0= ruleDeclaration ) )
            // InternalModelica.g:1826:4: (lv_decl_0_0= ruleDeclaration )
            {
            // InternalModelica.g:1826:4: (lv_decl_0_0= ruleDeclaration )
            // InternalModelica.g:1827:5: lv_decl_0_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getComponentDeclarationAccess().getDeclDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalModelica.g:1844:3: ( (lv_cond_1_0= ruleConditionAttribute ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalModelica.g:1845:4: (lv_cond_1_0= ruleConditionAttribute )
                    {
                    // InternalModelica.g:1845:4: (lv_cond_1_0= ruleConditionAttribute )
                    // InternalModelica.g:1846:5: lv_cond_1_0= ruleConditionAttribute
                    {

                    					newCompositeNode(grammarAccess.getComponentDeclarationAccess().getCondConditionAttributeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_20);
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

            // InternalModelica.g:1863:3: ( (lv_comment_2_0= ruleComment ) )
            // InternalModelica.g:1864:4: (lv_comment_2_0= ruleComment )
            {
            // InternalModelica.g:1864:4: (lv_comment_2_0= ruleComment )
            // InternalModelica.g:1865:5: lv_comment_2_0= ruleComment
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
    // InternalModelica.g:1886:1: entryRuleConditionAttribute returns [EObject current=null] : iv_ruleConditionAttribute= ruleConditionAttribute EOF ;
    public final EObject entryRuleConditionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionAttribute = null;


        try {
            // InternalModelica.g:1886:59: (iv_ruleConditionAttribute= ruleConditionAttribute EOF )
            // InternalModelica.g:1887:2: iv_ruleConditionAttribute= ruleConditionAttribute EOF
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
    // InternalModelica.g:1893:1: ruleConditionAttribute returns [EObject current=null] : (otherlv_0= 'if' this_Expression_1= ruleExpression ) ;
    public final EObject ruleConditionAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalModelica.g:1899:2: ( (otherlv_0= 'if' this_Expression_1= ruleExpression ) )
            // InternalModelica.g:1900:2: (otherlv_0= 'if' this_Expression_1= ruleExpression )
            {
            // InternalModelica.g:1900:2: (otherlv_0= 'if' this_Expression_1= ruleExpression )
            // InternalModelica.g:1901:3: otherlv_0= 'if' this_Expression_1= ruleExpression
            {
            otherlv_0=(Token)match(input,58,FOLLOW_42); 

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
    // InternalModelica.g:1917:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalModelica.g:1917:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalModelica.g:1918:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalModelica.g:1924:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )? ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_subscripts_1_0 = null;

        EObject lv_mod_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1930:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )? ) )
            // InternalModelica.g:1931:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )? )
            {
            // InternalModelica.g:1931:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )? )
            // InternalModelica.g:1932:3: ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )?
            {
            // InternalModelica.g:1932:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalModelica.g:1933:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalModelica.g:1933:4: (lv_name_0_0= RULE_IDENT )
            // InternalModelica.g:1934:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_43); 

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

            // InternalModelica.g:1950:3: ( (lv_subscripts_1_0= ruleArraySubscripts ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==96) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalModelica.g:1951:4: (lv_subscripts_1_0= ruleArraySubscripts )
                    {
                    // InternalModelica.g:1951:4: (lv_subscripts_1_0= ruleArraySubscripts )
                    // InternalModelica.g:1952:5: lv_subscripts_1_0= ruleArraySubscripts
                    {

                    					newCompositeNode(grammarAccess.getDeclarationAccess().getSubscriptsArraySubscriptsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_44);
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

            // InternalModelica.g:1969:3: ( (lv_mod_2_0= ruleModification ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==36||LA48_0==41||LA48_0==59) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalModelica.g:1970:4: (lv_mod_2_0= ruleModification )
                    {
                    // InternalModelica.g:1970:4: (lv_mod_2_0= ruleModification )
                    // InternalModelica.g:1971:5: lv_mod_2_0= ruleModification
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
    // InternalModelica.g:1992:1: entryRuleModification returns [EObject current=null] : iv_ruleModification= ruleModification EOF ;
    public final EObject entryRuleModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModification = null;


        try {
            // InternalModelica.g:1992:53: (iv_ruleModification= ruleModification EOF )
            // InternalModelica.g:1993:2: iv_ruleModification= ruleModification EOF
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
    // InternalModelica.g:1999:1: ruleModification returns [EObject current=null] : ( ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? ) | (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) ) | (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) ) ) ;
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
            // InternalModelica.g:2005:2: ( ( ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? ) | (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) ) | (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) ) ) )
            // InternalModelica.g:2006:2: ( ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? ) | (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) ) | (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) ) )
            {
            // InternalModelica.g:2006:2: ( ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? ) | (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) ) | (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt50=1;
                }
                break;
            case 36:
                {
                alt50=2;
                }
                break;
            case 59:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalModelica.g:2007:3: ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? )
                    {
                    // InternalModelica.g:2007:3: ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? )
                    // InternalModelica.g:2008:4: ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )?
                    {
                    // InternalModelica.g:2008:4: ( (lv_mod_0_0= ruleClassModification ) )
                    // InternalModelica.g:2009:5: (lv_mod_0_0= ruleClassModification )
                    {
                    // InternalModelica.g:2009:5: (lv_mod_0_0= ruleClassModification )
                    // InternalModelica.g:2010:6: lv_mod_0_0= ruleClassModification
                    {

                    						newCompositeNode(grammarAccess.getModificationAccess().getModClassModificationParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_45);
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

                    // InternalModelica.g:2027:4: (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==36) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalModelica.g:2028:5: otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
                            {
                            otherlv_1=(Token)match(input,36,FOLLOW_42); 

                            					newLeafNode(otherlv_1, grammarAccess.getModificationAccess().getEqualsSignKeyword_0_1_0());
                            				
                            // InternalModelica.g:2032:5: ( (lv_expr_2_0= ruleExpression ) )
                            // InternalModelica.g:2033:6: (lv_expr_2_0= ruleExpression )
                            {
                            // InternalModelica.g:2033:6: (lv_expr_2_0= ruleExpression )
                            // InternalModelica.g:2034:7: lv_expr_2_0= ruleExpression
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
                    // InternalModelica.g:2054:3: (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) )
                    {
                    // InternalModelica.g:2054:3: (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) )
                    // InternalModelica.g:2055:4: otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getModificationAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalModelica.g:2059:4: ( (lv_expr_4_0= ruleExpression ) )
                    // InternalModelica.g:2060:5: (lv_expr_4_0= ruleExpression )
                    {
                    // InternalModelica.g:2060:5: (lv_expr_4_0= ruleExpression )
                    // InternalModelica.g:2061:6: lv_expr_4_0= ruleExpression
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
                    // InternalModelica.g:2080:3: (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) )
                    {
                    // InternalModelica.g:2080:3: (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) )
                    // InternalModelica.g:2081:4: otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,59,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getModificationAccess().getColonEqualsSignKeyword_2_0());
                    			
                    // InternalModelica.g:2085:4: ( (lv_expr_6_0= ruleExpression ) )
                    // InternalModelica.g:2086:5: (lv_expr_6_0= ruleExpression )
                    {
                    // InternalModelica.g:2086:5: (lv_expr_6_0= ruleExpression )
                    // InternalModelica.g:2087:6: lv_expr_6_0= ruleExpression
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
    // InternalModelica.g:2109:1: entryRuleClassModification returns [EObject current=null] : iv_ruleClassModification= ruleClassModification EOF ;
    public final EObject entryRuleClassModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassModification = null;


        try {
            // InternalModelica.g:2109:58: (iv_ruleClassModification= ruleClassModification EOF )
            // InternalModelica.g:2110:2: iv_ruleClassModification= ruleClassModification EOF
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
    // InternalModelica.g:2116:1: ruleClassModification returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')' ) ;
    public final EObject ruleClassModification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2122:2: ( ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')' ) )
            // InternalModelica.g:2123:2: ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')' )
            {
            // InternalModelica.g:2123:2: ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')' )
            // InternalModelica.g:2124:3: () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')'
            {
            // InternalModelica.g:2124:3: ()
            // InternalModelica.g:2125:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassModificationAccess().getClassModificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getClassModificationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalModelica.g:2135:3: ( (lv_args_2_0= ruleArgumentList ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_IDENT||LA51_0==20||LA51_0==43||LA51_0==46||LA51_0==60||LA51_0==101) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalModelica.g:2136:4: (lv_args_2_0= ruleArgumentList )
                    {
                    // InternalModelica.g:2136:4: (lv_args_2_0= ruleArgumentList )
                    // InternalModelica.g:2137:5: lv_args_2_0= ruleArgumentList
                    {

                    					newCompositeNode(grammarAccess.getClassModificationAccess().getArgsArgumentListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
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

            otherlv_3=(Token)match(input,42,FOLLOW_2); 

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
    // InternalModelica.g:2162:1: entryRuleArgumentList returns [EObject current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final EObject entryRuleArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentList = null;


        try {
            // InternalModelica.g:2162:53: (iv_ruleArgumentList= ruleArgumentList EOF )
            // InternalModelica.g:2163:2: iv_ruleArgumentList= ruleArgumentList EOF
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
    // InternalModelica.g:2169:1: ruleArgumentList returns [EObject current=null] : ( ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )* ) ;
    public final EObject ruleArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2175:2: ( ( ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )* ) )
            // InternalModelica.g:2176:2: ( ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )* )
            {
            // InternalModelica.g:2176:2: ( ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )* )
            // InternalModelica.g:2177:3: ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )*
            {
            // InternalModelica.g:2177:3: ( (lv_args_0_0= ruleArgument ) )
            // InternalModelica.g:2178:4: (lv_args_0_0= ruleArgument )
            {
            // InternalModelica.g:2178:4: (lv_args_0_0= ruleArgument )
            // InternalModelica.g:2179:5: lv_args_0_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getArgumentListAccess().getArgsArgumentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalModelica.g:2196:3: (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==37) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalModelica.g:2197:4: otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_47); 

            	    				newLeafNode(otherlv_1, grammarAccess.getArgumentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:2201:4: ( (lv_args_2_0= ruleArgument ) )
            	    // InternalModelica.g:2202:5: (lv_args_2_0= ruleArgument )
            	    {
            	    // InternalModelica.g:2202:5: (lv_args_2_0= ruleArgument )
            	    // InternalModelica.g:2203:6: lv_args_2_0= ruleArgument
            	    {

            	    						newCompositeNode(grammarAccess.getArgumentListAccess().getArgsArgumentParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    break loop52;
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
    // InternalModelica.g:2225:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalModelica.g:2225:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalModelica.g:2226:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalModelica.g:2232:1: ruleArgument returns [EObject current=null] : (this_ElementModicationOrReplaceable_0= ruleElementModicationOrReplaceable | this_ElementRedeclaration_1= ruleElementRedeclaration ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_ElementModicationOrReplaceable_0 = null;

        EObject this_ElementRedeclaration_1 = null;



        	enterRule();

        try {
            // InternalModelica.g:2238:2: ( (this_ElementModicationOrReplaceable_0= ruleElementModicationOrReplaceable | this_ElementRedeclaration_1= ruleElementRedeclaration ) )
            // InternalModelica.g:2239:2: (this_ElementModicationOrReplaceable_0= ruleElementModicationOrReplaceable | this_ElementRedeclaration_1= ruleElementRedeclaration )
            {
            // InternalModelica.g:2239:2: (this_ElementModicationOrReplaceable_0= ruleElementModicationOrReplaceable | this_ElementRedeclaration_1= ruleElementRedeclaration )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_IDENT||LA53_0==20||LA53_0==46||LA53_0==60||LA53_0==101) ) {
                alt53=1;
            }
            else if ( (LA53_0==43) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalModelica.g:2240:3: this_ElementModicationOrReplaceable_0= ruleElementModicationOrReplaceable
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getElementModicationOrReplaceableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementModicationOrReplaceable_0=ruleElementModicationOrReplaceable();

                    state._fsp--;


                    			current = this_ElementModicationOrReplaceable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:2249:3: this_ElementRedeclaration_1= ruleElementRedeclaration
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getElementRedeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementRedeclaration_1=ruleElementRedeclaration();

                    state._fsp--;


                    			current = this_ElementRedeclaration_1;
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleElementModicationOrReplaceable"
    // InternalModelica.g:2261:1: entryRuleElementModicationOrReplaceable returns [EObject current=null] : iv_ruleElementModicationOrReplaceable= ruleElementModicationOrReplaceable EOF ;
    public final EObject entryRuleElementModicationOrReplaceable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementModicationOrReplaceable = null;


        try {
            // InternalModelica.g:2261:71: (iv_ruleElementModicationOrReplaceable= ruleElementModicationOrReplaceable EOF )
            // InternalModelica.g:2262:2: iv_ruleElementModicationOrReplaceable= ruleElementModicationOrReplaceable EOF
            {
             newCompositeNode(grammarAccess.getElementModicationOrReplaceableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementModicationOrReplaceable=ruleElementModicationOrReplaceable();

            state._fsp--;

             current =iv_ruleElementModicationOrReplaceable; 
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
    // $ANTLR end "entryRuleElementModicationOrReplaceable"


    // $ANTLR start "ruleElementModicationOrReplaceable"
    // InternalModelica.g:2268:1: ruleElementModicationOrReplaceable returns [EObject current=null] : ( (otherlv_0= 'each' )? (otherlv_1= 'final' )? (this_ElementModification_2= ruleElementModification | this_ElementReplaceable_3= ruleElementReplaceable ) ) ;
    public final EObject ruleElementModicationOrReplaceable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_ElementModification_2 = null;

        EObject this_ElementReplaceable_3 = null;



        	enterRule();

        try {
            // InternalModelica.g:2274:2: ( ( (otherlv_0= 'each' )? (otherlv_1= 'final' )? (this_ElementModification_2= ruleElementModification | this_ElementReplaceable_3= ruleElementReplaceable ) ) )
            // InternalModelica.g:2275:2: ( (otherlv_0= 'each' )? (otherlv_1= 'final' )? (this_ElementModification_2= ruleElementModification | this_ElementReplaceable_3= ruleElementReplaceable ) )
            {
            // InternalModelica.g:2275:2: ( (otherlv_0= 'each' )? (otherlv_1= 'final' )? (this_ElementModification_2= ruleElementModification | this_ElementReplaceable_3= ruleElementReplaceable ) )
            // InternalModelica.g:2276:3: (otherlv_0= 'each' )? (otherlv_1= 'final' )? (this_ElementModification_2= ruleElementModification | this_ElementReplaceable_3= ruleElementReplaceable )
            {
            // InternalModelica.g:2276:3: (otherlv_0= 'each' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==60) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalModelica.g:2277:4: otherlv_0= 'each'
                    {
                    otherlv_0=(Token)match(input,60,FOLLOW_48); 

                    				newLeafNode(otherlv_0, grammarAccess.getElementModicationOrReplaceableAccess().getEachKeyword_0());
                    			

                    }
                    break;

            }

            // InternalModelica.g:2282:3: (otherlv_1= 'final' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==20) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalModelica.g:2283:4: otherlv_1= 'final'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_48); 

                    				newLeafNode(otherlv_1, grammarAccess.getElementModicationOrReplaceableAccess().getFinalKeyword_1());
                    			

                    }
                    break;

            }

            // InternalModelica.g:2288:3: (this_ElementModification_2= ruleElementModification | this_ElementReplaceable_3= ruleElementReplaceable )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_IDENT||LA56_0==101) ) {
                alt56=1;
            }
            else if ( (LA56_0==46) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalModelica.g:2289:4: this_ElementModification_2= ruleElementModification
                    {

                    				newCompositeNode(grammarAccess.getElementModicationOrReplaceableAccess().getElementModificationParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_ElementModification_2=ruleElementModification();

                    state._fsp--;


                    				current = this_ElementModification_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:2298:4: this_ElementReplaceable_3= ruleElementReplaceable
                    {

                    				newCompositeNode(grammarAccess.getElementModicationOrReplaceableAccess().getElementReplaceableParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ElementReplaceable_3=ruleElementReplaceable();

                    state._fsp--;


                    				current = this_ElementReplaceable_3;
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
    // $ANTLR end "ruleElementModicationOrReplaceable"


    // $ANTLR start "entryRuleElementModification"
    // InternalModelica.g:2311:1: entryRuleElementModification returns [EObject current=null] : iv_ruleElementModification= ruleElementModification EOF ;
    public final EObject entryRuleElementModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementModification = null;


        try {
            // InternalModelica.g:2311:60: (iv_ruleElementModification= ruleElementModification EOF )
            // InternalModelica.g:2312:2: iv_ruleElementModification= ruleElementModification EOF
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
    // InternalModelica.g:2318:1: ruleElementModification returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) ) ) ;
    public final EObject ruleElementModification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_mod_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2324:2: ( ( ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) ) ) )
            // InternalModelica.g:2325:2: ( ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) ) )
            {
            // InternalModelica.g:2325:2: ( ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) ) )
            // InternalModelica.g:2326:3: ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) )
            {
            // InternalModelica.g:2326:3: ( (lv_name_0_0= ruleName ) )
            // InternalModelica.g:2327:4: (lv_name_0_0= ruleName )
            {
            // InternalModelica.g:2327:4: (lv_name_0_0= ruleName )
            // InternalModelica.g:2328:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getElementModificationAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_49);
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

            // InternalModelica.g:2345:3: ( (lv_mod_1_0= ruleModification ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==36||LA57_0==41||LA57_0==59) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalModelica.g:2346:4: (lv_mod_1_0= ruleModification )
                    {
                    // InternalModelica.g:2346:4: (lv_mod_1_0= ruleModification )
                    // InternalModelica.g:2347:5: lv_mod_1_0= ruleModification
                    {

                    					newCompositeNode(grammarAccess.getElementModificationAccess().getModModificationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_50);
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

            // InternalModelica.g:2364:3: ( (lv_comment_2_0= ruleStringComment ) )
            // InternalModelica.g:2365:4: (lv_comment_2_0= ruleStringComment )
            {
            // InternalModelica.g:2365:4: (lv_comment_2_0= ruleStringComment )
            // InternalModelica.g:2366:5: lv_comment_2_0= ruleStringComment
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


    // $ANTLR start "entryRuleElementRedeclaration"
    // InternalModelica.g:2387:1: entryRuleElementRedeclaration returns [EObject current=null] : iv_ruleElementRedeclaration= ruleElementRedeclaration EOF ;
    public final EObject entryRuleElementRedeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementRedeclaration = null;


        try {
            // InternalModelica.g:2387:61: (iv_ruleElementRedeclaration= ruleElementRedeclaration EOF )
            // InternalModelica.g:2388:2: iv_ruleElementRedeclaration= ruleElementRedeclaration EOF
            {
             newCompositeNode(grammarAccess.getElementRedeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementRedeclaration=ruleElementRedeclaration();

            state._fsp--;

             current =iv_ruleElementRedeclaration; 
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
    // $ANTLR end "entryRuleElementRedeclaration"


    // $ANTLR start "ruleElementRedeclaration"
    // InternalModelica.g:2394:1: ruleElementRedeclaration returns [EObject current=null] : (otherlv_0= 'redeclare' (otherlv_1= 'each' )? (otherlv_2= 'final' )? ( (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 ) | this_ElementReplaceable_5= ruleElementReplaceable ) ) ;
    public final EObject ruleElementRedeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_ShortClassDefinition_3 = null;

        EObject this_ComponentClause1_4 = null;

        EObject this_ElementReplaceable_5 = null;



        	enterRule();

        try {
            // InternalModelica.g:2400:2: ( (otherlv_0= 'redeclare' (otherlv_1= 'each' )? (otherlv_2= 'final' )? ( (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 ) | this_ElementReplaceable_5= ruleElementReplaceable ) ) )
            // InternalModelica.g:2401:2: (otherlv_0= 'redeclare' (otherlv_1= 'each' )? (otherlv_2= 'final' )? ( (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 ) | this_ElementReplaceable_5= ruleElementReplaceable ) )
            {
            // InternalModelica.g:2401:2: (otherlv_0= 'redeclare' (otherlv_1= 'each' )? (otherlv_2= 'final' )? ( (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 ) | this_ElementReplaceable_5= ruleElementReplaceable ) )
            // InternalModelica.g:2402:3: otherlv_0= 'redeclare' (otherlv_1= 'each' )? (otherlv_2= 'final' )? ( (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 ) | this_ElementReplaceable_5= ruleElementReplaceable )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getElementRedeclarationAccess().getRedeclareKeyword_0());
            		
            // InternalModelica.g:2406:3: (otherlv_1= 'each' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==60) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalModelica.g:2407:4: otherlv_1= 'each'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_51); 

                    				newLeafNode(otherlv_1, grammarAccess.getElementRedeclarationAccess().getEachKeyword_1());
                    			

                    }
                    break;

            }

            // InternalModelica.g:2412:3: (otherlv_2= 'final' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==20) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalModelica.g:2413:4: otherlv_2= 'final'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getElementRedeclarationAccess().getFinalKeyword_2());
                    			

                    }
                    break;

            }

            // InternalModelica.g:2418:3: ( (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 ) | this_ElementReplaceable_5= ruleElementReplaceable )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==EOF||LA61_0==RULE_IDENT||(LA61_0>=22 && LA61_0<=34)||(LA61_0>=51 && LA61_0<=57)||LA61_0==101) ) {
                alt61=1;
            }
            else if ( (LA61_0==46) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalModelica.g:2419:4: (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 )
                    {
                    // InternalModelica.g:2419:4: (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0>=22 && LA60_0<=34)) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==EOF||LA60_0==RULE_IDENT||(LA60_0>=51 && LA60_0<=57)||LA60_0==101) ) {
                        alt60=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalModelica.g:2420:5: this_ShortClassDefinition_3= ruleShortClassDefinition
                            {

                            					newCompositeNode(grammarAccess.getElementRedeclarationAccess().getShortClassDefinitionParserRuleCall_3_0_0());
                            				
                            pushFollow(FOLLOW_2);
                            this_ShortClassDefinition_3=ruleShortClassDefinition();

                            state._fsp--;


                            					current = this_ShortClassDefinition_3;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalModelica.g:2429:5: this_ComponentClause1_4= ruleComponentClause1
                            {

                            					newCompositeNode(grammarAccess.getElementRedeclarationAccess().getComponentClause1ParserRuleCall_3_0_1());
                            				
                            pushFollow(FOLLOW_2);
                            this_ComponentClause1_4=ruleComponentClause1();

                            state._fsp--;


                            					current = this_ComponentClause1_4;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:2439:4: this_ElementReplaceable_5= ruleElementReplaceable
                    {

                    				newCompositeNode(grammarAccess.getElementRedeclarationAccess().getElementReplaceableParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ElementReplaceable_5=ruleElementReplaceable();

                    state._fsp--;


                    				current = this_ElementReplaceable_5;
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
    // $ANTLR end "ruleElementRedeclaration"


    // $ANTLR start "entryRuleElementReplaceable"
    // InternalModelica.g:2452:1: entryRuleElementReplaceable returns [EObject current=null] : iv_ruleElementReplaceable= ruleElementReplaceable EOF ;
    public final EObject entryRuleElementReplaceable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReplaceable = null;


        try {
            // InternalModelica.g:2452:59: (iv_ruleElementReplaceable= ruleElementReplaceable EOF )
            // InternalModelica.g:2453:2: iv_ruleElementReplaceable= ruleElementReplaceable EOF
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
    // InternalModelica.g:2459:1: ruleElementReplaceable returns [EObject current=null] : (otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )? ) ;
    public final EObject ruleElementReplaceable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ShortClassDefinition_1 = null;

        EObject this_ComponentClause1_2 = null;

        EObject lv_const_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2465:2: ( (otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )? ) )
            // InternalModelica.g:2466:2: (otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )? )
            {
            // InternalModelica.g:2466:2: (otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )? )
            // InternalModelica.g:2467:3: otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getElementReplaceableAccess().getReplaceableKeyword_0());
            		
            // InternalModelica.g:2471:3: (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=22 && LA62_0<=34)) ) {
                alt62=1;
            }
            else if ( (LA62_0==EOF||LA62_0==RULE_IDENT||(LA62_0>=51 && LA62_0<=57)||LA62_0==101) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalModelica.g:2472:4: this_ShortClassDefinition_1= ruleShortClassDefinition
                    {

                    				newCompositeNode(grammarAccess.getElementReplaceableAccess().getShortClassDefinitionParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_52);
                    this_ShortClassDefinition_1=ruleShortClassDefinition();

                    state._fsp--;


                    				current = this_ShortClassDefinition_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:2481:4: this_ComponentClause1_2= ruleComponentClause1
                    {

                    				newCompositeNode(grammarAccess.getElementReplaceableAccess().getComponentClause1ParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_52);
                    this_ComponentClause1_2=ruleComponentClause1();

                    state._fsp--;


                    				current = this_ComponentClause1_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalModelica.g:2490:3: ( (lv_const_3_0= ruleConstrainingClause ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==50) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalModelica.g:2491:4: (lv_const_3_0= ruleConstrainingClause )
                    {
                    // InternalModelica.g:2491:4: (lv_const_3_0= ruleConstrainingClause )
                    // InternalModelica.g:2492:5: lv_const_3_0= ruleConstrainingClause
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
    // InternalModelica.g:2513:1: entryRuleComponentClause1 returns [EObject current=null] : iv_ruleComponentClause1= ruleComponentClause1 EOF ;
    public final EObject entryRuleComponentClause1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClause1 = null;


        try {
            // InternalModelica.g:2513:57: (iv_ruleComponentClause1= ruleComponentClause1 EOF )
            // InternalModelica.g:2514:2: iv_ruleComponentClause1= ruleComponentClause1 EOF
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
    // InternalModelica.g:2520:1: ruleComponentClause1 returns [EObject current=null] : ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_comp_2_0= ruleComponentDeclaration1 ) ) ) ;
    public final EObject ruleComponentClause1() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_prefix_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_comp_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2526:2: ( ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_comp_2_0= ruleComponentDeclaration1 ) ) ) )
            // InternalModelica.g:2527:2: ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_comp_2_0= ruleComponentDeclaration1 ) ) )
            {
            // InternalModelica.g:2527:2: ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_comp_2_0= ruleComponentDeclaration1 ) ) )
            // InternalModelica.g:2528:3: ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_comp_2_0= ruleComponentDeclaration1 ) )
            {
            // InternalModelica.g:2528:3: ( (lv_prefix_0_0= ruleTypePrefix ) )
            // InternalModelica.g:2529:4: (lv_prefix_0_0= ruleTypePrefix )
            {
            // InternalModelica.g:2529:4: (lv_prefix_0_0= ruleTypePrefix )
            // InternalModelica.g:2530:5: lv_prefix_0_0= ruleTypePrefix
            {

            					newCompositeNode(grammarAccess.getComponentClause1Access().getPrefixTypePrefixParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_prefix_0_0=ruleTypePrefix();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentClause1Rule());
            					}
            					set(
            						current,
            						"prefix",
            						lv_prefix_0_0,
            						"xmodelica.Modelica.TypePrefix");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:2547:3: ( (lv_type_1_0= ruleTypeSpecifier ) )
            // InternalModelica.g:2548:4: (lv_type_1_0= ruleTypeSpecifier )
            {
            // InternalModelica.g:2548:4: (lv_type_1_0= ruleTypeSpecifier )
            // InternalModelica.g:2549:5: lv_type_1_0= ruleTypeSpecifier
            {

            					newCompositeNode(grammarAccess.getComponentClause1Access().getTypeTypeSpecifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_type_1_0=ruleTypeSpecifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentClause1Rule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"xmodelica.Modelica.TypeSpecifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:2566:3: ( (lv_comp_2_0= ruleComponentDeclaration1 ) )
            // InternalModelica.g:2567:4: (lv_comp_2_0= ruleComponentDeclaration1 )
            {
            // InternalModelica.g:2567:4: (lv_comp_2_0= ruleComponentDeclaration1 )
            // InternalModelica.g:2568:5: lv_comp_2_0= ruleComponentDeclaration1
            {

            					newCompositeNode(grammarAccess.getComponentClause1Access().getCompComponentDeclaration1ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_comp_2_0=ruleComponentDeclaration1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentClause1Rule());
            					}
            					set(
            						current,
            						"comp",
            						lv_comp_2_0,
            						"xmodelica.Modelica.ComponentDeclaration1");
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
    // $ANTLR end "ruleComponentClause1"


    // $ANTLR start "entryRuleComponentDeclaration1"
    // InternalModelica.g:2589:1: entryRuleComponentDeclaration1 returns [EObject current=null] : iv_ruleComponentDeclaration1= ruleComponentDeclaration1 EOF ;
    public final EObject entryRuleComponentDeclaration1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDeclaration1 = null;


        try {
            // InternalModelica.g:2589:62: (iv_ruleComponentDeclaration1= ruleComponentDeclaration1 EOF )
            // InternalModelica.g:2590:2: iv_ruleComponentDeclaration1= ruleComponentDeclaration1 EOF
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
    // InternalModelica.g:2596:1: ruleComponentDeclaration1 returns [EObject current=null] : (this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) ) ) ;
    public final EObject ruleComponentDeclaration1() throws RecognitionException {
        EObject current = null;

        EObject this_Declaration_0 = null;

        EObject lv_comment_1_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2602:2: ( (this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) ) ) )
            // InternalModelica.g:2603:2: (this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) ) )
            {
            // InternalModelica.g:2603:2: (this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) ) )
            // InternalModelica.g:2604:3: this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) )
            {

            			newCompositeNode(grammarAccess.getComponentDeclaration1Access().getDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Declaration_0=ruleDeclaration();

            state._fsp--;


            			current = this_Declaration_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:2612:3: ( (lv_comment_1_0= ruleComment ) )
            // InternalModelica.g:2613:4: (lv_comment_1_0= ruleComment )
            {
            // InternalModelica.g:2613:4: (lv_comment_1_0= ruleComment )
            // InternalModelica.g:2614:5: lv_comment_1_0= ruleComment
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
    // InternalModelica.g:2635:1: entryRuleShortClassDefinition returns [EObject current=null] : iv_ruleShortClassDefinition= ruleShortClassDefinition EOF ;
    public final EObject entryRuleShortClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortClassDefinition = null;


        try {
            // InternalModelica.g:2635:61: (iv_ruleShortClassDefinition= ruleShortClassDefinition EOF )
            // InternalModelica.g:2636:2: iv_ruleShortClassDefinition= ruleShortClassDefinition EOF
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
    // InternalModelica.g:2642:1: ruleShortClassDefinition returns [EObject current=null] : ( ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) ) ) ;
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

        EObject lv_list_10_0 = null;

        EObject lv_comment_13_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2648:2: ( ( ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) ) ) )
            // InternalModelica.g:2649:2: ( ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) ) )
            {
            // InternalModelica.g:2649:2: ( ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) ) )
            // InternalModelica.g:2650:3: ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) )
            {

            			newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getClassPrefixesParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            ruleClassPrefixes();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_15); 

            			newLeafNode(this_IDENT_1, grammarAccess.getShortClassDefinitionAccess().getIDENTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getShortClassDefinitionAccess().getEqualsSignKeyword_2());
            		
            // InternalModelica.g:2665:3: ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==EOF||LA68_0==RULE_IDENT||(LA68_0>=51 && LA68_0<=57)||LA68_0==101) ) {
                alt68=1;
            }
            else if ( (LA68_0==61) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalModelica.g:2666:4: ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) )
                    {
                    // InternalModelica.g:2666:4: ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) )
                    // InternalModelica.g:2667:5: ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) )
                    {

                    					newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getBasePrefixParserRuleCall_3_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    ruleBasePrefix();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getNameParserRuleCall_3_0_1());
                    				
                    pushFollow(FOLLOW_54);
                    ruleName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalModelica.g:2681:5: (this_ArraySubscripts_5= ruleArraySubscripts )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==96) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalModelica.g:2682:6: this_ArraySubscripts_5= ruleArraySubscripts
                            {

                            						newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getArraySubscriptsParserRuleCall_3_0_2());
                            					
                            pushFollow(FOLLOW_55);
                            this_ArraySubscripts_5=ruleArraySubscripts();

                            state._fsp--;


                            						current = this_ArraySubscripts_5;
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }

                    // InternalModelica.g:2691:5: ( (lv_mode_6_0= ruleClassModification ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==41) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalModelica.g:2692:6: (lv_mode_6_0= ruleClassModification )
                            {
                            // InternalModelica.g:2692:6: (lv_mode_6_0= ruleClassModification )
                            // InternalModelica.g:2693:7: lv_mode_6_0= ruleClassModification
                            {

                            							newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getModeClassModificationParserRuleCall_3_0_3_0());
                            						
                            pushFollow(FOLLOW_20);
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

                    // InternalModelica.g:2710:5: ( (lv_comment_7_0= ruleComment ) )
                    // InternalModelica.g:2711:6: (lv_comment_7_0= ruleComment )
                    {
                    // InternalModelica.g:2711:6: (lv_comment_7_0= ruleComment )
                    // InternalModelica.g:2712:7: lv_comment_7_0= ruleComment
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
                    // InternalModelica.g:2731:4: (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) )
                    {
                    // InternalModelica.g:2731:4: (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) )
                    // InternalModelica.g:2732:5: otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) )
                    {
                    otherlv_8=(Token)match(input,61,FOLLOW_27); 

                    					newLeafNode(otherlv_8, grammarAccess.getShortClassDefinitionAccess().getEnumerationKeyword_3_1_0());
                    				
                    otherlv_9=(Token)match(input,41,FOLLOW_56); 

                    					newLeafNode(otherlv_9, grammarAccess.getShortClassDefinitionAccess().getLeftParenthesisKeyword_3_1_1());
                    				
                    // InternalModelica.g:2740:5: ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_IDENT||LA67_0==42) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==62) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalModelica.g:2741:6: ( (lv_list_10_0= ruleEnumList ) )?
                            {
                            // InternalModelica.g:2741:6: ( (lv_list_10_0= ruleEnumList ) )?
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==RULE_IDENT) ) {
                                alt66=1;
                            }
                            switch (alt66) {
                                case 1 :
                                    // InternalModelica.g:2742:7: (lv_list_10_0= ruleEnumList )
                                    {
                                    // InternalModelica.g:2742:7: (lv_list_10_0= ruleEnumList )
                                    // InternalModelica.g:2743:8: lv_list_10_0= ruleEnumList
                                    {

                                    								newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getListEnumListParserRuleCall_3_1_2_0_0());
                                    							
                                    pushFollow(FOLLOW_29);
                                    lv_list_10_0=ruleEnumList();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getShortClassDefinitionRule());
                                    								}
                                    								set(
                                    									current,
                                    									"list",
                                    									lv_list_10_0,
                                    									"xmodelica.Modelica.EnumList");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalModelica.g:2761:6: otherlv_11= ':'
                            {
                            otherlv_11=(Token)match(input,62,FOLLOW_29); 

                            						newLeafNode(otherlv_11, grammarAccess.getShortClassDefinitionAccess().getColonKeyword_3_1_2_1());
                            					

                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,42,FOLLOW_20); 

                    					newLeafNode(otherlv_12, grammarAccess.getShortClassDefinitionAccess().getRightParenthesisKeyword_3_1_3());
                    				
                    // InternalModelica.g:2770:5: ( (lv_comment_13_0= ruleComment ) )
                    // InternalModelica.g:2771:6: (lv_comment_13_0= ruleComment )
                    {
                    // InternalModelica.g:2771:6: (lv_comment_13_0= ruleComment )
                    // InternalModelica.g:2772:7: lv_comment_13_0= ruleComment
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
    // InternalModelica.g:2795:1: entryRuleEquationSection returns [EObject current=null] : iv_ruleEquationSection= ruleEquationSection EOF ;
    public final EObject entryRuleEquationSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquationSection = null;


        try {
            // InternalModelica.g:2795:56: (iv_ruleEquationSection= ruleEquationSection EOF )
            // InternalModelica.g:2796:2: iv_ruleEquationSection= ruleEquationSection EOF
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
    // InternalModelica.g:2802:1: ruleEquationSection returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'equation' ( ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';' )+ ) ;
    public final EObject ruleEquationSection() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_equations_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2808:2: ( ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'equation' ( ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';' )+ ) )
            // InternalModelica.g:2809:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'equation' ( ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';' )+ )
            {
            // InternalModelica.g:2809:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'equation' ( ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';' )+ )
            // InternalModelica.g:2810:3: ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'equation' ( ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';' )+
            {
            // InternalModelica.g:2810:3: ( (lv_initial_0_0= 'initial' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==63) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalModelica.g:2811:4: (lv_initial_0_0= 'initial' )
                    {
                    // InternalModelica.g:2811:4: (lv_initial_0_0= 'initial' )
                    // InternalModelica.g:2812:5: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,63,FOLLOW_57); 

                    					newLeafNode(lv_initial_0_0, grammarAccess.getEquationSectionAccess().getInitialInitialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEquationSectionRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,64,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getEquationSectionAccess().getEquationKeyword_1());
            		
            // InternalModelica.g:2828:3: ( ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';' )+
            int cnt70=0;
            loop70:
            do {
                int alt70=2;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA70_2 = input.LA(2);

                    if ( (LA70_2==36||LA70_2==48||LA70_2==62||(LA70_2>=78 && LA70_2<=79)||(LA70_2>=81 && LA70_2<=95)) ) {
                        alt70=1;
                    }


                    }
                    break;
                case 63:
                    {
                    int LA70_3 = input.LA(2);

                    if ( (LA70_3==41) ) {
                        alt70=1;
                    }


                    }
                    break;
                case RULE_IDENT:
                case RULE_STRING:
                case RULE_UNSIGNED_NUMBER:
                case RULE_TRUE_FALSE:
                case 58:
                case 71:
                case 75:
                case 77:
                case 80:
                case 87:
                case 88:
                case 89:
                case 90:
                case 96:
                case 98:
                case 100:
                case 101:
                    {
                    alt70=1;
                    }
                    break;

                }

                switch (alt70) {
            	case 1 :
            	    // InternalModelica.g:2829:4: ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';'
            	    {
            	    // InternalModelica.g:2829:4: ( (lv_equations_2_0= ruleEquation ) )
            	    // InternalModelica.g:2830:5: (lv_equations_2_0= ruleEquation )
            	    {
            	    // InternalModelica.g:2830:5: (lv_equations_2_0= ruleEquation )
            	    // InternalModelica.g:2831:6: lv_equations_2_0= ruleEquation
            	    {

            	    						newCompositeNode(grammarAccess.getEquationSectionAccess().getEquationsEquationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_equations_2_0=ruleEquation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquationSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"equations",
            	    							lv_equations_2_0,
            	    							"xmodelica.Modelica.Equation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,19,FOLLOW_59); 

            	    				newLeafNode(otherlv_3, grammarAccess.getEquationSectionAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt70 >= 1 ) break loop70;
                        EarlyExitException eee =
                            new EarlyExitException(70, input);
                        throw eee;
                }
                cnt70++;
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
    // InternalModelica.g:2857:1: entryRuleAlgorithmSection returns [EObject current=null] : iv_ruleAlgorithmSection= ruleAlgorithmSection EOF ;
    public final EObject entryRuleAlgorithmSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithmSection = null;


        try {
            // InternalModelica.g:2857:57: (iv_ruleAlgorithmSection= ruleAlgorithmSection EOF )
            // InternalModelica.g:2858:2: iv_ruleAlgorithmSection= ruleAlgorithmSection EOF
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
    // InternalModelica.g:2864:1: ruleAlgorithmSection returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'algorithm' ( ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';' )+ ) ;
    public final EObject ruleAlgorithmSection() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2870:2: ( ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'algorithm' ( ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';' )+ ) )
            // InternalModelica.g:2871:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'algorithm' ( ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';' )+ )
            {
            // InternalModelica.g:2871:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'algorithm' ( ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';' )+ )
            // InternalModelica.g:2872:3: ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'algorithm' ( ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';' )+
            {
            // InternalModelica.g:2872:3: ( (lv_initial_0_0= 'initial' ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==63) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalModelica.g:2873:4: (lv_initial_0_0= 'initial' )
                    {
                    // InternalModelica.g:2873:4: (lv_initial_0_0= 'initial' )
                    // InternalModelica.g:2874:5: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,63,FOLLOW_60); 

                    					newLeafNode(lv_initial_0_0, grammarAccess.getAlgorithmSectionAccess().getInitialInitialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlgorithmSectionRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,65,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgorithmSectionAccess().getAlgorithmKeyword_1());
            		
            // InternalModelica.g:2890:3: ( ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';' )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_IDENT||LA72_0==41||LA72_0==58||(LA72_0>=66 && LA72_0<=67)||LA72_0==71||(LA72_0>=74 && LA72_0<=75)||LA72_0==101) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalModelica.g:2891:4: ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';'
            	    {
            	    // InternalModelica.g:2891:4: ( (lv_statements_2_0= ruleStatement ) )
            	    // InternalModelica.g:2892:5: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalModelica.g:2892:5: (lv_statements_2_0= ruleStatement )
            	    // InternalModelica.g:2893:6: lv_statements_2_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getAlgorithmSectionAccess().getStatementsStatementParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAlgorithmSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_2_0,
            	    							"xmodelica.Modelica.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,19,FOLLOW_62); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAlgorithmSectionAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
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
    // InternalModelica.g:2919:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalModelica.g:2919:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalModelica.g:2920:2: iv_ruleEquation= ruleEquation EOF
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
    // InternalModelica.g:2926:1: ruleEquation returns [EObject current=null] : ( ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) | this_IfEquation_3= ruleIfEquation | this_ForEquation_4= ruleForEquation | this_ConnectClause_5= ruleConnectClause | this_WhenEquation_6= ruleWhenEquation ) ( (lv_commment_7_0= ruleComment ) ) ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject this_IfEquation_3 = null;

        EObject this_ForEquation_4 = null;

        EObject this_ConnectClause_5 = null;

        EObject this_WhenEquation_6 = null;

        EObject lv_commment_7_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2932:2: ( ( ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) | this_IfEquation_3= ruleIfEquation | this_ForEquation_4= ruleForEquation | this_ConnectClause_5= ruleConnectClause | this_WhenEquation_6= ruleWhenEquation ) ( (lv_commment_7_0= ruleComment ) ) ) )
            // InternalModelica.g:2933:2: ( ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) | this_IfEquation_3= ruleIfEquation | this_ForEquation_4= ruleForEquation | this_ConnectClause_5= ruleConnectClause | this_WhenEquation_6= ruleWhenEquation ) ( (lv_commment_7_0= ruleComment ) ) )
            {
            // InternalModelica.g:2933:2: ( ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) | this_IfEquation_3= ruleIfEquation | this_ForEquation_4= ruleForEquation | this_ConnectClause_5= ruleConnectClause | this_WhenEquation_6= ruleWhenEquation ) ( (lv_commment_7_0= ruleComment ) ) )
            // InternalModelica.g:2934:3: ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) | this_IfEquation_3= ruleIfEquation | this_ForEquation_4= ruleForEquation | this_ConnectClause_5= ruleConnectClause | this_WhenEquation_6= ruleWhenEquation ) ( (lv_commment_7_0= ruleComment ) )
            {
            // InternalModelica.g:2934:3: ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) | this_IfEquation_3= ruleIfEquation | this_ForEquation_4= ruleForEquation | this_ConnectClause_5= ruleConnectClause | this_WhenEquation_6= ruleWhenEquation )
            int alt73=5;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case RULE_STRING:
            case RULE_UNSIGNED_NUMBER:
            case RULE_TRUE_FALSE:
            case 35:
            case 63:
            case 80:
            case 87:
            case 88:
            case 89:
            case 90:
            case 96:
            case 98:
            case 100:
            case 101:
                {
                alt73=1;
                }
                break;
            case 58:
                {
                alt73=2;
                }
                break;
            case 71:
                {
                alt73=3;
                }
                break;
            case 77:
                {
                alt73=4;
                }
                break;
            case 75:
                {
                alt73=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalModelica.g:2935:4: ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) )
                    {
                    // InternalModelica.g:2935:4: ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) )
                    // InternalModelica.g:2936:5: ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) )
                    {
                    // InternalModelica.g:2936:5: ( (lv_left_0_0= ruleSimpleExpression ) )
                    // InternalModelica.g:2937:6: (lv_left_0_0= ruleSimpleExpression )
                    {
                    // InternalModelica.g:2937:6: (lv_left_0_0= ruleSimpleExpression )
                    // InternalModelica.g:2938:7: lv_left_0_0= ruleSimpleExpression
                    {

                    							newCompositeNode(grammarAccess.getEquationAccess().getLeftSimpleExpressionParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_15);
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

                    otherlv_1=(Token)match(input,36,FOLLOW_42); 

                    					newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getEqualsSignKeyword_0_0_1());
                    				
                    // InternalModelica.g:2959:5: ( (lv_right_2_0= ruleExpression ) )
                    // InternalModelica.g:2960:6: (lv_right_2_0= ruleExpression )
                    {
                    // InternalModelica.g:2960:6: (lv_right_2_0= ruleExpression )
                    // InternalModelica.g:2961:7: lv_right_2_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getEquationAccess().getRightExpressionParserRuleCall_0_0_2_0());
                    						
                    pushFollow(FOLLOW_20);
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


                    }
                    break;
                case 2 :
                    // InternalModelica.g:2980:4: this_IfEquation_3= ruleIfEquation
                    {

                    				newCompositeNode(grammarAccess.getEquationAccess().getIfEquationParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_20);
                    this_IfEquation_3=ruleIfEquation();

                    state._fsp--;


                    				current = this_IfEquation_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalModelica.g:2989:4: this_ForEquation_4= ruleForEquation
                    {

                    				newCompositeNode(grammarAccess.getEquationAccess().getForEquationParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_20);
                    this_ForEquation_4=ruleForEquation();

                    state._fsp--;


                    				current = this_ForEquation_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalModelica.g:2998:4: this_ConnectClause_5= ruleConnectClause
                    {

                    				newCompositeNode(grammarAccess.getEquationAccess().getConnectClauseParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_20);
                    this_ConnectClause_5=ruleConnectClause();

                    state._fsp--;


                    				current = this_ConnectClause_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalModelica.g:3007:4: this_WhenEquation_6= ruleWhenEquation
                    {

                    				newCompositeNode(grammarAccess.getEquationAccess().getWhenEquationParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_20);
                    this_WhenEquation_6=ruleWhenEquation();

                    state._fsp--;


                    				current = this_WhenEquation_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalModelica.g:3016:3: ( (lv_commment_7_0= ruleComment ) )
            // InternalModelica.g:3017:4: (lv_commment_7_0= ruleComment )
            {
            // InternalModelica.g:3017:4: (lv_commment_7_0= ruleComment )
            // InternalModelica.g:3018:5: lv_commment_7_0= ruleComment
            {

            					newCompositeNode(grammarAccess.getEquationAccess().getCommmentCommentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_commment_7_0=ruleComment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquationRule());
            					}
            					set(
            						current,
            						"commment",
            						lv_commment_7_0,
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
    // InternalModelica.g:3039:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalModelica.g:3039:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalModelica.g:3040:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalModelica.g:3046:1: ruleStatement returns [EObject current=null] : ( ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) ) ) ;
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
            // InternalModelica.g:3052:2: ( ( ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) ) ) )
            // InternalModelica.g:3053:2: ( ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) ) )
            {
            // InternalModelica.g:3053:2: ( ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) ) )
            // InternalModelica.g:3054:3: ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) )
            {
            // InternalModelica.g:3054:3: ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement )
            int alt75=8;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case 101:
                {
                alt75=1;
                }
                break;
            case 41:
                {
                alt75=2;
                }
                break;
            case 66:
                {
                alt75=3;
                }
                break;
            case 67:
                {
                alt75=4;
                }
                break;
            case 58:
                {
                alt75=5;
                }
                break;
            case 71:
                {
                alt75=6;
                }
                break;
            case 74:
                {
                alt75=7;
                }
                break;
            case 75:
                {
                alt75=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalModelica.g:3055:4: ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) )
                    {
                    // InternalModelica.g:3055:4: ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) )
                    // InternalModelica.g:3056:5: ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) )
                    {
                    // InternalModelica.g:3056:5: ( (lv_left_0_0= ruleComponentReference ) )
                    // InternalModelica.g:3057:6: (lv_left_0_0= ruleComponentReference )
                    {
                    // InternalModelica.g:3057:6: (lv_left_0_0= ruleComponentReference )
                    // InternalModelica.g:3058:7: lv_left_0_0= ruleComponentReference
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getLeftComponentReferenceParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_63);
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

                    // InternalModelica.g:3075:5: (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) )
                    // InternalModelica.g:3076:6: otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) )
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_64); 

                    						newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_0_0_1_0());
                    					
                    // InternalModelica.g:3080:6: ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) )
                    // InternalModelica.g:3081:7: ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) )
                    {
                    // InternalModelica.g:3081:7: ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) )
                    // InternalModelica.g:3082:8: (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs )
                    {
                    // InternalModelica.g:3082:8: (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( ((LA74_0>=RULE_IDENT && LA74_0<=RULE_TRUE_FALSE)||LA74_0==35||LA74_0==58||LA74_0==63||LA74_0==80||(LA74_0>=87 && LA74_0<=90)||LA74_0==96||LA74_0==98||(LA74_0>=100 && LA74_0<=101)) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==41) ) {
                        alt74=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalModelica.g:3083:9: lv_right_2_1= ruleExpression
                            {

                            									newCompositeNode(grammarAccess.getStatementAccess().getRightExpressionParserRuleCall_0_0_1_1_0_0());
                            								
                            pushFollow(FOLLOW_20);
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
                            // InternalModelica.g:3099:9: lv_right_2_2= ruleFunctionCallArgs
                            {

                            									newCompositeNode(grammarAccess.getStatementAccess().getRightFunctionCallArgsParserRuleCall_0_0_1_1_0_1());
                            								
                            pushFollow(FOLLOW_20);
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
                    // InternalModelica.g:3120:4: (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) )
                    {
                    // InternalModelica.g:3120:4: (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) )
                    // InternalModelica.g:3121:5: otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_65); 

                    					newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_0_1_0());
                    				
                    // InternalModelica.g:3125:5: ( (lv_left_4_0= ruleOutputExpressionList ) )
                    // InternalModelica.g:3126:6: (lv_left_4_0= ruleOutputExpressionList )
                    {
                    // InternalModelica.g:3126:6: (lv_left_4_0= ruleOutputExpressionList )
                    // InternalModelica.g:3127:7: lv_left_4_0= ruleOutputExpressionList
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getLeftOutputExpressionListParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_29);
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

                    otherlv_5=(Token)match(input,42,FOLLOW_63); 

                    					newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getRightParenthesisKeyword_0_1_2());
                    				
                    otherlv_6=(Token)match(input,59,FOLLOW_3); 

                    					newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_0_1_3());
                    				
                    // InternalModelica.g:3152:5: ( (lv_ref_7_0= ruleComponentReference ) )
                    // InternalModelica.g:3153:6: (lv_ref_7_0= ruleComponentReference )
                    {
                    // InternalModelica.g:3153:6: (lv_ref_7_0= ruleComponentReference )
                    // InternalModelica.g:3154:7: lv_ref_7_0= ruleComponentReference
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getRefComponentReferenceParserRuleCall_0_1_4_0());
                    						
                    pushFollow(FOLLOW_64);
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

                    // InternalModelica.g:3171:5: ( (lv_ref_call_8_0= ruleFunctionCallArgs ) )
                    // InternalModelica.g:3172:6: (lv_ref_call_8_0= ruleFunctionCallArgs )
                    {
                    // InternalModelica.g:3172:6: (lv_ref_call_8_0= ruleFunctionCallArgs )
                    // InternalModelica.g:3173:7: lv_ref_call_8_0= ruleFunctionCallArgs
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getRef_callFunctionCallArgsParserRuleCall_0_1_5_0());
                    						
                    pushFollow(FOLLOW_20);
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
                    // InternalModelica.g:3192:4: otherlv_9= 'break'
                    {
                    otherlv_9=(Token)match(input,66,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getBreakKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalModelica.g:3197:4: otherlv_10= 'return'
                    {
                    otherlv_10=(Token)match(input,67,FOLLOW_20); 

                    				newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getReturnKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalModelica.g:3202:4: this_IfStatement_11= ruleIfStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_20);
                    this_IfStatement_11=ruleIfStatement();

                    state._fsp--;


                    				current = this_IfStatement_11;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalModelica.g:3211:4: this_ForStatement_12= ruleForStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_20);
                    this_ForStatement_12=ruleForStatement();

                    state._fsp--;


                    				current = this_ForStatement_12;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalModelica.g:3220:4: this_WhileStatement_13= ruleWhileStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_0_6());
                    			
                    pushFollow(FOLLOW_20);
                    this_WhileStatement_13=ruleWhileStatement();

                    state._fsp--;


                    				current = this_WhileStatement_13;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalModelica.g:3229:4: this_WhenStatement_14= ruleWhenStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getWhenStatementParserRuleCall_0_7());
                    			
                    pushFollow(FOLLOW_20);
                    this_WhenStatement_14=ruleWhenStatement();

                    state._fsp--;


                    				current = this_WhenStatement_14;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalModelica.g:3238:3: ( (lv_comment_15_0= ruleComment ) )
            // InternalModelica.g:3239:4: (lv_comment_15_0= ruleComment )
            {
            // InternalModelica.g:3239:4: (lv_comment_15_0= ruleComment )
            // InternalModelica.g:3240:5: lv_comment_15_0= ruleComment
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


    // $ANTLR start "entryRuleIfEquation"
    // InternalModelica.g:3261:1: entryRuleIfEquation returns [EObject current=null] : iv_ruleIfEquation= ruleIfEquation EOF ;
    public final EObject entryRuleIfEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfEquation = null;


        try {
            // InternalModelica.g:3261:51: (iv_ruleIfEquation= ruleIfEquation EOF )
            // InternalModelica.g:3262:2: iv_ruleIfEquation= ruleIfEquation EOF
            {
             newCompositeNode(grammarAccess.getIfEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfEquation=ruleIfEquation();

            state._fsp--;

             current =iv_ruleIfEquation; 
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
    // $ANTLR end "entryRuleIfEquation"


    // $ANTLR start "ruleIfEquation"
    // InternalModelica.g:3268:1: ruleIfEquation returns [EObject current=null] : (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' ) ;
    public final EObject ruleIfEquation() throws RecognitionException {
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

        EObject lv_if_eqs_3_0 = null;

        EObject lv_elsif_exprs_6_0 = null;

        EObject lv_elseif_eqs_8_0 = null;

        EObject lv_else_eqs_11_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3274:2: ( (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' ) )
            // InternalModelica.g:3275:2: (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' )
            {
            // InternalModelica.g:3275:2: (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' )
            // InternalModelica.g:3276:3: otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getIfEquationAccess().getIfKeyword_0());
            		
            // InternalModelica.g:3280:3: ( (lv_if_expr_1_0= ruleExpression ) )
            // InternalModelica.g:3281:4: (lv_if_expr_1_0= ruleExpression )
            {
            // InternalModelica.g:3281:4: (lv_if_expr_1_0= ruleExpression )
            // InternalModelica.g:3282:5: lv_if_expr_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfEquationAccess().getIf_exprExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_66);
            lv_if_expr_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfEquationRule());
            					}
            					set(
            						current,
            						"if_expr",
            						lv_if_expr_1_0,
            						"xmodelica.Modelica.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getIfEquationAccess().getThenKeyword_2());
            		
            // InternalModelica.g:3303:3: ( ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==35) ) {
                    int LA76_2 = input.LA(2);

                    if ( (LA76_2==36||LA76_2==48||LA76_2==62||(LA76_2>=78 && LA76_2<=79)||(LA76_2>=81 && LA76_2<=95)) ) {
                        alt76=1;
                    }


                }
                else if ( ((LA76_0>=RULE_IDENT && LA76_0<=RULE_TRUE_FALSE)||LA76_0==58||LA76_0==63||LA76_0==71||LA76_0==75||LA76_0==77||LA76_0==80||(LA76_0>=87 && LA76_0<=90)||LA76_0==96||LA76_0==98||(LA76_0>=100 && LA76_0<=101)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalModelica.g:3304:4: ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3304:4: ( (lv_if_eqs_3_0= ruleEquation ) )
            	    // InternalModelica.g:3305:5: (lv_if_eqs_3_0= ruleEquation )
            	    {
            	    // InternalModelica.g:3305:5: (lv_if_eqs_3_0= ruleEquation )
            	    // InternalModelica.g:3306:6: lv_if_eqs_3_0= ruleEquation
            	    {

            	    						newCompositeNode(grammarAccess.getIfEquationAccess().getIf_eqsEquationParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_if_eqs_3_0=ruleEquation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfEquationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"if_eqs",
            	    							lv_if_eqs_3_0,
            	    							"xmodelica.Modelica.Equation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,19,FOLLOW_67); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIfEquationAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            // InternalModelica.g:3328:3: (otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )* )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==69) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalModelica.g:3329:4: otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )*
            	    {
            	    otherlv_5=(Token)match(input,69,FOLLOW_42); 

            	    				newLeafNode(otherlv_5, grammarAccess.getIfEquationAccess().getElseifKeyword_4_0());
            	    			
            	    // InternalModelica.g:3333:4: ( (lv_elsif_exprs_6_0= ruleExpression ) )
            	    // InternalModelica.g:3334:5: (lv_elsif_exprs_6_0= ruleExpression )
            	    {
            	    // InternalModelica.g:3334:5: (lv_elsif_exprs_6_0= ruleExpression )
            	    // InternalModelica.g:3335:6: lv_elsif_exprs_6_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getIfEquationAccess().getElsif_exprsExpressionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_66);
            	    lv_elsif_exprs_6_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfEquationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elsif_exprs",
            	    							lv_elsif_exprs_6_0,
            	    							"xmodelica.Modelica.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,68,FOLLOW_67); 

            	    				newLeafNode(otherlv_7, grammarAccess.getIfEquationAccess().getThenKeyword_4_2());
            	    			
            	    // InternalModelica.g:3356:4: ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )*
            	    loop77:
            	    do {
            	        int alt77=2;
            	        int LA77_0 = input.LA(1);

            	        if ( (LA77_0==35) ) {
            	            int LA77_2 = input.LA(2);

            	            if ( (LA77_2==36||LA77_2==48||LA77_2==62||(LA77_2>=78 && LA77_2<=79)||(LA77_2>=81 && LA77_2<=95)) ) {
            	                alt77=1;
            	            }


            	        }
            	        else if ( ((LA77_0>=RULE_IDENT && LA77_0<=RULE_TRUE_FALSE)||LA77_0==58||LA77_0==63||LA77_0==71||LA77_0==75||LA77_0==77||LA77_0==80||(LA77_0>=87 && LA77_0<=90)||LA77_0==96||LA77_0==98||(LA77_0>=100 && LA77_0<=101)) ) {
            	            alt77=1;
            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // InternalModelica.g:3357:5: ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';'
            	    	    {
            	    	    // InternalModelica.g:3357:5: ( (lv_elseif_eqs_8_0= ruleEquation ) )
            	    	    // InternalModelica.g:3358:6: (lv_elseif_eqs_8_0= ruleEquation )
            	    	    {
            	    	    // InternalModelica.g:3358:6: (lv_elseif_eqs_8_0= ruleEquation )
            	    	    // InternalModelica.g:3359:7: lv_elseif_eqs_8_0= ruleEquation
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getIfEquationAccess().getElseif_eqsEquationParserRuleCall_4_3_0_0());
            	    	    						
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_elseif_eqs_8_0=ruleEquation();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getIfEquationRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"elseif_eqs",
            	    	    								lv_elseif_eqs_8_0,
            	    	    								"xmodelica.Modelica.Equation");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }

            	    	    otherlv_9=(Token)match(input,19,FOLLOW_67); 

            	    	    					newLeafNode(otherlv_9, grammarAccess.getIfEquationAccess().getSemicolonKeyword_4_3_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop77;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            // InternalModelica.g:3382:3: (otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )* )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==70) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalModelica.g:3383:4: otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )*
                    {
                    otherlv_10=(Token)match(input,70,FOLLOW_58); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfEquationAccess().getElseKeyword_5_0());
                    			
                    // InternalModelica.g:3387:4: ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==35) ) {
                            int LA79_1 = input.LA(2);

                            if ( (LA79_1==36||LA79_1==48||LA79_1==62||(LA79_1>=78 && LA79_1<=79)||(LA79_1>=81 && LA79_1<=95)) ) {
                                alt79=1;
                            }


                        }
                        else if ( ((LA79_0>=RULE_IDENT && LA79_0<=RULE_TRUE_FALSE)||LA79_0==58||LA79_0==63||LA79_0==71||LA79_0==75||LA79_0==77||LA79_0==80||(LA79_0>=87 && LA79_0<=90)||LA79_0==96||LA79_0==98||(LA79_0>=100 && LA79_0<=101)) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalModelica.g:3388:5: ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';'
                    	    {
                    	    // InternalModelica.g:3388:5: ( (lv_else_eqs_11_0= ruleEquation ) )
                    	    // InternalModelica.g:3389:6: (lv_else_eqs_11_0= ruleEquation )
                    	    {
                    	    // InternalModelica.g:3389:6: (lv_else_eqs_11_0= ruleEquation )
                    	    // InternalModelica.g:3390:7: lv_else_eqs_11_0= ruleEquation
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfEquationAccess().getElse_eqsEquationParserRuleCall_5_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_else_eqs_11_0=ruleEquation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfEquationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"else_eqs",
                    	    								lv_else_eqs_11_0,
                    	    								"xmodelica.Modelica.Equation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,19,FOLLOW_58); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getIfEquationAccess().getSemicolonKeyword_5_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,35,FOLLOW_68); 

            			newLeafNode(otherlv_13, grammarAccess.getIfEquationAccess().getEndKeyword_6());
            		
            otherlv_14=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getIfEquationAccess().getIfKeyword_7());
            		

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
    // $ANTLR end "ruleIfEquation"


    // $ANTLR start "entryRuleIfStatement"
    // InternalModelica.g:3425:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalModelica.g:3425:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalModelica.g:3426:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalModelica.g:3432:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' ) ;
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
            // InternalModelica.g:3438:2: ( (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' ) )
            // InternalModelica.g:3439:2: (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' )
            {
            // InternalModelica.g:3439:2: (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' )
            // InternalModelica.g:3440:3: otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            // InternalModelica.g:3444:3: ( (lv_if_expr_1_0= ruleExpression ) )
            // InternalModelica.g:3445:4: (lv_if_expr_1_0= ruleExpression )
            {
            // InternalModelica.g:3445:4: (lv_if_expr_1_0= ruleExpression )
            // InternalModelica.g:3446:5: lv_if_expr_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getIf_exprExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_66);
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

            otherlv_2=(Token)match(input,68,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getThenKeyword_2());
            		
            // InternalModelica.g:3467:3: ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==RULE_IDENT||LA81_0==41||LA81_0==58||(LA81_0>=66 && LA81_0<=67)||LA81_0==71||(LA81_0>=74 && LA81_0<=75)||LA81_0==101) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalModelica.g:3468:4: ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3468:4: ( (lv_if_stmts_3_0= ruleStatement ) )
            	    // InternalModelica.g:3469:5: (lv_if_stmts_3_0= ruleStatement )
            	    {
            	    // InternalModelica.g:3469:5: (lv_if_stmts_3_0= ruleStatement )
            	    // InternalModelica.g:3470:6: lv_if_stmts_3_0= ruleStatement
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

            	    otherlv_4=(Token)match(input,19,FOLLOW_69); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            // InternalModelica.g:3492:3: (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==69) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalModelica.g:3493:4: otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )*
            	    {
            	    otherlv_5=(Token)match(input,69,FOLLOW_42); 

            	    				newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseifKeyword_4_0());
            	    			
            	    // InternalModelica.g:3497:4: ( (lv_elseif_exprs_6_0= ruleExpression ) )
            	    // InternalModelica.g:3498:5: (lv_elseif_exprs_6_0= ruleExpression )
            	    {
            	    // InternalModelica.g:3498:5: (lv_elseif_exprs_6_0= ruleExpression )
            	    // InternalModelica.g:3499:6: lv_elseif_exprs_6_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getIfStatementAccess().getElseif_exprsExpressionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_66);
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

            	    otherlv_7=(Token)match(input,68,FOLLOW_69); 

            	    				newLeafNode(otherlv_7, grammarAccess.getIfStatementAccess().getThenKeyword_4_2());
            	    			
            	    // InternalModelica.g:3520:4: ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )*
            	    loop82:
            	    do {
            	        int alt82=2;
            	        int LA82_0 = input.LA(1);

            	        if ( (LA82_0==RULE_IDENT||LA82_0==41||LA82_0==58||(LA82_0>=66 && LA82_0<=67)||LA82_0==71||(LA82_0>=74 && LA82_0<=75)||LA82_0==101) ) {
            	            alt82=1;
            	        }


            	        switch (alt82) {
            	    	case 1 :
            	    	    // InternalModelica.g:3521:5: ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';'
            	    	    {
            	    	    // InternalModelica.g:3521:5: ( (lv_elseif_stmts_8_0= ruleStatement ) )
            	    	    // InternalModelica.g:3522:6: (lv_elseif_stmts_8_0= ruleStatement )
            	    	    {
            	    	    // InternalModelica.g:3522:6: (lv_elseif_stmts_8_0= ruleStatement )
            	    	    // InternalModelica.g:3523:7: lv_elseif_stmts_8_0= ruleStatement
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

            	    	    otherlv_9=(Token)match(input,19,FOLLOW_69); 

            	    	    					newLeafNode(otherlv_9, grammarAccess.getIfStatementAccess().getSemicolonKeyword_4_3_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop82;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            // InternalModelica.g:3546:3: (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==70) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalModelica.g:3547:4: otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )*
                    {
                    otherlv_10=(Token)match(input,70,FOLLOW_70); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                    			
                    // InternalModelica.g:3551:4: ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==RULE_IDENT||LA84_0==41||LA84_0==58||(LA84_0>=66 && LA84_0<=67)||LA84_0==71||(LA84_0>=74 && LA84_0<=75)||LA84_0==101) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalModelica.g:3552:5: ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';'
                    	    {
                    	    // InternalModelica.g:3552:5: ( (lv_else_stmts_11_0= ruleStatement ) )
                    	    // InternalModelica.g:3553:6: (lv_else_stmts_11_0= ruleStatement )
                    	    {
                    	    // InternalModelica.g:3553:6: (lv_else_stmts_11_0= ruleStatement )
                    	    // InternalModelica.g:3554:7: lv_else_stmts_11_0= ruleStatement
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

                    	    otherlv_12=(Token)match(input,19,FOLLOW_70); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getIfStatementAccess().getSemicolonKeyword_5_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,35,FOLLOW_68); 

            			newLeafNode(otherlv_13, grammarAccess.getIfStatementAccess().getEndKeyword_6());
            		
            otherlv_14=(Token)match(input,58,FOLLOW_2); 

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


    // $ANTLR start "entryRuleForEquation"
    // InternalModelica.g:3589:1: entryRuleForEquation returns [EObject current=null] : iv_ruleForEquation= ruleForEquation EOF ;
    public final EObject entryRuleForEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEquation = null;


        try {
            // InternalModelica.g:3589:52: (iv_ruleForEquation= ruleForEquation EOF )
            // InternalModelica.g:3590:2: iv_ruleForEquation= ruleForEquation EOF
            {
             newCompositeNode(grammarAccess.getForEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForEquation=ruleForEquation();

            state._fsp--;

             current =iv_ruleForEquation; 
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
    // $ANTLR end "entryRuleForEquation"


    // $ANTLR start "ruleForEquation"
    // InternalModelica.g:3596:1: ruleForEquation returns [EObject current=null] : (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' ) ;
    public final EObject ruleForEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_indices_1_0 = null;

        EObject lv_eqs_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3602:2: ( (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' ) )
            // InternalModelica.g:3603:2: (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' )
            {
            // InternalModelica.g:3603:2: (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' )
            // InternalModelica.g:3604:3: otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getForEquationAccess().getForKeyword_0());
            		
            // InternalModelica.g:3608:3: ( (lv_indices_1_0= ruleForIndices ) )
            // InternalModelica.g:3609:4: (lv_indices_1_0= ruleForIndices )
            {
            // InternalModelica.g:3609:4: (lv_indices_1_0= ruleForIndices )
            // InternalModelica.g:3610:5: lv_indices_1_0= ruleForIndices
            {

            					newCompositeNode(grammarAccess.getForEquationAccess().getIndicesForIndicesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_71);
            lv_indices_1_0=ruleForIndices();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEquationRule());
            					}
            					set(
            						current,
            						"indices",
            						lv_indices_1_0,
            						"xmodelica.Modelica.ForIndices");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,72,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getForEquationAccess().getLoopKeyword_2());
            		
            // InternalModelica.g:3631:3: ( ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==35) ) {
                    int LA86_1 = input.LA(2);

                    if ( (LA86_1==36||LA86_1==48||LA86_1==62||(LA86_1>=78 && LA86_1<=79)||(LA86_1>=81 && LA86_1<=95)) ) {
                        alt86=1;
                    }


                }
                else if ( ((LA86_0>=RULE_IDENT && LA86_0<=RULE_TRUE_FALSE)||LA86_0==58||LA86_0==63||LA86_0==71||LA86_0==75||LA86_0==77||LA86_0==80||(LA86_0>=87 && LA86_0<=90)||LA86_0==96||LA86_0==98||(LA86_0>=100 && LA86_0<=101)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalModelica.g:3632:4: ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3632:4: ( (lv_eqs_3_0= ruleEquation ) )
            	    // InternalModelica.g:3633:5: (lv_eqs_3_0= ruleEquation )
            	    {
            	    // InternalModelica.g:3633:5: (lv_eqs_3_0= ruleEquation )
            	    // InternalModelica.g:3634:6: lv_eqs_3_0= ruleEquation
            	    {

            	    						newCompositeNode(grammarAccess.getForEquationAccess().getEqsEquationParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_eqs_3_0=ruleEquation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getForEquationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"eqs",
            	    							lv_eqs_3_0,
            	    							"xmodelica.Modelica.Equation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,19,FOLLOW_58); 

            	    				newLeafNode(otherlv_4, grammarAccess.getForEquationAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            otherlv_5=(Token)match(input,35,FOLLOW_72); 

            			newLeafNode(otherlv_5, grammarAccess.getForEquationAccess().getEndKeyword_4());
            		
            otherlv_6=(Token)match(input,71,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getForEquationAccess().getForKeyword_5());
            		

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
    // $ANTLR end "ruleForEquation"


    // $ANTLR start "entryRuleForStatement"
    // InternalModelica.g:3668:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalModelica.g:3668:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalModelica.g:3669:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalModelica.g:3675:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' ) ;
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
            // InternalModelica.g:3681:2: ( (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' ) )
            // InternalModelica.g:3682:2: (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' )
            {
            // InternalModelica.g:3682:2: (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' )
            // InternalModelica.g:3683:3: otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
            		
            // InternalModelica.g:3687:3: ( (lv_indices_1_0= ruleForIndices ) )
            // InternalModelica.g:3688:4: (lv_indices_1_0= ruleForIndices )
            {
            // InternalModelica.g:3688:4: (lv_indices_1_0= ruleForIndices )
            // InternalModelica.g:3689:5: lv_indices_1_0= ruleForIndices
            {

            					newCompositeNode(grammarAccess.getForStatementAccess().getIndicesForIndicesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_71);
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

            otherlv_2=(Token)match(input,72,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getLoopKeyword_2());
            		
            // InternalModelica.g:3710:3: ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==RULE_IDENT||LA87_0==41||LA87_0==58||(LA87_0>=66 && LA87_0<=67)||LA87_0==71||(LA87_0>=74 && LA87_0<=75)||LA87_0==101) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalModelica.g:3711:4: ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3711:4: ( (lv_stmts_3_0= ruleStatement ) )
            	    // InternalModelica.g:3712:5: (lv_stmts_3_0= ruleStatement )
            	    {
            	    // InternalModelica.g:3712:5: (lv_stmts_3_0= ruleStatement )
            	    // InternalModelica.g:3713:6: lv_stmts_3_0= ruleStatement
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

            	    otherlv_4=(Token)match(input,19,FOLLOW_70); 

            	    				newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            otherlv_5=(Token)match(input,35,FOLLOW_72); 

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
    // InternalModelica.g:3747:1: entryRuleForIndices returns [EObject current=null] : iv_ruleForIndices= ruleForIndices EOF ;
    public final EObject entryRuleForIndices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForIndices = null;


        try {
            // InternalModelica.g:3747:51: (iv_ruleForIndices= ruleForIndices EOF )
            // InternalModelica.g:3748:2: iv_ruleForIndices= ruleForIndices EOF
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
    // InternalModelica.g:3754:1: ruleForIndices returns [EObject current=null] : ( ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )* ) ;
    public final EObject ruleForIndices() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_indices_0_0 = null;

        EObject lv_indices_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3760:2: ( ( ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )* ) )
            // InternalModelica.g:3761:2: ( ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )* )
            {
            // InternalModelica.g:3761:2: ( ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )* )
            // InternalModelica.g:3762:3: ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )*
            {
            // InternalModelica.g:3762:3: ( (lv_indices_0_0= ruleForIndex ) )
            // InternalModelica.g:3763:4: (lv_indices_0_0= ruleForIndex )
            {
            // InternalModelica.g:3763:4: (lv_indices_0_0= ruleForIndex )
            // InternalModelica.g:3764:5: lv_indices_0_0= ruleForIndex
            {

            					newCompositeNode(grammarAccess.getForIndicesAccess().getIndicesForIndexParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalModelica.g:3781:3: (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==37) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalModelica.g:3782:4: otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getForIndicesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:3786:4: ( (lv_indices_2_0= ruleForIndex ) )
            	    // InternalModelica.g:3787:5: (lv_indices_2_0= ruleForIndex )
            	    {
            	    // InternalModelica.g:3787:5: (lv_indices_2_0= ruleForIndex )
            	    // InternalModelica.g:3788:6: lv_indices_2_0= ruleForIndex
            	    {

            	    						newCompositeNode(grammarAccess.getForIndicesAccess().getIndicesForIndexParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    break loop88;
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
    // InternalModelica.g:3810:1: entryRuleForIndex returns [EObject current=null] : iv_ruleForIndex= ruleForIndex EOF ;
    public final EObject entryRuleForIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForIndex = null;


        try {
            // InternalModelica.g:3810:49: (iv_ruleForIndex= ruleForIndex EOF )
            // InternalModelica.g:3811:2: iv_ruleForIndex= ruleForIndex EOF
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
    // InternalModelica.g:3817:1: ruleForIndex returns [EObject current=null] : ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) ) ) ) ;
    public final EObject ruleForIndex() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3823:2: ( ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) ) ) ) )
            // InternalModelica.g:3824:2: ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) ) ) )
            {
            // InternalModelica.g:3824:2: ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalModelica.g:3825:3: ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalModelica.g:3825:3: ( (lv_id_0_0= RULE_IDENT ) )
            // InternalModelica.g:3826:4: (lv_id_0_0= RULE_IDENT )
            {
            // InternalModelica.g:3826:4: (lv_id_0_0= RULE_IDENT )
            // InternalModelica.g:3827:5: lv_id_0_0= RULE_IDENT
            {
            lv_id_0_0=(Token)match(input,RULE_IDENT,FOLLOW_73); 

            					newLeafNode(lv_id_0_0, grammarAccess.getForIndexAccess().getIdIDENTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForIndexRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"xmodelica.Modelica.IDENT");
            				

            }


            }

            // InternalModelica.g:3843:3: (otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalModelica.g:3844:4: otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) )
            {
            otherlv_1=(Token)match(input,73,FOLLOW_42); 

            				newLeafNode(otherlv_1, grammarAccess.getForIndexAccess().getInKeyword_1_0());
            			
            // InternalModelica.g:3848:4: ( (lv_expr_2_0= ruleExpression ) )
            // InternalModelica.g:3849:5: (lv_expr_2_0= ruleExpression )
            {
            // InternalModelica.g:3849:5: (lv_expr_2_0= ruleExpression )
            // InternalModelica.g:3850:6: lv_expr_2_0= ruleExpression
            {

            						newCompositeNode(grammarAccess.getForIndexAccess().getExprExpressionParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getForIndexRule());
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
    // InternalModelica.g:3872:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalModelica.g:3872:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalModelica.g:3873:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalModelica.g:3879:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while' ) ;
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
            // InternalModelica.g:3885:2: ( (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while' ) )
            // InternalModelica.g:3886:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while' )
            {
            // InternalModelica.g:3886:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while' )
            // InternalModelica.g:3887:3: otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
            		
            // InternalModelica.g:3891:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalModelica.g:3892:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalModelica.g:3892:4: (lv_cond_1_0= ruleExpression )
            // InternalModelica.g:3893:5: lv_cond_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getCondExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_71);
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

            otherlv_2=(Token)match(input,72,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getLoopKeyword_2());
            		
            // InternalModelica.g:3914:3: ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==RULE_IDENT||LA89_0==41||LA89_0==58||(LA89_0>=66 && LA89_0<=67)||LA89_0==71||(LA89_0>=74 && LA89_0<=75)||LA89_0==101) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalModelica.g:3915:4: ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3915:4: ( (lv_stmts_3_0= ruleStatement ) )
            	    // InternalModelica.g:3916:5: (lv_stmts_3_0= ruleStatement )
            	    {
            	    // InternalModelica.g:3916:5: (lv_stmts_3_0= ruleStatement )
            	    // InternalModelica.g:3917:6: lv_stmts_3_0= ruleStatement
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

            	    otherlv_4=(Token)match(input,19,FOLLOW_70); 

            	    				newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_5=(Token)match(input,35,FOLLOW_74); 

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


    // $ANTLR start "entryRuleWhenEquation"
    // InternalModelica.g:3951:1: entryRuleWhenEquation returns [EObject current=null] : iv_ruleWhenEquation= ruleWhenEquation EOF ;
    public final EObject entryRuleWhenEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenEquation = null;


        try {
            // InternalModelica.g:3951:53: (iv_ruleWhenEquation= ruleWhenEquation EOF )
            // InternalModelica.g:3952:2: iv_ruleWhenEquation= ruleWhenEquation EOF
            {
             newCompositeNode(grammarAccess.getWhenEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhenEquation=ruleWhenEquation();

            state._fsp--;

             current =iv_ruleWhenEquation; 
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
    // $ANTLR end "entryRuleWhenEquation"


    // $ANTLR start "ruleWhenEquation"
    // InternalModelica.g:3958:1: ruleWhenEquation returns [EObject current=null] : (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' ) )* otherlv_10= 'end' otherlv_11= 'when' ) ;
    public final EObject ruleWhenEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_when_1_0 = null;

        EObject lv_when_eqs_3_0 = null;

        EObject lv_elsehwhen_6_0 = null;

        EObject lv_elsewhen_eqs_8_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3964:2: ( (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' ) )* otherlv_10= 'end' otherlv_11= 'when' ) )
            // InternalModelica.g:3965:2: (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' ) )* otherlv_10= 'end' otherlv_11= 'when' )
            {
            // InternalModelica.g:3965:2: (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' ) )* otherlv_10= 'end' otherlv_11= 'when' )
            // InternalModelica.g:3966:3: otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' ) )* otherlv_10= 'end' otherlv_11= 'when'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenEquationAccess().getWhenKeyword_0());
            		
            // InternalModelica.g:3970:3: ( (lv_when_1_0= ruleExpression ) )
            // InternalModelica.g:3971:4: (lv_when_1_0= ruleExpression )
            {
            // InternalModelica.g:3971:4: (lv_when_1_0= ruleExpression )
            // InternalModelica.g:3972:5: lv_when_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhenEquationAccess().getWhenExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_66);
            lv_when_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenEquationRule());
            					}
            					set(
            						current,
            						"when",
            						lv_when_1_0,
            						"xmodelica.Modelica.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_75); 

            			newLeafNode(otherlv_2, grammarAccess.getWhenEquationAccess().getThenKeyword_2());
            		
            // InternalModelica.g:3993:3: ( ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==35) ) {
                    int LA90_2 = input.LA(2);

                    if ( (LA90_2==36||LA90_2==48||LA90_2==62||(LA90_2>=78 && LA90_2<=79)||(LA90_2>=81 && LA90_2<=95)) ) {
                        alt90=1;
                    }


                }
                else if ( ((LA90_0>=RULE_IDENT && LA90_0<=RULE_TRUE_FALSE)||LA90_0==58||LA90_0==63||LA90_0==71||LA90_0==75||LA90_0==77||LA90_0==80||(LA90_0>=87 && LA90_0<=90)||LA90_0==96||LA90_0==98||(LA90_0>=100 && LA90_0<=101)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalModelica.g:3994:4: ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3994:4: ( (lv_when_eqs_3_0= ruleEquation ) )
            	    // InternalModelica.g:3995:5: (lv_when_eqs_3_0= ruleEquation )
            	    {
            	    // InternalModelica.g:3995:5: (lv_when_eqs_3_0= ruleEquation )
            	    // InternalModelica.g:3996:6: lv_when_eqs_3_0= ruleEquation
            	    {

            	    						newCompositeNode(grammarAccess.getWhenEquationAccess().getWhen_eqsEquationParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_when_eqs_3_0=ruleEquation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhenEquationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"when_eqs",
            	    							lv_when_eqs_3_0,
            	    							"xmodelica.Modelica.Equation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,19,FOLLOW_75); 

            	    				newLeafNode(otherlv_4, grammarAccess.getWhenEquationAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            // InternalModelica.g:4018:3: (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==76) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalModelica.g:4019:4: otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )
            	    {
            	    otherlv_5=(Token)match(input,76,FOLLOW_42); 

            	    				newLeafNode(otherlv_5, grammarAccess.getWhenEquationAccess().getElsewhenKeyword_4_0());
            	    			
            	    // InternalModelica.g:4023:4: ( (lv_elsehwhen_6_0= ruleExpression ) )
            	    // InternalModelica.g:4024:5: (lv_elsehwhen_6_0= ruleExpression )
            	    {
            	    // InternalModelica.g:4024:5: (lv_elsehwhen_6_0= ruleExpression )
            	    // InternalModelica.g:4025:6: lv_elsehwhen_6_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getWhenEquationAccess().getElsehwhenExpressionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_66);
            	    lv_elsehwhen_6_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhenEquationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elsehwhen",
            	    							lv_elsehwhen_6_0,
            	    							"xmodelica.Modelica.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,68,FOLLOW_58); 

            	    				newLeafNode(otherlv_7, grammarAccess.getWhenEquationAccess().getThenKeyword_4_2());
            	    			
            	    // InternalModelica.g:4046:4: ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )
            	    // InternalModelica.g:4047:5: ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';'
            	    {
            	    // InternalModelica.g:4047:5: ( (lv_elsewhen_eqs_8_0= ruleEquation ) )
            	    // InternalModelica.g:4048:6: (lv_elsewhen_eqs_8_0= ruleEquation )
            	    {
            	    // InternalModelica.g:4048:6: (lv_elsewhen_eqs_8_0= ruleEquation )
            	    // InternalModelica.g:4049:7: lv_elsewhen_eqs_8_0= ruleEquation
            	    {

            	    							newCompositeNode(grammarAccess.getWhenEquationAccess().getElsewhen_eqsEquationParserRuleCall_4_3_0_0());
            	    						
            	    pushFollow(FOLLOW_4);
            	    lv_elsewhen_eqs_8_0=ruleEquation();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getWhenEquationRule());
            	    							}
            	    							add(
            	    								current,
            	    								"elsewhen_eqs",
            	    								lv_elsewhen_eqs_8_0,
            	    								"xmodelica.Modelica.Equation");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_9=(Token)match(input,19,FOLLOW_76); 

            	    					newLeafNode(otherlv_9, grammarAccess.getWhenEquationAccess().getSemicolonKeyword_4_3_1());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            otherlv_10=(Token)match(input,35,FOLLOW_77); 

            			newLeafNode(otherlv_10, grammarAccess.getWhenEquationAccess().getEndKeyword_5());
            		
            otherlv_11=(Token)match(input,75,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getWhenEquationAccess().getWhenKeyword_6());
            		

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
    // $ANTLR end "ruleWhenEquation"


    // $ANTLR start "entryRuleWhenStatement"
    // InternalModelica.g:4084:1: entryRuleWhenStatement returns [EObject current=null] : iv_ruleWhenStatement= ruleWhenStatement EOF ;
    public final EObject entryRuleWhenStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenStatement = null;


        try {
            // InternalModelica.g:4084:54: (iv_ruleWhenStatement= ruleWhenStatement EOF )
            // InternalModelica.g:4085:2: iv_ruleWhenStatement= ruleWhenStatement EOF
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
    // InternalModelica.g:4091:1: ruleWhenStatement returns [EObject current=null] : (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) )* otherlv_10= 'end' otherlv_11= 'when' ) ;
    public final EObject ruleWhenStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_when_1_0 = null;

        EObject lv_when_stmts_3_0 = null;

        EObject lv_elsehwhen_6_0 = null;

        EObject lv_elsewhen_stmts_8_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4097:2: ( (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) )* otherlv_10= 'end' otherlv_11= 'when' ) )
            // InternalModelica.g:4098:2: (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) )* otherlv_10= 'end' otherlv_11= 'when' )
            {
            // InternalModelica.g:4098:2: (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) )* otherlv_10= 'end' otherlv_11= 'when' )
            // InternalModelica.g:4099:3: otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) )* otherlv_10= 'end' otherlv_11= 'when'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenStatementAccess().getWhenKeyword_0());
            		
            // InternalModelica.g:4103:3: ( (lv_when_1_0= ruleExpression ) )
            // InternalModelica.g:4104:4: (lv_when_1_0= ruleExpression )
            {
            // InternalModelica.g:4104:4: (lv_when_1_0= ruleExpression )
            // InternalModelica.g:4105:5: lv_when_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhenStatementAccess().getWhenExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_66);
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

            otherlv_2=(Token)match(input,68,FOLLOW_78); 

            			newLeafNode(otherlv_2, grammarAccess.getWhenStatementAccess().getThenKeyword_2());
            		
            // InternalModelica.g:4126:3: ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==RULE_IDENT||LA92_0==41||LA92_0==58||(LA92_0>=66 && LA92_0<=67)||LA92_0==71||(LA92_0>=74 && LA92_0<=75)||LA92_0==101) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalModelica.g:4127:4: ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:4127:4: ( (lv_when_stmts_3_0= ruleStatement ) )
            	    // InternalModelica.g:4128:5: (lv_when_stmts_3_0= ruleStatement )
            	    {
            	    // InternalModelica.g:4128:5: (lv_when_stmts_3_0= ruleStatement )
            	    // InternalModelica.g:4129:6: lv_when_stmts_3_0= ruleStatement
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

            	    otherlv_4=(Token)match(input,19,FOLLOW_78); 

            	    				newLeafNode(otherlv_4, grammarAccess.getWhenStatementAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            // InternalModelica.g:4151:3: (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==76) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalModelica.g:4152:4: otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )
            	    {
            	    otherlv_5=(Token)match(input,76,FOLLOW_42); 

            	    				newLeafNode(otherlv_5, grammarAccess.getWhenStatementAccess().getElsewhenKeyword_4_0());
            	    			
            	    // InternalModelica.g:4156:4: ( (lv_elsehwhen_6_0= ruleExpression ) )
            	    // InternalModelica.g:4157:5: (lv_elsehwhen_6_0= ruleExpression )
            	    {
            	    // InternalModelica.g:4157:5: (lv_elsehwhen_6_0= ruleExpression )
            	    // InternalModelica.g:4158:6: lv_elsehwhen_6_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getWhenStatementAccess().getElsehwhenExpressionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_66);
            	    lv_elsehwhen_6_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhenStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elsehwhen",
            	    							lv_elsehwhen_6_0,
            	    							"xmodelica.Modelica.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,68,FOLLOW_61); 

            	    				newLeafNode(otherlv_7, grammarAccess.getWhenStatementAccess().getThenKeyword_4_2());
            	    			
            	    // InternalModelica.g:4179:4: ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )
            	    // InternalModelica.g:4180:5: ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';'
            	    {
            	    // InternalModelica.g:4180:5: ( (lv_elsewhen_stmts_8_0= ruleStatement ) )
            	    // InternalModelica.g:4181:6: (lv_elsewhen_stmts_8_0= ruleStatement )
            	    {
            	    // InternalModelica.g:4181:6: (lv_elsewhen_stmts_8_0= ruleStatement )
            	    // InternalModelica.g:4182:7: lv_elsewhen_stmts_8_0= ruleStatement
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

            	    otherlv_9=(Token)match(input,19,FOLLOW_76); 

            	    					newLeafNode(otherlv_9, grammarAccess.getWhenStatementAccess().getSemicolonKeyword_4_3_1());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            otherlv_10=(Token)match(input,35,FOLLOW_77); 

            			newLeafNode(otherlv_10, grammarAccess.getWhenStatementAccess().getEndKeyword_5());
            		
            otherlv_11=(Token)match(input,75,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getWhenStatementAccess().getWhenKeyword_6());
            		

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


    // $ANTLR start "entryRuleConnectClause"
    // InternalModelica.g:4217:1: entryRuleConnectClause returns [EObject current=null] : iv_ruleConnectClause= ruleConnectClause EOF ;
    public final EObject entryRuleConnectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectClause = null;


        try {
            // InternalModelica.g:4217:54: (iv_ruleConnectClause= ruleConnectClause EOF )
            // InternalModelica.g:4218:2: iv_ruleConnectClause= ruleConnectClause EOF
            {
             newCompositeNode(grammarAccess.getConnectClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectClause=ruleConnectClause();

            state._fsp--;

             current =iv_ruleConnectClause; 
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
    // $ANTLR end "entryRuleConnectClause"


    // $ANTLR start "ruleConnectClause"
    // InternalModelica.g:4224:1: ruleConnectClause returns [EObject current=null] : (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponentReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponentReference ) ) otherlv_5= ')' ) ;
    public final EObject ruleConnectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4230:2: ( (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponentReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponentReference ) ) otherlv_5= ')' ) )
            // InternalModelica.g:4231:2: (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponentReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponentReference ) ) otherlv_5= ')' )
            {
            // InternalModelica.g:4231:2: (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponentReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponentReference ) ) otherlv_5= ')' )
            // InternalModelica.g:4232:3: otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponentReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponentReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectClauseAccess().getConnectKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectClauseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalModelica.g:4240:3: ( (lv_left_2_0= ruleComponentReference ) )
            // InternalModelica.g:4241:4: (lv_left_2_0= ruleComponentReference )
            {
            // InternalModelica.g:4241:4: (lv_left_2_0= ruleComponentReference )
            // InternalModelica.g:4242:5: lv_left_2_0= ruleComponentReference
            {

            					newCompositeNode(grammarAccess.getConnectClauseAccess().getLeftComponentReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_79);
            lv_left_2_0=ruleComponentReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectClauseRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"xmodelica.Modelica.ComponentReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectClauseAccess().getCommaKeyword_3());
            		
            // InternalModelica.g:4263:3: ( (lv_right_4_0= ruleComponentReference ) )
            // InternalModelica.g:4264:4: (lv_right_4_0= ruleComponentReference )
            {
            // InternalModelica.g:4264:4: (lv_right_4_0= ruleComponentReference )
            // InternalModelica.g:4265:5: lv_right_4_0= ruleComponentReference
            {

            					newCompositeNode(grammarAccess.getConnectClauseAccess().getRightComponentReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
            lv_right_4_0=ruleComponentReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectClauseRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_4_0,
            						"xmodelica.Modelica.ComponentReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectClauseAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleConnectClause"


    // $ANTLR start "entryRuleExpression"
    // InternalModelica.g:4290:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalModelica.g:4290:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalModelica.g:4291:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalModelica.g:4297:1: ruleExpression returns [EObject current=null] : (this_SimpleExpression_0= ruleSimpleExpression | (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) ) ) ;
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
            // InternalModelica.g:4303:2: ( (this_SimpleExpression_0= ruleSimpleExpression | (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) ) ) )
            // InternalModelica.g:4304:2: (this_SimpleExpression_0= ruleSimpleExpression | (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) ) )
            {
            // InternalModelica.g:4304:2: (this_SimpleExpression_0= ruleSimpleExpression | (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0>=RULE_IDENT && LA95_0<=RULE_TRUE_FALSE)||LA95_0==35||LA95_0==63||LA95_0==80||(LA95_0>=87 && LA95_0<=90)||LA95_0==96||LA95_0==98||(LA95_0>=100 && LA95_0<=101)) ) {
                alt95=1;
            }
            else if ( (LA95_0==58) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalModelica.g:4305:3: this_SimpleExpression_0= ruleSimpleExpression
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
                    // InternalModelica.g:4314:3: (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) )
                    {
                    // InternalModelica.g:4314:3: (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) )
                    // InternalModelica.g:4315:4: otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getIfKeyword_1_0());
                    			
                    // InternalModelica.g:4319:4: ( (lv_if_2_0= ruleExpression ) )
                    // InternalModelica.g:4320:5: (lv_if_2_0= ruleExpression )
                    {
                    // InternalModelica.g:4320:5: (lv_if_2_0= ruleExpression )
                    // InternalModelica.g:4321:6: lv_if_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getIfExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_66);
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

                    otherlv_3=(Token)match(input,68,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getThenKeyword_1_2());
                    			
                    // InternalModelica.g:4342:4: ( (lv_then_4_0= ruleExpression ) )
                    // InternalModelica.g:4343:5: (lv_then_4_0= ruleExpression )
                    {
                    // InternalModelica.g:4343:5: (lv_then_4_0= ruleExpression )
                    // InternalModelica.g:4344:6: lv_then_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getThenExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_80);
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

                    // InternalModelica.g:4361:4: (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==69) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalModelica.g:4362:5: otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,69,FOLLOW_42); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getElseifKeyword_1_4_0());
                    	    				
                    	    // InternalModelica.g:4366:5: ( (lv_elseif_6_0= ruleExpression ) )
                    	    // InternalModelica.g:4367:6: (lv_elseif_6_0= ruleExpression )
                    	    {
                    	    // InternalModelica.g:4367:6: (lv_elseif_6_0= ruleExpression )
                    	    // InternalModelica.g:4368:7: lv_elseif_6_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getElseifExpressionParserRuleCall_1_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_66);
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

                    	    otherlv_7=(Token)match(input,68,FOLLOW_42); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getThenKeyword_1_4_2());
                    	    				
                    	    // InternalModelica.g:4389:5: ( (lv_elseifthen_8_0= ruleExpression ) )
                    	    // InternalModelica.g:4390:6: (lv_elseifthen_8_0= ruleExpression )
                    	    {
                    	    // InternalModelica.g:4390:6: (lv_elseifthen_8_0= ruleExpression )
                    	    // InternalModelica.g:4391:7: lv_elseifthen_8_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getElseifthenExpressionParserRuleCall_1_4_3_0());
                    	    						
                    	    pushFollow(FOLLOW_80);
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
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,70,FOLLOW_42); 

                    				newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getElseKeyword_1_5());
                    			
                    // InternalModelica.g:4413:4: ( (lv_else_10_0= ruleExpression ) )
                    // InternalModelica.g:4414:5: (lv_else_10_0= ruleExpression )
                    {
                    // InternalModelica.g:4414:5: (lv_else_10_0= ruleExpression )
                    // InternalModelica.g:4415:6: lv_else_10_0= ruleExpression
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
    // InternalModelica.g:4437:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // InternalModelica.g:4437:57: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // InternalModelica.g:4438:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
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
    // InternalModelica.g:4444:1: ruleSimpleExpression returns [EObject current=null] : (this_LogicalExpression_0= ruleLogicalExpression (otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )? )? ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_LogicalExpression_0 = null;

        EObject lv_exprs_3_0 = null;

        EObject lv_exprs_5_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4450:2: ( (this_LogicalExpression_0= ruleLogicalExpression (otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )? )? ) )
            // InternalModelica.g:4451:2: (this_LogicalExpression_0= ruleLogicalExpression (otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )? )? )
            {
            // InternalModelica.g:4451:2: (this_LogicalExpression_0= ruleLogicalExpression (otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )? )? )
            // InternalModelica.g:4452:3: this_LogicalExpression_0= ruleLogicalExpression (otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )? )?
            {

            			newCompositeNode(grammarAccess.getSimpleExpressionAccess().getLogicalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_81);
            this_LogicalExpression_0=ruleLogicalExpression();

            state._fsp--;


            			current = this_LogicalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:4460:3: (otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )? )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==62) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalModelica.g:4461:4: otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )?
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_82); 

                    				newLeafNode(otherlv_1, grammarAccess.getSimpleExpressionAccess().getColonKeyword_1_0());
                    			
                    // InternalModelica.g:4465:4: ()
                    // InternalModelica.g:4466:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getSimpleExpressionAccess().getSimpleExpressionExprsAction_1_1(),
                    						current);
                    				

                    }

                    // InternalModelica.g:4472:4: ( (lv_exprs_3_0= ruleLogicalExpression ) )
                    // InternalModelica.g:4473:5: (lv_exprs_3_0= ruleLogicalExpression )
                    {
                    // InternalModelica.g:4473:5: (lv_exprs_3_0= ruleLogicalExpression )
                    // InternalModelica.g:4474:6: lv_exprs_3_0= ruleLogicalExpression
                    {

                    						newCompositeNode(grammarAccess.getSimpleExpressionAccess().getExprsLogicalExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_81);
                    lv_exprs_3_0=ruleLogicalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
                    						}
                    						add(
                    							current,
                    							"exprs",
                    							lv_exprs_3_0,
                    							"xmodelica.Modelica.LogicalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelica.g:4491:4: (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==62) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // InternalModelica.g:4492:5: otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) )
                            {
                            otherlv_4=(Token)match(input,62,FOLLOW_82); 

                            					newLeafNode(otherlv_4, grammarAccess.getSimpleExpressionAccess().getColonKeyword_1_3_0());
                            				
                            // InternalModelica.g:4496:5: ( (lv_exprs_5_0= ruleLogicalExpression ) )
                            // InternalModelica.g:4497:6: (lv_exprs_5_0= ruleLogicalExpression )
                            {
                            // InternalModelica.g:4497:6: (lv_exprs_5_0= ruleLogicalExpression )
                            // InternalModelica.g:4498:7: lv_exprs_5_0= ruleLogicalExpression
                            {

                            							newCompositeNode(grammarAccess.getSimpleExpressionAccess().getExprsLogicalExpressionParserRuleCall_1_3_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_exprs_5_0=ruleLogicalExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
                            							}
                            							add(
                            								current,
                            								"exprs",
                            								lv_exprs_5_0,
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
    // InternalModelica.g:4521:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // InternalModelica.g:4521:58: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // InternalModelica.g:4522:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
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
    // InternalModelica.g:4528:1: ruleLogicalExpression returns [EObject current=null] : (this_LogicalTerm_0= ruleLogicalTerm ( () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) ) )* ) ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalTerm_0 = null;

        EObject lv_terms_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4534:2: ( (this_LogicalTerm_0= ruleLogicalTerm ( () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) ) )* ) )
            // InternalModelica.g:4535:2: (this_LogicalTerm_0= ruleLogicalTerm ( () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) ) )* )
            {
            // InternalModelica.g:4535:2: (this_LogicalTerm_0= ruleLogicalTerm ( () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) ) )* )
            // InternalModelica.g:4536:3: this_LogicalTerm_0= ruleLogicalTerm ( () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLogicalTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_83);
            this_LogicalTerm_0=ruleLogicalTerm();

            state._fsp--;


            			current = this_LogicalTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:4544:3: ( () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==78) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalModelica.g:4545:4: () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) )
            	    {
            	    // InternalModelica.g:4545:4: ()
            	    // InternalModelica.g:4546:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getLogicalExpressionAccess().getLogicalExpressionTermsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,78,FOLLOW_82); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLogicalExpressionAccess().getOrKeyword_1_1());
            	    			
            	    // InternalModelica.g:4556:4: ( (lv_terms_3_0= ruleLogicalTerm ) )
            	    // InternalModelica.g:4557:5: (lv_terms_3_0= ruleLogicalTerm )
            	    {
            	    // InternalModelica.g:4557:5: (lv_terms_3_0= ruleLogicalTerm )
            	    // InternalModelica.g:4558:6: lv_terms_3_0= ruleLogicalTerm
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalExpressionAccess().getTermsLogicalTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_83);
            	    lv_terms_3_0=ruleLogicalTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terms",
            	    							lv_terms_3_0,
            	    							"xmodelica.Modelica.LogicalTerm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
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
    // InternalModelica.g:4580:1: entryRuleLogicalTerm returns [EObject current=null] : iv_ruleLogicalTerm= ruleLogicalTerm EOF ;
    public final EObject entryRuleLogicalTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalTerm = null;


        try {
            // InternalModelica.g:4580:52: (iv_ruleLogicalTerm= ruleLogicalTerm EOF )
            // InternalModelica.g:4581:2: iv_ruleLogicalTerm= ruleLogicalTerm EOF
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
    // InternalModelica.g:4587:1: ruleLogicalTerm returns [EObject current=null] : (this_LogicalFactor_0= ruleLogicalFactor ( () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) ) )* ) ;
    public final EObject ruleLogicalTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalFactor_0 = null;

        EObject lv_factors_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4593:2: ( (this_LogicalFactor_0= ruleLogicalFactor ( () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) ) )* ) )
            // InternalModelica.g:4594:2: (this_LogicalFactor_0= ruleLogicalFactor ( () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) ) )* )
            {
            // InternalModelica.g:4594:2: (this_LogicalFactor_0= ruleLogicalFactor ( () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) ) )* )
            // InternalModelica.g:4595:3: this_LogicalFactor_0= ruleLogicalFactor ( () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalTermAccess().getLogicalFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_84);
            this_LogicalFactor_0=ruleLogicalFactor();

            state._fsp--;


            			current = this_LogicalFactor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:4603:3: ( () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==79) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalModelica.g:4604:4: () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) )
            	    {
            	    // InternalModelica.g:4604:4: ()
            	    // InternalModelica.g:4605:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getLogicalTermAccess().getLogicalFactorFactorsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,79,FOLLOW_82); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLogicalTermAccess().getAndKeyword_1_1());
            	    			
            	    // InternalModelica.g:4615:4: ( (lv_factors_3_0= ruleLogicalFactor ) )
            	    // InternalModelica.g:4616:5: (lv_factors_3_0= ruleLogicalFactor )
            	    {
            	    // InternalModelica.g:4616:5: (lv_factors_3_0= ruleLogicalFactor )
            	    // InternalModelica.g:4617:6: lv_factors_3_0= ruleLogicalFactor
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalTermAccess().getFactorsLogicalFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_84);
            	    lv_factors_3_0=ruleLogicalFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"factors",
            	    							lv_factors_3_0,
            	    							"xmodelica.Modelica.LogicalFactor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
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
    // InternalModelica.g:4639:1: entryRuleLogicalFactor returns [EObject current=null] : iv_ruleLogicalFactor= ruleLogicalFactor EOF ;
    public final EObject entryRuleLogicalFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalFactor = null;


        try {
            // InternalModelica.g:4639:54: (iv_ruleLogicalFactor= ruleLogicalFactor EOF )
            // InternalModelica.g:4640:2: iv_ruleLogicalFactor= ruleLogicalFactor EOF
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
    // InternalModelica.g:4646:1: ruleLogicalFactor returns [EObject current=null] : (this_Relation_0= ruleRelation | ( ( (lv_not_1_0= 'not' ) ) ( (lv_rel_2_0= ruleRelation ) ) ) ) ;
    public final EObject ruleLogicalFactor() throws RecognitionException {
        EObject current = null;

        Token lv_not_1_0=null;
        EObject this_Relation_0 = null;

        EObject lv_rel_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4652:2: ( (this_Relation_0= ruleRelation | ( ( (lv_not_1_0= 'not' ) ) ( (lv_rel_2_0= ruleRelation ) ) ) ) )
            // InternalModelica.g:4653:2: (this_Relation_0= ruleRelation | ( ( (lv_not_1_0= 'not' ) ) ( (lv_rel_2_0= ruleRelation ) ) ) )
            {
            // InternalModelica.g:4653:2: (this_Relation_0= ruleRelation | ( ( (lv_not_1_0= 'not' ) ) ( (lv_rel_2_0= ruleRelation ) ) ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=RULE_IDENT && LA100_0<=RULE_TRUE_FALSE)||LA100_0==35||LA100_0==63||(LA100_0>=87 && LA100_0<=90)||LA100_0==96||LA100_0==98||(LA100_0>=100 && LA100_0<=101)) ) {
                alt100=1;
            }
            else if ( (LA100_0==80) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalModelica.g:4654:3: this_Relation_0= ruleRelation
                    {

                    			newCompositeNode(grammarAccess.getLogicalFactorAccess().getRelationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relation_0=ruleRelation();

                    state._fsp--;


                    			current = this_Relation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:4663:3: ( ( (lv_not_1_0= 'not' ) ) ( (lv_rel_2_0= ruleRelation ) ) )
                    {
                    // InternalModelica.g:4663:3: ( ( (lv_not_1_0= 'not' ) ) ( (lv_rel_2_0= ruleRelation ) ) )
                    // InternalModelica.g:4664:4: ( (lv_not_1_0= 'not' ) ) ( (lv_rel_2_0= ruleRelation ) )
                    {
                    // InternalModelica.g:4664:4: ( (lv_not_1_0= 'not' ) )
                    // InternalModelica.g:4665:5: (lv_not_1_0= 'not' )
                    {
                    // InternalModelica.g:4665:5: (lv_not_1_0= 'not' )
                    // InternalModelica.g:4666:6: lv_not_1_0= 'not'
                    {
                    lv_not_1_0=(Token)match(input,80,FOLLOW_85); 

                    						newLeafNode(lv_not_1_0, grammarAccess.getLogicalFactorAccess().getNotNotKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalFactorRule());
                    						}
                    						setWithLastConsumed(current, "not", true, "not");
                    					

                    }


                    }

                    // InternalModelica.g:4678:4: ( (lv_rel_2_0= ruleRelation ) )
                    // InternalModelica.g:4679:5: (lv_rel_2_0= ruleRelation )
                    {
                    // InternalModelica.g:4679:5: (lv_rel_2_0= ruleRelation )
                    // InternalModelica.g:4680:6: lv_rel_2_0= ruleRelation
                    {

                    						newCompositeNode(grammarAccess.getLogicalFactorAccess().getRelRelationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rel_2_0=ruleRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalFactorRule());
                    						}
                    						set(
                    							current,
                    							"rel",
                    							lv_rel_2_0,
                    							"xmodelica.Modelica.Relation");
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
    // $ANTLR end "ruleLogicalFactor"


    // $ANTLR start "entryRuleRelation"
    // InternalModelica.g:4702:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalModelica.g:4702:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalModelica.g:4703:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalModelica.g:4709:1: ruleRelation returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_rel_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )? ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;

        AntlrDatatypeRuleToken lv_rel_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4715:2: ( (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_rel_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )? ) )
            // InternalModelica.g:4716:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_rel_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )? )
            {
            // InternalModelica.g:4716:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_rel_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )? )
            // InternalModelica.g:4717:3: this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_rel_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getRelationAccess().getArithmeticExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_86);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;


            			current = this_ArithmeticExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:4725:3: ( () ( (lv_rel_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( ((LA101_0>=81 && LA101_0<=86)) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalModelica.g:4726:4: () ( (lv_rel_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) )
                    {
                    // InternalModelica.g:4726:4: ()
                    // InternalModelica.g:4727:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getRelationAccess().getRelationLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalModelica.g:4733:4: ( (lv_rel_op_2_0= ruleRelOp ) )
                    // InternalModelica.g:4734:5: (lv_rel_op_2_0= ruleRelOp )
                    {
                    // InternalModelica.g:4734:5: (lv_rel_op_2_0= ruleRelOp )
                    // InternalModelica.g:4735:6: lv_rel_op_2_0= ruleRelOp
                    {

                    						newCompositeNode(grammarAccess.getRelationAccess().getRel_opRelOpParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_85);
                    lv_rel_op_2_0=ruleRelOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    						}
                    						set(
                    							current,
                    							"rel_op",
                    							lv_rel_op_2_0,
                    							"xmodelica.Modelica.RelOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelica.g:4752:4: ( (lv_right_3_0= ruleArithmeticExpression ) )
                    // InternalModelica.g:4753:5: (lv_right_3_0= ruleArithmeticExpression )
                    {
                    // InternalModelica.g:4753:5: (lv_right_3_0= ruleArithmeticExpression )
                    // InternalModelica.g:4754:6: lv_right_3_0= ruleArithmeticExpression
                    {

                    						newCompositeNode(grammarAccess.getRelationAccess().getRightArithmeticExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleArithmeticExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
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
    // InternalModelica.g:4776:1: entryRuleRelOp returns [String current=null] : iv_ruleRelOp= ruleRelOp EOF ;
    public final String entryRuleRelOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelOp = null;


        try {
            // InternalModelica.g:4776:45: (iv_ruleRelOp= ruleRelOp EOF )
            // InternalModelica.g:4777:2: iv_ruleRelOp= ruleRelOp EOF
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
    // InternalModelica.g:4783:1: ruleRelOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken ruleRelOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:4789:2: ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) )
            // InternalModelica.g:4790:2: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' )
            {
            // InternalModelica.g:4790:2: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' )
            int alt102=6;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt102=1;
                }
                break;
            case 82:
                {
                alt102=2;
                }
                break;
            case 83:
                {
                alt102=3;
                }
                break;
            case 84:
                {
                alt102=4;
                }
                break;
            case 85:
                {
                alt102=5;
                }
                break;
            case 86:
                {
                alt102=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalModelica.g:4791:3: kw= '<'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:4797:3: kw= '<='
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelica.g:4803:3: kw= '>'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalModelica.g:4809:3: kw= '>='
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalModelica.g:4815:3: kw= '=='
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getEqualsSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalModelica.g:4821:3: kw= '<>'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

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
    // InternalModelica.g:4830:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalModelica.g:4830:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalModelica.g:4831:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
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
    // InternalModelica.g:4837:1: ruleArithmeticExpression returns [EObject current=null] : (this_Negation_0= ruleNegation ( () ( (lv_add_op_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleNegation ) ) )* ) ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        AntlrDatatypeRuleToken lv_add_op_2_0 = null;

        EObject lv_terms_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4843:2: ( (this_Negation_0= ruleNegation ( () ( (lv_add_op_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleNegation ) ) )* ) )
            // InternalModelica.g:4844:2: (this_Negation_0= ruleNegation ( () ( (lv_add_op_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleNegation ) ) )* )
            {
            // InternalModelica.g:4844:2: (this_Negation_0= ruleNegation ( () ( (lv_add_op_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleNegation ) ) )* )
            // InternalModelica.g:4845:3: this_Negation_0= ruleNegation ( () ( (lv_add_op_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleNegation ) ) )*
            {

            			newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_87);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:4853:3: ( () ( (lv_add_op_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleNegation ) ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( ((LA103_0>=87 && LA103_0<=90)) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalModelica.g:4854:4: () ( (lv_add_op_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleNegation ) )
            	    {
            	    // InternalModelica.g:4854:4: ()
            	    // InternalModelica.g:4855:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getArithmeticExpressionAccess().getArithmeticExpressionTermsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalModelica.g:4861:4: ( (lv_add_op_2_0= ruleAddOp ) )
            	    // InternalModelica.g:4862:5: (lv_add_op_2_0= ruleAddOp )
            	    {
            	    // InternalModelica.g:4862:5: (lv_add_op_2_0= ruleAddOp )
            	    // InternalModelica.g:4863:6: lv_add_op_2_0= ruleAddOp
            	    {

            	    						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdd_opAddOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_85);
            	    lv_add_op_2_0=ruleAddOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"add_op",
            	    							lv_add_op_2_0,
            	    							"xmodelica.Modelica.AddOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalModelica.g:4880:4: ( (lv_terms_3_0= ruleNegation ) )
            	    // InternalModelica.g:4881:5: (lv_terms_3_0= ruleNegation )
            	    {
            	    // InternalModelica.g:4881:5: (lv_terms_3_0= ruleNegation )
            	    // InternalModelica.g:4882:6: lv_terms_3_0= ruleNegation
            	    {

            	    						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getTermsNegationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_87);
            	    lv_terms_3_0=ruleNegation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terms",
            	    							lv_terms_3_0,
            	    							"xmodelica.Modelica.Negation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
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


    // $ANTLR start "entryRuleNegation"
    // InternalModelica.g:4904:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalModelica.g:4904:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalModelica.g:4905:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalModelica.g:4911:1: ruleNegation returns [EObject current=null] : (this_Term_0= ruleTerm | ( ( (lv_neg_op_1_0= ruleAddOp ) ) ( (lv_term_2_0= ruleTerm ) ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;

        AntlrDatatypeRuleToken lv_neg_op_1_0 = null;

        EObject lv_term_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4917:2: ( (this_Term_0= ruleTerm | ( ( (lv_neg_op_1_0= ruleAddOp ) ) ( (lv_term_2_0= ruleTerm ) ) ) ) )
            // InternalModelica.g:4918:2: (this_Term_0= ruleTerm | ( ( (lv_neg_op_1_0= ruleAddOp ) ) ( (lv_term_2_0= ruleTerm ) ) ) )
            {
            // InternalModelica.g:4918:2: (this_Term_0= ruleTerm | ( ( (lv_neg_op_1_0= ruleAddOp ) ) ( (lv_term_2_0= ruleTerm ) ) ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=RULE_IDENT && LA104_0<=RULE_TRUE_FALSE)||LA104_0==35||LA104_0==63||LA104_0==96||LA104_0==98||(LA104_0>=100 && LA104_0<=101)) ) {
                alt104=1;
            }
            else if ( ((LA104_0>=87 && LA104_0<=90)) ) {
                alt104=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalModelica.g:4919:3: this_Term_0= ruleTerm
                    {

                    			newCompositeNode(grammarAccess.getNegationAccess().getTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Term_0=ruleTerm();

                    state._fsp--;


                    			current = this_Term_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:4928:3: ( ( (lv_neg_op_1_0= ruleAddOp ) ) ( (lv_term_2_0= ruleTerm ) ) )
                    {
                    // InternalModelica.g:4928:3: ( ( (lv_neg_op_1_0= ruleAddOp ) ) ( (lv_term_2_0= ruleTerm ) ) )
                    // InternalModelica.g:4929:4: ( (lv_neg_op_1_0= ruleAddOp ) ) ( (lv_term_2_0= ruleTerm ) )
                    {
                    // InternalModelica.g:4929:4: ( (lv_neg_op_1_0= ruleAddOp ) )
                    // InternalModelica.g:4930:5: (lv_neg_op_1_0= ruleAddOp )
                    {
                    // InternalModelica.g:4930:5: (lv_neg_op_1_0= ruleAddOp )
                    // InternalModelica.g:4931:6: lv_neg_op_1_0= ruleAddOp
                    {

                    						newCompositeNode(grammarAccess.getNegationAccess().getNeg_opAddOpParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_88);
                    lv_neg_op_1_0=ruleAddOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNegationRule());
                    						}
                    						set(
                    							current,
                    							"neg_op",
                    							lv_neg_op_1_0,
                    							"xmodelica.Modelica.AddOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelica.g:4948:4: ( (lv_term_2_0= ruleTerm ) )
                    // InternalModelica.g:4949:5: (lv_term_2_0= ruleTerm )
                    {
                    // InternalModelica.g:4949:5: (lv_term_2_0= ruleTerm )
                    // InternalModelica.g:4950:6: lv_term_2_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getNegationAccess().getTermTermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_term_2_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNegationRule());
                    						}
                    						set(
                    							current,
                    							"term",
                    							lv_term_2_0,
                    							"xmodelica.Modelica.Term");
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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleAddOp"
    // InternalModelica.g:4972:1: entryRuleAddOp returns [String current=null] : iv_ruleAddOp= ruleAddOp EOF ;
    public final String entryRuleAddOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddOp = null;


        try {
            // InternalModelica.g:4972:45: (iv_ruleAddOp= ruleAddOp EOF )
            // InternalModelica.g:4973:2: iv_ruleAddOp= ruleAddOp EOF
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
    // InternalModelica.g:4979:1: ruleAddOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) ;
    public final AntlrDatatypeRuleToken ruleAddOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:4985:2: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) )
            // InternalModelica.g:4986:2: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )
            {
            // InternalModelica.g:4986:2: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )
            int alt105=4;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt105=1;
                }
                break;
            case 88:
                {
                alt105=2;
                }
                break;
            case 89:
                {
                alt105=3;
                }
                break;
            case 90:
                {
                alt105=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // InternalModelica.g:4987:3: kw= '+'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAddOpAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:4993:3: kw= '-'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAddOpAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelica.g:4999:3: kw= '.+'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAddOpAccess().getFullStopPlusSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalModelica.g:5005:3: kw= '.-'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

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
    // InternalModelica.g:5014:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalModelica.g:5014:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalModelica.g:5015:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalModelica.g:5021:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_mul_op_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Factor_0 = null;

        AntlrDatatypeRuleToken lv_mul_op_2_0 = null;

        EObject lv_factors_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5027:2: ( (this_Factor_0= ruleFactor ( () ( (lv_mul_op_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) ) )* ) )
            // InternalModelica.g:5028:2: (this_Factor_0= ruleFactor ( () ( (lv_mul_op_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) ) )* )
            {
            // InternalModelica.g:5028:2: (this_Factor_0= ruleFactor ( () ( (lv_mul_op_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) ) )* )
            // InternalModelica.g:5029:3: this_Factor_0= ruleFactor ( () ( (lv_mul_op_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_89);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:5037:3: ( () ( (lv_mul_op_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) ) )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==48||(LA106_0>=91 && LA106_0<=93)) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // InternalModelica.g:5038:4: () ( (lv_mul_op_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) )
            	    {
            	    // InternalModelica.g:5038:4: ()
            	    // InternalModelica.g:5039:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getTermAccess().getTermFactorsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalModelica.g:5045:4: ( (lv_mul_op_2_0= ruleMulOp ) )
            	    // InternalModelica.g:5046:5: (lv_mul_op_2_0= ruleMulOp )
            	    {
            	    // InternalModelica.g:5046:5: (lv_mul_op_2_0= ruleMulOp )
            	    // InternalModelica.g:5047:6: lv_mul_op_2_0= ruleMulOp
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getMul_opMulOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_88);
            	    lv_mul_op_2_0=ruleMulOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"mul_op",
            	    							lv_mul_op_2_0,
            	    							"xmodelica.Modelica.MulOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalModelica.g:5064:4: ( (lv_factors_3_0= ruleFactor ) )
            	    // InternalModelica.g:5065:5: (lv_factors_3_0= ruleFactor )
            	    {
            	    // InternalModelica.g:5065:5: (lv_factors_3_0= ruleFactor )
            	    // InternalModelica.g:5066:6: lv_factors_3_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_89);
            	    lv_factors_3_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"factors",
            	    							lv_factors_3_0,
            	    							"xmodelica.Modelica.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop106;
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
    // InternalModelica.g:5088:1: entryRuleMulOp returns [String current=null] : iv_ruleMulOp= ruleMulOp EOF ;
    public final String entryRuleMulOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMulOp = null;


        try {
            // InternalModelica.g:5088:45: (iv_ruleMulOp= ruleMulOp EOF )
            // InternalModelica.g:5089:2: iv_ruleMulOp= ruleMulOp EOF
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
    // InternalModelica.g:5095:1: ruleMulOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '.*' | kw= './' ) ;
    public final AntlrDatatypeRuleToken ruleMulOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:5101:2: ( (kw= '*' | kw= '/' | kw= '.*' | kw= './' ) )
            // InternalModelica.g:5102:2: (kw= '*' | kw= '/' | kw= '.*' | kw= './' )
            {
            // InternalModelica.g:5102:2: (kw= '*' | kw= '/' | kw= '.*' | kw= './' )
            int alt107=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt107=1;
                }
                break;
            case 91:
                {
                alt107=2;
                }
                break;
            case 92:
                {
                alt107=3;
                }
                break;
            case 93:
                {
                alt107=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalModelica.g:5103:3: kw= '*'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMulOpAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:5109:3: kw= '/'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMulOpAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelica.g:5115:3: kw= '.*'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMulOpAccess().getFullStopAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalModelica.g:5121:3: kw= './'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

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
    // InternalModelica.g:5130:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalModelica.g:5130:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalModelica.g:5131:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalModelica.g:5137:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) ) )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5143:2: ( (this_Primary_0= rulePrimary ( () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) ) )? ) )
            // InternalModelica.g:5144:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) ) )? )
            {
            // InternalModelica.g:5144:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) ) )? )
            // InternalModelica.g:5145:3: this_Primary_0= rulePrimary ( () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) ) )?
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_90);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:5153:3: ( () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( ((LA109_0>=94 && LA109_0<=95)) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalModelica.g:5154:4: () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) )
                    {
                    // InternalModelica.g:5154:4: ()
                    // InternalModelica.g:5155:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getFactorAccess().getFactorBaseAction_1_0(),
                    						current);
                    				

                    }

                    // InternalModelica.g:5161:4: (otherlv_2= '^' | otherlv_3= '.^' )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==94) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==95) ) {
                        alt108=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 0, input);

                        throw nvae;
                    }
                    switch (alt108) {
                        case 1 :
                            // InternalModelica.g:5162:5: otherlv_2= '^'
                            {
                            otherlv_2=(Token)match(input,94,FOLLOW_88); 

                            					newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getCircumflexAccentKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalModelica.g:5167:5: otherlv_3= '.^'
                            {
                            otherlv_3=(Token)match(input,95,FOLLOW_88); 

                            					newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getFullStopCircumflexAccentKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:5172:4: ( (lv_exp_4_0= rulePrimary ) )
                    // InternalModelica.g:5173:5: (lv_exp_4_0= rulePrimary )
                    {
                    // InternalModelica.g:5173:5: (lv_exp_4_0= rulePrimary )
                    // InternalModelica.g:5174:6: lv_exp_4_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExpPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_4_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_4_0,
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


    // $ANTLR start "entryRuleFloatPrimary"
    // InternalModelica.g:5196:1: entryRuleFloatPrimary returns [EObject current=null] : iv_ruleFloatPrimary= ruleFloatPrimary EOF ;
    public final EObject entryRuleFloatPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatPrimary = null;


        try {
            // InternalModelica.g:5196:53: (iv_ruleFloatPrimary= ruleFloatPrimary EOF )
            // InternalModelica.g:5197:2: iv_ruleFloatPrimary= ruleFloatPrimary EOF
            {
             newCompositeNode(grammarAccess.getFloatPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatPrimary=ruleFloatPrimary();

            state._fsp--;

             current =iv_ruleFloatPrimary; 
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
    // $ANTLR end "entryRuleFloatPrimary"


    // $ANTLR start "ruleFloatPrimary"
    // InternalModelica.g:5203:1: ruleFloatPrimary returns [EObject current=null] : ( (lv_val_0_0= RULE_UNSIGNED_NUMBER ) ) ;
    public final EObject ruleFloatPrimary() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalModelica.g:5209:2: ( ( (lv_val_0_0= RULE_UNSIGNED_NUMBER ) ) )
            // InternalModelica.g:5210:2: ( (lv_val_0_0= RULE_UNSIGNED_NUMBER ) )
            {
            // InternalModelica.g:5210:2: ( (lv_val_0_0= RULE_UNSIGNED_NUMBER ) )
            // InternalModelica.g:5211:3: (lv_val_0_0= RULE_UNSIGNED_NUMBER )
            {
            // InternalModelica.g:5211:3: (lv_val_0_0= RULE_UNSIGNED_NUMBER )
            // InternalModelica.g:5212:4: lv_val_0_0= RULE_UNSIGNED_NUMBER
            {
            lv_val_0_0=(Token)match(input,RULE_UNSIGNED_NUMBER,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getFloatPrimaryAccess().getValUNSIGNED_NUMBERTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFloatPrimaryRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"xmodelica.Modelica.UNSIGNED_NUMBER");
            			

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
    // $ANTLR end "ruleFloatPrimary"


    // $ANTLR start "entryRuleStringPrimary"
    // InternalModelica.g:5231:1: entryRuleStringPrimary returns [EObject current=null] : iv_ruleStringPrimary= ruleStringPrimary EOF ;
    public final EObject entryRuleStringPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPrimary = null;


        try {
            // InternalModelica.g:5231:54: (iv_ruleStringPrimary= ruleStringPrimary EOF )
            // InternalModelica.g:5232:2: iv_ruleStringPrimary= ruleStringPrimary EOF
            {
             newCompositeNode(grammarAccess.getStringPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringPrimary=ruleStringPrimary();

            state._fsp--;

             current =iv_ruleStringPrimary; 
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
    // $ANTLR end "entryRuleStringPrimary"


    // $ANTLR start "ruleStringPrimary"
    // InternalModelica.g:5238:1: ruleStringPrimary returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringPrimary() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalModelica.g:5244:2: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalModelica.g:5245:2: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalModelica.g:5245:2: ( (lv_val_0_0= RULE_STRING ) )
            // InternalModelica.g:5246:3: (lv_val_0_0= RULE_STRING )
            {
            // InternalModelica.g:5246:3: (lv_val_0_0= RULE_STRING )
            // InternalModelica.g:5247:4: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getStringPrimaryAccess().getValSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringPrimaryRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"xmodelica.Modelica.STRING");
            			

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
    // $ANTLR end "ruleStringPrimary"


    // $ANTLR start "entryRuleLogicalPrimary"
    // InternalModelica.g:5266:1: entryRuleLogicalPrimary returns [EObject current=null] : iv_ruleLogicalPrimary= ruleLogicalPrimary EOF ;
    public final EObject entryRuleLogicalPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalPrimary = null;


        try {
            // InternalModelica.g:5266:55: (iv_ruleLogicalPrimary= ruleLogicalPrimary EOF )
            // InternalModelica.g:5267:2: iv_ruleLogicalPrimary= ruleLogicalPrimary EOF
            {
             newCompositeNode(grammarAccess.getLogicalPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalPrimary=ruleLogicalPrimary();

            state._fsp--;

             current =iv_ruleLogicalPrimary; 
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
    // $ANTLR end "entryRuleLogicalPrimary"


    // $ANTLR start "ruleLogicalPrimary"
    // InternalModelica.g:5273:1: ruleLogicalPrimary returns [EObject current=null] : ( (lv_val_0_0= RULE_TRUE_FALSE ) ) ;
    public final EObject ruleLogicalPrimary() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalModelica.g:5279:2: ( ( (lv_val_0_0= RULE_TRUE_FALSE ) ) )
            // InternalModelica.g:5280:2: ( (lv_val_0_0= RULE_TRUE_FALSE ) )
            {
            // InternalModelica.g:5280:2: ( (lv_val_0_0= RULE_TRUE_FALSE ) )
            // InternalModelica.g:5281:3: (lv_val_0_0= RULE_TRUE_FALSE )
            {
            // InternalModelica.g:5281:3: (lv_val_0_0= RULE_TRUE_FALSE )
            // InternalModelica.g:5282:4: lv_val_0_0= RULE_TRUE_FALSE
            {
            lv_val_0_0=(Token)match(input,RULE_TRUE_FALSE,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getLogicalPrimaryAccess().getValTRUE_FALSETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLogicalPrimaryRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"xmodelica.Modelica.TRUE_FALSE");
            			

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
    // $ANTLR end "ruleLogicalPrimary"


    // $ANTLR start "entryRuleEnd"
    // InternalModelica.g:5301:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalModelica.g:5301:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalModelica.g:5302:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
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
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalModelica.g:5308:1: ruleEnd returns [EObject current=null] : ( (lv_val_0_0= 'end' ) ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalModelica.g:5314:2: ( ( (lv_val_0_0= 'end' ) ) )
            // InternalModelica.g:5315:2: ( (lv_val_0_0= 'end' ) )
            {
            // InternalModelica.g:5315:2: ( (lv_val_0_0= 'end' ) )
            // InternalModelica.g:5316:3: (lv_val_0_0= 'end' )
            {
            // InternalModelica.g:5316:3: (lv_val_0_0= 'end' )
            // InternalModelica.g:5317:4: lv_val_0_0= 'end'
            {
            lv_val_0_0=(Token)match(input,35,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getEndAccess().getValEndKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEndRule());
            				}
            				setWithLastConsumed(current, "val", lv_val_0_0, "end");
            			

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
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRulePrimary"
    // InternalModelica.g:5332:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalModelica.g:5332:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalModelica.g:5333:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalModelica.g:5339:1: rulePrimary returns [EObject current=null] : (this_FloatPrimary_0= ruleFloatPrimary | this_StringPrimary_1= ruleStringPrimary | this_LogicalPrimary_2= ruleLogicalPrimary | this_FunctionCall_3= ruleFunctionCall | this_ComponentReference_4= ruleComponentReference | (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' ) | (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' ) | this_End_13= ruleEnd ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_FloatPrimary_0 = null;

        EObject this_StringPrimary_1 = null;

        EObject this_LogicalPrimary_2 = null;

        EObject this_FunctionCall_3 = null;

        EObject this_ComponentReference_4 = null;

        EObject lv_res_6_0 = null;

        EObject lv_res_8_0 = null;

        EObject this_FunctionArguments_11 = null;

        EObject this_End_13 = null;



        	enterRule();

        try {
            // InternalModelica.g:5345:2: ( (this_FloatPrimary_0= ruleFloatPrimary | this_StringPrimary_1= ruleStringPrimary | this_LogicalPrimary_2= ruleLogicalPrimary | this_FunctionCall_3= ruleFunctionCall | this_ComponentReference_4= ruleComponentReference | (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' ) | (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' ) | this_End_13= ruleEnd ) )
            // InternalModelica.g:5346:2: (this_FloatPrimary_0= ruleFloatPrimary | this_StringPrimary_1= ruleStringPrimary | this_LogicalPrimary_2= ruleLogicalPrimary | this_FunctionCall_3= ruleFunctionCall | this_ComponentReference_4= ruleComponentReference | (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' ) | (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' ) | this_End_13= ruleEnd )
            {
            // InternalModelica.g:5346:2: (this_FloatPrimary_0= ruleFloatPrimary | this_StringPrimary_1= ruleStringPrimary | this_LogicalPrimary_2= ruleLogicalPrimary | this_FunctionCall_3= ruleFunctionCall | this_ComponentReference_4= ruleComponentReference | (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' ) | (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' ) | this_End_13= ruleEnd )
            int alt111=8;
            alt111 = dfa111.predict(input);
            switch (alt111) {
                case 1 :
                    // InternalModelica.g:5347:3: this_FloatPrimary_0= ruleFloatPrimary
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getFloatPrimaryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatPrimary_0=ruleFloatPrimary();

                    state._fsp--;


                    			current = this_FloatPrimary_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:5356:3: this_StringPrimary_1= ruleStringPrimary
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getStringPrimaryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringPrimary_1=ruleStringPrimary();

                    state._fsp--;


                    			current = this_StringPrimary_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalModelica.g:5365:3: this_LogicalPrimary_2= ruleLogicalPrimary
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLogicalPrimaryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalPrimary_2=ruleLogicalPrimary();

                    state._fsp--;


                    			current = this_LogicalPrimary_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalModelica.g:5374:3: this_FunctionCall_3= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getFunctionCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_3=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalModelica.g:5383:3: this_ComponentReference_4= ruleComponentReference
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getComponentReferenceParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentReference_4=ruleComponentReference();

                    state._fsp--;


                    			current = this_ComponentReference_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalModelica.g:5392:3: (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' )
                    {
                    // InternalModelica.g:5392:3: (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' )
                    // InternalModelica.g:5393:4: otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,96,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalModelica.g:5397:4: ( (lv_res_6_0= ruleExpressionList ) )
                    // InternalModelica.g:5398:5: (lv_res_6_0= ruleExpressionList )
                    {
                    // InternalModelica.g:5398:5: (lv_res_6_0= ruleExpressionList )
                    // InternalModelica.g:5399:6: lv_res_6_0= ruleExpressionList
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getResExpressionListParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_91);
                    lv_res_6_0=ruleExpressionList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						add(
                    							current,
                    							"res",
                    							lv_res_6_0,
                    							"xmodelica.Modelica.ExpressionList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelica.g:5416:4: (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==19) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // InternalModelica.g:5417:5: otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FOLLOW_42); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getSemicolonKeyword_5_2_0());
                    	    				
                    	    // InternalModelica.g:5421:5: ( (lv_res_8_0= ruleExpressionList ) )
                    	    // InternalModelica.g:5422:6: (lv_res_8_0= ruleExpressionList )
                    	    {
                    	    // InternalModelica.g:5422:6: (lv_res_8_0= ruleExpressionList )
                    	    // InternalModelica.g:5423:7: lv_res_8_0= ruleExpressionList
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrimaryAccess().getResExpressionListParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_91);
                    	    lv_res_8_0=ruleExpressionList();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"res",
                    	    								lv_res_8_0,
                    	    								"xmodelica.Modelica.ExpressionList");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,97,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalModelica.g:5447:3: (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' )
                    {
                    // InternalModelica.g:5447:3: (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' )
                    // InternalModelica.g:5448:4: otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,98,FOLLOW_42); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getLeftCurlyBracketKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getFunctionArgumentsParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_92);
                    this_FunctionArguments_11=ruleFunctionArguments();

                    state._fsp--;


                    				current = this_FunctionArguments_11;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_12=(Token)match(input,99,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getPrimaryAccess().getRightCurlyBracketKeyword_6_2());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalModelica.g:5466:3: this_End_13= ruleEnd
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getEndParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_End_13=ruleEnd();

                    state._fsp--;


                    			current = this_End_13;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalModelica.g:5478:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalModelica.g:5478:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalModelica.g:5479:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalModelica.g:5485:1: ruleFunctionCall returns [EObject current=null] : ( ( ( ( ruleName ) ) | otherlv_1= 'der' | otherlv_2= 'initial' ) ( (lv_args_3_0= ruleFunctionCallArgs ) ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5491:2: ( ( ( ( ( ruleName ) ) | otherlv_1= 'der' | otherlv_2= 'initial' ) ( (lv_args_3_0= ruleFunctionCallArgs ) ) ) )
            // InternalModelica.g:5492:2: ( ( ( ( ruleName ) ) | otherlv_1= 'der' | otherlv_2= 'initial' ) ( (lv_args_3_0= ruleFunctionCallArgs ) ) )
            {
            // InternalModelica.g:5492:2: ( ( ( ( ruleName ) ) | otherlv_1= 'der' | otherlv_2= 'initial' ) ( (lv_args_3_0= ruleFunctionCallArgs ) ) )
            // InternalModelica.g:5493:3: ( ( ( ruleName ) ) | otherlv_1= 'der' | otherlv_2= 'initial' ) ( (lv_args_3_0= ruleFunctionCallArgs ) )
            {
            // InternalModelica.g:5493:3: ( ( ( ruleName ) ) | otherlv_1= 'der' | otherlv_2= 'initial' )
            int alt112=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case 101:
                {
                alt112=1;
                }
                break;
            case 100:
                {
                alt112=2;
                }
                break;
            case 63:
                {
                alt112=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalModelica.g:5494:4: ( ( ruleName ) )
                    {
                    // InternalModelica.g:5494:4: ( ( ruleName ) )
                    // InternalModelica.g:5495:5: ( ruleName )
                    {
                    // InternalModelica.g:5495:5: ( ruleName )
                    // InternalModelica.g:5496:6: ruleName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getComp_refClassDefinitionCrossReference_0_0_0());
                    					
                    pushFollow(FOLLOW_64);
                    ruleName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:5511:4: otherlv_1= 'der'
                    {
                    otherlv_1=(Token)match(input,100,FOLLOW_64); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getDerKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalModelica.g:5516:4: otherlv_2= 'initial'
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_64); 

                    				newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getInitialKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalModelica.g:5521:3: ( (lv_args_3_0= ruleFunctionCallArgs ) )
            // InternalModelica.g:5522:4: (lv_args_3_0= ruleFunctionCallArgs )
            {
            // InternalModelica.g:5522:4: (lv_args_3_0= ruleFunctionCallArgs )
            // InternalModelica.g:5523:5: lv_args_3_0= ruleFunctionCallArgs
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsFunctionCallArgsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_3_0=ruleFunctionCallArgs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_3_0,
            						"xmodelica.Modelica.FunctionCallArgs");
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleName"
    // InternalModelica.g:5544:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalModelica.g:5544:44: (iv_ruleName= ruleName EOF )
            // InternalModelica.g:5545:2: iv_ruleName= ruleName EOF
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
    // InternalModelica.g:5551:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;
        Token this_IDENT_3=null;


        	enterRule();

        try {
            // InternalModelica.g:5557:2: ( ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )* ) )
            // InternalModelica.g:5558:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )* )
            {
            // InternalModelica.g:5558:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )* )
            // InternalModelica.g:5559:3: (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )*
            {
            // InternalModelica.g:5559:3: (kw= '.' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==101) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalModelica.g:5560:4: kw= '.'
                    {
                    kw=(Token)match(input,101,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_0());
                    			

                    }
                    break;

            }

            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_93); 

            			current.merge(this_IDENT_1);
            		

            			newLeafNode(this_IDENT_1, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_1());
            		
            // InternalModelica.g:5573:3: (kw= '.' this_IDENT_3= RULE_IDENT )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==101) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // InternalModelica.g:5574:4: kw= '.' this_IDENT_3= RULE_IDENT
            	    {
            	    kw=(Token)match(input,101,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_2_0());
            	    			
            	    this_IDENT_3=(Token)match(input,RULE_IDENT,FOLLOW_93); 

            	    				current.merge(this_IDENT_3);
            	    			

            	    				newLeafNode(this_IDENT_3, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop114;
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
    // InternalModelica.g:5591:1: entryRuleComponentReference returns [EObject current=null] : iv_ruleComponentReference= ruleComponentReference EOF ;
    public final EObject entryRuleComponentReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentReference = null;


        try {
            // InternalModelica.g:5591:59: (iv_ruleComponentReference= ruleComponentReference EOF )
            // InternalModelica.g:5592:2: iv_ruleComponentReference= ruleComponentReference EOF
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
    // InternalModelica.g:5598:1: ruleComponentReference returns [EObject current=null] : ( (otherlv_0= '.' )? ( (lv_idents_1_0= RULE_IDENT ) ) ( (lv_subscripts_2_0= ruleArraySubscripts ) )? )+ ;
    public final EObject ruleComponentReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_idents_1_0=null;
        EObject lv_subscripts_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5604:2: ( ( (otherlv_0= '.' )? ( (lv_idents_1_0= RULE_IDENT ) ) ( (lv_subscripts_2_0= ruleArraySubscripts ) )? )+ )
            // InternalModelica.g:5605:2: ( (otherlv_0= '.' )? ( (lv_idents_1_0= RULE_IDENT ) ) ( (lv_subscripts_2_0= ruleArraySubscripts ) )? )+
            {
            // InternalModelica.g:5605:2: ( (otherlv_0= '.' )? ( (lv_idents_1_0= RULE_IDENT ) ) ( (lv_subscripts_2_0= ruleArraySubscripts ) )? )+
            int cnt117=0;
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==RULE_IDENT||LA117_0==101) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalModelica.g:5606:3: (otherlv_0= '.' )? ( (lv_idents_1_0= RULE_IDENT ) ) ( (lv_subscripts_2_0= ruleArraySubscripts ) )?
            	    {
            	    // InternalModelica.g:5606:3: (otherlv_0= '.' )?
            	    int alt115=2;
            	    int LA115_0 = input.LA(1);

            	    if ( (LA115_0==101) ) {
            	        alt115=1;
            	    }
            	    switch (alt115) {
            	        case 1 :
            	            // InternalModelica.g:5607:4: otherlv_0= '.'
            	            {
            	            otherlv_0=(Token)match(input,101,FOLLOW_7); 

            	            				newLeafNode(otherlv_0, grammarAccess.getComponentReferenceAccess().getFullStopKeyword_0());
            	            			

            	            }
            	            break;

            	    }

            	    // InternalModelica.g:5612:3: ( (lv_idents_1_0= RULE_IDENT ) )
            	    // InternalModelica.g:5613:4: (lv_idents_1_0= RULE_IDENT )
            	    {
            	    // InternalModelica.g:5613:4: (lv_idents_1_0= RULE_IDENT )
            	    // InternalModelica.g:5614:5: lv_idents_1_0= RULE_IDENT
            	    {
            	    lv_idents_1_0=(Token)match(input,RULE_IDENT,FOLLOW_94); 

            	    					newLeafNode(lv_idents_1_0, grammarAccess.getComponentReferenceAccess().getIdentsIDENTTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getComponentReferenceRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"idents",
            	    						lv_idents_1_0,
            	    						"xmodelica.Modelica.IDENT");
            	    				

            	    }


            	    }

            	    // InternalModelica.g:5630:3: ( (lv_subscripts_2_0= ruleArraySubscripts ) )?
            	    int alt116=2;
            	    int LA116_0 = input.LA(1);

            	    if ( (LA116_0==96) ) {
            	        alt116=1;
            	    }
            	    switch (alt116) {
            	        case 1 :
            	            // InternalModelica.g:5631:4: (lv_subscripts_2_0= ruleArraySubscripts )
            	            {
            	            // InternalModelica.g:5631:4: (lv_subscripts_2_0= ruleArraySubscripts )
            	            // InternalModelica.g:5632:5: lv_subscripts_2_0= ruleArraySubscripts
            	            {

            	            					newCompositeNode(grammarAccess.getComponentReferenceAccess().getSubscriptsArraySubscriptsParserRuleCall_2_0());
            	            				
            	            pushFollow(FOLLOW_95);
            	            lv_subscripts_2_0=ruleArraySubscripts();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getComponentReferenceRule());
            	            					}
            	            					add(
            	            						current,
            	            						"subscripts",
            	            						lv_subscripts_2_0,
            	            						"xmodelica.Modelica.ArraySubscripts");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt117 >= 1 ) break loop117;
                        EarlyExitException eee =
                            new EarlyExitException(117, input);
                        throw eee;
                }
                cnt117++;
            } while (true);


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
    // InternalModelica.g:5653:1: entryRuleFunctionCallArgs returns [EObject current=null] : iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF ;
    public final EObject entryRuleFunctionCallArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArgs = null;


        try {
            // InternalModelica.g:5653:57: (iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF )
            // InternalModelica.g:5654:2: iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF
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
    // InternalModelica.g:5660:1: ruleFunctionCallArgs returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_res_2_0= ruleFunctionArguments ) )? otherlv_3= ')' ) ;
    public final EObject ruleFunctionCallArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_res_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5666:2: ( ( () otherlv_1= '(' ( (lv_res_2_0= ruleFunctionArguments ) )? otherlv_3= ')' ) )
            // InternalModelica.g:5667:2: ( () otherlv_1= '(' ( (lv_res_2_0= ruleFunctionArguments ) )? otherlv_3= ')' )
            {
            // InternalModelica.g:5667:2: ( () otherlv_1= '(' ( (lv_res_2_0= ruleFunctionArguments ) )? otherlv_3= ')' )
            // InternalModelica.g:5668:3: () otherlv_1= '(' ( (lv_res_2_0= ruleFunctionArguments ) )? otherlv_3= ')'
            {
            // InternalModelica.g:5668:3: ()
            // InternalModelica.g:5669:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionCallArgsAccess().getFunctionCallArgsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalModelica.g:5679:3: ( (lv_res_2_0= ruleFunctionArguments ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( ((LA118_0>=RULE_IDENT && LA118_0<=RULE_TRUE_FALSE)||LA118_0==35||LA118_0==58||LA118_0==63||LA118_0==80||(LA118_0>=87 && LA118_0<=90)||LA118_0==96||LA118_0==98||(LA118_0>=100 && LA118_0<=101)) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalModelica.g:5680:4: (lv_res_2_0= ruleFunctionArguments )
                    {
                    // InternalModelica.g:5680:4: (lv_res_2_0= ruleFunctionArguments )
                    // InternalModelica.g:5681:5: lv_res_2_0= ruleFunctionArguments
                    {

                    					newCompositeNode(grammarAccess.getFunctionCallArgsAccess().getResFunctionArgumentsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_res_2_0=ruleFunctionArguments();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionCallArgsRule());
                    					}
                    					set(
                    						current,
                    						"res",
                    						lv_res_2_0,
                    						"xmodelica.Modelica.FunctionArguments");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,42,FOLLOW_2); 

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
    // InternalModelica.g:5706:1: entryRuleFunctionArguments returns [EObject current=null] : iv_ruleFunctionArguments= ruleFunctionArguments EOF ;
    public final EObject entryRuleFunctionArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArguments = null;


        try {
            // InternalModelica.g:5706:58: (iv_ruleFunctionArguments= ruleFunctionArguments EOF )
            // InternalModelica.g:5707:2: iv_ruleFunctionArguments= ruleFunctionArguments EOF
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
    // InternalModelica.g:5713:1: ruleFunctionArguments returns [EObject current=null] : ( ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? ) | this_NamedArgument_5= ruleNamedArgument ) ;
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
            // InternalModelica.g:5719:2: ( ( ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? ) | this_NamedArgument_5= ruleNamedArgument ) )
            // InternalModelica.g:5720:2: ( ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? ) | this_NamedArgument_5= ruleNamedArgument )
            {
            // InternalModelica.g:5720:2: ( ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? ) | this_NamedArgument_5= ruleNamedArgument )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( ((LA120_0>=RULE_STRING && LA120_0<=RULE_TRUE_FALSE)||LA120_0==35||LA120_0==58||LA120_0==63||LA120_0==80||(LA120_0>=87 && LA120_0<=90)||LA120_0==96||LA120_0==98||(LA120_0>=100 && LA120_0<=101)) ) {
                alt120=1;
            }
            else if ( (LA120_0==RULE_IDENT) ) {
                int LA120_2 = input.LA(2);

                if ( (LA120_2==EOF||LA120_2==RULE_IDENT||LA120_2==37||(LA120_2>=41 && LA120_2<=42)||LA120_2==48||LA120_2==62||LA120_2==71||(LA120_2>=78 && LA120_2<=79)||(LA120_2>=81 && LA120_2<=96)||LA120_2==99||LA120_2==101) ) {
                    alt120=1;
                }
                else if ( (LA120_2==36) ) {
                    alt120=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 120, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // InternalModelica.g:5721:3: ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? )
                    {
                    // InternalModelica.g:5721:3: ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? )
                    // InternalModelica.g:5722:4: ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )?
                    {
                    // InternalModelica.g:5722:4: ( (lv_args_0_0= ruleFunctionArgument ) )
                    // InternalModelica.g:5723:5: (lv_args_0_0= ruleFunctionArgument )
                    {
                    // InternalModelica.g:5723:5: (lv_args_0_0= ruleFunctionArgument )
                    // InternalModelica.g:5724:6: lv_args_0_0= ruleFunctionArgument
                    {

                    						newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getArgsFunctionArgumentParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_96);
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

                    // InternalModelica.g:5741:4: ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )?
                    int alt119=3;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==37) ) {
                        alt119=1;
                    }
                    else if ( (LA119_0==71) ) {
                        alt119=2;
                    }
                    switch (alt119) {
                        case 1 :
                            // InternalModelica.g:5742:5: (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) )
                            {
                            // InternalModelica.g:5742:5: (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) )
                            // InternalModelica.g:5743:6: otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) )
                            {
                            otherlv_1=(Token)match(input,37,FOLLOW_42); 

                            						newLeafNode(otherlv_1, grammarAccess.getFunctionArgumentsAccess().getCommaKeyword_0_1_0_0());
                            					
                            // InternalModelica.g:5747:6: ( (lv_args_2_0= ruleFunctionArguments ) )
                            // InternalModelica.g:5748:7: (lv_args_2_0= ruleFunctionArguments )
                            {
                            // InternalModelica.g:5748:7: (lv_args_2_0= ruleFunctionArguments )
                            // InternalModelica.g:5749:8: lv_args_2_0= ruleFunctionArguments
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
                            // InternalModelica.g:5768:5: (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) )
                            {
                            // InternalModelica.g:5768:5: (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) )
                            // InternalModelica.g:5769:6: otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) )
                            {
                            otherlv_3=(Token)match(input,71,FOLLOW_7); 

                            						newLeafNode(otherlv_3, grammarAccess.getFunctionArgumentsAccess().getForKeyword_0_1_1_0());
                            					
                            // InternalModelica.g:5773:6: ( (lv_indices_4_0= ruleForIndices ) )
                            // InternalModelica.g:5774:7: (lv_indices_4_0= ruleForIndices )
                            {
                            // InternalModelica.g:5774:7: (lv_indices_4_0= ruleForIndices )
                            // InternalModelica.g:5775:8: lv_indices_4_0= ruleForIndices
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
                    // InternalModelica.g:5796:3: this_NamedArgument_5= ruleNamedArgument
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
    // InternalModelica.g:5808:1: entryRuleNamedArguments returns [EObject current=null] : iv_ruleNamedArguments= ruleNamedArguments EOF ;
    public final EObject entryRuleNamedArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArguments = null;


        try {
            // InternalModelica.g:5808:55: (iv_ruleNamedArguments= ruleNamedArguments EOF )
            // InternalModelica.g:5809:2: iv_ruleNamedArguments= ruleNamedArguments EOF
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
    // InternalModelica.g:5815:1: ruleNamedArguments returns [EObject current=null] : ( ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) ) ) ;
    public final EObject ruleNamedArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5821:2: ( ( ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) ) ) )
            // InternalModelica.g:5822:2: ( ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) ) )
            {
            // InternalModelica.g:5822:2: ( ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) ) )
            // InternalModelica.g:5823:3: ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) )
            {
            // InternalModelica.g:5823:3: ( (lv_args_0_0= ruleNamedArgument ) )
            // InternalModelica.g:5824:4: (lv_args_0_0= ruleNamedArgument )
            {
            // InternalModelica.g:5824:4: (lv_args_0_0= ruleNamedArgument )
            // InternalModelica.g:5825:5: lv_args_0_0= ruleNamedArgument
            {

            					newCompositeNode(grammarAccess.getNamedArgumentsAccess().getArgsNamedArgumentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_79);
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

            // InternalModelica.g:5842:3: (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) )
            // InternalModelica.g:5843:4: otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) )
            {
            otherlv_1=(Token)match(input,37,FOLLOW_42); 

            				newLeafNode(otherlv_1, grammarAccess.getNamedArgumentsAccess().getCommaKeyword_1_0());
            			
            // InternalModelica.g:5847:4: ( (lv_args_2_0= ruleNamedArguments ) )
            // InternalModelica.g:5848:5: (lv_args_2_0= ruleNamedArguments )
            {
            // InternalModelica.g:5848:5: (lv_args_2_0= ruleNamedArguments )
            // InternalModelica.g:5849:6: lv_args_2_0= ruleNamedArguments
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
    // InternalModelica.g:5871:1: entryRuleNamedArgument returns [EObject current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final EObject entryRuleNamedArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArgument = null;


        try {
            // InternalModelica.g:5871:54: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalModelica.g:5872:2: iv_ruleNamedArgument= ruleNamedArgument EOF
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
    // InternalModelica.g:5878:1: ruleNamedArgument returns [EObject current=null] : ( ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) ) ) ;
    public final EObject ruleNamedArgument() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_func_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5884:2: ( ( ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) ) ) )
            // InternalModelica.g:5885:2: ( ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) ) )
            {
            // InternalModelica.g:5885:2: ( ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) ) )
            // InternalModelica.g:5886:3: ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) )
            {
            // InternalModelica.g:5886:3: ( (lv_id_0_0= RULE_IDENT ) )
            // InternalModelica.g:5887:4: (lv_id_0_0= RULE_IDENT )
            {
            // InternalModelica.g:5887:4: (lv_id_0_0= RULE_IDENT )
            // InternalModelica.g:5888:5: lv_id_0_0= RULE_IDENT
            {
            lv_id_0_0=(Token)match(input,RULE_IDENT,FOLLOW_15); 

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

            otherlv_1=(Token)match(input,36,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedArgumentAccess().getEqualsSignKeyword_1());
            		
            // InternalModelica.g:5908:3: ( (lv_func_2_0= ruleFunctionArgument ) )
            // InternalModelica.g:5909:4: (lv_func_2_0= ruleFunctionArgument )
            {
            // InternalModelica.g:5909:4: (lv_func_2_0= ruleFunctionArgument )
            // InternalModelica.g:5910:5: lv_func_2_0= ruleFunctionArgument
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
    // InternalModelica.g:5931:1: entryRuleFunctionArgument returns [EObject current=null] : iv_ruleFunctionArgument= ruleFunctionArgument EOF ;
    public final EObject entryRuleFunctionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArgument = null;


        try {
            // InternalModelica.g:5931:57: (iv_ruleFunctionArgument= ruleFunctionArgument EOF )
            // InternalModelica.g:5932:2: iv_ruleFunctionArgument= ruleFunctionArgument EOF
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
    // InternalModelica.g:5938:1: ruleFunctionArgument returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleFunctionArgument() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5944:2: (this_Expression_0= ruleExpression )
            // InternalModelica.g:5945:2: this_Expression_0= ruleExpression
            {

            		newCompositeNode(grammarAccess.getFunctionArgumentAccess().getExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;


            		current = this_Expression_0;
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
    // $ANTLR end "ruleFunctionArgument"


    // $ANTLR start "entryRuleOutputExpressionList"
    // InternalModelica.g:5956:1: entryRuleOutputExpressionList returns [EObject current=null] : iv_ruleOutputExpressionList= ruleOutputExpressionList EOF ;
    public final EObject entryRuleOutputExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputExpressionList = null;


        try {
            // InternalModelica.g:5956:61: (iv_ruleOutputExpressionList= ruleOutputExpressionList EOF )
            // InternalModelica.g:5957:2: iv_ruleOutputExpressionList= ruleOutputExpressionList EOF
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
    // InternalModelica.g:5963:1: ruleOutputExpressionList returns [EObject current=null] : ( () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )* ) ;
    public final EObject ruleOutputExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5969:2: ( ( () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )* ) )
            // InternalModelica.g:5970:2: ( () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )* )
            {
            // InternalModelica.g:5970:2: ( () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )* )
            // InternalModelica.g:5971:3: () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )*
            {
            // InternalModelica.g:5971:3: ()
            // InternalModelica.g:5972:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputExpressionListAccess().getOuputExpressionListAction_0(),
            					current);
            			

            }

            // InternalModelica.g:5978:3: ( (lv_exprs_1_0= ruleExpression ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=RULE_IDENT && LA121_0<=RULE_TRUE_FALSE)||LA121_0==35||LA121_0==58||LA121_0==63||LA121_0==80||(LA121_0>=87 && LA121_0<=90)||LA121_0==96||LA121_0==98||(LA121_0>=100 && LA121_0<=101)) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalModelica.g:5979:4: (lv_exprs_1_0= ruleExpression )
                    {
                    // InternalModelica.g:5979:4: (lv_exprs_1_0= ruleExpression )
                    // InternalModelica.g:5980:5: lv_exprs_1_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getOutputExpressionListAccess().getExprsExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_19);
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

            // InternalModelica.g:5997:3: (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==37) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // InternalModelica.g:5998:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )?
            	    {
            	    otherlv_2=(Token)match(input,37,FOLLOW_97); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOutputExpressionListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalModelica.g:6002:4: ( (lv_exprs_3_0= ruleExpression ) )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( ((LA122_0>=RULE_IDENT && LA122_0<=RULE_TRUE_FALSE)||LA122_0==35||LA122_0==58||LA122_0==63||LA122_0==80||(LA122_0>=87 && LA122_0<=90)||LA122_0==96||LA122_0==98||(LA122_0>=100 && LA122_0<=101)) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // InternalModelica.g:6003:5: (lv_exprs_3_0= ruleExpression )
            	            {
            	            // InternalModelica.g:6003:5: (lv_exprs_3_0= ruleExpression )
            	            // InternalModelica.g:6004:6: lv_exprs_3_0= ruleExpression
            	            {

            	            						newCompositeNode(grammarAccess.getOutputExpressionListAccess().getExprsExpressionParserRuleCall_2_1_0());
            	            					
            	            pushFollow(FOLLOW_19);
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
            	    break loop123;
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
    // InternalModelica.g:6026:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // InternalModelica.g:6026:55: (iv_ruleExpressionList= ruleExpressionList EOF )
            // InternalModelica.g:6027:2: iv_ruleExpressionList= ruleExpressionList EOF
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
    // InternalModelica.g:6033:1: ruleExpressionList returns [EObject current=null] : ( ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprs_0_0 = null;

        EObject lv_exprs_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:6039:2: ( ( ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )* ) )
            // InternalModelica.g:6040:2: ( ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )* )
            {
            // InternalModelica.g:6040:2: ( ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )* )
            // InternalModelica.g:6041:3: ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )*
            {
            // InternalModelica.g:6041:3: ( (lv_exprs_0_0= ruleExpression ) )
            // InternalModelica.g:6042:4: (lv_exprs_0_0= ruleExpression )
            {
            // InternalModelica.g:6042:4: (lv_exprs_0_0= ruleExpression )
            // InternalModelica.g:6043:5: lv_exprs_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionListAccess().getExprsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalModelica.g:6060:3: (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==37) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // InternalModelica.g:6061:4: otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_42); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:6065:4: ( (lv_exprs_2_0= ruleExpression ) )
            	    // InternalModelica.g:6066:5: (lv_exprs_2_0= ruleExpression )
            	    {
            	    // InternalModelica.g:6066:5: (lv_exprs_2_0= ruleExpression )
            	    // InternalModelica.g:6067:6: lv_exprs_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionListAccess().getExprsExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    break loop124;
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
    // InternalModelica.g:6089:1: entryRuleArraySubscripts returns [EObject current=null] : iv_ruleArraySubscripts= ruleArraySubscripts EOF ;
    public final EObject entryRuleArraySubscripts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySubscripts = null;


        try {
            // InternalModelica.g:6089:56: (iv_ruleArraySubscripts= ruleArraySubscripts EOF )
            // InternalModelica.g:6090:2: iv_ruleArraySubscripts= ruleArraySubscripts EOF
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
    // InternalModelica.g:6096:1: ruleArraySubscripts returns [EObject current=null] : (otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArraySubscripts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_subscripts_1_0 = null;

        EObject lv_subscripts_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:6102:2: ( (otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']' ) )
            // InternalModelica.g:6103:2: (otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']' )
            {
            // InternalModelica.g:6103:2: (otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']' )
            // InternalModelica.g:6104:3: otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_98); 

            			newLeafNode(otherlv_0, grammarAccess.getArraySubscriptsAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalModelica.g:6108:3: ( (lv_subscripts_1_0= ruleSubscript ) )
            // InternalModelica.g:6109:4: (lv_subscripts_1_0= ruleSubscript )
            {
            // InternalModelica.g:6109:4: (lv_subscripts_1_0= ruleSubscript )
            // InternalModelica.g:6110:5: lv_subscripts_1_0= ruleSubscript
            {

            					newCompositeNode(grammarAccess.getArraySubscriptsAccess().getSubscriptsSubscriptParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_99);
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

            // InternalModelica.g:6127:3: (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==37) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalModelica.g:6128:4: otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) )
            	    {
            	    otherlv_2=(Token)match(input,37,FOLLOW_98); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArraySubscriptsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalModelica.g:6132:4: ( (lv_subscripts_3_0= ruleSubscript ) )
            	    // InternalModelica.g:6133:5: (lv_subscripts_3_0= ruleSubscript )
            	    {
            	    // InternalModelica.g:6133:5: (lv_subscripts_3_0= ruleSubscript )
            	    // InternalModelica.g:6134:6: lv_subscripts_3_0= ruleSubscript
            	    {

            	    						newCompositeNode(grammarAccess.getArraySubscriptsAccess().getSubscriptsSubscriptParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_99);
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
            	    break loop125;
                }
            } while (true);

            otherlv_4=(Token)match(input,97,FOLLOW_2); 

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
    // InternalModelica.g:6160:1: entryRuleSubscript returns [EObject current=null] : iv_ruleSubscript= ruleSubscript EOF ;
    public final EObject entryRuleSubscript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscript = null;


        try {
            // InternalModelica.g:6160:50: (iv_ruleSubscript= ruleSubscript EOF )
            // InternalModelica.g:6161:2: iv_ruleSubscript= ruleSubscript EOF
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
    // InternalModelica.g:6167:1: ruleSubscript returns [EObject current=null] : ( ( (lv_all_0_0= ':' ) ) | this_Expression_1= ruleExpression ) ;
    public final EObject ruleSubscript() throws RecognitionException {
        EObject current = null;

        Token lv_all_0_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalModelica.g:6173:2: ( ( ( (lv_all_0_0= ':' ) ) | this_Expression_1= ruleExpression ) )
            // InternalModelica.g:6174:2: ( ( (lv_all_0_0= ':' ) ) | this_Expression_1= ruleExpression )
            {
            // InternalModelica.g:6174:2: ( ( (lv_all_0_0= ':' ) ) | this_Expression_1= ruleExpression )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==62) ) {
                alt126=1;
            }
            else if ( ((LA126_0>=RULE_IDENT && LA126_0<=RULE_TRUE_FALSE)||LA126_0==35||LA126_0==58||LA126_0==63||LA126_0==80||(LA126_0>=87 && LA126_0<=90)||LA126_0==96||LA126_0==98||(LA126_0>=100 && LA126_0<=101)) ) {
                alt126=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // InternalModelica.g:6175:3: ( (lv_all_0_0= ':' ) )
                    {
                    // InternalModelica.g:6175:3: ( (lv_all_0_0= ':' ) )
                    // InternalModelica.g:6176:4: (lv_all_0_0= ':' )
                    {
                    // InternalModelica.g:6176:4: (lv_all_0_0= ':' )
                    // InternalModelica.g:6177:5: lv_all_0_0= ':'
                    {
                    lv_all_0_0=(Token)match(input,62,FOLLOW_2); 

                    					newLeafNode(lv_all_0_0, grammarAccess.getSubscriptAccess().getAllColonKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSubscriptRule());
                    					}
                    					setWithLastConsumed(current, "all", true, ":");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:6190:3: this_Expression_1= ruleExpression
                    {

                    			newCompositeNode(grammarAccess.getSubscriptAccess().getExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    			current = this_Expression_1;
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
    // InternalModelica.g:6202:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalModelica.g:6202:48: (iv_ruleComment= ruleComment EOF )
            // InternalModelica.g:6203:2: iv_ruleComment= ruleComment EOF
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
    // InternalModelica.g:6209:1: ruleComment returns [EObject current=null] : ( ( (lv_comment_0_0= ruleStringComment ) ) ( (lv_annotation_1_0= ruleAnnotation ) )? ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_annotation_1_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:6215:2: ( ( ( (lv_comment_0_0= ruleStringComment ) ) ( (lv_annotation_1_0= ruleAnnotation ) )? ) )
            // InternalModelica.g:6216:2: ( ( (lv_comment_0_0= ruleStringComment ) ) ( (lv_annotation_1_0= ruleAnnotation ) )? )
            {
            // InternalModelica.g:6216:2: ( ( (lv_comment_0_0= ruleStringComment ) ) ( (lv_annotation_1_0= ruleAnnotation ) )? )
            // InternalModelica.g:6217:3: ( (lv_comment_0_0= ruleStringComment ) ) ( (lv_annotation_1_0= ruleAnnotation ) )?
            {
            // InternalModelica.g:6217:3: ( (lv_comment_0_0= ruleStringComment ) )
            // InternalModelica.g:6218:4: (lv_comment_0_0= ruleStringComment )
            {
            // InternalModelica.g:6218:4: (lv_comment_0_0= ruleStringComment )
            // InternalModelica.g:6219:5: lv_comment_0_0= ruleStringComment
            {

            					newCompositeNode(grammarAccess.getCommentAccess().getCommentStringCommentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_comment_0_0=ruleStringComment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentRule());
            					}
            					set(
            						current,
            						"comment",
            						lv_comment_0_0,
            						"xmodelica.Modelica.StringComment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:6236:3: ( (lv_annotation_1_0= ruleAnnotation ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==102) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalModelica.g:6237:4: (lv_annotation_1_0= ruleAnnotation )
                    {
                    // InternalModelica.g:6237:4: (lv_annotation_1_0= ruleAnnotation )
                    // InternalModelica.g:6238:5: lv_annotation_1_0= ruleAnnotation
                    {

                    					newCompositeNode(grammarAccess.getCommentAccess().getAnnotationAnnotationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_annotation_1_0=ruleAnnotation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommentRule());
                    					}
                    					set(
                    						current,
                    						"annotation",
                    						lv_annotation_1_0,
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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleStringComment"
    // InternalModelica.g:6259:1: entryRuleStringComment returns [String current=null] : iv_ruleStringComment= ruleStringComment EOF ;
    public final String entryRuleStringComment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringComment = null;


        try {
            // InternalModelica.g:6259:53: (iv_ruleStringComment= ruleStringComment EOF )
            // InternalModelica.g:6260:2: iv_ruleStringComment= ruleStringComment EOF
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
    // InternalModelica.g:6266:1: ruleStringComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )? ;
    public final AntlrDatatypeRuleToken ruleStringComment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalModelica.g:6272:2: ( (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )? )
            // InternalModelica.g:6273:2: (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )?
            {
            // InternalModelica.g:6273:2: (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==RULE_STRING) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalModelica.g:6274:3: this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )*
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_100); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getStringCommentAccess().getSTRINGTerminalRuleCall_0());
                    		
                    // InternalModelica.g:6281:3: (kw= '+' this_STRING_2= RULE_STRING )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==87) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalModelica.g:6282:4: kw= '+' this_STRING_2= RULE_STRING
                    	    {
                    	    kw=(Token)match(input,87,FOLLOW_50); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getStringCommentAccess().getPlusSignKeyword_1_0());
                    	    			
                    	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_100); 

                    	    				current.merge(this_STRING_2);
                    	    			

                    	    				newLeafNode(this_STRING_2, grammarAccess.getStringCommentAccess().getSTRINGTerminalRuleCall_1_1());
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    break loop128;
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
    // InternalModelica.g:6299:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalModelica.g:6299:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalModelica.g:6300:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalModelica.g:6306:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ClassModification_1 = null;



        	enterRule();

        try {
            // InternalModelica.g:6312:2: ( (otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification ) )
            // InternalModelica.g:6313:2: (otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification )
            {
            // InternalModelica.g:6313:2: (otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification )
            // InternalModelica.g:6314:3: otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification
            {
            otherlv_0=(Token)match(input,102,FOLLOW_27); 

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
    protected DFA111 dfa111 = new DFA111(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\3\uffff\1\12\7\uffff";
    static final String dfa_3s = "\1\27\2\uffff\1\4\7\uffff";
    static final String dfa_4s = "\1\42\2\uffff\1\42\7\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\2\6\1\7\1\10\3\11",
            "",
            "",
            "\1\12\25\uffff\1\4\7\uffff\1\11",
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
            return "269:3: (kw= 'class' | kw= 'model' | ( (kw= 'operator' )? kw= 'record' ) | kw= 'block' | ( (kw= 'expandable' )? kw= 'connector' ) | kw= 'type' | kw= 'package' | ( (kw= 'pure' | kw= 'impure' )? (kw= 'operator' )? kw= 'function' ) | kw= 'operator' )";
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\5\uffff\1\13\6\uffff\1\13";
    static final String dfa_10s = "\1\4\3\uffff\2\4\4\uffff\1\4\1\uffff\1\4";
    static final String dfa_11s = "\1\145\3\uffff\1\4\1\146\4\uffff\1\4\1\uffff\1\146";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\3\2\uffff\1\4\1\6\1\7\1\10\1\uffff\1\5\1\uffff";
    static final String dfa_13s = "\15\uffff}>";
    static final String[] dfa_14s = {
            "\1\5\1\2\1\1\1\3\33\uffff\1\11\33\uffff\1\6\40\uffff\1\7\1\uffff\1\10\1\uffff\1\6\1\4",
            "",
            "",
            "",
            "\1\5",
            "\2\13\15\uffff\1\13\20\uffff\2\13\3\uffff\1\6\1\13\5\uffff\1\13\1\uffff\1\13\7\uffff\1\13\3\uffff\1\13\5\uffff\5\13\5\uffff\2\13\1\uffff\21\13\1\uffff\1\13\1\uffff\1\12\1\13",
            "",
            "",
            "",
            "",
            "\1\14",
            "",
            "\2\13\15\uffff\1\13\20\uffff\2\13\3\uffff\1\6\1\13\5\uffff\1\13\1\uffff\1\13\7\uffff\1\13\3\uffff\1\13\5\uffff\5\13\5\uffff\2\13\1\uffff\21\13\1\uffff\1\13\1\uffff\1\12\1\13"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "5346:2: (this_FloatPrimary_0= ruleFloatPrimary | this_StringPrimary_1= ruleStringPrimary | this_LogicalPrimary_2= ruleLogicalPrimary | this_FunctionCall_3= ruleFunctionCall | this_ComponentReference_4= ruleComponentReference | (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' ) | (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' ) | this_End_13= ruleEnd )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L,0x0000002000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000007FFF00002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000007FFF00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000007FF800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x83FAF9C7FFF00030L,0x0000006000000003L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x03F8000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L,0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x800001C000000002L,0x0000004000000003L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x83FAF9C7FFF00010L,0x0000006000000003L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080030L,0x0000006000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080010L,0x0000006000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L,0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x84000408000000F0L,0x0000003507810000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x03FAF807FFF00012L,0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x03F87007FFF00010L,0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x03F86007FFF00010L,0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x03F84007FFF00010L,0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x03F80007FFF00010L,0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001022000000020L,0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000010L,0x0000000100000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x03E0000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000000020L,0x0000004000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x84000008000000F0L,0x0000003507810000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800021000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800021000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x10004C0000100010L,0x0000002000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000480000100010L,0x0000002000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000400000100010L,0x0000002000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0800021000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x13F84007FFF00010L,0x0000002000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x23F8000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000020000000020L,0x0000004100000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000020000000020L,0x0000004000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x4000040000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x84000008000000F0L,0x0000003507812880L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x84000008000000F2L,0x0000003507812880L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0400020000000010L,0x0000002000000C8CL});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0400020000000012L,0x0000002000000C8CL});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x84000208000000F0L,0x0000003507810000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x84000428000000F0L,0x0000003507810000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x84000008000000F0L,0x00000035078128E0L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0400020800000010L,0x0000002000000CECL});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0400020800000010L,0x0000002000000C8CL});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x84000008000000F0L,0x0000003507813880L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000800000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0400020800000010L,0x0000002000001C8CL});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x80000008000000F0L,0x0000003507810000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x80000008000000F0L,0x0000003507800000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x00000000007E0000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x80000008000000F2L,0x0000003507800000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x80000008000000F0L,0x0000003500000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0001000000000002L,0x0000000038000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000012L,0x0000002100000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000012L,0x0000002000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000002000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x84000028000000F2L,0x0000003507810000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0xC4000008000000F0L,0x0000003507810000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000002000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});

}