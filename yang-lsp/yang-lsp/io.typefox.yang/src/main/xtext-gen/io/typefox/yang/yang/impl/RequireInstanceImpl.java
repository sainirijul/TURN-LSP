/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.yang.impl;

import io.typefox.yang.yang.RequireInstance;
import io.typefox.yang.yang.YangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Require Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.yang.yang.impl.RequireInstanceImpl#getIsRequireInstance <em>Is Require Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequireInstanceImpl extends OtherStatementImpl implements RequireInstance
{
  /**
   * The default value of the '{@link #getIsRequireInstance() <em>Is Require Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsRequireInstance()
   * @generated
   * @ordered
   */
  protected static final String IS_REQUIRE_INSTANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIsRequireInstance() <em>Is Require Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsRequireInstance()
   * @generated
   * @ordered
   */
  protected String isRequireInstance = IS_REQUIRE_INSTANCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequireInstanceImpl()
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
    return YangPackage.Literals.REQUIRE_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIsRequireInstance()
  {
    return isRequireInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsRequireInstance(String newIsRequireInstance)
  {
    String oldIsRequireInstance = isRequireInstance;
    isRequireInstance = newIsRequireInstance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.REQUIRE_INSTANCE__IS_REQUIRE_INSTANCE, oldIsRequireInstance, isRequireInstance));
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
      case YangPackage.REQUIRE_INSTANCE__IS_REQUIRE_INSTANCE:
        return getIsRequireInstance();
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
      case YangPackage.REQUIRE_INSTANCE__IS_REQUIRE_INSTANCE:
        setIsRequireInstance((String)newValue);
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
      case YangPackage.REQUIRE_INSTANCE__IS_REQUIRE_INSTANCE:
        setIsRequireInstance(IS_REQUIRE_INSTANCE_EDEFAULT);
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
      case YangPackage.REQUIRE_INSTANCE__IS_REQUIRE_INSTANCE:
        return IS_REQUIRE_INSTANCE_EDEFAULT == null ? isRequireInstance != null : !IS_REQUIRE_INSTANCE_EDEFAULT.equals(isRequireInstance);
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
    result.append(" (isRequireInstance: ");
    result.append(isRequireInstance);
    result.append(')');
    return result.toString();
  }

} //RequireInstanceImpl