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
import xmodelica.modelica.Expression;
import xmodelica.modelica.IfEquation;
import xmodelica.modelica.ModelicaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xmodelica.modelica.impl.IfEquationImpl#getIf_expr <em>If expr</em>}</li>
 *   <li>{@link xmodelica.modelica.impl.IfEquationImpl#getIf_eqs <em>If eqs</em>}</li>
 *   <li>{@link xmodelica.modelica.impl.IfEquationImpl#getElsif_exprs <em>Elsif exprs</em>}</li>
 *   <li>{@link xmodelica.modelica.impl.IfEquationImpl#getElseif_eqs <em>Elseif eqs</em>}</li>
 *   <li>{@link xmodelica.modelica.impl.IfEquationImpl#getElse_eqs <em>Else eqs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfEquationImpl extends MinimalEObjectImpl.Container implements IfEquation
{
  /**
   * The cached value of the '{@link #getIf_expr() <em>If expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf_expr()
   * @generated
   * @ordered
   */
  protected Expression if_expr;

  /**
   * The cached value of the '{@link #getIf_eqs() <em>If eqs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf_eqs()
   * @generated
   * @ordered
   */
  protected EList<Equation> if_eqs;

  /**
   * The cached value of the '{@link #getElsif_exprs() <em>Elsif exprs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsif_exprs()
   * @generated
   * @ordered
   */
  protected EList<Expression> elsif_exprs;

  /**
   * The cached value of the '{@link #getElseif_eqs() <em>Elseif eqs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseif_eqs()
   * @generated
   * @ordered
   */
  protected EList<Equation> elseif_eqs;

  /**
   * The cached value of the '{@link #getElse_eqs() <em>Else eqs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse_eqs()
   * @generated
   * @ordered
   */
  protected EList<Equation> else_eqs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfEquationImpl()
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
    return ModelicaPackage.Literals.IF_EQUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getIf_expr()
  {
    return if_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf_expr(Expression newIf_expr, NotificationChain msgs)
  {
    Expression oldIf_expr = if_expr;
    if_expr = newIf_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaPackage.IF_EQUATION__IF_EXPR, oldIf_expr, newIf_expr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIf_expr(Expression newIf_expr)
  {
    if (newIf_expr != if_expr)
    {
      NotificationChain msgs = null;
      if (if_expr != null)
        msgs = ((InternalEObject)if_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaPackage.IF_EQUATION__IF_EXPR, null, msgs);
      if (newIf_expr != null)
        msgs = ((InternalEObject)newIf_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaPackage.IF_EQUATION__IF_EXPR, null, msgs);
      msgs = basicSetIf_expr(newIf_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.IF_EQUATION__IF_EXPR, newIf_expr, newIf_expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Equation> getIf_eqs()
  {
    if (if_eqs == null)
    {
      if_eqs = new EObjectContainmentEList<Equation>(Equation.class, this, ModelicaPackage.IF_EQUATION__IF_EQS);
    }
    return if_eqs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getElsif_exprs()
  {
    if (elsif_exprs == null)
    {
      elsif_exprs = new EObjectContainmentEList<Expression>(Expression.class, this, ModelicaPackage.IF_EQUATION__ELSIF_EXPRS);
    }
    return elsif_exprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Equation> getElseif_eqs()
  {
    if (elseif_eqs == null)
    {
      elseif_eqs = new EObjectContainmentEList<Equation>(Equation.class, this, ModelicaPackage.IF_EQUATION__ELSEIF_EQS);
    }
    return elseif_eqs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Equation> getElse_eqs()
  {
    if (else_eqs == null)
    {
      else_eqs = new EObjectContainmentEList<Equation>(Equation.class, this, ModelicaPackage.IF_EQUATION__ELSE_EQS);
    }
    return else_eqs;
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
      case ModelicaPackage.IF_EQUATION__IF_EXPR:
        return basicSetIf_expr(null, msgs);
      case ModelicaPackage.IF_EQUATION__IF_EQS:
        return ((InternalEList<?>)getIf_eqs()).basicRemove(otherEnd, msgs);
      case ModelicaPackage.IF_EQUATION__ELSIF_EXPRS:
        return ((InternalEList<?>)getElsif_exprs()).basicRemove(otherEnd, msgs);
      case ModelicaPackage.IF_EQUATION__ELSEIF_EQS:
        return ((InternalEList<?>)getElseif_eqs()).basicRemove(otherEnd, msgs);
      case ModelicaPackage.IF_EQUATION__ELSE_EQS:
        return ((InternalEList<?>)getElse_eqs()).basicRemove(otherEnd, msgs);
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
      case ModelicaPackage.IF_EQUATION__IF_EXPR:
        return getIf_expr();
      case ModelicaPackage.IF_EQUATION__IF_EQS:
        return getIf_eqs();
      case ModelicaPackage.IF_EQUATION__ELSIF_EXPRS:
        return getElsif_exprs();
      case ModelicaPackage.IF_EQUATION__ELSEIF_EQS:
        return getElseif_eqs();
      case ModelicaPackage.IF_EQUATION__ELSE_EQS:
        return getElse_eqs();
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
      case ModelicaPackage.IF_EQUATION__IF_EXPR:
        setIf_expr((Expression)newValue);
        return;
      case ModelicaPackage.IF_EQUATION__IF_EQS:
        getIf_eqs().clear();
        getIf_eqs().addAll((Collection<? extends Equation>)newValue);
        return;
      case ModelicaPackage.IF_EQUATION__ELSIF_EXPRS:
        getElsif_exprs().clear();
        getElsif_exprs().addAll((Collection<? extends Expression>)newValue);
        return;
      case ModelicaPackage.IF_EQUATION__ELSEIF_EQS:
        getElseif_eqs().clear();
        getElseif_eqs().addAll((Collection<? extends Equation>)newValue);
        return;
      case ModelicaPackage.IF_EQUATION__ELSE_EQS:
        getElse_eqs().clear();
        getElse_eqs().addAll((Collection<? extends Equation>)newValue);
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
      case ModelicaPackage.IF_EQUATION__IF_EXPR:
        setIf_expr((Expression)null);
        return;
      case ModelicaPackage.IF_EQUATION__IF_EQS:
        getIf_eqs().clear();
        return;
      case ModelicaPackage.IF_EQUATION__ELSIF_EXPRS:
        getElsif_exprs().clear();
        return;
      case ModelicaPackage.IF_EQUATION__ELSEIF_EQS:
        getElseif_eqs().clear();
        return;
      case ModelicaPackage.IF_EQUATION__ELSE_EQS:
        getElse_eqs().clear();
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
      case ModelicaPackage.IF_EQUATION__IF_EXPR:
        return if_expr != null;
      case ModelicaPackage.IF_EQUATION__IF_EQS:
        return if_eqs != null && !if_eqs.isEmpty();
      case ModelicaPackage.IF_EQUATION__ELSIF_EXPRS:
        return elsif_exprs != null && !elsif_exprs.isEmpty();
      case ModelicaPackage.IF_EQUATION__ELSEIF_EQS:
        return elseif_eqs != null && !elseif_eqs.isEmpty();
      case ModelicaPackage.IF_EQUATION__ELSE_EQS:
        return else_eqs != null && !else_eqs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IfEquationImpl
