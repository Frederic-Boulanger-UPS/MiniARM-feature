/**
 * generated by Xtext 2.27.0
 */
package fr.centralesupelec.infonum.sl.miniarm.miniARM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SUB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.SUB#getDst <em>Dst</em>}</li>
 *   <li>{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.SUB#getSrc1 <em>Src1</em>}</li>
 *   <li>{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.SUB#getSrc2 <em>Src2</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getSUB()
 * @model
 * @generated
 */
public interface SUB extends RealInst
{
  /**
   * Returns the value of the '<em><b>Dst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dst</em>' containment reference.
   * @see #setDst(Register)
   * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getSUB_Dst()
   * @model containment="true"
   * @generated
   */
  Register getDst();

  /**
   * Sets the value of the '{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.SUB#getDst <em>Dst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dst</em>' containment reference.
   * @see #getDst()
   * @generated
   */
  void setDst(Register value);

  /**
   * Returns the value of the '<em><b>Src1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src1</em>' containment reference.
   * @see #setSrc1(Register)
   * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getSUB_Src1()
   * @model containment="true"
   * @generated
   */
  Register getSrc1();

  /**
   * Sets the value of the '{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.SUB#getSrc1 <em>Src1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src1</em>' containment reference.
   * @see #getSrc1()
   * @generated
   */
  void setSrc1(Register value);

  /**
   * Returns the value of the '<em><b>Src2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src2</em>' containment reference.
   * @see #setSrc2(MoveValue)
   * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getSUB_Src2()
   * @model containment="true"
   * @generated
   */
  MoveValue getSrc2();

  /**
   * Sets the value of the '{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.SUB#getSrc2 <em>Src2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src2</em>' containment reference.
   * @see #getSrc2()
   * @generated
   */
  void setSrc2(MoveValue value);

} // SUB
