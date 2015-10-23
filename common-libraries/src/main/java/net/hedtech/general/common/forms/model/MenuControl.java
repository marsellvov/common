package net.hedtech.general.common.forms.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;

public class MenuControl extends SimpleBusinessObject {

	public MenuControl(){
	}
	
	public MenuControl(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}

	public String getStatus() {
		return "";
	}

	public void setInit(String init) {
	}
}
