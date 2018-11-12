/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Require Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.RequireInstance#getIsRequireInstance <em>Is Require Instance</em>}</li>
 * </ul>
 *
 * @see io.typefox.yang.yang.YangPackage#getRequireInstance()
 * @model
 * @generated
 */
public interface RequireInstance extends OtherStatement
{
  /**
   * Returns the value of the '<em><b>Is Require Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Require Instance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Require Instance</em>' attribute.
   * @see #setIsRequireInstance(String)
   * @see io.typefox.yang.yang.YangPackage#getRequireInstance_IsRequireInstance()
   * @model
   * @generated
   */
  String getIsRequireInstance();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.RequireInstance#getIsRequireInstance <em>Is Require Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Require Instance</em>' attribute.
   * @see #getIsRequireInstance()
   * @generated
   */
  void setIsRequireInstance(String value);

} // RequireInstance
