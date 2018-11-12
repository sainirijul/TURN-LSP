/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.Base#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see io.typefox.yang.yang.YangPackage#getBase()
 * @model
 * @generated
 */
public interface Base extends OtherStatement
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(Identity)
   * @see io.typefox.yang.yang.YangPackage#getBase_Reference()
   * @model
   * @generated
   */
  Identity getReference();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.Base#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Identity value);

} // Base
