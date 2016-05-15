/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.EnumList#getEnums <em>Enums</em>}</li>
 * </ul>
 *
 * @see xmodelica.modelica.ModelicaPackage#getEnumList()
 * @model
 * @generated
 */
public interface EnumList extends ClassSpecifier, ShortClassDefinition
{
  /**
   * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
   * The list contents are of type {@link xmodelica.modelica.EnumerationLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enums</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enums</em>' containment reference list.
   * @see xmodelica.modelica.ModelicaPackage#getEnumList_Enums()
   * @model containment="true"
   * @generated
   */
  EList<EnumerationLiteral> getEnums();

} // EnumList
