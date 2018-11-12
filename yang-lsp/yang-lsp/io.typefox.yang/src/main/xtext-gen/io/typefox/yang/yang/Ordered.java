/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.Ordered#getOrdinal <em>Ordinal</em>}</li>
 * </ul>
 *
 * @see io.typefox.yang.yang.YangPackage#getOrdered()
 * @model
 * @generated
 */
public interface Ordered extends OtherStatement
{
  /**
   * Returns the value of the '<em><b>Ordinal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordinal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordinal</em>' attribute.
   * @see #setOrdinal(String)
   * @see io.typefox.yang.yang.YangPackage#getOrdered_Ordinal()
   * @model
   * @generated
   */
  String getOrdinal();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.Ordered#getOrdinal <em>Ordinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordinal</em>' attribute.
   * @see #getOrdinal()
   * @generated
   */
  void setOrdinal(String value);

} // Ordered
