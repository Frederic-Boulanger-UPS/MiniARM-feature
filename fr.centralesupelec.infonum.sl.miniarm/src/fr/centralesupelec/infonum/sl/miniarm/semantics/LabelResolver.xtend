package fr.centralesupelec.infonum.sl.miniarm.semantics

import java.util.Map
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Program
import java.util.HashMap

/*
 * Resolve the labels in the program
 */
class LabelResolver {
	// We need a code generator to compute the size of the code of each instruction
	extension CodeGenerator cg = new CodeGenerator
	
	// Resolve the labels in a program and return a map that give the value of each label
	def Map<String, Integer> resolveLabels(Program prog) {
		// Program counter
		var pc = 0
		// Map that gives the value of each label
		var labelMap = new HashMap<String, Integer>
		
		for (line : prog.lines) {
			if (line.labelDef !== null) {
				// If there is a label definition on this line, 
				// its value is the current value of the PC
				labelMap.put(line.labelDef.label.name, pc)
			}
			if (line.inst !== null) {
				// If there is an instruction on this line, 
				// the PC grows by the size of the code of the instruction
				pc += line.inst.size
			}
		}

		return labelMap
	}
}