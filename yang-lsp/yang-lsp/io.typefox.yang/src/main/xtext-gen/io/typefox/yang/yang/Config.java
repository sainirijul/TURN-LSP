/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.Config#getIsConfig <em>Is Config</em>}</li>
 * </ul>
 *
 * @see io.typefox.yang.yang.YangPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends OtherStatement
{
  /**
   * Returns the value of the '<em><b>Is Config</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Config</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Config</em>' attribute.
   * @see #setIsConfig(String)
   * @see io.typefox.yang.yang.YangPackage#getConfig_IsConfig()
   * @model
   * @generated
   */
  String getIsConfig();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.Config#getIsConfig <em>Is Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Config</em>' attribute.
   * @see #getIsConfig()
   * @generated
   */
  void setIsConfig(String value);

} // Config
