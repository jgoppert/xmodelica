/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraining Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.ConstrainingClause#getName <em>Name</em>}</li>
 *   <li>{@link xmodelica.modelica.ConstrainingClause#getMod <em>Mod</em>}</li>
 * </ul>
 *
 * @see xmodelica.modelica.ModelicaPackage#getConstrainingClause()
 * @model
 * @generated
 */
public interface ConstrainingClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see xmodelica.modelica.ModelicaPackage#getConstrainingClause_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ConstrainingClause#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mod</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod</em>' containment reference.
   * @see #setMod(ClassModification)
   * @see xmodelica.modelica.ModelicaPackage#getConstrainingClause_Mod()
   * @model containment="true"
   * @generated
   */
  ClassModification getMod();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ConstrainingClause#getMod <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod</em>' containment reference.
   * @see #getMod()
   * @generated
   */
  void setMod(ClassModification value);

} // ConstrainingClause
