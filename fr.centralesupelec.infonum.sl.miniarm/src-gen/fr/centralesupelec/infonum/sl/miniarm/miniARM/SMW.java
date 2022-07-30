/**
 * generated by Xtext 2.27.0
 */
package fr.centralesupelec.infonum.sl.miniarm.miniARM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMW</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.SMW#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getSMW()
 * @model
 * @generated
 */
public interface SMW extends AssemblyInst
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Const)
   * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getSMW_Value()
   * @model containment="true"
   * @generated
   */
  Const getValue();

  /**
   * Sets the value of the '{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.SMW#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Const value);

} // SMW