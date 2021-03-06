/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.ClassDefinition#isFinal <em>Final</em>}</li>
 *   <li>{@link xmodelica.modelica.ClassDefinition#isEncapsulated <em>Encapsulated</em>}</li>
 *   <li>{@link xmodelica.modelica.ClassDefinition#getName <em>Name</em>}</li>
 *   <li>{@link xmodelica.modelica.ClassDefinition#getStr_comment <em>Str comment</em>}</li>
 *   <li>{@link xmodelica.modelica.ClassDefinition#getComposition <em>Composition</em>}</li>
 *   <li>{@link xmodelica.modelica.ClassDefinition#getName_end <em>Name end</em>}</li>
 *   <li>{@link xmodelica.modelica.ClassDefinition#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link xmodelica.modelica.ClassDefinition#getName2 <em>Name2</em>}</li>
 *   <li>{@link xmodelica.modelica.ClassDefinition#getSubs <em>Subs</em>}</li>
 *   <li>{@link xmodelica.modelica.ClassDefinition#getMod <em>Mod</em>}</li>
 * </ul>
 *
 * @see xmodelica.modelica.ModelicaPackage#getClassDefinition()
 * @model
 * @generated
 */
public interface ClassDefinition extends Element
{
  /**
   * Returns the value of the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final</em>' attribute.
   * @see #setFinal(boolean)
   * @see xmodelica.modelica.ModelicaPackage#getClassDefinition_Final()
   * @model
   * @generated
   */
  boolean isFinal();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ClassDefinition#isFinal <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final</em>' attribute.
   * @see #isFinal()
   * @generated
   */
  void setFinal(boolean value);

  /**
   * Returns the value of the '<em><b>Encapsulated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Encapsulated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Encapsulated</em>' attribute.
   * @see #setEncapsulated(boolean)
   * @see xmodelica.modelica.ModelicaPackage#getClassDefinition_Encapsulated()
   * @model
   * @generated
   */
  boolean isEncapsulated();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ClassDefinition#isEncapsulated <em>Encapsulated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Encapsulated</em>' attribute.
   * @see #isEncapsulated()
   * @generated
   */
  void setEncapsulated(boolean value);

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
   * @see xmodelica.modelica.ModelicaPackage#getClassDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ClassDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Str comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str comment</em>' attribute.
   * @see #setStr_comment(String)
   * @see xmodelica.modelica.ModelicaPackage#getClassDefinition_Str_comment()
   * @model
   * @generated
   */
  String getStr_comment();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ClassDefinition#getStr_comment <em>Str comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str comment</em>' attribute.
   * @see #getStr_comment()
   * @generated
   */
  void setStr_comment(String value);

  /**
   * Returns the value of the '<em><b>Composition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composition</em>' containment reference.
   * @see #setComposition(Composition)
   * @see xmodelica.modelica.ModelicaPackage#getClassDefinition_Composition()
   * @model containment="true"
   * @generated
   */
  Composition getComposition();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ClassDefinition#getComposition <em>Composition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composition</em>' containment reference.
   * @see #getComposition()
   * @generated
   */
  void setComposition(Composition value);

  /**
   * Returns the value of the '<em><b>Name end</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name end</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name end</em>' attribute.
   * @see #setName_end(String)
   * @see xmodelica.modelica.ModelicaPackage#getClassDefinition_Name_end()
   * @model
   * @generated
   */
  String getName_end();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ClassDefinition#getName_end <em>Name end</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name end</em>' attribute.
   * @see #getName_end()
   * @generated
   */
  void setName_end(String value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' attribute.
   * @see #setPrefix(String)
   * @see xmodelica.modelica.ModelicaPackage#getClassDefinition_Prefix()
   * @model
   * @generated
   */
  String getPrefix();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ClassDefinition#getPrefix <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' attribute.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(String value);

  /**
   * Returns the value of the '<em><b>Name2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name2</em>' attribute.
   * @see #setName2(String)
   * @see xmodelica.modelica.ModelicaPackage#getClassDefinition_Name2()
   * @model
   * @generated
   */
  String getName2();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ClassDefinition#getName2 <em>Name2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name2</em>' attribute.
   * @see #getName2()
   * @generated
   */
  void setName2(String value);

  /**
   * Returns the value of the '<em><b>Subs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subs</em>' containment reference.
   * @see #setSubs(ArraySubscripts)
   * @see xmodelica.modelica.ModelicaPackage#getClassDefinition_Subs()
   * @model containment="true"
   * @generated
   */
  ArraySubscripts getSubs();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ClassDefinition#getSubs <em>Subs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subs</em>' containment reference.
   * @see #getSubs()
   * @generated
   */
  void setSubs(ArraySubscripts value);

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
   * @see xmodelica.modelica.ModelicaPackage#getClassDefinition_Mod()
   * @model containment="true"
   * @generated
   */
  ClassModification getMod();

  /**
   * Sets the value of the '{@link xmodelica.modelica.ClassDefinition#getMod <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod</em>' containment reference.
   * @see #getMod()
   * @generated
   */
  void setMod(ClassModification value);

} // ClassDefinition
