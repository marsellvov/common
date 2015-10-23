package net.hedtech.banner.finance.common.Foaiden.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class Guasyst extends SimpleBusinessObject
{
	public Guasyst() {
		super();
	}

	public Guasyst(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getGuasystDummy() {
		return toStr(super.getValue("GUASYST_DUMMY"));
	}
	
	public void setGuasystDummy(NString value) {
		super.setValue("GUASYST_DUMMY", value);
	}
	



}




