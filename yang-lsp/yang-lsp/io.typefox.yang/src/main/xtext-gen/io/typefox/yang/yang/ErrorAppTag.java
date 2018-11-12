/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error App Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.ErrorAppTag#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see io.typefox.yang.yang.YangPackage#getErrorAppTag()
 * @model
 * @generated
 */
public interface ErrorAppTag extends OtherStatement
{
  /**
   * Returns the value of the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' attribute.
   * @see #setTag(String)
   * @see io.typefox.yang.yang.YangPackage#getErrorAppTag_Tag()
   * @model
   * @generated
   */
  String getTag();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.ErrorAppTag#getTag <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag</em>' attribute.
   * @see #getTag()
   * @generated
   */
  void setTag(String value);

} // ErrorAppTag
