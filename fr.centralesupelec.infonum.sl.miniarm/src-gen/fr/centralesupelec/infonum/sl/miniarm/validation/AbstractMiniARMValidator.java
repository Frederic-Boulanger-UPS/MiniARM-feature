/*
 * generated by Xtext 2.27.0
 */
package fr.centralesupelec.infonum.sl.miniarm.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMiniARMValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(fr.centralesupelec.infonum.sl.miniarm.miniARM.MiniARMPackage.eINSTANCE);
		return result;
	}
}