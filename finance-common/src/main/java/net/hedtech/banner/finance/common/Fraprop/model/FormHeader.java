package net.hedtech.banner.finance.common.Fraprop.model;

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
	

	



	public NString getOrgValidateFlag() {
		return toStr(super.getValue("ORG_VALIDATE_FLAG"));
	}
	
	public void setOrgValidateFlag(NString value) {
		super.setValue("ORG_VALIDATE_FLAG", value);
	}
	


	public NString getOrgPValidateFlag() {
		return toStr(super.getValue("ORG_P_VALIDATE_FLAG"));
	}
	
	public void setOrgPValidateFlag(NString value) {
		super.setValue("ORG_P_VALIDATE_FLAG", value);
	}
	


	public NString getFrbpropAgencyCode2() {
		return toStr(super.getValue("FRBPROP_AGENCY_CODE_2"));
	}
	
	public void setFrbpropAgencyCode2(NString value) {
		super.setValue("FRBPROP_AGENCY_CODE_2", value);
	}
	


	public NString getHoldDesc() {
		return toStr(super.getValue("HOLD_DESC"));
	}
	
	public void setHoldDesc(NString value) {
		super.setValue("HOLD_DESC", value);
	}
	


	public NString getFrbpropAgencyName2() {
		return toStr(super.getValue("FRBPROP_AGENCY_NAME_2"));
	}
	
	public void setFrbpropAgencyName2(NString value) {
		super.setValue("FRBPROP_AGENCY_NAME_2", value);
	}
	


	public NString getWorkStatusDesc() {
		return toStr(super.getValue("WORK_STATUS_DESC"));
	}
	
	public void setWorkStatusDesc(NString value) {
		super.setValue("WORK_STATUS_DESC", value);
	}
	


	public NString getCommitInd() {
		return toStr(super.getValue("COMMIT_IND"));
	}
	
	public void setCommitInd(NString value) {
		super.setValue("COMMIT_IND", value);
	}
	


	public NString getFromNewItem() {
		return toStr(super.getValue("FROM_NEW_ITEM"));
	}
	
	public void setFromNewItem(NString value) {
		super.setValue("FROM_NEW_ITEM", value);
	}
	


	public NString getCurrBlock() {
		return toStr(super.getValue("CURR_BLOCK"));
	}
	
	public void setCurrBlock(NString value) {
		super.setValue("CURR_BLOCK", value);
	}
	


	public NString getCurrentForm() {
		return toStr(super.getValue("CURRENT_FORM"));
	}
	
	public void setCurrentForm(NString value) {
		super.setValue("CURRENT_FORM", value);
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
	


	public NString getGotPidm() {
		return toStr(super.getValue("GOT_PIDM"));
	}
	
	public void setGotPidm(NString value) {
		super.setValue("GOT_PIDM", value);
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
	


	public NString getWorkuser() {
		return toStr(super.getValue("WORKUSER"));
	}
	
	public void setWorkuser(NString value) {
		super.setValue("WORKUSER", value);
	}
	


	public NString getCurrentUser1() {
		return toStr(super.getValue("CURRENT_USER1"));
	}
	
	public void setCurrentUser1(NString value) {
		super.setValue("CURRENT_USER1", value);
	}
	


	public NString getWorkdate() {
		return toStr(super.getValue("WORKDATE"));
	}
	
	public void setWorkdate(NString value) {
		super.setValue("WORKDATE", value);
	}
	


	public NString getCallfld() {
		return toStr(super.getValue("CALLFLD"));
	}
	
	public void setCallfld(NString value) {
		super.setValue("CALLFLD", value);
	}
	


	public NString getErrInd() {
		return toStr(super.getValue("ERR_IND"));
	}
	
	public void setErrInd(NString value) {
		super.setValue("ERR_IND", value);
	}
	


	public NString getHoldPress() {
		return toStr(super.getValue("HOLD_PRESS"));
	}
	
	public void setHoldPress(NString value) {
		super.setValue("HOLD_PRESS", value);
	}
	


	public NString getHoldAltStatusDesc() {
		return toStr(super.getValue("HOLD_ALT_STATUS_DESC"));
	}
	
	public void setHoldAltStatusDesc(NString value) {
		super.setValue("HOLD_ALT_STATUS_DESC", value);
	}
	


	public NString getCheckBoxDeflt() {
		return toStr(super.getValue("CHECK_BOX_DEFLT"));
	}
	
	public void setCheckBoxDeflt(NString value) {
		super.setValue("CHECK_BOX_DEFLT", value);
	}
	


	public NString getHoldPred() {
		return toStr(super.getValue("HOLD_PRED"));
	}
	
	public void setHoldPred(NString value) {
		super.setValue("HOLD_PRED", value);
	}
	


	public NString getCheckKeys() {
		return toStr(super.getValue("CHECK_KEYS"));
	}
	
	public void setCheckKeys(NString value) {
		super.setValue("CHECK_KEYS", value);
	}
	


	public NString getRollbackInd() {
		return toStr(super.getValue("ROLLBACK_IND"));
	}
	
	public void setRollbackInd(NString value) {
		super.setValue("ROLLBACK_IND", value);
	}
	


	public NString getReclrInd() {
		return toStr(super.getValue("RECLR_IND"));
	}
	
	public void setReclrInd(NString value) {
		super.setValue("RECLR_IND", value);
	}
	


	public NString getCopyInd() {
		return toStr(super.getValue("COPY_IND"));
	}
	
	public void setCopyInd(NString value) {
		super.setValue("COPY_IND", value);
	}
	


	public NString getBlockStatusF() {
		return toStr(super.getValue("BLOCK_STATUS_F"));
	}
	
	public void setBlockStatusF(NString value) {
		super.setValue("BLOCK_STATUS_F", value);
	}
	


	public NString getBlockStatusS() {
		return toStr(super.getValue("BLOCK_STATUS_S"));
	}
	
	public void setBlockStatusS(NString value) {
		super.setValue("BLOCK_STATUS_S", value);
	}
	


	public NString getWorkfld() {
		return toStr(super.getValue("WORKFLD"));
	}
	
	public void setWorkfld(NString value) {
		super.setValue("WORKFLD", value);
	}
	


	public NString getWorkStatusInd() {
		return toStr(super.getValue("WORK_STATUS_IND"));
	}
	
	public void setWorkStatusInd(NString value) {
		super.setValue("WORK_STATUS_IND", value);
	}
	


	public NString getRetrievedOrgnCode() {
		return toStr(super.getValue("RETRIEVED_ORGN_CODE"));
	}
	
	public void setRetrievedOrgnCode(NString value) {
		super.setValue("RETRIEVED_ORGN_CODE", value);
	}
	


	public NString getHoldOrgn() {
		return toStr(super.getValue("HOLD_ORGN"));
	}
	
	public void setHoldOrgn(NString value) {
		super.setValue("HOLD_ORGN", value);
	}
	


	public NString getHoldFobseqnType() {
		return toStr(super.getValue("HOLD_FOBSEQN_TYPE"));
	}
	
	public void setHoldFobseqnType(NString value) {
		super.setValue("HOLD_FOBSEQN_TYPE", value);
	}
	


	public NString getPostQueryInd() {
		return toStr(super.getValue("POST_QUERY_IND"));
	}
	
	public void setPostQueryInd(NString value) {
		super.setValue("POST_QUERY_IND", value);
	}
	


	public NString getBypassReformat() {
		return toStr(super.getValue("BYPASS_REFORMAT"));
	}
	
	public void setBypassReformat(NString value) {
		super.setValue("BYPASS_REFORMAT", value);
	}
	


	public NString getHoldStatusCode() {
		return toStr(super.getValue("HOLD_STATUS_CODE"));
	}
	
	public void setHoldStatusCode(NString value) {
		super.setValue("HOLD_STATUS_CODE", value);
	}
	


	public NDate getHoldStatusDate() {
		return toDate(super.getValue("HOLD_STATUS_DATE"));
	}
	
	public void setHoldStatusDate(NDate value) {
		super.setValue("HOLD_STATUS_DATE", value);
	}
	


	public NString getLocnErrorInd() {
		return toStr(super.getValue("LOCN_ERROR_IND"));
	}
	
	public void setLocnErrorInd(NString value) {
		super.setValue("LOCN_ERROR_IND", value);
	}
	


	public NString getHoldItemName() {
		return toStr(super.getValue("HOLD_ITEM_NAME"));
	}
	
	public void setHoldItemName(NString value) {
		super.setValue("HOLD_ITEM_NAME", value);
	}
	


	public NString getHoldPiIdCode() {
		return toStr(super.getValue("HOLD_PI_ID_CODE"));
	}
	
	public void setHoldPiIdCode(NString value) {
		super.setValue("HOLD_PI_ID_CODE", value);
	}
	


	public NString getHoldPiIdCodeFrrprpi() {
		return toStr(super.getValue("HOLD_PI_ID_CODE_FRRPRPI"));
	}
	
	public void setHoldPiIdCodeFrrprpi(NString value) {
		super.setValue("HOLD_PI_ID_CODE_FRRPRPI", value);
	}
	


	public NString getCopyFunctInd() {
		return toStr(super.getValue("COPY_FUNCT_IND"));
	}
	
	public void setCopyFunctInd(NString value) {
		super.setValue("COPY_FUNCT_IND", value);
	}
	


	public NString getCopyFunctProcess() {
		return toStr(super.getValue("COPY_FUNCT_PROCESS"));
	}
	
	public void setCopyFunctProcess(NString value) {
		super.setValue("COPY_FUNCT_PROCESS", value);
	}
	


	public NString getFrrprpiFrbpropCopyId() {
		return toStr(super.getValue("FRRPRPI_FRBPROP_COPY_ID"));
	}
	
	public void setFrrprpiFrbpropCopyId(NString value) {
		super.setValue("FRRPRPI_FRBPROP_COPY_ID", value);
	}
	


	public NNumber getCurrentAgencyCode() {
		return toNumber(super.getValue("CURRENT_AGENCY_CODE"));
	}
	
	public void setCurrentAgencyCode(NNumber value) {
		super.setValue("CURRENT_AGENCY_CODE", value);
	}
	


	public NNumber getTotal() {
		return toNumber(super.getValue("TOTAL"));
	}
	
	public void setTotal(NNumber value) {
		super.setValue("TOTAL", value);
	}
	


	public NNumber getPreTotal() {
		return toNumber(super.getValue("PRE_TOTAL"));
	}
	
	public void setPreTotal(NNumber value) {
		super.setValue("PRE_TOTAL", value);
	}
	


	public NString getFromExecuteQuery() {
		return toStr(super.getValue("FROM_EXECUTE_QUERY"));
	}
	
	public void setFromExecuteQuery(NString value) {
		super.setValue("FROM_EXECUTE_QUERY", value);
	}
	


	public NString getStoreOrgStatusDesc() {
		return toStr(super.getValue("STORE_ORG_STATUS_DESC"));
	}
	
	public void setStoreOrgStatusDesc(NString value) {
		super.setValue("STORE_ORG_STATUS_DESC", value);
	}
	


	public NString getDataSeparatorLine2() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_2"));
	}
	
	public void setDataSeparatorLine2(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_2", value);
	}
	


	public NString getFormCleared() {
		return toStr(super.getValue("FORM_CLEARED"));
	}
	
	public void setFormCleared(NString value) {
		super.setValue("FORM_CLEARED", value);
	}
	


	public NString getDelReady() {
		return toStr(super.getValue("DEL_READY"));
	}
	
	public void setDelReady(NString value) {
		super.setValue("DEL_READY", value);
	}
	


	public NString getNextDocNum() {
		return toStr(super.getValue("NEXT_DOC_NUM"));
	}
	
	public void setNextDocNum(NString value) {
		super.setValue("NEXT_DOC_NUM", value);
	}
	



}




