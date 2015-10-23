package net.hedtech.banner.general.common.Guqwutl.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class Guqwutl extends SimpleBusinessObject
{
	public Guqwutl() {
		super();
	}

	public Guqwutl(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getItem1() {
		return toStr(super.getValue("ITEM1"));
	}
	
	public void setItem1(NString value) {
		super.setValue("ITEM1", value);
	}
	


	public NString getItem2() {
		return toStr(super.getValue("ITEM2"));
	}
	
	public void setItem2(NString value) {
		super.setValue("ITEM2", value);
	}
	


	public NString getItem3() {
		return toStr(super.getValue("ITEM3"));
	}
	
	public void setItem3(NString value) {
		super.setValue("ITEM3", value);
	}
	



}




