package net.hedtech.banner.finance.common.Foaiden.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class Soaappt extends SimpleBusinessObject
{
	public Soaappt() {
		super();
	}

	public Soaappt(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getSoaapptDummy() {
		return toStr(super.getValue("SOAAPPT_DUMMY"));
	}
	
	public void setSoaapptDummy(NString value) {
		super.setValue("SOAAPPT_DUMMY", value);
	}
	



}




