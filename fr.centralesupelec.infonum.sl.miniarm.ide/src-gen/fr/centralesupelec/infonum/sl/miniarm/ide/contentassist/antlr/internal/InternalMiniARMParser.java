package fr.centralesupelec.infonum.sl.miniarm.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.centralesupelec.infonum.sl.miniarm.services.MiniARMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniARMParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEXINT", "RULE_WS", "RULE_ANY_OTHER", "'include'", "'@'", "'rmw'", "'smw'", "'push'", "'pop'", "'ldr'", "','", "'#'", "'['", "']'", "'str'", "'mov'", "'add'", "'sub'", "'cmp'", "'beq'", "'blt'", "'b'", "'bl'", "'r0'", "'r1'", "'r2'", "'r3'", "'r4'", "'r5'", "'r6'", "'sp'", "'r7'", "'lr'"
    };
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


        public InternalMiniARMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniARMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniARMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMiniARM.g"; }


    	private MiniARMGrammarAccess grammarAccess;

    	public void setGrammarAccess(MiniARMGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalMiniARM.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMiniARM.g:54:1: ( ruleProgram EOF )
            // InternalMiniARM.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMiniARM.g:62:1: ruleProgram : ( ( rule__Program__LinesAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:66:2: ( ( ( rule__Program__LinesAssignment )* ) )
            // InternalMiniARM.g:67:2: ( ( rule__Program__LinesAssignment )* )
            {
            // InternalMiniARM.g:67:2: ( ( rule__Program__LinesAssignment )* )
            // InternalMiniARM.g:68:3: ( rule__Program__LinesAssignment )*
            {
             before(grammarAccess.getProgramAccess().getLinesAssignment()); 
            // InternalMiniARM.g:69:3: ( rule__Program__LinesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_NL && LA1_0<=RULE_SL_COMMENT)||(LA1_0>=12 && LA1_0<=18)||(LA1_0>=23 && LA1_0<=31)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMiniARM.g:69:4: rule__Program__LinesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__LinesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getLinesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleLine"
    // InternalMiniARM.g:78:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalMiniARM.g:79:1: ( ruleLine EOF )
            // InternalMiniARM.g:80:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalMiniARM.g:87:1: ruleLine : ( ( rule__Line__Alternatives ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:91:2: ( ( ( rule__Line__Alternatives ) ) )
            // InternalMiniARM.g:92:2: ( ( rule__Line__Alternatives ) )
            {
            // InternalMiniARM.g:92:2: ( ( rule__Line__Alternatives ) )
            // InternalMiniARM.g:93:3: ( rule__Line__Alternatives )
            {
             before(grammarAccess.getLineAccess().getAlternatives()); 
            // InternalMiniARM.g:94:3: ( rule__Line__Alternatives )
            // InternalMiniARM.g:94:4: rule__Line__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Line__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleInclude"
    // InternalMiniARM.g:103:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // InternalMiniARM.g:104:1: ( ruleInclude EOF )
            // InternalMiniARM.g:105:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalMiniARM.g:112:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:116:2: ( ( ( rule__Include__Group__0 ) ) )
            // InternalMiniARM.g:117:2: ( ( rule__Include__Group__0 ) )
            {
            // InternalMiniARM.g:117:2: ( ( rule__Include__Group__0 ) )
            // InternalMiniARM.g:118:3: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // InternalMiniARM.g:119:3: ( rule__Include__Group__0 )
            // InternalMiniARM.g:119:4: rule__Include__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleLabelDef"
    // InternalMiniARM.g:128:1: entryRuleLabelDef : ruleLabelDef EOF ;
    public final void entryRuleLabelDef() throws RecognitionException {
        try {
            // InternalMiniARM.g:129:1: ( ruleLabelDef EOF )
            // InternalMiniARM.g:130:1: ruleLabelDef EOF
            {
             before(grammarAccess.getLabelDefRule()); 
            pushFollow(FOLLOW_1);
            ruleLabelDef();

            state._fsp--;

             after(grammarAccess.getLabelDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabelDef"


    // $ANTLR start "ruleLabelDef"
    // InternalMiniARM.g:137:1: ruleLabelDef : ( ( rule__LabelDef__Group__0 ) ) ;
    public final void ruleLabelDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:141:2: ( ( ( rule__LabelDef__Group__0 ) ) )
            // InternalMiniARM.g:142:2: ( ( rule__LabelDef__Group__0 ) )
            {
            // InternalMiniARM.g:142:2: ( ( rule__LabelDef__Group__0 ) )
            // InternalMiniARM.g:143:3: ( rule__LabelDef__Group__0 )
            {
             before(grammarAccess.getLabelDefAccess().getGroup()); 
            // InternalMiniARM.g:144:3: ( rule__LabelDef__Group__0 )
            // InternalMiniARM.g:144:4: rule__LabelDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LabelDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabelDef"


    // $ANTLR start "entryRuleLabel"
    // InternalMiniARM.g:153:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalMiniARM.g:154:1: ( ruleLabel EOF )
            // InternalMiniARM.g:155:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMiniARM.g:162:1: ruleLabel : ( ( rule__Label__NameAssignment ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:166:2: ( ( ( rule__Label__NameAssignment ) ) )
            // InternalMiniARM.g:167:2: ( ( rule__Label__NameAssignment ) )
            {
            // InternalMiniARM.g:167:2: ( ( rule__Label__NameAssignment ) )
            // InternalMiniARM.g:168:3: ( rule__Label__NameAssignment )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment()); 
            // InternalMiniARM.g:169:3: ( rule__Label__NameAssignment )
            // InternalMiniARM.g:169:4: rule__Label__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Label__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleInstruction"
    // InternalMiniARM.g:178:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalMiniARM.g:179:1: ( ruleInstruction EOF )
            // InternalMiniARM.g:180:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMiniARM.g:187:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:191:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalMiniARM.g:192:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalMiniARM.g:192:2: ( ( rule__Instruction__Alternatives ) )
            // InternalMiniARM.g:193:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalMiniARM.g:194:3: ( rule__Instruction__Alternatives )
            // InternalMiniARM.g:194:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleAssemblyInst"
    // InternalMiniARM.g:203:1: entryRuleAssemblyInst : ruleAssemblyInst EOF ;
    public final void entryRuleAssemblyInst() throws RecognitionException {
        try {
            // InternalMiniARM.g:204:1: ( ruleAssemblyInst EOF )
            // InternalMiniARM.g:205:1: ruleAssemblyInst EOF
            {
             before(grammarAccess.getAssemblyInstRule()); 
            pushFollow(FOLLOW_1);
            ruleAssemblyInst();

            state._fsp--;

             after(grammarAccess.getAssemblyInstRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssemblyInst"


    // $ANTLR start "ruleAssemblyInst"
    // InternalMiniARM.g:212:1: ruleAssemblyInst : ( ( rule__AssemblyInst__Alternatives ) ) ;
    public final void ruleAssemblyInst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:216:2: ( ( ( rule__AssemblyInst__Alternatives ) ) )
            // InternalMiniARM.g:217:2: ( ( rule__AssemblyInst__Alternatives ) )
            {
            // InternalMiniARM.g:217:2: ( ( rule__AssemblyInst__Alternatives ) )
            // InternalMiniARM.g:218:3: ( rule__AssemblyInst__Alternatives )
            {
             before(grammarAccess.getAssemblyInstAccess().getAlternatives()); 
            // InternalMiniARM.g:219:3: ( rule__AssemblyInst__Alternatives )
            // InternalMiniARM.g:219:4: rule__AssemblyInst__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyInst__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyInstAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssemblyInst"


    // $ANTLR start "entryRulePseudoInst"
    // InternalMiniARM.g:228:1: entryRulePseudoInst : rulePseudoInst EOF ;
    public final void entryRulePseudoInst() throws RecognitionException {
        try {
            // InternalMiniARM.g:229:1: ( rulePseudoInst EOF )
            // InternalMiniARM.g:230:1: rulePseudoInst EOF
            {
             before(grammarAccess.getPseudoInstRule()); 
            pushFollow(FOLLOW_1);
            rulePseudoInst();

            state._fsp--;

             after(grammarAccess.getPseudoInstRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePseudoInst"


    // $ANTLR start "rulePseudoInst"
    // InternalMiniARM.g:237:1: rulePseudoInst : ( ( rule__PseudoInst__Alternatives ) ) ;
    public final void rulePseudoInst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:241:2: ( ( ( rule__PseudoInst__Alternatives ) ) )
            // InternalMiniARM.g:242:2: ( ( rule__PseudoInst__Alternatives ) )
            {
            // InternalMiniARM.g:242:2: ( ( rule__PseudoInst__Alternatives ) )
            // InternalMiniARM.g:243:3: ( rule__PseudoInst__Alternatives )
            {
             before(grammarAccess.getPseudoInstAccess().getAlternatives()); 
            // InternalMiniARM.g:244:3: ( rule__PseudoInst__Alternatives )
            // InternalMiniARM.g:244:4: rule__PseudoInst__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PseudoInst__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPseudoInstAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePseudoInst"


    // $ANTLR start "entryRuleRealInst"
    // InternalMiniARM.g:253:1: entryRuleRealInst : ruleRealInst EOF ;
    public final void entryRuleRealInst() throws RecognitionException {
        try {
            // InternalMiniARM.g:254:1: ( ruleRealInst EOF )
            // InternalMiniARM.g:255:1: ruleRealInst EOF
            {
             before(grammarAccess.getRealInstRule()); 
            pushFollow(FOLLOW_1);
            ruleRealInst();

            state._fsp--;

             after(grammarAccess.getRealInstRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRealInst"


    // $ANTLR start "ruleRealInst"
    // InternalMiniARM.g:262:1: ruleRealInst : ( ( rule__RealInst__Alternatives ) ) ;
    public final void ruleRealInst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:266:2: ( ( ( rule__RealInst__Alternatives ) ) )
            // InternalMiniARM.g:267:2: ( ( rule__RealInst__Alternatives ) )
            {
            // InternalMiniARM.g:267:2: ( ( rule__RealInst__Alternatives ) )
            // InternalMiniARM.g:268:3: ( rule__RealInst__Alternatives )
            {
             before(grammarAccess.getRealInstAccess().getAlternatives()); 
            // InternalMiniARM.g:269:3: ( rule__RealInst__Alternatives )
            // InternalMiniARM.g:269:4: rule__RealInst__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RealInst__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRealInstAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealInst"


    // $ANTLR start "entryRuleRMW"
    // InternalMiniARM.g:278:1: entryRuleRMW : ruleRMW EOF ;
    public final void entryRuleRMW() throws RecognitionException {
        try {
            // InternalMiniARM.g:279:1: ( ruleRMW EOF )
            // InternalMiniARM.g:280:1: ruleRMW EOF
            {
             before(grammarAccess.getRMWRule()); 
            pushFollow(FOLLOW_1);
            ruleRMW();

            state._fsp--;

             after(grammarAccess.getRMWRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRMW"


    // $ANTLR start "ruleRMW"
    // InternalMiniARM.g:287:1: ruleRMW : ( ( rule__RMW__Group__0 ) ) ;
    public final void ruleRMW() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:291:2: ( ( ( rule__RMW__Group__0 ) ) )
            // InternalMiniARM.g:292:2: ( ( rule__RMW__Group__0 ) )
            {
            // InternalMiniARM.g:292:2: ( ( rule__RMW__Group__0 ) )
            // InternalMiniARM.g:293:3: ( rule__RMW__Group__0 )
            {
             before(grammarAccess.getRMWAccess().getGroup()); 
            // InternalMiniARM.g:294:3: ( rule__RMW__Group__0 )
            // InternalMiniARM.g:294:4: rule__RMW__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RMW__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRMWAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRMW"


    // $ANTLR start "entryRuleSMW"
    // InternalMiniARM.g:303:1: entryRuleSMW : ruleSMW EOF ;
    public final void entryRuleSMW() throws RecognitionException {
        try {
            // InternalMiniARM.g:304:1: ( ruleSMW EOF )
            // InternalMiniARM.g:305:1: ruleSMW EOF
            {
             before(grammarAccess.getSMWRule()); 
            pushFollow(FOLLOW_1);
            ruleSMW();

            state._fsp--;

             after(grammarAccess.getSMWRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSMW"


    // $ANTLR start "ruleSMW"
    // InternalMiniARM.g:312:1: ruleSMW : ( ( rule__SMW__Group__0 ) ) ;
    public final void ruleSMW() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:316:2: ( ( ( rule__SMW__Group__0 ) ) )
            // InternalMiniARM.g:317:2: ( ( rule__SMW__Group__0 ) )
            {
            // InternalMiniARM.g:317:2: ( ( rule__SMW__Group__0 ) )
            // InternalMiniARM.g:318:3: ( rule__SMW__Group__0 )
            {
             before(grammarAccess.getSMWAccess().getGroup()); 
            // InternalMiniARM.g:319:3: ( rule__SMW__Group__0 )
            // InternalMiniARM.g:319:4: rule__SMW__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SMW__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSMWAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSMW"


    // $ANTLR start "entryRuleSMS"
    // InternalMiniARM.g:328:1: entryRuleSMS : ruleSMS EOF ;
    public final void entryRuleSMS() throws RecognitionException {
        try {
            // InternalMiniARM.g:329:1: ( ruleSMS EOF )
            // InternalMiniARM.g:330:1: ruleSMS EOF
            {
             before(grammarAccess.getSMSRule()); 
            pushFollow(FOLLOW_1);
            ruleSMS();

            state._fsp--;

             after(grammarAccess.getSMSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSMS"


    // $ANTLR start "ruleSMS"
    // InternalMiniARM.g:337:1: ruleSMS : ( ( rule__SMS__Group__0 ) ) ;
    public final void ruleSMS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:341:2: ( ( ( rule__SMS__Group__0 ) ) )
            // InternalMiniARM.g:342:2: ( ( rule__SMS__Group__0 ) )
            {
            // InternalMiniARM.g:342:2: ( ( rule__SMS__Group__0 ) )
            // InternalMiniARM.g:343:3: ( rule__SMS__Group__0 )
            {
             before(grammarAccess.getSMSAccess().getGroup()); 
            // InternalMiniARM.g:344:3: ( rule__SMS__Group__0 )
            // InternalMiniARM.g:344:4: rule__SMS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SMS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSMSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSMS"


    // $ANTLR start "entryRulePUSH"
    // InternalMiniARM.g:353:1: entryRulePUSH : rulePUSH EOF ;
    public final void entryRulePUSH() throws RecognitionException {
        try {
            // InternalMiniARM.g:354:1: ( rulePUSH EOF )
            // InternalMiniARM.g:355:1: rulePUSH EOF
            {
             before(grammarAccess.getPUSHRule()); 
            pushFollow(FOLLOW_1);
            rulePUSH();

            state._fsp--;

             after(grammarAccess.getPUSHRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePUSH"


    // $ANTLR start "rulePUSH"
    // InternalMiniARM.g:362:1: rulePUSH : ( ( rule__PUSH__Group__0 ) ) ;
    public final void rulePUSH() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:366:2: ( ( ( rule__PUSH__Group__0 ) ) )
            // InternalMiniARM.g:367:2: ( ( rule__PUSH__Group__0 ) )
            {
            // InternalMiniARM.g:367:2: ( ( rule__PUSH__Group__0 ) )
            // InternalMiniARM.g:368:3: ( rule__PUSH__Group__0 )
            {
             before(grammarAccess.getPUSHAccess().getGroup()); 
            // InternalMiniARM.g:369:3: ( rule__PUSH__Group__0 )
            // InternalMiniARM.g:369:4: rule__PUSH__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PUSH__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPUSHAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePUSH"


    // $ANTLR start "entryRulePOP"
    // InternalMiniARM.g:378:1: entryRulePOP : rulePOP EOF ;
    public final void entryRulePOP() throws RecognitionException {
        try {
            // InternalMiniARM.g:379:1: ( rulePOP EOF )
            // InternalMiniARM.g:380:1: rulePOP EOF
            {
             before(grammarAccess.getPOPRule()); 
            pushFollow(FOLLOW_1);
            rulePOP();

            state._fsp--;

             after(grammarAccess.getPOPRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePOP"


    // $ANTLR start "rulePOP"
    // InternalMiniARM.g:387:1: rulePOP : ( ( rule__POP__Group__0 ) ) ;
    public final void rulePOP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:391:2: ( ( ( rule__POP__Group__0 ) ) )
            // InternalMiniARM.g:392:2: ( ( rule__POP__Group__0 ) )
            {
            // InternalMiniARM.g:392:2: ( ( rule__POP__Group__0 ) )
            // InternalMiniARM.g:393:3: ( rule__POP__Group__0 )
            {
             before(grammarAccess.getPOPAccess().getGroup()); 
            // InternalMiniARM.g:394:3: ( rule__POP__Group__0 )
            // InternalMiniARM.g:394:4: rule__POP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__POP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPOPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePOP"


    // $ANTLR start "entryRuleLOAD"
    // InternalMiniARM.g:403:1: entryRuleLOAD : ruleLOAD EOF ;
    public final void entryRuleLOAD() throws RecognitionException {
        try {
            // InternalMiniARM.g:404:1: ( ruleLOAD EOF )
            // InternalMiniARM.g:405:1: ruleLOAD EOF
            {
             before(grammarAccess.getLOADRule()); 
            pushFollow(FOLLOW_1);
            ruleLOAD();

            state._fsp--;

             after(grammarAccess.getLOADRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLOAD"


    // $ANTLR start "ruleLOAD"
    // InternalMiniARM.g:412:1: ruleLOAD : ( ( rule__LOAD__Group__0 ) ) ;
    public final void ruleLOAD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:416:2: ( ( ( rule__LOAD__Group__0 ) ) )
            // InternalMiniARM.g:417:2: ( ( rule__LOAD__Group__0 ) )
            {
            // InternalMiniARM.g:417:2: ( ( rule__LOAD__Group__0 ) )
            // InternalMiniARM.g:418:3: ( rule__LOAD__Group__0 )
            {
             before(grammarAccess.getLOADAccess().getGroup()); 
            // InternalMiniARM.g:419:3: ( rule__LOAD__Group__0 )
            // InternalMiniARM.g:419:4: rule__LOAD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LOAD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLOADAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLOAD"


    // $ANTLR start "entryRuleRegister"
    // InternalMiniARM.g:428:1: entryRuleRegister : ruleRegister EOF ;
    public final void entryRuleRegister() throws RecognitionException {
        try {
            // InternalMiniARM.g:429:1: ( ruleRegister EOF )
            // InternalMiniARM.g:430:1: ruleRegister EOF
            {
             before(grammarAccess.getRegisterRule()); 
            pushFollow(FOLLOW_1);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getRegisterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegister"


    // $ANTLR start "ruleRegister"
    // InternalMiniARM.g:437:1: ruleRegister : ( ( rule__Register__Alternatives ) ) ;
    public final void ruleRegister() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:441:2: ( ( ( rule__Register__Alternatives ) ) )
            // InternalMiniARM.g:442:2: ( ( rule__Register__Alternatives ) )
            {
            // InternalMiniARM.g:442:2: ( ( rule__Register__Alternatives ) )
            // InternalMiniARM.g:443:3: ( rule__Register__Alternatives )
            {
             before(grammarAccess.getRegisterAccess().getAlternatives()); 
            // InternalMiniARM.g:444:3: ( rule__Register__Alternatives )
            // InternalMiniARM.g:444:4: rule__Register__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Register__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRegisterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegister"


    // $ANTLR start "entryRuleImmediate"
    // InternalMiniARM.g:453:1: entryRuleImmediate : ruleImmediate EOF ;
    public final void entryRuleImmediate() throws RecognitionException {
        try {
            // InternalMiniARM.g:454:1: ( ruleImmediate EOF )
            // InternalMiniARM.g:455:1: ruleImmediate EOF
            {
             before(grammarAccess.getImmediateRule()); 
            pushFollow(FOLLOW_1);
            ruleImmediate();

            state._fsp--;

             after(grammarAccess.getImmediateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImmediate"


    // $ANTLR start "ruleImmediate"
    // InternalMiniARM.g:462:1: ruleImmediate : ( ( rule__Immediate__Group__0 ) ) ;
    public final void ruleImmediate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:466:2: ( ( ( rule__Immediate__Group__0 ) ) )
            // InternalMiniARM.g:467:2: ( ( rule__Immediate__Group__0 ) )
            {
            // InternalMiniARM.g:467:2: ( ( rule__Immediate__Group__0 ) )
            // InternalMiniARM.g:468:3: ( rule__Immediate__Group__0 )
            {
             before(grammarAccess.getImmediateAccess().getGroup()); 
            // InternalMiniARM.g:469:3: ( rule__Immediate__Group__0 )
            // InternalMiniARM.g:469:4: rule__Immediate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Immediate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImmediateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImmediate"


    // $ANTLR start "entryRuleValue"
    // InternalMiniARM.g:478:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMiniARM.g:479:1: ( ruleValue EOF )
            // InternalMiniARM.g:480:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMiniARM.g:487:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:491:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMiniARM.g:492:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMiniARM.g:492:2: ( ( rule__Value__Alternatives ) )
            // InternalMiniARM.g:493:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMiniARM.g:494:3: ( rule__Value__Alternatives )
            // InternalMiniARM.g:494:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleConst"
    // InternalMiniARM.g:503:1: entryRuleConst : ruleConst EOF ;
    public final void entryRuleConst() throws RecognitionException {
        try {
            // InternalMiniARM.g:504:1: ( ruleConst EOF )
            // InternalMiniARM.g:505:1: ruleConst EOF
            {
             before(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_1);
            ruleConst();

            state._fsp--;

             after(grammarAccess.getConstRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalMiniARM.g:512:1: ruleConst : ( ( rule__Const__NumAssignment ) ) ;
    public final void ruleConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:516:2: ( ( ( rule__Const__NumAssignment ) ) )
            // InternalMiniARM.g:517:2: ( ( rule__Const__NumAssignment ) )
            {
            // InternalMiniARM.g:517:2: ( ( rule__Const__NumAssignment ) )
            // InternalMiniARM.g:518:3: ( rule__Const__NumAssignment )
            {
             before(grammarAccess.getConstAccess().getNumAssignment()); 
            // InternalMiniARM.g:519:3: ( rule__Const__NumAssignment )
            // InternalMiniARM.g:519:4: rule__Const__NumAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Const__NumAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstAccess().getNumAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConst"


    // $ANTLR start "entryRuleHexConst"
    // InternalMiniARM.g:528:1: entryRuleHexConst : ruleHexConst EOF ;
    public final void entryRuleHexConst() throws RecognitionException {
        try {
            // InternalMiniARM.g:529:1: ( ruleHexConst EOF )
            // InternalMiniARM.g:530:1: ruleHexConst EOF
            {
             before(grammarAccess.getHexConstRule()); 
            pushFollow(FOLLOW_1);
            ruleHexConst();

            state._fsp--;

             after(grammarAccess.getHexConstRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHexConst"


    // $ANTLR start "ruleHexConst"
    // InternalMiniARM.g:537:1: ruleHexConst : ( ( rule__HexConst__NumAssignment ) ) ;
    public final void ruleHexConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:541:2: ( ( ( rule__HexConst__NumAssignment ) ) )
            // InternalMiniARM.g:542:2: ( ( rule__HexConst__NumAssignment ) )
            {
            // InternalMiniARM.g:542:2: ( ( rule__HexConst__NumAssignment ) )
            // InternalMiniARM.g:543:3: ( rule__HexConst__NumAssignment )
            {
             before(grammarAccess.getHexConstAccess().getNumAssignment()); 
            // InternalMiniARM.g:544:3: ( rule__HexConst__NumAssignment )
            // InternalMiniARM.g:544:4: rule__HexConst__NumAssignment
            {
            pushFollow(FOLLOW_2);
            rule__HexConst__NumAssignment();

            state._fsp--;


            }

             after(grammarAccess.getHexConstAccess().getNumAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHexConst"


    // $ANTLR start "entryRuleDirect"
    // InternalMiniARM.g:553:1: entryRuleDirect : ruleDirect EOF ;
    public final void entryRuleDirect() throws RecognitionException {
        try {
            // InternalMiniARM.g:554:1: ( ruleDirect EOF )
            // InternalMiniARM.g:555:1: ruleDirect EOF
            {
             before(grammarAccess.getDirectRule()); 
            pushFollow(FOLLOW_1);
            ruleDirect();

            state._fsp--;

             after(grammarAccess.getDirectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirect"


    // $ANTLR start "ruleDirect"
    // InternalMiniARM.g:562:1: ruleDirect : ( ( rule__Direct__AddressAssignment ) ) ;
    public final void ruleDirect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:566:2: ( ( ( rule__Direct__AddressAssignment ) ) )
            // InternalMiniARM.g:567:2: ( ( rule__Direct__AddressAssignment ) )
            {
            // InternalMiniARM.g:567:2: ( ( rule__Direct__AddressAssignment ) )
            // InternalMiniARM.g:568:3: ( rule__Direct__AddressAssignment )
            {
             before(grammarAccess.getDirectAccess().getAddressAssignment()); 
            // InternalMiniARM.g:569:3: ( rule__Direct__AddressAssignment )
            // InternalMiniARM.g:569:4: rule__Direct__AddressAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Direct__AddressAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDirectAccess().getAddressAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirect"


    // $ANTLR start "entryRuleDirectReg"
    // InternalMiniARM.g:578:1: entryRuleDirectReg : ruleDirectReg EOF ;
    public final void entryRuleDirectReg() throws RecognitionException {
        try {
            // InternalMiniARM.g:579:1: ( ruleDirectReg EOF )
            // InternalMiniARM.g:580:1: ruleDirectReg EOF
            {
             before(grammarAccess.getDirectRegRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectReg();

            state._fsp--;

             after(grammarAccess.getDirectRegRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectReg"


    // $ANTLR start "ruleDirectReg"
    // InternalMiniARM.g:587:1: ruleDirectReg : ( ( rule__DirectReg__Group__0 ) ) ;
    public final void ruleDirectReg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:591:2: ( ( ( rule__DirectReg__Group__0 ) ) )
            // InternalMiniARM.g:592:2: ( ( rule__DirectReg__Group__0 ) )
            {
            // InternalMiniARM.g:592:2: ( ( rule__DirectReg__Group__0 ) )
            // InternalMiniARM.g:593:3: ( rule__DirectReg__Group__0 )
            {
             before(grammarAccess.getDirectRegAccess().getGroup()); 
            // InternalMiniARM.g:594:3: ( rule__DirectReg__Group__0 )
            // InternalMiniARM.g:594:4: rule__DirectReg__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DirectReg__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectRegAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectReg"


    // $ANTLR start "entryRuleSTORE"
    // InternalMiniARM.g:603:1: entryRuleSTORE : ruleSTORE EOF ;
    public final void entryRuleSTORE() throws RecognitionException {
        try {
            // InternalMiniARM.g:604:1: ( ruleSTORE EOF )
            // InternalMiniARM.g:605:1: ruleSTORE EOF
            {
             before(grammarAccess.getSTORERule()); 
            pushFollow(FOLLOW_1);
            ruleSTORE();

            state._fsp--;

             after(grammarAccess.getSTORERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSTORE"


    // $ANTLR start "ruleSTORE"
    // InternalMiniARM.g:612:1: ruleSTORE : ( ( rule__STORE__Group__0 ) ) ;
    public final void ruleSTORE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:616:2: ( ( ( rule__STORE__Group__0 ) ) )
            // InternalMiniARM.g:617:2: ( ( rule__STORE__Group__0 ) )
            {
            // InternalMiniARM.g:617:2: ( ( rule__STORE__Group__0 ) )
            // InternalMiniARM.g:618:3: ( rule__STORE__Group__0 )
            {
             before(grammarAccess.getSTOREAccess().getGroup()); 
            // InternalMiniARM.g:619:3: ( rule__STORE__Group__0 )
            // InternalMiniARM.g:619:4: rule__STORE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__STORE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSTOREAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSTORE"


    // $ANTLR start "entryRuleAddress"
    // InternalMiniARM.g:628:1: entryRuleAddress : ruleAddress EOF ;
    public final void entryRuleAddress() throws RecognitionException {
        try {
            // InternalMiniARM.g:629:1: ( ruleAddress EOF )
            // InternalMiniARM.g:630:1: ruleAddress EOF
            {
             before(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getAddressRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalMiniARM.g:637:1: ruleAddress : ( ( rule__Address__Alternatives ) ) ;
    public final void ruleAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:641:2: ( ( ( rule__Address__Alternatives ) ) )
            // InternalMiniARM.g:642:2: ( ( rule__Address__Alternatives ) )
            {
            // InternalMiniARM.g:642:2: ( ( rule__Address__Alternatives ) )
            // InternalMiniARM.g:643:3: ( rule__Address__Alternatives )
            {
             before(grammarAccess.getAddressAccess().getAlternatives()); 
            // InternalMiniARM.g:644:3: ( rule__Address__Alternatives )
            // InternalMiniARM.g:644:4: rule__Address__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Address__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleMOVE"
    // InternalMiniARM.g:653:1: entryRuleMOVE : ruleMOVE EOF ;
    public final void entryRuleMOVE() throws RecognitionException {
        try {
            // InternalMiniARM.g:654:1: ( ruleMOVE EOF )
            // InternalMiniARM.g:655:1: ruleMOVE EOF
            {
             before(grammarAccess.getMOVERule()); 
            pushFollow(FOLLOW_1);
            ruleMOVE();

            state._fsp--;

             after(grammarAccess.getMOVERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMOVE"


    // $ANTLR start "ruleMOVE"
    // InternalMiniARM.g:662:1: ruleMOVE : ( ( rule__MOVE__Group__0 ) ) ;
    public final void ruleMOVE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:666:2: ( ( ( rule__MOVE__Group__0 ) ) )
            // InternalMiniARM.g:667:2: ( ( rule__MOVE__Group__0 ) )
            {
            // InternalMiniARM.g:667:2: ( ( rule__MOVE__Group__0 ) )
            // InternalMiniARM.g:668:3: ( rule__MOVE__Group__0 )
            {
             before(grammarAccess.getMOVEAccess().getGroup()); 
            // InternalMiniARM.g:669:3: ( rule__MOVE__Group__0 )
            // InternalMiniARM.g:669:4: rule__MOVE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MOVE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMOVEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMOVE"


    // $ANTLR start "entryRuleMoveValue"
    // InternalMiniARM.g:678:1: entryRuleMoveValue : ruleMoveValue EOF ;
    public final void entryRuleMoveValue() throws RecognitionException {
        try {
            // InternalMiniARM.g:679:1: ( ruleMoveValue EOF )
            // InternalMiniARM.g:680:1: ruleMoveValue EOF
            {
             before(grammarAccess.getMoveValueRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveValue();

            state._fsp--;

             after(grammarAccess.getMoveValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveValue"


    // $ANTLR start "ruleMoveValue"
    // InternalMiniARM.g:687:1: ruleMoveValue : ( ( rule__MoveValue__Alternatives ) ) ;
    public final void ruleMoveValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:691:2: ( ( ( rule__MoveValue__Alternatives ) ) )
            // InternalMiniARM.g:692:2: ( ( rule__MoveValue__Alternatives ) )
            {
            // InternalMiniARM.g:692:2: ( ( rule__MoveValue__Alternatives ) )
            // InternalMiniARM.g:693:3: ( rule__MoveValue__Alternatives )
            {
             before(grammarAccess.getMoveValueAccess().getAlternatives()); 
            // InternalMiniARM.g:694:3: ( rule__MoveValue__Alternatives )
            // InternalMiniARM.g:694:4: rule__MoveValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MoveValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMoveValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveValue"


    // $ANTLR start "entryRuleADD"
    // InternalMiniARM.g:703:1: entryRuleADD : ruleADD EOF ;
    public final void entryRuleADD() throws RecognitionException {
        try {
            // InternalMiniARM.g:704:1: ( ruleADD EOF )
            // InternalMiniARM.g:705:1: ruleADD EOF
            {
             before(grammarAccess.getADDRule()); 
            pushFollow(FOLLOW_1);
            ruleADD();

            state._fsp--;

             after(grammarAccess.getADDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleADD"


    // $ANTLR start "ruleADD"
    // InternalMiniARM.g:712:1: ruleADD : ( ( rule__ADD__Group__0 ) ) ;
    public final void ruleADD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:716:2: ( ( ( rule__ADD__Group__0 ) ) )
            // InternalMiniARM.g:717:2: ( ( rule__ADD__Group__0 ) )
            {
            // InternalMiniARM.g:717:2: ( ( rule__ADD__Group__0 ) )
            // InternalMiniARM.g:718:3: ( rule__ADD__Group__0 )
            {
             before(grammarAccess.getADDAccess().getGroup()); 
            // InternalMiniARM.g:719:3: ( rule__ADD__Group__0 )
            // InternalMiniARM.g:719:4: rule__ADD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ADD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getADDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleADD"


    // $ANTLR start "entryRuleSUB"
    // InternalMiniARM.g:728:1: entryRuleSUB : ruleSUB EOF ;
    public final void entryRuleSUB() throws RecognitionException {
        try {
            // InternalMiniARM.g:729:1: ( ruleSUB EOF )
            // InternalMiniARM.g:730:1: ruleSUB EOF
            {
             before(grammarAccess.getSUBRule()); 
            pushFollow(FOLLOW_1);
            ruleSUB();

            state._fsp--;

             after(grammarAccess.getSUBRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSUB"


    // $ANTLR start "ruleSUB"
    // InternalMiniARM.g:737:1: ruleSUB : ( ( rule__SUB__Group__0 ) ) ;
    public final void ruleSUB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:741:2: ( ( ( rule__SUB__Group__0 ) ) )
            // InternalMiniARM.g:742:2: ( ( rule__SUB__Group__0 ) )
            {
            // InternalMiniARM.g:742:2: ( ( rule__SUB__Group__0 ) )
            // InternalMiniARM.g:743:3: ( rule__SUB__Group__0 )
            {
             before(grammarAccess.getSUBAccess().getGroup()); 
            // InternalMiniARM.g:744:3: ( rule__SUB__Group__0 )
            // InternalMiniARM.g:744:4: rule__SUB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SUB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSUBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSUB"


    // $ANTLR start "entryRuleCMP"
    // InternalMiniARM.g:753:1: entryRuleCMP : ruleCMP EOF ;
    public final void entryRuleCMP() throws RecognitionException {
        try {
            // InternalMiniARM.g:754:1: ( ruleCMP EOF )
            // InternalMiniARM.g:755:1: ruleCMP EOF
            {
             before(grammarAccess.getCMPRule()); 
            pushFollow(FOLLOW_1);
            ruleCMP();

            state._fsp--;

             after(grammarAccess.getCMPRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCMP"


    // $ANTLR start "ruleCMP"
    // InternalMiniARM.g:762:1: ruleCMP : ( ( rule__CMP__Group__0 ) ) ;
    public final void ruleCMP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:766:2: ( ( ( rule__CMP__Group__0 ) ) )
            // InternalMiniARM.g:767:2: ( ( rule__CMP__Group__0 ) )
            {
            // InternalMiniARM.g:767:2: ( ( rule__CMP__Group__0 ) )
            // InternalMiniARM.g:768:3: ( rule__CMP__Group__0 )
            {
             before(grammarAccess.getCMPAccess().getGroup()); 
            // InternalMiniARM.g:769:3: ( rule__CMP__Group__0 )
            // InternalMiniARM.g:769:4: rule__CMP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CMP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCMPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCMP"


    // $ANTLR start "entryRuleBEQ"
    // InternalMiniARM.g:778:1: entryRuleBEQ : ruleBEQ EOF ;
    public final void entryRuleBEQ() throws RecognitionException {
        try {
            // InternalMiniARM.g:779:1: ( ruleBEQ EOF )
            // InternalMiniARM.g:780:1: ruleBEQ EOF
            {
             before(grammarAccess.getBEQRule()); 
            pushFollow(FOLLOW_1);
            ruleBEQ();

            state._fsp--;

             after(grammarAccess.getBEQRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBEQ"


    // $ANTLR start "ruleBEQ"
    // InternalMiniARM.g:787:1: ruleBEQ : ( ( rule__BEQ__Group__0 ) ) ;
    public final void ruleBEQ() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:791:2: ( ( ( rule__BEQ__Group__0 ) ) )
            // InternalMiniARM.g:792:2: ( ( rule__BEQ__Group__0 ) )
            {
            // InternalMiniARM.g:792:2: ( ( rule__BEQ__Group__0 ) )
            // InternalMiniARM.g:793:3: ( rule__BEQ__Group__0 )
            {
             before(grammarAccess.getBEQAccess().getGroup()); 
            // InternalMiniARM.g:794:3: ( rule__BEQ__Group__0 )
            // InternalMiniARM.g:794:4: rule__BEQ__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BEQ__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBEQAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBEQ"


    // $ANTLR start "entryRuleBranchAddress"
    // InternalMiniARM.g:803:1: entryRuleBranchAddress : ruleBranchAddress EOF ;
    public final void entryRuleBranchAddress() throws RecognitionException {
        try {
            // InternalMiniARM.g:804:1: ( ruleBranchAddress EOF )
            // InternalMiniARM.g:805:1: ruleBranchAddress EOF
            {
             before(grammarAccess.getBranchAddressRule()); 
            pushFollow(FOLLOW_1);
            ruleBranchAddress();

            state._fsp--;

             after(grammarAccess.getBranchAddressRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBranchAddress"


    // $ANTLR start "ruleBranchAddress"
    // InternalMiniARM.g:812:1: ruleBranchAddress : ( ( rule__BranchAddress__Alternatives ) ) ;
    public final void ruleBranchAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:816:2: ( ( ( rule__BranchAddress__Alternatives ) ) )
            // InternalMiniARM.g:817:2: ( ( rule__BranchAddress__Alternatives ) )
            {
            // InternalMiniARM.g:817:2: ( ( rule__BranchAddress__Alternatives ) )
            // InternalMiniARM.g:818:3: ( rule__BranchAddress__Alternatives )
            {
             before(grammarAccess.getBranchAddressAccess().getAlternatives()); 
            // InternalMiniARM.g:819:3: ( rule__BranchAddress__Alternatives )
            // InternalMiniARM.g:819:4: rule__BranchAddress__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BranchAddress__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBranchAddressAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBranchAddress"


    // $ANTLR start "entryRuleBLT"
    // InternalMiniARM.g:828:1: entryRuleBLT : ruleBLT EOF ;
    public final void entryRuleBLT() throws RecognitionException {
        try {
            // InternalMiniARM.g:829:1: ( ruleBLT EOF )
            // InternalMiniARM.g:830:1: ruleBLT EOF
            {
             before(grammarAccess.getBLTRule()); 
            pushFollow(FOLLOW_1);
            ruleBLT();

            state._fsp--;

             after(grammarAccess.getBLTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBLT"


    // $ANTLR start "ruleBLT"
    // InternalMiniARM.g:837:1: ruleBLT : ( ( rule__BLT__Group__0 ) ) ;
    public final void ruleBLT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:841:2: ( ( ( rule__BLT__Group__0 ) ) )
            // InternalMiniARM.g:842:2: ( ( rule__BLT__Group__0 ) )
            {
            // InternalMiniARM.g:842:2: ( ( rule__BLT__Group__0 ) )
            // InternalMiniARM.g:843:3: ( rule__BLT__Group__0 )
            {
             before(grammarAccess.getBLTAccess().getGroup()); 
            // InternalMiniARM.g:844:3: ( rule__BLT__Group__0 )
            // InternalMiniARM.g:844:4: rule__BLT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BLT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBLTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBLT"


    // $ANTLR start "entryRuleBRANCH"
    // InternalMiniARM.g:853:1: entryRuleBRANCH : ruleBRANCH EOF ;
    public final void entryRuleBRANCH() throws RecognitionException {
        try {
            // InternalMiniARM.g:854:1: ( ruleBRANCH EOF )
            // InternalMiniARM.g:855:1: ruleBRANCH EOF
            {
             before(grammarAccess.getBRANCHRule()); 
            pushFollow(FOLLOW_1);
            ruleBRANCH();

            state._fsp--;

             after(grammarAccess.getBRANCHRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBRANCH"


    // $ANTLR start "ruleBRANCH"
    // InternalMiniARM.g:862:1: ruleBRANCH : ( ( rule__BRANCH__Group__0 ) ) ;
    public final void ruleBRANCH() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:866:2: ( ( ( rule__BRANCH__Group__0 ) ) )
            // InternalMiniARM.g:867:2: ( ( rule__BRANCH__Group__0 ) )
            {
            // InternalMiniARM.g:867:2: ( ( rule__BRANCH__Group__0 ) )
            // InternalMiniARM.g:868:3: ( rule__BRANCH__Group__0 )
            {
             before(grammarAccess.getBRANCHAccess().getGroup()); 
            // InternalMiniARM.g:869:3: ( rule__BRANCH__Group__0 )
            // InternalMiniARM.g:869:4: rule__BRANCH__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BRANCH__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBRANCHAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBRANCH"


    // $ANTLR start "entryRuleBLINK"
    // InternalMiniARM.g:878:1: entryRuleBLINK : ruleBLINK EOF ;
    public final void entryRuleBLINK() throws RecognitionException {
        try {
            // InternalMiniARM.g:879:1: ( ruleBLINK EOF )
            // InternalMiniARM.g:880:1: ruleBLINK EOF
            {
             before(grammarAccess.getBLINKRule()); 
            pushFollow(FOLLOW_1);
            ruleBLINK();

            state._fsp--;

             after(grammarAccess.getBLINKRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBLINK"


    // $ANTLR start "ruleBLINK"
    // InternalMiniARM.g:887:1: ruleBLINK : ( ( rule__BLINK__Group__0 ) ) ;
    public final void ruleBLINK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:891:2: ( ( ( rule__BLINK__Group__0 ) ) )
            // InternalMiniARM.g:892:2: ( ( rule__BLINK__Group__0 ) )
            {
            // InternalMiniARM.g:892:2: ( ( rule__BLINK__Group__0 ) )
            // InternalMiniARM.g:893:3: ( rule__BLINK__Group__0 )
            {
             before(grammarAccess.getBLINKAccess().getGroup()); 
            // InternalMiniARM.g:894:3: ( rule__BLINK__Group__0 )
            // InternalMiniARM.g:894:4: rule__BLINK__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BLINK__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBLINKAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBLINK"


    // $ANTLR start "rule__Line__Alternatives"
    // InternalMiniARM.g:902:1: rule__Line__Alternatives : ( ( ruleInclude ) | ( ( rule__Line__Group_1__0 ) ) );
    public final void rule__Line__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:906:1: ( ( ruleInclude ) | ( ( rule__Line__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_NL && LA2_0<=RULE_SL_COMMENT)||(LA2_0>=13 && LA2_0<=18)||(LA2_0>=23 && LA2_0<=31)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMiniARM.g:907:2: ( ruleInclude )
                    {
                    // InternalMiniARM.g:907:2: ( ruleInclude )
                    // InternalMiniARM.g:908:3: ruleInclude
                    {
                     before(grammarAccess.getLineAccess().getIncludeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInclude();

                    state._fsp--;

                     after(grammarAccess.getLineAccess().getIncludeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniARM.g:913:2: ( ( rule__Line__Group_1__0 ) )
                    {
                    // InternalMiniARM.g:913:2: ( ( rule__Line__Group_1__0 ) )
                    // InternalMiniARM.g:914:3: ( rule__Line__Group_1__0 )
                    {
                     before(grammarAccess.getLineAccess().getGroup_1()); 
                    // InternalMiniARM.g:915:3: ( rule__Line__Group_1__0 )
                    // InternalMiniARM.g:915:4: rule__Line__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLineAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Alternatives"


    // $ANTLR start "rule__Line__Alternatives_1_3"
    // InternalMiniARM.g:923:1: rule__Line__Alternatives_1_3 : ( ( RULE_NL ) | ( ( rule__Line__CommentAssignment_1_3_1 ) ) );
    public final void rule__Line__Alternatives_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:927:1: ( ( RULE_NL ) | ( ( rule__Line__CommentAssignment_1_3_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NL) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_SL_COMMENT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMiniARM.g:928:2: ( RULE_NL )
                    {
                    // InternalMiniARM.g:928:2: ( RULE_NL )
                    // InternalMiniARM.g:929:3: RULE_NL
                    {
                     before(grammarAccess.getLineAccess().getNLTerminalRuleCall_1_3_0()); 
                    match(input,RULE_NL,FOLLOW_2); 
                     after(grammarAccess.getLineAccess().getNLTerminalRuleCall_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniARM.g:934:2: ( ( rule__Line__CommentAssignment_1_3_1 ) )
                    {
                    // InternalMiniARM.g:934:2: ( ( rule__Line__CommentAssignment_1_3_1 ) )
                    // InternalMiniARM.g:935:3: ( rule__Line__CommentAssignment_1_3_1 )
                    {
                     before(grammarAccess.getLineAccess().getCommentAssignment_1_3_1()); 
                    // InternalMiniARM.g:936:3: ( rule__Line__CommentAssignment_1_3_1 )
                    // InternalMiniARM.g:936:4: rule__Line__CommentAssignment_1_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__CommentAssignment_1_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLineAccess().getCommentAssignment_1_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Alternatives_1_3"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalMiniARM.g:944:1: rule__Instruction__Alternatives : ( ( ruleAssemblyInst ) | ( rulePseudoInst ) | ( ruleRealInst ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:948:1: ( ( ruleAssemblyInst ) | ( rulePseudoInst ) | ( ruleRealInst ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMiniARM.g:949:2: ( ruleAssemblyInst )
                    {
                    // InternalMiniARM.g:949:2: ( ruleAssemblyInst )
                    // InternalMiniARM.g:950:3: ruleAssemblyInst
                    {
                     before(grammarAccess.getInstructionAccess().getAssemblyInstParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssemblyInst();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getAssemblyInstParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniARM.g:955:2: ( rulePseudoInst )
                    {
                    // InternalMiniARM.g:955:2: ( rulePseudoInst )
                    // InternalMiniARM.g:956:3: rulePseudoInst
                    {
                     before(grammarAccess.getInstructionAccess().getPseudoInstParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePseudoInst();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getPseudoInstParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniARM.g:961:2: ( ruleRealInst )
                    {
                    // InternalMiniARM.g:961:2: ( ruleRealInst )
                    // InternalMiniARM.g:962:3: ruleRealInst
                    {
                     before(grammarAccess.getInstructionAccess().getRealInstParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRealInst();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getRealInstParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__AssemblyInst__Alternatives"
    // InternalMiniARM.g:971:1: rule__AssemblyInst__Alternatives : ( ( ruleRMW ) | ( ruleSMW ) | ( ruleSMS ) );
    public final void rule__AssemblyInst__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:975:1: ( ( ruleRMW ) | ( ruleSMW ) | ( ruleSMS ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_STRING) ) {
                    alt5=3;
                }
                else if ( (LA5_2==RULE_INT) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiniARM.g:976:2: ( ruleRMW )
                    {
                    // InternalMiniARM.g:976:2: ( ruleRMW )
                    // InternalMiniARM.g:977:3: ruleRMW
                    {
                     before(grammarAccess.getAssemblyInstAccess().getRMWParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRMW();

                    state._fsp--;

                     after(grammarAccess.getAssemblyInstAccess().getRMWParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniARM.g:982:2: ( ruleSMW )
                    {
                    // InternalMiniARM.g:982:2: ( ruleSMW )
                    // InternalMiniARM.g:983:3: ruleSMW
                    {
                     before(grammarAccess.getAssemblyInstAccess().getSMWParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSMW();

                    state._fsp--;

                     after(grammarAccess.getAssemblyInstAccess().getSMWParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniARM.g:988:2: ( ruleSMS )
                    {
                    // InternalMiniARM.g:988:2: ( ruleSMS )
                    // InternalMiniARM.g:989:3: ruleSMS
                    {
                     before(grammarAccess.getAssemblyInstAccess().getSMSParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSMS();

                    state._fsp--;

                     after(grammarAccess.getAssemblyInstAccess().getSMSParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyInst__Alternatives"


    // $ANTLR start "rule__PseudoInst__Alternatives"
    // InternalMiniARM.g:998:1: rule__PseudoInst__Alternatives : ( ( rulePUSH ) | ( rulePOP ) );
    public final void rule__PseudoInst__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1002:1: ( ( rulePUSH ) | ( rulePOP ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMiniARM.g:1003:2: ( rulePUSH )
                    {
                    // InternalMiniARM.g:1003:2: ( rulePUSH )
                    // InternalMiniARM.g:1004:3: rulePUSH
                    {
                     before(grammarAccess.getPseudoInstAccess().getPUSHParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePUSH();

                    state._fsp--;

                     after(grammarAccess.getPseudoInstAccess().getPUSHParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniARM.g:1009:2: ( rulePOP )
                    {
                    // InternalMiniARM.g:1009:2: ( rulePOP )
                    // InternalMiniARM.g:1010:3: rulePOP
                    {
                     before(grammarAccess.getPseudoInstAccess().getPOPParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePOP();

                    state._fsp--;

                     after(grammarAccess.getPseudoInstAccess().getPOPParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoInst__Alternatives"


    // $ANTLR start "rule__RealInst__Alternatives"
    // InternalMiniARM.g:1019:1: rule__RealInst__Alternatives : ( ( ruleLOAD ) | ( ruleSTORE ) | ( ruleMOVE ) | ( ruleADD ) | ( ruleSUB ) | ( ruleCMP ) | ( ruleBEQ ) | ( ruleBLT ) | ( ruleBRANCH ) | ( ruleBLINK ) );
    public final void rule__RealInst__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1023:1: ( ( ruleLOAD ) | ( ruleSTORE ) | ( ruleMOVE ) | ( ruleADD ) | ( ruleSUB ) | ( ruleCMP ) | ( ruleBEQ ) | ( ruleBLT ) | ( ruleBRANCH ) | ( ruleBLINK ) )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            case 26:
                {
                alt7=5;
                }
                break;
            case 27:
                {
                alt7=6;
                }
                break;
            case 28:
                {
                alt7=7;
                }
                break;
            case 29:
                {
                alt7=8;
                }
                break;
            case 30:
                {
                alt7=9;
                }
                break;
            case 31:
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMiniARM.g:1024:2: ( ruleLOAD )
                    {
                    // InternalMiniARM.g:1024:2: ( ruleLOAD )
                    // InternalMiniARM.g:1025:3: ruleLOAD
                    {
                     before(grammarAccess.getRealInstAccess().getLOADParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLOAD();

                    state._fsp--;

                     after(grammarAccess.getRealInstAccess().getLOADParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniARM.g:1030:2: ( ruleSTORE )
                    {
                    // InternalMiniARM.g:1030:2: ( ruleSTORE )
                    // InternalMiniARM.g:1031:3: ruleSTORE
                    {
                     before(grammarAccess.getRealInstAccess().getSTOREParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSTORE();

                    state._fsp--;

                     after(grammarAccess.getRealInstAccess().getSTOREParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniARM.g:1036:2: ( ruleMOVE )
                    {
                    // InternalMiniARM.g:1036:2: ( ruleMOVE )
                    // InternalMiniARM.g:1037:3: ruleMOVE
                    {
                     before(grammarAccess.getRealInstAccess().getMOVEParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMOVE();

                    state._fsp--;

                     after(grammarAccess.getRealInstAccess().getMOVEParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniARM.g:1042:2: ( ruleADD )
                    {
                    // InternalMiniARM.g:1042:2: ( ruleADD )
                    // InternalMiniARM.g:1043:3: ruleADD
                    {
                     before(grammarAccess.getRealInstAccess().getADDParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleADD();

                    state._fsp--;

                     after(grammarAccess.getRealInstAccess().getADDParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniARM.g:1048:2: ( ruleSUB )
                    {
                    // InternalMiniARM.g:1048:2: ( ruleSUB )
                    // InternalMiniARM.g:1049:3: ruleSUB
                    {
                     before(grammarAccess.getRealInstAccess().getSUBParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSUB();

                    state._fsp--;

                     after(grammarAccess.getRealInstAccess().getSUBParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniARM.g:1054:2: ( ruleCMP )
                    {
                    // InternalMiniARM.g:1054:2: ( ruleCMP )
                    // InternalMiniARM.g:1055:3: ruleCMP
                    {
                     before(grammarAccess.getRealInstAccess().getCMPParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCMP();

                    state._fsp--;

                     after(grammarAccess.getRealInstAccess().getCMPParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniARM.g:1060:2: ( ruleBEQ )
                    {
                    // InternalMiniARM.g:1060:2: ( ruleBEQ )
                    // InternalMiniARM.g:1061:3: ruleBEQ
                    {
                     before(grammarAccess.getRealInstAccess().getBEQParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleBEQ();

                    state._fsp--;

                     after(grammarAccess.getRealInstAccess().getBEQParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMiniARM.g:1066:2: ( ruleBLT )
                    {
                    // InternalMiniARM.g:1066:2: ( ruleBLT )
                    // InternalMiniARM.g:1067:3: ruleBLT
                    {
                     before(grammarAccess.getRealInstAccess().getBLTParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleBLT();

                    state._fsp--;

                     after(grammarAccess.getRealInstAccess().getBLTParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMiniARM.g:1072:2: ( ruleBRANCH )
                    {
                    // InternalMiniARM.g:1072:2: ( ruleBRANCH )
                    // InternalMiniARM.g:1073:3: ruleBRANCH
                    {
                     before(grammarAccess.getRealInstAccess().getBRANCHParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleBRANCH();

                    state._fsp--;

                     after(grammarAccess.getRealInstAccess().getBRANCHParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMiniARM.g:1078:2: ( ruleBLINK )
                    {
                    // InternalMiniARM.g:1078:2: ( ruleBLINK )
                    // InternalMiniARM.g:1079:3: ruleBLINK
                    {
                     before(grammarAccess.getRealInstAccess().getBLINKParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleBLINK();

                    state._fsp--;

                     after(grammarAccess.getRealInstAccess().getBLINKParserRuleCall_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealInst__Alternatives"


    // $ANTLR start "rule__Register__Alternatives"
    // InternalMiniARM.g:1088:1: rule__Register__Alternatives : ( ( ( rule__Register__NameAssignment_0 ) ) | ( ( rule__Register__NameAssignment_1 ) ) | ( ( rule__Register__NameAssignment_2 ) ) | ( ( rule__Register__NameAssignment_3 ) ) | ( ( rule__Register__NameAssignment_4 ) ) | ( ( rule__Register__NameAssignment_5 ) ) | ( ( rule__Register__NameAssignment_6 ) ) | ( ( rule__Register__NameAssignment_7 ) ) | ( ( rule__Register__NameAssignment_8 ) ) | ( ( rule__Register__NameAssignment_9 ) ) );
    public final void rule__Register__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1092:1: ( ( ( rule__Register__NameAssignment_0 ) ) | ( ( rule__Register__NameAssignment_1 ) ) | ( ( rule__Register__NameAssignment_2 ) ) | ( ( rule__Register__NameAssignment_3 ) ) | ( ( rule__Register__NameAssignment_4 ) ) | ( ( rule__Register__NameAssignment_5 ) ) | ( ( rule__Register__NameAssignment_6 ) ) | ( ( rule__Register__NameAssignment_7 ) ) | ( ( rule__Register__NameAssignment_8 ) ) | ( ( rule__Register__NameAssignment_9 ) ) )
            int alt8=10;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            case 35:
                {
                alt8=4;
                }
                break;
            case 36:
                {
                alt8=5;
                }
                break;
            case 37:
                {
                alt8=6;
                }
                break;
            case 38:
                {
                alt8=7;
                }
                break;
            case 39:
                {
                alt8=8;
                }
                break;
            case 40:
                {
                alt8=9;
                }
                break;
            case 41:
                {
                alt8=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMiniARM.g:1093:2: ( ( rule__Register__NameAssignment_0 ) )
                    {
                    // InternalMiniARM.g:1093:2: ( ( rule__Register__NameAssignment_0 ) )
                    // InternalMiniARM.g:1094:3: ( rule__Register__NameAssignment_0 )
                    {
                     before(grammarAccess.getRegisterAccess().getNameAssignment_0()); 
                    // InternalMiniARM.g:1095:3: ( rule__Register__NameAssignment_0 )
                    // InternalMiniARM.g:1095:4: rule__Register__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Register__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegisterAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniARM.g:1099:2: ( ( rule__Register__NameAssignment_1 ) )
                    {
                    // InternalMiniARM.g:1099:2: ( ( rule__Register__NameAssignment_1 ) )
                    // InternalMiniARM.g:1100:3: ( rule__Register__NameAssignment_1 )
                    {
                     before(grammarAccess.getRegisterAccess().getNameAssignment_1()); 
                    // InternalMiniARM.g:1101:3: ( rule__Register__NameAssignment_1 )
                    // InternalMiniARM.g:1101:4: rule__Register__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Register__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegisterAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniARM.g:1105:2: ( ( rule__Register__NameAssignment_2 ) )
                    {
                    // InternalMiniARM.g:1105:2: ( ( rule__Register__NameAssignment_2 ) )
                    // InternalMiniARM.g:1106:3: ( rule__Register__NameAssignment_2 )
                    {
                     before(grammarAccess.getRegisterAccess().getNameAssignment_2()); 
                    // InternalMiniARM.g:1107:3: ( rule__Register__NameAssignment_2 )
                    // InternalMiniARM.g:1107:4: rule__Register__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Register__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegisterAccess().getNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniARM.g:1111:2: ( ( rule__Register__NameAssignment_3 ) )
                    {
                    // InternalMiniARM.g:1111:2: ( ( rule__Register__NameAssignment_3 ) )
                    // InternalMiniARM.g:1112:3: ( rule__Register__NameAssignment_3 )
                    {
                     before(grammarAccess.getRegisterAccess().getNameAssignment_3()); 
                    // InternalMiniARM.g:1113:3: ( rule__Register__NameAssignment_3 )
                    // InternalMiniARM.g:1113:4: rule__Register__NameAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Register__NameAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegisterAccess().getNameAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniARM.g:1117:2: ( ( rule__Register__NameAssignment_4 ) )
                    {
                    // InternalMiniARM.g:1117:2: ( ( rule__Register__NameAssignment_4 ) )
                    // InternalMiniARM.g:1118:3: ( rule__Register__NameAssignment_4 )
                    {
                     before(grammarAccess.getRegisterAccess().getNameAssignment_4()); 
                    // InternalMiniARM.g:1119:3: ( rule__Register__NameAssignment_4 )
                    // InternalMiniARM.g:1119:4: rule__Register__NameAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Register__NameAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegisterAccess().getNameAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniARM.g:1123:2: ( ( rule__Register__NameAssignment_5 ) )
                    {
                    // InternalMiniARM.g:1123:2: ( ( rule__Register__NameAssignment_5 ) )
                    // InternalMiniARM.g:1124:3: ( rule__Register__NameAssignment_5 )
                    {
                     before(grammarAccess.getRegisterAccess().getNameAssignment_5()); 
                    // InternalMiniARM.g:1125:3: ( rule__Register__NameAssignment_5 )
                    // InternalMiniARM.g:1125:4: rule__Register__NameAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Register__NameAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegisterAccess().getNameAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniARM.g:1129:2: ( ( rule__Register__NameAssignment_6 ) )
                    {
                    // InternalMiniARM.g:1129:2: ( ( rule__Register__NameAssignment_6 ) )
                    // InternalMiniARM.g:1130:3: ( rule__Register__NameAssignment_6 )
                    {
                     before(grammarAccess.getRegisterAccess().getNameAssignment_6()); 
                    // InternalMiniARM.g:1131:3: ( rule__Register__NameAssignment_6 )
                    // InternalMiniARM.g:1131:4: rule__Register__NameAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Register__NameAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegisterAccess().getNameAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMiniARM.g:1135:2: ( ( rule__Register__NameAssignment_7 ) )
                    {
                    // InternalMiniARM.g:1135:2: ( ( rule__Register__NameAssignment_7 ) )
                    // InternalMiniARM.g:1136:3: ( rule__Register__NameAssignment_7 )
                    {
                     before(grammarAccess.getRegisterAccess().getNameAssignment_7()); 
                    // InternalMiniARM.g:1137:3: ( rule__Register__NameAssignment_7 )
                    // InternalMiniARM.g:1137:4: rule__Register__NameAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Register__NameAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegisterAccess().getNameAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMiniARM.g:1141:2: ( ( rule__Register__NameAssignment_8 ) )
                    {
                    // InternalMiniARM.g:1141:2: ( ( rule__Register__NameAssignment_8 ) )
                    // InternalMiniARM.g:1142:3: ( rule__Register__NameAssignment_8 )
                    {
                     before(grammarAccess.getRegisterAccess().getNameAssignment_8()); 
                    // InternalMiniARM.g:1143:3: ( rule__Register__NameAssignment_8 )
                    // InternalMiniARM.g:1143:4: rule__Register__NameAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Register__NameAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegisterAccess().getNameAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMiniARM.g:1147:2: ( ( rule__Register__NameAssignment_9 ) )
                    {
                    // InternalMiniARM.g:1147:2: ( ( rule__Register__NameAssignment_9 ) )
                    // InternalMiniARM.g:1148:3: ( rule__Register__NameAssignment_9 )
                    {
                     before(grammarAccess.getRegisterAccess().getNameAssignment_9()); 
                    // InternalMiniARM.g:1149:3: ( rule__Register__NameAssignment_9 )
                    // InternalMiniARM.g:1149:4: rule__Register__NameAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Register__NameAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegisterAccess().getNameAssignment_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalMiniARM.g:1157:1: rule__Value__Alternatives : ( ( ruleConst ) | ( ruleHexConst ) | ( ( rule__Value__LabelAssignment_2 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1161:1: ( ( ruleConst ) | ( ruleHexConst ) | ( ( rule__Value__LabelAssignment_2 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_HEXINT:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMiniARM.g:1162:2: ( ruleConst )
                    {
                    // InternalMiniARM.g:1162:2: ( ruleConst )
                    // InternalMiniARM.g:1163:3: ruleConst
                    {
                     before(grammarAccess.getValueAccess().getConstParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConst();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getConstParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniARM.g:1168:2: ( ruleHexConst )
                    {
                    // InternalMiniARM.g:1168:2: ( ruleHexConst )
                    // InternalMiniARM.g:1169:3: ruleHexConst
                    {
                     before(grammarAccess.getValueAccess().getHexConstParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHexConst();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getHexConstParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniARM.g:1174:2: ( ( rule__Value__LabelAssignment_2 ) )
                    {
                    // InternalMiniARM.g:1174:2: ( ( rule__Value__LabelAssignment_2 ) )
                    // InternalMiniARM.g:1175:3: ( rule__Value__LabelAssignment_2 )
                    {
                     before(grammarAccess.getValueAccess().getLabelAssignment_2()); 
                    // InternalMiniARM.g:1176:3: ( rule__Value__LabelAssignment_2 )
                    // InternalMiniARM.g:1176:4: rule__Value__LabelAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__LabelAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getLabelAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Address__Alternatives"
    // InternalMiniARM.g:1184:1: rule__Address__Alternatives : ( ( ruleDirect ) | ( ruleDirectReg ) );
    public final void rule__Address__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1188:1: ( ( ruleDirect ) | ( ruleDirectReg ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_HEXINT)) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMiniARM.g:1189:2: ( ruleDirect )
                    {
                    // InternalMiniARM.g:1189:2: ( ruleDirect )
                    // InternalMiniARM.g:1190:3: ruleDirect
                    {
                     before(grammarAccess.getAddressAccess().getDirectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDirect();

                    state._fsp--;

                     after(grammarAccess.getAddressAccess().getDirectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniARM.g:1195:2: ( ruleDirectReg )
                    {
                    // InternalMiniARM.g:1195:2: ( ruleDirectReg )
                    // InternalMiniARM.g:1196:3: ruleDirectReg
                    {
                     before(grammarAccess.getAddressAccess().getDirectRegParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectReg();

                    state._fsp--;

                     after(grammarAccess.getAddressAccess().getDirectRegParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Alternatives"


    // $ANTLR start "rule__MoveValue__Alternatives"
    // InternalMiniARM.g:1205:1: rule__MoveValue__Alternatives : ( ( ruleImmediate ) | ( ruleRegister ) );
    public final void rule__MoveValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1209:1: ( ( ruleImmediate ) | ( ruleRegister ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=32 && LA11_0<=41)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMiniARM.g:1210:2: ( ruleImmediate )
                    {
                    // InternalMiniARM.g:1210:2: ( ruleImmediate )
                    // InternalMiniARM.g:1211:3: ruleImmediate
                    {
                     before(grammarAccess.getMoveValueAccess().getImmediateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImmediate();

                    state._fsp--;

                     after(grammarAccess.getMoveValueAccess().getImmediateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniARM.g:1216:2: ( ruleRegister )
                    {
                    // InternalMiniARM.g:1216:2: ( ruleRegister )
                    // InternalMiniARM.g:1217:3: ruleRegister
                    {
                     before(grammarAccess.getMoveValueAccess().getRegisterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRegister();

                    state._fsp--;

                     after(grammarAccess.getMoveValueAccess().getRegisterParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveValue__Alternatives"


    // $ANTLR start "rule__BranchAddress__Alternatives"
    // InternalMiniARM.g:1226:1: rule__BranchAddress__Alternatives : ( ( ruleValue ) | ( ruleRegister ) );
    public final void rule__BranchAddress__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1230:1: ( ( ruleValue ) | ( ruleRegister ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_HEXINT)) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=32 && LA12_0<=41)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniARM.g:1231:2: ( ruleValue )
                    {
                    // InternalMiniARM.g:1231:2: ( ruleValue )
                    // InternalMiniARM.g:1232:3: ruleValue
                    {
                     before(grammarAccess.getBranchAddressAccess().getValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getBranchAddressAccess().getValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniARM.g:1237:2: ( ruleRegister )
                    {
                    // InternalMiniARM.g:1237:2: ( ruleRegister )
                    // InternalMiniARM.g:1238:3: ruleRegister
                    {
                     before(grammarAccess.getBranchAddressAccess().getRegisterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRegister();

                    state._fsp--;

                     after(grammarAccess.getBranchAddressAccess().getRegisterParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BranchAddress__Alternatives"


    // $ANTLR start "rule__Line__Group_1__0"
    // InternalMiniARM.g:1247:1: rule__Line__Group_1__0 : rule__Line__Group_1__0__Impl rule__Line__Group_1__1 ;
    public final void rule__Line__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1251:1: ( rule__Line__Group_1__0__Impl rule__Line__Group_1__1 )
            // InternalMiniARM.g:1252:2: rule__Line__Group_1__0__Impl rule__Line__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Line__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_1__0"


    // $ANTLR start "rule__Line__Group_1__0__Impl"
    // InternalMiniARM.g:1259:1: rule__Line__Group_1__0__Impl : ( () ) ;
    public final void rule__Line__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1263:1: ( ( () ) )
            // InternalMiniARM.g:1264:1: ( () )
            {
            // InternalMiniARM.g:1264:1: ( () )
            // InternalMiniARM.g:1265:2: ()
            {
             before(grammarAccess.getLineAccess().getLineAction_1_0()); 
            // InternalMiniARM.g:1266:2: ()
            // InternalMiniARM.g:1266:3: 
            {
            }

             after(grammarAccess.getLineAccess().getLineAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_1__0__Impl"


    // $ANTLR start "rule__Line__Group_1__1"
    // InternalMiniARM.g:1274:1: rule__Line__Group_1__1 : rule__Line__Group_1__1__Impl rule__Line__Group_1__2 ;
    public final void rule__Line__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1278:1: ( rule__Line__Group_1__1__Impl rule__Line__Group_1__2 )
            // InternalMiniARM.g:1279:2: rule__Line__Group_1__1__Impl rule__Line__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Line__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_1__1"


    // $ANTLR start "rule__Line__Group_1__1__Impl"
    // InternalMiniARM.g:1286:1: rule__Line__Group_1__1__Impl : ( ( rule__Line__LabelDefAssignment_1_1 )? ) ;
    public final void rule__Line__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1290:1: ( ( ( rule__Line__LabelDefAssignment_1_1 )? ) )
            // InternalMiniARM.g:1291:1: ( ( rule__Line__LabelDefAssignment_1_1 )? )
            {
            // InternalMiniARM.g:1291:1: ( ( rule__Line__LabelDefAssignment_1_1 )? )
            // InternalMiniARM.g:1292:2: ( rule__Line__LabelDefAssignment_1_1 )?
            {
             before(grammarAccess.getLineAccess().getLabelDefAssignment_1_1()); 
            // InternalMiniARM.g:1293:2: ( rule__Line__LabelDefAssignment_1_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMiniARM.g:1293:3: rule__Line__LabelDefAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__LabelDefAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineAccess().getLabelDefAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_1__1__Impl"


    // $ANTLR start "rule__Line__Group_1__2"
    // InternalMiniARM.g:1301:1: rule__Line__Group_1__2 : rule__Line__Group_1__2__Impl rule__Line__Group_1__3 ;
    public final void rule__Line__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1305:1: ( rule__Line__Group_1__2__Impl rule__Line__Group_1__3 )
            // InternalMiniARM.g:1306:2: rule__Line__Group_1__2__Impl rule__Line__Group_1__3
            {
            pushFollow(FOLLOW_4);
            rule__Line__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_1__2"


    // $ANTLR start "rule__Line__Group_1__2__Impl"
    // InternalMiniARM.g:1313:1: rule__Line__Group_1__2__Impl : ( ( rule__Line__InstAssignment_1_2 )? ) ;
    public final void rule__Line__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1317:1: ( ( ( rule__Line__InstAssignment_1_2 )? ) )
            // InternalMiniARM.g:1318:1: ( ( rule__Line__InstAssignment_1_2 )? )
            {
            // InternalMiniARM.g:1318:1: ( ( rule__Line__InstAssignment_1_2 )? )
            // InternalMiniARM.g:1319:2: ( rule__Line__InstAssignment_1_2 )?
            {
             before(grammarAccess.getLineAccess().getInstAssignment_1_2()); 
            // InternalMiniARM.g:1320:2: ( rule__Line__InstAssignment_1_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=14 && LA14_0<=18)||(LA14_0>=23 && LA14_0<=31)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMiniARM.g:1320:3: rule__Line__InstAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__InstAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineAccess().getInstAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_1__2__Impl"


    // $ANTLR start "rule__Line__Group_1__3"
    // InternalMiniARM.g:1328:1: rule__Line__Group_1__3 : rule__Line__Group_1__3__Impl ;
    public final void rule__Line__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1332:1: ( rule__Line__Group_1__3__Impl )
            // InternalMiniARM.g:1333:2: rule__Line__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_1__3"


    // $ANTLR start "rule__Line__Group_1__3__Impl"
    // InternalMiniARM.g:1339:1: rule__Line__Group_1__3__Impl : ( ( rule__Line__Alternatives_1_3 ) ) ;
    public final void rule__Line__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1343:1: ( ( ( rule__Line__Alternatives_1_3 ) ) )
            // InternalMiniARM.g:1344:1: ( ( rule__Line__Alternatives_1_3 ) )
            {
            // InternalMiniARM.g:1344:1: ( ( rule__Line__Alternatives_1_3 ) )
            // InternalMiniARM.g:1345:2: ( rule__Line__Alternatives_1_3 )
            {
             before(grammarAccess.getLineAccess().getAlternatives_1_3()); 
            // InternalMiniARM.g:1346:2: ( rule__Line__Alternatives_1_3 )
            // InternalMiniARM.g:1346:3: rule__Line__Alternatives_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Line__Alternatives_1_3();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getAlternatives_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_1__3__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // InternalMiniARM.g:1355:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1359:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // InternalMiniARM.g:1360:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // InternalMiniARM.g:1367:1: rule__Include__Group__0__Impl : ( 'include' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1371:1: ( ( 'include' ) )
            // InternalMiniARM.g:1372:1: ( 'include' )
            {
            // InternalMiniARM.g:1372:1: ( 'include' )
            // InternalMiniARM.g:1373:2: 'include'
            {
             before(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // InternalMiniARM.g:1382:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1386:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // InternalMiniARM.g:1387:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // InternalMiniARM.g:1394:1: rule__Include__Group__1__Impl : ( ( rule__Include__FileNameAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1398:1: ( ( ( rule__Include__FileNameAssignment_1 ) ) )
            // InternalMiniARM.g:1399:1: ( ( rule__Include__FileNameAssignment_1 ) )
            {
            // InternalMiniARM.g:1399:1: ( ( rule__Include__FileNameAssignment_1 ) )
            // InternalMiniARM.g:1400:2: ( rule__Include__FileNameAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getFileNameAssignment_1()); 
            // InternalMiniARM.g:1401:2: ( rule__Include__FileNameAssignment_1 )
            // InternalMiniARM.g:1401:3: rule__Include__FileNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Include__FileNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getFileNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__2"
    // InternalMiniARM.g:1409:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1413:1: ( rule__Include__Group__2__Impl )
            // InternalMiniARM.g:1414:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2"


    // $ANTLR start "rule__Include__Group__2__Impl"
    // InternalMiniARM.g:1420:1: rule__Include__Group__2__Impl : ( RULE_NL ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1424:1: ( ( RULE_NL ) )
            // InternalMiniARM.g:1425:1: ( RULE_NL )
            {
            // InternalMiniARM.g:1425:1: ( RULE_NL )
            // InternalMiniARM.g:1426:2: RULE_NL
            {
             before(grammarAccess.getIncludeAccess().getNLTerminalRuleCall_2()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getNLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2__Impl"


    // $ANTLR start "rule__LabelDef__Group__0"
    // InternalMiniARM.g:1436:1: rule__LabelDef__Group__0 : rule__LabelDef__Group__0__Impl rule__LabelDef__Group__1 ;
    public final void rule__LabelDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1440:1: ( rule__LabelDef__Group__0__Impl rule__LabelDef__Group__1 )
            // InternalMiniARM.g:1441:2: rule__LabelDef__Group__0__Impl rule__LabelDef__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LabelDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LabelDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDef__Group__0"


    // $ANTLR start "rule__LabelDef__Group__0__Impl"
    // InternalMiniARM.g:1448:1: rule__LabelDef__Group__0__Impl : ( '@' ) ;
    public final void rule__LabelDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1452:1: ( ( '@' ) )
            // InternalMiniARM.g:1453:1: ( '@' )
            {
            // InternalMiniARM.g:1453:1: ( '@' )
            // InternalMiniARM.g:1454:2: '@'
            {
             before(grammarAccess.getLabelDefAccess().getCommercialAtKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLabelDefAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDef__Group__0__Impl"


    // $ANTLR start "rule__LabelDef__Group__1"
    // InternalMiniARM.g:1463:1: rule__LabelDef__Group__1 : rule__LabelDef__Group__1__Impl ;
    public final void rule__LabelDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1467:1: ( rule__LabelDef__Group__1__Impl )
            // InternalMiniARM.g:1468:2: rule__LabelDef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LabelDef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDef__Group__1"


    // $ANTLR start "rule__LabelDef__Group__1__Impl"
    // InternalMiniARM.g:1474:1: rule__LabelDef__Group__1__Impl : ( ( rule__LabelDef__LabelAssignment_1 ) ) ;
    public final void rule__LabelDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1478:1: ( ( ( rule__LabelDef__LabelAssignment_1 ) ) )
            // InternalMiniARM.g:1479:1: ( ( rule__LabelDef__LabelAssignment_1 ) )
            {
            // InternalMiniARM.g:1479:1: ( ( rule__LabelDef__LabelAssignment_1 ) )
            // InternalMiniARM.g:1480:2: ( rule__LabelDef__LabelAssignment_1 )
            {
             before(grammarAccess.getLabelDefAccess().getLabelAssignment_1()); 
            // InternalMiniARM.g:1481:2: ( rule__LabelDef__LabelAssignment_1 )
            // InternalMiniARM.g:1481:3: rule__LabelDef__LabelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LabelDef__LabelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelDefAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDef__Group__1__Impl"


    // $ANTLR start "rule__RMW__Group__0"
    // InternalMiniARM.g:1490:1: rule__RMW__Group__0 : rule__RMW__Group__0__Impl rule__RMW__Group__1 ;
    public final void rule__RMW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1494:1: ( rule__RMW__Group__0__Impl rule__RMW__Group__1 )
            // InternalMiniARM.g:1495:2: rule__RMW__Group__0__Impl rule__RMW__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RMW__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RMW__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMW__Group__0"


    // $ANTLR start "rule__RMW__Group__0__Impl"
    // InternalMiniARM.g:1502:1: rule__RMW__Group__0__Impl : ( 'rmw' ) ;
    public final void rule__RMW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1506:1: ( ( 'rmw' ) )
            // InternalMiniARM.g:1507:1: ( 'rmw' )
            {
            // InternalMiniARM.g:1507:1: ( 'rmw' )
            // InternalMiniARM.g:1508:2: 'rmw'
            {
             before(grammarAccess.getRMWAccess().getRmwKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRMWAccess().getRmwKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMW__Group__0__Impl"


    // $ANTLR start "rule__RMW__Group__1"
    // InternalMiniARM.g:1517:1: rule__RMW__Group__1 : rule__RMW__Group__1__Impl ;
    public final void rule__RMW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1521:1: ( rule__RMW__Group__1__Impl )
            // InternalMiniARM.g:1522:2: rule__RMW__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RMW__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMW__Group__1"


    // $ANTLR start "rule__RMW__Group__1__Impl"
    // InternalMiniARM.g:1528:1: rule__RMW__Group__1__Impl : ( ( rule__RMW__SizeAssignment_1 ) ) ;
    public final void rule__RMW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1532:1: ( ( ( rule__RMW__SizeAssignment_1 ) ) )
            // InternalMiniARM.g:1533:1: ( ( rule__RMW__SizeAssignment_1 ) )
            {
            // InternalMiniARM.g:1533:1: ( ( rule__RMW__SizeAssignment_1 ) )
            // InternalMiniARM.g:1534:2: ( rule__RMW__SizeAssignment_1 )
            {
             before(grammarAccess.getRMWAccess().getSizeAssignment_1()); 
            // InternalMiniARM.g:1535:2: ( rule__RMW__SizeAssignment_1 )
            // InternalMiniARM.g:1535:3: rule__RMW__SizeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RMW__SizeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRMWAccess().getSizeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMW__Group__1__Impl"


    // $ANTLR start "rule__SMW__Group__0"
    // InternalMiniARM.g:1544:1: rule__SMW__Group__0 : rule__SMW__Group__0__Impl rule__SMW__Group__1 ;
    public final void rule__SMW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1548:1: ( rule__SMW__Group__0__Impl rule__SMW__Group__1 )
            // InternalMiniARM.g:1549:2: rule__SMW__Group__0__Impl rule__SMW__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SMW__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMW__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMW__Group__0"


    // $ANTLR start "rule__SMW__Group__0__Impl"
    // InternalMiniARM.g:1556:1: rule__SMW__Group__0__Impl : ( 'smw' ) ;
    public final void rule__SMW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1560:1: ( ( 'smw' ) )
            // InternalMiniARM.g:1561:1: ( 'smw' )
            {
            // InternalMiniARM.g:1561:1: ( 'smw' )
            // InternalMiniARM.g:1562:2: 'smw'
            {
             before(grammarAccess.getSMWAccess().getSmwKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSMWAccess().getSmwKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMW__Group__0__Impl"


    // $ANTLR start "rule__SMW__Group__1"
    // InternalMiniARM.g:1571:1: rule__SMW__Group__1 : rule__SMW__Group__1__Impl ;
    public final void rule__SMW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1575:1: ( rule__SMW__Group__1__Impl )
            // InternalMiniARM.g:1576:2: rule__SMW__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMW__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMW__Group__1"


    // $ANTLR start "rule__SMW__Group__1__Impl"
    // InternalMiniARM.g:1582:1: rule__SMW__Group__1__Impl : ( ( rule__SMW__ValueAssignment_1 ) ) ;
    public final void rule__SMW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1586:1: ( ( ( rule__SMW__ValueAssignment_1 ) ) )
            // InternalMiniARM.g:1587:1: ( ( rule__SMW__ValueAssignment_1 ) )
            {
            // InternalMiniARM.g:1587:1: ( ( rule__SMW__ValueAssignment_1 ) )
            // InternalMiniARM.g:1588:2: ( rule__SMW__ValueAssignment_1 )
            {
             before(grammarAccess.getSMWAccess().getValueAssignment_1()); 
            // InternalMiniARM.g:1589:2: ( rule__SMW__ValueAssignment_1 )
            // InternalMiniARM.g:1589:3: rule__SMW__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SMW__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSMWAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMW__Group__1__Impl"


    // $ANTLR start "rule__SMS__Group__0"
    // InternalMiniARM.g:1598:1: rule__SMS__Group__0 : rule__SMS__Group__0__Impl rule__SMS__Group__1 ;
    public final void rule__SMS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1602:1: ( rule__SMS__Group__0__Impl rule__SMS__Group__1 )
            // InternalMiniARM.g:1603:2: rule__SMS__Group__0__Impl rule__SMS__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SMS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMS__Group__0"


    // $ANTLR start "rule__SMS__Group__0__Impl"
    // InternalMiniARM.g:1610:1: rule__SMS__Group__0__Impl : ( 'smw' ) ;
    public final void rule__SMS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1614:1: ( ( 'smw' ) )
            // InternalMiniARM.g:1615:1: ( 'smw' )
            {
            // InternalMiniARM.g:1615:1: ( 'smw' )
            // InternalMiniARM.g:1616:2: 'smw'
            {
             before(grammarAccess.getSMSAccess().getSmwKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSMSAccess().getSmwKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMS__Group__0__Impl"


    // $ANTLR start "rule__SMS__Group__1"
    // InternalMiniARM.g:1625:1: rule__SMS__Group__1 : rule__SMS__Group__1__Impl ;
    public final void rule__SMS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1629:1: ( rule__SMS__Group__1__Impl )
            // InternalMiniARM.g:1630:2: rule__SMS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMS__Group__1"


    // $ANTLR start "rule__SMS__Group__1__Impl"
    // InternalMiniARM.g:1636:1: rule__SMS__Group__1__Impl : ( ( rule__SMS__ValueAssignment_1 ) ) ;
    public final void rule__SMS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1640:1: ( ( ( rule__SMS__ValueAssignment_1 ) ) )
            // InternalMiniARM.g:1641:1: ( ( rule__SMS__ValueAssignment_1 ) )
            {
            // InternalMiniARM.g:1641:1: ( ( rule__SMS__ValueAssignment_1 ) )
            // InternalMiniARM.g:1642:2: ( rule__SMS__ValueAssignment_1 )
            {
             before(grammarAccess.getSMSAccess().getValueAssignment_1()); 
            // InternalMiniARM.g:1643:2: ( rule__SMS__ValueAssignment_1 )
            // InternalMiniARM.g:1643:3: rule__SMS__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SMS__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSMSAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMS__Group__1__Impl"


    // $ANTLR start "rule__PUSH__Group__0"
    // InternalMiniARM.g:1652:1: rule__PUSH__Group__0 : rule__PUSH__Group__0__Impl rule__PUSH__Group__1 ;
    public final void rule__PUSH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1656:1: ( rule__PUSH__Group__0__Impl rule__PUSH__Group__1 )
            // InternalMiniARM.g:1657:2: rule__PUSH__Group__0__Impl rule__PUSH__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PUSH__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PUSH__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PUSH__Group__0"


    // $ANTLR start "rule__PUSH__Group__0__Impl"
    // InternalMiniARM.g:1664:1: rule__PUSH__Group__0__Impl : ( 'push' ) ;
    public final void rule__PUSH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1668:1: ( ( 'push' ) )
            // InternalMiniARM.g:1669:1: ( 'push' )
            {
            // InternalMiniARM.g:1669:1: ( 'push' )
            // InternalMiniARM.g:1670:2: 'push'
            {
             before(grammarAccess.getPUSHAccess().getPushKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPUSHAccess().getPushKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PUSH__Group__0__Impl"


    // $ANTLR start "rule__PUSH__Group__1"
    // InternalMiniARM.g:1679:1: rule__PUSH__Group__1 : rule__PUSH__Group__1__Impl ;
    public final void rule__PUSH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1683:1: ( rule__PUSH__Group__1__Impl )
            // InternalMiniARM.g:1684:2: rule__PUSH__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PUSH__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PUSH__Group__1"


    // $ANTLR start "rule__PUSH__Group__1__Impl"
    // InternalMiniARM.g:1690:1: rule__PUSH__Group__1__Impl : ( ( rule__PUSH__RegAssignment_1 ) ) ;
    public final void rule__PUSH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1694:1: ( ( ( rule__PUSH__RegAssignment_1 ) ) )
            // InternalMiniARM.g:1695:1: ( ( rule__PUSH__RegAssignment_1 ) )
            {
            // InternalMiniARM.g:1695:1: ( ( rule__PUSH__RegAssignment_1 ) )
            // InternalMiniARM.g:1696:2: ( rule__PUSH__RegAssignment_1 )
            {
             before(grammarAccess.getPUSHAccess().getRegAssignment_1()); 
            // InternalMiniARM.g:1697:2: ( rule__PUSH__RegAssignment_1 )
            // InternalMiniARM.g:1697:3: rule__PUSH__RegAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PUSH__RegAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPUSHAccess().getRegAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PUSH__Group__1__Impl"


    // $ANTLR start "rule__POP__Group__0"
    // InternalMiniARM.g:1706:1: rule__POP__Group__0 : rule__POP__Group__0__Impl rule__POP__Group__1 ;
    public final void rule__POP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1710:1: ( rule__POP__Group__0__Impl rule__POP__Group__1 )
            // InternalMiniARM.g:1711:2: rule__POP__Group__0__Impl rule__POP__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__POP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__POP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POP__Group__0"


    // $ANTLR start "rule__POP__Group__0__Impl"
    // InternalMiniARM.g:1718:1: rule__POP__Group__0__Impl : ( 'pop' ) ;
    public final void rule__POP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1722:1: ( ( 'pop' ) )
            // InternalMiniARM.g:1723:1: ( 'pop' )
            {
            // InternalMiniARM.g:1723:1: ( 'pop' )
            // InternalMiniARM.g:1724:2: 'pop'
            {
             before(grammarAccess.getPOPAccess().getPopKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPOPAccess().getPopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POP__Group__0__Impl"


    // $ANTLR start "rule__POP__Group__1"
    // InternalMiniARM.g:1733:1: rule__POP__Group__1 : rule__POP__Group__1__Impl ;
    public final void rule__POP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1737:1: ( rule__POP__Group__1__Impl )
            // InternalMiniARM.g:1738:2: rule__POP__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__POP__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POP__Group__1"


    // $ANTLR start "rule__POP__Group__1__Impl"
    // InternalMiniARM.g:1744:1: rule__POP__Group__1__Impl : ( ( rule__POP__RegAssignment_1 ) ) ;
    public final void rule__POP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1748:1: ( ( ( rule__POP__RegAssignment_1 ) ) )
            // InternalMiniARM.g:1749:1: ( ( rule__POP__RegAssignment_1 ) )
            {
            // InternalMiniARM.g:1749:1: ( ( rule__POP__RegAssignment_1 ) )
            // InternalMiniARM.g:1750:2: ( rule__POP__RegAssignment_1 )
            {
             before(grammarAccess.getPOPAccess().getRegAssignment_1()); 
            // InternalMiniARM.g:1751:2: ( rule__POP__RegAssignment_1 )
            // InternalMiniARM.g:1751:3: rule__POP__RegAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__POP__RegAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPOPAccess().getRegAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POP__Group__1__Impl"


    // $ANTLR start "rule__LOAD__Group__0"
    // InternalMiniARM.g:1760:1: rule__LOAD__Group__0 : rule__LOAD__Group__0__Impl rule__LOAD__Group__1 ;
    public final void rule__LOAD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1764:1: ( rule__LOAD__Group__0__Impl rule__LOAD__Group__1 )
            // InternalMiniARM.g:1765:2: rule__LOAD__Group__0__Impl rule__LOAD__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__LOAD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LOAD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOAD__Group__0"


    // $ANTLR start "rule__LOAD__Group__0__Impl"
    // InternalMiniARM.g:1772:1: rule__LOAD__Group__0__Impl : ( 'ldr' ) ;
    public final void rule__LOAD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1776:1: ( ( 'ldr' ) )
            // InternalMiniARM.g:1777:1: ( 'ldr' )
            {
            // InternalMiniARM.g:1777:1: ( 'ldr' )
            // InternalMiniARM.g:1778:2: 'ldr'
            {
             before(grammarAccess.getLOADAccess().getLdrKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLOADAccess().getLdrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOAD__Group__0__Impl"


    // $ANTLR start "rule__LOAD__Group__1"
    // InternalMiniARM.g:1787:1: rule__LOAD__Group__1 : rule__LOAD__Group__1__Impl rule__LOAD__Group__2 ;
    public final void rule__LOAD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1791:1: ( rule__LOAD__Group__1__Impl rule__LOAD__Group__2 )
            // InternalMiniARM.g:1792:2: rule__LOAD__Group__1__Impl rule__LOAD__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__LOAD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LOAD__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOAD__Group__1"


    // $ANTLR start "rule__LOAD__Group__1__Impl"
    // InternalMiniARM.g:1799:1: rule__LOAD__Group__1__Impl : ( ( rule__LOAD__RegAssignment_1 ) ) ;
    public final void rule__LOAD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1803:1: ( ( ( rule__LOAD__RegAssignment_1 ) ) )
            // InternalMiniARM.g:1804:1: ( ( rule__LOAD__RegAssignment_1 ) )
            {
            // InternalMiniARM.g:1804:1: ( ( rule__LOAD__RegAssignment_1 ) )
            // InternalMiniARM.g:1805:2: ( rule__LOAD__RegAssignment_1 )
            {
             before(grammarAccess.getLOADAccess().getRegAssignment_1()); 
            // InternalMiniARM.g:1806:2: ( rule__LOAD__RegAssignment_1 )
            // InternalMiniARM.g:1806:3: rule__LOAD__RegAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LOAD__RegAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLOADAccess().getRegAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOAD__Group__1__Impl"


    // $ANTLR start "rule__LOAD__Group__2"
    // InternalMiniARM.g:1814:1: rule__LOAD__Group__2 : rule__LOAD__Group__2__Impl rule__LOAD__Group__3 ;
    public final void rule__LOAD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1818:1: ( rule__LOAD__Group__2__Impl rule__LOAD__Group__3 )
            // InternalMiniARM.g:1819:2: rule__LOAD__Group__2__Impl rule__LOAD__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__LOAD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LOAD__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOAD__Group__2"


    // $ANTLR start "rule__LOAD__Group__2__Impl"
    // InternalMiniARM.g:1826:1: rule__LOAD__Group__2__Impl : ( ',' ) ;
    public final void rule__LOAD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1830:1: ( ( ',' ) )
            // InternalMiniARM.g:1831:1: ( ',' )
            {
            // InternalMiniARM.g:1831:1: ( ',' )
            // InternalMiniARM.g:1832:2: ','
            {
             before(grammarAccess.getLOADAccess().getCommaKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLOADAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOAD__Group__2__Impl"


    // $ANTLR start "rule__LOAD__Group__3"
    // InternalMiniARM.g:1841:1: rule__LOAD__Group__3 : rule__LOAD__Group__3__Impl ;
    public final void rule__LOAD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1845:1: ( rule__LOAD__Group__3__Impl )
            // InternalMiniARM.g:1846:2: rule__LOAD__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LOAD__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOAD__Group__3"


    // $ANTLR start "rule__LOAD__Group__3__Impl"
    // InternalMiniARM.g:1852:1: rule__LOAD__Group__3__Impl : ( ( rule__LOAD__AddressAssignment_3 ) ) ;
    public final void rule__LOAD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1856:1: ( ( ( rule__LOAD__AddressAssignment_3 ) ) )
            // InternalMiniARM.g:1857:1: ( ( rule__LOAD__AddressAssignment_3 ) )
            {
            // InternalMiniARM.g:1857:1: ( ( rule__LOAD__AddressAssignment_3 ) )
            // InternalMiniARM.g:1858:2: ( rule__LOAD__AddressAssignment_3 )
            {
             before(grammarAccess.getLOADAccess().getAddressAssignment_3()); 
            // InternalMiniARM.g:1859:2: ( rule__LOAD__AddressAssignment_3 )
            // InternalMiniARM.g:1859:3: rule__LOAD__AddressAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LOAD__AddressAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLOADAccess().getAddressAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOAD__Group__3__Impl"


    // $ANTLR start "rule__Immediate__Group__0"
    // InternalMiniARM.g:1868:1: rule__Immediate__Group__0 : rule__Immediate__Group__0__Impl rule__Immediate__Group__1 ;
    public final void rule__Immediate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1872:1: ( rule__Immediate__Group__0__Impl rule__Immediate__Group__1 )
            // InternalMiniARM.g:1873:2: rule__Immediate__Group__0__Impl rule__Immediate__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Immediate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Immediate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Immediate__Group__0"


    // $ANTLR start "rule__Immediate__Group__0__Impl"
    // InternalMiniARM.g:1880:1: rule__Immediate__Group__0__Impl : ( '#' ) ;
    public final void rule__Immediate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1884:1: ( ( '#' ) )
            // InternalMiniARM.g:1885:1: ( '#' )
            {
            // InternalMiniARM.g:1885:1: ( '#' )
            // InternalMiniARM.g:1886:2: '#'
            {
             before(grammarAccess.getImmediateAccess().getNumberSignKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImmediateAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Immediate__Group__0__Impl"


    // $ANTLR start "rule__Immediate__Group__1"
    // InternalMiniARM.g:1895:1: rule__Immediate__Group__1 : rule__Immediate__Group__1__Impl ;
    public final void rule__Immediate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1899:1: ( rule__Immediate__Group__1__Impl )
            // InternalMiniARM.g:1900:2: rule__Immediate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Immediate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Immediate__Group__1"


    // $ANTLR start "rule__Immediate__Group__1__Impl"
    // InternalMiniARM.g:1906:1: rule__Immediate__Group__1__Impl : ( ( rule__Immediate__ValueAssignment_1 ) ) ;
    public final void rule__Immediate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1910:1: ( ( ( rule__Immediate__ValueAssignment_1 ) ) )
            // InternalMiniARM.g:1911:1: ( ( rule__Immediate__ValueAssignment_1 ) )
            {
            // InternalMiniARM.g:1911:1: ( ( rule__Immediate__ValueAssignment_1 ) )
            // InternalMiniARM.g:1912:2: ( rule__Immediate__ValueAssignment_1 )
            {
             before(grammarAccess.getImmediateAccess().getValueAssignment_1()); 
            // InternalMiniARM.g:1913:2: ( rule__Immediate__ValueAssignment_1 )
            // InternalMiniARM.g:1913:3: rule__Immediate__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Immediate__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImmediateAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Immediate__Group__1__Impl"


    // $ANTLR start "rule__DirectReg__Group__0"
    // InternalMiniARM.g:1922:1: rule__DirectReg__Group__0 : rule__DirectReg__Group__0__Impl rule__DirectReg__Group__1 ;
    public final void rule__DirectReg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1926:1: ( rule__DirectReg__Group__0__Impl rule__DirectReg__Group__1 )
            // InternalMiniARM.g:1927:2: rule__DirectReg__Group__0__Impl rule__DirectReg__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DirectReg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectReg__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectReg__Group__0"


    // $ANTLR start "rule__DirectReg__Group__0__Impl"
    // InternalMiniARM.g:1934:1: rule__DirectReg__Group__0__Impl : ( '[' ) ;
    public final void rule__DirectReg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1938:1: ( ( '[' ) )
            // InternalMiniARM.g:1939:1: ( '[' )
            {
            // InternalMiniARM.g:1939:1: ( '[' )
            // InternalMiniARM.g:1940:2: '['
            {
             before(grammarAccess.getDirectRegAccess().getLeftSquareBracketKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDirectRegAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectReg__Group__0__Impl"


    // $ANTLR start "rule__DirectReg__Group__1"
    // InternalMiniARM.g:1949:1: rule__DirectReg__Group__1 : rule__DirectReg__Group__1__Impl rule__DirectReg__Group__2 ;
    public final void rule__DirectReg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1953:1: ( rule__DirectReg__Group__1__Impl rule__DirectReg__Group__2 )
            // InternalMiniARM.g:1954:2: rule__DirectReg__Group__1__Impl rule__DirectReg__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__DirectReg__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectReg__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectReg__Group__1"


    // $ANTLR start "rule__DirectReg__Group__1__Impl"
    // InternalMiniARM.g:1961:1: rule__DirectReg__Group__1__Impl : ( ( rule__DirectReg__RegAssignment_1 ) ) ;
    public final void rule__DirectReg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1965:1: ( ( ( rule__DirectReg__RegAssignment_1 ) ) )
            // InternalMiniARM.g:1966:1: ( ( rule__DirectReg__RegAssignment_1 ) )
            {
            // InternalMiniARM.g:1966:1: ( ( rule__DirectReg__RegAssignment_1 ) )
            // InternalMiniARM.g:1967:2: ( rule__DirectReg__RegAssignment_1 )
            {
             before(grammarAccess.getDirectRegAccess().getRegAssignment_1()); 
            // InternalMiniARM.g:1968:2: ( rule__DirectReg__RegAssignment_1 )
            // InternalMiniARM.g:1968:3: rule__DirectReg__RegAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DirectReg__RegAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectRegAccess().getRegAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectReg__Group__1__Impl"


    // $ANTLR start "rule__DirectReg__Group__2"
    // InternalMiniARM.g:1976:1: rule__DirectReg__Group__2 : rule__DirectReg__Group__2__Impl ;
    public final void rule__DirectReg__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1980:1: ( rule__DirectReg__Group__2__Impl )
            // InternalMiniARM.g:1981:2: rule__DirectReg__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectReg__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectReg__Group__2"


    // $ANTLR start "rule__DirectReg__Group__2__Impl"
    // InternalMiniARM.g:1987:1: rule__DirectReg__Group__2__Impl : ( ']' ) ;
    public final void rule__DirectReg__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:1991:1: ( ( ']' ) )
            // InternalMiniARM.g:1992:1: ( ']' )
            {
            // InternalMiniARM.g:1992:1: ( ']' )
            // InternalMiniARM.g:1993:2: ']'
            {
             before(grammarAccess.getDirectRegAccess().getRightSquareBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDirectRegAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectReg__Group__2__Impl"


    // $ANTLR start "rule__STORE__Group__0"
    // InternalMiniARM.g:2003:1: rule__STORE__Group__0 : rule__STORE__Group__0__Impl rule__STORE__Group__1 ;
    public final void rule__STORE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2007:1: ( rule__STORE__Group__0__Impl rule__STORE__Group__1 )
            // InternalMiniARM.g:2008:2: rule__STORE__Group__0__Impl rule__STORE__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__STORE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STORE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STORE__Group__0"


    // $ANTLR start "rule__STORE__Group__0__Impl"
    // InternalMiniARM.g:2015:1: rule__STORE__Group__0__Impl : ( 'str' ) ;
    public final void rule__STORE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2019:1: ( ( 'str' ) )
            // InternalMiniARM.g:2020:1: ( 'str' )
            {
            // InternalMiniARM.g:2020:1: ( 'str' )
            // InternalMiniARM.g:2021:2: 'str'
            {
             before(grammarAccess.getSTOREAccess().getStrKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSTOREAccess().getStrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STORE__Group__0__Impl"


    // $ANTLR start "rule__STORE__Group__1"
    // InternalMiniARM.g:2030:1: rule__STORE__Group__1 : rule__STORE__Group__1__Impl rule__STORE__Group__2 ;
    public final void rule__STORE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2034:1: ( rule__STORE__Group__1__Impl rule__STORE__Group__2 )
            // InternalMiniARM.g:2035:2: rule__STORE__Group__1__Impl rule__STORE__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__STORE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STORE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STORE__Group__1"


    // $ANTLR start "rule__STORE__Group__1__Impl"
    // InternalMiniARM.g:2042:1: rule__STORE__Group__1__Impl : ( ( rule__STORE__RegAssignment_1 ) ) ;
    public final void rule__STORE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2046:1: ( ( ( rule__STORE__RegAssignment_1 ) ) )
            // InternalMiniARM.g:2047:1: ( ( rule__STORE__RegAssignment_1 ) )
            {
            // InternalMiniARM.g:2047:1: ( ( rule__STORE__RegAssignment_1 ) )
            // InternalMiniARM.g:2048:2: ( rule__STORE__RegAssignment_1 )
            {
             before(grammarAccess.getSTOREAccess().getRegAssignment_1()); 
            // InternalMiniARM.g:2049:2: ( rule__STORE__RegAssignment_1 )
            // InternalMiniARM.g:2049:3: rule__STORE__RegAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__STORE__RegAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSTOREAccess().getRegAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STORE__Group__1__Impl"


    // $ANTLR start "rule__STORE__Group__2"
    // InternalMiniARM.g:2057:1: rule__STORE__Group__2 : rule__STORE__Group__2__Impl rule__STORE__Group__3 ;
    public final void rule__STORE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2061:1: ( rule__STORE__Group__2__Impl rule__STORE__Group__3 )
            // InternalMiniARM.g:2062:2: rule__STORE__Group__2__Impl rule__STORE__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__STORE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STORE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STORE__Group__2"


    // $ANTLR start "rule__STORE__Group__2__Impl"
    // InternalMiniARM.g:2069:1: rule__STORE__Group__2__Impl : ( ',' ) ;
    public final void rule__STORE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2073:1: ( ( ',' ) )
            // InternalMiniARM.g:2074:1: ( ',' )
            {
            // InternalMiniARM.g:2074:1: ( ',' )
            // InternalMiniARM.g:2075:2: ','
            {
             before(grammarAccess.getSTOREAccess().getCommaKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSTOREAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STORE__Group__2__Impl"


    // $ANTLR start "rule__STORE__Group__3"
    // InternalMiniARM.g:2084:1: rule__STORE__Group__3 : rule__STORE__Group__3__Impl ;
    public final void rule__STORE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2088:1: ( rule__STORE__Group__3__Impl )
            // InternalMiniARM.g:2089:2: rule__STORE__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__STORE__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STORE__Group__3"


    // $ANTLR start "rule__STORE__Group__3__Impl"
    // InternalMiniARM.g:2095:1: rule__STORE__Group__3__Impl : ( ( rule__STORE__AddressAssignment_3 ) ) ;
    public final void rule__STORE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2099:1: ( ( ( rule__STORE__AddressAssignment_3 ) ) )
            // InternalMiniARM.g:2100:1: ( ( rule__STORE__AddressAssignment_3 ) )
            {
            // InternalMiniARM.g:2100:1: ( ( rule__STORE__AddressAssignment_3 ) )
            // InternalMiniARM.g:2101:2: ( rule__STORE__AddressAssignment_3 )
            {
             before(grammarAccess.getSTOREAccess().getAddressAssignment_3()); 
            // InternalMiniARM.g:2102:2: ( rule__STORE__AddressAssignment_3 )
            // InternalMiniARM.g:2102:3: rule__STORE__AddressAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__STORE__AddressAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSTOREAccess().getAddressAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STORE__Group__3__Impl"


    // $ANTLR start "rule__MOVE__Group__0"
    // InternalMiniARM.g:2111:1: rule__MOVE__Group__0 : rule__MOVE__Group__0__Impl rule__MOVE__Group__1 ;
    public final void rule__MOVE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2115:1: ( rule__MOVE__Group__0__Impl rule__MOVE__Group__1 )
            // InternalMiniARM.g:2116:2: rule__MOVE__Group__0__Impl rule__MOVE__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MOVE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MOVE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__Group__0"


    // $ANTLR start "rule__MOVE__Group__0__Impl"
    // InternalMiniARM.g:2123:1: rule__MOVE__Group__0__Impl : ( 'mov' ) ;
    public final void rule__MOVE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2127:1: ( ( 'mov' ) )
            // InternalMiniARM.g:2128:1: ( 'mov' )
            {
            // InternalMiniARM.g:2128:1: ( 'mov' )
            // InternalMiniARM.g:2129:2: 'mov'
            {
             before(grammarAccess.getMOVEAccess().getMovKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMOVEAccess().getMovKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__Group__0__Impl"


    // $ANTLR start "rule__MOVE__Group__1"
    // InternalMiniARM.g:2138:1: rule__MOVE__Group__1 : rule__MOVE__Group__1__Impl rule__MOVE__Group__2 ;
    public final void rule__MOVE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2142:1: ( rule__MOVE__Group__1__Impl rule__MOVE__Group__2 )
            // InternalMiniARM.g:2143:2: rule__MOVE__Group__1__Impl rule__MOVE__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MOVE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MOVE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__Group__1"


    // $ANTLR start "rule__MOVE__Group__1__Impl"
    // InternalMiniARM.g:2150:1: rule__MOVE__Group__1__Impl : ( ( rule__MOVE__DstAssignment_1 ) ) ;
    public final void rule__MOVE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2154:1: ( ( ( rule__MOVE__DstAssignment_1 ) ) )
            // InternalMiniARM.g:2155:1: ( ( rule__MOVE__DstAssignment_1 ) )
            {
            // InternalMiniARM.g:2155:1: ( ( rule__MOVE__DstAssignment_1 ) )
            // InternalMiniARM.g:2156:2: ( rule__MOVE__DstAssignment_1 )
            {
             before(grammarAccess.getMOVEAccess().getDstAssignment_1()); 
            // InternalMiniARM.g:2157:2: ( rule__MOVE__DstAssignment_1 )
            // InternalMiniARM.g:2157:3: rule__MOVE__DstAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MOVE__DstAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMOVEAccess().getDstAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__Group__1__Impl"


    // $ANTLR start "rule__MOVE__Group__2"
    // InternalMiniARM.g:2165:1: rule__MOVE__Group__2 : rule__MOVE__Group__2__Impl rule__MOVE__Group__3 ;
    public final void rule__MOVE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2169:1: ( rule__MOVE__Group__2__Impl rule__MOVE__Group__3 )
            // InternalMiniARM.g:2170:2: rule__MOVE__Group__2__Impl rule__MOVE__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__MOVE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MOVE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__Group__2"


    // $ANTLR start "rule__MOVE__Group__2__Impl"
    // InternalMiniARM.g:2177:1: rule__MOVE__Group__2__Impl : ( ',' ) ;
    public final void rule__MOVE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2181:1: ( ( ',' ) )
            // InternalMiniARM.g:2182:1: ( ',' )
            {
            // InternalMiniARM.g:2182:1: ( ',' )
            // InternalMiniARM.g:2183:2: ','
            {
             before(grammarAccess.getMOVEAccess().getCommaKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMOVEAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__Group__2__Impl"


    // $ANTLR start "rule__MOVE__Group__3"
    // InternalMiniARM.g:2192:1: rule__MOVE__Group__3 : rule__MOVE__Group__3__Impl ;
    public final void rule__MOVE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2196:1: ( rule__MOVE__Group__3__Impl )
            // InternalMiniARM.g:2197:2: rule__MOVE__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MOVE__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__Group__3"


    // $ANTLR start "rule__MOVE__Group__3__Impl"
    // InternalMiniARM.g:2203:1: rule__MOVE__Group__3__Impl : ( ( rule__MOVE__SrcAssignment_3 ) ) ;
    public final void rule__MOVE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2207:1: ( ( ( rule__MOVE__SrcAssignment_3 ) ) )
            // InternalMiniARM.g:2208:1: ( ( rule__MOVE__SrcAssignment_3 ) )
            {
            // InternalMiniARM.g:2208:1: ( ( rule__MOVE__SrcAssignment_3 ) )
            // InternalMiniARM.g:2209:2: ( rule__MOVE__SrcAssignment_3 )
            {
             before(grammarAccess.getMOVEAccess().getSrcAssignment_3()); 
            // InternalMiniARM.g:2210:2: ( rule__MOVE__SrcAssignment_3 )
            // InternalMiniARM.g:2210:3: rule__MOVE__SrcAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MOVE__SrcAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMOVEAccess().getSrcAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__Group__3__Impl"


    // $ANTLR start "rule__ADD__Group__0"
    // InternalMiniARM.g:2219:1: rule__ADD__Group__0 : rule__ADD__Group__0__Impl rule__ADD__Group__1 ;
    public final void rule__ADD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2223:1: ( rule__ADD__Group__0__Impl rule__ADD__Group__1 )
            // InternalMiniARM.g:2224:2: rule__ADD__Group__0__Impl rule__ADD__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ADD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__0"


    // $ANTLR start "rule__ADD__Group__0__Impl"
    // InternalMiniARM.g:2231:1: rule__ADD__Group__0__Impl : ( 'add' ) ;
    public final void rule__ADD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2235:1: ( ( 'add' ) )
            // InternalMiniARM.g:2236:1: ( 'add' )
            {
            // InternalMiniARM.g:2236:1: ( 'add' )
            // InternalMiniARM.g:2237:2: 'add'
            {
             before(grammarAccess.getADDAccess().getAddKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getADDAccess().getAddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__0__Impl"


    // $ANTLR start "rule__ADD__Group__1"
    // InternalMiniARM.g:2246:1: rule__ADD__Group__1 : rule__ADD__Group__1__Impl rule__ADD__Group__2 ;
    public final void rule__ADD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2250:1: ( rule__ADD__Group__1__Impl rule__ADD__Group__2 )
            // InternalMiniARM.g:2251:2: rule__ADD__Group__1__Impl rule__ADD__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ADD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADD__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__1"


    // $ANTLR start "rule__ADD__Group__1__Impl"
    // InternalMiniARM.g:2258:1: rule__ADD__Group__1__Impl : ( ( rule__ADD__DstAssignment_1 ) ) ;
    public final void rule__ADD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2262:1: ( ( ( rule__ADD__DstAssignment_1 ) ) )
            // InternalMiniARM.g:2263:1: ( ( rule__ADD__DstAssignment_1 ) )
            {
            // InternalMiniARM.g:2263:1: ( ( rule__ADD__DstAssignment_1 ) )
            // InternalMiniARM.g:2264:2: ( rule__ADD__DstAssignment_1 )
            {
             before(grammarAccess.getADDAccess().getDstAssignment_1()); 
            // InternalMiniARM.g:2265:2: ( rule__ADD__DstAssignment_1 )
            // InternalMiniARM.g:2265:3: rule__ADD__DstAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ADD__DstAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getADDAccess().getDstAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__1__Impl"


    // $ANTLR start "rule__ADD__Group__2"
    // InternalMiniARM.g:2273:1: rule__ADD__Group__2 : rule__ADD__Group__2__Impl rule__ADD__Group__3 ;
    public final void rule__ADD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2277:1: ( rule__ADD__Group__2__Impl rule__ADD__Group__3 )
            // InternalMiniARM.g:2278:2: rule__ADD__Group__2__Impl rule__ADD__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ADD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADD__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__2"


    // $ANTLR start "rule__ADD__Group__2__Impl"
    // InternalMiniARM.g:2285:1: rule__ADD__Group__2__Impl : ( ',' ) ;
    public final void rule__ADD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2289:1: ( ( ',' ) )
            // InternalMiniARM.g:2290:1: ( ',' )
            {
            // InternalMiniARM.g:2290:1: ( ',' )
            // InternalMiniARM.g:2291:2: ','
            {
             before(grammarAccess.getADDAccess().getCommaKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getADDAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__2__Impl"


    // $ANTLR start "rule__ADD__Group__3"
    // InternalMiniARM.g:2300:1: rule__ADD__Group__3 : rule__ADD__Group__3__Impl rule__ADD__Group__4 ;
    public final void rule__ADD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2304:1: ( rule__ADD__Group__3__Impl rule__ADD__Group__4 )
            // InternalMiniARM.g:2305:2: rule__ADD__Group__3__Impl rule__ADD__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ADD__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADD__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__3"


    // $ANTLR start "rule__ADD__Group__3__Impl"
    // InternalMiniARM.g:2312:1: rule__ADD__Group__3__Impl : ( ( rule__ADD__Src1Assignment_3 ) ) ;
    public final void rule__ADD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2316:1: ( ( ( rule__ADD__Src1Assignment_3 ) ) )
            // InternalMiniARM.g:2317:1: ( ( rule__ADD__Src1Assignment_3 ) )
            {
            // InternalMiniARM.g:2317:1: ( ( rule__ADD__Src1Assignment_3 ) )
            // InternalMiniARM.g:2318:2: ( rule__ADD__Src1Assignment_3 )
            {
             before(grammarAccess.getADDAccess().getSrc1Assignment_3()); 
            // InternalMiniARM.g:2319:2: ( rule__ADD__Src1Assignment_3 )
            // InternalMiniARM.g:2319:3: rule__ADD__Src1Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ADD__Src1Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getADDAccess().getSrc1Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__3__Impl"


    // $ANTLR start "rule__ADD__Group__4"
    // InternalMiniARM.g:2327:1: rule__ADD__Group__4 : rule__ADD__Group__4__Impl rule__ADD__Group__5 ;
    public final void rule__ADD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2331:1: ( rule__ADD__Group__4__Impl rule__ADD__Group__5 )
            // InternalMiniARM.g:2332:2: rule__ADD__Group__4__Impl rule__ADD__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ADD__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADD__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__4"


    // $ANTLR start "rule__ADD__Group__4__Impl"
    // InternalMiniARM.g:2339:1: rule__ADD__Group__4__Impl : ( ',' ) ;
    public final void rule__ADD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2343:1: ( ( ',' ) )
            // InternalMiniARM.g:2344:1: ( ',' )
            {
            // InternalMiniARM.g:2344:1: ( ',' )
            // InternalMiniARM.g:2345:2: ','
            {
             before(grammarAccess.getADDAccess().getCommaKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getADDAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__4__Impl"


    // $ANTLR start "rule__ADD__Group__5"
    // InternalMiniARM.g:2354:1: rule__ADD__Group__5 : rule__ADD__Group__5__Impl ;
    public final void rule__ADD__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2358:1: ( rule__ADD__Group__5__Impl )
            // InternalMiniARM.g:2359:2: rule__ADD__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ADD__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__5"


    // $ANTLR start "rule__ADD__Group__5__Impl"
    // InternalMiniARM.g:2365:1: rule__ADD__Group__5__Impl : ( ( rule__ADD__Src2Assignment_5 ) ) ;
    public final void rule__ADD__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2369:1: ( ( ( rule__ADD__Src2Assignment_5 ) ) )
            // InternalMiniARM.g:2370:1: ( ( rule__ADD__Src2Assignment_5 ) )
            {
            // InternalMiniARM.g:2370:1: ( ( rule__ADD__Src2Assignment_5 ) )
            // InternalMiniARM.g:2371:2: ( rule__ADD__Src2Assignment_5 )
            {
             before(grammarAccess.getADDAccess().getSrc2Assignment_5()); 
            // InternalMiniARM.g:2372:2: ( rule__ADD__Src2Assignment_5 )
            // InternalMiniARM.g:2372:3: rule__ADD__Src2Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ADD__Src2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getADDAccess().getSrc2Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Group__5__Impl"


    // $ANTLR start "rule__SUB__Group__0"
    // InternalMiniARM.g:2381:1: rule__SUB__Group__0 : rule__SUB__Group__0__Impl rule__SUB__Group__1 ;
    public final void rule__SUB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2385:1: ( rule__SUB__Group__0__Impl rule__SUB__Group__1 )
            // InternalMiniARM.g:2386:2: rule__SUB__Group__0__Impl rule__SUB__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SUB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SUB__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Group__0"


    // $ANTLR start "rule__SUB__Group__0__Impl"
    // InternalMiniARM.g:2393:1: rule__SUB__Group__0__Impl : ( 'sub' ) ;
    public final void rule__SUB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2397:1: ( ( 'sub' ) )
            // InternalMiniARM.g:2398:1: ( 'sub' )
            {
            // InternalMiniARM.g:2398:1: ( 'sub' )
            // InternalMiniARM.g:2399:2: 'sub'
            {
             before(grammarAccess.getSUBAccess().getSubKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSUBAccess().getSubKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Group__0__Impl"


    // $ANTLR start "rule__SUB__Group__1"
    // InternalMiniARM.g:2408:1: rule__SUB__Group__1 : rule__SUB__Group__1__Impl rule__SUB__Group__2 ;
    public final void rule__SUB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2412:1: ( rule__SUB__Group__1__Impl rule__SUB__Group__2 )
            // InternalMiniARM.g:2413:2: rule__SUB__Group__1__Impl rule__SUB__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SUB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SUB__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Group__1"


    // $ANTLR start "rule__SUB__Group__1__Impl"
    // InternalMiniARM.g:2420:1: rule__SUB__Group__1__Impl : ( ( rule__SUB__DstAssignment_1 ) ) ;
    public final void rule__SUB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2424:1: ( ( ( rule__SUB__DstAssignment_1 ) ) )
            // InternalMiniARM.g:2425:1: ( ( rule__SUB__DstAssignment_1 ) )
            {
            // InternalMiniARM.g:2425:1: ( ( rule__SUB__DstAssignment_1 ) )
            // InternalMiniARM.g:2426:2: ( rule__SUB__DstAssignment_1 )
            {
             before(grammarAccess.getSUBAccess().getDstAssignment_1()); 
            // InternalMiniARM.g:2427:2: ( rule__SUB__DstAssignment_1 )
            // InternalMiniARM.g:2427:3: rule__SUB__DstAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SUB__DstAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSUBAccess().getDstAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Group__1__Impl"


    // $ANTLR start "rule__SUB__Group__2"
    // InternalMiniARM.g:2435:1: rule__SUB__Group__2 : rule__SUB__Group__2__Impl rule__SUB__Group__3 ;
    public final void rule__SUB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2439:1: ( rule__SUB__Group__2__Impl rule__SUB__Group__3 )
            // InternalMiniARM.g:2440:2: rule__SUB__Group__2__Impl rule__SUB__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__SUB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SUB__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Group__2"


    // $ANTLR start "rule__SUB__Group__2__Impl"
    // InternalMiniARM.g:2447:1: rule__SUB__Group__2__Impl : ( ',' ) ;
    public final void rule__SUB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2451:1: ( ( ',' ) )
            // InternalMiniARM.g:2452:1: ( ',' )
            {
            // InternalMiniARM.g:2452:1: ( ',' )
            // InternalMiniARM.g:2453:2: ','
            {
             before(grammarAccess.getSUBAccess().getCommaKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSUBAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Group__2__Impl"


    // $ANTLR start "rule__SUB__Group__3"
    // InternalMiniARM.g:2462:1: rule__SUB__Group__3 : rule__SUB__Group__3__Impl rule__SUB__Group__4 ;
    public final void rule__SUB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2466:1: ( rule__SUB__Group__3__Impl rule__SUB__Group__4 )
            // InternalMiniARM.g:2467:2: rule__SUB__Group__3__Impl rule__SUB__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__SUB__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SUB__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Group__3"


    // $ANTLR start "rule__SUB__Group__3__Impl"
    // InternalMiniARM.g:2474:1: rule__SUB__Group__3__Impl : ( ( rule__SUB__Src1Assignment_3 ) ) ;
    public final void rule__SUB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2478:1: ( ( ( rule__SUB__Src1Assignment_3 ) ) )
            // InternalMiniARM.g:2479:1: ( ( rule__SUB__Src1Assignment_3 ) )
            {
            // InternalMiniARM.g:2479:1: ( ( rule__SUB__Src1Assignment_3 ) )
            // InternalMiniARM.g:2480:2: ( rule__SUB__Src1Assignment_3 )
            {
             before(grammarAccess.getSUBAccess().getSrc1Assignment_3()); 
            // InternalMiniARM.g:2481:2: ( rule__SUB__Src1Assignment_3 )
            // InternalMiniARM.g:2481:3: rule__SUB__Src1Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SUB__Src1Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSUBAccess().getSrc1Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Group__3__Impl"


    // $ANTLR start "rule__SUB__Group__4"
    // InternalMiniARM.g:2489:1: rule__SUB__Group__4 : rule__SUB__Group__4__Impl rule__SUB__Group__5 ;
    public final void rule__SUB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2493:1: ( rule__SUB__Group__4__Impl rule__SUB__Group__5 )
            // InternalMiniARM.g:2494:2: rule__SUB__Group__4__Impl rule__SUB__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__SUB__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SUB__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Group__4"


    // $ANTLR start "rule__SUB__Group__4__Impl"
    // InternalMiniARM.g:2501:1: rule__SUB__Group__4__Impl : ( ',' ) ;
    public final void rule__SUB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2505:1: ( ( ',' ) )
            // InternalMiniARM.g:2506:1: ( ',' )
            {
            // InternalMiniARM.g:2506:1: ( ',' )
            // InternalMiniARM.g:2507:2: ','
            {
             before(grammarAccess.getSUBAccess().getCommaKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSUBAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Group__4__Impl"


    // $ANTLR start "rule__SUB__Group__5"
    // InternalMiniARM.g:2516:1: rule__SUB__Group__5 : rule__SUB__Group__5__Impl ;
    public final void rule__SUB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2520:1: ( rule__SUB__Group__5__Impl )
            // InternalMiniARM.g:2521:2: rule__SUB__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SUB__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Group__5"


    // $ANTLR start "rule__SUB__Group__5__Impl"
    // InternalMiniARM.g:2527:1: rule__SUB__Group__5__Impl : ( ( rule__SUB__Src2Assignment_5 ) ) ;
    public final void rule__SUB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2531:1: ( ( ( rule__SUB__Src2Assignment_5 ) ) )
            // InternalMiniARM.g:2532:1: ( ( rule__SUB__Src2Assignment_5 ) )
            {
            // InternalMiniARM.g:2532:1: ( ( rule__SUB__Src2Assignment_5 ) )
            // InternalMiniARM.g:2533:2: ( rule__SUB__Src2Assignment_5 )
            {
             before(grammarAccess.getSUBAccess().getSrc2Assignment_5()); 
            // InternalMiniARM.g:2534:2: ( rule__SUB__Src2Assignment_5 )
            // InternalMiniARM.g:2534:3: rule__SUB__Src2Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SUB__Src2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSUBAccess().getSrc2Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Group__5__Impl"


    // $ANTLR start "rule__CMP__Group__0"
    // InternalMiniARM.g:2543:1: rule__CMP__Group__0 : rule__CMP__Group__0__Impl rule__CMP__Group__1 ;
    public final void rule__CMP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2547:1: ( rule__CMP__Group__0__Impl rule__CMP__Group__1 )
            // InternalMiniARM.g:2548:2: rule__CMP__Group__0__Impl rule__CMP__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CMP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CMP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMP__Group__0"


    // $ANTLR start "rule__CMP__Group__0__Impl"
    // InternalMiniARM.g:2555:1: rule__CMP__Group__0__Impl : ( 'cmp' ) ;
    public final void rule__CMP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2559:1: ( ( 'cmp' ) )
            // InternalMiniARM.g:2560:1: ( 'cmp' )
            {
            // InternalMiniARM.g:2560:1: ( 'cmp' )
            // InternalMiniARM.g:2561:2: 'cmp'
            {
             before(grammarAccess.getCMPAccess().getCmpKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCMPAccess().getCmpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMP__Group__0__Impl"


    // $ANTLR start "rule__CMP__Group__1"
    // InternalMiniARM.g:2570:1: rule__CMP__Group__1 : rule__CMP__Group__1__Impl rule__CMP__Group__2 ;
    public final void rule__CMP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2574:1: ( rule__CMP__Group__1__Impl rule__CMP__Group__2 )
            // InternalMiniARM.g:2575:2: rule__CMP__Group__1__Impl rule__CMP__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__CMP__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CMP__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMP__Group__1"


    // $ANTLR start "rule__CMP__Group__1__Impl"
    // InternalMiniARM.g:2582:1: rule__CMP__Group__1__Impl : ( ( rule__CMP__Src1Assignment_1 ) ) ;
    public final void rule__CMP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2586:1: ( ( ( rule__CMP__Src1Assignment_1 ) ) )
            // InternalMiniARM.g:2587:1: ( ( rule__CMP__Src1Assignment_1 ) )
            {
            // InternalMiniARM.g:2587:1: ( ( rule__CMP__Src1Assignment_1 ) )
            // InternalMiniARM.g:2588:2: ( rule__CMP__Src1Assignment_1 )
            {
             before(grammarAccess.getCMPAccess().getSrc1Assignment_1()); 
            // InternalMiniARM.g:2589:2: ( rule__CMP__Src1Assignment_1 )
            // InternalMiniARM.g:2589:3: rule__CMP__Src1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CMP__Src1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCMPAccess().getSrc1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMP__Group__1__Impl"


    // $ANTLR start "rule__CMP__Group__2"
    // InternalMiniARM.g:2597:1: rule__CMP__Group__2 : rule__CMP__Group__2__Impl rule__CMP__Group__3 ;
    public final void rule__CMP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2601:1: ( rule__CMP__Group__2__Impl rule__CMP__Group__3 )
            // InternalMiniARM.g:2602:2: rule__CMP__Group__2__Impl rule__CMP__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__CMP__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CMP__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMP__Group__2"


    // $ANTLR start "rule__CMP__Group__2__Impl"
    // InternalMiniARM.g:2609:1: rule__CMP__Group__2__Impl : ( ',' ) ;
    public final void rule__CMP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2613:1: ( ( ',' ) )
            // InternalMiniARM.g:2614:1: ( ',' )
            {
            // InternalMiniARM.g:2614:1: ( ',' )
            // InternalMiniARM.g:2615:2: ','
            {
             before(grammarAccess.getCMPAccess().getCommaKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCMPAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMP__Group__2__Impl"


    // $ANTLR start "rule__CMP__Group__3"
    // InternalMiniARM.g:2624:1: rule__CMP__Group__3 : rule__CMP__Group__3__Impl ;
    public final void rule__CMP__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2628:1: ( rule__CMP__Group__3__Impl )
            // InternalMiniARM.g:2629:2: rule__CMP__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CMP__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMP__Group__3"


    // $ANTLR start "rule__CMP__Group__3__Impl"
    // InternalMiniARM.g:2635:1: rule__CMP__Group__3__Impl : ( ( rule__CMP__Src2Assignment_3 ) ) ;
    public final void rule__CMP__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2639:1: ( ( ( rule__CMP__Src2Assignment_3 ) ) )
            // InternalMiniARM.g:2640:1: ( ( rule__CMP__Src2Assignment_3 ) )
            {
            // InternalMiniARM.g:2640:1: ( ( rule__CMP__Src2Assignment_3 ) )
            // InternalMiniARM.g:2641:2: ( rule__CMP__Src2Assignment_3 )
            {
             before(grammarAccess.getCMPAccess().getSrc2Assignment_3()); 
            // InternalMiniARM.g:2642:2: ( rule__CMP__Src2Assignment_3 )
            // InternalMiniARM.g:2642:3: rule__CMP__Src2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CMP__Src2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCMPAccess().getSrc2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMP__Group__3__Impl"


    // $ANTLR start "rule__BEQ__Group__0"
    // InternalMiniARM.g:2651:1: rule__BEQ__Group__0 : rule__BEQ__Group__0__Impl rule__BEQ__Group__1 ;
    public final void rule__BEQ__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2655:1: ( rule__BEQ__Group__0__Impl rule__BEQ__Group__1 )
            // InternalMiniARM.g:2656:2: rule__BEQ__Group__0__Impl rule__BEQ__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__BEQ__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BEQ__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BEQ__Group__0"


    // $ANTLR start "rule__BEQ__Group__0__Impl"
    // InternalMiniARM.g:2663:1: rule__BEQ__Group__0__Impl : ( 'beq' ) ;
    public final void rule__BEQ__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2667:1: ( ( 'beq' ) )
            // InternalMiniARM.g:2668:1: ( 'beq' )
            {
            // InternalMiniARM.g:2668:1: ( 'beq' )
            // InternalMiniARM.g:2669:2: 'beq'
            {
             before(grammarAccess.getBEQAccess().getBeqKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBEQAccess().getBeqKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BEQ__Group__0__Impl"


    // $ANTLR start "rule__BEQ__Group__1"
    // InternalMiniARM.g:2678:1: rule__BEQ__Group__1 : rule__BEQ__Group__1__Impl ;
    public final void rule__BEQ__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2682:1: ( rule__BEQ__Group__1__Impl )
            // InternalMiniARM.g:2683:2: rule__BEQ__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BEQ__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BEQ__Group__1"


    // $ANTLR start "rule__BEQ__Group__1__Impl"
    // InternalMiniARM.g:2689:1: rule__BEQ__Group__1__Impl : ( ( rule__BEQ__DestAssignment_1 ) ) ;
    public final void rule__BEQ__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2693:1: ( ( ( rule__BEQ__DestAssignment_1 ) ) )
            // InternalMiniARM.g:2694:1: ( ( rule__BEQ__DestAssignment_1 ) )
            {
            // InternalMiniARM.g:2694:1: ( ( rule__BEQ__DestAssignment_1 ) )
            // InternalMiniARM.g:2695:2: ( rule__BEQ__DestAssignment_1 )
            {
             before(grammarAccess.getBEQAccess().getDestAssignment_1()); 
            // InternalMiniARM.g:2696:2: ( rule__BEQ__DestAssignment_1 )
            // InternalMiniARM.g:2696:3: rule__BEQ__DestAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BEQ__DestAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBEQAccess().getDestAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BEQ__Group__1__Impl"


    // $ANTLR start "rule__BLT__Group__0"
    // InternalMiniARM.g:2705:1: rule__BLT__Group__0 : rule__BLT__Group__0__Impl rule__BLT__Group__1 ;
    public final void rule__BLT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2709:1: ( rule__BLT__Group__0__Impl rule__BLT__Group__1 )
            // InternalMiniARM.g:2710:2: rule__BLT__Group__0__Impl rule__BLT__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__BLT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BLT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLT__Group__0"


    // $ANTLR start "rule__BLT__Group__0__Impl"
    // InternalMiniARM.g:2717:1: rule__BLT__Group__0__Impl : ( 'blt' ) ;
    public final void rule__BLT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2721:1: ( ( 'blt' ) )
            // InternalMiniARM.g:2722:1: ( 'blt' )
            {
            // InternalMiniARM.g:2722:1: ( 'blt' )
            // InternalMiniARM.g:2723:2: 'blt'
            {
             before(grammarAccess.getBLTAccess().getBltKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBLTAccess().getBltKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLT__Group__0__Impl"


    // $ANTLR start "rule__BLT__Group__1"
    // InternalMiniARM.g:2732:1: rule__BLT__Group__1 : rule__BLT__Group__1__Impl ;
    public final void rule__BLT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2736:1: ( rule__BLT__Group__1__Impl )
            // InternalMiniARM.g:2737:2: rule__BLT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BLT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLT__Group__1"


    // $ANTLR start "rule__BLT__Group__1__Impl"
    // InternalMiniARM.g:2743:1: rule__BLT__Group__1__Impl : ( ( rule__BLT__DestAssignment_1 ) ) ;
    public final void rule__BLT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2747:1: ( ( ( rule__BLT__DestAssignment_1 ) ) )
            // InternalMiniARM.g:2748:1: ( ( rule__BLT__DestAssignment_1 ) )
            {
            // InternalMiniARM.g:2748:1: ( ( rule__BLT__DestAssignment_1 ) )
            // InternalMiniARM.g:2749:2: ( rule__BLT__DestAssignment_1 )
            {
             before(grammarAccess.getBLTAccess().getDestAssignment_1()); 
            // InternalMiniARM.g:2750:2: ( rule__BLT__DestAssignment_1 )
            // InternalMiniARM.g:2750:3: rule__BLT__DestAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BLT__DestAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBLTAccess().getDestAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLT__Group__1__Impl"


    // $ANTLR start "rule__BRANCH__Group__0"
    // InternalMiniARM.g:2759:1: rule__BRANCH__Group__0 : rule__BRANCH__Group__0__Impl rule__BRANCH__Group__1 ;
    public final void rule__BRANCH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2763:1: ( rule__BRANCH__Group__0__Impl rule__BRANCH__Group__1 )
            // InternalMiniARM.g:2764:2: rule__BRANCH__Group__0__Impl rule__BRANCH__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__BRANCH__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BRANCH__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRANCH__Group__0"


    // $ANTLR start "rule__BRANCH__Group__0__Impl"
    // InternalMiniARM.g:2771:1: rule__BRANCH__Group__0__Impl : ( 'b' ) ;
    public final void rule__BRANCH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2775:1: ( ( 'b' ) )
            // InternalMiniARM.g:2776:1: ( 'b' )
            {
            // InternalMiniARM.g:2776:1: ( 'b' )
            // InternalMiniARM.g:2777:2: 'b'
            {
             before(grammarAccess.getBRANCHAccess().getBKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBRANCHAccess().getBKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRANCH__Group__0__Impl"


    // $ANTLR start "rule__BRANCH__Group__1"
    // InternalMiniARM.g:2786:1: rule__BRANCH__Group__1 : rule__BRANCH__Group__1__Impl ;
    public final void rule__BRANCH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2790:1: ( rule__BRANCH__Group__1__Impl )
            // InternalMiniARM.g:2791:2: rule__BRANCH__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BRANCH__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRANCH__Group__1"


    // $ANTLR start "rule__BRANCH__Group__1__Impl"
    // InternalMiniARM.g:2797:1: rule__BRANCH__Group__1__Impl : ( ( rule__BRANCH__DestAssignment_1 ) ) ;
    public final void rule__BRANCH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2801:1: ( ( ( rule__BRANCH__DestAssignment_1 ) ) )
            // InternalMiniARM.g:2802:1: ( ( rule__BRANCH__DestAssignment_1 ) )
            {
            // InternalMiniARM.g:2802:1: ( ( rule__BRANCH__DestAssignment_1 ) )
            // InternalMiniARM.g:2803:2: ( rule__BRANCH__DestAssignment_1 )
            {
             before(grammarAccess.getBRANCHAccess().getDestAssignment_1()); 
            // InternalMiniARM.g:2804:2: ( rule__BRANCH__DestAssignment_1 )
            // InternalMiniARM.g:2804:3: rule__BRANCH__DestAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BRANCH__DestAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBRANCHAccess().getDestAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRANCH__Group__1__Impl"


    // $ANTLR start "rule__BLINK__Group__0"
    // InternalMiniARM.g:2813:1: rule__BLINK__Group__0 : rule__BLINK__Group__0__Impl rule__BLINK__Group__1 ;
    public final void rule__BLINK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2817:1: ( rule__BLINK__Group__0__Impl rule__BLINK__Group__1 )
            // InternalMiniARM.g:2818:2: rule__BLINK__Group__0__Impl rule__BLINK__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BLINK__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BLINK__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLINK__Group__0"


    // $ANTLR start "rule__BLINK__Group__0__Impl"
    // InternalMiniARM.g:2825:1: rule__BLINK__Group__0__Impl : ( 'bl' ) ;
    public final void rule__BLINK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2829:1: ( ( 'bl' ) )
            // InternalMiniARM.g:2830:1: ( 'bl' )
            {
            // InternalMiniARM.g:2830:1: ( 'bl' )
            // InternalMiniARM.g:2831:2: 'bl'
            {
             before(grammarAccess.getBLINKAccess().getBlKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBLINKAccess().getBlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLINK__Group__0__Impl"


    // $ANTLR start "rule__BLINK__Group__1"
    // InternalMiniARM.g:2840:1: rule__BLINK__Group__1 : rule__BLINK__Group__1__Impl rule__BLINK__Group__2 ;
    public final void rule__BLINK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2844:1: ( rule__BLINK__Group__1__Impl rule__BLINK__Group__2 )
            // InternalMiniARM.g:2845:2: rule__BLINK__Group__1__Impl rule__BLINK__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__BLINK__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BLINK__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLINK__Group__1"


    // $ANTLR start "rule__BLINK__Group__1__Impl"
    // InternalMiniARM.g:2852:1: rule__BLINK__Group__1__Impl : ( ( rule__BLINK__RegAssignment_1 ) ) ;
    public final void rule__BLINK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2856:1: ( ( ( rule__BLINK__RegAssignment_1 ) ) )
            // InternalMiniARM.g:2857:1: ( ( rule__BLINK__RegAssignment_1 ) )
            {
            // InternalMiniARM.g:2857:1: ( ( rule__BLINK__RegAssignment_1 ) )
            // InternalMiniARM.g:2858:2: ( rule__BLINK__RegAssignment_1 )
            {
             before(grammarAccess.getBLINKAccess().getRegAssignment_1()); 
            // InternalMiniARM.g:2859:2: ( rule__BLINK__RegAssignment_1 )
            // InternalMiniARM.g:2859:3: rule__BLINK__RegAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BLINK__RegAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBLINKAccess().getRegAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLINK__Group__1__Impl"


    // $ANTLR start "rule__BLINK__Group__2"
    // InternalMiniARM.g:2867:1: rule__BLINK__Group__2 : rule__BLINK__Group__2__Impl rule__BLINK__Group__3 ;
    public final void rule__BLINK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2871:1: ( rule__BLINK__Group__2__Impl rule__BLINK__Group__3 )
            // InternalMiniARM.g:2872:2: rule__BLINK__Group__2__Impl rule__BLINK__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__BLINK__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BLINK__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLINK__Group__2"


    // $ANTLR start "rule__BLINK__Group__2__Impl"
    // InternalMiniARM.g:2879:1: rule__BLINK__Group__2__Impl : ( ',' ) ;
    public final void rule__BLINK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2883:1: ( ( ',' ) )
            // InternalMiniARM.g:2884:1: ( ',' )
            {
            // InternalMiniARM.g:2884:1: ( ',' )
            // InternalMiniARM.g:2885:2: ','
            {
             before(grammarAccess.getBLINKAccess().getCommaKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBLINKAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLINK__Group__2__Impl"


    // $ANTLR start "rule__BLINK__Group__3"
    // InternalMiniARM.g:2894:1: rule__BLINK__Group__3 : rule__BLINK__Group__3__Impl ;
    public final void rule__BLINK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2898:1: ( rule__BLINK__Group__3__Impl )
            // InternalMiniARM.g:2899:2: rule__BLINK__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BLINK__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLINK__Group__3"


    // $ANTLR start "rule__BLINK__Group__3__Impl"
    // InternalMiniARM.g:2905:1: rule__BLINK__Group__3__Impl : ( ( rule__BLINK__DestAssignment_3 ) ) ;
    public final void rule__BLINK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2909:1: ( ( ( rule__BLINK__DestAssignment_3 ) ) )
            // InternalMiniARM.g:2910:1: ( ( rule__BLINK__DestAssignment_3 ) )
            {
            // InternalMiniARM.g:2910:1: ( ( rule__BLINK__DestAssignment_3 ) )
            // InternalMiniARM.g:2911:2: ( rule__BLINK__DestAssignment_3 )
            {
             before(grammarAccess.getBLINKAccess().getDestAssignment_3()); 
            // InternalMiniARM.g:2912:2: ( rule__BLINK__DestAssignment_3 )
            // InternalMiniARM.g:2912:3: rule__BLINK__DestAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BLINK__DestAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBLINKAccess().getDestAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLINK__Group__3__Impl"


    // $ANTLR start "rule__Program__LinesAssignment"
    // InternalMiniARM.g:2921:1: rule__Program__LinesAssignment : ( ruleLine ) ;
    public final void rule__Program__LinesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2925:1: ( ( ruleLine ) )
            // InternalMiniARM.g:2926:2: ( ruleLine )
            {
            // InternalMiniARM.g:2926:2: ( ruleLine )
            // InternalMiniARM.g:2927:3: ruleLine
            {
             before(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__LinesAssignment"


    // $ANTLR start "rule__Line__LabelDefAssignment_1_1"
    // InternalMiniARM.g:2936:1: rule__Line__LabelDefAssignment_1_1 : ( ruleLabelDef ) ;
    public final void rule__Line__LabelDefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2940:1: ( ( ruleLabelDef ) )
            // InternalMiniARM.g:2941:2: ( ruleLabelDef )
            {
            // InternalMiniARM.g:2941:2: ( ruleLabelDef )
            // InternalMiniARM.g:2942:3: ruleLabelDef
            {
             before(grammarAccess.getLineAccess().getLabelDefLabelDefParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLabelDef();

            state._fsp--;

             after(grammarAccess.getLineAccess().getLabelDefLabelDefParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__LabelDefAssignment_1_1"


    // $ANTLR start "rule__Line__InstAssignment_1_2"
    // InternalMiniARM.g:2951:1: rule__Line__InstAssignment_1_2 : ( ruleInstruction ) ;
    public final void rule__Line__InstAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2955:1: ( ( ruleInstruction ) )
            // InternalMiniARM.g:2956:2: ( ruleInstruction )
            {
            // InternalMiniARM.g:2956:2: ( ruleInstruction )
            // InternalMiniARM.g:2957:3: ruleInstruction
            {
             before(grammarAccess.getLineAccess().getInstInstructionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getLineAccess().getInstInstructionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__InstAssignment_1_2"


    // $ANTLR start "rule__Line__CommentAssignment_1_3_1"
    // InternalMiniARM.g:2966:1: rule__Line__CommentAssignment_1_3_1 : ( RULE_SL_COMMENT ) ;
    public final void rule__Line__CommentAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2970:1: ( ( RULE_SL_COMMENT ) )
            // InternalMiniARM.g:2971:2: ( RULE_SL_COMMENT )
            {
            // InternalMiniARM.g:2971:2: ( RULE_SL_COMMENT )
            // InternalMiniARM.g:2972:3: RULE_SL_COMMENT
            {
             before(grammarAccess.getLineAccess().getCommentSL_COMMENTTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getCommentSL_COMMENTTerminalRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__CommentAssignment_1_3_1"


    // $ANTLR start "rule__Include__FileNameAssignment_1"
    // InternalMiniARM.g:2981:1: rule__Include__FileNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__FileNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:2985:1: ( ( RULE_STRING ) )
            // InternalMiniARM.g:2986:2: ( RULE_STRING )
            {
            // InternalMiniARM.g:2986:2: ( RULE_STRING )
            // InternalMiniARM.g:2987:3: RULE_STRING
            {
             before(grammarAccess.getIncludeAccess().getFileNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getFileNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__FileNameAssignment_1"


    // $ANTLR start "rule__LabelDef__LabelAssignment_1"
    // InternalMiniARM.g:2996:1: rule__LabelDef__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__LabelDef__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3000:1: ( ( ruleLabel ) )
            // InternalMiniARM.g:3001:2: ( ruleLabel )
            {
            // InternalMiniARM.g:3001:2: ( ruleLabel )
            // InternalMiniARM.g:3002:3: ruleLabel
            {
             before(grammarAccess.getLabelDefAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelDefAccess().getLabelLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelDef__LabelAssignment_1"


    // $ANTLR start "rule__Label__NameAssignment"
    // InternalMiniARM.g:3011:1: rule__Label__NameAssignment : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3015:1: ( ( RULE_ID ) )
            // InternalMiniARM.g:3016:2: ( RULE_ID )
            {
            // InternalMiniARM.g:3016:2: ( RULE_ID )
            // InternalMiniARM.g:3017:3: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__NameAssignment"


    // $ANTLR start "rule__RMW__SizeAssignment_1"
    // InternalMiniARM.g:3026:1: rule__RMW__SizeAssignment_1 : ( ruleConst ) ;
    public final void rule__RMW__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3030:1: ( ( ruleConst ) )
            // InternalMiniARM.g:3031:2: ( ruleConst )
            {
            // InternalMiniARM.g:3031:2: ( ruleConst )
            // InternalMiniARM.g:3032:3: ruleConst
            {
             before(grammarAccess.getRMWAccess().getSizeConstParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConst();

            state._fsp--;

             after(grammarAccess.getRMWAccess().getSizeConstParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMW__SizeAssignment_1"


    // $ANTLR start "rule__SMW__ValueAssignment_1"
    // InternalMiniARM.g:3041:1: rule__SMW__ValueAssignment_1 : ( ruleConst ) ;
    public final void rule__SMW__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3045:1: ( ( ruleConst ) )
            // InternalMiniARM.g:3046:2: ( ruleConst )
            {
            // InternalMiniARM.g:3046:2: ( ruleConst )
            // InternalMiniARM.g:3047:3: ruleConst
            {
             before(grammarAccess.getSMWAccess().getValueConstParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConst();

            state._fsp--;

             after(grammarAccess.getSMWAccess().getValueConstParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMW__ValueAssignment_1"


    // $ANTLR start "rule__SMS__ValueAssignment_1"
    // InternalMiniARM.g:3056:1: rule__SMS__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SMS__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3060:1: ( ( RULE_STRING ) )
            // InternalMiniARM.g:3061:2: ( RULE_STRING )
            {
            // InternalMiniARM.g:3061:2: ( RULE_STRING )
            // InternalMiniARM.g:3062:3: RULE_STRING
            {
             before(grammarAccess.getSMSAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSMSAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMS__ValueAssignment_1"


    // $ANTLR start "rule__PUSH__RegAssignment_1"
    // InternalMiniARM.g:3071:1: rule__PUSH__RegAssignment_1 : ( ruleRegister ) ;
    public final void rule__PUSH__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3075:1: ( ( ruleRegister ) )
            // InternalMiniARM.g:3076:2: ( ruleRegister )
            {
            // InternalMiniARM.g:3076:2: ( ruleRegister )
            // InternalMiniARM.g:3077:3: ruleRegister
            {
             before(grammarAccess.getPUSHAccess().getRegRegisterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getPUSHAccess().getRegRegisterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PUSH__RegAssignment_1"


    // $ANTLR start "rule__POP__RegAssignment_1"
    // InternalMiniARM.g:3086:1: rule__POP__RegAssignment_1 : ( ruleRegister ) ;
    public final void rule__POP__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3090:1: ( ( ruleRegister ) )
            // InternalMiniARM.g:3091:2: ( ruleRegister )
            {
            // InternalMiniARM.g:3091:2: ( ruleRegister )
            // InternalMiniARM.g:3092:3: ruleRegister
            {
             before(grammarAccess.getPOPAccess().getRegRegisterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getPOPAccess().getRegRegisterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POP__RegAssignment_1"


    // $ANTLR start "rule__LOAD__RegAssignment_1"
    // InternalMiniARM.g:3101:1: rule__LOAD__RegAssignment_1 : ( ruleRegister ) ;
    public final void rule__LOAD__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3105:1: ( ( ruleRegister ) )
            // InternalMiniARM.g:3106:2: ( ruleRegister )
            {
            // InternalMiniARM.g:3106:2: ( ruleRegister )
            // InternalMiniARM.g:3107:3: ruleRegister
            {
             before(grammarAccess.getLOADAccess().getRegRegisterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getLOADAccess().getRegRegisterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOAD__RegAssignment_1"


    // $ANTLR start "rule__LOAD__AddressAssignment_3"
    // InternalMiniARM.g:3116:1: rule__LOAD__AddressAssignment_3 : ( ruleAddress ) ;
    public final void rule__LOAD__AddressAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3120:1: ( ( ruleAddress ) )
            // InternalMiniARM.g:3121:2: ( ruleAddress )
            {
            // InternalMiniARM.g:3121:2: ( ruleAddress )
            // InternalMiniARM.g:3122:3: ruleAddress
            {
             before(grammarAccess.getLOADAccess().getAddressAddressParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getLOADAccess().getAddressAddressParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOAD__AddressAssignment_3"


    // $ANTLR start "rule__Register__NameAssignment_0"
    // InternalMiniARM.g:3131:1: rule__Register__NameAssignment_0 : ( ( 'r0' ) ) ;
    public final void rule__Register__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3135:1: ( ( ( 'r0' ) ) )
            // InternalMiniARM.g:3136:2: ( ( 'r0' ) )
            {
            // InternalMiniARM.g:3136:2: ( ( 'r0' ) )
            // InternalMiniARM.g:3137:3: ( 'r0' )
            {
             before(grammarAccess.getRegisterAccess().getNameR0Keyword_0_0()); 
            // InternalMiniARM.g:3138:3: ( 'r0' )
            // InternalMiniARM.g:3139:4: 'r0'
            {
             before(grammarAccess.getRegisterAccess().getNameR0Keyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRegisterAccess().getNameR0Keyword_0_0()); 

            }

             after(grammarAccess.getRegisterAccess().getNameR0Keyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__NameAssignment_0"


    // $ANTLR start "rule__Register__NameAssignment_1"
    // InternalMiniARM.g:3150:1: rule__Register__NameAssignment_1 : ( ( 'r1' ) ) ;
    public final void rule__Register__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3154:1: ( ( ( 'r1' ) ) )
            // InternalMiniARM.g:3155:2: ( ( 'r1' ) )
            {
            // InternalMiniARM.g:3155:2: ( ( 'r1' ) )
            // InternalMiniARM.g:3156:3: ( 'r1' )
            {
             before(grammarAccess.getRegisterAccess().getNameR1Keyword_1_0()); 
            // InternalMiniARM.g:3157:3: ( 'r1' )
            // InternalMiniARM.g:3158:4: 'r1'
            {
             before(grammarAccess.getRegisterAccess().getNameR1Keyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRegisterAccess().getNameR1Keyword_1_0()); 

            }

             after(grammarAccess.getRegisterAccess().getNameR1Keyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__NameAssignment_1"


    // $ANTLR start "rule__Register__NameAssignment_2"
    // InternalMiniARM.g:3169:1: rule__Register__NameAssignment_2 : ( ( 'r2' ) ) ;
    public final void rule__Register__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3173:1: ( ( ( 'r2' ) ) )
            // InternalMiniARM.g:3174:2: ( ( 'r2' ) )
            {
            // InternalMiniARM.g:3174:2: ( ( 'r2' ) )
            // InternalMiniARM.g:3175:3: ( 'r2' )
            {
             before(grammarAccess.getRegisterAccess().getNameR2Keyword_2_0()); 
            // InternalMiniARM.g:3176:3: ( 'r2' )
            // InternalMiniARM.g:3177:4: 'r2'
            {
             before(grammarAccess.getRegisterAccess().getNameR2Keyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRegisterAccess().getNameR2Keyword_2_0()); 

            }

             after(grammarAccess.getRegisterAccess().getNameR2Keyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__NameAssignment_2"


    // $ANTLR start "rule__Register__NameAssignment_3"
    // InternalMiniARM.g:3188:1: rule__Register__NameAssignment_3 : ( ( 'r3' ) ) ;
    public final void rule__Register__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3192:1: ( ( ( 'r3' ) ) )
            // InternalMiniARM.g:3193:2: ( ( 'r3' ) )
            {
            // InternalMiniARM.g:3193:2: ( ( 'r3' ) )
            // InternalMiniARM.g:3194:3: ( 'r3' )
            {
             before(grammarAccess.getRegisterAccess().getNameR3Keyword_3_0()); 
            // InternalMiniARM.g:3195:3: ( 'r3' )
            // InternalMiniARM.g:3196:4: 'r3'
            {
             before(grammarAccess.getRegisterAccess().getNameR3Keyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRegisterAccess().getNameR3Keyword_3_0()); 

            }

             after(grammarAccess.getRegisterAccess().getNameR3Keyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__NameAssignment_3"


    // $ANTLR start "rule__Register__NameAssignment_4"
    // InternalMiniARM.g:3207:1: rule__Register__NameAssignment_4 : ( ( 'r4' ) ) ;
    public final void rule__Register__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3211:1: ( ( ( 'r4' ) ) )
            // InternalMiniARM.g:3212:2: ( ( 'r4' ) )
            {
            // InternalMiniARM.g:3212:2: ( ( 'r4' ) )
            // InternalMiniARM.g:3213:3: ( 'r4' )
            {
             before(grammarAccess.getRegisterAccess().getNameR4Keyword_4_0()); 
            // InternalMiniARM.g:3214:3: ( 'r4' )
            // InternalMiniARM.g:3215:4: 'r4'
            {
             before(grammarAccess.getRegisterAccess().getNameR4Keyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRegisterAccess().getNameR4Keyword_4_0()); 

            }

             after(grammarAccess.getRegisterAccess().getNameR4Keyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__NameAssignment_4"


    // $ANTLR start "rule__Register__NameAssignment_5"
    // InternalMiniARM.g:3226:1: rule__Register__NameAssignment_5 : ( ( 'r5' ) ) ;
    public final void rule__Register__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3230:1: ( ( ( 'r5' ) ) )
            // InternalMiniARM.g:3231:2: ( ( 'r5' ) )
            {
            // InternalMiniARM.g:3231:2: ( ( 'r5' ) )
            // InternalMiniARM.g:3232:3: ( 'r5' )
            {
             before(grammarAccess.getRegisterAccess().getNameR5Keyword_5_0()); 
            // InternalMiniARM.g:3233:3: ( 'r5' )
            // InternalMiniARM.g:3234:4: 'r5'
            {
             before(grammarAccess.getRegisterAccess().getNameR5Keyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRegisterAccess().getNameR5Keyword_5_0()); 

            }

             after(grammarAccess.getRegisterAccess().getNameR5Keyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__NameAssignment_5"


    // $ANTLR start "rule__Register__NameAssignment_6"
    // InternalMiniARM.g:3245:1: rule__Register__NameAssignment_6 : ( ( 'r6' ) ) ;
    public final void rule__Register__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3249:1: ( ( ( 'r6' ) ) )
            // InternalMiniARM.g:3250:2: ( ( 'r6' ) )
            {
            // InternalMiniARM.g:3250:2: ( ( 'r6' ) )
            // InternalMiniARM.g:3251:3: ( 'r6' )
            {
             before(grammarAccess.getRegisterAccess().getNameR6Keyword_6_0()); 
            // InternalMiniARM.g:3252:3: ( 'r6' )
            // InternalMiniARM.g:3253:4: 'r6'
            {
             before(grammarAccess.getRegisterAccess().getNameR6Keyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRegisterAccess().getNameR6Keyword_6_0()); 

            }

             after(grammarAccess.getRegisterAccess().getNameR6Keyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__NameAssignment_6"


    // $ANTLR start "rule__Register__NameAssignment_7"
    // InternalMiniARM.g:3264:1: rule__Register__NameAssignment_7 : ( ( 'sp' ) ) ;
    public final void rule__Register__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3268:1: ( ( ( 'sp' ) ) )
            // InternalMiniARM.g:3269:2: ( ( 'sp' ) )
            {
            // InternalMiniARM.g:3269:2: ( ( 'sp' ) )
            // InternalMiniARM.g:3270:3: ( 'sp' )
            {
             before(grammarAccess.getRegisterAccess().getNameSpKeyword_7_0()); 
            // InternalMiniARM.g:3271:3: ( 'sp' )
            // InternalMiniARM.g:3272:4: 'sp'
            {
             before(grammarAccess.getRegisterAccess().getNameSpKeyword_7_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRegisterAccess().getNameSpKeyword_7_0()); 

            }

             after(grammarAccess.getRegisterAccess().getNameSpKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__NameAssignment_7"


    // $ANTLR start "rule__Register__NameAssignment_8"
    // InternalMiniARM.g:3283:1: rule__Register__NameAssignment_8 : ( ( 'r7' ) ) ;
    public final void rule__Register__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3287:1: ( ( ( 'r7' ) ) )
            // InternalMiniARM.g:3288:2: ( ( 'r7' ) )
            {
            // InternalMiniARM.g:3288:2: ( ( 'r7' ) )
            // InternalMiniARM.g:3289:3: ( 'r7' )
            {
             before(grammarAccess.getRegisterAccess().getNameR7Keyword_8_0()); 
            // InternalMiniARM.g:3290:3: ( 'r7' )
            // InternalMiniARM.g:3291:4: 'r7'
            {
             before(grammarAccess.getRegisterAccess().getNameR7Keyword_8_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRegisterAccess().getNameR7Keyword_8_0()); 

            }

             after(grammarAccess.getRegisterAccess().getNameR7Keyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__NameAssignment_8"


    // $ANTLR start "rule__Register__NameAssignment_9"
    // InternalMiniARM.g:3302:1: rule__Register__NameAssignment_9 : ( ( 'lr' ) ) ;
    public final void rule__Register__NameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3306:1: ( ( ( 'lr' ) ) )
            // InternalMiniARM.g:3307:2: ( ( 'lr' ) )
            {
            // InternalMiniARM.g:3307:2: ( ( 'lr' ) )
            // InternalMiniARM.g:3308:3: ( 'lr' )
            {
             before(grammarAccess.getRegisterAccess().getNameLrKeyword_9_0()); 
            // InternalMiniARM.g:3309:3: ( 'lr' )
            // InternalMiniARM.g:3310:4: 'lr'
            {
             before(grammarAccess.getRegisterAccess().getNameLrKeyword_9_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRegisterAccess().getNameLrKeyword_9_0()); 

            }

             after(grammarAccess.getRegisterAccess().getNameLrKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__NameAssignment_9"


    // $ANTLR start "rule__Immediate__ValueAssignment_1"
    // InternalMiniARM.g:3321:1: rule__Immediate__ValueAssignment_1 : ( ruleValue ) ;
    public final void rule__Immediate__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3325:1: ( ( ruleValue ) )
            // InternalMiniARM.g:3326:2: ( ruleValue )
            {
            // InternalMiniARM.g:3326:2: ( ruleValue )
            // InternalMiniARM.g:3327:3: ruleValue
            {
             before(grammarAccess.getImmediateAccess().getValueValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getImmediateAccess().getValueValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Immediate__ValueAssignment_1"


    // $ANTLR start "rule__Value__LabelAssignment_2"
    // InternalMiniARM.g:3336:1: rule__Value__LabelAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Value__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3340:1: ( ( ( RULE_ID ) ) )
            // InternalMiniARM.g:3341:2: ( ( RULE_ID ) )
            {
            // InternalMiniARM.g:3341:2: ( ( RULE_ID ) )
            // InternalMiniARM.g:3342:3: ( RULE_ID )
            {
             before(grammarAccess.getValueAccess().getLabelLabelCrossReference_2_0()); 
            // InternalMiniARM.g:3343:3: ( RULE_ID )
            // InternalMiniARM.g:3344:4: RULE_ID
            {
             before(grammarAccess.getValueAccess().getLabelLabelIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getLabelLabelIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getValueAccess().getLabelLabelCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__LabelAssignment_2"


    // $ANTLR start "rule__Const__NumAssignment"
    // InternalMiniARM.g:3355:1: rule__Const__NumAssignment : ( RULE_INT ) ;
    public final void rule__Const__NumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3359:1: ( ( RULE_INT ) )
            // InternalMiniARM.g:3360:2: ( RULE_INT )
            {
            // InternalMiniARM.g:3360:2: ( RULE_INT )
            // InternalMiniARM.g:3361:3: RULE_INT
            {
             before(grammarAccess.getConstAccess().getNumINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConstAccess().getNumINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__NumAssignment"


    // $ANTLR start "rule__HexConst__NumAssignment"
    // InternalMiniARM.g:3370:1: rule__HexConst__NumAssignment : ( RULE_HEXINT ) ;
    public final void rule__HexConst__NumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3374:1: ( ( RULE_HEXINT ) )
            // InternalMiniARM.g:3375:2: ( RULE_HEXINT )
            {
            // InternalMiniARM.g:3375:2: ( RULE_HEXINT )
            // InternalMiniARM.g:3376:3: RULE_HEXINT
            {
             before(grammarAccess.getHexConstAccess().getNumHEXINTTerminalRuleCall_0()); 
            match(input,RULE_HEXINT,FOLLOW_2); 
             after(grammarAccess.getHexConstAccess().getNumHEXINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HexConst__NumAssignment"


    // $ANTLR start "rule__Direct__AddressAssignment"
    // InternalMiniARM.g:3385:1: rule__Direct__AddressAssignment : ( ruleValue ) ;
    public final void rule__Direct__AddressAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3389:1: ( ( ruleValue ) )
            // InternalMiniARM.g:3390:2: ( ruleValue )
            {
            // InternalMiniARM.g:3390:2: ( ruleValue )
            // InternalMiniARM.g:3391:3: ruleValue
            {
             before(grammarAccess.getDirectAccess().getAddressValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getDirectAccess().getAddressValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direct__AddressAssignment"


    // $ANTLR start "rule__DirectReg__RegAssignment_1"
    // InternalMiniARM.g:3400:1: rule__DirectReg__RegAssignment_1 : ( ruleRegister ) ;
    public final void rule__DirectReg__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3404:1: ( ( ruleRegister ) )
            // InternalMiniARM.g:3405:2: ( ruleRegister )
            {
            // InternalMiniARM.g:3405:2: ( ruleRegister )
            // InternalMiniARM.g:3406:3: ruleRegister
            {
             before(grammarAccess.getDirectRegAccess().getRegRegisterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getDirectRegAccess().getRegRegisterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectReg__RegAssignment_1"


    // $ANTLR start "rule__STORE__RegAssignment_1"
    // InternalMiniARM.g:3415:1: rule__STORE__RegAssignment_1 : ( ruleRegister ) ;
    public final void rule__STORE__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3419:1: ( ( ruleRegister ) )
            // InternalMiniARM.g:3420:2: ( ruleRegister )
            {
            // InternalMiniARM.g:3420:2: ( ruleRegister )
            // InternalMiniARM.g:3421:3: ruleRegister
            {
             before(grammarAccess.getSTOREAccess().getRegRegisterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getSTOREAccess().getRegRegisterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STORE__RegAssignment_1"


    // $ANTLR start "rule__STORE__AddressAssignment_3"
    // InternalMiniARM.g:3430:1: rule__STORE__AddressAssignment_3 : ( ruleAddress ) ;
    public final void rule__STORE__AddressAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3434:1: ( ( ruleAddress ) )
            // InternalMiniARM.g:3435:2: ( ruleAddress )
            {
            // InternalMiniARM.g:3435:2: ( ruleAddress )
            // InternalMiniARM.g:3436:3: ruleAddress
            {
             before(grammarAccess.getSTOREAccess().getAddressAddressParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getSTOREAccess().getAddressAddressParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STORE__AddressAssignment_3"


    // $ANTLR start "rule__MOVE__DstAssignment_1"
    // InternalMiniARM.g:3445:1: rule__MOVE__DstAssignment_1 : ( ruleRegister ) ;
    public final void rule__MOVE__DstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3449:1: ( ( ruleRegister ) )
            // InternalMiniARM.g:3450:2: ( ruleRegister )
            {
            // InternalMiniARM.g:3450:2: ( ruleRegister )
            // InternalMiniARM.g:3451:3: ruleRegister
            {
             before(grammarAccess.getMOVEAccess().getDstRegisterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getMOVEAccess().getDstRegisterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__DstAssignment_1"


    // $ANTLR start "rule__MOVE__SrcAssignment_3"
    // InternalMiniARM.g:3460:1: rule__MOVE__SrcAssignment_3 : ( ruleMoveValue ) ;
    public final void rule__MOVE__SrcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3464:1: ( ( ruleMoveValue ) )
            // InternalMiniARM.g:3465:2: ( ruleMoveValue )
            {
            // InternalMiniARM.g:3465:2: ( ruleMoveValue )
            // InternalMiniARM.g:3466:3: ruleMoveValue
            {
             before(grammarAccess.getMOVEAccess().getSrcMoveValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMoveValue();

            state._fsp--;

             after(grammarAccess.getMOVEAccess().getSrcMoveValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__SrcAssignment_3"


    // $ANTLR start "rule__ADD__DstAssignment_1"
    // InternalMiniARM.g:3475:1: rule__ADD__DstAssignment_1 : ( ruleRegister ) ;
    public final void rule__ADD__DstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3479:1: ( ( ruleRegister ) )
            // InternalMiniARM.g:3480:2: ( ruleRegister )
            {
            // InternalMiniARM.g:3480:2: ( ruleRegister )
            // InternalMiniARM.g:3481:3: ruleRegister
            {
             before(grammarAccess.getADDAccess().getDstRegisterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getADDAccess().getDstRegisterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__DstAssignment_1"


    // $ANTLR start "rule__ADD__Src1Assignment_3"
    // InternalMiniARM.g:3490:1: rule__ADD__Src1Assignment_3 : ( ruleRegister ) ;
    public final void rule__ADD__Src1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3494:1: ( ( ruleRegister ) )
            // InternalMiniARM.g:3495:2: ( ruleRegister )
            {
            // InternalMiniARM.g:3495:2: ( ruleRegister )
            // InternalMiniARM.g:3496:3: ruleRegister
            {
             before(grammarAccess.getADDAccess().getSrc1RegisterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getADDAccess().getSrc1RegisterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Src1Assignment_3"


    // $ANTLR start "rule__ADD__Src2Assignment_5"
    // InternalMiniARM.g:3505:1: rule__ADD__Src2Assignment_5 : ( ruleMoveValue ) ;
    public final void rule__ADD__Src2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3509:1: ( ( ruleMoveValue ) )
            // InternalMiniARM.g:3510:2: ( ruleMoveValue )
            {
            // InternalMiniARM.g:3510:2: ( ruleMoveValue )
            // InternalMiniARM.g:3511:3: ruleMoveValue
            {
             before(grammarAccess.getADDAccess().getSrc2MoveValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMoveValue();

            state._fsp--;

             after(grammarAccess.getADDAccess().getSrc2MoveValueParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADD__Src2Assignment_5"


    // $ANTLR start "rule__SUB__DstAssignment_1"
    // InternalMiniARM.g:3520:1: rule__SUB__DstAssignment_1 : ( ruleRegister ) ;
    public final void rule__SUB__DstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3524:1: ( ( ruleRegister ) )
            // InternalMiniARM.g:3525:2: ( ruleRegister )
            {
            // InternalMiniARM.g:3525:2: ( ruleRegister )
            // InternalMiniARM.g:3526:3: ruleRegister
            {
             before(grammarAccess.getSUBAccess().getDstRegisterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getSUBAccess().getDstRegisterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__DstAssignment_1"


    // $ANTLR start "rule__SUB__Src1Assignment_3"
    // InternalMiniARM.g:3535:1: rule__SUB__Src1Assignment_3 : ( ruleRegister ) ;
    public final void rule__SUB__Src1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3539:1: ( ( ruleRegister ) )
            // InternalMiniARM.g:3540:2: ( ruleRegister )
            {
            // InternalMiniARM.g:3540:2: ( ruleRegister )
            // InternalMiniARM.g:3541:3: ruleRegister
            {
             before(grammarAccess.getSUBAccess().getSrc1RegisterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getSUBAccess().getSrc1RegisterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Src1Assignment_3"


    // $ANTLR start "rule__SUB__Src2Assignment_5"
    // InternalMiniARM.g:3550:1: rule__SUB__Src2Assignment_5 : ( ruleMoveValue ) ;
    public final void rule__SUB__Src2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3554:1: ( ( ruleMoveValue ) )
            // InternalMiniARM.g:3555:2: ( ruleMoveValue )
            {
            // InternalMiniARM.g:3555:2: ( ruleMoveValue )
            // InternalMiniARM.g:3556:3: ruleMoveValue
            {
             before(grammarAccess.getSUBAccess().getSrc2MoveValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMoveValue();

            state._fsp--;

             after(grammarAccess.getSUBAccess().getSrc2MoveValueParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUB__Src2Assignment_5"


    // $ANTLR start "rule__CMP__Src1Assignment_1"
    // InternalMiniARM.g:3565:1: rule__CMP__Src1Assignment_1 : ( ruleRegister ) ;
    public final void rule__CMP__Src1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3569:1: ( ( ruleRegister ) )
            // InternalMiniARM.g:3570:2: ( ruleRegister )
            {
            // InternalMiniARM.g:3570:2: ( ruleRegister )
            // InternalMiniARM.g:3571:3: ruleRegister
            {
             before(grammarAccess.getCMPAccess().getSrc1RegisterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getCMPAccess().getSrc1RegisterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMP__Src1Assignment_1"


    // $ANTLR start "rule__CMP__Src2Assignment_3"
    // InternalMiniARM.g:3580:1: rule__CMP__Src2Assignment_3 : ( ruleMoveValue ) ;
    public final void rule__CMP__Src2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3584:1: ( ( ruleMoveValue ) )
            // InternalMiniARM.g:3585:2: ( ruleMoveValue )
            {
            // InternalMiniARM.g:3585:2: ( ruleMoveValue )
            // InternalMiniARM.g:3586:3: ruleMoveValue
            {
             before(grammarAccess.getCMPAccess().getSrc2MoveValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMoveValue();

            state._fsp--;

             after(grammarAccess.getCMPAccess().getSrc2MoveValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMP__Src2Assignment_3"


    // $ANTLR start "rule__BEQ__DestAssignment_1"
    // InternalMiniARM.g:3595:1: rule__BEQ__DestAssignment_1 : ( ruleBranchAddress ) ;
    public final void rule__BEQ__DestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3599:1: ( ( ruleBranchAddress ) )
            // InternalMiniARM.g:3600:2: ( ruleBranchAddress )
            {
            // InternalMiniARM.g:3600:2: ( ruleBranchAddress )
            // InternalMiniARM.g:3601:3: ruleBranchAddress
            {
             before(grammarAccess.getBEQAccess().getDestBranchAddressParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBranchAddress();

            state._fsp--;

             after(grammarAccess.getBEQAccess().getDestBranchAddressParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BEQ__DestAssignment_1"


    // $ANTLR start "rule__BLT__DestAssignment_1"
    // InternalMiniARM.g:3610:1: rule__BLT__DestAssignment_1 : ( ruleBranchAddress ) ;
    public final void rule__BLT__DestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3614:1: ( ( ruleBranchAddress ) )
            // InternalMiniARM.g:3615:2: ( ruleBranchAddress )
            {
            // InternalMiniARM.g:3615:2: ( ruleBranchAddress )
            // InternalMiniARM.g:3616:3: ruleBranchAddress
            {
             before(grammarAccess.getBLTAccess().getDestBranchAddressParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBranchAddress();

            state._fsp--;

             after(grammarAccess.getBLTAccess().getDestBranchAddressParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLT__DestAssignment_1"


    // $ANTLR start "rule__BRANCH__DestAssignment_1"
    // InternalMiniARM.g:3625:1: rule__BRANCH__DestAssignment_1 : ( ruleBranchAddress ) ;
    public final void rule__BRANCH__DestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3629:1: ( ( ruleBranchAddress ) )
            // InternalMiniARM.g:3630:2: ( ruleBranchAddress )
            {
            // InternalMiniARM.g:3630:2: ( ruleBranchAddress )
            // InternalMiniARM.g:3631:3: ruleBranchAddress
            {
             before(grammarAccess.getBRANCHAccess().getDestBranchAddressParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBranchAddress();

            state._fsp--;

             after(grammarAccess.getBRANCHAccess().getDestBranchAddressParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BRANCH__DestAssignment_1"


    // $ANTLR start "rule__BLINK__RegAssignment_1"
    // InternalMiniARM.g:3640:1: rule__BLINK__RegAssignment_1 : ( ruleRegister ) ;
    public final void rule__BLINK__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3644:1: ( ( ruleRegister ) )
            // InternalMiniARM.g:3645:2: ( ruleRegister )
            {
            // InternalMiniARM.g:3645:2: ( ruleRegister )
            // InternalMiniARM.g:3646:3: ruleRegister
            {
             before(grammarAccess.getBLINKAccess().getRegRegisterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getBLINKAccess().getRegRegisterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLINK__RegAssignment_1"


    // $ANTLR start "rule__BLINK__DestAssignment_3"
    // InternalMiniARM.g:3655:1: rule__BLINK__DestAssignment_3 : ( ruleBranchAddress ) ;
    public final void rule__BLINK__DestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniARM.g:3659:1: ( ( ruleBranchAddress ) )
            // InternalMiniARM.g:3660:2: ( ruleBranchAddress )
            {
            // InternalMiniARM.g:3660:2: ( ruleBranchAddress )
            // InternalMiniARM.g:3661:3: ruleBranchAddress
            {
             before(grammarAccess.getBLINKAccess().getDestBranchAddressParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBranchAddress();

            state._fsp--;

             after(grammarAccess.getBLINKAccess().getDestBranchAddressParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLINK__DestAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000FF87F032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000FF87F030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000003FF00000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200380L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000003FF00100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000003FF00000380L});

}