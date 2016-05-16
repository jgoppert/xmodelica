/*
 * generated by Xtext 2.9.2
 */
package xmodelica.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import xmodelica.modelica.StoredDefinition

@RunWith(XtextRunner)
@InjectWith(ModelicaInjectorProvider)
class ModelicaParsingTest{

	@Inject
	ParseHelper<StoredDefinition> parser;

	@Test 
	def void within() {
		val result = parser.parse('''
			within Blah.Blah;
			class Ball
			end Ball;
		''')
		Assert.assertNotNull(result)
	}

	@Test 
	def void components() {
		val result = parser.parse('''
			class Ball
				Real a=1;
				Bool c=2;
			end Ball;
		''')
		Assert.assertNotNull(result)
	}

	@Test 
	def void equation() {
		val result = parser.parse('''
			class Ball
				Real a;
			equation
				a = 1;
			end Ball;
		''')
		Assert.assertNotNull(result)
	}

	@Test 
	def void derivative() {
		val result = parser.parse('''
			class Ball
				Real a;
			equation
				der(a) = 1;
			end Ball;
		''')
	}


}
