/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Must</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.Must#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see io.typefox.yang.yang.YangPackage#getMust()
 * @model
 * @generated
 */
public interface Must extends OtherStatement
{
  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(XpathExpression)
   * @see io.typefox.yang.yang.YangPackage#getMust_Constraint()
   * @model containment="true"
   * @generated
   */
  XpathExpression getConstraint();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.Must#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(XpathExpression value);

} // Must