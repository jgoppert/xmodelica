/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xmodelica.modelica.ConstrainingClause;
import xmodelica.modelica.ElementReplaceable;
import xmodelica.modelica.ModelicaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Replaceable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.impl.ElementReplaceableImpl#getConst <em>Const</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementReplaceableImpl extends ElementModicationOrReplaceableImpl implements ElementReplaceable
{
  /**
   * The cached value of the '{@link #getConst() <em>Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConst()
   * @generated
   * @ordered
   */
  protected ConstrainingClause const_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementReplaceableImpl()
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
    return ModelicaPackage.Literals.ELEMENT_REPLACEABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstrainingClause getConst()
  {
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConst(ConstrainingClause newConst, NotificationChain msgs)
  {
    ConstrainingClause oldConst = const_;
    const_ = newConst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaPackage.ELEMENT_REPLACEABLE__CONST, oldConst, newConst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConst(ConstrainingClause newConst)
  {
    if (newConst != const_)
    {
      NotificationChain msgs = null;
      if (const_ != null)
        msgs = ((InternalEObject)const_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaPackage.ELEMENT_REPLACEABLE__CONST, null, msgs);
      if (newConst != null)
        msgs = ((InternalEObject)newConst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaPackage.ELEMENT_REPLACEABLE__CONST, null, msgs);
      msgs = basicSetConst(newConst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.ELEMENT_REPLACEABLE__CONST, newConst, newConst));
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
      case ModelicaPackage.ELEMENT_REPLACEABLE__CONST:
        return basicSetConst(null, msgs);
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
      case ModelicaPackage.ELEMENT_REPLACEABLE__CONST:
        return getConst();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelicaPackage.ELEMENT_REPLACEABLE__CONST:
        setConst((ConstrainingClause)newValue);
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
      case ModelicaPackage.ELEMENT_REPLACEABLE__CONST:
        setConst((ConstrainingClause)null);
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
      case ModelicaPackage.ELEMENT_REPLACEABLE__CONST:
        return const_ != null;
    }
    return super.eIsSet(featureID);
  }

} //ElementReplaceableImpl
