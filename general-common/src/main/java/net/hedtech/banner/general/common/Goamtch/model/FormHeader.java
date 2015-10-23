package net.hedtech.banner.general.common.Goamtch.model;

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
	


	public NString getCurrentUser() {
		return toStr(super.getValue("CURRENT_USER"));
	}
	
	public void setCurrentUser(NString value) {
		super.setValue("CURRENT_USER", value);
	}
	


	public NInteger getCalledForm() {
		return toInt(super.getValue("CALLED_FORM"));
	}
	
	public void setCalledForm(NInteger value) {
		super.setValue("CALLED_FORM", value);
	}
	


	public NString getCallingForm() {
		return toStr(super.getValue("CALLING_FORM"));
	}
	
	public void setCallingForm(NString value) {
		super.setValue("CALLING_FORM", value);
	}
	


	public NString getCheckKeys() {
		return toStr(super.getValue("CHECK_KEYS"));
	}
	
	public void setCheckKeys(NString value) {
		super.setValue("CHECK_KEYS", value);
	}
	


	public NString getCommitCompleted() {
		return toStr(super.getValue("COMMIT_COMPLETED"));
	}
	
	public void setCommitCompleted(NString value) {
		super.setValue("COMMIT_COMPLETED", value);
	}
	


	public NString getDoTabNavigation() {
		return toStr(super.getValue("DO_TAB_NAVIGATION"));
	}
	
	public void setDoTabNavigation(NString value) {
		super.setValue("DO_TAB_NAVIGATION", value);
	}
	


	public NString getHoldBlkItem() {
		return toStr(super.getValue("HOLD_BLK_ITEM"));
	}
	
	public void setHoldBlkItem(NString value) {
		super.setValue("HOLD_BLK_ITEM", value);
	}
	


	public NNumber getMatchPidm() {
		return toNumber(super.getValue("MATCH_PIDM"));
	}
	
	public void setMatchPidm(NNumber value) {
		super.setValue("MATCH_PIDM", value);
	}
	


	public NString getQueriedDetail() {
		return toStr(super.getValue("QUERIED_DETAIL"));
	}
	
	public void setQueriedDetail(NString value) {
		super.setValue("QUERIED_DETAIL", value);
	}
	


	public NString getReadImages() {
		return toStr(super.getValue("READ_IMAGES"));
	}
	
	public void setReadImages(NString value) {
		super.setValue("READ_IMAGES", value);
	}
	


	public NString getSkipSave() {
		return toStr(super.getValue("SKIP_SAVE"));
	}
	
	public void setSkipSave(NString value) {
		super.setValue("SKIP_SAVE", value);
	}
	


	public NString getAllowUpdates() {
		return toStr(super.getValue("ALLOW_UPDATES"));
	}
	
	public void setAllowUpdates(NString value) {
		super.setValue("ALLOW_UPDATES", value);
	}
	


	public NString getAllowClearForm() {
		return toStr(super.getValue("ALLOW_CLEAR_FORM"));
	}
	
	public void setAllowClearForm(NString value) {
		super.setValue("ALLOW_CLEAR_FORM", value);
	}
	


	public NString getAllowClearBlock() {
		return toStr(super.getValue("ALLOW_CLEAR_BLOCK"));
	}
	
	public void setAllowClearBlock(NString value) {
		super.setValue("ALLOW_CLEAR_BLOCK", value);
	}
	


	public NString getDetailsExist() {
		return toStr(super.getValue("DETAILS_EXIST"));
	}
	
	public void setDetailsExist(NString value) {
		super.setValue("DETAILS_EXIST", value);
	}
	


	public NString getMatchStatus() {
		return toStr(super.getValue("MATCH_STATUS"));
	}
	
	public void setMatchStatus(NString value) {
		super.setValue("MATCH_STATUS", value);
	}
	


	public NString getApiFailure() {
		return toStr(super.getValue("API_FAILURE"));
	}
	
	public void setApiFailure(NString value) {
		super.setValue("API_FAILURE", value);
	}
	


	public NString getAddrFailedLit() {
		return toStr(super.getValue("ADDR_FAILED_LIT"));
	}
	
	public void setAddrFailedLit(NString value) {
		super.setValue("ADDR_FAILED_LIT", value);
	}
	


	public NString getFCreateAddressErr() {
		return toStr(super.getValue("F_CREATE_ADDRESS_ERR"));
	}
	
	public void setFCreateAddressErr(NString value) {
		super.setValue("F_CREATE_ADDRESS_ERR", value);
	}
	


	public NString getFCreateBioErr() {
		return toStr(super.getValue("F_CREATE_BIO_ERR"));
	}
	
	public void setFCreateBioErr(NString value) {
		super.setValue("F_CREATE_BIO_ERR", value);
	}
	


	public NString getFCreateEmailErr() {
		return toStr(super.getValue("F_CREATE_EMAIL_ERR"));
	}
	
	public void setFCreateEmailErr(NString value) {
		super.setValue("F_CREATE_EMAIL_ERR", value);
	}
	


	public NString getFCreateAddidErr() {
		return toStr(super.getValue("F_CREATE_ADDID_ERR"));
	}
	
	public void setFCreateAddidErr(NString value) {
		super.setValue("F_CREATE_ADDID_ERR", value);
	}
	


	public NString getFCreateTelephoneErr() {
		return toStr(super.getValue("F_CREATE_TELEPHONE_ERR"));
	}
	
	public void setFCreateTelephoneErr(NString value) {
		super.setValue("F_CREATE_TELEPHONE_ERR", value);
	}
	


	public NString getGreenDataBar1() {
		return toStr(super.getValue("GREEN_DATA_BAR_1"));
	}
	
	public void setGreenDataBar1(NString value) {
		super.setValue("GREEN_DATA_BAR_1", value);
	}
	


	public NString getDataSeparatorLine2() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_2"));
	}
	
	public void setDataSeparatorLine2(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_2", value);
	}
	



}




