package net.hedtech.banner.general.common.Gutpmnu.model;

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
	

	



	public NString getCustUserId() {
		return toStr(super.getValue("CUST_USER_ID"));
	}
	
	public void setCustUserId(NString value) {
		super.setValue("CUST_USER_ID", value);
	}
	


	public NString getUserSearch() {
		return toStr(super.getValue("USER_SEARCH"));
	}
	
	public void setUserSearch(NString value) {
		super.setValue("USER_SEARCH", value);
	}
	


	public NString getObjectType() {
		return toStr(super.getValue("OBJECT_TYPE"));
	}
	
	public void setObjectType(NString value) {
		super.setValue("OBJECT_TYPE", value);
	}
	


	public NString getSearchCr() {
		return toStr(super.getValue("SEARCH_CR"));
	}
	
	public void setSearchCr(NString value) {
		super.setValue("SEARCH_CR", value);
	}
	


	public NString getCheckKeys() {
		return toStr(super.getValue("CHECK_KEYS"));
	}
	
	public void setCheckKeys(NString value) {
		super.setValue("CHECK_KEYS", value);
	}
	


	public NString getWorkCr() {
		return toStr(super.getValue("WORK_CR"));
	}
	
	public void setWorkCr(NString value) {
		super.setValue("WORK_CR", value);
	}
	


	public NString getCurrentUser1() {
		return toStr(super.getValue("current_user1"));
	}
	
	public void setCurrentUser1(NString value) {
		super.setValue("current_user1", value);
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
	


	public NString getCurrentBlock() {
		return toStr(super.getValue("CURRENT_BLOCK"));
	}
	
	public void setCurrentBlock(NString value) {
		super.setValue("CURRENT_BLOCK", value);
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
	


	public NString getHoldRecord() {
		return toStr(super.getValue("HOLD_RECORD"));
	}
	
	public void setHoldRecord(NString value) {
		super.setValue("HOLD_RECORD", value);
	}
	


	public NString getSubName() {
		return toStr(super.getValue("SUB_NAME"));
	}
	
	public void setSubName(NString value) {
		super.setValue("SUB_NAME", value);
	}
	


	public NString getCommitFlag() {
		return toStr(super.getValue("COMMIT_FLAG"));
	}
	
	public void setCommitFlag(NString value) {
		super.setValue("COMMIT_FLAG", value);
	}
	


	public NString getNavigateFlag() {
		return toStr(super.getValue("NAVIGATE_FLAG"));
	}
	
	public void setNavigateFlag(NString value) {
		super.setValue("NAVIGATE_FLAG", value);
	}
	


	public NString getInitialQuery() {
		return toStr(super.getValue("INITIAL_QUERY"));
	}
	
	public void setInitialQuery(NString value) {
		super.setValue("INITIAL_QUERY", value);
	}
	



}




