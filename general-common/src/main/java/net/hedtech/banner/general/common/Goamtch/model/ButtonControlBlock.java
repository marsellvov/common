package net.hedtech.banner.general.common.Goamtch.model;

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
	

	



	public NString getSortIdBtn() {
		return toStr(super.getValue("SORT_ID_BTN"));
	}
	
	public void setSortIdBtn(NString value) {
		super.setValue("SORT_ID_BTN", value);
	}
	


	public NString getSortNameBtn() {
		return toStr(super.getValue("SORT_NAME_BTN"));
	}
	
	public void setSortNameBtn(NString value) {
		super.setValue("SORT_NAME_BTN", value);
	}
	



}




