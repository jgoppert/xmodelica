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
      case ModelicaPackage.STORED_DEFINITION: return createStoredDefinition();
      case ModelicaPackage.CLASS_DEFINITION: return createClassDefinition();
      case ModelicaPackage.ENUM_LIST: return createEnumList();
      case ModelicaPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
      case ModelicaPackage.COMPOSITION: return createComposition();
      case ModelicaPackage.EXTERNAL_FUNCTION_CALL: return createExternalFunctionCall();
      case ModelicaPackage.ELEMENT_LIST: return createElementList();
      case ModelicaPackage.ELEMENT: return createElement();
      case ModelicaPackage.IMPORT_CLAUSE: return createImportClause();
      case ModelicaPackage.IMPORT_LIST: return createImportList();
      case ModelicaPackage.EXTENDS_CLAUSE: return createExtendsClause();
      case ModelicaPackage.CONSTRAINING_CLAUSE: return createConstrainingClause();
      case ModelicaPackage.COMPONENT_CLAUSE: return createComponentClause();
      case ModelicaPackage.TYPE_SPECIFIER: return createTypeSpecifier();
      case ModelicaPackage.COMPONENT_LIST: return createComponentList();
      case ModelicaPackage.COMPONENT_DECLARATION: return createComponentDeclaration();
      case ModelicaPackage.CONDITION_ATTRIBUTE: return createConditionAttribute();
      case ModelicaPackage.DECLARATION: return createDeclaration();
      case ModelicaPackage.MODIFICATION: return createModification();
      case ModelicaPackage.CLASS_MODIFICATION: return createClassModification();
      case ModelicaPackage.ARGUMENT_LIST: return createArgumentList();
      case ModelicaPackage.ARGUMENT: return createArgument();
      case ModelicaPackage.ELEMENT_MODICATION_OR_REPLACEABLE: return createElementModicationOrReplaceable();
      case ModelicaPackage.ELEMENT_MODIFICATION: return createElementModification();
      case ModelicaPackage.ELEMENT_REDECLARATION: return createElementRedeclaration();
      case ModelicaPackage.ELEMENT_REPLACEABLE: return createElementReplaceable();
      case ModelicaPackage.COMPONENT_CLAUSE1: return createComponentClause1();
      case ModelicaPackage.COMPONENT_DECLARATION1: return createComponentDeclaration1();
      case ModelicaPackage.SHORT_CLASS_DEFINITION: return createShortClassDefinition();
      case ModelicaPackage.EQUATION_SECTION: return createEquationSection();
      case ModelicaPackage.ALGORITHM_SECTION: return createAlgorithmSection();
      case ModelicaPackage.EQUATION: return createEquation();
      case ModelicaPackage.STATEMENT: return createStatement();
      case ModelicaPackage.IF_EQUATION: return createIfEquation();
      case ModelicaPackage.IF_STATEMENT: return createIfStatement();
      case ModelicaPackage.FOR_EQUATION: return createForEquation();
      case ModelicaPackage.FOR_STATEMENT: return createForStatement();
      case ModelicaPackage.FOR_INDICES: return createForIndices();
      case ModelicaPackage.FOR_INDEX: return createForIndex();
      case ModelicaPackage.WHILE_STATEMENT: return createWhileStatement();
      case ModelicaPackage.WHEN_EQUATION: return createWhenEquation();
      case ModelicaPackage.WHEN_STATEMENT: return createWhenStatement();
      case ModelicaPackage.CONNECT_CLAUSE: return createConnectClause();
      case ModelicaPackage.EXPRESSION: return createExpression();
      case ModelicaPackage.SIMPLE_EXPRESSION: return createSimpleExpression();
      case ModelicaPackage.LOGICAL_EXPRESSION: return createLogicalExpression();
      case ModelicaPackage.LOGICAL_TERM: return createLogicalTerm();
      case ModelicaPackage.LOGICAL_FACTOR: return createLogicalFactor();
      case ModelicaPackage.RELATION: return createRelation();
      case ModelicaPackage.ARITHMETIC_EXPRESSION: return createArithmeticExpression();
      case ModelicaPackage.TERM: return createTerm();
      case ModelicaPackage.FACTOR: return createFactor();
      case ModelicaPackage.FLOAT_PRIMARY: return createFloatPrimary();
      case ModelicaPackage.STRING_PRIMARY: return createStringPrimary();
      case ModelicaPackage.LOGICAL_PRIMARY: return createLogicalPrimary();
      case ModelicaPackage.END: return createEnd();
      case ModelicaPackage.PRIMARY: return createPrimary();
      case ModelicaPackage.FUNCTION_CALL: return createFunctionCall();
      case ModelicaPackage.COMPONENT_REFERENCE: return createComponentReference();
      case ModelicaPackage.FUNCTION_CALL_ARGS: return createFunctionCallArgs();
      case ModelicaPackage.FUNCTION_ARGUMENTS: return createFunctionArguments();
      case ModelicaPackage.NAMED_ARGUMENTS: return createNamedArguments();
      case ModelicaPackage.NAMED_ARGUMENT: return createNamedArgument();
      case ModelicaPackage.FUNCTION_ARGUMENT: return createFunctionArgument();
      case ModelicaPackage.OUTPUT_EXPRESSION_LIST: return createOutputExpressionList();
      case ModelicaPackage.EXPRESSION_LIST: return createExpressionList();
      case ModelicaPackage.ARRAY_SUBSCRIPTS: return createArraySubscripts();
      case ModelicaPackage.SUBSCRIPT: return createSubscript();
      case ModelicaPackage.COMMENT: return createComment();
      case ModelicaPackage.ANNOTATION: return createAnnotation();
      case ModelicaPackage.OUPUT_EXPRESSION_LIST: return createOuputExpressionList();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StoredDefinition createStoredDefinition()
  {
    StoredDefinitionImpl storedDefinition = new StoredDefinitionImpl();
    return storedDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDefinition createClassDefinition()
  {
    ClassDefinitionImpl classDefinition = new ClassDefinitionImpl();
    return classDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumList createEnumList()
  {
    EnumListImpl enumList = new EnumListImpl();
    return enumList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral createEnumerationLiteral()
  {
    EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
    return enumerationLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Composition createComposition()
  {
    CompositionImpl composition = new CompositionImpl();
    return composition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalFunctionCall createExternalFunctionCall()
  {
    ExternalFunctionCallImpl externalFunctionCall = new ExternalFunctionCallImpl();
    return externalFunctionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementList createElementList()
  {
    ElementListImpl elementList = new ElementListImpl();
    return elementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportClause createImportClause()
  {
    ImportClauseImpl importClause = new ImportClauseImpl();
    return importClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportList createImportList()
  {
    ImportListImpl importList = new ImportListImpl();
    return importList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsClause createExtendsClause()
  {
    ExtendsClauseImpl extendsClause = new ExtendsClauseImpl();
    return extendsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstrainingClause createConstrainingClause()
  {
    ConstrainingClauseImpl constrainingClause = new ConstrainingClauseImpl();
    return constrainingClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentClause createComponentClause()
  {
    ComponentClauseImpl componentClause = new ComponentClauseImpl();
    return componentClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpecifier createTypeSpecifier()
  {
    TypeSpecifierImpl typeSpecifier = new TypeSpecifierImpl();
    return typeSpecifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentList createComponentList()
  {
    ComponentListImpl componentList = new ComponentListImpl();
    return componentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDeclaration createComponentDeclaration()
  {
    ComponentDeclarationImpl componentDeclaration = new ComponentDeclarationImpl();
    return componentDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionAttribute createConditionAttribute()
  {
    ConditionAttributeImpl conditionAttribute = new ConditionAttributeImpl();
    return conditionAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modification createModification()
  {
    ModificationImpl modification = new ModificationImpl();
    return modification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassModification createClassModification()
  {
    ClassModificationImpl classModification = new ClassModificationImpl();
    return classModification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentList createArgumentList()
  {
    ArgumentListImpl argumentList = new ArgumentListImpl();
    return argumentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementModicationOrReplaceable createElementModicationOrReplaceable()
  {
    ElementModicationOrReplaceableImpl elementModicationOrReplaceable = new ElementModicationOrReplaceableImpl();
    return elementModicationOrReplaceable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementModification createElementModification()
  {
    ElementModificationImpl elementModification = new ElementModificationImpl();
    return elementModification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementRedeclaration createElementRedeclaration()
  {
    ElementRedeclarationImpl elementRedeclaration = new ElementRedeclarationImpl();
    return elementRedeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementReplaceable createElementReplaceable()
  {
    ElementReplaceableImpl elementReplaceable = new ElementReplaceableImpl();
    return elementReplaceable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentClause1 createComponentClause1()
  {
    ComponentClause1Impl componentClause1 = new ComponentClause1Impl();
    return componentClause1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDeclaration1 createComponentDeclaration1()
  {
    ComponentDeclaration1Impl componentDeclaration1 = new ComponentDeclaration1Impl();
    return componentDeclaration1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShortClassDefinition createShortClassDefinition()
  {
    ShortClassDefinitionImpl shortClassDefinition = new ShortClassDefinitionImpl();
    return shortClassDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquationSection createEquationSection()
  {
    EquationSectionImpl equationSection = new EquationSectionImpl();
    return equationSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlgorithmSection createAlgorithmSection()
  {
    AlgorithmSectionImpl algorithmSection = new AlgorithmSectionImpl();
    return algorithmSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equation createEquation()
  {
    EquationImpl equation = new EquationImpl();
    return equation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfEquation createIfEquation()
  {
    IfEquationImpl ifEquation = new IfEquationImpl();
    return ifEquation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForEquation createForEquation()
  {
    ForEquationImpl forEquation = new ForEquationImpl();
    return forEquation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForIndices createForIndices()
  {
    ForIndicesImpl forIndices = new ForIndicesImpl();
    return forIndices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForIndex createForIndex()
  {
    ForIndexImpl forIndex = new ForIndexImpl();
    return forIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStatement createWhileStatement()
  {
    WhileStatementImpl whileStatement = new WhileStatementImpl();
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenEquation createWhenEquation()
  {
    WhenEquationImpl whenEquation = new WhenEquationImpl();
    return whenEquation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenStatement createWhenStatement()
  {
    WhenStatementImpl whenStatement = new WhenStatementImpl();
    return whenStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectClause createConnectClause()
  {
    ConnectClauseImpl connectClause = new ConnectClauseImpl();
    return connectClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression createSimpleExpression()
  {
    SimpleExpressionImpl simpleExpression = new SimpleExpressionImpl();
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalExpression createLogicalExpression()
  {
    LogicalExpressionImpl logicalExpression = new LogicalExpressionImpl();
    return logicalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalTerm createLogicalTerm()
  {
    LogicalTermImpl logicalTerm = new LogicalTermImpl();
    return logicalTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalFactor createLogicalFactor()
  {
    LogicalFactorImpl logicalFactor = new LogicalFactorImpl();
    return logicalFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticExpression createArithmeticExpression()
  {
    ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
    return arithmeticExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factor createFactor()
  {
    FactorImpl factor = new FactorImpl();
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatPrimary createFloatPrimary()
  {
    FloatPrimaryImpl floatPrimary = new FloatPrimaryImpl();
    return floatPrimary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringPrimary createStringPrimary()
  {
    StringPrimaryImpl stringPrimary = new StringPrimaryImpl();
    return stringPrimary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalPrimary createLogicalPrimary()
  {
    LogicalPrimaryImpl logicalPrimary = new LogicalPrimaryImpl();
    return logicalPrimary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public End createEnd()
  {
    EndImpl end = new EndImpl();
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentReference createComponentReference()
  {
    ComponentReferenceImpl componentReference = new ComponentReferenceImpl();
    return componentReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCallArgs createFunctionCallArgs()
  {
    FunctionCallArgsImpl functionCallArgs = new FunctionCallArgsImpl();
    return functionCallArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionArguments createFunctionArguments()
  {
    FunctionArgumentsImpl functionArguments = new FunctionArgumentsImpl();
    return functionArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedArguments createNamedArguments()
  {
    NamedArgumentsImpl namedArguments = new NamedArgumentsImpl();
    return namedArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedArgument createNamedArgument()
  {
    NamedArgumentImpl namedArgument = new NamedArgumentImpl();
    return namedArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionArgument createFunctionArgument()
  {
    FunctionArgumentImpl functionArgument = new FunctionArgumentImpl();
    return functionArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputExpressionList createOutputExpressionList()
  {
    OutputExpressionListImpl outputExpressionList = new OutputExpressionListImpl();
    return outputExpressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList createExpressionList()
  {
    ExpressionListImpl expressionList = new ExpressionListImpl();
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArraySubscripts createArraySubscripts()
  {
    ArraySubscriptsImpl arraySubscripts = new ArraySubscriptsImpl();
    return arraySubscripts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subscript createSubscript()
  {
    SubscriptImpl subscript = new SubscriptImpl();
    return subscript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OuputExpressionList createOuputExpressionList()
  {
    OuputExpressionListImpl ouputExpressionList = new OuputExpressionListImpl();
    return ouputExpressionList;
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
