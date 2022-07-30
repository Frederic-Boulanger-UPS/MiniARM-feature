package fr.centralesupelec.infonum.sl.miniarm.semantics

import fr.centralesupelec.infonum.sl.miniarm.miniARM.Program
import java.util.Map
import fr.centralesupelec.infonum.sl.miniarm.miniARM.RMW
import fr.centralesupelec.infonum.sl.miniarm.miniARM.SMW
import fr.centralesupelec.infonum.sl.miniarm.miniARM.SMS
import fr.centralesupelec.infonum.sl.miniarm.miniARM.LOAD
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Direct
import fr.centralesupelec.infonum.sl.miniarm.miniARM.STORE
import fr.centralesupelec.infonum.sl.miniarm.miniARM.MOVE
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Immediate
import fr.centralesupelec.infonum.sl.miniarm.miniARM.ADD
import fr.centralesupelec.infonum.sl.miniarm.miniARM.SUB
import fr.centralesupelec.infonum.sl.miniarm.miniARM.CMP
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BEQ
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Value
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BLT
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BRANCH
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BLINK
import java.util.List
import java.util.ArrayList
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Register
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Const
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Label
import fr.centralesupelec.infonum.sl.miniarm.miniARM.DirectReg
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Instruction
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Address
import fr.centralesupelec.infonum.sl.miniarm.miniARM.MoveValue
import fr.centralesupelec.infonum.sl.miniarm.miniARM.BranchAddress
import fr.centralesupelec.infonum.sl.miniarm.miniARM.HexConst

class CodeGenerator {
	static val int LOADcode  = 0x0000
	static val int STOREcode = 0x0001
	static val int MOVEcode  = 0x0002
	static val int ADDcode   = 0x0003
	static val int SUBcode   = 0x0004
	static val int CMPcode   = 0x0005
	static val int BEQcode   = 0x0006
	static val int BLTcode   = 0x0007
	static val int BRAcode   = 0x0008
	static val int BLcode    = 0x0009
	
	static val int IMM = 0x0800 // 0b0000100000000000
	static val int CodeOffset = 12
	static val int RxOffset = 8
	static val int RyOffset = 5
	static val int RzOffset = 2
	
	
	def generateCode(Program prog, Map<String, Integer> labelMap) {
		var buf = new StringBuilder
		var words = 0

		// This line identifies the format of the memory file
		buf.append("v2.0 raw\n")
		for (line : prog.lines) {
			// Generate the code for each line of the program
			if (line.inst !== null) {
				var code = line.inst.genCode(labelMap)
				for (wrd : code) {
					// Write each word (16 bits) of code in hexadecimal
					var ws = String.format("%04X", wrd)
					buf.append(ws)
					words += 1
					// Separate words with a space, make a new line every 8 words
					if (words % 8 == 0) {
						buf.append('\n')
					} else {
						buf.append(' ')
					}
				}
			}
		}
		return buf.toString
	}
	
	def size(Instruction inst) {
		// Generate the code for the instruction (ignoring the effective value of labels)
		// and return its size
		return inst.genCode(null).size
	}

	// 'rmw n' reserves n words of memory, initialized to 0
	def dispatch List<Integer> genCode(RMW inst, Map<String, Integer> labelMap) {
		var code = new ArrayList
		for (i : 0..<inst.size.num) {
			code.add(0)
		}
		return code;
	}

	// 'smw v' sets a word of memory to value v
	def dispatch List<Integer> genCode(SMW inst, Map<String, Integer> labelMap) {
		return #[inst.value.num]
	}

	// 'smw "<string>"' sets consecutive words of memory to the UTF-8 encoding of <string>
	// The UTF-8 bytes are put in big-endian order in the 16-bit words
	// A null byte is put at after the contents of the string, and the data is aligned to
	// a word boundary by making it an even number of bytes.
	def dispatch List<Integer> genCode(SMS inst, Map<String, Integer> labelMap) {
		var code = new ArrayList
		var byte[] encodestr = inst.value.getBytes("utf-8")
		var firstbyte = true
		var cde = 0
		for (i : 0..< inst.value.length) {
			if (firstbyte) {
				// First byte of the word is put in the high end of the word
				cde = (encodestr.get(i) << 8)
				firstbyte = false
			} else {
				// Second byte of the word is put in the low end of the word
				cde = cde.bitwiseOr(encodestr.get(i))
				code.add(cde)
				// The word is set to 0
				cde = 0
				firstbyte = true
			}
		}
		// If there was an even number of bytes in the string, firstbyte is true,
		// we have written all the string data, cde = 0 and we need a 0 to terminate the string.
		// If there was an odd number of bytes in the string, firstbyte is false, and cde contains
		// the code of the last character in its high end, and 0 in its low end, which terminates
		// the string. So in both cases, we just have to add cde to the generated code.
		code.add(cde)
		return code;
	}

	def List<Integer> gen_LOAD_STORE_address(int instcode, Address addr, Map<String, Integer> labelMap) {
		var code = new ArrayList
		var cde = instcode
		if (addr instanceof Direct) {
			cde = cde.bitwiseOr(IMM)
			code.add(cde)
			code.add((addr as Direct).address.value(labelMap))
		} else {
			cde = cde.bitwiseOr((addr as DirectReg).reg.number << RyOffset)
			code.add(cde)
		}
		return code
	}
	
