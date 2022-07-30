package fr.centralesupelec.infonum.sl.miniarm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniARMLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_NL=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_HEXINT=9;

    // delegates
    // delegators

    public InternalMiniARMLexer() {;} 
    public InternalMiniARMLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMiniARMLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMiniARM.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:11:7: ( 'include' )
            // InternalMiniARM.g:11:9: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:12:7: ( '@' )
            // InternalMiniARM.g:12:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:13:7: ( 'rmw' )
            // InternalMiniARM.g:13:9: 'rmw'
            {
            match("rmw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:14:7: ( 'smw' )
            // InternalMiniARM.g:14:9: 'smw'
            {
            match("smw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:15:7: ( 'push' )
            // InternalMiniARM.g:15:9: 'push'
            {
            match("push"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:16:7: ( 'pop' )
            // InternalMiniARM.g:16:9: 'pop'
            {
            match("pop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:17:7: ( 'ldr' )
            // InternalMiniARM.g:17:9: 'ldr'
            {
            match("ldr"); 


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
            // InternalMiniARM.g:18:7: ( ',' )
            // InternalMiniARM.g:18:9: ','
            {
            match(','); 

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
            // InternalMiniARM.g:19:7: ( 'r0' )
            // InternalMiniARM.g:19:9: 'r0'
            {
            match("r0"); 


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
            // InternalMiniARM.g:20:7: ( 'r1' )
            // InternalMiniARM.g:20:9: 'r1'
            {
            match("r1"); 


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
            // InternalMiniARM.g:21:7: ( 'r2' )
            // InternalMiniARM.g:21:9: 'r2'
            {
            match("r2"); 


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
            // InternalMiniARM.g:22:7: ( 'r3' )
            // InternalMiniARM.g:22:9: 'r3'
            {
            match("r3"); 


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
            // InternalMiniARM.g:23:7: ( 'r4' )
            // InternalMiniARM.g:23:9: 'r4'
            {
            match("r4"); 


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
            // InternalMiniARM.g:24:7: ( 'r5' )
            // InternalMiniARM.g:24:9: 'r5'
            {
            match("r5"); 


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
            // InternalMiniARM.g:25:7: ( 'r6' )
            // InternalMiniARM.g:25:9: 'r6'
            {
            match("r6"); 


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
            // InternalMiniARM.g:26:7: ( 'sp' )
            // InternalMiniARM.g:26:9: 'sp'
            {
            match("sp"); 


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
            // InternalMiniARM.g:27:7: ( 'r7' )
            // InternalMiniARM.g:27:9: 'r7'
            {
            match("r7"); 


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
            // InternalMiniARM.g:28:7: ( 'lr' )
            // InternalMiniARM.g:28:9: 'lr'
            {
            match("lr"); 


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
            // InternalMiniARM.g:29:7: ( '#' )
            // InternalMiniARM.g:29:9: '#'
            {
            match('#'); 

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
            // InternalMiniARM.g:30:7: ( '[' )
            // InternalMiniARM.g:30:9: '['
            {
            match('['); 

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
            // InternalMiniARM.g:31:7: ( ']' )
            // InternalMiniARM.g:31:9: ']'
            {
            match(']'); 

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
            // InternalMiniARM.g:32:7: ( 'str' )
            // InternalMiniARM.g:32:9: 'str'
            {
            match("str"); 


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
            // InternalMiniARM.g:33:7: ( 'mov' )
            // InternalMiniARM.g:33:9: 'mov'
            {
            match("mov"); 


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
            // InternalMiniARM.g:34:7: ( 'add' )
            // InternalMiniARM.g:34:9: 'add'
            {
            match("add"); 


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
            // InternalMiniARM.g:35:7: ( 'sub' )
            // InternalMiniARM.g:35:9: 'sub'
            {
            match("sub"); 


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
            // InternalMiniARM.g:36:7: ( 'cmp' )
            // InternalMiniARM.g:36:9: 'cmp'
            {
            match("cmp"); 


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
            // InternalMiniARM.g:37:7: ( 'beq' )
            // InternalMiniARM.g:37:9: 'beq'
            {
            match("beq"); 


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
            // InternalMiniARM.g:38:7: ( 'blt' )
            // InternalMiniARM.g:38:9: 'blt'
            {
            match("blt"); 


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
            // InternalMiniARM.g:39:7: ( 'b' )
            // InternalMiniARM.g:39:9: 'b'
            {
            match('b'); 

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
            // InternalMiniARM.g:40:7: ( 'bl' )
            // InternalMiniARM.g:40:9: 'bl'
            {
            match("bl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:1911:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMiniARM.g:1911:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMiniARM.g:1911:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMiniARM.g:1911:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMiniARM.g:1911:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMiniARM.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:1913:10: ( ( '-' | '+' )? ( '0' .. '9' )+ )
            // InternalMiniARM.g:1913:12: ( '-' | '+' )? ( '0' .. '9' )+
            {
            // InternalMiniARM.g:1913:12: ( '-' | '+' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMiniARM.g:
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

            // InternalMiniARM.g:1913:23: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMiniARM.g:1913:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_HEXINT"
    public final void mRULE_HEXINT() throws RecognitionException {
        try {
            int _type = RULE_HEXINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:1915:13: ( ( '-' | '+' )? '0x' ( '0' .. '9' | 'A' .. 'F' )+ )
            // InternalMiniARM.g:1915:15: ( '-' | '+' )? '0x' ( '0' .. '9' | 'A' .. 'F' )+
            {
            // InternalMiniARM.g:1915:15: ( '-' | '+' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiniARM.g:
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

            match("0x"); 

            // InternalMiniARM.g:1915:31: ( '0' .. '9' | 'A' .. 'F' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='F')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMiniARM.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXINT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:1917:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMiniARM.g:1917:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMiniARM.g:1917:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMiniARM.g:1917:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMiniARM.g:1917:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMiniARM.g:1917:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMiniARM.g:1917:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMiniARM.g:1917:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMiniARM.g:1917:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMiniARM.g:1917:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMiniARM.g:1917:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:1919:17: ( '%' ( options {greedy=false; } : . )* RULE_NL )
            // InternalMiniARM.g:1919:19: '%' ( options {greedy=false; } : . )* RULE_NL
            {
            match('%'); 
            // InternalMiniARM.g:1919:23: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                    alt10=2;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMiniARM.g:1919:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            mRULE_NL(); 

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
            // InternalMiniARM.g:1921:9: ( ( ' ' | '\\t' )+ )
            // InternalMiniARM.g:1921:11: ( ' ' | '\\t' )+
            {
            // InternalMiniARM.g:1921:11: ( ' ' | '\\t' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\t'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMiniARM.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:1923:9: ( ( '\\r' | '\\n' )+ )
            // InternalMiniARM.g:1923:11: ( '\\r' | '\\n' )+
            {
            // InternalMiniARM.g:1923:11: ( '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMiniARM.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMiniARM.g:1925:16: ( . )
            // InternalMiniARM.g:1925:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMiniARM.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ID | RULE_INT | RULE_HEXINT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_NL | RULE_ANY_OTHER )
        int alt13=38;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMiniARM.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalMiniARM.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalMiniARM.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalMiniARM.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalMiniARM.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalMiniARM.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalMiniARM.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalMiniARM.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalMiniARM.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalMiniARM.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalMiniARM.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalMiniARM.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalMiniARM.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalMiniARM.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalMiniARM.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalMiniARM.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalMiniARM.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalMiniARM.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalMiniARM.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalMiniARM.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalMiniARM.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalMiniARM.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalMiniARM.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalMiniARM.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalMiniARM.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalMiniARM.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalMiniARM.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalMiniARM.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalMiniARM.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalMiniARM.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalMiniARM.g:1:190: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // InternalMiniARM.g:1:198: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 33 :
                // InternalMiniARM.g:1:207: RULE_HEXINT
                {
                mRULE_HEXINT(); 

                }
                break;
            case 34 :
                // InternalMiniARM.g:1:219: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalMiniARM.g:1:231: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // InternalMiniARM.g:1:247: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // InternalMiniARM.g:1:255: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 38 :
                // InternalMiniARM.g:1:263: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\33\1\uffff\4\33\4\uffff\3\33\1\67\1\31\1\uffff\1\31\1\71\1\uffff\3\31\3\uffff\1\33\2\uffff\1\33\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\33\1\112\5\33\1\120\4\uffff\4\33\1\126\1\uffff\1\71\6\uffff\1\33\1\130\10\uffff\1\131\1\uffff\1\132\1\133\1\33\1\135\1\136\1\uffff\1\137\1\140\1\141\1\142\1\143\1\uffff\1\33\4\uffff\1\145\7\uffff\1\33\1\uffff\1\33\1\150\1\uffff";
    static final String DFA13_eofS =
        "\151\uffff";
    static final String DFA13_minS =
        "\1\0\1\156\1\uffff\1\60\1\155\1\157\1\144\4\uffff\1\157\1\144\1\155\1\60\1\101\1\uffff\1\60\1\170\1\uffff\3\0\3\uffff\1\143\2\uffff\1\167\10\60\1\167\1\60\1\162\1\142\1\163\1\160\1\162\1\60\4\uffff\1\166\1\144\1\160\1\161\1\60\1\uffff\1\170\6\uffff\1\154\1\60\10\uffff\1\60\1\uffff\2\60\1\150\2\60\1\uffff\5\60\1\uffff\1\165\4\uffff\1\60\7\uffff\1\144\1\uffff\1\145\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\156\1\uffff\1\155\2\165\1\162\4\uffff\1\157\1\144\1\155\2\172\1\uffff\1\71\1\170\1\uffff\3\uffff\3\uffff\1\143\2\uffff\1\167\10\172\1\167\1\172\1\162\1\142\1\163\1\160\1\162\1\172\4\uffff\1\166\1\144\1\160\1\161\1\172\1\uffff\1\170\6\uffff\1\154\1\172\10\uffff\1\172\1\uffff\2\172\1\150\2\172\1\uffff\5\172\1\uffff\1\165\4\uffff\1\172\7\uffff\1\144\1\uffff\1\145\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\4\uffff\1\10\1\23\1\24\1\25\5\uffff\1\37\2\uffff\1\40\3\uffff\1\44\1\45\1\46\1\uffff\1\37\1\2\21\uffff\1\10\1\23\1\24\1\25\5\uffff\1\35\1\uffff\1\40\1\41\1\42\1\43\1\44\1\45\2\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\21\1\uffff\1\20\5\uffff\1\22\5\uffff\1\36\1\uffff\1\3\1\4\1\26\1\31\1\uffff\1\6\1\7\1\27\1\30\1\32\1\33\1\34\1\uffff\1\5\2\uffff\1\1";
    static final String DFA13_specialS =
        "\1\2\23\uffff\1\3\1\1\1\0\122\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\31\1\27\1\30\2\31\1\30\22\31\1\27\1\31\1\24\1\10\1\31\1\26\1\31\1\25\3\31\1\21\1\7\1\21\2\31\1\22\11\23\6\31\1\2\32\20\1\11\1\31\1\12\1\17\1\20\1\31\1\14\1\16\1\15\5\20\1\1\2\20\1\6\1\13\2\20\1\5\1\20\1\3\1\4\7\20\uff85\31",
            "\1\32",
            "",
            "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\65\uffff\1\35",
            "\1\46\2\uffff\1\47\3\uffff\1\50\1\51",
            "\1\53\5\uffff\1\52",
            "\1\54\15\uffff\1\55",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\65\6\33\1\66\16\33",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\70\11\71",
            "\1\72",
            "",
            "\0\73",
            "\0\73",
            "\0\74",
            "",
            "",
            "",
            "\1\77",
            "",
            "",
            "\1\100",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\111",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33\1\125\6\33",
            "",
            "\1\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\134",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\144",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\146",
            "",
            "\1\147",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ID | RULE_INT | RULE_HEXINT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_NL | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_22 = input.LA(1);

                        s = -1;
                        if ( ((LA13_22>='\u0000' && LA13_22<='\uFFFF')) ) {s = 60;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_21 = input.LA(1);

                        s = -1;
                        if ( ((LA13_21>='\u0000' && LA13_21<='\uFFFF')) ) {s = 59;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='i') ) {s = 1;}

                        else if ( (LA13_0=='@') ) {s = 2;}

                        else if ( (LA13_0=='r') ) {s = 3;}

                        else if ( (LA13_0=='s') ) {s = 4;}

                        else if ( (LA13_0=='p') ) {s = 5;}

                        else if ( (LA13_0=='l') ) {s = 6;}

                        else if ( (LA13_0==',') ) {s = 7;}

                        else if ( (LA13_0=='#') ) {s = 8;}

                        else if ( (LA13_0=='[') ) {s = 9;}

                        else if ( (LA13_0==']') ) {s = 10;}

                        else if ( (LA13_0=='m') ) {s = 11;}

                        else if ( (LA13_0=='a') ) {s = 12;}

                        else if ( (LA13_0=='c') ) {s = 13;}

                        else if ( (LA13_0=='b') ) {s = 14;}

                        else if ( (LA13_0=='^') ) {s = 15;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='d' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='n' && LA13_0<='o')||LA13_0=='q'||(LA13_0>='t' && LA13_0<='z')) ) {s = 16;}

                        else if ( (LA13_0=='+'||LA13_0=='-') ) {s = 17;}

                        else if ( (LA13_0=='0') ) {s = 18;}

                        else if ( ((LA13_0>='1' && LA13_0<='9')) ) {s = 19;}

                        else if ( (LA13_0=='\"') ) {s = 20;}

                        else if ( (LA13_0=='\'') ) {s = 21;}

                        else if ( (LA13_0=='%') ) {s = 22;}

                        else if ( (LA13_0=='\t'||LA13_0==' ') ) {s = 23;}

                        else if ( (LA13_0=='\n'||LA13_0=='\r') ) {s = 24;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||LA13_0=='$'||LA13_0=='&'||(LA13_0>='(' && LA13_0<='*')||(LA13_0>='.' && LA13_0<='/')||(LA13_0>=':' && LA13_0<='?')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_20 = input.LA(1);

                        s = -1;
                        if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFF')) ) {s = 59;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}