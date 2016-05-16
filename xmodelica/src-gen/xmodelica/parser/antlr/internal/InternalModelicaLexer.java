package xmodelica.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelicaLexer extends Lexer {
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

    public InternalModelicaLexer() {;} 
    public InternalModelicaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalModelicaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalModelica.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:11:7: ( 'within' )
            // InternalModelica.g:11:9: 'within'
            {
            match("within"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:12:7: ( ';' )
            // InternalModelica.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:13:7: ( 'final' )
            // InternalModelica.g:13:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:14:7: ( 'encapsulated' )
            // InternalModelica.g:14:9: 'encapsulated'
            {
            match("encapsulated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:15:7: ( 'partial' )
            // InternalModelica.g:15:9: 'partial'
            {
            match("partial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:16:7: ( 'class' )
            // InternalModelica.g:16:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:17:7: ( 'model' )
            // InternalModelica.g:17:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:18:7: ( 'operator' )
            // InternalModelica.g:18:9: 'operator'
            {
            match("operator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:19:7: ( 'record' )
            // InternalModelica.g:19:9: 'record'
            {
            match("record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:20:7: ( 'block' )
            // InternalModelica.g:20:9: 'block'
            {
            match("block"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:21:7: ( 'expandable' )
            // InternalModelica.g:21:9: 'expandable'
            {
            match("expandable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:22:7: ( 'connector' )
            // InternalModelica.g:22:9: 'connector'
            {
            match("connector"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:23:7: ( 'type' )
            // InternalModelica.g:23:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:24:7: ( 'package' )
            // InternalModelica.g:24:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:25:7: ( 'pure' )
            // InternalModelica.g:25:9: 'pure'
            {
            match("pure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:26:7: ( 'impure' )
            // InternalModelica.g:26:9: 'impure'
            {
            match("impure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:27:7: ( 'function' )
            // InternalModelica.g:27:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:28:7: ( 'end' )
            // InternalModelica.g:28:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:29:7: ( '=' )
            // InternalModelica.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:30:7: ( ',' )
            // InternalModelica.g:30:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:31:7: ( 'public' )
            // InternalModelica.g:31:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:32:7: ( 'protected' )
            // InternalModelica.g:32:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:33:7: ( 'external' )
            // InternalModelica.g:33:9: 'external'
            {
            match("external"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:34:7: ( '(' )
            // InternalModelica.g:34:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:35:7: ( ')' )
            // InternalModelica.g:35:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:36:7: ( 'redeclare' )
            // InternalModelica.g:36:9: 'redeclare'
            {
            match("redeclare"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:37:7: ( 'inner' )
            // InternalModelica.g:37:9: 'inner'
            {
            match("inner"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:38:7: ( 'outer' )
            // InternalModelica.g:38:9: 'outer'
            {
            match("outer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:39:7: ( 'replaceable' )
            // InternalModelica.g:39:9: 'replaceable'
            {
            match("replaceable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:40:7: ( 'import' )
            // InternalModelica.g:40:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:41:7: ( '*' )
            // InternalModelica.g:41:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:42:7: ( 'extends' )
            // InternalModelica.g:42:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:43:7: ( 'constrainedby' )
            // InternalModelica.g:43:9: 'constrainedby'
            {
            match("constrainedby"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:44:7: ( 'flow' )
            // InternalModelica.g:44:9: 'flow'
            {
            match("flow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:45:7: ( 'stream' )
            // InternalModelica.g:45:9: 'stream'
            {
            match("stream"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:46:7: ( 'discrete' )
            // InternalModelica.g:46:9: 'discrete'
            {
            match("discrete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:47:7: ( 'parameter' )
            // InternalModelica.g:47:9: 'parameter'
            {
            match("parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:48:7: ( 'constant' )
            // InternalModelica.g:48:9: 'constant'
            {
            match("constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:49:7: ( 'input' )
            // InternalModelica.g:49:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:50:7: ( 'output' )
            // InternalModelica.g:50:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:51:7: ( 'if' )
            // InternalModelica.g:51:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:52:7: ( ':=' )
            // InternalModelica.g:52:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:53:7: ( 'each' )
            // InternalModelica.g:53:9: 'each'
            {
            match("each"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:54:7: ( 'enumeration' )
            // InternalModelica.g:54:9: 'enumeration'
            {
            match("enumeration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:55:7: ( ':' )
            // InternalModelica.g:55:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:56:7: ( 'initial' )
            // InternalModelica.g:56:9: 'initial'
            {
            match("initial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:57:7: ( 'equation' )
            // InternalModelica.g:57:9: 'equation'
            {
            match("equation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:58:7: ( 'algorithm' )
            // InternalModelica.g:58:9: 'algorithm'
            {
            match("algorithm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:59:7: ( 'break' )
            // InternalModelica.g:59:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:60:7: ( 'return' )
            // InternalModelica.g:60:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:61:7: ( 'then' )
            // InternalModelica.g:61:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:62:7: ( 'elseif' )
            // InternalModelica.g:62:9: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:63:7: ( 'else' )
            // InternalModelica.g:63:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:64:7: ( 'for' )
            // InternalModelica.g:64:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:65:7: ( 'loop' )
            // InternalModelica.g:65:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:66:7: ( 'in' )
            // InternalModelica.g:66:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:67:7: ( 'while' )
            // InternalModelica.g:67:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:68:7: ( 'when' )
            // InternalModelica.g:68:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:69:7: ( 'elsewhen' )
            // InternalModelica.g:69:9: 'elsewhen'
            {
            match("elsewhen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:70:7: ( 'connect' )
            // InternalModelica.g:70:9: 'connect'
            {
            match("connect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:71:7: ( 'or' )
            // InternalModelica.g:71:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:72:7: ( 'and' )
            // InternalModelica.g:72:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:73:7: ( 'not' )
            // InternalModelica.g:73:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:74:7: ( '<' )
            // InternalModelica.g:74:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:75:7: ( '<=' )
            // InternalModelica.g:75:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:76:7: ( '>' )
            // InternalModelica.g:76:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:77:7: ( '>=' )
            // InternalModelica.g:77:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:78:7: ( '==' )
            // InternalModelica.g:78:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:79:7: ( '<>' )
            // InternalModelica.g:79:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:80:7: ( '+' )
            // InternalModelica.g:80:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:81:7: ( '-' )
            // InternalModelica.g:81:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:82:7: ( '.+' )
            // InternalModelica.g:82:9: '.+'
            {
            match(".+"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:83:7: ( '.-' )
            // InternalModelica.g:83:9: '.-'
            {
            match(".-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:84:7: ( '/' )
            // InternalModelica.g:84:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:85:7: ( '.*' )
            // InternalModelica.g:85:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:86:7: ( './' )
            // InternalModelica.g:86:9: './'
            {
            match("./"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:87:7: ( '^' )
            // InternalModelica.g:87:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:88:7: ( '.^' )
            // InternalModelica.g:88:9: '.^'
            {
            match(".^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:89:7: ( '[' )
            // InternalModelica.g:89:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:90:7: ( ']' )
            // InternalModelica.g:90:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:91:7: ( '{' )
            // InternalModelica.g:91:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:92:7: ( '}' )
            // InternalModelica.g:92:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:93:8: ( 'der' )
            // InternalModelica.g:93:10: 'der'
            {
            match("der"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:94:8: ( '.' )
            // InternalModelica.g:94:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:95:8: ( 'annotation' )
            // InternalModelica.g:95:10: 'annotation'
            {
            match("annotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "RULE_TRUE_FALSE"
    public final void mRULE_TRUE_FALSE() throws RecognitionException {
        try {
            int _type = RULE_TRUE_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:6329:17: ( ( 'true' | 'false' ) )
            // InternalModelica.g:6329:19: ( 'true' | 'false' )
            {
            // InternalModelica.g:6329:19: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalModelica.g:6329:20: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalModelica.g:6329:27: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE_FALSE"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:6331:12: ( ( RULE_NONDIGIT ( RULE_DIGIT | RULE_NONDIGIT )* | RULE_Q_IDENT ) )
            // InternalModelica.g:6331:14: ( RULE_NONDIGIT ( RULE_DIGIT | RULE_NONDIGIT )* | RULE_Q_IDENT )
            {
            // InternalModelica.g:6331:14: ( RULE_NONDIGIT ( RULE_DIGIT | RULE_NONDIGIT )* | RULE_Q_IDENT )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='\u2019') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalModelica.g:6331:15: RULE_NONDIGIT ( RULE_DIGIT | RULE_NONDIGIT )*
                    {
                    mRULE_NONDIGIT(); 
                    // InternalModelica.g:6331:29: ( RULE_DIGIT | RULE_NONDIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalModelica.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalModelica.g:6331:57: RULE_Q_IDENT
                    {
                    mRULE_Q_IDENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_UNSIGNED_NUMBER"
    public final void mRULE_UNSIGNED_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_UNSIGNED_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:6333:22: ( RULE_UNSIGNED_INTEGER ( '.' ( RULE_UNSIGNED_INTEGER )? )? ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_UNSIGNED_INTEGER )? )
            // InternalModelica.g:6333:24: RULE_UNSIGNED_INTEGER ( '.' ( RULE_UNSIGNED_INTEGER )? )? ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_UNSIGNED_INTEGER )?
            {
            mRULE_UNSIGNED_INTEGER(); 
            // InternalModelica.g:6333:46: ( '.' ( RULE_UNSIGNED_INTEGER )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalModelica.g:6333:47: '.' ( RULE_UNSIGNED_INTEGER )?
                    {
                    match('.'); 
                    // InternalModelica.g:6333:51: ( RULE_UNSIGNED_INTEGER )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalModelica.g:6333:51: RULE_UNSIGNED_INTEGER
                            {
                            mRULE_UNSIGNED_INTEGER(); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalModelica.g:6333:76: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_UNSIGNED_INTEGER )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalModelica.g:6333:77: ( 'e' | 'E' ) ( '+' | '-' )? RULE_UNSIGNED_INTEGER
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalModelica.g:6333:87: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalModelica.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_UNSIGNED_INTEGER(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_NUMBER"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:6335:13: ( '\"' ( RULE_S_CHAR | RULE_S_ESCAPE )* '\"' )
            // InternalModelica.g:6335:15: '\"' ( RULE_S_CHAR | RULE_S_ESCAPE )* '\"'
            {
            match('\"'); 
            // InternalModelica.g:6335:19: ( RULE_S_CHAR | RULE_S_ESCAPE )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }
                else if ( (LA8_0=='\\') ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalModelica.g:6335:20: RULE_S_CHAR
            	    {
            	    mRULE_S_CHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalModelica.g:6335:32: RULE_S_ESCAPE
            	    {
            	    mRULE_S_ESCAPE(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:6337:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalModelica.g:6337:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalModelica.g:6337:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalModelica.g:6337:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:6339:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalModelica.g:6339:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalModelica.g:6339:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalModelica.g:6339:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalModelica.g:6339:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalModelica.g:6339:41: ( '\\r' )? '\\n'
                    {
                    // InternalModelica.g:6339:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalModelica.g:6339:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelica.g:6341:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalModelica.g:6341:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalModelica.g:6341:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalModelica.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalModelica.g:6343:21: ( '0' .. '9' )
            // InternalModelica.g:6343:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_UNSIGNED_INTEGER"
    public final void mRULE_UNSIGNED_INTEGER() throws RecognitionException {
        try {
            // InternalModelica.g:6345:32: ( ( RULE_DIGIT )+ )
            // InternalModelica.g:6345:34: ( RULE_DIGIT )+
            {
            // InternalModelica.g:6345:34: ( RULE_DIGIT )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalModelica.g:6345:34: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_INTEGER"

    // $ANTLR start "RULE_S_ESCAPE"
    public final void mRULE_S_ESCAPE() throws RecognitionException {
        try {
            // InternalModelica.g:6347:24: ( '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' ) )
            // InternalModelica.g:6347:26: '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='?'||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='b')||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_S_ESCAPE"

    // $ANTLR start "RULE_Q_IDENT"
    public final void mRULE_Q_IDENT() throws RecognitionException {
        try {
            // InternalModelica.g:6349:23: ( '\\u2019' ( RULE_Q_CHAR | RULE_S_ESCAPE )* '\\u2019' )
            // InternalModelica.g:6349:25: '\\u2019' ( RULE_Q_CHAR | RULE_S_ESCAPE )* '\\u2019'
            {
            match('\u2019'); 
            // InternalModelica.g:6349:34: ( RULE_Q_CHAR | RULE_S_ESCAPE )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=' ' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='_')||(LA15_0>='a' && LA15_0<='~')) ) {
                    alt15=1;
                }
                else if ( (LA15_0=='\\') ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalModelica.g:6349:35: RULE_Q_CHAR
            	    {
            	    mRULE_Q_CHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalModelica.g:6349:47: RULE_S_ESCAPE
            	    {
            	    mRULE_S_ESCAPE(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match('\u2019'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_Q_IDENT"

    // $ANTLR start "RULE_NONDIGIT"
    public final void mRULE_NONDIGIT() throws RecognitionException {
        try {
            // InternalModelica.g:6351:24: ( ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalModelica.g:6351:26: ( '_' | 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NONDIGIT"

    // $ANTLR start "RULE_S_CHAR"
    public final void mRULE_S_CHAR() throws RecognitionException {
        try {
            // InternalModelica.g:6353:22: (~ ( ( '\"' | '\\\\' ) ) )
            // InternalModelica.g:6353:24: ~ ( ( '\"' | '\\\\' ) )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_S_CHAR"

    // $ANTLR start "RULE_Q_CHAR"
    public final void mRULE_Q_CHAR() throws RecognitionException {
        try {
            // InternalModelica.g:6355:22: ( ( RULE_NONDIGIT | RULE_DIGIT | '!' | '#' | '$' | '%' | '&' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';' | '<' | '>' | '=' | '?' | '@' | '[' | ']' | '^' | '{' | '}' | '|' | '~' | ' ' ) )
            // InternalModelica.g:6355:24: ( RULE_NONDIGIT | RULE_DIGIT | '!' | '#' | '$' | '%' | '&' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';' | '<' | '>' | '=' | '?' | '@' | '[' | ']' | '^' | '{' | '}' | '|' | '~' | ' ' )
            {
            if ( (input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='~') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_Q_CHAR"

    public void mTokens() throws RecognitionException {
        // InternalModelica.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | RULE_TRUE_FALSE | RULE_IDENT | RULE_UNSIGNED_NUMBER | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt16=92;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalModelica.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalModelica.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalModelica.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalModelica.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalModelica.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalModelica.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalModelica.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalModelica.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalModelica.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalModelica.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalModelica.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalModelica.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalModelica.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalModelica.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalModelica.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalModelica.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalModelica.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalModelica.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalModelica.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalModelica.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // InternalModelica.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // InternalModelica.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // InternalModelica.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // InternalModelica.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // InternalModelica.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // InternalModelica.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // InternalModelica.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // InternalModelica.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // InternalModelica.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // InternalModelica.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // InternalModelica.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // InternalModelica.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // InternalModelica.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // InternalModelica.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // InternalModelica.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // InternalModelica.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // InternalModelica.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // InternalModelica.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // InternalModelica.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // InternalModelica.g:1:244: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // InternalModelica.g:1:250: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // InternalModelica.g:1:256: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // InternalModelica.g:1:262: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // InternalModelica.g:1:268: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // InternalModelica.g:1:274: T__62
                {
                mT__62(); 

                }
                break;
            case 46 :
                // InternalModelica.g:1:280: T__63
                {
                mT__63(); 

                }
                break;
            case 47 :
                // InternalModelica.g:1:286: T__64
                {
                mT__64(); 

                }
                break;
            case 48 :
                // InternalModelica.g:1:292: T__65
                {
                mT__65(); 

                }
                break;
            case 49 :
                // InternalModelica.g:1:298: T__66
                {
                mT__66(); 

                }
                break;
            case 50 :
                // InternalModelica.g:1:304: T__67
                {
                mT__67(); 

                }
                break;
            case 51 :
                // InternalModelica.g:1:310: T__68
                {
                mT__68(); 

                }
                break;
            case 52 :
                // InternalModelica.g:1:316: T__69
                {
                mT__69(); 

                }
                break;
            case 53 :
                // InternalModelica.g:1:322: T__70
                {
                mT__70(); 

                }
                break;
            case 54 :
                // InternalModelica.g:1:328: T__71
                {
                mT__71(); 

                }
                break;
            case 55 :
                // InternalModelica.g:1:334: T__72
                {
                mT__72(); 

                }
                break;
            case 56 :
                // InternalModelica.g:1:340: T__73
                {
                mT__73(); 

                }
                break;
            case 57 :
                // InternalModelica.g:1:346: T__74
                {
                mT__74(); 

                }
                break;
            case 58 :
                // InternalModelica.g:1:352: T__75
                {
                mT__75(); 

                }
                break;
            case 59 :
                // InternalModelica.g:1:358: T__76
                {
                mT__76(); 

                }
                break;
            case 60 :
                // InternalModelica.g:1:364: T__77
                {
                mT__77(); 

                }
                break;
            case 61 :
                // InternalModelica.g:1:370: T__78
                {
                mT__78(); 

                }
                break;
            case 62 :
                // InternalModelica.g:1:376: T__79
                {
                mT__79(); 

                }
                break;
            case 63 :
                // InternalModelica.g:1:382: T__80
                {
                mT__80(); 

                }
                break;
            case 64 :
                // InternalModelica.g:1:388: T__81
                {
                mT__81(); 

                }
                break;
            case 65 :
                // InternalModelica.g:1:394: T__82
                {
                mT__82(); 

                }
                break;
            case 66 :
                // InternalModelica.g:1:400: T__83
                {
                mT__83(); 

                }
                break;
            case 67 :
                // InternalModelica.g:1:406: T__84
                {
                mT__84(); 

                }
                break;
            case 68 :
                // InternalModelica.g:1:412: T__85
                {
                mT__85(); 

                }
                break;
            case 69 :
                // InternalModelica.g:1:418: T__86
                {
                mT__86(); 

                }
                break;
            case 70 :
                // InternalModelica.g:1:424: T__87
                {
                mT__87(); 

                }
                break;
            case 71 :
                // InternalModelica.g:1:430: T__88
                {
                mT__88(); 

                }
                break;
            case 72 :
                // InternalModelica.g:1:436: T__89
                {
                mT__89(); 

                }
                break;
            case 73 :
                // InternalModelica.g:1:442: T__90
                {
                mT__90(); 

                }
                break;
            case 74 :
                // InternalModelica.g:1:448: T__91
                {
                mT__91(); 

                }
                break;
            case 75 :
                // InternalModelica.g:1:454: T__92
                {
                mT__92(); 

                }
                break;
            case 76 :
                // InternalModelica.g:1:460: T__93
                {
                mT__93(); 

                }
                break;
            case 77 :
                // InternalModelica.g:1:466: T__94
                {
                mT__94(); 

                }
                break;
            case 78 :
                // InternalModelica.g:1:472: T__95
                {
                mT__95(); 

                }
                break;
            case 79 :
                // InternalModelica.g:1:478: T__96
                {
                mT__96(); 

                }
                break;
            case 80 :
                // InternalModelica.g:1:484: T__97
                {
                mT__97(); 

                }
                break;
            case 81 :
                // InternalModelica.g:1:490: T__98
                {
                mT__98(); 

                }
                break;
            case 82 :
                // InternalModelica.g:1:496: T__99
                {
                mT__99(); 

                }
                break;
            case 83 :
                // InternalModelica.g:1:502: T__100
                {
                mT__100(); 

                }
                break;
            case 84 :
                // InternalModelica.g:1:509: T__101
                {
                mT__101(); 

                }
                break;
            case 85 :
                // InternalModelica.g:1:516: T__102
                {
                mT__102(); 

                }
                break;
            case 86 :
                // InternalModelica.g:1:523: RULE_TRUE_FALSE
                {
                mRULE_TRUE_FALSE(); 

                }
                break;
            case 87 :
                // InternalModelica.g:1:539: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 88 :
                // InternalModelica.g:1:550: RULE_UNSIGNED_NUMBER
                {
                mRULE_UNSIGNED_NUMBER(); 

                }
                break;
            case 89 :
                // InternalModelica.g:1:571: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 90 :
                // InternalModelica.g:1:583: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 91 :
                // InternalModelica.g:1:599: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 92 :
                // InternalModelica.g:1:615: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\43\1\uffff\12\43\1\106\4\uffff\2\43\1\113\3\43\1\122\1\124\2\uffff\1\132\1\135\11\uffff\24\43\1\170\7\43\1\u0086\1\u0087\2\uffff\3\43\2\uffff\4\43\16\uffff\6\43\1\u0096\2\43\1\u0099\20\43\1\uffff\15\43\2\uffff\2\43\1\u00bd\1\43\1\u00bf\2\43\1\u00c2\2\43\1\u00c5\2\43\1\u00c8\1\uffff\2\43\1\uffff\3\43\1\u00cf\1\43\1\u00d3\3\43\1\u00d7\17\43\1\u00e7\1\u00e8\1\u00e9\7\43\1\uffff\1\43\1\uffff\1\43\1\u00f3\1\uffff\1\43\1\u00f5\1\uffff\1\u00f6\1\43\1\uffff\1\u00e9\5\43\1\uffff\3\43\1\uffff\3\43\1\uffff\2\43\1\u0105\2\43\1\u0109\1\43\1\u010b\5\43\1\u0111\1\u0112\3\uffff\2\43\1\u0115\1\u0116\5\43\1\uffff\1\u011c\2\uffff\7\43\1\u0124\4\43\1\u0129\1\43\1\uffff\3\43\1\uffff\1\43\1\uffff\1\u012f\1\u0130\2\43\1\u0133\2\uffff\1\u0134\1\u0135\2\uffff\1\43\1\u0137\3\43\1\uffff\5\43\1\u0140\1\43\1\uffff\1\43\1\u0143\1\43\1\u0145\1\uffff\1\43\1\u0148\3\43\2\uffff\2\43\3\uffff\1\u014e\1\uffff\3\43\1\u0152\3\43\1\u0156\1\uffff\1\u0157\1\u0158\1\uffff\1\43\1\uffff\2\43\1\uffff\1\43\1\u015d\1\u015e\2\43\1\uffff\1\u0161\2\43\1\uffff\3\43\3\uffff\1\u0167\1\u0168\1\u0169\1\43\2\uffff\1\u016b\1\43\1\uffff\1\u016d\3\43\1\u0171\3\uffff\1\43\1\uffff\1\43\1\uffff\1\u0174\1\43\1\u0176\1\uffff\1\43\1\u0178\1\uffff\1\u0179\1\uffff\1\43\2\uffff\1\u017b\1\uffff";
    static final String DFA16_eofS =
        "\u017c\uffff";
    static final String DFA16_minS =
        "\1\11\1\150\1\uffff\3\141\1\154\1\157\1\160\1\145\1\154\1\150\1\146\1\75\4\uffff\1\164\1\145\1\75\1\154\2\157\2\75\2\uffff\2\52\11\uffff\1\164\1\145\2\156\1\157\1\162\1\154\1\143\1\160\1\143\1\165\1\163\1\143\1\142\1\157\1\141\1\156\1\144\1\145\1\164\1\60\1\143\1\157\1\145\1\160\1\145\1\165\1\160\2\60\2\uffff\1\162\1\163\1\162\2\uffff\1\147\1\144\1\157\1\164\16\uffff\1\150\1\154\1\156\1\141\1\143\1\167\1\60\1\163\1\141\1\60\1\155\1\141\1\145\1\150\1\141\1\145\1\141\1\153\1\145\1\154\1\164\1\163\1\156\1\145\1\162\1\145\1\uffff\1\157\1\145\1\154\1\165\1\143\1\141\1\145\1\156\1\145\1\157\1\145\1\165\1\164\2\uffff\1\145\1\143\1\60\1\157\1\60\1\157\1\160\1\60\1\151\1\145\1\60\1\154\1\164\1\60\1\uffff\1\145\1\160\1\uffff\1\145\2\156\1\60\1\164\1\60\1\151\1\155\1\141\1\60\1\151\1\145\1\163\1\145\1\164\1\154\1\141\1\162\1\165\1\162\1\143\1\141\1\162\2\153\3\60\3\162\1\164\1\151\1\141\1\162\1\uffff\1\162\1\uffff\1\164\1\60\1\uffff\1\156\1\60\1\uffff\1\60\1\151\1\uffff\1\60\1\163\1\162\1\144\1\156\1\144\1\uffff\1\151\1\146\1\150\1\uffff\1\141\1\145\1\147\1\uffff\2\143\1\60\1\143\1\141\1\60\1\164\1\60\1\164\1\144\1\154\1\143\1\156\2\60\3\uffff\1\145\1\164\2\60\1\141\1\155\1\145\1\151\1\141\1\uffff\1\60\2\uffff\1\157\1\165\3\141\1\163\1\157\1\60\1\145\1\154\1\164\1\145\1\60\1\164\1\uffff\1\164\1\141\1\156\1\uffff\1\157\1\uffff\2\60\1\141\1\145\1\60\2\uffff\2\60\2\uffff\1\154\1\60\3\164\1\uffff\1\156\1\154\1\164\1\142\1\154\1\60\1\156\1\uffff\1\156\1\60\1\145\1\60\1\uffff\1\145\1\60\1\151\1\164\1\162\2\uffff\1\162\1\141\3\uffff\1\60\1\uffff\1\145\1\150\1\151\1\60\1\141\1\151\1\154\1\60\1\uffff\2\60\1\uffff\1\162\1\uffff\1\144\1\162\1\uffff\1\156\2\60\1\145\1\142\1\uffff\1\60\1\155\1\157\1\uffff\1\164\1\157\1\145\3\uffff\3\60\1\145\2\uffff\1\60\1\154\1\uffff\1\60\1\156\1\145\1\156\1\60\3\uffff\1\144\1\uffff\1\145\1\uffff\1\60\1\144\1\60\1\uffff\1\142\1\60\1\uffff\1\60\1\uffff\1\171\2\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\u2019\1\151\1\uffff\1\165\1\170\1\165\2\157\1\165\1\145\1\162\1\171\1\156\1\75\4\uffff\1\164\1\151\1\75\1\156\2\157\1\76\1\75\2\uffff\1\136\1\57\11\uffff\1\164\1\151\2\156\1\157\1\162\1\154\1\165\1\164\1\143\1\165\1\163\2\162\1\157\1\141\1\156\1\144\1\145\1\164\1\172\1\164\1\157\1\145\1\160\1\145\1\165\1\160\2\172\2\uffff\1\162\1\163\1\162\2\uffff\1\147\1\156\1\157\1\164\16\uffff\1\150\1\154\1\156\1\141\1\143\1\167\1\172\1\163\1\141\1\172\1\155\1\141\1\145\1\150\1\141\1\145\1\164\1\153\1\145\1\154\1\164\2\163\1\145\1\162\1\160\1\uffff\1\157\1\145\1\154\1\165\1\143\1\141\1\145\1\156\1\145\1\165\1\145\1\165\1\164\2\uffff\1\145\1\143\1\172\1\157\1\172\1\157\1\160\1\172\1\151\1\145\1\172\1\154\1\164\1\172\1\uffff\1\145\1\160\1\uffff\1\145\1\156\1\162\1\172\1\164\1\172\1\151\1\155\1\141\1\172\1\151\1\145\1\163\1\145\1\164\1\154\1\141\1\162\1\165\1\162\1\143\1\141\1\162\2\153\3\172\3\162\1\164\1\151\1\141\1\162\1\uffff\1\162\1\uffff\1\164\1\172\1\uffff\1\156\1\172\1\uffff\1\172\1\151\1\uffff\1\172\1\163\1\162\1\144\1\156\1\144\1\uffff\1\151\1\146\1\150\1\uffff\1\141\1\145\1\147\1\uffff\2\143\1\172\1\143\1\162\1\172\1\164\1\172\1\164\1\144\1\154\1\143\1\156\2\172\3\uffff\1\145\1\164\2\172\1\141\1\155\1\145\1\151\1\141\1\uffff\1\172\2\uffff\1\157\1\165\3\141\1\163\1\157\1\172\1\145\1\154\1\164\1\145\1\172\1\164\1\uffff\1\164\1\141\1\156\1\uffff\1\157\1\uffff\2\172\1\141\1\145\1\172\2\uffff\2\172\2\uffff\1\154\1\172\3\164\1\uffff\1\156\1\154\1\164\1\142\1\154\1\172\1\156\1\uffff\1\156\1\172\1\145\1\172\1\uffff\1\145\1\172\1\151\1\164\1\162\2\uffff\1\162\1\141\3\uffff\1\172\1\uffff\1\145\1\150\1\151\1\172\1\141\1\151\1\154\1\172\1\uffff\2\172\1\uffff\1\162\1\uffff\1\144\1\162\1\uffff\1\156\2\172\1\145\1\142\1\uffff\1\172\1\155\1\157\1\uffff\1\164\1\157\1\145\3\uffff\3\172\1\145\2\uffff\1\172\1\154\1\uffff\1\172\1\156\1\145\1\156\1\172\3\uffff\1\144\1\uffff\1\145\1\uffff\1\172\1\144\1\172\1\uffff\1\142\1\172\1\uffff\1\172\1\uffff\1\171\2\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\13\uffff\1\24\1\30\1\31\1\37\10\uffff\1\106\1\107\2\uffff\1\115\1\117\1\120\1\121\1\122\1\127\1\130\1\131\1\134\36\uffff\1\104\1\23\3\uffff\1\52\1\55\4\uffff\1\101\1\105\1\100\1\103\1\102\1\110\1\111\1\113\1\114\1\116\1\124\1\132\1\133\1\112\32\uffff\1\75\15\uffff\1\70\1\51\16\uffff\1\66\2\uffff\1\22\43\uffff\1\123\1\uffff\1\76\2\uffff\1\77\2\uffff\1\72\2\uffff\1\42\6\uffff\1\53\3\uffff\1\65\3\uffff\1\17\17\uffff\1\15\1\63\1\126\11\uffff\1\67\1\uffff\1\71\1\3\16\uffff\1\6\3\uffff\1\7\1\uffff\1\34\5\uffff\1\12\1\61\2\uffff\1\33\1\47\5\uffff\1\1\7\uffff\1\64\4\uffff\1\25\5\uffff\1\50\1\11\2\uffff\1\62\1\20\1\36\1\uffff\1\43\10\uffff\1\40\2\uffff\1\5\1\uffff\1\16\2\uffff\1\74\5\uffff\1\56\3\uffff\1\21\3\uffff\1\27\1\57\1\73\4\uffff\1\46\1\10\2\uffff\1\44\5\uffff\1\45\1\26\1\14\1\uffff\1\32\1\uffff\1\60\3\uffff\1\13\2\uffff\1\125\1\uffff\1\54\1\uffff\1\35\1\4\1\uffff\1\41";
    static final String DFA16_specialS =
        "\u017c\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\46\2\uffff\1\46\22\uffff\1\46\1\uffff\1\45\5\uffff\1\17\1\20\1\21\1\32\1\16\1\33\1\34\1\35\12\44\1\24\1\2\1\30\1\15\1\31\2\uffff\32\43\1\37\1\uffff\1\40\1\36\1\43\1\uffff\1\25\1\12\1\6\1\23\1\4\1\3\2\43\1\14\2\43\1\26\1\7\1\27\1\10\1\5\1\43\1\11\1\22\1\13\2\43\1\1\3\43\1\41\1\uffff\1\42\u1f9b\uffff\1\43",
            "\1\50\1\47",
            "",
            "\1\55\7\uffff\1\51\2\uffff\1\53\2\uffff\1\54\5\uffff\1\52",
            "\1\60\12\uffff\1\62\1\uffff\1\56\2\uffff\1\61\6\uffff\1\57",
            "\1\63\20\uffff\1\65\2\uffff\1\64",
            "\1\66\2\uffff\1\67",
            "\1\70",
            "\1\71\1\uffff\1\73\2\uffff\1\72",
            "\1\74",
            "\1\75\5\uffff\1\76",
            "\1\100\11\uffff\1\101\6\uffff\1\77",
            "\1\104\6\uffff\1\102\1\103",
            "\1\105",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\111\3\uffff\1\110",
            "\1\112",
            "\1\114\1\uffff\1\115",
            "\1\116",
            "\1\117",
            "\1\120\1\121",
            "\1\123",
            "",
            "",
            "\1\127\1\125\1\uffff\1\126\1\uffff\1\130\56\uffff\1\131",
            "\1\133\4\uffff\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\136",
            "\1\140\3\uffff\1\137",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146\1\147\20\uffff\1\150",
            "\1\151\3\uffff\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\157\16\uffff\1\156",
            "\1\161\17\uffff\1\160",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\171\1\172\13\uffff\1\173\3\uffff\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u0085\4\43\1\u0083\1\43\1\u0084\12\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "",
            "\1\u008b",
            "\1\u008c\11\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0097",
            "\1\u0098",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a1\22\uffff\1\u00a0",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7\4\uffff\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab\12\uffff\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b7\5\uffff\1\u00b6",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00be",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c0",
            "\1\u00c1",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c3",
            "\1\u00c4",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c6",
            "\1\u00c7",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00ce\3\uffff\1\u00cd",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00d0",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u00d1\15\43\1\u00d2\3\43",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00f4",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00f7",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0106",
            "\1\u0108\20\uffff\1\u0107",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u010a",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\u0113",
            "\1\u0114",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "",
            "\1\u012e",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0131",
            "\1\u0132",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\u0136",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0141",
            "",
            "\1\u0142",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0144",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0146",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\u0147\13\43",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "",
            "",
            "\1\u014c",
            "\1\u014d",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0159",
            "",
            "\1\u015a",
            "\1\u015b",
            "",
            "\1\u015c",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u015f",
            "\1\u0160",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0162",
            "\1\u0163",
            "",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u016a",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u016c",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\u0172",
            "",
            "\1\u0173",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0175",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0177",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u017a",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | RULE_TRUE_FALSE | RULE_IDENT | RULE_UNSIGNED_NUMBER | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}