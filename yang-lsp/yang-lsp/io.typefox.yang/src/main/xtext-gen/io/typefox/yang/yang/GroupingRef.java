/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grouping Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.GroupingRef#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see io.typefox.yang.yang.YangPackage#getGroupingRef()
 * @model
 * @generated
 */
public interface GroupingRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' reference.
   * @see #setNode(Grouping)
   * @see io.typefox.yang.yang.YangPackage#getGroupingRef_Node()
   * @model
   * @generated
   */
  Grouping getNode();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.GroupingRef#getNode <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' reference.
   * @see #getNode()
   * @generated
   */
  void setNode(Grouping value);

} // GroupingRef
