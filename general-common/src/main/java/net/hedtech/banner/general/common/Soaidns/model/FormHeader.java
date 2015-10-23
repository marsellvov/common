package net.hedtech.banner.general.common.Soaidns.model;

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
	

	



	public NString getWorkfld() {
		return toStr(super.getValue("WORKFLD"));
	}
	
	public void setWorkfld(NString value) {
		super.setValue("WORKFLD", value);
	}
	


	public NString getCallfld() {
		return toStr(super.getValue("CALLFLD"));
	}
	
	public void setCallfld(NString value) {
		super.setValue("CALLFLD", value);
	}
	


	public NString getWorkdate() {
		return toStr(super.getValue("WORKDATE"));
	}
	
	public void setWorkdate(NString value) {
		super.setValue("WORKDATE", value);
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
	


	public NString getLastName() {
		return toStr(super.getValue("LAST_NAME"));
	}
	
	public void setLastName(NString value) {
		super.setValue("LAST_NAME", value);
	}
	


	public NString getFirstName() {
		return toStr(super.getValue("FIRST_NAME"));
	}
	
	public void setFirstName(NString value) {
		super.setValue("FIRST_NAME", value);
	}
	


	public NString getDataSeparatorLine0() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_0"));
	}
	
	public void setDataSeparatorLine0(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_0", value);
	}
	


	public NString getDataSeparatorLine1() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_1"));
	}
	
	public void setDataSeparatorLine1(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_1", value);
	}
	


	public NString getDataSeparatorLine2() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_2"));
	}
	
	public void setDataSeparatorLine2(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_2", value);
	}
	


	public NString getDataSeparatorLine3() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_3"));
	}
	
	public void setDataSeparatorLine3(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_3", value);
	}
	


	public NString getDataSeparatorLine4() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_4"));
	}
	
	public void setDataSeparatorLine4(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_4", value);
	}
	



}




