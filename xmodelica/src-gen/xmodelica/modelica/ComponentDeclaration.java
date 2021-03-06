/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.ComponentDeclaration#getDecl <em>Decl</em>}</li>
 *   <li>{@link xmodelica.modelica.ComponentDeclaration#getCond <em>Cond</em>}</li>
 *   <li>{@link xmodelica.modelica.ComponentDeclaration#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see xmodelica.modelica.ModelicaPackage#getComponentDeclaration()
 * @model
 * @generated
 */
public interface ComponentDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference.
   * @see #setDecl(Declaration)
   * @see xmodelica.modelica.ModelicaPackage#getComponentDeclaration_Decl()
   * @model containment="true"
   * @generated
   */
  Declaration getDecl();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ComponentDeclaration#getDecl <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decl</em>' containment reference.
   * @see #getDecl()
   * @generated
   */
  void setDecl(Declaration value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(ConditionAttribute)
   * @see xmodelica.modelica.ModelicaPackage#getComponentDeclaration_Cond()
   * @model containment="true"
   * @generated
   */
  ConditionAttribute getCond();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ComponentDeclaration#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(ConditionAttribute value);

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
   * @see xmodelica.modelica.ModelicaPackage#getComponentDeclaration_Comment()
   * @model containment="true"
   * @generated
   */
  Comment getComment();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ComponentDeclaration#getComment <em>Comment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' containment reference.
   * @see #getComment()
   * @generated
   */
  void setComment(Comment value);

} // ComponentDeclaration
