package net.hedtech.banner.general.common.Guauipw.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class CurrentValues extends SimpleBusinessObject
{
	public CurrentValues() {
		super();
	}

	public CurrentValues(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getCurrAltUserId() {
		return toStr(super.getValue("CURR_ALT_USER_ID"));
	}
	
	public void setCurrAltUserId(NString value) {
		super.setValue("CURR_ALT_USER_ID", value);
	}
	


	public NString getCurrAltPassword() {
		return toStr(super.getValue("CURR_ALT_PASSWORD"));
	}
	
	public void setCurrAltPassword(NString value) {
		super.setValue("CURR_ALT_PASSWORD", value);
	}
	


	public NString getCurrentValuesMsg() {
		return toStr(super.getValue("CURRENT_VALUES_MSG"));
	}
	
	public void setCurrentValuesMsg(NString value) {
		super.setValue("CURRENT_VALUES_MSG", value);
	}
	



}




