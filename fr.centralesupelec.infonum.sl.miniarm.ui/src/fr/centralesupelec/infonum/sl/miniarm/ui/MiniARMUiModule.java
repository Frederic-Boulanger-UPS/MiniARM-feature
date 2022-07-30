/*
 * generated by Xtext 2.27.0
 */
package fr.centralesupelec.infonum.sl.miniarm.ui;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.FoldedPosition;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;

class MyFoldingRegionProvider extends DefaultFoldingRegionProvider {
	@Override
  protected Collection<FoldedPosition> doGetFoldingRegions(IXtextDocument xtextDocument, XtextResource xtextResource) {
  return Collections.emptyList();
  }
}

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class MiniARMUiModule extends AbstractMiniARMUiModule {

	public MiniARMUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IFoldingRegionProvider> bindIFoldingRegionProvider() {
		return MyFoldingRegionProvider.class;
	}
}
