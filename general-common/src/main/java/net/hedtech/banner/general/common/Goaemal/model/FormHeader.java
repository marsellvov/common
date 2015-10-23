package net.hedtech.banner.general.common.Goaemal.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
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
	

	



	public NString getCurrentForm() {
		return toStr(super.getValue("CURRENT_FORM"));
	}
	
	public void setCurrentForm(NString value) {
		super.setValue("CURRENT_FORM", value);
	}
	


	public NString getCurrentRelease() {
		return toStr(super.getValue("CURRENT_RELEASE"));
	}
	
	public void setCurrentRelease(NString value) {
		super.setValue("CURRENT_RELEASE", value);
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
	


	public NString getDisplayMsg() {
		return toStr(super.getValue("DISPLAY_MSG"));
	}
	
	public void setDisplayMsg(NString value) {
		super.setValue("DISPLAY_MSG", value);
	}
	


	public NString getCurrentUser() {
		return toStr(super.getValue("CURRENT_USER"));
	}
	
	public void setCurrentUser(NString value) {
		super.setValue("CURRENT_USER", value);
	}
	


	public NString getEmailInd() {
		return toStr(super.getValue("EMAIL_IND"));
	}
	
	public void setEmailInd(NString value) {
		super.setValue("EMAIL_IND", value);
	}
	


	public NString getSpouseEmailInd() {
		return toStr(super.getValue("SPOUSE_EMAIL_IND"));
	}
	
	public void setSpouseEmailInd(NString value) {
		super.setValue("SPOUSE_EMAIL_IND", value);
	}
	


	public NString getCmtResult() {
		return toStr(super.getValue("CMT_RESULT"));
	}
	
	public void setCmtResult(NString value) {
		super.setValue("CMT_RESULT", value);
	}
	


	public NString getSpouseCmtResult() {
		return toStr(super.getValue("SPOUSE_CMT_RESULT"));
	}
	
	public void setSpouseCmtResult(NString value) {
		super.setValue("SPOUSE_CMT_RESULT", value);
	}
	



}




