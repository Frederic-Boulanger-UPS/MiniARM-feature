/**
 * generated by Xtext 2.27.0
 */
package fr.centralesupelec.infonum.sl.miniarm.miniARM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immediate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.Immediate#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getImmediate()
 * @model
 * @generated
 */
public interface Immediate extends MoveValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage#getImmediate_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link fr.centralesupelec.infonum.sl.miniarm.miniARM.Immediate#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // Immediate