package net.hedtech.banner.student.common.Soisbgi.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class ButtonControlBlock extends SimpleBusinessObject
{
	public ButtonControlBlock() {
		super();
	}

	public ButtonControlBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getCheckKeys() {
		return toStr(super.getValue("CHECK_KEYS"));
	}
	
	public void setCheckKeys(NString value) {
		super.setValue("CHECK_KEYS", value);
	}
	


	public NString getStvsbgiCmMsg() {
		return toStr(super.getValue("STVSBGI_CM_MSG"));
	}
	
	public void setStvsbgiCmMsg(NString value) {
		super.setValue("STVSBGI_CM_MSG", value);
	}
	


	public NString getModeInd() {
		return toStr(super.getValue("MODE_IND"));
	}
	
	public void setModeInd(NString value) {
		super.setValue("MODE_IND", value);
	}
	



}




