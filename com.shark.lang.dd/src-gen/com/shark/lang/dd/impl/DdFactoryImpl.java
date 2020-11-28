/**
 * generated by Xtext 2.23.0
 */
package com.shark.lang.dd.impl;

import com.shark.lang.dd.AddExpression;
import com.shark.lang.dd.AddExpressionElt;
import com.shark.lang.dd.AndExpression;
import com.shark.lang.dd.AndExpressionElt;
import com.shark.lang.dd.ArraySize;
import com.shark.lang.dd.Attribute;
import com.shark.lang.dd.AttributeSize;
import com.shark.lang.dd.BinaryExpression;
import com.shark.lang.dd.BinaryOperator;
import com.shark.lang.dd.BoolValue;
import com.shark.lang.dd.CatExpression;
import com.shark.lang.dd.CatExpressionElt;
import com.shark.lang.dd.CheckExpression;
import com.shark.lang.dd.ChrValue;
import com.shark.lang.dd.Comment;
import com.shark.lang.dd.Constant;
import com.shark.lang.dd.Constraint;
import com.shark.lang.dd.CstValue;
import com.shark.lang.dd.DataModelFragment;
import com.shark.lang.dd.DataType;
import com.shark.lang.dd.DdFactory;
import com.shark.lang.dd.DdPackage;
import com.shark.lang.dd.DecValue;
import com.shark.lang.dd.Entity;
import com.shark.lang.dd.IdentifierExpression;
import com.shark.lang.dd.IntValue;
import com.shark.lang.dd.LineComment;
import com.shark.lang.dd.ListExpression;
import com.shark.lang.dd.ListExpressionElt;
import com.shark.lang.dd.MultExpression;
import com.shark.lang.dd.MultExpressionElt;
import com.shark.lang.dd.OrExpression;
import com.shark.lang.dd.OrExpressionElt;
import com.shark.lang.dd.Relationship;
import com.shark.lang.dd.SharkExpression;
import com.shark.lang.dd.StrValue;
import com.shark.lang.dd.TerminalExpression;
import com.shark.lang.dd.TrailComment;
import com.shark.lang.dd.UnaryExpression;
import com.shark.lang.dd.UnaryOperator;
import com.shark.lang.dd.Unset;
import com.shark.lang.dd.UnsetValue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DdFactoryImpl extends EFactoryImpl implements DdFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DdFactory init()
  {
    try
    {
      DdFactory theDdFactory = (DdFactory)EPackage.Registry.INSTANCE.getEFactory(DdPackage.eNS_URI);
      if (theDdFactory != null)
      {
        return theDdFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DdFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DdFactoryImpl()
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
      case DdPackage.DATA_MODEL_FRAGMENT: return createDataModelFragment();
      case DdPackage.CONSTANT: return createConstant();
      case DdPackage.ENTITY: return createEntity();
      case DdPackage.ATTRIBUTE: return createAttribute();
      case DdPackage.ATTRIBUTE_SIZE: return createAttributeSize();
      case DdPackage.ARRAY_SIZE: return createArraySize();
      case DdPackage.RELATIONSHIP: return createRelationship();
      case DdPackage.CONSTRAINT: return createConstraint();
      case DdPackage.CHECK_EXPRESSION: return createCheckExpression();
      case DdPackage.SHARK_EXPRESSION: return createSharkExpression();
      case DdPackage.BINARY_EXPRESSION: return createBinaryExpression();
      case DdPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case DdPackage.ADD_EXPRESSION: return createAddExpression();
      case DdPackage.ADD_EXPRESSION_ELT: return createAddExpressionElt();
      case DdPackage.MULT_EXPRESSION: return createMultExpression();
      case DdPackage.MULT_EXPRESSION_ELT: return createMultExpressionElt();
      case DdPackage.AND_EXPRESSION: return createAndExpression();
      case DdPackage.AND_EXPRESSION_ELT: return createAndExpressionElt();
      case DdPackage.OR_EXPRESSION: return createOrExpression();
      case DdPackage.OR_EXPRESSION_ELT: return createOrExpressionElt();
      case DdPackage.CAT_EXPRESSION: return createCatExpression();
      case DdPackage.CAT_EXPRESSION_ELT: return createCatExpressionElt();
      case DdPackage.LIST_EXPRESSION: return createListExpression();
      case DdPackage.LIST_EXPRESSION_ELT: return createListExpressionElt();
      case DdPackage.TERMINAL_EXPRESSION: return createTerminalExpression();
      case DdPackage.LINE_COMMENT: return createLineComment();
      case DdPackage.TRAIL_COMMENT: return createTrailComment();
      case DdPackage.STR_VALUE: return createStrValue();
      case DdPackage.INT_VALUE: return createIntValue();
      case DdPackage.DEC_VALUE: return createDecValue();
      case DdPackage.CHR_VALUE: return createChrValue();
      case DdPackage.CST_VALUE: return createCstValue();
      case DdPackage.BOOL_VALUE: return createBoolValue();
      case DdPackage.UNSET_VALUE: return createUnsetValue();
      case DdPackage.IDENTIFIER_EXPRESSION: return createIdentifierExpression();
      case DdPackage.COMMENT: return createComment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DdPackage.BINARY_OPERATOR:
        return createBinaryOperatorFromString(eDataType, initialValue);
      case DdPackage.UNARY_OPERATOR:
        return createUnaryOperatorFromString(eDataType, initialValue);
      case DdPackage.UNSET:
        return createUnsetFromString(eDataType, initialValue);
      case DdPackage.BOOLEAN:
        return createBooleanFromString(eDataType, initialValue);
      case DdPackage.DATA_TYPE:
        return createDataTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DdPackage.BINARY_OPERATOR:
        return convertBinaryOperatorToString(eDataType, instanceValue);
      case DdPackage.UNARY_OPERATOR:
        return convertUnaryOperatorToString(eDataType, instanceValue);
      case DdPackage.UNSET:
        return convertUnsetToString(eDataType, instanceValue);
      case DdPackage.BOOLEAN:
        return convertBooleanToString(eDataType, instanceValue);
      case DdPackage.DATA_TYPE:
        return convertDataTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataModelFragment createDataModelFragment()
  {
    DataModelFragmentImpl dataModelFragment = new DataModelFragmentImpl();
    return dataModelFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeSize createAttributeSize()
  {
    AttributeSizeImpl attributeSize = new AttributeSizeImpl();
    return attributeSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArraySize createArraySize()
  {
    ArraySizeImpl arraySize = new ArraySizeImpl();
    return arraySize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Relationship createRelationship()
  {
    RelationshipImpl relationship = new RelationshipImpl();
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CheckExpression createCheckExpression()
  {
    CheckExpressionImpl checkExpression = new CheckExpressionImpl();
    return checkExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SharkExpression createSharkExpression()
  {
    SharkExpressionImpl sharkExpression = new SharkExpressionImpl();
    return sharkExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BinaryExpression createBinaryExpression()
  {
    BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
    return binaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddExpression createAddExpression()
  {
    AddExpressionImpl addExpression = new AddExpressionImpl();
    return addExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddExpressionElt createAddExpressionElt()
  {
    AddExpressionEltImpl addExpressionElt = new AddExpressionEltImpl();
    return addExpressionElt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultExpression createMultExpression()
  {
    MultExpressionImpl multExpression = new MultExpressionImpl();
    return multExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultExpressionElt createMultExpressionElt()
  {
    MultExpressionEltImpl multExpressionElt = new MultExpressionEltImpl();
    return multExpressionElt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndExpressionElt createAndExpressionElt()
  {
    AndExpressionEltImpl andExpressionElt = new AndExpressionEltImpl();
    return andExpressionElt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OrExpressionElt createOrExpressionElt()
  {
    OrExpressionEltImpl orExpressionElt = new OrExpressionEltImpl();
    return orExpressionElt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CatExpression createCatExpression()
  {
    CatExpressionImpl catExpression = new CatExpressionImpl();
    return catExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CatExpressionElt createCatExpressionElt()
  {
    CatExpressionEltImpl catExpressionElt = new CatExpressionEltImpl();
    return catExpressionElt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ListExpression createListExpression()
  {
    ListExpressionImpl listExpression = new ListExpressionImpl();
    return listExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ListExpressionElt createListExpressionElt()
  {
    ListExpressionEltImpl listExpressionElt = new ListExpressionEltImpl();
    return listExpressionElt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TerminalExpression createTerminalExpression()
  {
    TerminalExpressionImpl terminalExpression = new TerminalExpressionImpl();
    return terminalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LineComment createLineComment()
  {
    LineCommentImpl lineComment = new LineCommentImpl();
    return lineComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TrailComment createTrailComment()
  {
    TrailCommentImpl trailComment = new TrailCommentImpl();
    return trailComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StrValue createStrValue()
  {
    StrValueImpl strValue = new StrValueImpl();
    return strValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DecValue createDecValue()
  {
    DecValueImpl decValue = new DecValueImpl();
    return decValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChrValue createChrValue()
  {
    ChrValueImpl chrValue = new ChrValueImpl();
    return chrValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CstValue createCstValue()
  {
    CstValueImpl cstValue = new CstValueImpl();
    return cstValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoolValue createBoolValue()
  {
    BoolValueImpl boolValue = new BoolValueImpl();
    return boolValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnsetValue createUnsetValue()
  {
    UnsetValueImpl unsetValue = new UnsetValueImpl();
    return unsetValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdentifierExpression createIdentifierExpression()
  {
    IdentifierExpressionImpl identifierExpression = new IdentifierExpressionImpl();
    return identifierExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue)
  {
    BinaryOperator result = BinaryOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOperator createUnaryOperatorFromString(EDataType eDataType, String initialValue)
  {
    UnaryOperator result = UnaryOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unset createUnsetFromString(EDataType eDataType, String initialValue)
  {
    Unset result = Unset.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnsetToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.shark.lang.dd.Boolean createBooleanFromString(EDataType eDataType, String initialValue)
  {
    com.shark.lang.dd.Boolean result = com.shark.lang.dd.Boolean.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataTypeFromString(EDataType eDataType, String initialValue)
  {
    DataType result = DataType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DdPackage getDdPackage()
  {
    return (DdPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DdPackage getPackage()
  {
    return DdPackage.eINSTANCE;
  }

} //DdFactoryImpl
