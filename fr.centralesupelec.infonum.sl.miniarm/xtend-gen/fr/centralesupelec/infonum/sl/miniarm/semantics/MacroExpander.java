package fr.centralesupelec.infonum.sl.miniarm.semantics;

import fr.centralesupelec.infonum.sl.miniarm.miniARM.ADD;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Const;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.DirectReg;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Immediate;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Include;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Instruction;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.LOAD;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Line;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMFactory;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.POP;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.PUSH;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Program;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.PseudoInst;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Register;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.STORE;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.SUB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * Expand macros in the source assembly code
 */
@SuppressWarnings("all")
public class MacroExpander {
  public boolean expandMacros(final Program prog, final Resource resource, final IFileSystemAccess2 fsa) {
    boolean _xblockexpression = false;
    {
      ArrayList<Line> expLines = new ArrayList<Line>();
      EList<Line> _lines = prog.getLines();
      for (final Line line : _lines) {
        if ((line instanceof Include)) {
          List<Line> inclines = this.expandInclude(((Include) line), resource, fsa);
          if ((inclines == null)) {
            String _fileName = ((Include) line).getFileName();
            String _plus = ("File \"" + _fileName);
            String _plus_1 = (_plus + "\" does not exist");
            System.err.println(_plus_1);
            expLines.add(line);
          } else {
            expLines.addAll(inclines);
          }
        } else {
          Instruction _inst = line.getInst();
          boolean _tripleEquals = (_inst == null);
          if (_tripleEquals) {
            expLines.add(line);
          } else {
            Instruction _inst_1 = line.getInst();
            if ((_inst_1 instanceof PseudoInst)) {
              expLines.addAll(this.expandMacro(line));
            } else {
              expLines.add(line);
            }
          }
        }
      }
      prog.getLines().clear();
      _xblockexpression = prog.getLines().addAll(expLines);
    }
    return _xblockexpression;
  }

  private List<Line> expandInclude(final Include inc, final Resource resource, final IFileSystemAccess2 fsa) {
    ResourceSet rset = resource.getResourceSet();
    Resource incres = rset.getResource(resource.getURI().trimSegments(1).appendSegment(inc.getFileName()), true);
    if ((incres == null)) {
      return null;
    }
    int _size = incres.getContents().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return new ArrayList<Line>();
    }
    EObject _get = incres.getContents().get(0);
    Program incprog = ((Program) _get);
    return incprog.getLines();
  }

  private List<Line> _expandMacro(final Line l) {
    if (((l.getInst() != null) && (l.getInst() instanceof PseudoInst))) {
      List<Line> expLines = this.expandMacro(l.getInst());
      Line _get = expLines.get(0);
      _get.setLabelDef(l.getLabelDef());
      Line _get_1 = expLines.get(1);
      _get_1.setComment(l.getComment());
      return expLines;
    }
    return Collections.<Line>unmodifiableList(CollectionLiterals.<Line>newArrayList(l));
  }

  private List<Line> _expandMacro(final PUSH p) {
    ArrayList<Line> exp = new ArrayList<Line>();
    ADD incsp = MiniARMFactory.eINSTANCE.createADD();
    incsp.setDst(MiniARMFactory.eINSTANCE.createRegister());
    Register _dst = incsp.getDst();
    _dst.setName("sp");
    incsp.setSrc1(MiniARMFactory.eINSTANCE.createRegister());
    Register _src1 = incsp.getSrc1();
    _src1.setName("sp");
    Const inc = MiniARMFactory.eINSTANCE.createConst();
    inc.setNum(1);
    Immediate incimm = MiniARMFactory.eINSTANCE.createImmediate();
    incimm.setValue(inc);
    incsp.setSrc2(incimm);
    Line expline = MiniARMFactory.eINSTANCE.createLine();
    String _name = p.getReg().getName();
    String _plus = ("% push " + _name);
    expline.setComment(_plus);
    expline.setInst(incsp);
    exp.add(expline);
    STORE storesp = MiniARMFactory.eINSTANCE.createSTORE();
    storesp.setReg(MiniARMFactory.eINSTANCE.createRegister());
    Register _reg = storesp.getReg();
    _reg.setName(p.getReg().getName());
    DirectReg pushreg = MiniARMFactory.eINSTANCE.createDirectReg();
    pushreg.setReg(MiniARMFactory.eINSTANCE.createRegister());
    Register _reg_1 = pushreg.getReg();
    _reg_1.setName("sp");
    storesp.setAddress(pushreg);
    expline = MiniARMFactory.eINSTANCE.createLine();
    expline.setInst(storesp);
    exp.add(expline);
    return exp;
  }

  private List<Line> _expandMacro(final POP p) {
    ArrayList<Line> exp = new ArrayList<Line>();
    LOAD ldsp = MiniARMFactory.eINSTANCE.createLOAD();
    ldsp.setReg(MiniARMFactory.eINSTANCE.createRegister());
    Register _reg = ldsp.getReg();
    _reg.setName(p.getReg().getName());
    DirectReg popreg = MiniARMFactory.eINSTANCE.createDirectReg();
    popreg.setReg(MiniARMFactory.eINSTANCE.createRegister());
    Register _reg_1 = popreg.getReg();
    _reg_1.setName("sp");
    ldsp.setAddress(popreg);
    Line expline = MiniARMFactory.eINSTANCE.createLine();
    String _name = p.getReg().getName();
    String _plus = ("% pop  " + _name);
    expline.setComment(_plus);
    expline.setInst(ldsp);
    exp.add(expline);
    SUB decsp = MiniARMFactory.eINSTANCE.createSUB();
    decsp.setDst(MiniARMFactory.eINSTANCE.createRegister());
    Register _dst = decsp.getDst();
    _dst.setName("sp");
    decsp.setSrc1(MiniARMFactory.eINSTANCE.createRegister());
    Register _src1 = decsp.getSrc1();
    _src1.setName("sp");
    Const dec = MiniARMFactory.eINSTANCE.createConst();
    dec.setNum(1);
    Immediate decimm = MiniARMFactory.eINSTANCE.createImmediate();
    decimm.setValue(dec);
    decsp.setSrc2(decimm);
    expline = MiniARMFactory.eINSTANCE.createLine();
    expline.setInst(decsp);
    exp.add(expline);
    return exp;
  }

  private List<Line> expandMacro(final EObject p) {
    if (p instanceof POP) {
      return _expandMacro((POP)p);
    } else if (p instanceof PUSH) {
      return _expandMacro((PUSH)p);
    } else if (p instanceof Line) {
      return _expandMacro((Line)p);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(p).toString());
    }
  }
}
