package net.hedtech.banner.finance.common.Foqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class FFormatNumbers extends SimpleBusinessObject
{
	public FFormatNumbers() {
		super();
	}

	public FFormatNumbers(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getFSignificantCommas() {
		return toStr(super.getValue("F$_SIGNIFICANT_COMMAS"));
	}
	
	public void setFSignificantCommas(NString value) {
		super.setValue("F$_SIGNIFICANT_COMMAS", value);
	}
	


	public NString getFDecimalDigits() {
		return toStr(super.getValue("F$_DECIMAL_DIGITS"));
	}
	
	public void setFDecimalDigits(NString value) {
		super.setValue("F$_DECIMAL_DIGITS", value);
	}
	


	public NString getFReturnBlockName() {
		return toStr(super.getValue("F$_RETURN_BLOCK_NAME"));
	}
	
	public void setFReturnBlockName(NString value) {
		super.setValue("F$_RETURN_BLOCK_NAME", value);
	}
	



}




