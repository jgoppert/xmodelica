/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.Statement#getLeft <em>Left</em>}</li>
 *   <li>{@link xmodelica.modelica.Statement#getRight <em>Right</em>}</li>
 *   <li>{@link xmodelica.modelica.Statement#getRef <em>Ref</em>}</li>
 *   <li>{@link xmodelica.modelica.Statement#getRef_call <em>Ref call</em>}</li>
 *   <li>{@link xmodelica.modelica.Statement#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see xmodelica.modelica.ModelicaPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
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
   * @see #setLeft(EObject)
   * @see xmodelica.modelica.ModelicaPackage#getStatement_Left()
   * @model containment="true"
   * @generated
   */
  EObject getLeft();

  /**
   * Sets the value of the '{@link xmodelica.modelica.Statement#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(EObject value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(EObject)
   * @see xmodelica.modelica.ModelicaPackage#getStatement_Right()
   * @model containment="true"
   * @generated
   */
  EObject getRight();

  /**
   * Sets the value of the '{@link xmodelica.modelica.Statement#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(EObject value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(ComponentReference)
   * @see xmodelica.modelica.ModelicaPackage#getStatement_Ref()
   * @model containment="true"
   * @generated
   */
  ComponentReference getRef();

  /**
   * Sets the value of the '{@link xmodelica.modelica.Statement#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ComponentReference value);

  /**
   * Returns the value of the '<em><b>Ref call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref call</em>' containment reference.
   * @see #setRef_call(FunctionCallArgs)
   * @see xmodelica.modelica.ModelicaPackage#getStatement_Ref_call()
   * @model containment="true"
   * @generated
   */
  FunctionCallArgs getRef_call();

  /**
   * Sets the value of the '{@link xmodelica.modelica.Statement#getRef_call <em>Ref call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref call</em>' containment reference.
   * @see #getRef_call()
   * @generated
   */
  void setRef_call(FunctionCallArgs value);

  /**
   * Returns the value of the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' containment reference.
   * @see #setComment(Comment)
   * @see xmodelica.modelica.ModelicaPackage#getStatement_Comment()
   * @model containment="true"
   * @generated
   */
  Comment getComment();

  /**
   * Sets the value of the '{@link xmodelica.modelica.Statement#getComment <em>Comment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' containment reference.
   * @see #getComment()
   * @generated
   */
  void setComment(Comment value);

} // Statement
