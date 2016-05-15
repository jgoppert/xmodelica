/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xmodelica.modelica.Equation;
import xmodelica.modelica.ForEquation;
import xmodelica.modelica.ForIndices;
import xmodelica.modelica.ModelicaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.impl.ForEquationImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link xmodelica.modelica.impl.ForEquationImpl#getEqs <em>Eqs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForEquationImpl extends MinimalEObjectImpl.Container implements ForEquation
{
  /**
   * The cached value of the '{@link #getIndices() <em>Indices</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndices()
   * @generated
   * @ordered
   */
  protected ForIndices indices;

  /**
   * The cached value of the '{@link #getEqs() <em>Eqs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEqs()
   * @generated
   * @ordered
   */
  protected EList<Equation> eqs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForEquationImpl()
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
    return ModelicaPackage.Literals.FOR_EQUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForIndices getIndices()
  {
    return indices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndices(ForIndices newIndices, NotificationChain msgs)
  {
    ForIndices oldIndices = indices;
    indices = newIndices;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaPackage.FOR_EQUATION__INDICES, oldIndices, newIndices);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndices(ForIndices newIndices)
  {
    if (newIndices != indices)
    {
      NotificationChain msgs = null;
      if (indices != null)
        msgs = ((InternalEObject)indices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaPackage.FOR_EQUATION__INDICES, null, msgs);
      if (newIndices != null)
        msgs = ((InternalEObject)newIndices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaPackage.FOR_EQUATION__INDICES, null, msgs);
      msgs = basicSetIndices(newIndices, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.FOR_EQUATION__INDICES, newIndices, newIndices));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Equation> getEqs()
  {
    if (eqs == null)
    {
      eqs = new EObjectContainmentEList<Equation>(Equation.class, this, ModelicaPackage.FOR_EQUATION__EQS);
    }
    return eqs;
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
      case ModelicaPackage.FOR_EQUATION__INDICES:
        return basicSetIndices(null, msgs);
      case ModelicaPackage.FOR_EQUATION__EQS:
        return ((InternalEList<?>)getEqs()).basicRemove(otherEnd, msgs);
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
      case ModelicaPackage.FOR_EQUATION__INDICES:
        return getIndices();
      case ModelicaPackage.FOR_EQUATION__EQS:
        return getEqs();
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
      case ModelicaPackage.FOR_EQUATION__INDICES:
        setIndices((ForIndices)newValue);
        return;
      case ModelicaPackage.FOR_EQUATION__EQS:
        getEqs().clear();
        getEqs().addAll((Collection<? extends Equation>)newValue);
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
      case ModelicaPackage.FOR_EQUATION__INDICES:
        setIndices((ForIndices)null);
        return;
      case ModelicaPackage.FOR_EQUATION__EQS:
        getEqs().clear();
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
      case ModelicaPackage.FOR_EQUATION__INDICES:
        return indices != null;
      case ModelicaPackage.FOR_EQUATION__EQS:
        return eqs != null && !eqs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ForEquationImpl
