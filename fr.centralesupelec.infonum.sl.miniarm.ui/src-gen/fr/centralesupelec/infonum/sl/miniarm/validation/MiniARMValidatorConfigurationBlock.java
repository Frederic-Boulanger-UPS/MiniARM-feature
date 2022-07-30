/*
 * generated by Xtext 2.27.0
 */
package fr.centralesupelec.infonum.sl.miniarm.validation;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.ui.validation.AbstractValidatorConfigurationBlock;

@SuppressWarnings("restriction")
public class MiniARMValidatorConfigurationBlock extends AbstractValidatorConfigurationBlock {

	protected static final String SETTINGS_SECTION_NAME = "MiniARM";

	@Override
	protected void fillSettingsPage(Composite composite, int nColumns, int defaultIndent) {
		addComboBox(MiniARMConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART, "Deprecated Model Part", composite, defaultIndent);
	}

	@Override
	public void dispose() {
		storeSectionExpansionStates(getDialogSettings());
		super.dispose();
	}

	@Override
	protected IDialogSettings getDialogSettings() {
		IDialogSettings dialogSettings = super.getDialogSettings();
		IDialogSettings section = dialogSettings.getSection(SETTINGS_SECTION_NAME);
		if (section == null) {
			return dialogSettings.addNewSection(SETTINGS_SECTION_NAME);
		}
		return section;
	}
}