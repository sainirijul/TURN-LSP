/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.RevisionDate#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see io.typefox.yang.yang.YangPackage#getRevisionDate()
 * @model
 * @generated
 */
public interface RevisionDate extends OtherStatement
{
  /**
   * Returns the value of the '<em><b>Date</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' reference.
   * @see #setDate(Revision)
   * @see io.typefox.yang.yang.YangPackage#getRevisionDate_Date()
   * @model
   * @generated
   */
  Revision getDate();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.RevisionDate#getDate <em>Date</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' reference.
   * @see #getDate()
   * @generated
   */
  void setDate(Revision value);

} // RevisionDate
