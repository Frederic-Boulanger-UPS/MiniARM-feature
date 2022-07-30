/**
 * generated by Xtext 2.27.0
 */
package fr.centralesupelec.infonum.sl.miniarm.miniARM.impl;

import fr.centralesupelec.infonum.sl.miniarm.miniARM.BLT;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BranchAddress;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BLT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.impl.BLTImpl#getDest <em>Dest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BLTImpl extends RealInstImpl implements BLT
{
  /**
   * The cached value of the '{@link #getDest() <em>Dest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDest()
   * @generated
   * @ordered
   */
  protected BranchAddress dest;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BLTImpl()
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
    return MiniARMPackage.Literals.BLT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BranchAddress getDest()
  {
    return dest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDest(BranchAddress newDest, NotificationChain msgs)
  {
    BranchAddress oldDest = dest;
    dest = newDest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniARMPackage.BLT__DEST, oldDest, newDest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDest(BranchAddress newDest)
  {
    if (newDest != dest)
    {
      NotificationChain msgs = null;
      if (dest != null)
        msgs = ((InternalEObject)dest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniARMPackage.BLT__DEST, null, msgs);
      if (newDest != null)
        msgs = ((InternalEObject)newDest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniARMPackage.BLT__DEST, null, msgs);
      msgs = basicSetDest(newDest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniARMPackage.BLT__DEST, newDest, newDest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MiniARMPackage.BLT__DEST:
        return basicSetDest(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MiniARMPackage.BLT__DEST:
        return getDest();
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
      case MiniARMPackage.BLT__DEST:
        setDest((BranchAddress)newValue);
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
      case MiniARMPackage.BLT__DEST:
        setDest((BranchAddress)null);
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
      case MiniARMPackage.BLT__DEST:
        return dest != null;
    }
    return super.eIsSet(featureID);
  }

} //BLTImpl
