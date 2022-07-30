package fr.centralesupelec.infonum.sl.miniarm.semantics

import fr.centralesupelec.infonum.sl.miniarm.miniARM.ADD
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BEQ
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BLINK
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BLT
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BRANCH
import fr.centralesupelec.infonum.sl.miniarm.miniARM.CMP
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Const
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Direct
import fr.centralesupelec.infonum.sl.miniarm.miniARM.DirectReg
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Immediate
import fr.centralesupelec.infonum.sl.miniarm.miniARM.LOAD
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Label
import fr.centralesupelec.infonum.sl.miniarm.miniARM.MOVE
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Program
import fr.centralesupelec.infonum.sl.miniarm.miniARM.RMW
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Register
import fr.centralesupelec.infonum.sl.miniarm.miniARM.SMS
import fr.centralesupelec.infonum.sl.miniarm.miniARM.SMW
import fr.centralesupelec.infonum.sl.miniarm.miniARM.STORE
import fr.centralesupelec.infonum.sl.miniarm.miniARM.SUB
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Value
import java.util.Map
import fr.centralesupelec.infonum.sl.miniarm.miniARM.HexConst

class ListingGenerator {
	extension CodeGenerator cg = new CodeGenerator
	
	def generateListing(Program prog, Map<String, Integer> labelMap) {
		var pc = 0
		var buf = new StringBuilder

		for (line : prog.lines) {
			if (line.inst === null) {
				if (line.labelDef === null) {
					if (line.comment !== null) {
						buf.append(line.comment.trim)
					}
				} else {
					buf.append(String.format("%04X %-9s", pc, line.labelDef.label.name))
					if (line.comment !== null) {
						buf.append(' ')
						buf.append(line.comment.trim)
					}
				}
			} else {
				var int[] code = line.inst.genCode(labelMap)
				var lab = ""
				if (line.labelDef !== null) {
					lab = '@'+line.labelDef.label.name
				}
				buf.append(
					String.format("%04X %-10s %04X %-23s",
						            pc,  lab, code.get(0),   genMnemo(line.inst)
					)
				)
				if (line.comment !== null) {
					buf.append(' ')
					buf.append(line.comment.trim)
				}
				for (i : 1..<code.size) {
					buf.append(
						String.format("\n%4s %-10s %04X",
							              "",  "",  code.get(i)
						)
					)
				}
				pc += code.size
			}
			buf.append('\r')
		}
		return buf.toString
	}
	
	private def dispatch String genMnemo(RMW inst) {
		return String.format("%-4s %s", 'rmw', inst.size.display)
	}
	
	private def dispatch String genMnemo(SMW inst) {
		return String.format("%-4s %s", 'smw', inst.value.display)
	}
	
	private def dispatch String genMnemo(SMS inst) {
		return String.format('%-4s "%s"', 'smw', inst.value)
	}
	
	private def dispatch String genMnemo(LOAD inst) {
		return String.format('%-4s %s, %s', 'ldr', inst.reg.name, inst.address.display)
	}
	
	private def dispatch String genMnemo(STORE inst) {
		return String.format('%-4s %s, %s', 'str', inst.reg.name, inst.address.display)
	}
	
	private def dispatch String genMnemo(MOVE inst) {
		return String.format('%-4s %s, %s', 'mov', inst.dst.name, inst.src.display)
	}
	
	private def dispatch String genMnemo(ADD inst) {
		return String.format('%-4s %s, %s, %s', 'add', inst.dst.name, inst.src1.name, inst.src2.display)
	}
	
	private def dispatch String genMnemo(SUB inst) {
		return String.format('%-4s %s, %s, %s', 'sub', inst.dst.name, inst.src1.name, inst.src2.display)
	}
	
	private def dispatch String genMnemo(CMP inst) {
		return String.format('%-4s %s, %s', 'cmp', inst.src1.name, inst.src2.display)
	}
	
	private def dispatch String genMnemo(BEQ inst) {
		return String.format('%-4s %s', 'beq', inst.dest.display)
	}
	
	private def dispatch String genMnemo(BLT inst) {
		return String.format('%-4s %s', 'blt', inst.dest.display)
	}
	
	private def dispatch String genMnemo(BRANCH inst) {
		return String.format('%-4s %s', 'b', inst.dest.display)
	}
	
	private def dispatch String genMnemo(BLINK inst) {
		return String.format('%-4s %s, %s', 'bl', inst.reg.name, inst.dest.display)
	}

	// Display things in the listing
	private def dispatch String display(Direct addr) {
		return addr.address.display
	}

	private def dispatch String display(DirectReg addr) {
		return '[' + addr.reg.display + ']'
		
	}
	
	private def dispatch String display(Value value) {
		return value.label.display
	}
	
	private def dispatch String display(Const value) {
		return value.num.toString
	}
	
	private def dispatch String display(HexConst value) {
		return String.format("0x%X", value.num)
	}
	
	private def dispatch String display(Label value) {
		return value.name
	}
	
	private def dispatch String display(Immediate value) {
		return '#' + value.value.display
	}

	private def dispatch String display(Register value) {
		return value.name
	}
}