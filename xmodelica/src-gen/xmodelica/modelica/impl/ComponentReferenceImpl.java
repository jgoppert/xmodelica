/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xmodelica.modelica.ArraySubscripts;
import xmodelica.modelica.ComponentReference;
import xmodelica.modelica.ModelicaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.impl.ComponentReferenceImpl#getIdents <em>Idents</em>}</li>
 *   <li>{@link xmodelica.modelica.impl.ComponentReferenceImpl#getSubscripts <em>Subscripts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentReferenceImpl extends MinimalEObjectImpl.Container implements ComponentReference
{
  /**
   * The cached value of the '{@link #getIdents() <em>Idents</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdents()
   * @generated
   * @ordered
   */
  protected EList<String> idents;

  /**
   * The cached value of the '{@link #getSubscripts() <em>Subscripts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubscripts()
   * @generated
   * @ordered
   */
  protected EList<ArraySubscripts> subscripts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModelicaPackage.Literals.COMPONENT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIdents()
  {
    if (idents == null)
    {
      idents = new EDataTypeEList<String>(String.class, this, ModelicaPackage.COMPONENT_REFERENCE__IDENTS);
    }
    return idents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArraySubscripts> getSubscripts()
  {
    if (subscripts == null)
    {
      subscripts = new EObjectContainmentEList<ArraySubscripts>(ArraySubscripts.class, this, ModelicaPackage.COMPONENT_REFERENCE__SUBSCRIPTS);
    }
    return subscripts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModelicaPackage.COMPONENT_REFERENCE__SUBSCRIPTS:
        return ((InternalEList<?>)getSubscripts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModelicaPackage.COMPONENT_REFERENCE__IDENTS:
        return getIdents();
      case ModelicaPackage.COMPONENT_REFERENCE__SUBSCRIPTS:
        return getSubscripts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelicaPackage.COMPONENT_REFERENCE__IDENTS:
        getIdents().clear();
        getIdents().addAll((Collection<? extends String>)newValue);
        return;
      case ModelicaPackage.COMPONENT_REFERENCE__SUBSCRIPTS:
        getSubscripts().clear();
        getSubscripts().addAll((Collection<? extends ArraySubscripts>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModelicaPackage.COMPONENT_REFERENCE__IDENTS:
        getIdents().clear();
        return;
      case ModelicaPackage.COMPONENT_REFERENCE__SUBSCRIPTS:
        getSubscripts().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModelicaPackage.COMPONENT_REFERENCE__IDENTS:
        return idents != null && !idents.isEmpty();
      case ModelicaPackage.COMPONENT_REFERENCE__SUBSCRIPTS:
        return subscripts != null && !subscripts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (idents: ");
    result.append(idents);
    result.append(')');
    return result.toString();
  }

} //ComponentReferenceImpl
