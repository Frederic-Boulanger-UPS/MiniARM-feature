/**
 * generated by Xtext 2.27.0
 */
package fr.centralesupelec.infonum.sl.miniarm.generator;

import fr.centralesupelec.infonum.sl.miniarm.miniARM.Program;
import fr.centralesupelec.infonum.sl.miniarm.semantics.CodeGenerator;
import fr.centralesupelec.infonum.sl.miniarm.semantics.LabelResolver;
import fr.centralesupelec.infonum.sl.miniarm.semantics.ListingGenerator;
import fr.centralesupelec.infonum.sl.miniarm.semantics.MacroExpander;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MiniARMGenerator extends AbstractGenerator {
  @Extension
  private MacroExpander me = new MacroExpander();

  @Extension
  private LabelResolver lr = new LabelResolver();

  @Extension
  private CodeGenerator cg = new CodeGenerator();

  @Extension
  private ListingGenerator lg = new ListingGenerator();

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    int _size = resource.getContents().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      EObject _get = resource.getContents().get(0);
      Program prog = ((Program) _get);
      this.me.expandMacros(prog, resource, fsa);
      Map<String, Integer> labelMap = this.lr.resolveLabels(prog);
      String baseName = resource.getURI().trimFileExtension().lastSegment();
      String lstFileName = (baseName + ".lst");
      String memFileName = (baseName + ".mem");
      fsa.generateFile(lstFileName, this.lg.generateListing(prog, labelMap));
      fsa.generateFile(memFileName, this.cg.generateCode(prog, labelMap));
    }
  }
}
