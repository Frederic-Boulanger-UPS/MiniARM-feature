/**
 * generated by Xtext 2.27.0
 */
package fr.centralesupelec.infonum.sl.miniarm.miniARM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BLINK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.BLINK#getReg <em>Reg</em>}</li>
 *   <li>{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.BLINK#getDest <em>Dest</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getBLINK()
 * @model
 * @generated
 */
public interface BLINK extends RealInst
{
  /**
   * Returns the value of the '<em><b>Reg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reg</em>' containment reference.
   * @see #setReg(Register)
   * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getBLINK_Reg()
   * @model containment="true"
   * @generated
   */
  Register getReg();

  /**
   * Sets the value of the '{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.BLINK#getReg <em>Reg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reg</em>' containment reference.
   * @see #getReg()
   * @generated
   */
  void setReg(Register value);

  /**
   * Returns the value of the '<em><b>Dest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' containment reference.
   * @see #setDest(BranchAddress)
   * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getBLINK_Dest()
   * @model containment="true"
   * @generated
   */
  BranchAddress getDest();

  /**
   * Sets the value of the '{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.BLINK#getDest <em>Dest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' containment reference.
   * @see #getDest()
   * @generated
   */
  void setDest(BranchAddress value);

} // BLINK
