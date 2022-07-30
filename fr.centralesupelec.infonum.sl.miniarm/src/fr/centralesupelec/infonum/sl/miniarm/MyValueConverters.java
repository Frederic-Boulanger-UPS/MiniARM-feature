package fr.centralesupelec.infonum.sl.miniarm;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractToStringConverter;
import org.eclipse.xtext.nodemodel.INode;

public class MyValueConverters extends DefaultTerminalConverters {
	@ValueConverter(rule = "HEXINT")
	public IValueConverter<Integer> HEXINT() {
		return new AbstractToStringConverter<Integer>() {
			@Override
			protected Integer internalToValue(String string, INode node) throws ValueConverterException {
				return Integer.decode(string);
			}
		};
	}
}
