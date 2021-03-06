/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.Relation#getLeft <em>Left</em>}</li>
 *   <li>{@link xmodelica.modelica.Relation#getRel_op <em>Rel op</em>}</li>
 *   <li>{@link xmodelica.modelica.Relation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see xmodelica.modelica.ModelicaPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends LogicalFactor
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
   * @see #setLeft(ArithmeticExpression)
   * @see xmodelica.modelica.ModelicaPackage#getRelation_Left()
   * @model containment="true"
   * @generated
   */
  ArithmeticExpression getLeft();

  /**
   * Sets the value of the '{@link xmodelica.modelica.Relation#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ArithmeticExpression value);

  /**
   * Returns the value of the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel op</em>' attribute.
   * @see #setRel_op(String)
   * @see xmodelica.modelica.ModelicaPackage#getRelation_Rel_op()
   * @model
   * @generated
   */
  String getRel_op();

  /**
   * Sets the value of the '{@link xmodelica.modelica.Relation#getRel_op <em>Rel op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel op</em>' attribute.
   * @see #getRel_op()
   * @generated
   */
  void setRel_op(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ArithmeticExpression)
   * @see xmodelica.modelica.ModelicaPackage#getRelation_Right()
   * @model containment="true"
   * @generated
   */
  ArithmeticExpression getRight();

  /**
   * Sets the value of the '{@link xmodelica.modelica.Relation#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ArithmeticExpression value);

} // Relation
