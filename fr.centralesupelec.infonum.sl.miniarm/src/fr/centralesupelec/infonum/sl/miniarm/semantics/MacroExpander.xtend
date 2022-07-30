package fr.centralesupelec.infonum.sl.miniarm.semantics

import fr.centralesupelec.infonum.sl.miniarm.miniARM.Include
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Line
import fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMFactory
import fr.centralesupelec.infonum.sl.miniarm.miniARM.POP
import fr.centralesupelec.infonum.sl.miniarm.miniARM.PUSH
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Program
import fr.centralesupelec.infonum.sl.miniarm.miniARM.PseudoInst
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2

/*
 * Expand macros in the source assembly code
 */
class MacroExpander {
	def expandMacros(Program prog, Resource resource, IFileSystemAccess2 fsa) {
		// The new sequence of lines for the expanded program
		var expLines = new ArrayList<Line>
		
		for (line : prog.lines) {
			if (line instanceof Include) {
				var inclines = (line as Include).expandInclude(resource, fsa)
				if (inclines === null) {
					System.err.println('File "' + (line as Include).fileName + '" does not exist')
				} else {
					expLines.addAll(inclines)
				}
			} else if (line.inst === null) {
				// Lines that do not contain an instruction are copied unchanged
				expLines.add(line)
			} else if (line.inst instanceof PseudoInst) {
				// Pseudo instructions are expanded to a sequence of lines
				expLines.addAll(line.expandMacro)
			} else {
				// Lines containing a regular instruction are copied unchanged
				expLines.add(line)
			}
		}
		
		// Replace the lines of the program with the new expanded lines
		prog.lines.clear
		prog.lines.addAll(expLines)
	}

	
	private def List<Line> expandInclude(Include inc, Resource resource, IFileSystemAccess2 fsa) {
		var rset = resource.resourceSet
		// Get the resource that corresponds to the included file
		var incres = rset.getResource(resource.URI.trimSegments(1).appendSegment(inc.fileName), true)
		
		if (incres === null) {
			return null  // no such file
		}
		// If the file is empty
		if (incres.contents.size == 0) {
			return new ArrayList<Line>
		}
		// Get the program at the root of the resource
		var incprog = incres.contents.get(0) as Program
		// and return its lines
		return incprog.lines
	}
	
	private def dispatch List<Line> expandMacro(Line l) {
		if (l.inst !== null && l.inst instanceof PseudoInst) {
			// Only pseudo instructions are expanded
			var expLines = l.inst.expandMacro
			// The eventual label on the pseudo instruction is copied 
			// to the first instruction of the expansion
			expLines.get(0).labelDef = l.labelDef
			// The eventual original comment on the line
			// is moved to the second line 
			expLines.get(1).comment = l.comment
			return expLines
		}
		// Lines without instruction of with a regular instruction are not expanded
		return #[l]
	}
	
	// The 'push rz' pseudo instruction is expanded as:
	//    add sp, sp, #1
	//    str rz, [sp]
	private def dispatch List<Line> expandMacro(PUSH p) {
		var exp = new ArrayList<Line>
		
		// Create the increment of the sp
		var incsp = MiniARMFactory.eINSTANCE.createADD
		incsp.dst = MiniARMFactory.eINSTANCE.createRegister
		incsp.dst.name = "sp"
		incsp.src1 = MiniARMFactory.eINSTANCE.createRegister
		incsp.src1.name = "sp"
		var inc = MiniARMFactory.eINSTANCE.createConst
		inc.num = 1
		var incimm = MiniARMFactory.eINSTANCE.createImmediate
		incimm.value = inc
		incsp.src2 = incimm
		
		// Create a line to hold the instruction
		var expline = MiniARMFactory.eINSTANCE.createLine
		// Add a comment to tell where these instructions come from
		expline.comment = "% push " + p.reg.name
		expline.inst = incsp
		// Add this line to the expansion
		exp.add(expline)
		
		// Create the str instruction
		var storesp = MiniARMFactory.eINSTANCE.createSTORE
		storesp.reg = MiniARMFactory.eINSTANCE.createRegister
		storesp.reg.name = p.reg.name
		var pushreg = MiniARMFactory.eINSTANCE.createDirectReg
		pushreg.reg = MiniARMFactory.eINSTANCE.createRegister
		pushreg.reg.name = "sp"
		storesp.address = pushreg
		
		// Create a line to hold this instruction
		expline = MiniARMFactory.eINSTANCE.createLine
		expline.inst = storesp
		// Add this line to the expansion
		exp.add(expline)
		
		return exp
	}
	
	// The 'pop rx' pseudo instruction is expanded as:
	//    ldr rx, [sp]
	//    sub sp, sp, #1
	private def dispatch List<Line> expandMacro(POP p) {
		var exp = new ArrayList<Line>
		
		// Create the ldr instruction
		var ldsp = MiniARMFactory.eINSTANCE.createLOAD
		ldsp.reg = MiniARMFactory.eINSTANCE.createRegister
		ldsp.reg.name = p.reg.name
		var popreg = MiniARMFactory.eINSTANCE.createDirectReg
		popreg.reg = MiniARMFactory.eINSTANCE.createRegister
		popreg.reg.name = "sp"
		ldsp.address = popreg
		
		// Create a line to hold the instruction
		var expline = MiniARMFactory.eINSTANCE.createLine
		// Add a comment to tell where these instructions come from
		expline.comment = "% pop  " + p.reg.name
		expline.inst = ldsp
		// Add this line to the expansion
		exp.add(expline)

		// Create the decrement of the sp		
		var decsp = MiniARMFactory.eINSTANCE.createSUB
		decsp.dst = MiniARMFactory.eINSTANCE.createRegister
		decsp.dst.name = "sp"
		decsp.src1 = MiniARMFactory.eINSTANCE.createRegister
		decsp.src1.name = "sp"
		var dec = MiniARMFactory.eINSTANCE.createConst
		dec.num = 1
		var decimm = MiniARMFactory.eINSTANCE.createImmediate
		decimm.value = dec
		decsp.src2 = decimm
		
		// Create a line to hold the instruction
		expline = MiniARMFactory.eINSTANCE.createLine
		expline.inst = decsp
		// Add this line to the expansion
		exp.add(expline)
		
		return exp
	}
}
