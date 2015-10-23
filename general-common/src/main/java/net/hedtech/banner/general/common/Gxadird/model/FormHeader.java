package net.hedtech.banner.general.common.Gxadird.model;

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
	

	



	public NString getHoldSecurity() {
		return toStr(super.getValue("HOLD_SECURITY"));
	}
	
	public void setHoldSecurity(NString value) {
		super.setValue("HOLD_SECURITY", value);
	}
	


	public NString getWorkuser() {
		return toStr(super.getValue("WORKUSER"));
	}
	
	public void setWorkuser(NString value) {
		super.setValue("WORKUSER", value);
	}
	


	public NString getCurrentUser() {
		return toStr(super.getValue("CURRENT_USER"));
	}
	
	public void setCurrentUser(NString value) {
		super.setValue("CURRENT_USER", value);
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
	


	public NString getStatusInd() {
		return toStr(super.getValue("STATUS_IND"));
	}
	
	public void setStatusInd(NString value) {
		super.setValue("STATUS_IND", value);
	}
	


	public NDate getWorkfld() {
		return toDate(super.getValue("WORKFLD"));
	}
	
	public void setWorkfld(NDate value) {
		super.setValue("WORKFLD", value);
	}
	


	public NString getHOrgnDe() {
		return toStr(super.getValue("H_ORGN_DE"));
	}
	
	public void setHOrgnDe(NString value) {
		super.setValue("H_ORGN_DE", value);
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
	


	public NString getConvertedDate() {
		return toStr(super.getValue("CONVERTED_DATE"));
	}
	
	public void setConvertedDate(NString value) {
		super.setValue("CONVERTED_DATE", value);
	}
	


	public NString getDateToConvert() {
		return toStr(super.getValue("DATE_TO_CONVERT"));
	}
	
	public void setDateToConvert(NString value) {
		super.setValue("DATE_TO_CONVERT", value);
	}
	


	public NNumber getYear() {
		return toNumber(super.getValue("YEAR"));
	}
	
	public void setYear(NNumber value) {
		super.setValue("YEAR", value);
	}
	


	public NString getDataSeparatorLine0() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_0"));
	}
	
	public void setDataSeparatorLine0(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_0", value);
	}
	



}




