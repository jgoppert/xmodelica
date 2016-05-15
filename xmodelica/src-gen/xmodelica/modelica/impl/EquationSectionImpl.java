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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xmodelica.modelica.Equation;
import xmodelica.modelica.EquationSection;
import xmodelica.modelica.ModelicaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equation Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.impl.EquationSectionImpl#getEquationss <em>Equationss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquationSectionImpl extends MinimalEObjectImpl.Container implements EquationSection
{
  /**
   * The cached value of the '{@link #getEquationss() <em>Equationss</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquationss()
   * @generated
   * @ordered
   */
  protected EList<Equation> equationss;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EquationSectionImpl()
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
    return ModelicaPackage.Literals.EQUATION_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Equation> getEquationss()
  {
    if (equationss == null)
    {
      equationss = new EObjectContainmentEList<Equation>(Equation.class, this, ModelicaPackage.EQUATION_SECTION__EQUATIONSS);
    }
    return equationss;
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
      case ModelicaPackage.EQUATION_SECTION__EQUATIONSS:
        return ((InternalEList<?>)getEquationss()).basicRemove(otherEnd, msgs);
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
      case ModelicaPackage.EQUATION_SECTION__EQUATIONSS:
        return getEquationss();
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
      case ModelicaPackage.EQUATION_SECTION__EQUATIONSS:
        getEquationss().clear();
        getEquationss().addAll((Collection<? extends Equation>)newValue);
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
      case ModelicaPackage.EQUATION_SECTION__EQUATIONSS:
        getEquationss().clear();
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
      case ModelicaPackage.EQUATION_SECTION__EQUATIONSS:
        return equationss != null && !equationss.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EquationSectionImpl