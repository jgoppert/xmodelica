/*
 * generated by Xtext 2.9.2
 */
grammar InternalModelica;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package xmodelica.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package xmodelica.ide.contentassist.antlr.internal;

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
import xmodelica.services.ModelicaGrammarAccess;

}
@parser::members {
	private ModelicaGrammarAccess grammarAccess;

	public void setGrammarAccess(ModelicaGrammarAccess grammarAccess) {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGreetingsAssignment()); }
		(rule__Model__GreetingsAssignment)*
		{ after(grammarAccess.getModelAccess().getGreetingsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClass
entryRuleClass
:
{ before(grammarAccess.getClassRule()); }
	 ruleClass
{ after(grammarAccess.getClassRule()); } 
	 EOF 
;

// Rule Class
ruleClass 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClassAccess().getGroup()); }
		(rule__Class__Group__0)
		{ after(grammarAccess.getClassAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group__0__Impl
	rule__Class__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getClassKeyword_0()); }
	'class'
	{ after(grammarAccess.getClassAccess().getClassKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group__1__Impl
	rule__Class__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getNameAssignment_1()); }
	(rule__Class__NameAssignment_1)
	{ after(grammarAccess.getClassAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group__2__Impl
	rule__Class__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getEquationKeyword_2()); }
	('equation')?
	{ after(grammarAccess.getClassAccess().getEquationKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group__3__Impl
	rule__Class__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getEndKeyword_3()); }
	'end'
	{ after(grammarAccess.getClassAccess().getEndKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group__4__Impl
	rule__Class__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getName_endAssignment_4()); }
	(rule__Class__Name_endAssignment_4)
	{ after(grammarAccess.getClassAccess().getName_endAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getClassAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__GreetingsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getGreetingsClassParserRuleCall_0()); }
		ruleClass
		{ after(grammarAccess.getModelAccess().getGreetingsClassParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Name_endAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassAccess().getName_endIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getClassAccess().getName_endIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
