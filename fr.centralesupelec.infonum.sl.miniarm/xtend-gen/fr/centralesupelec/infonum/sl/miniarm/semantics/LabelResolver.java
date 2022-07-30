package fr.centralesupelec.infonum.sl.miniarm.semantics;

import fr.centralesupelec.infonum.sl.miniarm.miniARM.Instruction;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.LabelDef;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Line;
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Program;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * Resolve the labels in the program
 */
@SuppressWarnings("all")
public class LabelResolver {
  @Extension
  private CodeGenerator cg = new CodeGenerator();

  public Map<String, Integer> resolveLabels(final Program prog) {
    int pc = 0;
    HashMap<String, Integer> labelMap = new HashMap<String, Integer>();
    EList<Line> _lines = prog.getLines();
    for (final Line line : _lines) {
      {
        LabelDef _labelDef = line.getLabelDef();
        boolean _tripleNotEquals = (_labelDef != null);
        if (_tripleNotEquals) {
          labelMap.put(line.getLabelDef().getLabel().getName(), Integer.valueOf(pc));
        }
        Instruction _inst = line.getInst();
        boolean _tripleNotEquals_1 = (_inst != null);
        if (_tripleNotEquals_1) {
          int _pc = pc;
          int _size = this.cg.size(line.getInst());
          pc = (_pc + _size);
        }
      }
    }
    return labelMap;
  }
}
