package net.hedtech.banner.finance.common.Foqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class LastQuery extends SimpleBusinessObject
{
	public LastQuery() {
		super();
	}

	public LastQuery(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getLastQuery() {
		return toStr(super.getValue("LAST_QUERY"));
	}
	
	public void setLastQuery(NString value) {
		super.setValue("LAST_QUERY", value);
	}
	



}




