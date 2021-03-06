/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Indices</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.ForIndices#getIndices <em>Indices</em>}</li>
 * </ul>
 *
 * @see xmodelica.modelica.ModelicaPackage#getForIndices()
 * @model
 * @generated
 */
public interface ForIndices extends EObject
{
  /**
   * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
   * The list contents are of type {@link xmodelica.modelica.ForIndex}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indices</em>' containment reference list.
   * @see xmodelica.modelica.ModelicaPackage#getForIndices_Indices()
   * @model containment="true"
   * @generated
   */
  EList<ForIndex> getIndices();

} // ForIndices
