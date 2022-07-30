package fr.centralesupelec.infonum.sl.miniarm.semantics;

import com.google.common.base.Objects;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.ADD;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Address;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BEQ;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BLINK;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BLT;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BRANCH;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BranchAddress;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.CMP;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Const;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Direct;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.DirectReg;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.HexConst;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Immediate;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Instruction;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.LOAD;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Label;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Line;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.MOVE;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.MoveValue;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Program;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.RMW;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Register;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.SMS;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.SMW;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.STORE;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.SUB;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@SuppressWarnings("all")
public class CodeGenerator {
  private static final int LOADcode = 0x0000;

  private static final int STOREcode = 0x0001;

  private static final int MOVEcode = 0x0002;

  private static final int ADDcode = 0x0003;

  private static final int SUBcode = 0x0004;

  private static final int CMPcode = 0x0005;

  private static final int BEQcode = 0x0006;

  private static final int BLTcode = 0x0007;

  private static final int BRAcode = 0x0008;

  private static final int BLcode = 0x0009;

  private static final int IMM = 0x0800;

  private static final int CodeOffset = 12;

  private static final int RxOffset = 8;

  private static final int RyOffset = 5;

  private static final int RzOffset = 2;

  public String generateCode(final Program prog, final Map<String, Integer> labelMap) {
    StringBuilder buf = new StringBuilder();
    int words = 0;
    buf.append("v2.0 raw\n");
    EList<Line> _lines = prog.getLines();
    for (final Line line : _lines) {
      Instruction _inst = line.getInst();
      boolean _tripleNotEquals = (_inst != null);
      if (_tripleNotEquals) {
        List<Integer> code = this.genCode(line.getInst(), labelMap);
        for (final Integer wrd : code) {
          {
            String ws = String.format("%04X", wrd);
            buf.append(ws);
            int _words = words;
            words = (_words + 1);
            if (((words % 8) == 0)) {
              buf.append("\n");
            } else {
              buf.append(" ");
            }
          }
        }
      }
    }
    return buf.toString();
  }

  public int size(final Instruction inst) {
    return this.genCode(inst, null).size();
  }

