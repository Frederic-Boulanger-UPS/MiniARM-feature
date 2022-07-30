/**
 * generated by Xtext 2.27.0
 */
package fr.centralesupelec.infonum.sl.miniarm.miniARM.impl;

import fr.centralesupelec.infonum.sl.miniarm.miniARM.ADD;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.MoveValue;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Register;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.impl.ADDImpl#getDst <em>Dst</em>}</li>
 *   <li>{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.impl.ADDImpl#getSrc1 <em>Src1</em>}</li>
 *   <li>{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.impl.ADDImpl#getSrc2 <em>Src2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ADDImpl extends RealInstImpl implements ADD
{
  /**
   * The cached value of the '{@link #getDst() <em>Dst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDst()
   * @generated
   * @ordered
   */
  protected Register dst;

  /**
   * The cached value of the '{@link #getSrc1() <em>Src1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrc1()
   * @generated
   * @ordered
   */
  protected Register src1;

  /**
   * The cached value of the '{@link #getSrc2() <em>Src2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrc2()
   * @generated
   * @ordered
   */
  protected MoveValue src2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ADDImpl()
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
    return MiniARMPackage.Literals.ADD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Register getDst()
  {
    return dst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDst(Register newDst, NotificationChain msgs)
  {
    Register oldDst = dst;
    dst = newDst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniARMPackage.ADD__DST, oldDst, newDst);
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
  public void setDst(Register newDst)
  {
    if (newDst != dst)
    {
      NotificationChain msgs = null;
      if (dst != null)
        msgs = ((InternalEObject)dst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniARMPackage.ADD__DST, null, msgs);
      if (newDst != null)
        msgs = ((InternalEObject)newDst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniARMPackage.ADD__DST, null, msgs);
      msgs = basicSetDst(newDst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniARMPackage.ADD__DST, newDst, newDst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Register getSrc1()
  {
    return src1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrc1(Register newSrc1, NotificationChain msgs)
  {
    Register oldSrc1 = src1;
    src1 = newSrc1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniARMPackage.ADD__SRC1, oldSrc1, newSrc1);
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
  public void setSrc1(Register newSrc1)
  {
    if (newSrc1 != src1)
    {
      NotificationChain msgs = null;
      if (src1 != null)
        msgs = ((InternalEObject)src1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniARMPackage.ADD__SRC1, null, msgs);
      if (newSrc1 != null)
        msgs = ((InternalEObject)newSrc1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniARMPackage.ADD__SRC1, null, msgs);
      msgs = basicSetSrc1(newSrc1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniARMPackage.ADD__SRC1, newSrc1, newSrc1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MoveValue getSrc2()
  {
    return src2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrc2(MoveValue newSrc2, NotificationChain msgs)
  {
    MoveValue oldSrc2 = src2;
    src2 = newSrc2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniARMPackage.ADD__SRC2, oldSrc2, newSrc2);
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
  public void setSrc2(MoveValue newSrc2)
  {
    if (newSrc2 != src2)
    {
      NotificationChain msgs = null;
      if (src2 != null)
        msgs = ((InternalEObject)src2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniARMPackage.ADD__SRC2, null, msgs);
      if (newSrc2 != null)
        msgs = ((InternalEObject)newSrc2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniARMPackage.ADD__SRC2, null, msgs);
      msgs = basicSetSrc2(newSrc2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniARMPackage.ADD__SRC2, newSrc2, newSrc2));
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
      case MiniARMPackage.ADD__DST:
        return basicSetDst(null, msgs);
      case MiniARMPackage.ADD__SRC1:
        return basicSetSrc1(null, msgs);
      case MiniARMPackage.ADD__SRC2:
        return basicSetSrc2(null, msgs);
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
      case MiniARMPackage.ADD__DST:
        return getDst();
      case MiniARMPackage.ADD__SRC1:
        return getSrc1();
      case MiniARMPackage.ADD__SRC2:
        return getSrc2();
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
      case MiniARMPackage.ADD__DST:
        setDst((Register)newValue);
        return;
      case MiniARMPackage.ADD__SRC1:
        setSrc1((Register)newValue);
        return;
      case MiniARMPackage.ADD__SRC2:
        setSrc2((MoveValue)newValue);
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
      case MiniARMPackage.ADD__DST:
        setDst((Register)null);
        return;
      case MiniARMPackage.ADD__SRC1:
        setSrc1((Register)null);
        return;
      case MiniARMPackage.ADD__SRC2:
        setSrc2((MoveValue)null);
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
      case MiniARMPackage.ADD__DST:
        return dst != null;
      case MiniARMPackage.ADD__SRC1:
        return src1 != null;
      case MiniARMPackage.ADD__SRC2:
        return src2 != null;
    }
    return super.eIsSet(featureID);
  }

} //ADDImpl
