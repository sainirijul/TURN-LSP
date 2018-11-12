/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang.impl;

import io.typefox.yang.yang.YangPackage;
import io.typefox.yang.yang.YinElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Yin Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.impl.YinElementImpl#getIsYinElement <em>Is Yin Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YinElementImpl extends OtherStatementImpl implements YinElement
{
  /**
   * The default value of the '{@link #getIsYinElement() <em>Is Yin Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsYinElement()
   * @generated
   * @ordered
   */
  protected static final String IS_YIN_ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIsYinElement() <em>Is Yin Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsYinElement()
   * @generated
   * @ordered
   */
  protected String isYinElement = IS_YIN_ELEMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected YinElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return YangPackage.Literals.YIN_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIsYinElement()
  {
    return isYinElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsYinElement(String newIsYinElement)
  {
    String oldIsYinElement = isYinElement;
    isYinElement = newIsYinElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.YIN_ELEMENT__IS_YIN_ELEMENT, oldIsYinElement, isYinElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case YangPackage.YIN_ELEMENT__IS_YIN_ELEMENT:
        return getIsYinElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case YangPackage.YIN_ELEMENT__IS_YIN_ELEMENT:
        setIsYinElement((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case YangPackage.YIN_ELEMENT__IS_YIN_ELEMENT:
        setIsYinElement(IS_YIN_ELEMENT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case YangPackage.YIN_ELEMENT__IS_YIN_ELEMENT:
        return IS_YIN_ELEMENT_EDEFAULT == null ? isYinElement != null : !IS_YIN_ELEMENT_EDEFAULT.equals(isYinElement);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isYinElement: ");
    result.append(isYinElement);
    result.append(')');
    return result.toString();
  }

} //YinElementImpl
