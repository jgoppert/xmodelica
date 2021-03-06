/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.ForEquation#getIndices <em>Indices</em>}</li>
 *   <li>{@link xmodelica.modelica.ForEquation#getEqs <em>Eqs</em>}</li>
 * </ul>
 *
 * @see xmodelica.modelica.ModelicaPackage#getForEquation()
 * @model
 * @generated
 */
public interface ForEquation extends Equation
{
  /**
   * Returns the value of the '<em><b>Indices</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indices</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indices</em>' containment reference.
   * @see #setIndices(ForIndices)
   * @see xmodelica.modelica.ModelicaPackage#getForEquation_Indices()
   * @model containment="true"
   * @generated
   */
  ForIndices getIndices();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ForEquation#getIndices <em>Indices</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Indices</em>' containment reference.
   * @see #getIndices()
   * @generated
   */
  void setIndices(ForIndices value);

  /**
   * Returns the value of the '<em><b>Eqs</b></em>' containment reference list.
   * The list contents are of type {@link xmodelica.modelica.Equation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eqs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eqs</em>' containment reference list.
   * @see xmodelica.modelica.ModelicaPackage#getForEquation_Eqs()
   * @model containment="true"
   * @generated
   */
  EList<Equation> getEqs();

} // ForEquation
