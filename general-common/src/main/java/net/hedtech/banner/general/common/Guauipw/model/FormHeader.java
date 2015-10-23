package net.hedtech.banner.general.common.Guauipw.model;

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
	


	public NString getUipwValidated() {
		return toStr(super.getValue("UIPW_VALIDATED"));
	}
	
	public void setUipwValidated(NString value) {
		super.setValue("UIPW_VALIDATED", value);
	}
	


	public NString getHoldAltUserId() {
		return toStr(super.getValue("HOLD_ALT_USER_ID"));
	}
	
	public void setHoldAltUserId(NString value) {
		super.setValue("HOLD_ALT_USER_ID", value);
	}
	


	public NString getHoldAltPassword() {
		return toStr(super.getValue("HOLD_ALT_PASSWORD"));
	}
	
	public void setHoldAltPassword(NString value) {
		super.setValue("HOLD_ALT_PASSWORD", value);
	}
	


	public NNumber getOneUpNo() {
		return toNumber(super.getValue("ONE_UP_NO"));
	}
	
	public void setOneUpNo(NNumber value) {
		super.setValue("ONE_UP_NO", value);
	}
	



}




