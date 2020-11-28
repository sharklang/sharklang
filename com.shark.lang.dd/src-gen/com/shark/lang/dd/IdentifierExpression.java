/**
 * generated by Xtext 2.23.0
 */
package com.shark.lang.dd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.shark.lang.dd.IdentifierExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.shark.lang.dd.DdPackage#getIdentifierExpression()
 * @model
 * @generated
 */
public interface IdentifierExpression extends TerminalExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(Attribute)
   * @see com.shark.lang.dd.DdPackage#getIdentifierExpression_Value()
   * @model
   * @generated
   */
  Attribute getValue();

  /**
   * Sets the value of the '{@link com.shark.lang.dd.IdentifierExpression#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Attribute value);

} // IdentifierExpression
