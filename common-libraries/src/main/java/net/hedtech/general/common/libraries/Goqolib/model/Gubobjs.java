package net.hedtech.general.common.libraries.Goqolib.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class Gubobjs extends SimpleBusinessObject
{
	public Gubobjs() {
		super();
	}

	public Gubobjs(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getGubobjsName() {
		return toStr(super.getValue("GUBOBJS_NAME"));
	}
	
	public void setGubobjsName(NString value) {
		super.setValue("GUBOBJS_NAME", value);
	}
	



}




