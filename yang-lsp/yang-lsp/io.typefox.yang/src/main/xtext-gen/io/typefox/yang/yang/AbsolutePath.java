/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.AbsolutePath#isIsDescendants <em>Is Descendants</em>}</li>
 *   <li>{@link io.typefox.yang.yang.AbsolutePath#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see io.typefox.yang.yang.YangPackage#getAbsolutePath()
 * @model
 * @generated
 */
public interface AbsolutePath extends XpathExpression
{
  /**
   * Returns the value of the '<em><b>Is Descendants</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Descendants</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Descendants</em>' attribute.
   * @see #setIsDescendants(boolean)
   * @see io.typefox.yang.yang.YangPackage#getAbsolutePath_IsDescendants()
   * @model
   * @generated
   */
  boolean isIsDescendants();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.AbsolutePath#isIsDescendants <em>Is Descendants</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Descendants</em>' attribute.
   * @see #isIsDescendants()
   * @generated
   */
  void setIsDescendants(boolean value);

  /**
   * Returns the value of the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' containment reference.
   * @see #setStep(XpathStep)
   * @see io.typefox.yang.yang.YangPackage#getAbsolutePath_Step()
   * @model containment="true"
   * @generated
   */
  XpathStep getStep();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.AbsolutePath#getStep <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' containment reference.
   * @see #getStep()
   * @generated
   */
  void setStep(XpathStep value);

} // AbsolutePath
