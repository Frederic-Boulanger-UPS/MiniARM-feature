/*
 * generated by Xtext 2.27.0
 */
package fr.centralesupelec.infonum.sl.miniarm.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.centralesupelec.infonum.sl.miniarm.semantics.MacroExpander
import fr.centralesupelec.infonum.sl.miniarm.semantics.LabelResolver
import fr.centralesupelec.infonum.sl.miniarm.semantics.CodeGenerator
import fr.centralesupelec.infonum.sl.miniarm.semantics.ListingGenerator
import fr.centralesupelec.infonum.sl.miniarm.miniARM.Program

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MiniARMGenerator extends AbstractGenerator {
	extension MacroExpander me = new MacroExpander
	extension LabelResolver lr = new LabelResolver
	extension CodeGenerator cg = new CodeGenerator
	extension ListingGenerator lg = new ListingGenerator

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (resource.contents.size > 0) {  // If the program is not empty
			var prog = resource.contents.get(0) as Program
			// First, expand macros (pseudo instructions)
			prog.expandMacros(resource, fsa)
			// Resolve labels
			var labelMap = prog.resolveLabels
	
			var baseName = resource.URI.trimFileExtension.lastSegment
			var lstFileName = baseName + '.lst'
			var memFileName = baseName + '.mem'		
	
			// Generate the listing file (addresses + code + source assembly)
			fsa.generateFile(lstFileName, prog.generateListing(labelMap))
			
			// Generate the code in a suitable format for loading into LogiSim's memory component
			fsa.generateFile(memFileName, prog.generateCode(labelMap))
		}
	}
}
