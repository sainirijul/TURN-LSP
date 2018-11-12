/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.ProcessingInstruction#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see io.typefox.yang.yang.YangPackage#getProcessingInstruction()
 * @model
 * @generated
 */
public interface ProcessingInstruction extends XpathNodeTest
{
  /**
   * Returns the value of the '<em><b>Instruction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instruction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instruction</em>' attribute.
   * @see #setInstruction(String)
   * @see io.typefox.yang.yang.YangPackage#getProcessingInstruction_Instruction()
   * @model
   * @generated
   */
  String getInstruction();

  /**
   * Sets the value of the '{@link io.typefox.yang.yang.ProcessingInstruction#getInstruction <em>Instruction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instruction</em>' attribute.
   * @see #getInstruction()
   * @generated
   */
  void setInstruction(String value);

} // ProcessingInstruction