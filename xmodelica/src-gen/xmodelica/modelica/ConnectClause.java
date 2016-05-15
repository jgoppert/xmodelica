/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connect Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.ConnectClause#getLeft <em>Left</em>}</li>
 *   <li>{@link xmodelica.modelica.ConnectClause#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see xmodelica.modelica.ModelicaPackage#getConnectClause()
 * @model
 * @generated
 */
public interface ConnectClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ComponentReference)
   * @see xmodelica.modelica.ModelicaPackage#getConnectClause_Left()
   * @model containment="true"
   * @generated
   */
  ComponentReference getLeft();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ConnectClause#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ComponentReference value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ComponentReference)
   * @see xmodelica.modelica.ModelicaPackage#getConnectClause_Right()
   * @model containment="true"
   * @generated
   */
  ComponentReference getRight();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ConnectClause#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ComponentReference value);

} // ConnectClause