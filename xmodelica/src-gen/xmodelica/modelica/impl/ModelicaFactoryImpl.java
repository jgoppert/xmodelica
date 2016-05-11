/**
 * generated by Xtext 2.9.2
 */
package xmodelica.modelica.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xmodelica.modelica.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelicaFactoryImpl extends EFactoryImpl implements ModelicaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ModelicaFactory init()
  {
    try
    {
      ModelicaFactory theModelicaFactory = (ModelicaFactory)EPackage.Registry.INSTANCE.getEFactory(ModelicaPackage.eNS_URI);
      if (theModelicaFactory != null)
      {
        return theModelicaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ModelicaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelicaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ModelicaPackage.MODEL: return createModel();
      case ModelicaPackage.GREETING: return createGreeting();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greeting createGreeting()
  {
    GreetingImpl greeting = new GreetingImpl();
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelicaPackage getModelicaPackage()
  {
    return (ModelicaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ModelicaPackage getPackage()
  {
    return ModelicaPackage.eINSTANCE;
  }

} //ModelicaFactoryImpl