	def dispatch List<Integer> genCode(LOAD inst, Map<String, Integer> labelMap) {
		return gen_LOAD_STORE_address(
			(LOADcode << CodeOffset).bitwiseOr(inst.reg.number << RxOffset),
			inst.address,
			labelMap
		)
	}

	def dispatch List<Integer> genCode(STORE inst, Map<String, Integer> labelMap) {
		return gen_LOAD_STORE_address(
			(STOREcode << CodeOffset).bitwiseOr(inst.reg.number << RzOffset),
			inst.address,
			labelMap
		)
	}

	def dispatch List<Integer> genCode(MOVE inst, Map<String, Integer> labelMap) {
		var code = new ArrayList
		var cde = (MOVEcode << CodeOffset).bitwiseOr(inst.dst.number << RxOffset)
		if (inst.src instanceof Immediate) {
			cde = cde.bitwiseOr(IMM)
			code.add(cde)
			code.add((inst.src as Immediate).value.value(labelMap))
		} else {
			cde = cde.bitwiseOr((inst.src as Register).number << RyOffset)
			code.add(cde)
		}
		return code
	}
	
	def List<Integer> genCode_ADD_SUB(int instCode, Register dst, Register src1, MoveValue src2, Map<String, Integer> labelMap) {
		var code = new ArrayList
		var cde = (instCode << CodeOffset).bitwiseOr(dst.number << RxOffset).bitwiseOr(src1.number << RyOffset)
		if (src2 instanceof Immediate) {
			cde = cde.bitwiseOr(IMM)
			code.add(cde)
			code.add((src2 as Immediate).value.value(labelMap))
		} else {
			cde = cde.bitwiseOr((src2 as Register).number << RzOffset)
			code.add(cde)
		}
		return code
	}
	
	def dispatch List<Integer> genCode(ADD inst, Map<String, Integer> labelMap) {
		return genCode_ADD_SUB(ADDcode, inst.dst, inst.src1, inst.src2, labelMap)
	}
	
	def dispatch List<Integer> genCode(SUB inst, Map<String, Integer> labelMap) {
		return genCode_ADD_SUB(SUBcode, inst.dst, inst.src1, inst.src2, labelMap)
	}

	def dispatch List<Integer> genCode(CMP inst, Map<String, Integer> labelMap) {
		var code = new ArrayList
		var cde = (CMPcode << CodeOffset).bitwiseOr(inst.src1.number << RyOffset)
		if (inst.src2 instanceof Immediate) {
			cde = cde.bitwiseOr(IMM)
			code.add(cde)
			code.add((inst.src2 as Immediate).value.value(labelMap))
		} else {
			cde = cde.bitwiseOr((inst.src2 as Register).number << RzOffset)
			code.add(cde)
		}
		return code
	}

	def List<Integer> genCode_BR(int instCode, int rx, BranchAddress dest, Map<String, Integer> labelMap) {
		var code = new ArrayList
		// rx is used only for branch and link, it is set to 0 for other branching instructions
		var cde = (instCode << CodeOffset).bitwiseOr(rx << RxOffset)
		if (dest instanceof Value) {
			cde = cde.bitwiseOr(IMM)
			code.add(cde)
			code.add((dest as Value).value(labelMap))
		} else {
			cde = cde.bitwiseOr((dest as Register).number << RzOffset)
			code.add(cde)
		}
		return code
	}

	def dispatch List<Integer> genCode(BEQ inst, Map<String, Integer> labelMap) {
		return genCode_BR(BEQcode, 0, inst.dest, labelMap)
	}

	def dispatch List<Integer> genCode(BLT inst, Map<String, Integer> labelMap) {
		return genCode_BR(BLTcode, 0, inst.dest, labelMap)
	}

	def dispatch List<Integer> genCode(BRANCH inst, Map<String, Integer> labelMap) {
		return genCode_BR(BRAcode, 0, inst.dest, labelMap)
	}

	def dispatch List<Integer> genCode(BLINK inst, Map<String, Integer> labelMap) {
		return genCode_BR(BLcode, inst.reg.number, inst.dest, labelMap)
	}

	// Utilities
	def int number (Register r) {
		if (r.name == "r0") {
			return 0
		} else if (r.name == "r1") {
			return 1
		} else if (r.name == "r2") {
			return 2
		} else if (r.name == "r3") {
			return 3
		} else if (r.name == "r4") {
			return 4
		} else if (r.name == "r5") {
			return 5
		} else if (r.name == "r6" || r.name == "sp") {
			return 6
		} else if (r.name == "r7" || r.name == "lr") {
			return 7
		} else {
			return -1
		}
	}
	
	def dispatch int value(Const c, Map<String, Integer> labelMap) {
		return c.num
	}
	
	def dispatch int value(HexConst c, Map<String, Integer> labelMap) {
		return c.num
	}
	
	def dispatch int value(Value v, Map<String, Integer> labelMap) {
		return v.label.value(labelMap)
	}
	
	def dispatch int value(Label l, Map<String, Integer> labelMap) {
		if (labelMap === null) {
			return 0
		}
		return labelMap.get(l.name)
	}
}
