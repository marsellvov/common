package net.hedtech.general.common.libraries.Goqolib.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class LibFormHeader extends SimpleBusinessObject
{
	public LibFormHeader() {
		super();
	}

	public LibFormHeader(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getCurrentForm() {
		return toStr(super.getValue("CURRENT_FORM"));
	}
	
	public void setCurrentForm(NString value) {
		super.setValue("CURRENT_FORM", value);
	}
	


	public NString getCheckKeys() {
		return toStr(super.getValue("CHECK_KEYS"));
	}
	
	public void setCheckKeys(NString value) {
		super.setValue("CHECK_KEYS", value);
	}
	


	public NString getInstName() {
		return toStr(super.getValue("INST_NAME"));
	}
	
	public void setInstName(NString value) {
		super.setValue("INST_NAME", value);
	}
	


	public NString getCurrentInstitution() {
		return toStr(super.getValue("CURRENT_INSTITUTION"));
	}
	
	public void setCurrentInstitution(NString value) {
		super.setValue("CURRENT_INSTITUTION", value);
	}
	


	public NString getCurrentDate() {
		return toStr(super.getValue("CURRENT_DATE"));
	}
	
	public void setCurrentDate(NString value) {
		super.setValue("CURRENT_DATE", value);
	}
	


	public NString getCurrentTime() {
		return toStr(super.getValue("CURRENT_TIME"));
	}
	
	public void setCurrentTime(NString value) {
		super.setValue("CURRENT_TIME", value);
	}
	


	public NString getWorkdate() {
		return toStr(super.getValue("WORKDATE"));
	}
	
	public void setWorkdate(NString value) {
		super.setValue("WORKDATE", value);
	}
	


	public NString getWorkuser() {
		return toStr(super.getValue("WORKUSER"));
	}
	
	public void setWorkuser(NString value) {
		super.setValue("WORKUSER", value);
	}
	


	public NString getCallfld() {
		return toStr(super.getValue("CALLFLD"));
	}
	
	public void setCallfld(NString value) {
		super.setValue("CALLFLD", value);
	}
	


	public NString getCurrentUser() {
		return toStr(super.getValue("CURRENT_USER"));
	}
	
	public void setCurrentUser(NString value) {
		super.setValue("CURRENT_USER", value);
	}
	


	public NString getCurrentRelease() {
		return toStr(super.getValue("CURRENT_RELEASE"));
	}
	
	public void setCurrentRelease(NString value) {
		super.setValue("CURRENT_RELEASE", value);
	}
	



}




