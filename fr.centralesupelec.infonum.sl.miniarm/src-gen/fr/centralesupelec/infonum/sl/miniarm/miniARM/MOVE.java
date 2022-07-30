/**
 * generated by Xtext 2.27.0
 */
package fr.centralesupelec.infonum.sl.miniarm.miniARM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MOVE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.MOVE#getDst <em>Dst</em>}</li>
 *   <li>{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.MOVE#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getMOVE()
 * @model
 * @generated
 */
public interface MOVE extends RealInst
{
  /**
   * Returns the value of the '<em><b>Dst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dst</em>' containment reference.
   * @see #setDst(Register)
   * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getMOVE_Dst()
   * @model containment="true"
   * @generated
   */
  Register getDst();

  /**
   * Sets the value of the '{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.MOVE#getDst <em>Dst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dst</em>' containment reference.
   * @see #getDst()
   * @generated
   */
  void setDst(Register value);

  /**
   * Returns the value of the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src</em>' containment reference.
   * @see #setSrc(MoveValue)
   * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getMOVE_Src()
   * @model containment="true"
   * @generated
   */
  MoveValue getSrc();

  /**
   * Sets the value of the '{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.MOVE#getSrc <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' containment reference.
   * @see #getSrc()
   * @generated
   */
  void setSrc(MoveValue value);

} // MOVE