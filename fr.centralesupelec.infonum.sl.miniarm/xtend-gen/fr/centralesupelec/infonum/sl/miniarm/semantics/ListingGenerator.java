package fr.centralesupelec.infonum.sl.miniarm.semantics;

import fr.centralesupelec.infonum.sl.miniarm.miniARM.ADD;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BEQ;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BLINK;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BLT;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BRANCH;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.CMP;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Const;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Direct;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.DirectReg;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.HexConst;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Immediate;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Instruction;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.LOAD;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Label;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.LabelDef;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Line;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.MOVE;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Program;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.RMW;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Register;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.SMS;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.SMW;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.STORE;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.SUB;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Value;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ListingGenerator {
  @Extension
  private CodeGenerator cg = new CodeGenerator();

  public String generateListing(final Program prog, final Map<String, Integer> labelMap) {
    int pc = 0;
    StringBuilder buf = new StringBuilder();
    EList<Line> _lines = prog.getLines();
    for (final Line line : _lines) {
      {
        Instruction _inst = line.getInst();
        boolean _tripleEquals = (_inst == null);
        if (_tripleEquals) {
          LabelDef _labelDef = line.getLabelDef();
          boolean _tripleEquals_1 = (_labelDef == null);
          if (_tripleEquals_1) {
            String _comment = line.getComment();
            boolean _tripleNotEquals = (_comment != null);
            if (_tripleNotEquals) {
              buf.append(line.getComment().trim());
            }
          } else {
            buf.append(String.format("%04X %-9s", Integer.valueOf(pc), line.getLabelDef().getLabel().getName()));
            String _comment_1 = line.getComment();
            boolean _tripleNotEquals_1 = (_comment_1 != null);
            if (_tripleNotEquals_1) {
              buf.append(" ");
              buf.append(line.getComment().trim());
            }
          }
        } else {
          int[] code = ((int[])Conversions.unwrapArray(this.cg.genCode(line.getInst(), labelMap), int.class));
          String lab = "";
          LabelDef _labelDef_1 = line.getLabelDef();
          boolean _tripleNotEquals_2 = (_labelDef_1 != null);
          if (_tripleNotEquals_2) {
            String _name = line.getLabelDef().getLabel().getName();
            String _plus = ("@" + _name);
            lab = _plus;
          }
          buf.append(
            String.format("%04X %-10s %04X %-23s", Integer.valueOf(pc), lab, Integer.valueOf(code[0]), this.genMnemo(line.getInst())));
          String _comment_2 = line.getComment();
          boolean _tripleNotEquals_3 = (_comment_2 != null);
          if (_tripleNotEquals_3) {
            buf.append(" ");
            buf.append(line.getComment().trim());
          }
          final int[] _converted_code = (int[])code;
          int _size = ((List<Integer>)Conversions.doWrapArray(_converted_code)).size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _size, true);
          for (final Integer i : _doubleDotLessThan) {
            buf.append(
              String.format("\n%4s %-10s %04X", 
                "", "", Integer.valueOf(code[(i).intValue()])));
          }
          int _pc = pc;
          final int[] _converted_code_1 = (int[])code;
          int _size_1 = ((List<Integer>)Conversions.doWrapArray(_converted_code_1)).size();
          pc = (_pc + _size_1);
        }
        buf.append("\r");
      }
    }
    return buf.toString();
  }

  private String _genMnemo(final RMW inst) {
    return String.format("%-4s %s", "rmw", this.display(inst.getSize()));
  }

  private String _genMnemo(final SMW inst) {
    return String.format("%-4s %s", "smw", this.display(inst.getValue()));
  }

  private String _genMnemo(final SMS inst) {
    return String.format("%-4s \"%s\"", "smw", inst.getValue());
  }

  private String _genMnemo(final LOAD inst) {
    return String.format("%-4s %s, %s", "ldr", inst.getReg().getName(), this.display(inst.getAddress()));
  }

  private String _genMnemo(final STORE inst) {
    return String.format("%-4s %s, %s", "str", inst.getReg().getName(), this.display(inst.getAddress()));
  }

  private String _genMnemo(final MOVE inst) {
    return String.format("%-4s %s, %s", "mov", inst.getDst().getName(), this.display(inst.getSrc()));
  }

  private String _genMnemo(final ADD inst) {
    return String.format("%-4s %s, %s, %s", "add", inst.getDst().getName(), inst.getSrc1().getName(), this.display(inst.getSrc2()));
  }

  private String _genMnemo(final SUB inst) {
    return String.format("%-4s %s, %s, %s", "sub", inst.getDst().getName(), inst.getSrc1().getName(), this.display(inst.getSrc2()));
  }

  private String _genMnemo(final CMP inst) {
    return String.format("%-4s %s, %s", "cmp", inst.getSrc1().getName(), this.display(inst.getSrc2()));
  }

  private String _genMnemo(final BEQ inst) {
    return String.format("%-4s %s", "beq", this.display(inst.getDest()));
  }

  private String _genMnemo(final BLT inst) {
    return String.format("%-4s %s", "blt", this.display(inst.getDest()));
  }

  private String _genMnemo(final BRANCH inst) {
    return String.format("%-4s %s", "b", this.display(inst.getDest()));
  }

  private String _genMnemo(final BLINK inst) {
    return String.format("%-4s %s, %s", "bl", inst.getReg().getName(), this.display(inst.getDest()));
  }

  private String _display(final Direct addr) {
    return this.display(addr.getAddress());
  }

  private String _display(final DirectReg addr) {
    String _display = this.display(addr.getReg());
    String _plus = ("[" + _display);
    return (_plus + "]");
  }

  private String _display(final Value value) {
    return this.display(value.getLabel());
  }

  private String _display(final Const value) {
    return Integer.valueOf(value.getNum()).toString();
  }

  private String _display(final HexConst value) {
    return String.format("0x%X", Integer.valueOf(value.getNum()));
  }

  private String _display(final Label value) {
    return value.getName();
  }

  private String _display(final Immediate value) {
    String _display = this.display(value.getValue());
    return ("#" + _display);
  }

  private String _display(final Register value) {
    return value.getName();
  }

  private String genMnemo(final Instruction inst) {
    if (inst instanceof ADD) {
      return _genMnemo((ADD)inst);
    } else if (inst instanceof BEQ) {
      return _genMnemo((BEQ)inst);
    } else if (inst instanceof BLINK) {
      return _genMnemo((BLINK)inst);
    } else if (inst instanceof BLT) {
      return _genMnemo((BLT)inst);
    } else if (inst instanceof BRANCH) {
      return _genMnemo((BRANCH)inst);
    } else if (inst instanceof CMP) {
      return _genMnemo((CMP)inst);
    } else if (inst instanceof LOAD) {
      return _genMnemo((LOAD)inst);
    } else if (inst instanceof MOVE) {
      return _genMnemo((MOVE)inst);
    } else if (inst instanceof RMW) {
      return _genMnemo((RMW)inst);
    } else if (inst instanceof SMS) {
      return _genMnemo((SMS)inst);
    } else if (inst instanceof SMW) {
      return _genMnemo((SMW)inst);
    } else if (inst instanceof STORE) {
      return _genMnemo((STORE)inst);
    } else if (inst instanceof SUB) {
      return _genMnemo((SUB)inst);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(inst).toString());
    }
  }

  private String display(final EObject value) {
    if (value instanceof Const) {
      return _display((Const)value);
    } else if (value instanceof HexConst) {
      return _display((HexConst)value);
    } else if (value instanceof Direct) {
      return _display((Direct)value);
    } else if (value instanceof DirectReg) {
      return _display((DirectReg)value);
    } else if (value instanceof Immediate) {
      return _display((Immediate)value);
    } else if (value instanceof Register) {
      return _display((Register)value);
    } else if (value instanceof Value) {
      return _display((Value)value);
    } else if (value instanceof Label) {
      return _display((Label)value);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(value).toString());
    }
  }
}
