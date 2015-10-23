package net.hedtech.banner.finance.common.Frigrnt.model;

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
	

	



	public NString getQueryPiFirstName() {
		return toStr(super.getValue("QUERY_PI_FIRST_NAME"));
	}
	
	public void setQueryPiFirstName(NString value) {
		super.setValue("QUERY_PI_FIRST_NAME", value);
	}
	


	public NString getQueryAgencyId() {
		return toStr(super.getValue("QUERY_AGENCY_ID"));
	}
	
	public void setQueryAgencyId(NString value) {
		super.setValue("QUERY_AGENCY_ID", value);
	}
	


	public NString getQueryAgencyName() {
		return toStr(super.getValue("QUERY_AGENCY_NAME"));
	}
	
	public void setQueryAgencyName(NString value) {
		super.setValue("QUERY_AGENCY_NAME", value);
	}
	


	public NString getQueryOrgnDesc() {
		return toStr(super.getValue("QUERY_ORGN_DESC"));
	}
	
	public void setQueryOrgnDesc(NString value) {
		super.setValue("QUERY_ORGN_DESC", value);
	}
	


	public NString getQueryPiLastName() {
		return toStr(super.getValue("QUERY_PI_LAST_NAME"));
	}
	
	public void setQueryPiLastName(NString value) {
		super.setValue("QUERY_PI_LAST_NAME", value);
	}
	


	public NString getQueryPiId() {
		return toStr(super.getValue("QUERY_PI_ID"));
	}
	
	public void setQueryPiId(NString value) {
		super.setValue("QUERY_PI_ID", value);
	}
	


	public NString getQueryStatusDesc() {
		return toStr(super.getValue("QUERY_STATUS_DESC"));
	}
	
	public void setQueryStatusDesc(NString value) {
		super.setValue("QUERY_STATUS_DESC", value);
	}
	


	public NString getCurrentUser() {
		return toStr(super.getValue("CURRENT_USER"));
	}
	
	public void setCurrentUser(NString value) {
		super.setValue("CURRENT_USER", value);
	}
	


	public NString getCurrentForm() {
		return toStr(super.getValue("CURRENT_FORM"));
	}
	
	public void setCurrentForm(NString value) {
		super.setValue("CURRENT_FORM", value);
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
	


	public NString getCurrentRelease() {
		return toStr(super.getValue("CURRENT_RELEASE"));
	}
	
	public void setCurrentRelease(NString value) {
		super.setValue("CURRENT_RELEASE", value);
	}
	


	public NString getHeaderFlag() {
		return toStr(super.getValue("HEADER_FLAG"));
	}
	
	public void setHeaderFlag(NString value) {
		super.setValue("HEADER_FLAG", value);
	}
	


	public NString getWorkfld() {
		return toStr(super.getValue("WORKFLD"));
	}
	
	public void setWorkfld(NString value) {
		super.setValue("WORKFLD", value);
	}
	



}




