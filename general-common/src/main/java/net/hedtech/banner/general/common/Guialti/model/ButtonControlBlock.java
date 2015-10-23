package net.hedtech.banner.general.common.Guialti.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
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
	

	



	public NString getCaseInsensitiveRg() {
		return toStr(super.getValue("CASE_INSENSITIVE_RG"));
	}
	
	public void setCaseInsensitiveRg(NString value) {
		super.setValue("CASE_INSENSITIVE_RG", value);
	}
	


	public NString getCheckKeys() {
		return toStr(super.getValue("CHECK_KEYS"));
	}
	
	public void setCheckKeys(NString value) {
		super.setValue("CHECK_KEYS", value);
	}
	



}




