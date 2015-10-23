package net.hedtech.banner.finance.common.Fraprop.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class NavigateTo extends SimpleBusinessObject
{
	public NavigateTo() {
		super();
	}

	public NavigateTo(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getNavigateToList() {
		return toStr(super.getValue("NAVIGATE_TO_LIST"));
	}
	
	public void setNavigateToList(NString value) {
		super.setValue("NAVIGATE_TO_LIST", value);
	}
	


	public NString getDummyList() {
		return toStr(super.getValue("DUMMY_LIST"));
	}
	
	public void setDummyList(NString value) {
		super.setValue("DUMMY_LIST", value);
	}
	



}




