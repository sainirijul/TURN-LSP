/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.RelativePath#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see io.typefox.yang.yang.YangPackage#getRelativePath()
 * @model
 * @generated
 */
public interface RelativePath extends XpathExpression
{
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
   * @see io.typefox.yang.yang.YangPackage#getRelativePath_Step()
   * @model containment="true"
   * @generated
   */
  XpathStep getStep();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.RelativePath#getStep <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' containment reference.
   * @see #getStep()
   * @generated
   */
  void setStep(XpathStep value);

} // RelativePath
