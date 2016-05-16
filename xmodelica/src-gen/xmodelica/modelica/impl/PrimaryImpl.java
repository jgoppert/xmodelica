/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xmodelica.modelica.ExpressionList;
import xmodelica.modelica.ModelicaPackage;
import xmodelica.modelica.Primary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.impl.PrimaryImpl#getRes <em>Res</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryImpl extends FactorImpl implements Primary
{
  /**
   * The cached value of the '{@link #getRes() <em>Res</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRes()
   * @generated
   * @ordered
   */
  protected EList<ExpressionList> res;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryImpl()
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
    return ModelicaPackage.Literals.PRIMARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpressionList> getRes()
  {
    if (res == null)
    {
      res = new EObjectContainmentEList<ExpressionList>(ExpressionList.class, this, ModelicaPackage.PRIMARY__RES);
    }
    return res;
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
      case ModelicaPackage.PRIMARY__RES:
        return ((InternalEList<?>)getRes()).basicRemove(otherEnd, msgs);
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
      case ModelicaPackage.PRIMARY__RES:
        return getRes();
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
      case ModelicaPackage.PRIMARY__RES:
        getRes().clear();
        getRes().addAll((Collection<? extends ExpressionList>)newValue);
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
      case ModelicaPackage.PRIMARY__RES:
        getRes().clear();
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
      case ModelicaPackage.PRIMARY__RES:
        return res != null && !res.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PrimaryImpl
