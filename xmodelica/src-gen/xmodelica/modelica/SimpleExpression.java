/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.SimpleExpression#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see xmodelica.modelica.ModelicaPackage#getSimpleExpression()
 * @model
 * @generated
 */
public interface SimpleExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link xmodelica.modelica.LogicalExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see xmodelica.modelica.ModelicaPackage#getSimpleExpression_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<LogicalExpression> getExprs();

} // SimpleExpression