  protected List<Integer> _genCode(final RMW inst, final Map<String, Integer> labelMap) {
    ArrayList<Integer> code = new ArrayList<Integer>();
    int _num = inst.getSize().getNum();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _num, true);
    for (final Integer i : _doubleDotLessThan) {
      code.add(Integer.valueOf(0));
    }
    return code;
  }

  protected List<Integer> _genCode(final SMW inst, final Map<String, Integer> labelMap) {
    int _num = inst.getValue().getNum();
    return Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(_num)));
  }

  protected List<Integer> _genCode(final SMS inst, final Map<String, Integer> labelMap) {
    try {
      ArrayList<Integer> code = new ArrayList<Integer>();
      byte[] encodestr = inst.getValue().getBytes("utf-8");
      boolean firstbyte = true;
      int cde = 0;
      int _length = inst.getValue().length();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final Integer i : _doubleDotLessThan) {
        if (firstbyte) {
          byte _get = encodestr[(i).intValue()];
          int _doubleLessThan = (_get << 8);
          cde = _doubleLessThan;
          firstbyte = false;
        } else {
          cde = (cde | encodestr[(i).intValue()]);
          code.add(Integer.valueOf(cde));
          cde = 0;
          firstbyte = true;
        }
      }
      code.add(Integer.valueOf(cde));
      return code;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public List<Integer> gen_LOAD_STORE_address(final int instcode, final Address addr, final Map<String, Integer> labelMap) {
    ArrayList<Integer> code = new ArrayList<Integer>();
    int cde = instcode;
    if ((addr instanceof Direct)) {
      cde = (cde | CodeGenerator.IMM);
      code.add(Integer.valueOf(cde));
      code.add(Integer.valueOf(this.value(((Direct) addr).getAddress(), labelMap)));
    } else {
      int _number = this.number(((DirectReg) addr).getReg());
      int _doubleLessThan = (_number << CodeGenerator.RyOffset);
      int _bitwiseOr = (cde | _doubleLessThan);
      cde = _bitwiseOr;
      code.add(Integer.valueOf(cde));
    }
    return code;
  }

  protected List<Integer> _genCode(final LOAD inst, final Map<String, Integer> labelMap) {
    int _number = this.number(inst.getReg());
    int _doubleLessThan = (_number << CodeGenerator.RxOffset);
    int _bitwiseOr = ((CodeGenerator.LOADcode << CodeGenerator.CodeOffset) | _doubleLessThan);
    return this.gen_LOAD_STORE_address(_bitwiseOr, 
      inst.getAddress(), labelMap);
  }

  protected List<Integer> _genCode(final STORE inst, final Map<String, Integer> labelMap) {
    int _number = this.number(inst.getReg());
    int _doubleLessThan = (_number << CodeGenerator.RzOffset);
    int _bitwiseOr = ((CodeGenerator.STOREcode << CodeGenerator.CodeOffset) | _doubleLessThan);
    return this.gen_LOAD_STORE_address(_bitwiseOr, 
      inst.getAddress(), labelMap);
  }

  protected List<Integer> _genCode(final MOVE inst, final Map<String, Integer> labelMap) {
    ArrayList<Integer> code = new ArrayList<Integer>();
    int _number = this.number(inst.getDst());
    int _doubleLessThan = (_number << CodeGenerator.RxOffset);
    int cde = ((CodeGenerator.MOVEcode << CodeGenerator.CodeOffset) | _doubleLessThan);
    MoveValue _src = inst.getSrc();
    if ((_src instanceof Immediate)) {
      cde = (cde | CodeGenerator.IMM);
      code.add(Integer.valueOf(cde));
      MoveValue _src_1 = inst.getSrc();
      code.add(Integer.valueOf(this.value(((Immediate) _src_1).getValue(), labelMap)));
    } else {
      MoveValue _src_2 = inst.getSrc();
      int _number_1 = this.number(((Register) _src_2));
      int _doubleLessThan_1 = (_number_1 << CodeGenerator.RyOffset);
      int _bitwiseOr = (cde | _doubleLessThan_1);
      cde = _bitwiseOr;
      code.add(Integer.valueOf(cde));
    }
    return code;
  }

  public List<Integer> genCode_ADD_SUB(final int instCode, final Register dst, final Register src1, final MoveValue src2, final Map<String, Integer> labelMap) {
    ArrayList<Integer> code = new ArrayList<Integer>();
    int _number = this.number(dst);
    int _doubleLessThan = (_number << CodeGenerator.RxOffset);
    int _bitwiseOr = ((instCode << CodeGenerator.CodeOffset) | _doubleLessThan);
    int _number_1 = this.number(src1);
    int _doubleLessThan_1 = (_number_1 << CodeGenerator.RyOffset);
    int cde = (_bitwiseOr | _doubleLessThan_1);
    if ((src2 instanceof Immediate)) {
      cde = (cde | CodeGenerator.IMM);
      code.add(Integer.valueOf(cde));
      code.add(Integer.valueOf(this.value(((Immediate) src2).getValue(), labelMap)));
    } else {
      int _number_2 = this.number(((Register) src2));
      int _doubleLessThan_2 = (_number_2 << CodeGenerator.RzOffset);
      int _bitwiseOr_1 = (cde | _doubleLessThan_2);
      cde = _bitwiseOr_1;
      code.add(Integer.valueOf(cde));
    }
    return code;
  }

  protected List<Integer> _genCode(final ADD inst, final Map<String, Integer> labelMap) {
    return this.genCode_ADD_SUB(CodeGenerator.ADDcode, inst.getDst(), inst.getSrc1(), inst.getSrc2(), labelMap);
  }

  protected List<Integer> _genCode(final SUB inst, final Map<String, Integer> labelMap) {
    return this.genCode_ADD_SUB(CodeGenerator.SUBcode, inst.getDst(), inst.getSrc1(), inst.getSrc2(), labelMap);
  }

  protected List<Integer> _genCode(final CMP inst, final Map<String, Integer> labelMap) {
    ArrayList<Integer> code = new ArrayList<Integer>();
    int _number = this.number(inst.getSrc1());
    int _doubleLessThan = (_number << CodeGenerator.RyOffset);
    int cde = ((CodeGenerator.CMPcode << CodeGenerator.CodeOffset) | _doubleLessThan);
    MoveValue _src2 = inst.getSrc2();
    if ((_src2 instanceof Immediate)) {
      cde = (cde | CodeGenerator.IMM);
      code.add(Integer.valueOf(cde));
      MoveValue _src2_1 = inst.getSrc2();
      code.add(Integer.valueOf(this.value(((Immediate) _src2_1).getValue(), labelMap)));
    } else {
      MoveValue _src2_2 = inst.getSrc2();
      int _number_1 = this.number(((Register) _src2_2));
      int _doubleLessThan_1 = (_number_1 << CodeGenerator.RzOffset);
      int _bitwiseOr = (cde | _doubleLessThan_1);
      cde = _bitwiseOr;
      code.add(Integer.valueOf(cde));
    }
    return code;
  }

  public List<Integer> genCode_BR(final int instCode, final int rx, final BranchAddress dest, final Map<String, Integer> labelMap) {
    ArrayList<Integer> code = new ArrayList<Integer>();
    int cde = ((instCode << CodeGenerator.CodeOffset) | (rx << CodeGenerator.RxOffset));
    if ((dest instanceof Value)) {
      cde = (cde | CodeGenerator.IMM);
      code.add(Integer.valueOf(cde));
      code.add(Integer.valueOf(this.value(((Value) dest), labelMap)));
    } else {
      int _number = this.number(((Register) dest));
      int _doubleLessThan = (_number << CodeGenerator.RzOffset);
      int _bitwiseOr = (cde | _doubleLessThan);
      cde = _bitwiseOr;
      code.add(Integer.valueOf(cde));
    }
    return code;
  }

  protected List<Integer> _genCode(final BEQ inst, final Map<String, Integer> labelMap) {
    return this.genCode_BR(CodeGenerator.BEQcode, 0, inst.getDest(), labelMap);
  }

  protected List<Integer> _genCode(final BLT inst, final Map<String, Integer> labelMap) {
    return this.genCode_BR(CodeGenerator.BLTcode, 0, inst.getDest(), labelMap);
  }

  protected List<Integer> _genCode(final BRANCH inst, final Map<String, Integer> labelMap) {
    return this.genCode_BR(CodeGenerator.BRAcode, 0, inst.getDest(), labelMap);
  }

  protected List<Integer> _genCode(final BLINK inst, final Map<String, Integer> labelMap) {
    return this.genCode_BR(CodeGenerator.BLcode, this.number(inst.getReg()), inst.getDest(), labelMap);
  }

  public int number(final Register r) {
    String _name = r.getName();
    boolean _equals = Objects.equal(_name, "r0");
    if (_equals) {
      return 0;
    } else {
      String _name_1 = r.getName();
      boolean _equals_1 = Objects.equal(_name_1, "r1");
      if (_equals_1) {
        return 1;
      } else {
        String _name_2 = r.getName();
        boolean _equals_2 = Objects.equal(_name_2, "r2");
        if (_equals_2) {
          return 2;
        } else {
          String _name_3 = r.getName();
          boolean _equals_3 = Objects.equal(_name_3, "r3");
          if (_equals_3) {
            return 3;
          } else {
            String _name_4 = r.getName();
            boolean _equals_4 = Objects.equal(_name_4, "r4");
            if (_equals_4) {
              return 4;
            } else {
              String _name_5 = r.getName();
              boolean _equals_5 = Objects.equal(_name_5, "r5");
              if (_equals_5) {
                return 5;
              } else {
                if ((Objects.equal(r.getName(), "r6") || Objects.equal(r.getName(), "sp"))) {
                  return 6;
                } else {
                  if ((Objects.equal(r.getName(), "r7") || Objects.equal(r.getName(), "lr"))) {
                    return 7;
                  } else {
                    return (-1);
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  protected int _value(final Const c, final Map<String, Integer> labelMap) {
    return c.getNum();
  }

  protected int _value(final HexConst c, final Map<String, Integer> labelMap) {
    return c.getNum();
  }

  protected int _value(final Value v, final Map<String, Integer> labelMap) {
    return this.value(v.getLabel(), labelMap);
  }

  protected int _value(final Label l, final Map<String, Integer> labelMap) {
    if ((labelMap == null)) {
      return 0;
    }
    return (labelMap.get(l.getName())).intValue();
  }

  public List<Integer> genCode(final Instruction inst, final Map<String, Integer> labelMap) {
    if (inst instanceof ADD) {
      return _genCode((ADD)inst, labelMap);
    } else if (inst instanceof BEQ) {
      return _genCode((BEQ)inst, labelMap);
    } else if (inst instanceof BLINK) {
      return _genCode((BLINK)inst, labelMap);
    } else if (inst instanceof BLT) {
      return _genCode((BLT)inst, labelMap);
    } else if (inst instanceof BRANCH) {
      return _genCode((BRANCH)inst, labelMap);
    } else if (inst instanceof CMP) {
      return _genCode((CMP)inst, labelMap);
    } else if (inst instanceof LOAD) {
      return _genCode((LOAD)inst, labelMap);
    } else if (inst instanceof MOVE) {
      return _genCode((MOVE)inst, labelMap);
    } else if (inst instanceof RMW) {
      return _genCode((RMW)inst, labelMap);
    } else if (inst instanceof SMS) {
      return _genCode((SMS)inst, labelMap);
    } else if (inst instanceof SMW) {
      return _genCode((SMW)inst, labelMap);
    } else if (inst instanceof STORE) {
      return _genCode((STORE)inst, labelMap);
    } else if (inst instanceof SUB) {
      return _genCode((SUB)inst, labelMap);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(inst, labelMap).toString());
    }
  }

  public int value(final EObject c, final Map<String, Integer> labelMap) {
    if (c instanceof Const) {
      return _value((Const)c, labelMap);
    } else if (c instanceof HexConst) {
      return _value((HexConst)c, labelMap);
    } else if (c instanceof Value) {
      return _value((Value)c, labelMap);
    } else if (c instanceof Label) {
      return _value((Label)c, labelMap);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c, labelMap).toString());
    }
  }
}
