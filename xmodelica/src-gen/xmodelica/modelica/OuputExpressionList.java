/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ouput Expression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.OuputExpressionList#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see xmodelica.modelica.ModelicaPackage#getOuputExpressionList()
 * @model
 * @generated
 */
public interface OuputExpressionList extends OutputExpressionList
{
  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link xmodelica.modelica.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see xmodelica.modelica.ModelicaPackage#getOuputExpressionList_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExprs();

} // OuputExpressionList
