package net.hedtech.banner.general.common.Guagmnu.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class MyLinks extends SimpleBusinessObject
{
	public MyLinks() {
		super();
	}

	public MyLinks(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getNewMessageImage() {
		return toStr(super.getValue("NEW_MESSAGE_IMAGE"));
	}
	
	public void setNewMessageImage(NString value) {
		super.setValue("NEW_MESSAGE_IMAGE", value);
	}
	


	public NString getMyInstImage() {
		return toStr(super.getValue("MY_INST_IMAGE"));
	}
	
	public void setMyInstImage(NString value) {
		super.setValue("MY_INST_IMAGE", value);
	}
	



}




