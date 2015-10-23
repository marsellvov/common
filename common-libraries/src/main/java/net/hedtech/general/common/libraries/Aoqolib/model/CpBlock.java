package net.hedtech.general.common.libraries.Aoqolib.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class CpBlock extends SimpleBusinessObject
{
	public CpBlock() {
		super();
	}

	public CpBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getCpCallMode() {
		return toStr(super.getValue("CP$_CALL_MODE"));
	}
	
	public void setCpCallMode(NString value) {
		super.setValue("CP$_CALL_MODE", value);
	}
	


	public NString getCpExitMode() {
		return toStr(super.getValue("CP$_EXIT_MODE"));
	}
	
	public void setCpExitMode(NString value) {
		super.setValue("CP$_EXIT_MODE", value);
	}
	


	public NString getCpFormName() {
		return toStr(super.getValue("CP$_FORM_NAME"));
	}
	
	public void setCpFormName(NString value) {
		super.setValue("CP$_FORM_NAME", value);
	}
	


	public NString getCpPostDone() {
		return toStr(super.getValue("CP$_POST_DONE"));
	}
	
	public void setCpPostDone(NString value) {
		super.setValue("CP$_POST_DONE", value);
	}
	



}




