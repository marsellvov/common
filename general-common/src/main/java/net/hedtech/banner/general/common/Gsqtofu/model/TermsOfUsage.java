package net.hedtech.banner.general.common.Gsqtofu.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class TermsOfUsage extends SimpleBusinessObject
{
	public TermsOfUsage() {
		super();
	}

	public TermsOfUsage(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getGubiprfTofuText() {
		return toStr(super.getValue("GUBIPRF_TOFU_TEXT"));
	}
	
	public void setGubiprfTofuText(NString value) {
		super.setValue("GUBIPRF_TOFU_TEXT", value);
	}
	



}




