package net.hedtech.banner.general.common.Guahelp.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class DisplayHelp extends SimpleBusinessObject
{
	public DisplayHelp() {
		super();
	}

	public DisplayHelp(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getHelpForm() {
		return toStr(super.getValue("HELP_FORM"));
	}
	
	public void setHelpForm(NString value) {
		super.setValue("HELP_FORM", value);
	}
	


	public NString getHelpBlock() {
		return toStr(super.getValue("HELP_BLOCK"));
	}
	
	public void setHelpBlock(NString value) {
		super.setValue("HELP_BLOCK", value);
	}
	


	public NString getHelpField() {
		return toStr(super.getValue("HELP_FIELD"));
	}
	
	public void setHelpField(NString value) {
		super.setValue("HELP_FIELD", value);
	}
	


	public NString getHelpType() {
		return toStr(super.getValue("HELP_TYPE"));
	}
	
	public void setHelpType(NString value) {
		super.setValue("HELP_TYPE", value);
	}
	


	public NString getHelpSel() {
		return toStr(super.getValue("HELP_SEL"));
	}
	
	public void setHelpSel(NString value) {
		super.setValue("HELP_SEL", value);
	}
	


	public NString getCurrentRelease() {
		return toStr(super.getValue("CURRENT_RELEASE"));
	}
	
	public void setCurrentRelease(NString value) {
		super.setValue("CURRENT_RELEASE", value);
	}
	



}




