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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_STRING", "RULE_UNSIGNED_NUMBER", "RULE_TRUE_FALSE", "RULE_NONDIGIT", "RULE_DIGIT", "RULE_Q_IDENT", "RULE_UNSIGNED_INTEGER", "RULE_S_CHAR", "RULE_S_ESCAPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_Q_CHAR", "'within'", "';'", "'final'", "'encapsulated'", "'partial'", "'class'", "'model'", "'operator'", "'record'", "'block'", "'expandable'", "'connector'", "'type'", "'package'", "'pure'", "'impure'", "'function'", "'end'", "','", "'public'", "'protected'", "'external'", "'='", "'('", "')'", "'redeclare'", "'inner'", "'outer'", "'replaceable'", "'import'", "'*'", "'extends'", "'constrainedby'", "'flow'", "'stream'", "'discrete'", "'parameter'", "'constant'", "'input'", "'output'", "'if'", "':='", "'each'", "'enumeration'", "':'", "'initial'", "'equation'", "'algorithm'", "'break'", "'return'", "'then'", "'elseif'", "'else'", "'for'", "'loop'", "'in'", "'while'", "'when'", "'elsewhen'", "'connect'", "'or'", "'and'", "'<'", "'<='", "'>'", "'>='", "'=='", "'<>'", "'+'", "'-'", "'.+'", "'.-'", "'/'", "'.*'", "'./'", "'^'", "'.^'", "'['", "']'", "'{'", "'}'", "'der'", "'.'", "'annotation'"
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
    // InternalModelica.g:375:1: ruleClassSpecifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleStringComment ) ) ( (lv_composition_2_0= ruleComposition ) ) otherlv_3= 'end' ( (lv_name_end_4_0= RULE_IDENT ) ) ) ;
    public final EObject ruleClassSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_3=null;
        Token lv_name_end_4_0=null;
        AntlrDatatypeRuleToken lv_comment_1_0 = null;

        EObject lv_composition_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:381:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleStringComment ) ) ( (lv_composition_2_0= ruleComposition ) ) otherlv_3= 'end' ( (lv_name_end_4_0= RULE_IDENT ) ) ) )
            // InternalModelica.g:382:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleStringComment ) ) ( (lv_composition_2_0= ruleComposition ) ) otherlv_3= 'end' ( (lv_name_end_4_0= RULE_IDENT ) ) )
            {
            // InternalModelica.g:382:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleStringComment ) ) ( (lv_composition_2_0= ruleComposition ) ) otherlv_3= 'end' ( (lv_name_end_4_0= RULE_IDENT ) ) )
            // InternalModelica.g:383:3: ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleStringComment ) ) ( (lv_composition_2_0= ruleComposition ) ) otherlv_3= 'end' ( (lv_name_end_4_0= RULE_IDENT ) )
            {
            // InternalModelica.g:383:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalModelica.g:384:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalModelica.g:384:4: (lv_name_0_0= RULE_IDENT )
            // InternalModelica.g:385:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getClassSpecifierAccess().getNameIDENTTerminalRuleCall_0_0());
            				

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

            // InternalModelica.g:401:3: ( (lv_comment_1_0= ruleStringComment ) )
            // InternalModelica.g:402:4: (lv_comment_1_0= ruleStringComment )
            {
            // InternalModelica.g:402:4: (lv_comment_1_0= ruleStringComment )
            // InternalModelica.g:403:5: lv_comment_1_0= ruleStringComment
            {

            					newCompositeNode(grammarAccess.getClassSpecifierAccess().getCommentStringCommentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_comment_1_0=ruleStringComment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassSpecifierRule());
            					}
            					set(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"xmodelica.Modelica.StringComment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModelica.g:420:3: ( (lv_composition_2_0= ruleComposition ) )
            // InternalModelica.g:421:4: (lv_composition_2_0= ruleComposition )
            {
            // InternalModelica.g:421:4: (lv_composition_2_0= ruleComposition )
            // InternalModelica.g:422:5: lv_composition_2_0= ruleComposition
            {

            					newCompositeNode(grammarAccess.getClassSpecifierAccess().getCompositionCompositionParserRuleCall_2_0());
            				
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

            			newLeafNode(otherlv_3, grammarAccess.getClassSpecifierAccess().getEndKeyword_3());
            		
            // InternalModelica.g:443:3: ( (lv_name_end_4_0= RULE_IDENT ) )
            // InternalModelica.g:444:4: (lv_name_end_4_0= RULE_IDENT )
            {
            // InternalModelica.g:444:4: (lv_name_end_4_0= RULE_IDENT )
            // InternalModelica.g:445:5: lv_name_end_4_0= RULE_IDENT
            {
            lv_name_end_4_0=(Token)match(input,RULE_IDENT,FOLLOW_2); 

            					newLeafNode(lv_name_end_4_0, grammarAccess.getClassSpecifierAccess().getName_endIDENTTerminalRuleCall_4_0());
            				

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
    // InternalModelica.g:465:1: entryRuleBasePrefix returns [String current=null] : iv_ruleBasePrefix= ruleBasePrefix EOF ;
    public final String entryRuleBasePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasePrefix = null;


        try {
            // InternalModelica.g:465:50: (iv_ruleBasePrefix= ruleBasePrefix EOF )
            // InternalModelica.g:466:2: iv_ruleBasePrefix= ruleBasePrefix EOF
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
    // InternalModelica.g:472:1: ruleBasePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_TypePrefix_0= ruleTypePrefix ;
    public final AntlrDatatypeRuleToken ruleBasePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypePrefix_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:478:2: (this_TypePrefix_0= ruleTypePrefix )
            // InternalModelica.g:479:2: this_TypePrefix_0= ruleTypePrefix
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
    // InternalModelica.g:492:1: entryRuleEnumList returns [EObject current=null] : iv_ruleEnumList= ruleEnumList EOF ;
    public final EObject entryRuleEnumList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumList = null;


        try {
            // InternalModelica.g:492:49: (iv_ruleEnumList= ruleEnumList EOF )
            // InternalModelica.g:493:2: iv_ruleEnumList= ruleEnumList EOF
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
    // InternalModelica.g:499:1: ruleEnumList returns [EObject current=null] : ( ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )* ) ;
    public final EObject ruleEnumList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_enums_0_0 = null;

        EObject lv_enums_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:505:2: ( ( ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )* ) )
            // InternalModelica.g:506:2: ( ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )* )
            {
            // InternalModelica.g:506:2: ( ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )* )
            // InternalModelica.g:507:3: ( (lv_enums_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )*
            {
            // InternalModelica.g:507:3: ( (lv_enums_0_0= ruleEnumerationLiteral ) )
            // InternalModelica.g:508:4: (lv_enums_0_0= ruleEnumerationLiteral )
            {
            // InternalModelica.g:508:4: (lv_enums_0_0= ruleEnumerationLiteral )
            // InternalModelica.g:509:5: lv_enums_0_0= ruleEnumerationLiteral
            {

            					newCompositeNode(grammarAccess.getEnumListAccess().getEnumsEnumerationLiteralParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalModelica.g:526:3: (otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalModelica.g:527:4: otherlv_1= ',' ( (lv_enums_2_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEnumListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:531:4: ( (lv_enums_2_0= ruleEnumerationLiteral ) )
            	    // InternalModelica.g:532:5: (lv_enums_2_0= ruleEnumerationLiteral )
            	    {
            	    // InternalModelica.g:532:5: (lv_enums_2_0= ruleEnumerationLiteral )
            	    // InternalModelica.g:533:6: lv_enums_2_0= ruleEnumerationLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getEnumListAccess().getEnumsEnumerationLiteralParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	    break loop12;
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
    // InternalModelica.g:555:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalModelica.g:555:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalModelica.g:556:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalModelica.g:562:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_id_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleComment ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_comment_1_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:568:2: ( ( ( (lv_id_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleComment ) ) ) )
            // InternalModelica.g:569:2: ( ( (lv_id_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleComment ) ) )
            {
            // InternalModelica.g:569:2: ( ( (lv_id_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleComment ) ) )
            // InternalModelica.g:570:3: ( (lv_id_0_0= RULE_IDENT ) ) ( (lv_comment_1_0= ruleComment ) )
            {
            // InternalModelica.g:570:3: ( (lv_id_0_0= RULE_IDENT ) )
            // InternalModelica.g:571:4: (lv_id_0_0= RULE_IDENT )
            {
            // InternalModelica.g:571:4: (lv_id_0_0= RULE_IDENT )
            // InternalModelica.g:572:5: lv_id_0_0= RULE_IDENT
            {
            lv_id_0_0=(Token)match(input,RULE_IDENT,FOLLOW_16); 

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

            // InternalModelica.g:588:3: ( (lv_comment_1_0= ruleComment ) )
            // InternalModelica.g:589:4: (lv_comment_1_0= ruleComment )
            {
            // InternalModelica.g:589:4: (lv_comment_1_0= ruleComment )
            // InternalModelica.g:590:5: lv_comment_1_0= ruleComment
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
    // InternalModelica.g:611:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalModelica.g:611:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalModelica.g:612:2: iv_ruleComposition= ruleComposition EOF
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
    // InternalModelica.g:618:1: ruleComposition returns [EObject current=null] : ( ( (lv_priv_elist_0_0= ruleElementList ) ) ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )? ) ;
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
            // InternalModelica.g:624:2: ( ( ( (lv_priv_elist_0_0= ruleElementList ) ) ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )? ) )
            // InternalModelica.g:625:2: ( ( (lv_priv_elist_0_0= ruleElementList ) ) ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )? )
            {
            // InternalModelica.g:625:2: ( ( (lv_priv_elist_0_0= ruleElementList ) ) ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )? )
            // InternalModelica.g:626:3: ( (lv_priv_elist_0_0= ruleElementList ) ) ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )* (otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )? ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )?
            {
            // InternalModelica.g:626:3: ( (lv_priv_elist_0_0= ruleElementList ) )
            // InternalModelica.g:627:4: (lv_priv_elist_0_0= ruleElementList )
            {
            // InternalModelica.g:627:4: (lv_priv_elist_0_0= ruleElementList )
            // InternalModelica.g:628:5: lv_priv_elist_0_0= ruleElementList
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getPriv_elistElementListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalModelica.g:645:3: ( (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) ) | (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) ) | ( (lv_eq_secs_5_0= ruleEquationSection ) ) | ( (lv_alg_secs_6_0= ruleAlgorithmSection ) ) )*
            loop13:
            do {
                int alt13=5;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    alt13=1;
                    }
                    break;
                case 38:
                    {
                    alt13=2;
                    }
                    break;
                case 63:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (LA13_4==64) ) {
                        alt13=3;
                    }
                    else if ( (LA13_4==65) ) {
                        alt13=4;
                    }


                    }
                    break;
                case 64:
                    {
                    alt13=3;
                    }
                    break;
                case 65:
                    {
                    alt13=4;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalModelica.g:646:4: (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) )
            	    {
            	    // InternalModelica.g:646:4: (otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) ) )
            	    // InternalModelica.g:647:5: otherlv_1= 'public' ( (lv_pub_elist_2_0= ruleElementList ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_18); 

            	    					newLeafNode(otherlv_1, grammarAccess.getCompositionAccess().getPublicKeyword_1_0_0());
            	    				
            	    // InternalModelica.g:651:5: ( (lv_pub_elist_2_0= ruleElementList ) )
            	    // InternalModelica.g:652:6: (lv_pub_elist_2_0= ruleElementList )
            	    {
            	    // InternalModelica.g:652:6: (lv_pub_elist_2_0= ruleElementList )
            	    // InternalModelica.g:653:7: lv_pub_elist_2_0= ruleElementList
            	    {

            	    							newCompositeNode(grammarAccess.getCompositionAccess().getPub_elistElementListParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_17);
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
            	    // InternalModelica.g:672:4: (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) )
            	    {
            	    // InternalModelica.g:672:4: (otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) ) )
            	    // InternalModelica.g:673:5: otherlv_3= 'protected' ( (lv_protected_elist_4_0= ruleElementList ) )
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_18); 

            	    					newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getProtectedKeyword_1_1_0());
            	    				
            	    // InternalModelica.g:677:5: ( (lv_protected_elist_4_0= ruleElementList ) )
            	    // InternalModelica.g:678:6: (lv_protected_elist_4_0= ruleElementList )
            	    {
            	    // InternalModelica.g:678:6: (lv_protected_elist_4_0= ruleElementList )
            	    // InternalModelica.g:679:7: lv_protected_elist_4_0= ruleElementList
            	    {

            	    							newCompositeNode(grammarAccess.getCompositionAccess().getProtected_elistElementListParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_17);
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
            	    // InternalModelica.g:698:4: ( (lv_eq_secs_5_0= ruleEquationSection ) )
            	    {
            	    // InternalModelica.g:698:4: ( (lv_eq_secs_5_0= ruleEquationSection ) )
            	    // InternalModelica.g:699:5: (lv_eq_secs_5_0= ruleEquationSection )
            	    {
            	    // InternalModelica.g:699:5: (lv_eq_secs_5_0= ruleEquationSection )
            	    // InternalModelica.g:700:6: lv_eq_secs_5_0= ruleEquationSection
            	    {

            	    						newCompositeNode(grammarAccess.getCompositionAccess().getEq_secsEquationSectionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    // InternalModelica.g:718:4: ( (lv_alg_secs_6_0= ruleAlgorithmSection ) )
            	    {
            	    // InternalModelica.g:718:4: ( (lv_alg_secs_6_0= ruleAlgorithmSection ) )
            	    // InternalModelica.g:719:5: (lv_alg_secs_6_0= ruleAlgorithmSection )
            	    {
            	    // InternalModelica.g:719:5: (lv_alg_secs_6_0= ruleAlgorithmSection )
            	    // InternalModelica.g:720:6: lv_alg_secs_6_0= ruleAlgorithmSection
            	    {

            	    						newCompositeNode(grammarAccess.getCompositionAccess().getAlg_secsAlgorithmSectionParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop13;
                }
            } while (true);

            // InternalModelica.g:738:3: (otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalModelica.g:739:4: otherlv_7= 'external' ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )? ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )? ( (lv_ext_anno_10_0= ruleAnnotation ) )? otherlv_11= ';'
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getCompositionAccess().getExternalKeyword_2_0());
                    			
                    // InternalModelica.g:743:4: ( (lv_ext_lang_spec_8_0= ruleLanguageSpecification ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_STRING) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalModelica.g:744:5: (lv_ext_lang_spec_8_0= ruleLanguageSpecification )
                            {
                            // InternalModelica.g:744:5: (lv_ext_lang_spec_8_0= ruleLanguageSpecification )
                            // InternalModelica.g:745:6: lv_ext_lang_spec_8_0= ruleLanguageSpecification
                            {

                            						newCompositeNode(grammarAccess.getCompositionAccess().getExt_lang_specLanguageSpecificationParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_20);
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

                    // InternalModelica.g:762:4: ( (lv_ext_func_call_9_0= ruleExternalFunctionCall ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_IDENT||LA15_0==100) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalModelica.g:763:5: (lv_ext_func_call_9_0= ruleExternalFunctionCall )
                            {
                            // InternalModelica.g:763:5: (lv_ext_func_call_9_0= ruleExternalFunctionCall )
                            // InternalModelica.g:764:6: lv_ext_func_call_9_0= ruleExternalFunctionCall
                            {

                            						newCompositeNode(grammarAccess.getCompositionAccess().getExt_func_callExternalFunctionCallParserRuleCall_2_2_0());
                            					
                            pushFollow(FOLLOW_21);
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

                    // InternalModelica.g:781:4: ( (lv_ext_anno_10_0= ruleAnnotation ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==101) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalModelica.g:782:5: (lv_ext_anno_10_0= ruleAnnotation )
                            {
                            // InternalModelica.g:782:5: (lv_ext_anno_10_0= ruleAnnotation )
                            // InternalModelica.g:783:6: lv_ext_anno_10_0= ruleAnnotation
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

                    otherlv_11=(Token)match(input,19,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getCompositionAccess().getSemicolonKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalModelica.g:805:3: ( ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==101) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalModelica.g:806:4: ( (lv_anno_12_0= ruleAnnotation ) ) otherlv_13= ';'
                    {
                    // InternalModelica.g:806:4: ( (lv_anno_12_0= ruleAnnotation ) )
                    // InternalModelica.g:807:5: (lv_anno_12_0= ruleAnnotation )
                    {
                    // InternalModelica.g:807:5: (lv_anno_12_0= ruleAnnotation )
                    // InternalModelica.g:808:6: lv_anno_12_0= ruleAnnotation
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
    // InternalModelica.g:834:1: entryRuleLanguageSpecification returns [String current=null] : iv_ruleLanguageSpecification= ruleLanguageSpecification EOF ;
    public final String entryRuleLanguageSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLanguageSpecification = null;


        try {
            // InternalModelica.g:834:61: (iv_ruleLanguageSpecification= ruleLanguageSpecification EOF )
            // InternalModelica.g:835:2: iv_ruleLanguageSpecification= ruleLanguageSpecification EOF
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
    // InternalModelica.g:841:1: ruleLanguageSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleLanguageSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalModelica.g:847:2: (this_STRING_0= RULE_STRING )
            // InternalModelica.g:848:2: this_STRING_0= RULE_STRING
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
    // InternalModelica.g:858:1: entryRuleExternalFunctionCall returns [EObject current=null] : iv_ruleExternalFunctionCall= ruleExternalFunctionCall EOF ;
    public final EObject entryRuleExternalFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalFunctionCall = null;


        try {
            // InternalModelica.g:858:61: (iv_ruleExternalFunctionCall= ruleExternalFunctionCall EOF )
            // InternalModelica.g:859:2: iv_ruleExternalFunctionCall= ruleExternalFunctionCall EOF
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
    // InternalModelica.g:865:1: ruleExternalFunctionCall returns [EObject current=null] : ( ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')' ) ;
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
            // InternalModelica.g:871:2: ( ( ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')' ) )
            // InternalModelica.g:872:2: ( ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')' )
            {
            // InternalModelica.g:872:2: ( ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')' )
            // InternalModelica.g:873:3: ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )? ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '(' ( (lv_args_4_0= ruleExpressionList ) )? otherlv_5= ')'
            {
            // InternalModelica.g:873:3: ( ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '=' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==100) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_IDENT) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==RULE_IDENT||LA19_2==40||LA19_2==95||LA19_2==100) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalModelica.g:874:4: ( (lv_lhs_0_0= ruleComponentReference ) ) otherlv_1= '='
                    {
                    // InternalModelica.g:874:4: ( (lv_lhs_0_0= ruleComponentReference ) )
                    // InternalModelica.g:875:5: (lv_lhs_0_0= ruleComponentReference )
                    {
                    // InternalModelica.g:875:5: (lv_lhs_0_0= ruleComponentReference )
                    // InternalModelica.g:876:6: lv_lhs_0_0= ruleComponentReference
                    {

                    						newCompositeNode(grammarAccess.getExternalFunctionCallAccess().getLhsComponentReferenceParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    otherlv_1=(Token)match(input,40,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getExternalFunctionCallAccess().getEqualsSignKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalModelica.g:898:3: ( (lv_name_2_0= RULE_IDENT ) )
            // InternalModelica.g:899:4: (lv_name_2_0= RULE_IDENT )
            {
            // InternalModelica.g:899:4: (lv_name_2_0= RULE_IDENT )
            // InternalModelica.g:900:5: lv_name_2_0= RULE_IDENT
            {
            lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_24); 

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

            otherlv_3=(Token)match(input,41,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalFunctionCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalModelica.g:920:3: ( (lv_args_4_0= ruleExpressionList ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_IDENT && LA20_0<=RULE_TRUE_FALSE)||LA20_0==35||LA20_0==58||LA20_0==63||LA20_0==95||LA20_0==97||(LA20_0>=99 && LA20_0<=100)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModelica.g:921:4: (lv_args_4_0= ruleExpressionList )
                    {
                    // InternalModelica.g:921:4: (lv_args_4_0= ruleExpressionList )
                    // InternalModelica.g:922:5: lv_args_4_0= ruleExpressionList
                    {

                    					newCompositeNode(grammarAccess.getExternalFunctionCallAccess().getArgsExpressionListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_26);
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
    // InternalModelica.g:947:1: entryRuleElementList returns [EObject current=null] : iv_ruleElementList= ruleElementList EOF ;
    public final EObject entryRuleElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementList = null;


        try {
            // InternalModelica.g:947:52: (iv_ruleElementList= ruleElementList EOF )
            // InternalModelica.g:948:2: iv_ruleElementList= ruleElementList EOF
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
    // InternalModelica.g:954:1: ruleElementList returns [EObject current=null] : ( () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )* ) ;
    public final EObject ruleElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_elem_1_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:960:2: ( ( () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )* ) )
            // InternalModelica.g:961:2: ( () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )* )
            {
            // InternalModelica.g:961:2: ( () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )* )
            // InternalModelica.g:962:3: () ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )*
            {
            // InternalModelica.g:962:3: ()
            // InternalModelica.g:963:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElementListAccess().getElementListAction_0(),
            					current);
            			

            }

            // InternalModelica.g:969:3: ( ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_IDENT||(LA21_0>=20 && LA21_0<=34)||(LA21_0>=43 && LA21_0<=47)||LA21_0==49||(LA21_0>=51 && LA21_0<=57)||LA21_0==100) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalModelica.g:970:4: ( (lv_elem_1_0= ruleElement ) ) otherlv_2= ';'
            	    {
            	    // InternalModelica.g:970:4: ( (lv_elem_1_0= ruleElement ) )
            	    // InternalModelica.g:971:5: (lv_elem_1_0= ruleElement )
            	    {
            	    // InternalModelica.g:971:5: (lv_elem_1_0= ruleElement )
            	    // InternalModelica.g:972:6: lv_elem_1_0= ruleElement
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

            	    otherlv_2=(Token)match(input,19,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getElementListAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalModelica.g:998:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalModelica.g:998:48: (iv_ruleElement= ruleElement EOF )
            // InternalModelica.g:999:2: iv_ruleElement= ruleElement EOF
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
    // InternalModelica.g:1005:1: ruleElement returns [EObject current=null] : (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) ) ) ;
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
            // InternalModelica.g:1011:2: ( (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) ) ) )
            // InternalModelica.g:1012:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) ) )
            {
            // InternalModelica.g:1012:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt29=1;
                }
                break;
            case 49:
                {
                alt29=2;
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
            case 100:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalModelica.g:1013:3: this_ImportClause_0= ruleImportClause
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
                    // InternalModelica.g:1022:3: this_ExtendsClause_1= ruleExtendsClause
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
                    // InternalModelica.g:1031:3: ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) )
                    {
                    // InternalModelica.g:1031:3: ( (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) ) )
                    // InternalModelica.g:1032:4: (otherlv_2= 'redeclare' )? (otherlv_3= 'final' )? (otherlv_4= 'inner' )? (otherlv_5= 'outer' )? ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) )
                    {
                    // InternalModelica.g:1032:4: (otherlv_2= 'redeclare' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==43) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalModelica.g:1033:5: otherlv_2= 'redeclare'
                            {
                            otherlv_2=(Token)match(input,43,FOLLOW_28); 

                            					newLeafNode(otherlv_2, grammarAccess.getElementAccess().getRedeclareKeyword_2_0());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:1038:4: (otherlv_3= 'final' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==20) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalModelica.g:1039:5: otherlv_3= 'final'
                            {
                            otherlv_3=(Token)match(input,20,FOLLOW_28); 

                            					newLeafNode(otherlv_3, grammarAccess.getElementAccess().getFinalKeyword_2_1());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:1044:4: (otherlv_4= 'inner' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==44) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalModelica.g:1045:5: otherlv_4= 'inner'
                            {
                            otherlv_4=(Token)match(input,44,FOLLOW_29); 

                            					newLeafNode(otherlv_4, grammarAccess.getElementAccess().getInnerKeyword_2_2());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:1050:4: (otherlv_5= 'outer' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==45) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalModelica.g:1051:5: otherlv_5= 'outer'
                            {
                            otherlv_5=(Token)match(input,45,FOLLOW_30); 

                            					newLeafNode(otherlv_5, grammarAccess.getElementAccess().getOuterKeyword_2_3());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:1056:4: ( (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause ) | (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==EOF||LA28_0==RULE_IDENT||(LA28_0>=21 && LA28_0<=34)||(LA28_0>=51 && LA28_0<=57)||LA28_0==100) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==46) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalModelica.g:1057:5: (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause )
                            {
                            // InternalModelica.g:1057:5: (this_ClassDefinition_6= ruleClassDefinition | this_ComponentClause_7= ruleComponentClause )
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( ((LA26_0>=21 && LA26_0<=34)) ) {
                                alt26=1;
                            }
                            else if ( (LA26_0==EOF||LA26_0==RULE_IDENT||(LA26_0>=51 && LA26_0<=57)||LA26_0==100) ) {
                                alt26=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 26, 0, input);

                                throw nvae;
                            }
                            switch (alt26) {
                                case 1 :
                                    // InternalModelica.g:1058:6: this_ClassDefinition_6= ruleClassDefinition
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
                                    // InternalModelica.g:1067:6: this_ComponentClause_7= ruleComponentClause
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
                            // InternalModelica.g:1077:5: (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) )
                            {
                            // InternalModelica.g:1077:5: (otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause ) )
                            // InternalModelica.g:1078:6: otherlv_8= 'replaceable' (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause )
                            {
                            otherlv_8=(Token)match(input,46,FOLLOW_31); 

                            						newLeafNode(otherlv_8, grammarAccess.getElementAccess().getReplaceableKeyword_2_4_1_0());
                            					
                            // InternalModelica.g:1082:6: (this_ClassDefinition_9= ruleClassDefinition | this_ComponentClause_10= ruleComponentClause )
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( ((LA27_0>=21 && LA27_0<=34)) ) {
                                alt27=1;
                            }
                            else if ( (LA27_0==EOF||LA27_0==RULE_IDENT||(LA27_0>=51 && LA27_0<=57)||LA27_0==100) ) {
                                alt27=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 27, 0, input);

                                throw nvae;
                            }
                            switch (alt27) {
                                case 1 :
                                    // InternalModelica.g:1083:7: this_ClassDefinition_9= ruleClassDefinition
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
                                    // InternalModelica.g:1092:7: this_ComponentClause_10= ruleComponentClause
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
    // InternalModelica.g:1108:1: entryRuleImportClause returns [EObject current=null] : iv_ruleImportClause= ruleImportClause EOF ;
    public final EObject entryRuleImportClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportClause = null;


        try {
            // InternalModelica.g:1108:53: (iv_ruleImportClause= ruleImportClause EOF )
            // InternalModelica.g:1109:2: iv_ruleImportClause= ruleImportClause EOF
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
    // InternalModelica.g:1115:1: ruleImportClause returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? ) ) ( (lv_comment_10_0= ruleComment ) ) ) ;
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
            // InternalModelica.g:1121:2: ( (otherlv_0= 'import' ( ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? ) ) ( (lv_comment_10_0= ruleComment ) ) ) )
            // InternalModelica.g:1122:2: (otherlv_0= 'import' ( ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? ) ) ( (lv_comment_10_0= ruleComment ) ) )
            {
            // InternalModelica.g:1122:2: (otherlv_0= 'import' ( ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? ) ) ( (lv_comment_10_0= ruleComment ) ) )
            // InternalModelica.g:1123:3: otherlv_0= 'import' ( ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? ) ) ( (lv_comment_10_0= ruleComment ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportClauseAccess().getImportKeyword_0());
            		
            // InternalModelica.g:1127:3: ( ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) ) | ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_IDENT) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==EOF||LA33_1==RULE_STRING||LA33_1==19||LA33_1==36||LA33_1==41||LA33_1==48||(LA33_1>=100 && LA33_1<=101)) ) {
                    alt33=2;
                }
                else if ( (LA33_1==40) ) {
                    alt33=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==100) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalModelica.g:1128:4: ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) )
                    {
                    // InternalModelica.g:1128:4: ( ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) ) )
                    // InternalModelica.g:1129:5: ( (lv_id_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_name_3_0= ruleName ) )
                    {
                    // InternalModelica.g:1129:5: ( (lv_id_1_0= RULE_IDENT ) )
                    // InternalModelica.g:1130:6: (lv_id_1_0= RULE_IDENT )
                    {
                    // InternalModelica.g:1130:6: (lv_id_1_0= RULE_IDENT )
                    // InternalModelica.g:1131:7: lv_id_1_0= RULE_IDENT
                    {
                    lv_id_1_0=(Token)match(input,RULE_IDENT,FOLLOW_23); 

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

                    otherlv_2=(Token)match(input,40,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getImportClauseAccess().getEqualsSignKeyword_1_0_1());
                    				
                    // InternalModelica.g:1151:5: ( (lv_name_3_0= ruleName ) )
                    // InternalModelica.g:1152:6: (lv_name_3_0= ruleName )
                    {
                    // InternalModelica.g:1152:6: (lv_name_3_0= ruleName )
                    // InternalModelica.g:1153:7: lv_name_3_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getImportClauseAccess().getNameNameParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_16);
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
                    // InternalModelica.g:1172:4: ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? )
                    {
                    // InternalModelica.g:1172:4: ( ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )? )
                    // InternalModelica.g:1173:5: ruleName ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )?
                    {

                    					newCompositeNode(grammarAccess.getImportClauseAccess().getNameParserRuleCall_1_1_0());
                    				
                    pushFollow(FOLLOW_32);
                    ruleName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalModelica.g:1180:5: ( (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==36||LA32_0==41||LA32_0==48) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalModelica.g:1181:6: (otherlv_5= ',' )? (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) )
                            {
                            // InternalModelica.g:1181:6: (otherlv_5= ',' )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==36) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // InternalModelica.g:1182:7: otherlv_5= ','
                                    {
                                    otherlv_5=(Token)match(input,36,FOLLOW_33); 

                                    							newLeafNode(otherlv_5, grammarAccess.getImportClauseAccess().getCommaKeyword_1_1_1_0());
                                    						

                                    }
                                    break;

                            }

                            // InternalModelica.g:1187:6: (otherlv_6= '*' | (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' ) )
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==48) ) {
                                alt31=1;
                            }
                            else if ( (LA31_0==41) ) {
                                alt31=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 31, 0, input);

                                throw nvae;
                            }
                            switch (alt31) {
                                case 1 :
                                    // InternalModelica.g:1188:7: otherlv_6= '*'
                                    {
                                    otherlv_6=(Token)match(input,48,FOLLOW_16); 

                                    							newLeafNode(otherlv_6, grammarAccess.getImportClauseAccess().getAsteriskKeyword_1_1_1_1_0());
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalModelica.g:1193:7: (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' )
                                    {
                                    // InternalModelica.g:1193:7: (otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')' )
                                    // InternalModelica.g:1194:8: otherlv_7= '(' ( (lv_list_8_0= ruleImportList ) ) otherlv_9= ')'
                                    {
                                    otherlv_7=(Token)match(input,41,FOLLOW_7); 

                                    								newLeafNode(otherlv_7, grammarAccess.getImportClauseAccess().getLeftParenthesisKeyword_1_1_1_1_1_0());
                                    							
                                    // InternalModelica.g:1198:8: ( (lv_list_8_0= ruleImportList ) )
                                    // InternalModelica.g:1199:9: (lv_list_8_0= ruleImportList )
                                    {
                                    // InternalModelica.g:1199:9: (lv_list_8_0= ruleImportList )
                                    // InternalModelica.g:1200:10: lv_list_8_0= ruleImportList
                                    {

                                    										newCompositeNode(grammarAccess.getImportClauseAccess().getListImportListParserRuleCall_1_1_1_1_1_1_0());
                                    									
                                    pushFollow(FOLLOW_26);
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

                                    otherlv_9=(Token)match(input,42,FOLLOW_16); 

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

            // InternalModelica.g:1226:3: ( (lv_comment_10_0= ruleComment ) )
            // InternalModelica.g:1227:4: (lv_comment_10_0= ruleComment )
            {
            // InternalModelica.g:1227:4: (lv_comment_10_0= ruleComment )
            // InternalModelica.g:1228:5: lv_comment_10_0= ruleComment
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
    // InternalModelica.g:1249:1: entryRuleImportList returns [EObject current=null] : iv_ruleImportList= ruleImportList EOF ;
    public final EObject entryRuleImportList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportList = null;


        try {
            // InternalModelica.g:1249:51: (iv_ruleImportList= ruleImportList EOF )
            // InternalModelica.g:1250:2: iv_ruleImportList= ruleImportList EOF
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
    // InternalModelica.g:1256:1: ruleImportList returns [EObject current=null] : ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) ) )? ) ;
    public final EObject ruleImportList() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1262:2: ( ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) ) )? ) )
            // InternalModelica.g:1263:2: ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) ) )? )
            {
            // InternalModelica.g:1263:2: ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) ) )? )
            // InternalModelica.g:1264:3: ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) ) )?
            {
            // InternalModelica.g:1264:3: ( (lv_id_0_0= RULE_IDENT ) )
            // InternalModelica.g:1265:4: (lv_id_0_0= RULE_IDENT )
            {
            // InternalModelica.g:1265:4: (lv_id_0_0= RULE_IDENT )
            // InternalModelica.g:1266:5: lv_id_0_0= RULE_IDENT
            {
            lv_id_0_0=(Token)match(input,RULE_IDENT,FOLLOW_15); 

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

            // InternalModelica.g:1282:3: (otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalModelica.g:1283:4: otherlv_1= ',' ( (lv_list_2_0= ruleImportList ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getImportListAccess().getCommaKeyword_1_0());
                    			
                    // InternalModelica.g:1287:4: ( (lv_list_2_0= ruleImportList ) )
                    // InternalModelica.g:1288:5: (lv_list_2_0= ruleImportList )
                    {
                    // InternalModelica.g:1288:5: (lv_list_2_0= ruleImportList )
                    // InternalModelica.g:1289:6: lv_list_2_0= ruleImportList
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
    // InternalModelica.g:1311:1: entryRuleExtendsClause returns [EObject current=null] : iv_ruleExtendsClause= ruleExtendsClause EOF ;
    public final EObject entryRuleExtendsClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendsClause = null;


        try {
            // InternalModelica.g:1311:54: (iv_ruleExtendsClause= ruleExtendsClause EOF )
            // InternalModelica.g:1312:2: iv_ruleExtendsClause= ruleExtendsClause EOF
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
    // InternalModelica.g:1318:1: ruleExtendsClause returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )? ) ;
    public final EObject ruleExtendsClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_mod_2_0 = null;

        EObject lv_anno_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1324:2: ( (otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )? ) )
            // InternalModelica.g:1325:2: (otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )? )
            {
            // InternalModelica.g:1325:2: (otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )? )
            // InternalModelica.g:1326:3: otherlv_0= 'extends' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ( (lv_anno_3_0= ruleAnnotation ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendsClauseAccess().getExtendsKeyword_0());
            		
            // InternalModelica.g:1330:3: ( (lv_name_1_0= ruleName ) )
            // InternalModelica.g:1331:4: (lv_name_1_0= ruleName )
            {
            // InternalModelica.g:1331:4: (lv_name_1_0= ruleName )
            // InternalModelica.g:1332:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getExtendsClauseAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalModelica.g:1349:3: ( (lv_mod_2_0= ruleClassModification ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalModelica.g:1350:4: (lv_mod_2_0= ruleClassModification )
                    {
                    // InternalModelica.g:1350:4: (lv_mod_2_0= ruleClassModification )
                    // InternalModelica.g:1351:5: lv_mod_2_0= ruleClassModification
                    {

                    					newCompositeNode(grammarAccess.getExtendsClauseAccess().getModClassModificationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_22);
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

            // InternalModelica.g:1368:3: ( (lv_anno_3_0= ruleAnnotation ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==101) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalModelica.g:1369:4: (lv_anno_3_0= ruleAnnotation )
                    {
                    // InternalModelica.g:1369:4: (lv_anno_3_0= ruleAnnotation )
                    // InternalModelica.g:1370:5: lv_anno_3_0= ruleAnnotation
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
    // InternalModelica.g:1391:1: entryRuleConstrainingClause returns [EObject current=null] : iv_ruleConstrainingClause= ruleConstrainingClause EOF ;
    public final EObject entryRuleConstrainingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrainingClause = null;


        try {
            // InternalModelica.g:1391:59: (iv_ruleConstrainingClause= ruleConstrainingClause EOF )
            // InternalModelica.g:1392:2: iv_ruleConstrainingClause= ruleConstrainingClause EOF
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
    // InternalModelica.g:1398:1: ruleConstrainingClause returns [EObject current=null] : (otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ) ;
    public final EObject ruleConstrainingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_mod_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1404:2: ( (otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? ) )
            // InternalModelica.g:1405:2: (otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? )
            {
            // InternalModelica.g:1405:2: (otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )? )
            // InternalModelica.g:1406:3: otherlv_0= 'constrainedby' ( (lv_name_1_0= ruleName ) ) ( (lv_mod_2_0= ruleClassModification ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstrainingClauseAccess().getConstrainedbyKeyword_0());
            		
            // InternalModelica.g:1410:3: ( (lv_name_1_0= ruleName ) )
            // InternalModelica.g:1411:4: (lv_name_1_0= ruleName )
            {
            // InternalModelica.g:1411:4: (lv_name_1_0= ruleName )
            // InternalModelica.g:1412:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getConstrainingClauseAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalModelica.g:1429:3: ( (lv_mod_2_0= ruleClassModification ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalModelica.g:1430:4: (lv_mod_2_0= ruleClassModification )
                    {
                    // InternalModelica.g:1430:4: (lv_mod_2_0= ruleClassModification )
                    // InternalModelica.g:1431:5: lv_mod_2_0= ruleClassModification
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
    // InternalModelica.g:1452:1: entryRuleComponentClause returns [EObject current=null] : iv_ruleComponentClause= ruleComponentClause EOF ;
    public final EObject entryRuleComponentClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClause = null;


        try {
            // InternalModelica.g:1452:56: (iv_ruleComponentClause= ruleComponentClause EOF )
            // InternalModelica.g:1453:2: iv_ruleComponentClause= ruleComponentClause EOF
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
    // InternalModelica.g:1459:1: ruleComponentClause returns [EObject current=null] : ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_subs_2_0= ruleArraySubscripts ) )? ( (lv_comps_3_0= ruleComponentList ) ) ) ;
    public final EObject ruleComponentClause() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_prefix_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_subs_2_0 = null;

        EObject lv_comps_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1465:2: ( ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_subs_2_0= ruleArraySubscripts ) )? ( (lv_comps_3_0= ruleComponentList ) ) ) )
            // InternalModelica.g:1466:2: ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_subs_2_0= ruleArraySubscripts ) )? ( (lv_comps_3_0= ruleComponentList ) ) )
            {
            // InternalModelica.g:1466:2: ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_subs_2_0= ruleArraySubscripts ) )? ( (lv_comps_3_0= ruleComponentList ) ) )
            // InternalModelica.g:1467:3: ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_subs_2_0= ruleArraySubscripts ) )? ( (lv_comps_3_0= ruleComponentList ) )
            {
            // InternalModelica.g:1467:3: ( (lv_prefix_0_0= ruleTypePrefix ) )
            // InternalModelica.g:1468:4: (lv_prefix_0_0= ruleTypePrefix )
            {
            // InternalModelica.g:1468:4: (lv_prefix_0_0= ruleTypePrefix )
            // InternalModelica.g:1469:5: lv_prefix_0_0= ruleTypePrefix
            {

            					newCompositeNode(grammarAccess.getComponentClauseAccess().getPrefixTypePrefixParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalModelica.g:1486:3: ( (lv_type_1_0= ruleTypeSpecifier ) )
            // InternalModelica.g:1487:4: (lv_type_1_0= ruleTypeSpecifier )
            {
            // InternalModelica.g:1487:4: (lv_type_1_0= ruleTypeSpecifier )
            // InternalModelica.g:1488:5: lv_type_1_0= ruleTypeSpecifier
            {

            					newCompositeNode(grammarAccess.getComponentClauseAccess().getTypeTypeSpecifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalModelica.g:1505:3: ( (lv_subs_2_0= ruleArraySubscripts ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==95) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalModelica.g:1506:4: (lv_subs_2_0= ruleArraySubscripts )
                    {
                    // InternalModelica.g:1506:4: (lv_subs_2_0= ruleArraySubscripts )
                    // InternalModelica.g:1507:5: lv_subs_2_0= ruleArraySubscripts
                    {

                    					newCompositeNode(grammarAccess.getComponentClauseAccess().getSubsArraySubscriptsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_36);
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

            // InternalModelica.g:1524:3: ( (lv_comps_3_0= ruleComponentList ) )
            // InternalModelica.g:1525:4: (lv_comps_3_0= ruleComponentList )
            {
            // InternalModelica.g:1525:4: (lv_comps_3_0= ruleComponentList )
            // InternalModelica.g:1526:5: lv_comps_3_0= ruleComponentList
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
    // InternalModelica.g:1547:1: entryRuleTypePrefix returns [String current=null] : iv_ruleTypePrefix= ruleTypePrefix EOF ;
    public final String entryRuleTypePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypePrefix = null;


        try {
            // InternalModelica.g:1547:50: (iv_ruleTypePrefix= ruleTypePrefix EOF )
            // InternalModelica.g:1548:2: iv_ruleTypePrefix= ruleTypePrefix EOF
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
    // InternalModelica.g:1554:1: ruleTypePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )? ) ;
    public final AntlrDatatypeRuleToken ruleTypePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:1560:2: ( ( (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )? ) )
            // InternalModelica.g:1561:2: ( (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )? )
            {
            // InternalModelica.g:1561:2: ( (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )? )
            // InternalModelica.g:1562:3: (kw= 'flow' | kw= 'stream' )? (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )? (kw= 'input' | kw= 'output' )?
            {
            // InternalModelica.g:1562:3: (kw= 'flow' | kw= 'stream' )?
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            else if ( (LA39_0==52) ) {
                alt39=2;
            }
            switch (alt39) {
                case 1 :
                    // InternalModelica.g:1563:4: kw= 'flow'
                    {
                    kw=(Token)match(input,51,FOLLOW_37); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getFlowKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:1569:4: kw= 'stream'
                    {
                    kw=(Token)match(input,52,FOLLOW_37); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getStreamKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalModelica.g:1575:3: (kw= 'discrete' | kw= 'parameter' | kw= 'constant' )?
            int alt40=4;
            switch ( input.LA(1) ) {
                case 53:
                    {
                    alt40=1;
                    }
                    break;
                case 54:
                    {
                    alt40=2;
                    }
                    break;
                case 55:
                    {
                    alt40=3;
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // InternalModelica.g:1576:4: kw= 'discrete'
                    {
                    kw=(Token)match(input,53,FOLLOW_38); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getDiscreteKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:1582:4: kw= 'parameter'
                    {
                    kw=(Token)match(input,54,FOLLOW_38); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getParameterKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalModelica.g:1588:4: kw= 'constant'
                    {
                    kw=(Token)match(input,55,FOLLOW_38); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getConstantKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalModelica.g:1594:3: (kw= 'input' | kw= 'output' )?
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==56) ) {
                alt41=1;
            }
            else if ( (LA41_0==57) ) {
                alt41=2;
            }
            switch (alt41) {
                case 1 :
                    // InternalModelica.g:1595:4: kw= 'input'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypePrefixAccess().getInputKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:1601:4: kw= 'output'
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
    // InternalModelica.g:1611:1: entryRuleTypeSpecifier returns [EObject current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final EObject entryRuleTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecifier = null;


        try {
            // InternalModelica.g:1611:54: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // InternalModelica.g:1612:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
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
    // InternalModelica.g:1618:1: ruleTypeSpecifier returns [EObject current=null] : ( ( ruleName ) ) ;
    public final EObject ruleTypeSpecifier() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalModelica.g:1624:2: ( ( ( ruleName ) ) )
            // InternalModelica.g:1625:2: ( ( ruleName ) )
            {
            // InternalModelica.g:1625:2: ( ( ruleName ) )
            // InternalModelica.g:1626:3: ( ruleName )
            {
            // InternalModelica.g:1626:3: ( ruleName )
            // InternalModelica.g:1627:4: ruleName
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
    // InternalModelica.g:1644:1: entryRuleComponentList returns [EObject current=null] : iv_ruleComponentList= ruleComponentList EOF ;
    public final EObject entryRuleComponentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentList = null;


        try {
            // InternalModelica.g:1644:54: (iv_ruleComponentList= ruleComponentList EOF )
            // InternalModelica.g:1645:2: iv_ruleComponentList= ruleComponentList EOF
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
    // InternalModelica.g:1651:1: ruleComponentList returns [EObject current=null] : ( ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )* ) ;
    public final EObject ruleComponentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_comps_0_0 = null;

        EObject lv_comps_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1657:2: ( ( ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )* ) )
            // InternalModelica.g:1658:2: ( ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )* )
            {
            // InternalModelica.g:1658:2: ( ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )* )
            // InternalModelica.g:1659:3: ( (lv_comps_0_0= ruleComponentDeclaration ) ) (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )*
            {
            // InternalModelica.g:1659:3: ( (lv_comps_0_0= ruleComponentDeclaration ) )
            // InternalModelica.g:1660:4: (lv_comps_0_0= ruleComponentDeclaration )
            {
            // InternalModelica.g:1660:4: (lv_comps_0_0= ruleComponentDeclaration )
            // InternalModelica.g:1661:5: lv_comps_0_0= ruleComponentDeclaration
            {

            					newCompositeNode(grammarAccess.getComponentListAccess().getCompsComponentDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalModelica.g:1678:3: (otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==36) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalModelica.g:1679:4: otherlv_1= ',' ( (lv_comps_2_0= ruleComponentDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_36); 

            	    				newLeafNode(otherlv_1, grammarAccess.getComponentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:1683:4: ( (lv_comps_2_0= ruleComponentDeclaration ) )
            	    // InternalModelica.g:1684:5: (lv_comps_2_0= ruleComponentDeclaration )
            	    {
            	    // InternalModelica.g:1684:5: (lv_comps_2_0= ruleComponentDeclaration )
            	    // InternalModelica.g:1685:6: lv_comps_2_0= ruleComponentDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getComponentListAccess().getCompsComponentDeclarationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	    break loop42;
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
    // InternalModelica.g:1707:1: entryRuleComponentDeclaration returns [EObject current=null] : iv_ruleComponentDeclaration= ruleComponentDeclaration EOF ;
    public final EObject entryRuleComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDeclaration = null;


        try {
            // InternalModelica.g:1707:61: (iv_ruleComponentDeclaration= ruleComponentDeclaration EOF )
            // InternalModelica.g:1708:2: iv_ruleComponentDeclaration= ruleComponentDeclaration EOF
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
    // InternalModelica.g:1714:1: ruleComponentDeclaration returns [EObject current=null] : ( ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) ) ) ;
    public final EObject ruleComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_decl_0_0 = null;

        EObject lv_cond_1_0 = null;

        EObject lv_comment_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1720:2: ( ( ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) ) ) )
            // InternalModelica.g:1721:2: ( ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) ) )
            {
            // InternalModelica.g:1721:2: ( ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) ) )
            // InternalModelica.g:1722:3: ( (lv_decl_0_0= ruleDeclaration ) ) ( (lv_cond_1_0= ruleConditionAttribute ) )? ( (lv_comment_2_0= ruleComment ) )
            {
            // InternalModelica.g:1722:3: ( (lv_decl_0_0= ruleDeclaration ) )
            // InternalModelica.g:1723:4: (lv_decl_0_0= ruleDeclaration )
            {
            // InternalModelica.g:1723:4: (lv_decl_0_0= ruleDeclaration )
            // InternalModelica.g:1724:5: lv_decl_0_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getComponentDeclarationAccess().getDeclDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_39);
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

            // InternalModelica.g:1741:3: ( (lv_cond_1_0= ruleConditionAttribute ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==58) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalModelica.g:1742:4: (lv_cond_1_0= ruleConditionAttribute )
                    {
                    // InternalModelica.g:1742:4: (lv_cond_1_0= ruleConditionAttribute )
                    // InternalModelica.g:1743:5: lv_cond_1_0= ruleConditionAttribute
                    {

                    					newCompositeNode(grammarAccess.getComponentDeclarationAccess().getCondConditionAttributeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_16);
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

            // InternalModelica.g:1760:3: ( (lv_comment_2_0= ruleComment ) )
            // InternalModelica.g:1761:4: (lv_comment_2_0= ruleComment )
            {
            // InternalModelica.g:1761:4: (lv_comment_2_0= ruleComment )
            // InternalModelica.g:1762:5: lv_comment_2_0= ruleComment
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
    // InternalModelica.g:1783:1: entryRuleConditionAttribute returns [EObject current=null] : iv_ruleConditionAttribute= ruleConditionAttribute EOF ;
    public final EObject entryRuleConditionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionAttribute = null;


        try {
            // InternalModelica.g:1783:59: (iv_ruleConditionAttribute= ruleConditionAttribute EOF )
            // InternalModelica.g:1784:2: iv_ruleConditionAttribute= ruleConditionAttribute EOF
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
    // InternalModelica.g:1790:1: ruleConditionAttribute returns [EObject current=null] : (otherlv_0= 'if' this_Expression_1= ruleExpression ) ;
    public final EObject ruleConditionAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalModelica.g:1796:2: ( (otherlv_0= 'if' this_Expression_1= ruleExpression ) )
            // InternalModelica.g:1797:2: (otherlv_0= 'if' this_Expression_1= ruleExpression )
            {
            // InternalModelica.g:1797:2: (otherlv_0= 'if' this_Expression_1= ruleExpression )
            // InternalModelica.g:1798:3: otherlv_0= 'if' this_Expression_1= ruleExpression
            {
            otherlv_0=(Token)match(input,58,FOLLOW_40); 

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
    // InternalModelica.g:1814:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalModelica.g:1814:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalModelica.g:1815:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalModelica.g:1821:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )? ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_subscripts_1_0 = null;

        EObject lv_mod_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:1827:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )? ) )
            // InternalModelica.g:1828:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )? )
            {
            // InternalModelica.g:1828:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )? )
            // InternalModelica.g:1829:3: ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_subscripts_1_0= ruleArraySubscripts ) )? ( (lv_mod_2_0= ruleModification ) )?
            {
            // InternalModelica.g:1829:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalModelica.g:1830:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalModelica.g:1830:4: (lv_name_0_0= RULE_IDENT )
            // InternalModelica.g:1831:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_41); 

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

            // InternalModelica.g:1847:3: ( (lv_subscripts_1_0= ruleArraySubscripts ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==95) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalModelica.g:1848:4: (lv_subscripts_1_0= ruleArraySubscripts )
                    {
                    // InternalModelica.g:1848:4: (lv_subscripts_1_0= ruleArraySubscripts )
                    // InternalModelica.g:1849:5: lv_subscripts_1_0= ruleArraySubscripts
                    {

                    					newCompositeNode(grammarAccess.getDeclarationAccess().getSubscriptsArraySubscriptsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_42);
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

            // InternalModelica.g:1866:3: ( (lv_mod_2_0= ruleModification ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=40 && LA45_0<=41)||LA45_0==59) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalModelica.g:1867:4: (lv_mod_2_0= ruleModification )
                    {
                    // InternalModelica.g:1867:4: (lv_mod_2_0= ruleModification )
                    // InternalModelica.g:1868:5: lv_mod_2_0= ruleModification
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
    // InternalModelica.g:1889:1: entryRuleModification returns [EObject current=null] : iv_ruleModification= ruleModification EOF ;
    public final EObject entryRuleModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModification = null;


        try {
            // InternalModelica.g:1889:53: (iv_ruleModification= ruleModification EOF )
            // InternalModelica.g:1890:2: iv_ruleModification= ruleModification EOF
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
    // InternalModelica.g:1896:1: ruleModification returns [EObject current=null] : ( ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? ) | (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) ) | (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) ) ) ;
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
            // InternalModelica.g:1902:2: ( ( ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? ) | (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) ) | (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) ) ) )
            // InternalModelica.g:1903:2: ( ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? ) | (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) ) | (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) ) )
            {
            // InternalModelica.g:1903:2: ( ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? ) | (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) ) | (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt47=1;
                }
                break;
            case 40:
                {
                alt47=2;
                }
                break;
            case 59:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalModelica.g:1904:3: ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? )
                    {
                    // InternalModelica.g:1904:3: ( ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )? )
                    // InternalModelica.g:1905:4: ( (lv_mod_0_0= ruleClassModification ) ) (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )?
                    {
                    // InternalModelica.g:1905:4: ( (lv_mod_0_0= ruleClassModification ) )
                    // InternalModelica.g:1906:5: (lv_mod_0_0= ruleClassModification )
                    {
                    // InternalModelica.g:1906:5: (lv_mod_0_0= ruleClassModification )
                    // InternalModelica.g:1907:6: lv_mod_0_0= ruleClassModification
                    {

                    						newCompositeNode(grammarAccess.getModificationAccess().getModClassModificationParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_43);
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

                    // InternalModelica.g:1924:4: (otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==40) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalModelica.g:1925:5: otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
                            {
                            otherlv_1=(Token)match(input,40,FOLLOW_40); 

                            					newLeafNode(otherlv_1, grammarAccess.getModificationAccess().getEqualsSignKeyword_0_1_0());
                            				
                            // InternalModelica.g:1929:5: ( (lv_expr_2_0= ruleExpression ) )
                            // InternalModelica.g:1930:6: (lv_expr_2_0= ruleExpression )
                            {
                            // InternalModelica.g:1930:6: (lv_expr_2_0= ruleExpression )
                            // InternalModelica.g:1931:7: lv_expr_2_0= ruleExpression
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
                    // InternalModelica.g:1951:3: (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) )
                    {
                    // InternalModelica.g:1951:3: (otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) ) )
                    // InternalModelica.g:1952:4: otherlv_3= '=' ( (lv_expr_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getModificationAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalModelica.g:1956:4: ( (lv_expr_4_0= ruleExpression ) )
                    // InternalModelica.g:1957:5: (lv_expr_4_0= ruleExpression )
                    {
                    // InternalModelica.g:1957:5: (lv_expr_4_0= ruleExpression )
                    // InternalModelica.g:1958:6: lv_expr_4_0= ruleExpression
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
                    // InternalModelica.g:1977:3: (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) )
                    {
                    // InternalModelica.g:1977:3: (otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) ) )
                    // InternalModelica.g:1978:4: otherlv_5= ':=' ( (lv_expr_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,59,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getModificationAccess().getColonEqualsSignKeyword_2_0());
                    			
                    // InternalModelica.g:1982:4: ( (lv_expr_6_0= ruleExpression ) )
                    // InternalModelica.g:1983:5: (lv_expr_6_0= ruleExpression )
                    {
                    // InternalModelica.g:1983:5: (lv_expr_6_0= ruleExpression )
                    // InternalModelica.g:1984:6: lv_expr_6_0= ruleExpression
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
    // InternalModelica.g:2006:1: entryRuleClassModification returns [EObject current=null] : iv_ruleClassModification= ruleClassModification EOF ;
    public final EObject entryRuleClassModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassModification = null;


        try {
            // InternalModelica.g:2006:58: (iv_ruleClassModification= ruleClassModification EOF )
            // InternalModelica.g:2007:2: iv_ruleClassModification= ruleClassModification EOF
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
    // InternalModelica.g:2013:1: ruleClassModification returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')' ) ;
    public final EObject ruleClassModification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2019:2: ( ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')' ) )
            // InternalModelica.g:2020:2: ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')' )
            {
            // InternalModelica.g:2020:2: ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')' )
            // InternalModelica.g:2021:3: () otherlv_1= '(' ( (lv_args_2_0= ruleArgumentList ) )? otherlv_3= ')'
            {
            // InternalModelica.g:2021:3: ()
            // InternalModelica.g:2022:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassModificationAccess().getClassModificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getClassModificationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalModelica.g:2032:3: ( (lv_args_2_0= ruleArgumentList ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_IDENT||LA48_0==20||LA48_0==43||LA48_0==46||LA48_0==60||LA48_0==100) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalModelica.g:2033:4: (lv_args_2_0= ruleArgumentList )
                    {
                    // InternalModelica.g:2033:4: (lv_args_2_0= ruleArgumentList )
                    // InternalModelica.g:2034:5: lv_args_2_0= ruleArgumentList
                    {

                    					newCompositeNode(grammarAccess.getClassModificationAccess().getArgsArgumentListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_26);
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
    // InternalModelica.g:2059:1: entryRuleArgumentList returns [EObject current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final EObject entryRuleArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentList = null;


        try {
            // InternalModelica.g:2059:53: (iv_ruleArgumentList= ruleArgumentList EOF )
            // InternalModelica.g:2060:2: iv_ruleArgumentList= ruleArgumentList EOF
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
    // InternalModelica.g:2066:1: ruleArgumentList returns [EObject current=null] : ( ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )* ) ;
    public final EObject ruleArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2072:2: ( ( ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )* ) )
            // InternalModelica.g:2073:2: ( ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )* )
            {
            // InternalModelica.g:2073:2: ( ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )* )
            // InternalModelica.g:2074:3: ( (lv_args_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )*
            {
            // InternalModelica.g:2074:3: ( (lv_args_0_0= ruleArgument ) )
            // InternalModelica.g:2075:4: (lv_args_0_0= ruleArgument )
            {
            // InternalModelica.g:2075:4: (lv_args_0_0= ruleArgument )
            // InternalModelica.g:2076:5: lv_args_0_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getArgumentListAccess().getArgsArgumentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalModelica.g:2093:3: (otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==36) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalModelica.g:2094:4: otherlv_1= ',' ( (lv_args_2_0= ruleArgument ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_45); 

            	    				newLeafNode(otherlv_1, grammarAccess.getArgumentListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:2098:4: ( (lv_args_2_0= ruleArgument ) )
            	    // InternalModelica.g:2099:5: (lv_args_2_0= ruleArgument )
            	    {
            	    // InternalModelica.g:2099:5: (lv_args_2_0= ruleArgument )
            	    // InternalModelica.g:2100:6: lv_args_2_0= ruleArgument
            	    {

            	    						newCompositeNode(grammarAccess.getArgumentListAccess().getArgsArgumentParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
    // $ANTLR end "ruleArgumentList"


    // $ANTLR start "entryRuleArgument"
    // InternalModelica.g:2122:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalModelica.g:2122:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalModelica.g:2123:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalModelica.g:2129:1: ruleArgument returns [EObject current=null] : (this_ElementModicationOrReplaceable_0= ruleElementModicationOrReplaceable | this_ElementRedeclaration_1= ruleElementRedeclaration ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_ElementModicationOrReplaceable_0 = null;

        EObject this_ElementRedeclaration_1 = null;



        	enterRule();

        try {
            // InternalModelica.g:2135:2: ( (this_ElementModicationOrReplaceable_0= ruleElementModicationOrReplaceable | this_ElementRedeclaration_1= ruleElementRedeclaration ) )
            // InternalModelica.g:2136:2: (this_ElementModicationOrReplaceable_0= ruleElementModicationOrReplaceable | this_ElementRedeclaration_1= ruleElementRedeclaration )
            {
            // InternalModelica.g:2136:2: (this_ElementModicationOrReplaceable_0= ruleElementModicationOrReplaceable | this_ElementRedeclaration_1= ruleElementRedeclaration )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_IDENT||LA50_0==20||LA50_0==46||LA50_0==60||LA50_0==100) ) {
                alt50=1;
            }
            else if ( (LA50_0==43) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalModelica.g:2137:3: this_ElementModicationOrReplaceable_0= ruleElementModicationOrReplaceable
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
                    // InternalModelica.g:2146:3: this_ElementRedeclaration_1= ruleElementRedeclaration
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
    // InternalModelica.g:2158:1: entryRuleElementModicationOrReplaceable returns [EObject current=null] : iv_ruleElementModicationOrReplaceable= ruleElementModicationOrReplaceable EOF ;
    public final EObject entryRuleElementModicationOrReplaceable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementModicationOrReplaceable = null;


        try {
            // InternalModelica.g:2158:71: (iv_ruleElementModicationOrReplaceable= ruleElementModicationOrReplaceable EOF )
            // InternalModelica.g:2159:2: iv_ruleElementModicationOrReplaceable= ruleElementModicationOrReplaceable EOF
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
    // InternalModelica.g:2165:1: ruleElementModicationOrReplaceable returns [EObject current=null] : ( (otherlv_0= 'each' )? (otherlv_1= 'final' )? (this_ElementModification_2= ruleElementModification | this_ElementReplaceable_3= ruleElementReplaceable ) ) ;
    public final EObject ruleElementModicationOrReplaceable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_ElementModification_2 = null;

        EObject this_ElementReplaceable_3 = null;



        	enterRule();

        try {
            // InternalModelica.g:2171:2: ( ( (otherlv_0= 'each' )? (otherlv_1= 'final' )? (this_ElementModification_2= ruleElementModification | this_ElementReplaceable_3= ruleElementReplaceable ) ) )
            // InternalModelica.g:2172:2: ( (otherlv_0= 'each' )? (otherlv_1= 'final' )? (this_ElementModification_2= ruleElementModification | this_ElementReplaceable_3= ruleElementReplaceable ) )
            {
            // InternalModelica.g:2172:2: ( (otherlv_0= 'each' )? (otherlv_1= 'final' )? (this_ElementModification_2= ruleElementModification | this_ElementReplaceable_3= ruleElementReplaceable ) )
            // InternalModelica.g:2173:3: (otherlv_0= 'each' )? (otherlv_1= 'final' )? (this_ElementModification_2= ruleElementModification | this_ElementReplaceable_3= ruleElementReplaceable )
            {
            // InternalModelica.g:2173:3: (otherlv_0= 'each' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==60) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalModelica.g:2174:4: otherlv_0= 'each'
                    {
                    otherlv_0=(Token)match(input,60,FOLLOW_46); 

                    				newLeafNode(otherlv_0, grammarAccess.getElementModicationOrReplaceableAccess().getEachKeyword_0());
                    			

                    }
                    break;

            }

            // InternalModelica.g:2179:3: (otherlv_1= 'final' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==20) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalModelica.g:2180:4: otherlv_1= 'final'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_46); 

                    				newLeafNode(otherlv_1, grammarAccess.getElementModicationOrReplaceableAccess().getFinalKeyword_1());
                    			

                    }
                    break;

            }

            // InternalModelica.g:2185:3: (this_ElementModification_2= ruleElementModification | this_ElementReplaceable_3= ruleElementReplaceable )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_IDENT||LA53_0==100) ) {
                alt53=1;
            }
            else if ( (LA53_0==46) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalModelica.g:2186:4: this_ElementModification_2= ruleElementModification
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
                    // InternalModelica.g:2195:4: this_ElementReplaceable_3= ruleElementReplaceable
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
    // InternalModelica.g:2208:1: entryRuleElementModification returns [EObject current=null] : iv_ruleElementModification= ruleElementModification EOF ;
    public final EObject entryRuleElementModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementModification = null;


        try {
            // InternalModelica.g:2208:60: (iv_ruleElementModification= ruleElementModification EOF )
            // InternalModelica.g:2209:2: iv_ruleElementModification= ruleElementModification EOF
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
    // InternalModelica.g:2215:1: ruleElementModification returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) ) ) ;
    public final EObject ruleElementModification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_mod_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2221:2: ( ( ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) ) ) )
            // InternalModelica.g:2222:2: ( ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) ) )
            {
            // InternalModelica.g:2222:2: ( ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) ) )
            // InternalModelica.g:2223:3: ( (lv_name_0_0= ruleName ) ) ( (lv_mod_1_0= ruleModification ) )? ( (lv_comment_2_0= ruleStringComment ) )
            {
            // InternalModelica.g:2223:3: ( (lv_name_0_0= ruleName ) )
            // InternalModelica.g:2224:4: (lv_name_0_0= ruleName )
            {
            // InternalModelica.g:2224:4: (lv_name_0_0= ruleName )
            // InternalModelica.g:2225:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getElementModificationAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_47);
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

            // InternalModelica.g:2242:3: ( (lv_mod_1_0= ruleModification ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=40 && LA54_0<=41)||LA54_0==59) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalModelica.g:2243:4: (lv_mod_1_0= ruleModification )
                    {
                    // InternalModelica.g:2243:4: (lv_mod_1_0= ruleModification )
                    // InternalModelica.g:2244:5: lv_mod_1_0= ruleModification
                    {

                    					newCompositeNode(grammarAccess.getElementModificationAccess().getModModificationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_48);
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

            // InternalModelica.g:2261:3: ( (lv_comment_2_0= ruleStringComment ) )
            // InternalModelica.g:2262:4: (lv_comment_2_0= ruleStringComment )
            {
            // InternalModelica.g:2262:4: (lv_comment_2_0= ruleStringComment )
            // InternalModelica.g:2263:5: lv_comment_2_0= ruleStringComment
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
    // InternalModelica.g:2284:1: entryRuleElementRedeclaration returns [EObject current=null] : iv_ruleElementRedeclaration= ruleElementRedeclaration EOF ;
    public final EObject entryRuleElementRedeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementRedeclaration = null;


        try {
            // InternalModelica.g:2284:61: (iv_ruleElementRedeclaration= ruleElementRedeclaration EOF )
            // InternalModelica.g:2285:2: iv_ruleElementRedeclaration= ruleElementRedeclaration EOF
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
    // InternalModelica.g:2291:1: ruleElementRedeclaration returns [EObject current=null] : (otherlv_0= 'redeclare' (otherlv_1= 'each' )? (otherlv_2= 'final' )? ( (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 ) | this_ElementReplaceable_5= ruleElementReplaceable ) ) ;
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
            // InternalModelica.g:2297:2: ( (otherlv_0= 'redeclare' (otherlv_1= 'each' )? (otherlv_2= 'final' )? ( (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 ) | this_ElementReplaceable_5= ruleElementReplaceable ) ) )
            // InternalModelica.g:2298:2: (otherlv_0= 'redeclare' (otherlv_1= 'each' )? (otherlv_2= 'final' )? ( (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 ) | this_ElementReplaceable_5= ruleElementReplaceable ) )
            {
            // InternalModelica.g:2298:2: (otherlv_0= 'redeclare' (otherlv_1= 'each' )? (otherlv_2= 'final' )? ( (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 ) | this_ElementReplaceable_5= ruleElementReplaceable ) )
            // InternalModelica.g:2299:3: otherlv_0= 'redeclare' (otherlv_1= 'each' )? (otherlv_2= 'final' )? ( (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 ) | this_ElementReplaceable_5= ruleElementReplaceable )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getElementRedeclarationAccess().getRedeclareKeyword_0());
            		
            // InternalModelica.g:2303:3: (otherlv_1= 'each' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==60) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalModelica.g:2304:4: otherlv_1= 'each'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_49); 

                    				newLeafNode(otherlv_1, grammarAccess.getElementRedeclarationAccess().getEachKeyword_1());
                    			

                    }
                    break;

            }

            // InternalModelica.g:2309:3: (otherlv_2= 'final' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==20) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalModelica.g:2310:4: otherlv_2= 'final'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_49); 

                    				newLeafNode(otherlv_2, grammarAccess.getElementRedeclarationAccess().getFinalKeyword_2());
                    			

                    }
                    break;

            }

            // InternalModelica.g:2315:3: ( (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 ) | this_ElementReplaceable_5= ruleElementReplaceable )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==EOF||LA58_0==RULE_IDENT||(LA58_0>=22 && LA58_0<=34)||(LA58_0>=51 && LA58_0<=57)||LA58_0==100) ) {
                alt58=1;
            }
            else if ( (LA58_0==46) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalModelica.g:2316:4: (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 )
                    {
                    // InternalModelica.g:2316:4: (this_ShortClassDefinition_3= ruleShortClassDefinition | this_ComponentClause1_4= ruleComponentClause1 )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=22 && LA57_0<=34)) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==EOF||LA57_0==RULE_IDENT||(LA57_0>=51 && LA57_0<=57)||LA57_0==100) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalModelica.g:2317:5: this_ShortClassDefinition_3= ruleShortClassDefinition
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
                            // InternalModelica.g:2326:5: this_ComponentClause1_4= ruleComponentClause1
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
                    // InternalModelica.g:2336:4: this_ElementReplaceable_5= ruleElementReplaceable
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
    // InternalModelica.g:2349:1: entryRuleElementReplaceable returns [EObject current=null] : iv_ruleElementReplaceable= ruleElementReplaceable EOF ;
    public final EObject entryRuleElementReplaceable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReplaceable = null;


        try {
            // InternalModelica.g:2349:59: (iv_ruleElementReplaceable= ruleElementReplaceable EOF )
            // InternalModelica.g:2350:2: iv_ruleElementReplaceable= ruleElementReplaceable EOF
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
    // InternalModelica.g:2356:1: ruleElementReplaceable returns [EObject current=null] : (otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )? ) ;
    public final EObject ruleElementReplaceable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ShortClassDefinition_1 = null;

        EObject this_ComponentClause1_2 = null;

        EObject lv_const_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2362:2: ( (otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )? ) )
            // InternalModelica.g:2363:2: (otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )? )
            {
            // InternalModelica.g:2363:2: (otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )? )
            // InternalModelica.g:2364:3: otherlv_0= 'replaceable' (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 ) ( (lv_const_3_0= ruleConstrainingClause ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getElementReplaceableAccess().getReplaceableKeyword_0());
            		
            // InternalModelica.g:2368:3: (this_ShortClassDefinition_1= ruleShortClassDefinition | this_ComponentClause1_2= ruleComponentClause1 )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=22 && LA59_0<=34)) ) {
                alt59=1;
            }
            else if ( (LA59_0==EOF||LA59_0==RULE_IDENT||(LA59_0>=51 && LA59_0<=57)||LA59_0==100) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalModelica.g:2369:4: this_ShortClassDefinition_1= ruleShortClassDefinition
                    {

                    				newCompositeNode(grammarAccess.getElementReplaceableAccess().getShortClassDefinitionParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_50);
                    this_ShortClassDefinition_1=ruleShortClassDefinition();

                    state._fsp--;


                    				current = this_ShortClassDefinition_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalModelica.g:2378:4: this_ComponentClause1_2= ruleComponentClause1
                    {

                    				newCompositeNode(grammarAccess.getElementReplaceableAccess().getComponentClause1ParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_50);
                    this_ComponentClause1_2=ruleComponentClause1();

                    state._fsp--;


                    				current = this_ComponentClause1_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalModelica.g:2387:3: ( (lv_const_3_0= ruleConstrainingClause ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==50) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalModelica.g:2388:4: (lv_const_3_0= ruleConstrainingClause )
                    {
                    // InternalModelica.g:2388:4: (lv_const_3_0= ruleConstrainingClause )
                    // InternalModelica.g:2389:5: lv_const_3_0= ruleConstrainingClause
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
    // InternalModelica.g:2410:1: entryRuleComponentClause1 returns [EObject current=null] : iv_ruleComponentClause1= ruleComponentClause1 EOF ;
    public final EObject entryRuleComponentClause1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClause1 = null;


        try {
            // InternalModelica.g:2410:57: (iv_ruleComponentClause1= ruleComponentClause1 EOF )
            // InternalModelica.g:2411:2: iv_ruleComponentClause1= ruleComponentClause1 EOF
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
    // InternalModelica.g:2417:1: ruleComponentClause1 returns [EObject current=null] : ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_comp_2_0= ruleComponentDeclaration1 ) ) ) ;
    public final EObject ruleComponentClause1() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_prefix_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_comp_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2423:2: ( ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_comp_2_0= ruleComponentDeclaration1 ) ) ) )
            // InternalModelica.g:2424:2: ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_comp_2_0= ruleComponentDeclaration1 ) ) )
            {
            // InternalModelica.g:2424:2: ( ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_comp_2_0= ruleComponentDeclaration1 ) ) )
            // InternalModelica.g:2425:3: ( (lv_prefix_0_0= ruleTypePrefix ) ) ( (lv_type_1_0= ruleTypeSpecifier ) ) ( (lv_comp_2_0= ruleComponentDeclaration1 ) )
            {
            // InternalModelica.g:2425:3: ( (lv_prefix_0_0= ruleTypePrefix ) )
            // InternalModelica.g:2426:4: (lv_prefix_0_0= ruleTypePrefix )
            {
            // InternalModelica.g:2426:4: (lv_prefix_0_0= ruleTypePrefix )
            // InternalModelica.g:2427:5: lv_prefix_0_0= ruleTypePrefix
            {

            					newCompositeNode(grammarAccess.getComponentClause1Access().getPrefixTypePrefixParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalModelica.g:2444:3: ( (lv_type_1_0= ruleTypeSpecifier ) )
            // InternalModelica.g:2445:4: (lv_type_1_0= ruleTypeSpecifier )
            {
            // InternalModelica.g:2445:4: (lv_type_1_0= ruleTypeSpecifier )
            // InternalModelica.g:2446:5: lv_type_1_0= ruleTypeSpecifier
            {

            					newCompositeNode(grammarAccess.getComponentClause1Access().getTypeTypeSpecifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalModelica.g:2463:3: ( (lv_comp_2_0= ruleComponentDeclaration1 ) )
            // InternalModelica.g:2464:4: (lv_comp_2_0= ruleComponentDeclaration1 )
            {
            // InternalModelica.g:2464:4: (lv_comp_2_0= ruleComponentDeclaration1 )
            // InternalModelica.g:2465:5: lv_comp_2_0= ruleComponentDeclaration1
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
    // InternalModelica.g:2486:1: entryRuleComponentDeclaration1 returns [EObject current=null] : iv_ruleComponentDeclaration1= ruleComponentDeclaration1 EOF ;
    public final EObject entryRuleComponentDeclaration1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDeclaration1 = null;


        try {
            // InternalModelica.g:2486:62: (iv_ruleComponentDeclaration1= ruleComponentDeclaration1 EOF )
            // InternalModelica.g:2487:2: iv_ruleComponentDeclaration1= ruleComponentDeclaration1 EOF
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
    // InternalModelica.g:2493:1: ruleComponentDeclaration1 returns [EObject current=null] : (this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) ) ) ;
    public final EObject ruleComponentDeclaration1() throws RecognitionException {
        EObject current = null;

        EObject this_Declaration_0 = null;

        EObject lv_comment_1_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2499:2: ( (this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) ) ) )
            // InternalModelica.g:2500:2: (this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) ) )
            {
            // InternalModelica.g:2500:2: (this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) ) )
            // InternalModelica.g:2501:3: this_Declaration_0= ruleDeclaration ( (lv_comment_1_0= ruleComment ) )
            {

            			newCompositeNode(grammarAccess.getComponentDeclaration1Access().getDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Declaration_0=ruleDeclaration();

            state._fsp--;


            			current = this_Declaration_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:2509:3: ( (lv_comment_1_0= ruleComment ) )
            // InternalModelica.g:2510:4: (lv_comment_1_0= ruleComment )
            {
            // InternalModelica.g:2510:4: (lv_comment_1_0= ruleComment )
            // InternalModelica.g:2511:5: lv_comment_1_0= ruleComment
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
    // InternalModelica.g:2532:1: entryRuleShortClassDefinition returns [EObject current=null] : iv_ruleShortClassDefinition= ruleShortClassDefinition EOF ;
    public final EObject entryRuleShortClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortClassDefinition = null;


        try {
            // InternalModelica.g:2532:61: (iv_ruleShortClassDefinition= ruleShortClassDefinition EOF )
            // InternalModelica.g:2533:2: iv_ruleShortClassDefinition= ruleShortClassDefinition EOF
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
    // InternalModelica.g:2539:1: ruleShortClassDefinition returns [EObject current=null] : ( ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) ) ) ;
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
            // InternalModelica.g:2545:2: ( ( ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) ) ) )
            // InternalModelica.g:2546:2: ( ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) ) )
            {
            // InternalModelica.g:2546:2: ( ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) ) )
            // InternalModelica.g:2547:3: ruleClassPrefixes this_IDENT_1= RULE_IDENT otherlv_2= '=' ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) )
            {

            			newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getClassPrefixesParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            ruleClassPrefixes();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_23); 

            			newLeafNode(this_IDENT_1, grammarAccess.getShortClassDefinitionAccess().getIDENTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getShortClassDefinitionAccess().getEqualsSignKeyword_2());
            		
            // InternalModelica.g:2562:3: ( ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) ) | (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==EOF||LA65_0==RULE_IDENT||(LA65_0>=51 && LA65_0<=57)||LA65_0==100) ) {
                alt65=1;
            }
            else if ( (LA65_0==61) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalModelica.g:2563:4: ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) )
                    {
                    // InternalModelica.g:2563:4: ( ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) ) )
                    // InternalModelica.g:2564:5: ruleBasePrefix ruleName (this_ArraySubscripts_5= ruleArraySubscripts )? ( (lv_mode_6_0= ruleClassModification ) )? ( (lv_comment_7_0= ruleComment ) )
                    {

                    					newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getBasePrefixParserRuleCall_3_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    ruleBasePrefix();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getNameParserRuleCall_3_0_1());
                    				
                    pushFollow(FOLLOW_52);
                    ruleName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalModelica.g:2578:5: (this_ArraySubscripts_5= ruleArraySubscripts )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==95) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalModelica.g:2579:6: this_ArraySubscripts_5= ruleArraySubscripts
                            {

                            						newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getArraySubscriptsParserRuleCall_3_0_2());
                            					
                            pushFollow(FOLLOW_53);
                            this_ArraySubscripts_5=ruleArraySubscripts();

                            state._fsp--;


                            						current = this_ArraySubscripts_5;
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }

                    // InternalModelica.g:2588:5: ( (lv_mode_6_0= ruleClassModification ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==41) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalModelica.g:2589:6: (lv_mode_6_0= ruleClassModification )
                            {
                            // InternalModelica.g:2589:6: (lv_mode_6_0= ruleClassModification )
                            // InternalModelica.g:2590:7: lv_mode_6_0= ruleClassModification
                            {

                            							newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getModeClassModificationParserRuleCall_3_0_3_0());
                            						
                            pushFollow(FOLLOW_16);
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

                    // InternalModelica.g:2607:5: ( (lv_comment_7_0= ruleComment ) )
                    // InternalModelica.g:2608:6: (lv_comment_7_0= ruleComment )
                    {
                    // InternalModelica.g:2608:6: (lv_comment_7_0= ruleComment )
                    // InternalModelica.g:2609:7: lv_comment_7_0= ruleComment
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
                    // InternalModelica.g:2628:4: (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) )
                    {
                    // InternalModelica.g:2628:4: (otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) ) )
                    // InternalModelica.g:2629:5: otherlv_8= 'enumeration' otherlv_9= '(' ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' ) otherlv_12= ')' ( (lv_comment_13_0= ruleComment ) )
                    {
                    otherlv_8=(Token)match(input,61,FOLLOW_24); 

                    					newLeafNode(otherlv_8, grammarAccess.getShortClassDefinitionAccess().getEnumerationKeyword_3_1_0());
                    				
                    otherlv_9=(Token)match(input,41,FOLLOW_54); 

                    					newLeafNode(otherlv_9, grammarAccess.getShortClassDefinitionAccess().getLeftParenthesisKeyword_3_1_1());
                    				
                    // InternalModelica.g:2637:5: ( ( (lv_list_10_0= ruleEnumList ) )? | otherlv_11= ':' )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_IDENT||LA64_0==42) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==62) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalModelica.g:2638:6: ( (lv_list_10_0= ruleEnumList ) )?
                            {
                            // InternalModelica.g:2638:6: ( (lv_list_10_0= ruleEnumList ) )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==RULE_IDENT) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // InternalModelica.g:2639:7: (lv_list_10_0= ruleEnumList )
                                    {
                                    // InternalModelica.g:2639:7: (lv_list_10_0= ruleEnumList )
                                    // InternalModelica.g:2640:8: lv_list_10_0= ruleEnumList
                                    {

                                    								newCompositeNode(grammarAccess.getShortClassDefinitionAccess().getListEnumListParserRuleCall_3_1_2_0_0());
                                    							
                                    pushFollow(FOLLOW_26);
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
                            // InternalModelica.g:2658:6: otherlv_11= ':'
                            {
                            otherlv_11=(Token)match(input,62,FOLLOW_26); 

                            						newLeafNode(otherlv_11, grammarAccess.getShortClassDefinitionAccess().getColonKeyword_3_1_2_1());
                            					

                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,42,FOLLOW_16); 

                    					newLeafNode(otherlv_12, grammarAccess.getShortClassDefinitionAccess().getRightParenthesisKeyword_3_1_3());
                    				
                    // InternalModelica.g:2667:5: ( (lv_comment_13_0= ruleComment ) )
                    // InternalModelica.g:2668:6: (lv_comment_13_0= ruleComment )
                    {
                    // InternalModelica.g:2668:6: (lv_comment_13_0= ruleComment )
                    // InternalModelica.g:2669:7: lv_comment_13_0= ruleComment
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
    // InternalModelica.g:2692:1: entryRuleEquationSection returns [EObject current=null] : iv_ruleEquationSection= ruleEquationSection EOF ;
    public final EObject entryRuleEquationSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquationSection = null;


        try {
            // InternalModelica.g:2692:56: (iv_ruleEquationSection= ruleEquationSection EOF )
            // InternalModelica.g:2693:2: iv_ruleEquationSection= ruleEquationSection EOF
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
    // InternalModelica.g:2699:1: ruleEquationSection returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'equation' ( ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';' )+ ) ;
    public final EObject ruleEquationSection() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_equations_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2705:2: ( ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'equation' ( ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';' )+ ) )
            // InternalModelica.g:2706:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'equation' ( ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';' )+ )
            {
            // InternalModelica.g:2706:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'equation' ( ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';' )+ )
            // InternalModelica.g:2707:3: ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'equation' ( ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';' )+
            {
            // InternalModelica.g:2707:3: ( (lv_initial_0_0= 'initial' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==63) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalModelica.g:2708:4: (lv_initial_0_0= 'initial' )
                    {
                    // InternalModelica.g:2708:4: (lv_initial_0_0= 'initial' )
                    // InternalModelica.g:2709:5: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,63,FOLLOW_55); 

                    					newLeafNode(lv_initial_0_0, grammarAccess.getEquationSectionAccess().getInitialInitialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEquationSectionRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,64,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getEquationSectionAccess().getEquationKeyword_1());
            		
            // InternalModelica.g:2725:3: ( ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';' )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA67_2 = input.LA(2);

                    if ( (LA67_2==40||LA67_2==48||LA67_2==62||(LA67_2>=78 && LA67_2<=94)) ) {
                        alt67=1;
                    }


                    }
                    break;
                case 63:
                    {
                    int LA67_3 = input.LA(2);

                    if ( (LA67_3==41) ) {
                        alt67=1;
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
                case 95:
                case 97:
                case 99:
                case 100:
                    {
                    alt67=1;
                    }
                    break;

                }

                switch (alt67) {
            	case 1 :
            	    // InternalModelica.g:2726:4: ( (lv_equations_2_0= ruleEquation ) ) otherlv_3= ';'
            	    {
            	    // InternalModelica.g:2726:4: ( (lv_equations_2_0= ruleEquation ) )
            	    // InternalModelica.g:2727:5: (lv_equations_2_0= ruleEquation )
            	    {
            	    // InternalModelica.g:2727:5: (lv_equations_2_0= ruleEquation )
            	    // InternalModelica.g:2728:6: lv_equations_2_0= ruleEquation
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

            	    otherlv_3=(Token)match(input,19,FOLLOW_57); 

            	    				newLeafNode(otherlv_3, grammarAccess.getEquationSectionAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
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
    // InternalModelica.g:2754:1: entryRuleAlgorithmSection returns [EObject current=null] : iv_ruleAlgorithmSection= ruleAlgorithmSection EOF ;
    public final EObject entryRuleAlgorithmSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithmSection = null;


        try {
            // InternalModelica.g:2754:57: (iv_ruleAlgorithmSection= ruleAlgorithmSection EOF )
            // InternalModelica.g:2755:2: iv_ruleAlgorithmSection= ruleAlgorithmSection EOF
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
    // InternalModelica.g:2761:1: ruleAlgorithmSection returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'algorithm' ( ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';' )+ ) ;
    public final EObject ruleAlgorithmSection() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:2767:2: ( ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'algorithm' ( ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';' )+ ) )
            // InternalModelica.g:2768:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'algorithm' ( ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';' )+ )
            {
            // InternalModelica.g:2768:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'algorithm' ( ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';' )+ )
            // InternalModelica.g:2769:3: ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'algorithm' ( ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';' )+
            {
            // InternalModelica.g:2769:3: ( (lv_initial_0_0= 'initial' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==63) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalModelica.g:2770:4: (lv_initial_0_0= 'initial' )
                    {
                    // InternalModelica.g:2770:4: (lv_initial_0_0= 'initial' )
                    // InternalModelica.g:2771:5: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,63,FOLLOW_58); 

                    					newLeafNode(lv_initial_0_0, grammarAccess.getAlgorithmSectionAccess().getInitialInitialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlgorithmSectionRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,65,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgorithmSectionAccess().getAlgorithmKeyword_1());
            		
            // InternalModelica.g:2787:3: ( ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';' )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_IDENT||LA69_0==41||LA69_0==58||(LA69_0>=66 && LA69_0<=67)||LA69_0==71||(LA69_0>=74 && LA69_0<=75)||LA69_0==100) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalModelica.g:2788:4: ( (lv_statements_2_0= ruleStatement ) ) otherlv_3= ';'
            	    {
            	    // InternalModelica.g:2788:4: ( (lv_statements_2_0= ruleStatement ) )
            	    // InternalModelica.g:2789:5: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalModelica.g:2789:5: (lv_statements_2_0= ruleStatement )
            	    // InternalModelica.g:2790:6: lv_statements_2_0= ruleStatement
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

            	    otherlv_3=(Token)match(input,19,FOLLOW_60); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAlgorithmSectionAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
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
    // InternalModelica.g:2816:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalModelica.g:2816:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalModelica.g:2817:2: iv_ruleEquation= ruleEquation EOF
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
    // InternalModelica.g:2823:1: ruleEquation returns [EObject current=null] : ( ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) | this_IfEquation_3= ruleIfEquation | this_ForEquation_4= ruleForEquation | this_ConnectClause_5= ruleConnectClause | this_WhenEquation_6= ruleWhenEquation ) ( (lv_commment_7_0= ruleComment ) ) ) ;
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
            // InternalModelica.g:2829:2: ( ( ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) | this_IfEquation_3= ruleIfEquation | this_ForEquation_4= ruleForEquation | this_ConnectClause_5= ruleConnectClause | this_WhenEquation_6= ruleWhenEquation ) ( (lv_commment_7_0= ruleComment ) ) ) )
            // InternalModelica.g:2830:2: ( ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) | this_IfEquation_3= ruleIfEquation | this_ForEquation_4= ruleForEquation | this_ConnectClause_5= ruleConnectClause | this_WhenEquation_6= ruleWhenEquation ) ( (lv_commment_7_0= ruleComment ) ) )
            {
            // InternalModelica.g:2830:2: ( ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) | this_IfEquation_3= ruleIfEquation | this_ForEquation_4= ruleForEquation | this_ConnectClause_5= ruleConnectClause | this_WhenEquation_6= ruleWhenEquation ) ( (lv_commment_7_0= ruleComment ) ) )
            // InternalModelica.g:2831:3: ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) | this_IfEquation_3= ruleIfEquation | this_ForEquation_4= ruleForEquation | this_ConnectClause_5= ruleConnectClause | this_WhenEquation_6= ruleWhenEquation ) ( (lv_commment_7_0= ruleComment ) )
            {
            // InternalModelica.g:2831:3: ( ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) ) | this_IfEquation_3= ruleIfEquation | this_ForEquation_4= ruleForEquation | this_ConnectClause_5= ruleConnectClause | this_WhenEquation_6= ruleWhenEquation )
            int alt70=5;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case RULE_STRING:
            case RULE_UNSIGNED_NUMBER:
            case RULE_TRUE_FALSE:
            case 35:
            case 63:
            case 95:
            case 97:
            case 99:
            case 100:
                {
                alt70=1;
                }
                break;
            case 58:
                {
                alt70=2;
                }
                break;
            case 71:
                {
                alt70=3;
                }
                break;
            case 77:
                {
                alt70=4;
                }
                break;
            case 75:
                {
                alt70=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalModelica.g:2832:4: ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) )
                    {
                    // InternalModelica.g:2832:4: ( ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) )
                    // InternalModelica.g:2833:5: ( (lv_left_0_0= ruleSimpleExpression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) )
                    {
                    // InternalModelica.g:2833:5: ( (lv_left_0_0= ruleSimpleExpression ) )
                    // InternalModelica.g:2834:6: (lv_left_0_0= ruleSimpleExpression )
                    {
                    // InternalModelica.g:2834:6: (lv_left_0_0= ruleSimpleExpression )
                    // InternalModelica.g:2835:7: lv_left_0_0= ruleSimpleExpression
                    {

                    							newCompositeNode(grammarAccess.getEquationAccess().getLeftSimpleExpressionParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_23);
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

                    otherlv_1=(Token)match(input,40,FOLLOW_40); 

                    					newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getEqualsSignKeyword_0_0_1());
                    				
                    // InternalModelica.g:2856:5: ( (lv_right_2_0= ruleExpression ) )
                    // InternalModelica.g:2857:6: (lv_right_2_0= ruleExpression )
                    {
                    // InternalModelica.g:2857:6: (lv_right_2_0= ruleExpression )
                    // InternalModelica.g:2858:7: lv_right_2_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getEquationAccess().getRightExpressionParserRuleCall_0_0_2_0());
                    						
                    pushFollow(FOLLOW_16);
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
                    // InternalModelica.g:2877:4: this_IfEquation_3= ruleIfEquation
                    {

                    				newCompositeNode(grammarAccess.getEquationAccess().getIfEquationParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_16);
                    this_IfEquation_3=ruleIfEquation();

                    state._fsp--;


                    				current = this_IfEquation_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalModelica.g:2886:4: this_ForEquation_4= ruleForEquation
                    {

                    				newCompositeNode(grammarAccess.getEquationAccess().getForEquationParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_16);
                    this_ForEquation_4=ruleForEquation();

                    state._fsp--;


                    				current = this_ForEquation_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalModelica.g:2895:4: this_ConnectClause_5= ruleConnectClause
                    {

                    				newCompositeNode(grammarAccess.getEquationAccess().getConnectClauseParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_16);
                    this_ConnectClause_5=ruleConnectClause();

                    state._fsp--;


                    				current = this_ConnectClause_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalModelica.g:2904:4: this_WhenEquation_6= ruleWhenEquation
                    {

                    				newCompositeNode(grammarAccess.getEquationAccess().getWhenEquationParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_16);
                    this_WhenEquation_6=ruleWhenEquation();

                    state._fsp--;


                    				current = this_WhenEquation_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalModelica.g:2913:3: ( (lv_commment_7_0= ruleComment ) )
            // InternalModelica.g:2914:4: (lv_commment_7_0= ruleComment )
            {
            // InternalModelica.g:2914:4: (lv_commment_7_0= ruleComment )
            // InternalModelica.g:2915:5: lv_commment_7_0= ruleComment
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
    // InternalModelica.g:2936:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalModelica.g:2936:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalModelica.g:2937:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalModelica.g:2943:1: ruleStatement returns [EObject current=null] : ( ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) ) ) ;
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
            // InternalModelica.g:2949:2: ( ( ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) ) ) )
            // InternalModelica.g:2950:2: ( ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) ) )
            {
            // InternalModelica.g:2950:2: ( ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) ) )
            // InternalModelica.g:2951:3: ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement ) ( (lv_comment_15_0= ruleComment ) )
            {
            // InternalModelica.g:2951:3: ( ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) ) | (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) ) | otherlv_9= 'break' | otherlv_10= 'return' | this_IfStatement_11= ruleIfStatement | this_ForStatement_12= ruleForStatement | this_WhileStatement_13= ruleWhileStatement | this_WhenStatement_14= ruleWhenStatement )
            int alt72=8;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case 100:
                {
                alt72=1;
                }
                break;
            case 41:
                {
                alt72=2;
                }
                break;
            case 66:
                {
                alt72=3;
                }
                break;
            case 67:
                {
                alt72=4;
                }
                break;
            case 58:
                {
                alt72=5;
                }
                break;
            case 71:
                {
                alt72=6;
                }
                break;
            case 74:
                {
                alt72=7;
                }
                break;
            case 75:
                {
                alt72=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalModelica.g:2952:4: ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) )
                    {
                    // InternalModelica.g:2952:4: ( ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) ) )
                    // InternalModelica.g:2953:5: ( (lv_left_0_0= ruleComponentReference ) ) (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) )
                    {
                    // InternalModelica.g:2953:5: ( (lv_left_0_0= ruleComponentReference ) )
                    // InternalModelica.g:2954:6: (lv_left_0_0= ruleComponentReference )
                    {
                    // InternalModelica.g:2954:6: (lv_left_0_0= ruleComponentReference )
                    // InternalModelica.g:2955:7: lv_left_0_0= ruleComponentReference
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getLeftComponentReferenceParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_61);
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

                    // InternalModelica.g:2972:5: (otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) ) )
                    // InternalModelica.g:2973:6: otherlv_1= ':=' ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) )
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_62); 

                    						newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_0_0_1_0());
                    					
                    // InternalModelica.g:2977:6: ( ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) ) )
                    // InternalModelica.g:2978:7: ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) )
                    {
                    // InternalModelica.g:2978:7: ( (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs ) )
                    // InternalModelica.g:2979:8: (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs )
                    {
                    // InternalModelica.g:2979:8: (lv_right_2_1= ruleExpression | lv_right_2_2= ruleFunctionCallArgs )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( ((LA71_0>=RULE_IDENT && LA71_0<=RULE_TRUE_FALSE)||LA71_0==35||LA71_0==58||LA71_0==63||LA71_0==95||LA71_0==97||(LA71_0>=99 && LA71_0<=100)) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==41) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalModelica.g:2980:9: lv_right_2_1= ruleExpression
                            {

                            									newCompositeNode(grammarAccess.getStatementAccess().getRightExpressionParserRuleCall_0_0_1_1_0_0());
                            								
                            pushFollow(FOLLOW_16);
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
                            // InternalModelica.g:2996:9: lv_right_2_2= ruleFunctionCallArgs
                            {

                            									newCompositeNode(grammarAccess.getStatementAccess().getRightFunctionCallArgsParserRuleCall_0_0_1_1_0_1());
                            								
                            pushFollow(FOLLOW_16);
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
                    // InternalModelica.g:3017:4: (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) )
                    {
                    // InternalModelica.g:3017:4: (otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) ) )
                    // InternalModelica.g:3018:5: otherlv_3= '(' ( (lv_left_4_0= ruleOutputExpressionList ) ) otherlv_5= ')' otherlv_6= ':=' ( (lv_ref_7_0= ruleComponentReference ) ) ( (lv_ref_call_8_0= ruleFunctionCallArgs ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_63); 

                    					newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_0_1_0());
                    				
                    // InternalModelica.g:3022:5: ( (lv_left_4_0= ruleOutputExpressionList ) )
                    // InternalModelica.g:3023:6: (lv_left_4_0= ruleOutputExpressionList )
                    {
                    // InternalModelica.g:3023:6: (lv_left_4_0= ruleOutputExpressionList )
                    // InternalModelica.g:3024:7: lv_left_4_0= ruleOutputExpressionList
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getLeftOutputExpressionListParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_26);
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

                    otherlv_5=(Token)match(input,42,FOLLOW_61); 

                    					newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getRightParenthesisKeyword_0_1_2());
                    				
                    otherlv_6=(Token)match(input,59,FOLLOW_3); 

                    					newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_0_1_3());
                    				
                    // InternalModelica.g:3049:5: ( (lv_ref_7_0= ruleComponentReference ) )
                    // InternalModelica.g:3050:6: (lv_ref_7_0= ruleComponentReference )
                    {
                    // InternalModelica.g:3050:6: (lv_ref_7_0= ruleComponentReference )
                    // InternalModelica.g:3051:7: lv_ref_7_0= ruleComponentReference
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getRefComponentReferenceParserRuleCall_0_1_4_0());
                    						
                    pushFollow(FOLLOW_62);
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

                    // InternalModelica.g:3068:5: ( (lv_ref_call_8_0= ruleFunctionCallArgs ) )
                    // InternalModelica.g:3069:6: (lv_ref_call_8_0= ruleFunctionCallArgs )
                    {
                    // InternalModelica.g:3069:6: (lv_ref_call_8_0= ruleFunctionCallArgs )
                    // InternalModelica.g:3070:7: lv_ref_call_8_0= ruleFunctionCallArgs
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getRef_callFunctionCallArgsParserRuleCall_0_1_5_0());
                    						
                    pushFollow(FOLLOW_16);
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
                    // InternalModelica.g:3089:4: otherlv_9= 'break'
                    {
                    otherlv_9=(Token)match(input,66,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getBreakKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalModelica.g:3094:4: otherlv_10= 'return'
                    {
                    otherlv_10=(Token)match(input,67,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getReturnKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalModelica.g:3099:4: this_IfStatement_11= ruleIfStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_16);
                    this_IfStatement_11=ruleIfStatement();

                    state._fsp--;


                    				current = this_IfStatement_11;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalModelica.g:3108:4: this_ForStatement_12= ruleForStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_16);
                    this_ForStatement_12=ruleForStatement();

                    state._fsp--;


                    				current = this_ForStatement_12;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalModelica.g:3117:4: this_WhileStatement_13= ruleWhileStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_0_6());
                    			
                    pushFollow(FOLLOW_16);
                    this_WhileStatement_13=ruleWhileStatement();

                    state._fsp--;


                    				current = this_WhileStatement_13;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalModelica.g:3126:4: this_WhenStatement_14= ruleWhenStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getWhenStatementParserRuleCall_0_7());
                    			
                    pushFollow(FOLLOW_16);
                    this_WhenStatement_14=ruleWhenStatement();

                    state._fsp--;


                    				current = this_WhenStatement_14;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalModelica.g:3135:3: ( (lv_comment_15_0= ruleComment ) )
            // InternalModelica.g:3136:4: (lv_comment_15_0= ruleComment )
            {
            // InternalModelica.g:3136:4: (lv_comment_15_0= ruleComment )
            // InternalModelica.g:3137:5: lv_comment_15_0= ruleComment
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
    // InternalModelica.g:3158:1: entryRuleIfEquation returns [EObject current=null] : iv_ruleIfEquation= ruleIfEquation EOF ;
    public final EObject entryRuleIfEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfEquation = null;


        try {
            // InternalModelica.g:3158:51: (iv_ruleIfEquation= ruleIfEquation EOF )
            // InternalModelica.g:3159:2: iv_ruleIfEquation= ruleIfEquation EOF
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
    // InternalModelica.g:3165:1: ruleIfEquation returns [EObject current=null] : (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' ) ;
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
            // InternalModelica.g:3171:2: ( (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' ) )
            // InternalModelica.g:3172:2: (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' )
            {
            // InternalModelica.g:3172:2: (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' )
            // InternalModelica.g:3173:3: otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getIfEquationAccess().getIfKeyword_0());
            		
            // InternalModelica.g:3177:3: ( (lv_if_expr_1_0= ruleExpression ) )
            // InternalModelica.g:3178:4: (lv_if_expr_1_0= ruleExpression )
            {
            // InternalModelica.g:3178:4: (lv_if_expr_1_0= ruleExpression )
            // InternalModelica.g:3179:5: lv_if_expr_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfEquationAccess().getIf_exprExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_64);
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

            otherlv_2=(Token)match(input,68,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getIfEquationAccess().getThenKeyword_2());
            		
            // InternalModelica.g:3200:3: ( ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==35) ) {
                    int LA73_2 = input.LA(2);

                    if ( (LA73_2==40||LA73_2==48||LA73_2==62||(LA73_2>=78 && LA73_2<=94)) ) {
                        alt73=1;
                    }


                }
                else if ( ((LA73_0>=RULE_IDENT && LA73_0<=RULE_TRUE_FALSE)||LA73_0==58||LA73_0==63||LA73_0==71||LA73_0==75||LA73_0==77||LA73_0==95||LA73_0==97||(LA73_0>=99 && LA73_0<=100)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalModelica.g:3201:4: ( (lv_if_eqs_3_0= ruleEquation ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3201:4: ( (lv_if_eqs_3_0= ruleEquation ) )
            	    // InternalModelica.g:3202:5: (lv_if_eqs_3_0= ruleEquation )
            	    {
            	    // InternalModelica.g:3202:5: (lv_if_eqs_3_0= ruleEquation )
            	    // InternalModelica.g:3203:6: lv_if_eqs_3_0= ruleEquation
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

            	    otherlv_4=(Token)match(input,19,FOLLOW_65); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIfEquationAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            // InternalModelica.g:3225:3: (otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )* )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==69) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalModelica.g:3226:4: otherlv_5= 'elseif' ( (lv_elsif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )*
            	    {
            	    otherlv_5=(Token)match(input,69,FOLLOW_40); 

            	    				newLeafNode(otherlv_5, grammarAccess.getIfEquationAccess().getElseifKeyword_4_0());
            	    			
            	    // InternalModelica.g:3230:4: ( (lv_elsif_exprs_6_0= ruleExpression ) )
            	    // InternalModelica.g:3231:5: (lv_elsif_exprs_6_0= ruleExpression )
            	    {
            	    // InternalModelica.g:3231:5: (lv_elsif_exprs_6_0= ruleExpression )
            	    // InternalModelica.g:3232:6: lv_elsif_exprs_6_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getIfEquationAccess().getElsif_exprsExpressionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_64);
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

            	    otherlv_7=(Token)match(input,68,FOLLOW_65); 

            	    				newLeafNode(otherlv_7, grammarAccess.getIfEquationAccess().getThenKeyword_4_2());
            	    			
            	    // InternalModelica.g:3253:4: ( ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )*
            	    loop74:
            	    do {
            	        int alt74=2;
            	        int LA74_0 = input.LA(1);

            	        if ( (LA74_0==35) ) {
            	            int LA74_2 = input.LA(2);

            	            if ( (LA74_2==40||LA74_2==48||LA74_2==62||(LA74_2>=78 && LA74_2<=94)) ) {
            	                alt74=1;
            	            }


            	        }
            	        else if ( ((LA74_0>=RULE_IDENT && LA74_0<=RULE_TRUE_FALSE)||LA74_0==58||LA74_0==63||LA74_0==71||LA74_0==75||LA74_0==77||LA74_0==95||LA74_0==97||(LA74_0>=99 && LA74_0<=100)) ) {
            	            alt74=1;
            	        }


            	        switch (alt74) {
            	    	case 1 :
            	    	    // InternalModelica.g:3254:5: ( (lv_elseif_eqs_8_0= ruleEquation ) ) otherlv_9= ';'
            	    	    {
            	    	    // InternalModelica.g:3254:5: ( (lv_elseif_eqs_8_0= ruleEquation ) )
            	    	    // InternalModelica.g:3255:6: (lv_elseif_eqs_8_0= ruleEquation )
            	    	    {
            	    	    // InternalModelica.g:3255:6: (lv_elseif_eqs_8_0= ruleEquation )
            	    	    // InternalModelica.g:3256:7: lv_elseif_eqs_8_0= ruleEquation
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

            	    	    otherlv_9=(Token)match(input,19,FOLLOW_65); 

            	    	    					newLeafNode(otherlv_9, grammarAccess.getIfEquationAccess().getSemicolonKeyword_4_3_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop74;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            // InternalModelica.g:3279:3: (otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==70) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalModelica.g:3280:4: otherlv_10= 'else' ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )*
                    {
                    otherlv_10=(Token)match(input,70,FOLLOW_56); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfEquationAccess().getElseKeyword_5_0());
                    			
                    // InternalModelica.g:3284:4: ( ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';' )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==35) ) {
                            int LA76_1 = input.LA(2);

                            if ( (LA76_1==40||LA76_1==48||LA76_1==62||(LA76_1>=78 && LA76_1<=94)) ) {
                                alt76=1;
                            }


                        }
                        else if ( ((LA76_0>=RULE_IDENT && LA76_0<=RULE_TRUE_FALSE)||LA76_0==58||LA76_0==63||LA76_0==71||LA76_0==75||LA76_0==77||LA76_0==95||LA76_0==97||(LA76_0>=99 && LA76_0<=100)) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalModelica.g:3285:5: ( (lv_else_eqs_11_0= ruleEquation ) ) otherlv_12= ';'
                    	    {
                    	    // InternalModelica.g:3285:5: ( (lv_else_eqs_11_0= ruleEquation ) )
                    	    // InternalModelica.g:3286:6: (lv_else_eqs_11_0= ruleEquation )
                    	    {
                    	    // InternalModelica.g:3286:6: (lv_else_eqs_11_0= ruleEquation )
                    	    // InternalModelica.g:3287:7: lv_else_eqs_11_0= ruleEquation
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

                    	    otherlv_12=(Token)match(input,19,FOLLOW_56); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getIfEquationAccess().getSemicolonKeyword_5_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,35,FOLLOW_66); 

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
    // InternalModelica.g:3322:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalModelica.g:3322:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalModelica.g:3323:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalModelica.g:3329:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' ) ;
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
            // InternalModelica.g:3335:2: ( (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' ) )
            // InternalModelica.g:3336:2: (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' )
            {
            // InternalModelica.g:3336:2: (otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if' )
            // InternalModelica.g:3337:3: otherlv_0= 'if' ( (lv_if_expr_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )* (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )? otherlv_13= 'end' otherlv_14= 'if'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            // InternalModelica.g:3341:3: ( (lv_if_expr_1_0= ruleExpression ) )
            // InternalModelica.g:3342:4: (lv_if_expr_1_0= ruleExpression )
            {
            // InternalModelica.g:3342:4: (lv_if_expr_1_0= ruleExpression )
            // InternalModelica.g:3343:5: lv_if_expr_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getIf_exprExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_64);
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

            otherlv_2=(Token)match(input,68,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getThenKeyword_2());
            		
            // InternalModelica.g:3364:3: ( ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_IDENT||LA78_0==41||LA78_0==58||(LA78_0>=66 && LA78_0<=67)||LA78_0==71||(LA78_0>=74 && LA78_0<=75)||LA78_0==100) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalModelica.g:3365:4: ( (lv_if_stmts_3_0= ruleStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3365:4: ( (lv_if_stmts_3_0= ruleStatement ) )
            	    // InternalModelica.g:3366:5: (lv_if_stmts_3_0= ruleStatement )
            	    {
            	    // InternalModelica.g:3366:5: (lv_if_stmts_3_0= ruleStatement )
            	    // InternalModelica.g:3367:6: lv_if_stmts_3_0= ruleStatement
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

            	    otherlv_4=(Token)match(input,19,FOLLOW_67); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            // InternalModelica.g:3389:3: (otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )* )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==69) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalModelica.g:3390:4: otherlv_5= 'elseif' ( (lv_elseif_exprs_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )*
            	    {
            	    otherlv_5=(Token)match(input,69,FOLLOW_40); 

            	    				newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseifKeyword_4_0());
            	    			
            	    // InternalModelica.g:3394:4: ( (lv_elseif_exprs_6_0= ruleExpression ) )
            	    // InternalModelica.g:3395:5: (lv_elseif_exprs_6_0= ruleExpression )
            	    {
            	    // InternalModelica.g:3395:5: (lv_elseif_exprs_6_0= ruleExpression )
            	    // InternalModelica.g:3396:6: lv_elseif_exprs_6_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getIfStatementAccess().getElseif_exprsExpressionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_64);
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

            	    otherlv_7=(Token)match(input,68,FOLLOW_67); 

            	    				newLeafNode(otherlv_7, grammarAccess.getIfStatementAccess().getThenKeyword_4_2());
            	    			
            	    // InternalModelica.g:3417:4: ( ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )*
            	    loop79:
            	    do {
            	        int alt79=2;
            	        int LA79_0 = input.LA(1);

            	        if ( (LA79_0==RULE_IDENT||LA79_0==41||LA79_0==58||(LA79_0>=66 && LA79_0<=67)||LA79_0==71||(LA79_0>=74 && LA79_0<=75)||LA79_0==100) ) {
            	            alt79=1;
            	        }


            	        switch (alt79) {
            	    	case 1 :
            	    	    // InternalModelica.g:3418:5: ( (lv_elseif_stmts_8_0= ruleStatement ) ) otherlv_9= ';'
            	    	    {
            	    	    // InternalModelica.g:3418:5: ( (lv_elseif_stmts_8_0= ruleStatement ) )
            	    	    // InternalModelica.g:3419:6: (lv_elseif_stmts_8_0= ruleStatement )
            	    	    {
            	    	    // InternalModelica.g:3419:6: (lv_elseif_stmts_8_0= ruleStatement )
            	    	    // InternalModelica.g:3420:7: lv_elseif_stmts_8_0= ruleStatement
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

            	    	    otherlv_9=(Token)match(input,19,FOLLOW_67); 

            	    	    					newLeafNode(otherlv_9, grammarAccess.getIfStatementAccess().getSemicolonKeyword_4_3_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop79;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            // InternalModelica.g:3443:3: (otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )* )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==70) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalModelica.g:3444:4: otherlv_10= 'else' ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )*
                    {
                    otherlv_10=(Token)match(input,70,FOLLOW_68); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                    			
                    // InternalModelica.g:3448:4: ( ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';' )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==RULE_IDENT||LA81_0==41||LA81_0==58||(LA81_0>=66 && LA81_0<=67)||LA81_0==71||(LA81_0>=74 && LA81_0<=75)||LA81_0==100) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalModelica.g:3449:5: ( (lv_else_stmts_11_0= ruleStatement ) ) otherlv_12= ';'
                    	    {
                    	    // InternalModelica.g:3449:5: ( (lv_else_stmts_11_0= ruleStatement ) )
                    	    // InternalModelica.g:3450:6: (lv_else_stmts_11_0= ruleStatement )
                    	    {
                    	    // InternalModelica.g:3450:6: (lv_else_stmts_11_0= ruleStatement )
                    	    // InternalModelica.g:3451:7: lv_else_stmts_11_0= ruleStatement
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

                    	    otherlv_12=(Token)match(input,19,FOLLOW_68); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getIfStatementAccess().getSemicolonKeyword_5_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,35,FOLLOW_66); 

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
    // InternalModelica.g:3486:1: entryRuleForEquation returns [EObject current=null] : iv_ruleForEquation= ruleForEquation EOF ;
    public final EObject entryRuleForEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEquation = null;


        try {
            // InternalModelica.g:3486:52: (iv_ruleForEquation= ruleForEquation EOF )
            // InternalModelica.g:3487:2: iv_ruleForEquation= ruleForEquation EOF
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
    // InternalModelica.g:3493:1: ruleForEquation returns [EObject current=null] : (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' ) ;
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
            // InternalModelica.g:3499:2: ( (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' ) )
            // InternalModelica.g:3500:2: (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' )
            {
            // InternalModelica.g:3500:2: (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' )
            // InternalModelica.g:3501:3: otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getForEquationAccess().getForKeyword_0());
            		
            // InternalModelica.g:3505:3: ( (lv_indices_1_0= ruleForIndices ) )
            // InternalModelica.g:3506:4: (lv_indices_1_0= ruleForIndices )
            {
            // InternalModelica.g:3506:4: (lv_indices_1_0= ruleForIndices )
            // InternalModelica.g:3507:5: lv_indices_1_0= ruleForIndices
            {

            					newCompositeNode(grammarAccess.getForEquationAccess().getIndicesForIndicesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_69);
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

            otherlv_2=(Token)match(input,72,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getForEquationAccess().getLoopKeyword_2());
            		
            // InternalModelica.g:3528:3: ( ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==35) ) {
                    int LA83_1 = input.LA(2);

                    if ( (LA83_1==40||LA83_1==48||LA83_1==62||(LA83_1>=78 && LA83_1<=94)) ) {
                        alt83=1;
                    }


                }
                else if ( ((LA83_0>=RULE_IDENT && LA83_0<=RULE_TRUE_FALSE)||LA83_0==58||LA83_0==63||LA83_0==71||LA83_0==75||LA83_0==77||LA83_0==95||LA83_0==97||(LA83_0>=99 && LA83_0<=100)) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalModelica.g:3529:4: ( (lv_eqs_3_0= ruleEquation ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3529:4: ( (lv_eqs_3_0= ruleEquation ) )
            	    // InternalModelica.g:3530:5: (lv_eqs_3_0= ruleEquation )
            	    {
            	    // InternalModelica.g:3530:5: (lv_eqs_3_0= ruleEquation )
            	    // InternalModelica.g:3531:6: lv_eqs_3_0= ruleEquation
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

            	    otherlv_4=(Token)match(input,19,FOLLOW_56); 

            	    				newLeafNode(otherlv_4, grammarAccess.getForEquationAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            otherlv_5=(Token)match(input,35,FOLLOW_70); 

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
    // InternalModelica.g:3565:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalModelica.g:3565:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalModelica.g:3566:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalModelica.g:3572:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' ) ;
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
            // InternalModelica.g:3578:2: ( (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' ) )
            // InternalModelica.g:3579:2: (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' )
            {
            // InternalModelica.g:3579:2: (otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for' )
            // InternalModelica.g:3580:3: otherlv_0= 'for' ( (lv_indices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'for'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
            		
            // InternalModelica.g:3584:3: ( (lv_indices_1_0= ruleForIndices ) )
            // InternalModelica.g:3585:4: (lv_indices_1_0= ruleForIndices )
            {
            // InternalModelica.g:3585:4: (lv_indices_1_0= ruleForIndices )
            // InternalModelica.g:3586:5: lv_indices_1_0= ruleForIndices
            {

            					newCompositeNode(grammarAccess.getForStatementAccess().getIndicesForIndicesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_69);
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

            otherlv_2=(Token)match(input,72,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getLoopKeyword_2());
            		
            // InternalModelica.g:3607:3: ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==RULE_IDENT||LA84_0==41||LA84_0==58||(LA84_0>=66 && LA84_0<=67)||LA84_0==71||(LA84_0>=74 && LA84_0<=75)||LA84_0==100) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalModelica.g:3608:4: ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3608:4: ( (lv_stmts_3_0= ruleStatement ) )
            	    // InternalModelica.g:3609:5: (lv_stmts_3_0= ruleStatement )
            	    {
            	    // InternalModelica.g:3609:5: (lv_stmts_3_0= ruleStatement )
            	    // InternalModelica.g:3610:6: lv_stmts_3_0= ruleStatement
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

            	    otherlv_4=(Token)match(input,19,FOLLOW_68); 

            	    				newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            otherlv_5=(Token)match(input,35,FOLLOW_70); 

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
    // InternalModelica.g:3644:1: entryRuleForIndices returns [EObject current=null] : iv_ruleForIndices= ruleForIndices EOF ;
    public final EObject entryRuleForIndices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForIndices = null;


        try {
            // InternalModelica.g:3644:51: (iv_ruleForIndices= ruleForIndices EOF )
            // InternalModelica.g:3645:2: iv_ruleForIndices= ruleForIndices EOF
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
    // InternalModelica.g:3651:1: ruleForIndices returns [EObject current=null] : ( ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )* ) ;
    public final EObject ruleForIndices() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_indices_0_0 = null;

        EObject lv_indices_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3657:2: ( ( ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )* ) )
            // InternalModelica.g:3658:2: ( ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )* )
            {
            // InternalModelica.g:3658:2: ( ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )* )
            // InternalModelica.g:3659:3: ( (lv_indices_0_0= ruleForIndex ) ) (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )*
            {
            // InternalModelica.g:3659:3: ( (lv_indices_0_0= ruleForIndex ) )
            // InternalModelica.g:3660:4: (lv_indices_0_0= ruleForIndex )
            {
            // InternalModelica.g:3660:4: (lv_indices_0_0= ruleForIndex )
            // InternalModelica.g:3661:5: lv_indices_0_0= ruleForIndex
            {

            					newCompositeNode(grammarAccess.getForIndicesAccess().getIndicesForIndexParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalModelica.g:3678:3: (otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==36) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalModelica.g:3679:4: otherlv_1= ',' ( (lv_indices_2_0= ruleForIndex ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getForIndicesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:3683:4: ( (lv_indices_2_0= ruleForIndex ) )
            	    // InternalModelica.g:3684:5: (lv_indices_2_0= ruleForIndex )
            	    {
            	    // InternalModelica.g:3684:5: (lv_indices_2_0= ruleForIndex )
            	    // InternalModelica.g:3685:6: lv_indices_2_0= ruleForIndex
            	    {

            	    						newCompositeNode(grammarAccess.getForIndicesAccess().getIndicesForIndexParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
    // $ANTLR end "ruleForIndices"


    // $ANTLR start "entryRuleForIndex"
    // InternalModelica.g:3707:1: entryRuleForIndex returns [EObject current=null] : iv_ruleForIndex= ruleForIndex EOF ;
    public final EObject entryRuleForIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForIndex = null;


        try {
            // InternalModelica.g:3707:49: (iv_ruleForIndex= ruleForIndex EOF )
            // InternalModelica.g:3708:2: iv_ruleForIndex= ruleForIndex EOF
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
    // InternalModelica.g:3714:1: ruleForIndex returns [EObject current=null] : ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) ) ) ) ;
    public final EObject ruleForIndex() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3720:2: ( ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) ) ) ) )
            // InternalModelica.g:3721:2: ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) ) ) )
            {
            // InternalModelica.g:3721:2: ( ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalModelica.g:3722:3: ( (lv_id_0_0= RULE_IDENT ) ) (otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalModelica.g:3722:3: ( (lv_id_0_0= RULE_IDENT ) )
            // InternalModelica.g:3723:4: (lv_id_0_0= RULE_IDENT )
            {
            // InternalModelica.g:3723:4: (lv_id_0_0= RULE_IDENT )
            // InternalModelica.g:3724:5: lv_id_0_0= RULE_IDENT
            {
            lv_id_0_0=(Token)match(input,RULE_IDENT,FOLLOW_71); 

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

            // InternalModelica.g:3740:3: (otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalModelica.g:3741:4: otherlv_1= 'in' ( (lv_expr_2_0= ruleExpression ) )
            {
            otherlv_1=(Token)match(input,73,FOLLOW_40); 

            				newLeafNode(otherlv_1, grammarAccess.getForIndexAccess().getInKeyword_1_0());
            			
            // InternalModelica.g:3745:4: ( (lv_expr_2_0= ruleExpression ) )
            // InternalModelica.g:3746:5: (lv_expr_2_0= ruleExpression )
            {
            // InternalModelica.g:3746:5: (lv_expr_2_0= ruleExpression )
            // InternalModelica.g:3747:6: lv_expr_2_0= ruleExpression
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
    // InternalModelica.g:3769:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalModelica.g:3769:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalModelica.g:3770:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalModelica.g:3776:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while' ) ;
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
            // InternalModelica.g:3782:2: ( (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while' ) )
            // InternalModelica.g:3783:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while' )
            {
            // InternalModelica.g:3783:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while' )
            // InternalModelica.g:3784:3: otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'loop' ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* otherlv_5= 'end' otherlv_6= 'while'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
            		
            // InternalModelica.g:3788:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalModelica.g:3789:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalModelica.g:3789:4: (lv_cond_1_0= ruleExpression )
            // InternalModelica.g:3790:5: lv_cond_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getCondExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_69);
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

            otherlv_2=(Token)match(input,72,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getLoopKeyword_2());
            		
            // InternalModelica.g:3811:3: ( ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==RULE_IDENT||LA86_0==41||LA86_0==58||(LA86_0>=66 && LA86_0<=67)||LA86_0==71||(LA86_0>=74 && LA86_0<=75)||LA86_0==100) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalModelica.g:3812:4: ( (lv_stmts_3_0= ruleStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3812:4: ( (lv_stmts_3_0= ruleStatement ) )
            	    // InternalModelica.g:3813:5: (lv_stmts_3_0= ruleStatement )
            	    {
            	    // InternalModelica.g:3813:5: (lv_stmts_3_0= ruleStatement )
            	    // InternalModelica.g:3814:6: lv_stmts_3_0= ruleStatement
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

            	    otherlv_4=(Token)match(input,19,FOLLOW_68); 

            	    				newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            otherlv_5=(Token)match(input,35,FOLLOW_72); 

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
    // InternalModelica.g:3848:1: entryRuleWhenEquation returns [EObject current=null] : iv_ruleWhenEquation= ruleWhenEquation EOF ;
    public final EObject entryRuleWhenEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenEquation = null;


        try {
            // InternalModelica.g:3848:53: (iv_ruleWhenEquation= ruleWhenEquation EOF )
            // InternalModelica.g:3849:2: iv_ruleWhenEquation= ruleWhenEquation EOF
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
    // InternalModelica.g:3855:1: ruleWhenEquation returns [EObject current=null] : (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' ) ) ) ;
    public final EObject ruleWhenEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_when_1_0 = null;

        EObject lv_when_eqs_3_0 = null;

        EObject lv_elsehwhen_6_0 = null;

        EObject lv_elsewhen_eqs_8_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:3861:2: ( (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' ) ) ) )
            // InternalModelica.g:3862:2: (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' ) ) )
            {
            // InternalModelica.g:3862:2: (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' ) ) )
            // InternalModelica.g:3863:3: otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenEquationAccess().getWhenKeyword_0());
            		
            // InternalModelica.g:3867:3: ( (lv_when_1_0= ruleExpression ) )
            // InternalModelica.g:3868:4: (lv_when_1_0= ruleExpression )
            {
            // InternalModelica.g:3868:4: (lv_when_1_0= ruleExpression )
            // InternalModelica.g:3869:5: lv_when_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhenEquationAccess().getWhenExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_64);
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

            otherlv_2=(Token)match(input,68,FOLLOW_73); 

            			newLeafNode(otherlv_2, grammarAccess.getWhenEquationAccess().getThenKeyword_2());
            		
            // InternalModelica.g:3890:3: ( ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';' )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( ((LA87_0>=RULE_IDENT && LA87_0<=RULE_TRUE_FALSE)||LA87_0==35||LA87_0==58||LA87_0==63||LA87_0==71||LA87_0==75||LA87_0==77||LA87_0==95||LA87_0==97||(LA87_0>=99 && LA87_0<=100)) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalModelica.g:3891:4: ( (lv_when_eqs_3_0= ruleEquation ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:3891:4: ( (lv_when_eqs_3_0= ruleEquation ) )
            	    // InternalModelica.g:3892:5: (lv_when_eqs_3_0= ruleEquation )
            	    {
            	    // InternalModelica.g:3892:5: (lv_when_eqs_3_0= ruleEquation )
            	    // InternalModelica.g:3893:6: lv_when_eqs_3_0= ruleEquation
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

            	    otherlv_4=(Token)match(input,19,FOLLOW_73); 

            	    				newLeafNode(otherlv_4, grammarAccess.getWhenEquationAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            // InternalModelica.g:3915:3: (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' ) )
            // InternalModelica.g:3916:4: otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )
            {
            otherlv_5=(Token)match(input,76,FOLLOW_40); 

            				newLeafNode(otherlv_5, grammarAccess.getWhenEquationAccess().getElsewhenKeyword_4_0());
            			
            // InternalModelica.g:3920:4: ( (lv_elsehwhen_6_0= ruleExpression ) )
            // InternalModelica.g:3921:5: (lv_elsehwhen_6_0= ruleExpression )
            {
            // InternalModelica.g:3921:5: (lv_elsehwhen_6_0= ruleExpression )
            // InternalModelica.g:3922:6: lv_elsehwhen_6_0= ruleExpression
            {

            						newCompositeNode(grammarAccess.getWhenEquationAccess().getElsehwhenExpressionParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_64);
            lv_elsehwhen_6_0=ruleExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getWhenEquationRule());
            						}
            						set(
            							current,
            							"elsehwhen",
            							lv_elsehwhen_6_0,
            							"xmodelica.Modelica.Expression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_7=(Token)match(input,68,FOLLOW_56); 

            				newLeafNode(otherlv_7, grammarAccess.getWhenEquationAccess().getThenKeyword_4_2());
            			
            // InternalModelica.g:3943:4: ( ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';' )
            // InternalModelica.g:3944:5: ( (lv_elsewhen_eqs_8_0= ruleEquation ) ) otherlv_9= ';'
            {
            // InternalModelica.g:3944:5: ( (lv_elsewhen_eqs_8_0= ruleEquation ) )
            // InternalModelica.g:3945:6: (lv_elsewhen_eqs_8_0= ruleEquation )
            {
            // InternalModelica.g:3945:6: (lv_elsewhen_eqs_8_0= ruleEquation )
            // InternalModelica.g:3946:7: lv_elsewhen_eqs_8_0= ruleEquation
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

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            					newLeafNode(otherlv_9, grammarAccess.getWhenEquationAccess().getSemicolonKeyword_4_3_1());
            				

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
    // $ANTLR end "ruleWhenEquation"


    // $ANTLR start "entryRuleWhenStatement"
    // InternalModelica.g:3973:1: entryRuleWhenStatement returns [EObject current=null] : iv_ruleWhenStatement= ruleWhenStatement EOF ;
    public final EObject entryRuleWhenStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenStatement = null;


        try {
            // InternalModelica.g:3973:54: (iv_ruleWhenStatement= ruleWhenStatement EOF )
            // InternalModelica.g:3974:2: iv_ruleWhenStatement= ruleWhenStatement EOF
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
    // InternalModelica.g:3980:1: ruleWhenStatement returns [EObject current=null] : (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) ) ) ;
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
            // InternalModelica.g:3986:2: ( (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) ) ) )
            // InternalModelica.g:3987:2: (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) ) )
            {
            // InternalModelica.g:3987:2: (otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) ) )
            // InternalModelica.g:3988:3: otherlv_0= 'when' ( (lv_when_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )* (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenStatementAccess().getWhenKeyword_0());
            		
            // InternalModelica.g:3992:3: ( (lv_when_1_0= ruleExpression ) )
            // InternalModelica.g:3993:4: (lv_when_1_0= ruleExpression )
            {
            // InternalModelica.g:3993:4: (lv_when_1_0= ruleExpression )
            // InternalModelica.g:3994:5: lv_when_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhenStatementAccess().getWhenExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_64);
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

            otherlv_2=(Token)match(input,68,FOLLOW_74); 

            			newLeafNode(otherlv_2, grammarAccess.getWhenStatementAccess().getThenKeyword_2());
            		
            // InternalModelica.g:4015:3: ( ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';' )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==RULE_IDENT||LA88_0==41||LA88_0==58||(LA88_0>=66 && LA88_0<=67)||LA88_0==71||(LA88_0>=74 && LA88_0<=75)||LA88_0==100) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalModelica.g:4016:4: ( (lv_when_stmts_3_0= ruleStatement ) ) otherlv_4= ';'
            	    {
            	    // InternalModelica.g:4016:4: ( (lv_when_stmts_3_0= ruleStatement ) )
            	    // InternalModelica.g:4017:5: (lv_when_stmts_3_0= ruleStatement )
            	    {
            	    // InternalModelica.g:4017:5: (lv_when_stmts_3_0= ruleStatement )
            	    // InternalModelica.g:4018:6: lv_when_stmts_3_0= ruleStatement
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

            	    otherlv_4=(Token)match(input,19,FOLLOW_74); 

            	    				newLeafNode(otherlv_4, grammarAccess.getWhenStatementAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            // InternalModelica.g:4040:3: (otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' ) )
            // InternalModelica.g:4041:4: otherlv_5= 'elsewhen' ( (lv_elsehwhen_6_0= ruleExpression ) ) otherlv_7= 'then' ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )
            {
            otherlv_5=(Token)match(input,76,FOLLOW_40); 

            				newLeafNode(otherlv_5, grammarAccess.getWhenStatementAccess().getElsewhenKeyword_4_0());
            			
            // InternalModelica.g:4045:4: ( (lv_elsehwhen_6_0= ruleExpression ) )
            // InternalModelica.g:4046:5: (lv_elsehwhen_6_0= ruleExpression )
            {
            // InternalModelica.g:4046:5: (lv_elsehwhen_6_0= ruleExpression )
            // InternalModelica.g:4047:6: lv_elsehwhen_6_0= ruleExpression
            {

            						newCompositeNode(grammarAccess.getWhenStatementAccess().getElsehwhenExpressionParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_64);
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

            otherlv_7=(Token)match(input,68,FOLLOW_59); 

            				newLeafNode(otherlv_7, grammarAccess.getWhenStatementAccess().getThenKeyword_4_2());
            			
            // InternalModelica.g:4068:4: ( ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';' )
            // InternalModelica.g:4069:5: ( (lv_elsewhen_stmts_8_0= ruleStatement ) ) otherlv_9= ';'
            {
            // InternalModelica.g:4069:5: ( (lv_elsewhen_stmts_8_0= ruleStatement ) )
            // InternalModelica.g:4070:6: (lv_elsewhen_stmts_8_0= ruleStatement )
            {
            // InternalModelica.g:4070:6: (lv_elsewhen_stmts_8_0= ruleStatement )
            // InternalModelica.g:4071:7: lv_elsewhen_stmts_8_0= ruleStatement
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


    // $ANTLR start "entryRuleConnectClause"
    // InternalModelica.g:4098:1: entryRuleConnectClause returns [EObject current=null] : iv_ruleConnectClause= ruleConnectClause EOF ;
    public final EObject entryRuleConnectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectClause = null;


        try {
            // InternalModelica.g:4098:54: (iv_ruleConnectClause= ruleConnectClause EOF )
            // InternalModelica.g:4099:2: iv_ruleConnectClause= ruleConnectClause EOF
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
    // InternalModelica.g:4105:1: ruleConnectClause returns [EObject current=null] : (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponentReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponentReference ) ) otherlv_5= ')' ) ;
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
            // InternalModelica.g:4111:2: ( (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponentReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponentReference ) ) otherlv_5= ')' ) )
            // InternalModelica.g:4112:2: (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponentReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponentReference ) ) otherlv_5= ')' )
            {
            // InternalModelica.g:4112:2: (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponentReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponentReference ) ) otherlv_5= ')' )
            // InternalModelica.g:4113:3: otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponentReference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponentReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectClauseAccess().getConnectKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectClauseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalModelica.g:4121:3: ( (lv_left_2_0= ruleComponentReference ) )
            // InternalModelica.g:4122:4: (lv_left_2_0= ruleComponentReference )
            {
            // InternalModelica.g:4122:4: (lv_left_2_0= ruleComponentReference )
            // InternalModelica.g:4123:5: lv_left_2_0= ruleComponentReference
            {

            					newCompositeNode(grammarAccess.getConnectClauseAccess().getLeftComponentReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_75);
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

            otherlv_3=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectClauseAccess().getCommaKeyword_3());
            		
            // InternalModelica.g:4144:3: ( (lv_right_4_0= ruleComponentReference ) )
            // InternalModelica.g:4145:4: (lv_right_4_0= ruleComponentReference )
            {
            // InternalModelica.g:4145:4: (lv_right_4_0= ruleComponentReference )
            // InternalModelica.g:4146:5: lv_right_4_0= ruleComponentReference
            {

            					newCompositeNode(grammarAccess.getConnectClauseAccess().getRightComponentReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
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
    // InternalModelica.g:4171:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalModelica.g:4171:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalModelica.g:4172:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalModelica.g:4178:1: ruleExpression returns [EObject current=null] : (this_SimpleExpression_0= ruleSimpleExpression | (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) ) ) ;
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
            // InternalModelica.g:4184:2: ( (this_SimpleExpression_0= ruleSimpleExpression | (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) ) ) )
            // InternalModelica.g:4185:2: (this_SimpleExpression_0= ruleSimpleExpression | (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) ) )
            {
            // InternalModelica.g:4185:2: (this_SimpleExpression_0= ruleSimpleExpression | (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=RULE_IDENT && LA90_0<=RULE_TRUE_FALSE)||LA90_0==35||LA90_0==63||LA90_0==95||LA90_0==97||(LA90_0>=99 && LA90_0<=100)) ) {
                alt90=1;
            }
            else if ( (LA90_0==58) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalModelica.g:4186:3: this_SimpleExpression_0= ruleSimpleExpression
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
                    // InternalModelica.g:4195:3: (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) )
                    {
                    // InternalModelica.g:4195:3: (otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) ) )
                    // InternalModelica.g:4196:4: otherlv_1= 'if' ( (lv_if_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )* otherlv_9= 'else' ( (lv_else_10_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getIfKeyword_1_0());
                    			
                    // InternalModelica.g:4200:4: ( (lv_if_2_0= ruleExpression ) )
                    // InternalModelica.g:4201:5: (lv_if_2_0= ruleExpression )
                    {
                    // InternalModelica.g:4201:5: (lv_if_2_0= ruleExpression )
                    // InternalModelica.g:4202:6: lv_if_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getIfExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

                    otherlv_3=(Token)match(input,68,FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getThenKeyword_1_2());
                    			
                    // InternalModelica.g:4223:4: ( (lv_then_4_0= ruleExpression ) )
                    // InternalModelica.g:4224:5: (lv_then_4_0= ruleExpression )
                    {
                    // InternalModelica.g:4224:5: (lv_then_4_0= ruleExpression )
                    // InternalModelica.g:4225:6: lv_then_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getThenExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_76);
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

                    // InternalModelica.g:4242:4: (otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==69) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalModelica.g:4243:5: otherlv_5= 'elseif' ( (lv_elseif_6_0= ruleExpression ) ) otherlv_7= 'then' ( (lv_elseifthen_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,69,FOLLOW_40); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getElseifKeyword_1_4_0());
                    	    				
                    	    // InternalModelica.g:4247:5: ( (lv_elseif_6_0= ruleExpression ) )
                    	    // InternalModelica.g:4248:6: (lv_elseif_6_0= ruleExpression )
                    	    {
                    	    // InternalModelica.g:4248:6: (lv_elseif_6_0= ruleExpression )
                    	    // InternalModelica.g:4249:7: lv_elseif_6_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getElseifExpressionParserRuleCall_1_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_64);
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

                    	    otherlv_7=(Token)match(input,68,FOLLOW_40); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getThenKeyword_1_4_2());
                    	    				
                    	    // InternalModelica.g:4270:5: ( (lv_elseifthen_8_0= ruleExpression ) )
                    	    // InternalModelica.g:4271:6: (lv_elseifthen_8_0= ruleExpression )
                    	    {
                    	    // InternalModelica.g:4271:6: (lv_elseifthen_8_0= ruleExpression )
                    	    // InternalModelica.g:4272:7: lv_elseifthen_8_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getElseifthenExpressionParserRuleCall_1_4_3_0());
                    	    						
                    	    pushFollow(FOLLOW_76);
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
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,70,FOLLOW_40); 

                    				newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getElseKeyword_1_5());
                    			
                    // InternalModelica.g:4294:4: ( (lv_else_10_0= ruleExpression ) )
                    // InternalModelica.g:4295:5: (lv_else_10_0= ruleExpression )
                    {
                    // InternalModelica.g:4295:5: (lv_else_10_0= ruleExpression )
                    // InternalModelica.g:4296:6: lv_else_10_0= ruleExpression
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
    // InternalModelica.g:4318:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // InternalModelica.g:4318:57: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // InternalModelica.g:4319:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
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
    // InternalModelica.g:4325:1: ruleSimpleExpression returns [EObject current=null] : (this_LogicalExpression_0= ruleLogicalExpression (otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )? )? ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_LogicalExpression_0 = null;

        EObject lv_exprs_3_0 = null;

        EObject lv_exprs_5_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4331:2: ( (this_LogicalExpression_0= ruleLogicalExpression (otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )? )? ) )
            // InternalModelica.g:4332:2: (this_LogicalExpression_0= ruleLogicalExpression (otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )? )? )
            {
            // InternalModelica.g:4332:2: (this_LogicalExpression_0= ruleLogicalExpression (otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )? )? )
            // InternalModelica.g:4333:3: this_LogicalExpression_0= ruleLogicalExpression (otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )? )?
            {

            			newCompositeNode(grammarAccess.getSimpleExpressionAccess().getLogicalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_77);
            this_LogicalExpression_0=ruleLogicalExpression();

            state._fsp--;


            			current = this_LogicalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:4341:3: (otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )? )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==62) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalModelica.g:4342:4: otherlv_1= ':' () ( (lv_exprs_3_0= ruleLogicalExpression ) ) (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )?
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_78); 

                    				newLeafNode(otherlv_1, grammarAccess.getSimpleExpressionAccess().getColonKeyword_1_0());
                    			
                    // InternalModelica.g:4346:4: ()
                    // InternalModelica.g:4347:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getSimpleExpressionAccess().getSimpleExpressionExprsAction_1_1(),
                    						current);
                    				

                    }

                    // InternalModelica.g:4353:4: ( (lv_exprs_3_0= ruleLogicalExpression ) )
                    // InternalModelica.g:4354:5: (lv_exprs_3_0= ruleLogicalExpression )
                    {
                    // InternalModelica.g:4354:5: (lv_exprs_3_0= ruleLogicalExpression )
                    // InternalModelica.g:4355:6: lv_exprs_3_0= ruleLogicalExpression
                    {

                    						newCompositeNode(grammarAccess.getSimpleExpressionAccess().getExprsLogicalExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_77);
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

                    // InternalModelica.g:4372:4: (otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==62) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalModelica.g:4373:5: otherlv_4= ':' ( (lv_exprs_5_0= ruleLogicalExpression ) )
                            {
                            otherlv_4=(Token)match(input,62,FOLLOW_78); 

                            					newLeafNode(otherlv_4, grammarAccess.getSimpleExpressionAccess().getColonKeyword_1_3_0());
                            				
                            // InternalModelica.g:4377:5: ( (lv_exprs_5_0= ruleLogicalExpression ) )
                            // InternalModelica.g:4378:6: (lv_exprs_5_0= ruleLogicalExpression )
                            {
                            // InternalModelica.g:4378:6: (lv_exprs_5_0= ruleLogicalExpression )
                            // InternalModelica.g:4379:7: lv_exprs_5_0= ruleLogicalExpression
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
    // InternalModelica.g:4402:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // InternalModelica.g:4402:58: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // InternalModelica.g:4403:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
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
    // InternalModelica.g:4409:1: ruleLogicalExpression returns [EObject current=null] : (this_LogicalTerm_0= ruleLogicalTerm ( () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) ) )* ) ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalTerm_0 = null;

        EObject lv_terms_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4415:2: ( (this_LogicalTerm_0= ruleLogicalTerm ( () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) ) )* ) )
            // InternalModelica.g:4416:2: (this_LogicalTerm_0= ruleLogicalTerm ( () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) ) )* )
            {
            // InternalModelica.g:4416:2: (this_LogicalTerm_0= ruleLogicalTerm ( () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) ) )* )
            // InternalModelica.g:4417:3: this_LogicalTerm_0= ruleLogicalTerm ( () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLogicalTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_79);
            this_LogicalTerm_0=ruleLogicalTerm();

            state._fsp--;


            			current = this_LogicalTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:4425:3: ( () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==78) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalModelica.g:4426:4: () otherlv_2= 'or' ( (lv_terms_3_0= ruleLogicalTerm ) )
            	    {
            	    // InternalModelica.g:4426:4: ()
            	    // InternalModelica.g:4427:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getLogicalExpressionAccess().getLogicalExpressionTermsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,78,FOLLOW_78); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLogicalExpressionAccess().getOrKeyword_1_1());
            	    			
            	    // InternalModelica.g:4437:4: ( (lv_terms_3_0= ruleLogicalTerm ) )
            	    // InternalModelica.g:4438:5: (lv_terms_3_0= ruleLogicalTerm )
            	    {
            	    // InternalModelica.g:4438:5: (lv_terms_3_0= ruleLogicalTerm )
            	    // InternalModelica.g:4439:6: lv_terms_3_0= ruleLogicalTerm
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalExpressionAccess().getTermsLogicalTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_79);
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
            	    break loop93;
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
    // InternalModelica.g:4461:1: entryRuleLogicalTerm returns [EObject current=null] : iv_ruleLogicalTerm= ruleLogicalTerm EOF ;
    public final EObject entryRuleLogicalTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalTerm = null;


        try {
            // InternalModelica.g:4461:52: (iv_ruleLogicalTerm= ruleLogicalTerm EOF )
            // InternalModelica.g:4462:2: iv_ruleLogicalTerm= ruleLogicalTerm EOF
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
    // InternalModelica.g:4468:1: ruleLogicalTerm returns [EObject current=null] : (this_LogicalFactor_0= ruleLogicalFactor ( () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) ) )* ) ;
    public final EObject ruleLogicalTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalFactor_0 = null;

        EObject lv_factors_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4474:2: ( (this_LogicalFactor_0= ruleLogicalFactor ( () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) ) )* ) )
            // InternalModelica.g:4475:2: (this_LogicalFactor_0= ruleLogicalFactor ( () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) ) )* )
            {
            // InternalModelica.g:4475:2: (this_LogicalFactor_0= ruleLogicalFactor ( () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) ) )* )
            // InternalModelica.g:4476:3: this_LogicalFactor_0= ruleLogicalFactor ( () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalTermAccess().getLogicalFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_80);
            this_LogicalFactor_0=ruleLogicalFactor();

            state._fsp--;


            			current = this_LogicalFactor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:4484:3: ( () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==79) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalModelica.g:4485:4: () otherlv_2= 'and' ( (lv_factors_3_0= ruleLogicalFactor ) )
            	    {
            	    // InternalModelica.g:4485:4: ()
            	    // InternalModelica.g:4486:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getLogicalTermAccess().getLogicalFactorFactorsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,79,FOLLOW_78); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLogicalTermAccess().getAndKeyword_1_1());
            	    			
            	    // InternalModelica.g:4496:4: ( (lv_factors_3_0= ruleLogicalFactor ) )
            	    // InternalModelica.g:4497:5: (lv_factors_3_0= ruleLogicalFactor )
            	    {
            	    // InternalModelica.g:4497:5: (lv_factors_3_0= ruleLogicalFactor )
            	    // InternalModelica.g:4498:6: lv_factors_3_0= ruleLogicalFactor
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalTermAccess().getFactorsLogicalFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_80);
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
            	    break loop94;
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
    // InternalModelica.g:4520:1: entryRuleLogicalFactor returns [EObject current=null] : iv_ruleLogicalFactor= ruleLogicalFactor EOF ;
    public final EObject entryRuleLogicalFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalFactor = null;


        try {
            // InternalModelica.g:4520:54: (iv_ruleLogicalFactor= ruleLogicalFactor EOF )
            // InternalModelica.g:4521:2: iv_ruleLogicalFactor= ruleLogicalFactor EOF
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
    // InternalModelica.g:4527:1: ruleLogicalFactor returns [EObject current=null] : this_Relation_0= ruleRelation ;
    public final EObject ruleLogicalFactor() throws RecognitionException {
        EObject current = null;

        EObject this_Relation_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4533:2: (this_Relation_0= ruleRelation )
            // InternalModelica.g:4534:2: this_Relation_0= ruleRelation
            {

            		newCompositeNode(grammarAccess.getLogicalFactorAccess().getRelationParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Relation_0=ruleRelation();

            state._fsp--;


            		current = this_Relation_0;
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
    // $ANTLR end "ruleLogicalFactor"


    // $ANTLR start "entryRuleRelation"
    // InternalModelica.g:4545:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalModelica.g:4545:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalModelica.g:4546:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalModelica.g:4552:1: ruleRelation returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )? ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4558:2: ( (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )? ) )
            // InternalModelica.g:4559:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )? )
            {
            // InternalModelica.g:4559:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )? )
            // InternalModelica.g:4560:3: this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getRelationAccess().getArithmeticExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_81);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;


            			current = this_ArithmeticExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:4568:3: ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0>=80 && LA95_0<=85)) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalModelica.g:4569:4: () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleArithmeticExpression ) )
                    {
                    // InternalModelica.g:4569:4: ()
                    // InternalModelica.g:4570:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getRelationAccess().getRelationLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalModelica.g:4576:4: ( (lv_op_2_0= ruleRelOp ) )
                    // InternalModelica.g:4577:5: (lv_op_2_0= ruleRelOp )
                    {
                    // InternalModelica.g:4577:5: (lv_op_2_0= ruleRelOp )
                    // InternalModelica.g:4578:6: lv_op_2_0= ruleRelOp
                    {

                    						newCompositeNode(grammarAccess.getRelationAccess().getOpRelOpParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_op_2_0=ruleRelOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"xmodelica.Modelica.RelOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelica.g:4595:4: ( (lv_right_3_0= ruleArithmeticExpression ) )
                    // InternalModelica.g:4596:5: (lv_right_3_0= ruleArithmeticExpression )
                    {
                    // InternalModelica.g:4596:5: (lv_right_3_0= ruleArithmeticExpression )
                    // InternalModelica.g:4597:6: lv_right_3_0= ruleArithmeticExpression
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
    // InternalModelica.g:4619:1: entryRuleRelOp returns [String current=null] : iv_ruleRelOp= ruleRelOp EOF ;
    public final String entryRuleRelOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelOp = null;


        try {
            // InternalModelica.g:4619:45: (iv_ruleRelOp= ruleRelOp EOF )
            // InternalModelica.g:4620:2: iv_ruleRelOp= ruleRelOp EOF
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
    // InternalModelica.g:4626:1: ruleRelOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken ruleRelOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:4632:2: ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) )
            // InternalModelica.g:4633:2: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' )
            {
            // InternalModelica.g:4633:2: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' )
            int alt96=6;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt96=1;
                }
                break;
            case 81:
                {
                alt96=2;
                }
                break;
            case 82:
                {
                alt96=3;
                }
                break;
            case 83:
                {
                alt96=4;
                }
                break;
            case 84:
                {
                alt96=5;
                }
                break;
            case 85:
                {
                alt96=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalModelica.g:4634:3: kw= '<'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:4640:3: kw= '<='
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelica.g:4646:3: kw= '>'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalModelica.g:4652:3: kw= '>='
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalModelica.g:4658:3: kw= '=='
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelOpAccess().getEqualsSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalModelica.g:4664:3: kw= '<>'
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
    // InternalModelica.g:4673:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalModelica.g:4673:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalModelica.g:4674:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
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
    // InternalModelica.g:4680:1: ruleArithmeticExpression returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;

        AntlrDatatypeRuleToken lv_ops_2_0 = null;

        EObject lv_terms_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4686:2: ( (this_Term_0= ruleTerm ( () ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) ) )* ) )
            // InternalModelica.g:4687:2: (this_Term_0= ruleTerm ( () ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) ) )* )
            {
            // InternalModelica.g:4687:2: (this_Term_0= ruleTerm ( () ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) ) )* )
            // InternalModelica.g:4688:3: this_Term_0= ruleTerm ( () ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_82);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:4696:3: ( () ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=86 && LA97_0<=89)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalModelica.g:4697:4: () ( (lv_ops_2_0= ruleAddOp ) ) ( (lv_terms_3_0= ruleTerm ) )
            	    {
            	    // InternalModelica.g:4697:4: ()
            	    // InternalModelica.g:4698:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getArithmeticExpressionAccess().getArithmeticExpressionTermsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalModelica.g:4704:4: ( (lv_ops_2_0= ruleAddOp ) )
            	    // InternalModelica.g:4705:5: (lv_ops_2_0= ruleAddOp )
            	    {
            	    // InternalModelica.g:4705:5: (lv_ops_2_0= ruleAddOp )
            	    // InternalModelica.g:4706:6: lv_ops_2_0= ruleAddOp
            	    {

            	    						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getOpsAddOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_78);
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

            	    // InternalModelica.g:4723:4: ( (lv_terms_3_0= ruleTerm ) )
            	    // InternalModelica.g:4724:5: (lv_terms_3_0= ruleTerm )
            	    {
            	    // InternalModelica.g:4724:5: (lv_terms_3_0= ruleTerm )
            	    // InternalModelica.g:4725:6: lv_terms_3_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getTermsTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_82);
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
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleAddOp"
    // InternalModelica.g:4747:1: entryRuleAddOp returns [String current=null] : iv_ruleAddOp= ruleAddOp EOF ;
    public final String entryRuleAddOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddOp = null;


        try {
            // InternalModelica.g:4747:45: (iv_ruleAddOp= ruleAddOp EOF )
            // InternalModelica.g:4748:2: iv_ruleAddOp= ruleAddOp EOF
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
    // InternalModelica.g:4754:1: ruleAddOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) ;
    public final AntlrDatatypeRuleToken ruleAddOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:4760:2: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) )
            // InternalModelica.g:4761:2: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )
            {
            // InternalModelica.g:4761:2: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )
            int alt98=4;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt98=1;
                }
                break;
            case 87:
                {
                alt98=2;
                }
                break;
            case 88:
                {
                alt98=3;
                }
                break;
            case 89:
                {
                alt98=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalModelica.g:4762:3: kw= '+'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAddOpAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:4768:3: kw= '-'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAddOpAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelica.g:4774:3: kw= '.+'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAddOpAccess().getFullStopPlusSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalModelica.g:4780:3: kw= '.-'
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
    // InternalModelica.g:4789:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalModelica.g:4789:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalModelica.g:4790:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalModelica.g:4796:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_ops_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Factor_0 = null;

        AntlrDatatypeRuleToken lv_ops_2_0 = null;

        EObject lv_factors_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4802:2: ( (this_Factor_0= ruleFactor ( () ( (lv_ops_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) ) )* ) )
            // InternalModelica.g:4803:2: (this_Factor_0= ruleFactor ( () ( (lv_ops_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) ) )* )
            {
            // InternalModelica.g:4803:2: (this_Factor_0= ruleFactor ( () ( (lv_ops_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) ) )* )
            // InternalModelica.g:4804:3: this_Factor_0= ruleFactor ( () ( (lv_ops_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_83);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:4812:3: ( () ( (lv_ops_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==48||(LA99_0>=90 && LA99_0<=92)) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalModelica.g:4813:4: () ( (lv_ops_2_0= ruleMulOp ) ) ( (lv_factors_3_0= ruleFactor ) )
            	    {
            	    // InternalModelica.g:4813:4: ()
            	    // InternalModelica.g:4814:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getTermAccess().getTermFactorsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalModelica.g:4820:4: ( (lv_ops_2_0= ruleMulOp ) )
            	    // InternalModelica.g:4821:5: (lv_ops_2_0= ruleMulOp )
            	    {
            	    // InternalModelica.g:4821:5: (lv_ops_2_0= ruleMulOp )
            	    // InternalModelica.g:4822:6: lv_ops_2_0= ruleMulOp
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getOpsMulOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_78);
            	    lv_ops_2_0=ruleMulOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ops",
            	    							lv_ops_2_0,
            	    							"xmodelica.Modelica.MulOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalModelica.g:4839:4: ( (lv_factors_3_0= ruleFactor ) )
            	    // InternalModelica.g:4840:5: (lv_factors_3_0= ruleFactor )
            	    {
            	    // InternalModelica.g:4840:5: (lv_factors_3_0= ruleFactor )
            	    // InternalModelica.g:4841:6: lv_factors_3_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_83);
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleMulOp"
    // InternalModelica.g:4863:1: entryRuleMulOp returns [String current=null] : iv_ruleMulOp= ruleMulOp EOF ;
    public final String entryRuleMulOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMulOp = null;


        try {
            // InternalModelica.g:4863:45: (iv_ruleMulOp= ruleMulOp EOF )
            // InternalModelica.g:4864:2: iv_ruleMulOp= ruleMulOp EOF
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
    // InternalModelica.g:4870:1: ruleMulOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '.*' | kw= './' ) ;
    public final AntlrDatatypeRuleToken ruleMulOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelica.g:4876:2: ( (kw= '*' | kw= '/' | kw= '.*' | kw= './' ) )
            // InternalModelica.g:4877:2: (kw= '*' | kw= '/' | kw= '.*' | kw= './' )
            {
            // InternalModelica.g:4877:2: (kw= '*' | kw= '/' | kw= '.*' | kw= './' )
            int alt100=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt100=1;
                }
                break;
            case 90:
                {
                alt100=2;
                }
                break;
            case 91:
                {
                alt100=3;
                }
                break;
            case 92:
                {
                alt100=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalModelica.g:4878:3: kw= '*'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMulOpAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelica.g:4884:3: kw= '/'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMulOpAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelica.g:4890:3: kw= '.*'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMulOpAccess().getFullStopAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalModelica.g:4896:3: kw= './'
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
    // InternalModelica.g:4905:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalModelica.g:4905:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalModelica.g:4906:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalModelica.g:4912:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) ) )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:4918:2: ( (this_Primary_0= rulePrimary ( () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) ) )? ) )
            // InternalModelica.g:4919:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) ) )? )
            {
            // InternalModelica.g:4919:2: (this_Primary_0= rulePrimary ( () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) ) )? )
            // InternalModelica.g:4920:3: this_Primary_0= rulePrimary ( () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) ) )?
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_84);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalModelica.g:4928:3: ( () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( ((LA102_0>=93 && LA102_0<=94)) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalModelica.g:4929:4: () (otherlv_2= '^' | otherlv_3= '.^' ) ( (lv_exp_4_0= rulePrimary ) )
                    {
                    // InternalModelica.g:4929:4: ()
                    // InternalModelica.g:4930:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getFactorAccess().getFactorBaseAction_1_0(),
                    						current);
                    				

                    }

                    // InternalModelica.g:4936:4: (otherlv_2= '^' | otherlv_3= '.^' )
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==93) ) {
                        alt101=1;
                    }
                    else if ( (LA101_0==94) ) {
                        alt101=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 101, 0, input);

                        throw nvae;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalModelica.g:4937:5: otherlv_2= '^'
                            {
                            otherlv_2=(Token)match(input,93,FOLLOW_78); 

                            					newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getCircumflexAccentKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalModelica.g:4942:5: otherlv_3= '.^'
                            {
                            otherlv_3=(Token)match(input,94,FOLLOW_78); 

                            					newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getFullStopCircumflexAccentKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    // InternalModelica.g:4947:4: ( (lv_exp_4_0= rulePrimary ) )
                    // InternalModelica.g:4948:5: (lv_exp_4_0= rulePrimary )
                    {
                    // InternalModelica.g:4948:5: (lv_exp_4_0= rulePrimary )
                    // InternalModelica.g:4949:6: lv_exp_4_0= rulePrimary
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
    // InternalModelica.g:4971:1: entryRuleFloatPrimary returns [EObject current=null] : iv_ruleFloatPrimary= ruleFloatPrimary EOF ;
    public final EObject entryRuleFloatPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatPrimary = null;


        try {
            // InternalModelica.g:4971:53: (iv_ruleFloatPrimary= ruleFloatPrimary EOF )
            // InternalModelica.g:4972:2: iv_ruleFloatPrimary= ruleFloatPrimary EOF
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
    // InternalModelica.g:4978:1: ruleFloatPrimary returns [EObject current=null] : ( (lv_val_0_0= RULE_UNSIGNED_NUMBER ) ) ;
    public final EObject ruleFloatPrimary() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalModelica.g:4984:2: ( ( (lv_val_0_0= RULE_UNSIGNED_NUMBER ) ) )
            // InternalModelica.g:4985:2: ( (lv_val_0_0= RULE_UNSIGNED_NUMBER ) )
            {
            // InternalModelica.g:4985:2: ( (lv_val_0_0= RULE_UNSIGNED_NUMBER ) )
            // InternalModelica.g:4986:3: (lv_val_0_0= RULE_UNSIGNED_NUMBER )
            {
            // InternalModelica.g:4986:3: (lv_val_0_0= RULE_UNSIGNED_NUMBER )
            // InternalModelica.g:4987:4: lv_val_0_0= RULE_UNSIGNED_NUMBER
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
    // InternalModelica.g:5006:1: entryRuleStringPrimary returns [EObject current=null] : iv_ruleStringPrimary= ruleStringPrimary EOF ;
    public final EObject entryRuleStringPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPrimary = null;


        try {
            // InternalModelica.g:5006:54: (iv_ruleStringPrimary= ruleStringPrimary EOF )
            // InternalModelica.g:5007:2: iv_ruleStringPrimary= ruleStringPrimary EOF
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
    // InternalModelica.g:5013:1: ruleStringPrimary returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringPrimary() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalModelica.g:5019:2: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalModelica.g:5020:2: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalModelica.g:5020:2: ( (lv_val_0_0= RULE_STRING ) )
            // InternalModelica.g:5021:3: (lv_val_0_0= RULE_STRING )
            {
            // InternalModelica.g:5021:3: (lv_val_0_0= RULE_STRING )
            // InternalModelica.g:5022:4: lv_val_0_0= RULE_STRING
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
    // InternalModelica.g:5041:1: entryRuleLogicalPrimary returns [EObject current=null] : iv_ruleLogicalPrimary= ruleLogicalPrimary EOF ;
    public final EObject entryRuleLogicalPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalPrimary = null;


        try {
            // InternalModelica.g:5041:55: (iv_ruleLogicalPrimary= ruleLogicalPrimary EOF )
            // InternalModelica.g:5042:2: iv_ruleLogicalPrimary= ruleLogicalPrimary EOF
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
    // InternalModelica.g:5048:1: ruleLogicalPrimary returns [EObject current=null] : ( (lv_val_0_0= RULE_TRUE_FALSE ) ) ;
    public final EObject ruleLogicalPrimary() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalModelica.g:5054:2: ( ( (lv_val_0_0= RULE_TRUE_FALSE ) ) )
            // InternalModelica.g:5055:2: ( (lv_val_0_0= RULE_TRUE_FALSE ) )
            {
            // InternalModelica.g:5055:2: ( (lv_val_0_0= RULE_TRUE_FALSE ) )
            // InternalModelica.g:5056:3: (lv_val_0_0= RULE_TRUE_FALSE )
            {
            // InternalModelica.g:5056:3: (lv_val_0_0= RULE_TRUE_FALSE )
            // InternalModelica.g:5057:4: lv_val_0_0= RULE_TRUE_FALSE
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
    // InternalModelica.g:5076:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalModelica.g:5076:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalModelica.g:5077:2: iv_ruleEnd= ruleEnd EOF
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
    // InternalModelica.g:5083:1: ruleEnd returns [EObject current=null] : ( (lv_val_0_0= 'end' ) ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalModelica.g:5089:2: ( ( (lv_val_0_0= 'end' ) ) )
            // InternalModelica.g:5090:2: ( (lv_val_0_0= 'end' ) )
            {
            // InternalModelica.g:5090:2: ( (lv_val_0_0= 'end' ) )
            // InternalModelica.g:5091:3: (lv_val_0_0= 'end' )
            {
            // InternalModelica.g:5091:3: (lv_val_0_0= 'end' )
            // InternalModelica.g:5092:4: lv_val_0_0= 'end'
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
    // InternalModelica.g:5107:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalModelica.g:5107:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalModelica.g:5108:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalModelica.g:5114:1: rulePrimary returns [EObject current=null] : (this_FloatPrimary_0= ruleFloatPrimary | this_StringPrimary_1= ruleStringPrimary | this_LogicalPrimary_2= ruleLogicalPrimary | this_FunctionCall_3= ruleFunctionCall | this_ComponentReference_4= ruleComponentReference | (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' ) | (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' ) | this_End_13= ruleEnd ) ;
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
            // InternalModelica.g:5120:2: ( (this_FloatPrimary_0= ruleFloatPrimary | this_StringPrimary_1= ruleStringPrimary | this_LogicalPrimary_2= ruleLogicalPrimary | this_FunctionCall_3= ruleFunctionCall | this_ComponentReference_4= ruleComponentReference | (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' ) | (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' ) | this_End_13= ruleEnd ) )
            // InternalModelica.g:5121:2: (this_FloatPrimary_0= ruleFloatPrimary | this_StringPrimary_1= ruleStringPrimary | this_LogicalPrimary_2= ruleLogicalPrimary | this_FunctionCall_3= ruleFunctionCall | this_ComponentReference_4= ruleComponentReference | (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' ) | (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' ) | this_End_13= ruleEnd )
            {
            // InternalModelica.g:5121:2: (this_FloatPrimary_0= ruleFloatPrimary | this_StringPrimary_1= ruleStringPrimary | this_LogicalPrimary_2= ruleLogicalPrimary | this_FunctionCall_3= ruleFunctionCall | this_ComponentReference_4= ruleComponentReference | (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' ) | (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' ) | this_End_13= ruleEnd )
            int alt104=8;
            alt104 = dfa104.predict(input);
            switch (alt104) {
                case 1 :
                    // InternalModelica.g:5122:3: this_FloatPrimary_0= ruleFloatPrimary
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
                    // InternalModelica.g:5131:3: this_StringPrimary_1= ruleStringPrimary
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
                    // InternalModelica.g:5140:3: this_LogicalPrimary_2= ruleLogicalPrimary
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
                    // InternalModelica.g:5149:3: this_FunctionCall_3= ruleFunctionCall
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
                    // InternalModelica.g:5158:3: this_ComponentReference_4= ruleComponentReference
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
                    // InternalModelica.g:5167:3: (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' )
                    {
                    // InternalModelica.g:5167:3: (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' )
                    // InternalModelica.g:5168:4: otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,95,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalModelica.g:5172:4: ( (lv_res_6_0= ruleExpressionList ) )
                    // InternalModelica.g:5173:5: (lv_res_6_0= ruleExpressionList )
                    {
                    // InternalModelica.g:5173:5: (lv_res_6_0= ruleExpressionList )
                    // InternalModelica.g:5174:6: lv_res_6_0= ruleExpressionList
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getResExpressionListParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_85);
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

                    // InternalModelica.g:5191:4: (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==19) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalModelica.g:5192:5: otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FOLLOW_40); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getSemicolonKeyword_5_2_0());
                    	    				
                    	    // InternalModelica.g:5196:5: ( (lv_res_8_0= ruleExpressionList ) )
                    	    // InternalModelica.g:5197:6: (lv_res_8_0= ruleExpressionList )
                    	    {
                    	    // InternalModelica.g:5197:6: (lv_res_8_0= ruleExpressionList )
                    	    // InternalModelica.g:5198:7: lv_res_8_0= ruleExpressionList
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrimaryAccess().getResExpressionListParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_85);
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
                    	    break loop103;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,96,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalModelica.g:5222:3: (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' )
                    {
                    // InternalModelica.g:5222:3: (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' )
                    // InternalModelica.g:5223:4: otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,97,FOLLOW_40); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getLeftCurlyBracketKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getFunctionArgumentsParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_86);
                    this_FunctionArguments_11=ruleFunctionArguments();

                    state._fsp--;


                    				current = this_FunctionArguments_11;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_12=(Token)match(input,98,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getPrimaryAccess().getRightCurlyBracketKeyword_6_2());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalModelica.g:5241:3: this_End_13= ruleEnd
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
    // InternalModelica.g:5253:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalModelica.g:5253:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalModelica.g:5254:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalModelica.g:5260:1: ruleFunctionCall returns [EObject current=null] : ( ( ( ( ruleName ) ) | otherlv_1= 'der' | otherlv_2= 'initial' ) ( (lv_args_3_0= ruleFunctionCallArgs ) ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5266:2: ( ( ( ( ( ruleName ) ) | otherlv_1= 'der' | otherlv_2= 'initial' ) ( (lv_args_3_0= ruleFunctionCallArgs ) ) ) )
            // InternalModelica.g:5267:2: ( ( ( ( ruleName ) ) | otherlv_1= 'der' | otherlv_2= 'initial' ) ( (lv_args_3_0= ruleFunctionCallArgs ) ) )
            {
            // InternalModelica.g:5267:2: ( ( ( ( ruleName ) ) | otherlv_1= 'der' | otherlv_2= 'initial' ) ( (lv_args_3_0= ruleFunctionCallArgs ) ) )
            // InternalModelica.g:5268:3: ( ( ( ruleName ) ) | otherlv_1= 'der' | otherlv_2= 'initial' ) ( (lv_args_3_0= ruleFunctionCallArgs ) )
            {
            // InternalModelica.g:5268:3: ( ( ( ruleName ) ) | otherlv_1= 'der' | otherlv_2= 'initial' )
            int alt105=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case 100:
                {
                alt105=1;
                }
                break;
            case 99:
                {
                alt105=2;
                }
                break;
            case 63:
                {
                alt105=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // InternalModelica.g:5269:4: ( ( ruleName ) )
                    {
                    // InternalModelica.g:5269:4: ( ( ruleName ) )
                    // InternalModelica.g:5270:5: ( ruleName )
                    {
                    // InternalModelica.g:5270:5: ( ruleName )
                    // InternalModelica.g:5271:6: ruleName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getComp_refClassDefinitionCrossReference_0_0_0());
                    					
                    pushFollow(FOLLOW_62);
                    ruleName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalModelica.g:5286:4: otherlv_1= 'der'
                    {
                    otherlv_1=(Token)match(input,99,FOLLOW_62); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getDerKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalModelica.g:5291:4: otherlv_2= 'initial'
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_62); 

                    				newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getInitialKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalModelica.g:5296:3: ( (lv_args_3_0= ruleFunctionCallArgs ) )
            // InternalModelica.g:5297:4: (lv_args_3_0= ruleFunctionCallArgs )
            {
            // InternalModelica.g:5297:4: (lv_args_3_0= ruleFunctionCallArgs )
            // InternalModelica.g:5298:5: lv_args_3_0= ruleFunctionCallArgs
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
    // InternalModelica.g:5319:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalModelica.g:5319:44: (iv_ruleName= ruleName EOF )
            // InternalModelica.g:5320:2: iv_ruleName= ruleName EOF
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
    // InternalModelica.g:5326:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;
        Token this_IDENT_3=null;


        	enterRule();

        try {
            // InternalModelica.g:5332:2: ( ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )* ) )
            // InternalModelica.g:5333:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )* )
            {
            // InternalModelica.g:5333:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )* )
            // InternalModelica.g:5334:3: (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '.' this_IDENT_3= RULE_IDENT )*
            {
            // InternalModelica.g:5334:3: (kw= '.' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==100) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalModelica.g:5335:4: kw= '.'
                    {
                    kw=(Token)match(input,100,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_0());
                    			

                    }
                    break;

            }

            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_87); 

            			current.merge(this_IDENT_1);
            		

            			newLeafNode(this_IDENT_1, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_1());
            		
            // InternalModelica.g:5348:3: (kw= '.' this_IDENT_3= RULE_IDENT )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==100) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // InternalModelica.g:5349:4: kw= '.' this_IDENT_3= RULE_IDENT
            	    {
            	    kw=(Token)match(input,100,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_2_0());
            	    			
            	    this_IDENT_3=(Token)match(input,RULE_IDENT,FOLLOW_87); 

            	    				current.merge(this_IDENT_3);
            	    			

            	    				newLeafNode(this_IDENT_3, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop107;
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
    // InternalModelica.g:5366:1: entryRuleComponentReference returns [EObject current=null] : iv_ruleComponentReference= ruleComponentReference EOF ;
    public final EObject entryRuleComponentReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentReference = null;


        try {
            // InternalModelica.g:5366:59: (iv_ruleComponentReference= ruleComponentReference EOF )
            // InternalModelica.g:5367:2: iv_ruleComponentReference= ruleComponentReference EOF
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
    // InternalModelica.g:5373:1: ruleComponentReference returns [EObject current=null] : ( (otherlv_0= '.' )? ( (lv_idents_1_0= RULE_IDENT ) ) ( (lv_subscripts_2_0= ruleArraySubscripts ) )? )+ ;
    public final EObject ruleComponentReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_idents_1_0=null;
        EObject lv_subscripts_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5379:2: ( ( (otherlv_0= '.' )? ( (lv_idents_1_0= RULE_IDENT ) ) ( (lv_subscripts_2_0= ruleArraySubscripts ) )? )+ )
            // InternalModelica.g:5380:2: ( (otherlv_0= '.' )? ( (lv_idents_1_0= RULE_IDENT ) ) ( (lv_subscripts_2_0= ruleArraySubscripts ) )? )+
            {
            // InternalModelica.g:5380:2: ( (otherlv_0= '.' )? ( (lv_idents_1_0= RULE_IDENT ) ) ( (lv_subscripts_2_0= ruleArraySubscripts ) )? )+
            int cnt110=0;
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==RULE_IDENT||LA110_0==100) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // InternalModelica.g:5381:3: (otherlv_0= '.' )? ( (lv_idents_1_0= RULE_IDENT ) ) ( (lv_subscripts_2_0= ruleArraySubscripts ) )?
            	    {
            	    // InternalModelica.g:5381:3: (otherlv_0= '.' )?
            	    int alt108=2;
            	    int LA108_0 = input.LA(1);

            	    if ( (LA108_0==100) ) {
            	        alt108=1;
            	    }
            	    switch (alt108) {
            	        case 1 :
            	            // InternalModelica.g:5382:4: otherlv_0= '.'
            	            {
            	            otherlv_0=(Token)match(input,100,FOLLOW_7); 

            	            				newLeafNode(otherlv_0, grammarAccess.getComponentReferenceAccess().getFullStopKeyword_0());
            	            			

            	            }
            	            break;

            	    }

            	    // InternalModelica.g:5387:3: ( (lv_idents_1_0= RULE_IDENT ) )
            	    // InternalModelica.g:5388:4: (lv_idents_1_0= RULE_IDENT )
            	    {
            	    // InternalModelica.g:5388:4: (lv_idents_1_0= RULE_IDENT )
            	    // InternalModelica.g:5389:5: lv_idents_1_0= RULE_IDENT
            	    {
            	    lv_idents_1_0=(Token)match(input,RULE_IDENT,FOLLOW_88); 

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

            	    // InternalModelica.g:5405:3: ( (lv_subscripts_2_0= ruleArraySubscripts ) )?
            	    int alt109=2;
            	    int LA109_0 = input.LA(1);

            	    if ( (LA109_0==95) ) {
            	        alt109=1;
            	    }
            	    switch (alt109) {
            	        case 1 :
            	            // InternalModelica.g:5406:4: (lv_subscripts_2_0= ruleArraySubscripts )
            	            {
            	            // InternalModelica.g:5406:4: (lv_subscripts_2_0= ruleArraySubscripts )
            	            // InternalModelica.g:5407:5: lv_subscripts_2_0= ruleArraySubscripts
            	            {

            	            					newCompositeNode(grammarAccess.getComponentReferenceAccess().getSubscriptsArraySubscriptsParserRuleCall_2_0());
            	            				
            	            pushFollow(FOLLOW_89);
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
            	    if ( cnt110 >= 1 ) break loop110;
                        EarlyExitException eee =
                            new EarlyExitException(110, input);
                        throw eee;
                }
                cnt110++;
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
    // InternalModelica.g:5428:1: entryRuleFunctionCallArgs returns [EObject current=null] : iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF ;
    public final EObject entryRuleFunctionCallArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallArgs = null;


        try {
            // InternalModelica.g:5428:57: (iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF )
            // InternalModelica.g:5429:2: iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF
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
    // InternalModelica.g:5435:1: ruleFunctionCallArgs returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_res_2_0= ruleFunctionArguments ) )? otherlv_3= ')' ) ;
    public final EObject ruleFunctionCallArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_res_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5441:2: ( ( () otherlv_1= '(' ( (lv_res_2_0= ruleFunctionArguments ) )? otherlv_3= ')' ) )
            // InternalModelica.g:5442:2: ( () otherlv_1= '(' ( (lv_res_2_0= ruleFunctionArguments ) )? otherlv_3= ')' )
            {
            // InternalModelica.g:5442:2: ( () otherlv_1= '(' ( (lv_res_2_0= ruleFunctionArguments ) )? otherlv_3= ')' )
            // InternalModelica.g:5443:3: () otherlv_1= '(' ( (lv_res_2_0= ruleFunctionArguments ) )? otherlv_3= ')'
            {
            // InternalModelica.g:5443:3: ()
            // InternalModelica.g:5444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionCallArgsAccess().getFunctionCallArgsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallArgsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalModelica.g:5454:3: ( (lv_res_2_0= ruleFunctionArguments ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( ((LA111_0>=RULE_IDENT && LA111_0<=RULE_TRUE_FALSE)||LA111_0==35||LA111_0==58||LA111_0==63||LA111_0==95||LA111_0==97||(LA111_0>=99 && LA111_0<=100)) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalModelica.g:5455:4: (lv_res_2_0= ruleFunctionArguments )
                    {
                    // InternalModelica.g:5455:4: (lv_res_2_0= ruleFunctionArguments )
                    // InternalModelica.g:5456:5: lv_res_2_0= ruleFunctionArguments
                    {

                    					newCompositeNode(grammarAccess.getFunctionCallArgsAccess().getResFunctionArgumentsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_26);
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
    // InternalModelica.g:5481:1: entryRuleFunctionArguments returns [EObject current=null] : iv_ruleFunctionArguments= ruleFunctionArguments EOF ;
    public final EObject entryRuleFunctionArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArguments = null;


        try {
            // InternalModelica.g:5481:58: (iv_ruleFunctionArguments= ruleFunctionArguments EOF )
            // InternalModelica.g:5482:2: iv_ruleFunctionArguments= ruleFunctionArguments EOF
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
    // InternalModelica.g:5488:1: ruleFunctionArguments returns [EObject current=null] : ( ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? ) | this_NamedArgument_5= ruleNamedArgument ) ;
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
            // InternalModelica.g:5494:2: ( ( ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? ) | this_NamedArgument_5= ruleNamedArgument ) )
            // InternalModelica.g:5495:2: ( ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? ) | this_NamedArgument_5= ruleNamedArgument )
            {
            // InternalModelica.g:5495:2: ( ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? ) | this_NamedArgument_5= ruleNamedArgument )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( ((LA113_0>=RULE_STRING && LA113_0<=RULE_TRUE_FALSE)||LA113_0==35||LA113_0==58||LA113_0==63||LA113_0==95||LA113_0==97||(LA113_0>=99 && LA113_0<=100)) ) {
                alt113=1;
            }
            else if ( (LA113_0==RULE_IDENT) ) {
                int LA113_2 = input.LA(2);

                if ( (LA113_2==EOF||LA113_2==RULE_IDENT||LA113_2==36||(LA113_2>=41 && LA113_2<=42)||LA113_2==48||LA113_2==62||LA113_2==71||(LA113_2>=78 && LA113_2<=95)||LA113_2==98||LA113_2==100) ) {
                    alt113=1;
                }
                else if ( (LA113_2==40) ) {
                    alt113=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalModelica.g:5496:3: ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? )
                    {
                    // InternalModelica.g:5496:3: ( ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )? )
                    // InternalModelica.g:5497:4: ( (lv_args_0_0= ruleFunctionArgument ) ) ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )?
                    {
                    // InternalModelica.g:5497:4: ( (lv_args_0_0= ruleFunctionArgument ) )
                    // InternalModelica.g:5498:5: (lv_args_0_0= ruleFunctionArgument )
                    {
                    // InternalModelica.g:5498:5: (lv_args_0_0= ruleFunctionArgument )
                    // InternalModelica.g:5499:6: lv_args_0_0= ruleFunctionArgument
                    {

                    						newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getArgsFunctionArgumentParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_90);
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

                    // InternalModelica.g:5516:4: ( (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) ) | (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) ) )?
                    int alt112=3;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==36) ) {
                        alt112=1;
                    }
                    else if ( (LA112_0==71) ) {
                        alt112=2;
                    }
                    switch (alt112) {
                        case 1 :
                            // InternalModelica.g:5517:5: (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) )
                            {
                            // InternalModelica.g:5517:5: (otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) ) )
                            // InternalModelica.g:5518:6: otherlv_1= ',' ( (lv_args_2_0= ruleFunctionArguments ) )
                            {
                            otherlv_1=(Token)match(input,36,FOLLOW_40); 

                            						newLeafNode(otherlv_1, grammarAccess.getFunctionArgumentsAccess().getCommaKeyword_0_1_0_0());
                            					
                            // InternalModelica.g:5522:6: ( (lv_args_2_0= ruleFunctionArguments ) )
                            // InternalModelica.g:5523:7: (lv_args_2_0= ruleFunctionArguments )
                            {
                            // InternalModelica.g:5523:7: (lv_args_2_0= ruleFunctionArguments )
                            // InternalModelica.g:5524:8: lv_args_2_0= ruleFunctionArguments
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
                            // InternalModelica.g:5543:5: (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) )
                            {
                            // InternalModelica.g:5543:5: (otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) ) )
                            // InternalModelica.g:5544:6: otherlv_3= 'for' ( (lv_indices_4_0= ruleForIndices ) )
                            {
                            otherlv_3=(Token)match(input,71,FOLLOW_7); 

                            						newLeafNode(otherlv_3, grammarAccess.getFunctionArgumentsAccess().getForKeyword_0_1_1_0());
                            					
                            // InternalModelica.g:5548:6: ( (lv_indices_4_0= ruleForIndices ) )
                            // InternalModelica.g:5549:7: (lv_indices_4_0= ruleForIndices )
                            {
                            // InternalModelica.g:5549:7: (lv_indices_4_0= ruleForIndices )
                            // InternalModelica.g:5550:8: lv_indices_4_0= ruleForIndices
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
                    // InternalModelica.g:5571:3: this_NamedArgument_5= ruleNamedArgument
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
    // InternalModelica.g:5583:1: entryRuleNamedArguments returns [EObject current=null] : iv_ruleNamedArguments= ruleNamedArguments EOF ;
    public final EObject entryRuleNamedArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArguments = null;


        try {
            // InternalModelica.g:5583:55: (iv_ruleNamedArguments= ruleNamedArguments EOF )
            // InternalModelica.g:5584:2: iv_ruleNamedArguments= ruleNamedArguments EOF
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
    // InternalModelica.g:5590:1: ruleNamedArguments returns [EObject current=null] : ( ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) ) ) ;
    public final EObject ruleNamedArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5596:2: ( ( ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) ) ) )
            // InternalModelica.g:5597:2: ( ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) ) )
            {
            // InternalModelica.g:5597:2: ( ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) ) )
            // InternalModelica.g:5598:3: ( (lv_args_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) )
            {
            // InternalModelica.g:5598:3: ( (lv_args_0_0= ruleNamedArgument ) )
            // InternalModelica.g:5599:4: (lv_args_0_0= ruleNamedArgument )
            {
            // InternalModelica.g:5599:4: (lv_args_0_0= ruleNamedArgument )
            // InternalModelica.g:5600:5: lv_args_0_0= ruleNamedArgument
            {

            					newCompositeNode(grammarAccess.getNamedArgumentsAccess().getArgsNamedArgumentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_75);
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

            // InternalModelica.g:5617:3: (otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) ) )
            // InternalModelica.g:5618:4: otherlv_1= ',' ( (lv_args_2_0= ruleNamedArguments ) )
            {
            otherlv_1=(Token)match(input,36,FOLLOW_40); 

            				newLeafNode(otherlv_1, grammarAccess.getNamedArgumentsAccess().getCommaKeyword_1_0());
            			
            // InternalModelica.g:5622:4: ( (lv_args_2_0= ruleNamedArguments ) )
            // InternalModelica.g:5623:5: (lv_args_2_0= ruleNamedArguments )
            {
            // InternalModelica.g:5623:5: (lv_args_2_0= ruleNamedArguments )
            // InternalModelica.g:5624:6: lv_args_2_0= ruleNamedArguments
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
    // InternalModelica.g:5646:1: entryRuleNamedArgument returns [EObject current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final EObject entryRuleNamedArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArgument = null;


        try {
            // InternalModelica.g:5646:54: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalModelica.g:5647:2: iv_ruleNamedArgument= ruleNamedArgument EOF
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
    // InternalModelica.g:5653:1: ruleNamedArgument returns [EObject current=null] : ( ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) ) ) ;
    public final EObject ruleNamedArgument() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_func_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5659:2: ( ( ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) ) ) )
            // InternalModelica.g:5660:2: ( ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) ) )
            {
            // InternalModelica.g:5660:2: ( ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) ) )
            // InternalModelica.g:5661:3: ( (lv_id_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_func_2_0= ruleFunctionArgument ) )
            {
            // InternalModelica.g:5661:3: ( (lv_id_0_0= RULE_IDENT ) )
            // InternalModelica.g:5662:4: (lv_id_0_0= RULE_IDENT )
            {
            // InternalModelica.g:5662:4: (lv_id_0_0= RULE_IDENT )
            // InternalModelica.g:5663:5: lv_id_0_0= RULE_IDENT
            {
            lv_id_0_0=(Token)match(input,RULE_IDENT,FOLLOW_23); 

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

            otherlv_1=(Token)match(input,40,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedArgumentAccess().getEqualsSignKeyword_1());
            		
            // InternalModelica.g:5683:3: ( (lv_func_2_0= ruleFunctionArgument ) )
            // InternalModelica.g:5684:4: (lv_func_2_0= ruleFunctionArgument )
            {
            // InternalModelica.g:5684:4: (lv_func_2_0= ruleFunctionArgument )
            // InternalModelica.g:5685:5: lv_func_2_0= ruleFunctionArgument
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
    // InternalModelica.g:5706:1: entryRuleFunctionArgument returns [EObject current=null] : iv_ruleFunctionArgument= ruleFunctionArgument EOF ;
    public final EObject entryRuleFunctionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArgument = null;


        try {
            // InternalModelica.g:5706:57: (iv_ruleFunctionArgument= ruleFunctionArgument EOF )
            // InternalModelica.g:5707:2: iv_ruleFunctionArgument= ruleFunctionArgument EOF
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
    // InternalModelica.g:5713:1: ruleFunctionArgument returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleFunctionArgument() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5719:2: (this_Expression_0= ruleExpression )
            // InternalModelica.g:5720:2: this_Expression_0= ruleExpression
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
    // InternalModelica.g:5731:1: entryRuleOutputExpressionList returns [EObject current=null] : iv_ruleOutputExpressionList= ruleOutputExpressionList EOF ;
    public final EObject entryRuleOutputExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputExpressionList = null;


        try {
            // InternalModelica.g:5731:61: (iv_ruleOutputExpressionList= ruleOutputExpressionList EOF )
            // InternalModelica.g:5732:2: iv_ruleOutputExpressionList= ruleOutputExpressionList EOF
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
    // InternalModelica.g:5738:1: ruleOutputExpressionList returns [EObject current=null] : ( () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )* ) ;
    public final EObject ruleOutputExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5744:2: ( ( () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )* ) )
            // InternalModelica.g:5745:2: ( () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )* )
            {
            // InternalModelica.g:5745:2: ( () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )* )
            // InternalModelica.g:5746:3: () ( (lv_exprs_1_0= ruleExpression ) )? (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )*
            {
            // InternalModelica.g:5746:3: ()
            // InternalModelica.g:5747:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputExpressionListAccess().getOuputExpressionListAction_0(),
            					current);
            			

            }

            // InternalModelica.g:5753:3: ( (lv_exprs_1_0= ruleExpression ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( ((LA114_0>=RULE_IDENT && LA114_0<=RULE_TRUE_FALSE)||LA114_0==35||LA114_0==58||LA114_0==63||LA114_0==95||LA114_0==97||(LA114_0>=99 && LA114_0<=100)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalModelica.g:5754:4: (lv_exprs_1_0= ruleExpression )
                    {
                    // InternalModelica.g:5754:4: (lv_exprs_1_0= ruleExpression )
                    // InternalModelica.g:5755:5: lv_exprs_1_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getOutputExpressionListAccess().getExprsExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_15);
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

            // InternalModelica.g:5772:3: (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )? )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==36) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // InternalModelica.g:5773:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleExpression ) )?
            	    {
            	    otherlv_2=(Token)match(input,36,FOLLOW_91); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOutputExpressionListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalModelica.g:5777:4: ( (lv_exprs_3_0= ruleExpression ) )?
            	    int alt115=2;
            	    int LA115_0 = input.LA(1);

            	    if ( ((LA115_0>=RULE_IDENT && LA115_0<=RULE_TRUE_FALSE)||LA115_0==35||LA115_0==58||LA115_0==63||LA115_0==95||LA115_0==97||(LA115_0>=99 && LA115_0<=100)) ) {
            	        alt115=1;
            	    }
            	    switch (alt115) {
            	        case 1 :
            	            // InternalModelica.g:5778:5: (lv_exprs_3_0= ruleExpression )
            	            {
            	            // InternalModelica.g:5778:5: (lv_exprs_3_0= ruleExpression )
            	            // InternalModelica.g:5779:6: lv_exprs_3_0= ruleExpression
            	            {

            	            						newCompositeNode(grammarAccess.getOutputExpressionListAccess().getExprsExpressionParserRuleCall_2_1_0());
            	            					
            	            pushFollow(FOLLOW_15);
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
            	    break loop116;
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
    // InternalModelica.g:5801:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // InternalModelica.g:5801:55: (iv_ruleExpressionList= ruleExpressionList EOF )
            // InternalModelica.g:5802:2: iv_ruleExpressionList= ruleExpressionList EOF
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
    // InternalModelica.g:5808:1: ruleExpressionList returns [EObject current=null] : ( ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprs_0_0 = null;

        EObject lv_exprs_2_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5814:2: ( ( ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )* ) )
            // InternalModelica.g:5815:2: ( ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )* )
            {
            // InternalModelica.g:5815:2: ( ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )* )
            // InternalModelica.g:5816:3: ( (lv_exprs_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )*
            {
            // InternalModelica.g:5816:3: ( (lv_exprs_0_0= ruleExpression ) )
            // InternalModelica.g:5817:4: (lv_exprs_0_0= ruleExpression )
            {
            // InternalModelica.g:5817:4: (lv_exprs_0_0= ruleExpression )
            // InternalModelica.g:5818:5: lv_exprs_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionListAccess().getExprsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalModelica.g:5835:3: (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==36) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalModelica.g:5836:4: otherlv_1= ',' ( (lv_exprs_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_40); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalModelica.g:5840:4: ( (lv_exprs_2_0= ruleExpression ) )
            	    // InternalModelica.g:5841:5: (lv_exprs_2_0= ruleExpression )
            	    {
            	    // InternalModelica.g:5841:5: (lv_exprs_2_0= ruleExpression )
            	    // InternalModelica.g:5842:6: lv_exprs_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionListAccess().getExprsExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	    break loop117;
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
    // InternalModelica.g:5864:1: entryRuleArraySubscripts returns [EObject current=null] : iv_ruleArraySubscripts= ruleArraySubscripts EOF ;
    public final EObject entryRuleArraySubscripts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySubscripts = null;


        try {
            // InternalModelica.g:5864:56: (iv_ruleArraySubscripts= ruleArraySubscripts EOF )
            // InternalModelica.g:5865:2: iv_ruleArraySubscripts= ruleArraySubscripts EOF
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
    // InternalModelica.g:5871:1: ruleArraySubscripts returns [EObject current=null] : (otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArraySubscripts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_subscripts_1_0 = null;

        EObject lv_subscripts_3_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5877:2: ( (otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']' ) )
            // InternalModelica.g:5878:2: (otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']' )
            {
            // InternalModelica.g:5878:2: (otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']' )
            // InternalModelica.g:5879:3: otherlv_0= '[' ( (lv_subscripts_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,95,FOLLOW_92); 

            			newLeafNode(otherlv_0, grammarAccess.getArraySubscriptsAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalModelica.g:5883:3: ( (lv_subscripts_1_0= ruleSubscript ) )
            // InternalModelica.g:5884:4: (lv_subscripts_1_0= ruleSubscript )
            {
            // InternalModelica.g:5884:4: (lv_subscripts_1_0= ruleSubscript )
            // InternalModelica.g:5885:5: lv_subscripts_1_0= ruleSubscript
            {

            					newCompositeNode(grammarAccess.getArraySubscriptsAccess().getSubscriptsSubscriptParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_93);
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

            // InternalModelica.g:5902:3: (otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) ) )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==36) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // InternalModelica.g:5903:4: otherlv_2= ',' ( (lv_subscripts_3_0= ruleSubscript ) )
            	    {
            	    otherlv_2=(Token)match(input,36,FOLLOW_92); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArraySubscriptsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalModelica.g:5907:4: ( (lv_subscripts_3_0= ruleSubscript ) )
            	    // InternalModelica.g:5908:5: (lv_subscripts_3_0= ruleSubscript )
            	    {
            	    // InternalModelica.g:5908:5: (lv_subscripts_3_0= ruleSubscript )
            	    // InternalModelica.g:5909:6: lv_subscripts_3_0= ruleSubscript
            	    {

            	    						newCompositeNode(grammarAccess.getArraySubscriptsAccess().getSubscriptsSubscriptParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_93);
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
            	    break loop118;
                }
            } while (true);

            otherlv_4=(Token)match(input,96,FOLLOW_2); 

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
    // InternalModelica.g:5935:1: entryRuleSubscript returns [EObject current=null] : iv_ruleSubscript= ruleSubscript EOF ;
    public final EObject entryRuleSubscript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscript = null;


        try {
            // InternalModelica.g:5935:50: (iv_ruleSubscript= ruleSubscript EOF )
            // InternalModelica.g:5936:2: iv_ruleSubscript= ruleSubscript EOF
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
    // InternalModelica.g:5942:1: ruleSubscript returns [EObject current=null] : ( ( (lv_all_0_0= ':' ) ) | this_Expression_1= ruleExpression ) ;
    public final EObject ruleSubscript() throws RecognitionException {
        EObject current = null;

        Token lv_all_0_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalModelica.g:5948:2: ( ( ( (lv_all_0_0= ':' ) ) | this_Expression_1= ruleExpression ) )
            // InternalModelica.g:5949:2: ( ( (lv_all_0_0= ':' ) ) | this_Expression_1= ruleExpression )
            {
            // InternalModelica.g:5949:2: ( ( (lv_all_0_0= ':' ) ) | this_Expression_1= ruleExpression )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==62) ) {
                alt119=1;
            }
            else if ( ((LA119_0>=RULE_IDENT && LA119_0<=RULE_TRUE_FALSE)||LA119_0==35||LA119_0==58||LA119_0==63||LA119_0==95||LA119_0==97||(LA119_0>=99 && LA119_0<=100)) ) {
                alt119=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // InternalModelica.g:5950:3: ( (lv_all_0_0= ':' ) )
                    {
                    // InternalModelica.g:5950:3: ( (lv_all_0_0= ':' ) )
                    // InternalModelica.g:5951:4: (lv_all_0_0= ':' )
                    {
                    // InternalModelica.g:5951:4: (lv_all_0_0= ':' )
                    // InternalModelica.g:5952:5: lv_all_0_0= ':'
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
                    // InternalModelica.g:5965:3: this_Expression_1= ruleExpression
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
    // InternalModelica.g:5977:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalModelica.g:5977:48: (iv_ruleComment= ruleComment EOF )
            // InternalModelica.g:5978:2: iv_ruleComment= ruleComment EOF
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
    // InternalModelica.g:5984:1: ruleComment returns [EObject current=null] : ( ( (lv_comment_0_0= ruleStringComment ) ) ( (lv_annotation_1_0= ruleAnnotation ) )? ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_annotation_1_0 = null;



        	enterRule();

        try {
            // InternalModelica.g:5990:2: ( ( ( (lv_comment_0_0= ruleStringComment ) ) ( (lv_annotation_1_0= ruleAnnotation ) )? ) )
            // InternalModelica.g:5991:2: ( ( (lv_comment_0_0= ruleStringComment ) ) ( (lv_annotation_1_0= ruleAnnotation ) )? )
            {
            // InternalModelica.g:5991:2: ( ( (lv_comment_0_0= ruleStringComment ) ) ( (lv_annotation_1_0= ruleAnnotation ) )? )
            // InternalModelica.g:5992:3: ( (lv_comment_0_0= ruleStringComment ) ) ( (lv_annotation_1_0= ruleAnnotation ) )?
            {
            // InternalModelica.g:5992:3: ( (lv_comment_0_0= ruleStringComment ) )
            // InternalModelica.g:5993:4: (lv_comment_0_0= ruleStringComment )
            {
            // InternalModelica.g:5993:4: (lv_comment_0_0= ruleStringComment )
            // InternalModelica.g:5994:5: lv_comment_0_0= ruleStringComment
            {

            					newCompositeNode(grammarAccess.getCommentAccess().getCommentStringCommentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalModelica.g:6011:3: ( (lv_annotation_1_0= ruleAnnotation ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==101) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalModelica.g:6012:4: (lv_annotation_1_0= ruleAnnotation )
                    {
                    // InternalModelica.g:6012:4: (lv_annotation_1_0= ruleAnnotation )
                    // InternalModelica.g:6013:5: lv_annotation_1_0= ruleAnnotation
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
    // InternalModelica.g:6034:1: entryRuleStringComment returns [String current=null] : iv_ruleStringComment= ruleStringComment EOF ;
    public final String entryRuleStringComment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringComment = null;


        try {
            // InternalModelica.g:6034:53: (iv_ruleStringComment= ruleStringComment EOF )
            // InternalModelica.g:6035:2: iv_ruleStringComment= ruleStringComment EOF
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
    // InternalModelica.g:6041:1: ruleStringComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )? ;
    public final AntlrDatatypeRuleToken ruleStringComment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalModelica.g:6047:2: ( (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )? )
            // InternalModelica.g:6048:2: (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )?
            {
            // InternalModelica.g:6048:2: (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==RULE_STRING) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalModelica.g:6049:3: this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )*
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_94); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getStringCommentAccess().getSTRINGTerminalRuleCall_0());
                    		
                    // InternalModelica.g:6056:3: (kw= '+' this_STRING_2= RULE_STRING )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==86) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // InternalModelica.g:6057:4: kw= '+' this_STRING_2= RULE_STRING
                    	    {
                    	    kw=(Token)match(input,86,FOLLOW_48); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getStringCommentAccess().getPlusSignKeyword_1_0());
                    	    			
                    	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_94); 

                    	    				current.merge(this_STRING_2);
                    	    			

                    	    				newLeafNode(this_STRING_2, grammarAccess.getStringCommentAccess().getSTRINGTerminalRuleCall_1_1());
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    break loop121;
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
    // InternalModelica.g:6074:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalModelica.g:6074:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalModelica.g:6075:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalModelica.g:6081:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ClassModification_1 = null;



        	enterRule();

        try {
            // InternalModelica.g:6087:2: ( (otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification ) )
            // InternalModelica.g:6088:2: (otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification )
            {
            // InternalModelica.g:6088:2: (otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification )
            // InternalModelica.g:6089:3: otherlv_0= 'annotation' this_ClassModification_1= ruleClassModification
            {
            otherlv_0=(Token)match(input,101,FOLLOW_24); 

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
    protected DFA104 dfa104 = new DFA104(this);
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
    static final String dfa_9s = "\5\uffff\1\12\6\uffff\1\12";
    static final String dfa_10s = "\1\4\3\uffff\2\4\5\uffff\2\4";
    static final String dfa_11s = "\1\144\3\uffff\1\4\1\145\5\uffff\1\4\1\145";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\3\2\uffff\1\4\1\6\1\7\1\10\1\5\2\uffff";
    static final String dfa_13s = "\15\uffff}>";
    static final String[] dfa_14s = {
            "\1\5\1\2\1\1\1\3\33\uffff\1\11\33\uffff\1\6\37\uffff\1\7\1\uffff\1\10\1\uffff\1\6\1\4",
            "",
            "",
            "",
            "\1\5",
            "\2\12\15\uffff\1\12\20\uffff\1\12\3\uffff\1\12\1\6\1\12\5\uffff\1\12\1\uffff\1\12\7\uffff\1\12\3\uffff\1\12\5\uffff\5\12\5\uffff\23\12\1\uffff\1\12\1\uffff\1\13\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\14",
            "\2\12\15\uffff\1\12\20\uffff\1\12\3\uffff\1\12\1\6\1\12\5\uffff\1\12\1\uffff\1\12\7\uffff\1\12\3\uffff\1\12\5\uffff\5\12\5\uffff\23\12\1\uffff\1\12\1\uffff\1\13\1\12"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "5121:2: (this_FloatPrimary_0= ruleFloatPrimary | this_StringPrimary_1= ruleStringPrimary | this_LogicalPrimary_2= ruleLogicalPrimary | this_FunctionCall_3= ruleFunctionCall | this_ComponentReference_4= ruleComponentReference | (otherlv_5= '[' ( (lv_res_6_0= ruleExpressionList ) ) (otherlv_7= ';' ( (lv_res_8_0= ruleExpressionList ) ) )* otherlv_9= ']' ) | (otherlv_10= '{' this_FunctionArguments_11= ruleFunctionArguments otherlv_12= '}' ) | this_End_13= ruleEnd )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L,0x0000001000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000007FFF00002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000007FFF00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000007FF800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x83FAF8E7FFF00030L,0x0000003000000003L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L,0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x800000E000000002L,0x0000002000000003L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x83FAF8E7FFF00010L,0x0000003000000003L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080030L,0x0000003000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080010L,0x0000003000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L,0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x84000408000000F0L,0x0000001A80000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x03FAF807FFF00012L,0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x03F87007FFF00010L,0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x03F86007FFF00010L,0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x03F84007FFF00010L,0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x03F80007FFF00010L,0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001021000000020L,0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000010L,0x0000000080000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x03E0000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0400000000000020L,0x0000002000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x84000008000000F0L,0x0000001A80000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0800030000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0800030000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x10004C0000100010L,0x0000001000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000480000100010L,0x0000001000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000400000100010L,0x0000001000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800030000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x13F84007FFF00010L,0x0000001000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x23F8000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000020000000020L,0x0000002080000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000020000000020L,0x0000002000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x4000040000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x84000008000000F0L,0x0000001A80002880L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x84000008000000F2L,0x0000001A80002880L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400020000000010L,0x0000001000000C8CL});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0400020000000012L,0x0000001000000C8CL});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x84000208000000F0L,0x0000001A80000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x84000418000000F0L,0x0000001A80000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x84000008000000F0L,0x0000001A800028E0L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0400020800000010L,0x0000001000000CECL});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0400020800000010L,0x0000001000000C8CL});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x84000008000000F0L,0x0000001A80003880L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0400020000000010L,0x0000001000001C8CL});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x80000008000000F0L,0x0000001A80000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x00000000003F0000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000000003C00000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0001000000000002L,0x000000001C000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000080000L,0x0000000100000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000012L,0x0000001080000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000012L,0x0000001000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000001000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x84000018000000F2L,0x0000001A80000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0xC4000008000000F0L,0x0000001A80000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000001000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});

}