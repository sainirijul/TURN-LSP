/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.FeatureReference#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see io.typefox.yang.yang.YangPackage#getFeatureReference()
 * @model
 * @generated
 */
public interface FeatureReference extends Expression
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(Feature)
   * @see io.typefox.yang.yang.YangPackage#getFeatureReference_Feature()
   * @model
   * @generated
   */
  Feature getFeature();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.FeatureReference#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Feature value);

} // FeatureReference