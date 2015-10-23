package net.hedtech.banner.finance.common.Foqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class ConsumpBlock extends SimpleBusinessObject
{
	public ConsumpBlock() {
		super();
	}

	public ConsumpBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getItem451() {
		return toStr(super.getValue("ITEM451"));
	}
	
	public void setItem451(NString value) {
		super.setValue("ITEM451", value);
	}
	



}




