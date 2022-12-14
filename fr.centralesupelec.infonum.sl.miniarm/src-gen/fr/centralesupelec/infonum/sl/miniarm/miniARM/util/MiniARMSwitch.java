/**
 * generated by Xtext 2.27.0
 */
package fr.centralesupelec.infonum.sl.miniarm.miniARM.util;

import fr.centralesupelec.infonum.sl.miniarm.miniARM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage
 * @generated
 */
public class MiniARMSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MiniARMPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiniARMSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MiniARMPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MiniARMPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.LINE:
      {
        Line line = (Line)theEObject;
        T result = caseLine(line);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.INCLUDE:
      {
        Include include = (Include)theEObject;
        T result = caseInclude(include);
        if (result == null) result = caseLine(include);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.LABEL_DEF:
      {
        LabelDef labelDef = (LabelDef)theEObject;
        T result = caseLabelDef(labelDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.ASSEMBLY_INST:
      {
        AssemblyInst assemblyInst = (AssemblyInst)theEObject;
        T result = caseAssemblyInst(assemblyInst);
        if (result == null) result = caseInstruction(assemblyInst);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.PSEUDO_INST:
      {
        PseudoInst pseudoInst = (PseudoInst)theEObject;
        T result = casePseudoInst(pseudoInst);
        if (result == null) result = caseInstruction(pseudoInst);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.REAL_INST:
      {
        RealInst realInst = (RealInst)theEObject;
        T result = caseRealInst(realInst);
        if (result == null) result = caseInstruction(realInst);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.RMW:
      {
        RMW rmw = (RMW)theEObject;
        T result = caseRMW(rmw);
        if (result == null) result = caseAssemblyInst(rmw);
        if (result == null) result = caseInstruction(rmw);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.SMW:
      {
        SMW smw = (SMW)theEObject;
        T result = caseSMW(smw);
        if (result == null) result = caseAssemblyInst(smw);
        if (result == null) result = caseInstruction(smw);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.SMS:
      {
        SMS sms = (SMS)theEObject;
        T result = caseSMS(sms);
        if (result == null) result = caseAssemblyInst(sms);
        if (result == null) result = caseInstruction(sms);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.PUSH:
      {
        PUSH push = (PUSH)theEObject;
        T result = casePUSH(push);
        if (result == null) result = casePseudoInst(push);
        if (result == null) result = caseInstruction(push);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.POP:
      {
        POP pop = (POP)theEObject;
        T result = casePOP(pop);
        if (result == null) result = casePseudoInst(pop);
        if (result == null) result = caseInstruction(pop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.LOAD:
      {
        LOAD load = (LOAD)theEObject;
        T result = caseLOAD(load);
        if (result == null) result = caseRealInst(load);
        if (result == null) result = caseInstruction(load);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.REGISTER:
      {
        Register register = (Register)theEObject;
        T result = caseRegister(register);
        if (result == null) result = caseMoveValue(register);
        if (result == null) result = caseBranchAddress(register);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.IMMEDIATE:
      {
        Immediate immediate = (Immediate)theEObject;
        T result = caseImmediate(immediate);
        if (result == null) result = caseMoveValue(immediate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = caseBranchAddress(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.CONST:
      {
        Const const_ = (Const)theEObject;
        T result = caseConst(const_);
        if (result == null) result = caseValue(const_);
        if (result == null) result = caseBranchAddress(const_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.HEX_CONST:
      {
        HexConst hexConst = (HexConst)theEObject;
        T result = caseHexConst(hexConst);
        if (result == null) result = caseValue(hexConst);
        if (result == null) result = caseBranchAddress(hexConst);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.DIRECT:
      {
        Direct direct = (Direct)theEObject;
        T result = caseDirect(direct);
        if (result == null) result = caseAddress(direct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.DIRECT_REG:
      {
        DirectReg directReg = (DirectReg)theEObject;
        T result = caseDirectReg(directReg);
        if (result == null) result = caseAddress(directReg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.STORE:
      {
        STORE store = (STORE)theEObject;
        T result = caseSTORE(store);
        if (result == null) result = caseRealInst(store);
        if (result == null) result = caseInstruction(store);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.ADDRESS:
      {
        Address address = (Address)theEObject;
        T result = caseAddress(address);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.MOVE:
      {
        MOVE move = (MOVE)theEObject;
        T result = caseMOVE(move);
        if (result == null) result = caseRealInst(move);
        if (result == null) result = caseInstruction(move);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.MOVE_VALUE:
      {
        MoveValue moveValue = (MoveValue)theEObject;
        T result = caseMoveValue(moveValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.ADD:
      {
        ADD add = (ADD)theEObject;
        T result = caseADD(add);
        if (result == null) result = caseRealInst(add);
        if (result == null) result = caseInstruction(add);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.SUB:
      {
        SUB sub = (SUB)theEObject;
        T result = caseSUB(sub);
        if (result == null) result = caseRealInst(sub);
        if (result == null) result = caseInstruction(sub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.CMP:
      {
        CMP cmp = (CMP)theEObject;
        T result = caseCMP(cmp);
        if (result == null) result = caseRealInst(cmp);
        if (result == null) result = caseInstruction(cmp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.BEQ:
      {
        BEQ beq = (BEQ)theEObject;
        T result = caseBEQ(beq);
        if (result == null) result = caseRealInst(beq);
        if (result == null) result = caseInstruction(beq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.BRANCH_ADDRESS:
      {
        BranchAddress branchAddress = (BranchAddress)theEObject;
        T result = caseBranchAddress(branchAddress);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.BLT:
      {
        BLT blt = (BLT)theEObject;
        T result = caseBLT(blt);
        if (result == null) result = caseRealInst(blt);
        if (result == null) result = caseInstruction(blt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.BRANCH:
      {
        BRANCH branch = (BRANCH)theEObject;
        T result = caseBRANCH(branch);
        if (result == null) result = caseRealInst(branch);
        if (result == null) result = caseInstruction(branch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniARMPackage.BLINK:
      {
        BLINK blink = (BLINK)theEObject;
        T result = caseBLINK(blink);
        if (result == null) result = caseRealInst(blink);
        if (result == null) result = caseInstruction(blink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLine(Line object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInclude(Include object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelDef(LabelDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assembly Inst</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assembly Inst</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssemblyInst(AssemblyInst object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pseudo Inst</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pseudo Inst</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePseudoInst(PseudoInst object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Inst</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Inst</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealInst(RealInst object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RMW</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RMW</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRMW(RMW object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMW</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMW</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMW(SMW object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMS(SMS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PUSH</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PUSH</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePUSH(PUSH object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>POP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>POP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePOP(POP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LOAD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LOAD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLOAD(LOAD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Register</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Register</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegister(Register object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Immediate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Immediate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImmediate(Immediate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Const</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Const</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConst(Const object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hex Const</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hex Const</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHexConst(HexConst object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirect(Direct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Reg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Reg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectReg(DirectReg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>STORE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>STORE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSTORE(STORE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Address</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddress(Address object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MOVE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MOVE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMOVE(MOVE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Move Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Move Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoveValue(MoveValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ADD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ADD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseADD(ADD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SUB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SUB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSUB(SUB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CMP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CMP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCMP(CMP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BEQ</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BEQ</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBEQ(BEQ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Branch Address</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Branch Address</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBranchAddress(BranchAddress object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BLT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BLT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBLT(BLT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BRANCH</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BRANCH</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBRANCH(BRANCH object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BLINK</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BLINK</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBLINK(BLINK object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MiniARMSwitch
