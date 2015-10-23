package net.hedtech.general.common.libraries.Goqolib.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class FormHeader extends SimpleBusinessObject
{
	public FormHeader() {
		super();
	}

	public FormHeader(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getObjectType() {
		return toStr(super.getValue("OBJECT_TYPE"));
	}
	
	public void setObjectType(NString value) {
		super.setValue("OBJECT_TYPE", value);
	}
	


	public NString getInitialQuery() {
		return toStr(super.getValue("INITIAL_QUERY"));
	}
	
	public void setInitialQuery(NString value) {
		super.setValue("INITIAL_QUERY", value);
	}
	



}




