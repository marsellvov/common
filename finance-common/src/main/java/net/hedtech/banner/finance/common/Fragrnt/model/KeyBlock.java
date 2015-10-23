package net.hedtech.banner.finance.common.Fragrnt.model;

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
	

	



	public NString getDisplayFrbgrntCode() {
		return toStr(super.getValue("DISPLAY_FRBGRNT_CODE"));
	}
	
	public void setDisplayFrbgrntCode(NString value) {
		super.setValue("DISPLAY_FRBGRNT_CODE", value);
	}
	


	public NString getDisplayPropCode() {
		return toStr(super.getValue("DISPLAY_PROP_CODE"));
	}
	
	public void setDisplayPropCode(NString value) {
		super.setValue("DISPLAY_PROP_CODE", value);
	}
	


	public NString getDisplayTextInd() {
		return toStr(super.getValue("DISPLAY_TEXT_IND"));
	}
	
	public void setDisplayTextInd(NString value) {
		super.setValue("DISPLAY_TEXT_IND", value);
	}
	



}




