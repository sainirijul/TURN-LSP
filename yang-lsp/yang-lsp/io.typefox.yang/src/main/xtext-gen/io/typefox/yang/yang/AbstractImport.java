/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.AbstractImport#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see io.typefox.yang.yang.YangPackage#getAbstractImport()
 * @model
 * @generated
 */
public interface AbstractImport extends OtherStatement
{
  /**
   * Returns the value of the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' reference.
   * @see #setModule(AbstractModule)
   * @see io.typefox.yang.yang.YangPackage#getAbstractImport_Module()
   * @model
   * @generated
   */
  AbstractModule getModule();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.AbstractImport#getModule <em>Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' reference.
   * @see #getModule()
   * @generated
   */
  void setModule(AbstractModule value);

} // AbstractImport
