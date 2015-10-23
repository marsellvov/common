package net.hedtech.banner.finance.common.Fraprop.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class KeyBlock extends SimpleBusinessObject
{
	public KeyBlock() {
		super();
	}

	public KeyBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getDisplayFrbpropCode() {
		return toStr(super.getValue("DISPLAY_FRBPROP_CODE"));
	}
	
	public void setDisplayFrbpropCode(NString value) {
		super.setValue("DISPLAY_FRBPROP_CODE", value);
	}
	


	public NString getDisplayTextInd() {
		return toStr(super.getValue("DISPLAY_TEXT_IND"));
	}
	
	public void setDisplayTextInd(NString value) {
		super.setValue("DISPLAY_TEXT_IND", value);
	}
	



}




