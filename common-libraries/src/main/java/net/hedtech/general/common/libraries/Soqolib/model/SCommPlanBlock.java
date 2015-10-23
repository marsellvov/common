package net.hedtech.general.common.libraries.Soqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class SCommPlanBlock extends SimpleBusinessObject
{
	public SCommPlanBlock() {
		super();
	}

	public SCommPlanBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getHoldProgram() {
		return toStr(super.getValue("HOLD_PROGRAM"));
	}
	
	public void setHoldProgram(NString value) {
		super.setValue("HOLD_PROGRAM", value);
	}
	


	public NString getHoldLevel() {
		return toStr(super.getValue("HOLD_LEVEL"));
	}
	
	public void setHoldLevel(NString value) {
		super.setValue("HOLD_LEVEL", value);
	}
	


	public NString getHoldCampus() {
		return toStr(super.getValue("HOLD_CAMPUS"));
	}
	
	public void setHoldCampus(NString value) {
		super.setValue("HOLD_CAMPUS", value);
	}
	


	public NString getHoldCollege() {
		return toStr(super.getValue("HOLD_COLLEGE"));
	}
	
	public void setHoldCollege(NString value) {
		super.setValue("HOLD_COLLEGE", value);
	}
	


	public NString getHoldDegree() {
		return toStr(super.getValue("HOLD_DEGREE"));
	}
	
	public void setHoldDegree(NString value) {
		super.setValue("HOLD_DEGREE", value);
	}
	


	public NString getModuleInd() {
		return toStr(super.getValue("MODULE_IND"));
	}
	
	public void setModuleInd(NString value) {
		super.setValue("MODULE_IND", value);
	}
	


	public NString getHoldDept() {
		return toStr(super.getValue("HOLD_DEPT"));
	}
	
	public void setHoldDept(NString value) {
		super.setValue("HOLD_DEPT", value);
	}
	


	public NString getCommPlanInd() {
		return toStr(super.getValue("COMM_PLAN_IND"));
	}
	
	public void setCommPlanInd(NString value) {
		super.setValue("COMM_PLAN_IND", value);
	}
	


	public NString getCrerecInd() {
		return toStr(super.getValue("CREREC_IND"));
	}
	
	public void setCrerecInd(NString value) {
		super.setValue("CREREC_IND", value);
	}
	


	public NString getDuprecInd() {
		return toStr(super.getValue("DUPREC_IND"));
	}
	
	public void setDuprecInd(NString value) {
		super.setValue("DUPREC_IND", value);
	}
	


	public NString getDataSeparatorLineC1() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_C1"));
	}
	
	public void setDataSeparatorLineC1(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_C1", value);
	}
	


	public NString getSobcplnReturnObject() {
		return toStr(super.getValue("SOBCPLN_RETURN_OBJECT"));
	}
	
	public void setSobcplnReturnObject(NString value) {
		super.setValue("SOBCPLN_RETURN_OBJECT", value);
	}
	


	public NString getSobcplnReturnItem() {
		return toStr(super.getValue("SOBCPLN_RETURN_ITEM"));
	}
	
	public void setSobcplnReturnItem(NString value) {
		super.setValue("SOBCPLN_RETURN_ITEM", value);
	}
	


	public NString getCallCommplan() {
		return toStr(super.getValue("CALL_COMMPLAN"));
	}
	
	public void setCallCommplan(NString value) {
		super.setValue("CALL_COMMPLAN", value);
	}
	


	public NNumber getCommRecordPlace() {
		return toNumber(super.getValue("COMM_RECORD_PLACE"));
	}
	
	public void setCommRecordPlace(NNumber value) {
		super.setValue("COMM_RECORD_PLACE", value);
	}
	


	public NString getCommitFormMessage() {
		return toStr(super.getValue("COMMIT_FORM_MESSAGE"));
	}
	
	public void setCommitFormMessage(NString value) {
		super.setValue("COMMIT_FORM_MESSAGE", value);
	}
	


	public NString getInsertComplete() {
		return toStr(super.getValue("INSERT_COMPLETE"));
	}
	
	public void setInsertComplete(NString value) {
		super.setValue("INSERT_COMPLETE", value);
	}
	


	public NString getCommKeyFlag() {
		return toStr(super.getValue("COMM_KEY_FLAG"));
	}
	
	public void setCommKeyFlag(NString value) {
		super.setValue("COMM_KEY_FLAG", value);
	}
	


	public NString getCommAdmitExists() {
		return toStr(super.getValue("COMM_ADMIT_EXISTS"));
	}
	
	public void setCommAdmitExists(NString value) {
		super.setValue("COMM_ADMIT_EXISTS", value);
	}
	


	public NString getCommStudentExists() {
		return toStr(super.getValue("COMM_STUDENT_EXISTS"));
	}
	
	public void setCommStudentExists(NString value) {
		super.setValue("COMM_STUDENT_EXISTS", value);
	}
	


	public NString getCommRecruitExists() {
		return toStr(super.getValue("COMM_RECRUIT_EXISTS"));
	}
	
	public void setCommRecruitExists(NString value) {
		super.setValue("COMM_RECRUIT_EXISTS", value);
	}
	


	public NString getCommCampCode() {
		return toStr(super.getValue("COMM_CAMP_CODE"));
	}
	
	public void setCommCampCode(NString value) {
		super.setValue("COMM_CAMP_CODE", value);
	}
	


	public NString getCommResult() {
		return toStr(super.getValue("COMM_RESULT"));
	}
	
	public void setCommResult(NString value) {
		super.setValue("COMM_RESULT", value);
	}
	


	public NString getCommAction() {
		return toStr(super.getValue("COMM_ACTION"));
	}
	
	public void setCommAction(NString value) {
		super.setValue("COMM_ACTION", value);
	}
	


	public NString getCommCollCode() {
		return toStr(super.getValue("COMM_COLL_CODE"));
	}
	
	public void setCommCollCode(NString value) {
		super.setValue("COMM_COLL_CODE", value);
	}
	


	public NString getCommLevlCode() {
		return toStr(super.getValue("COMM_LEVL_CODE"));
	}
	
	public void setCommLevlCode(NString value) {
		super.setValue("COMM_LEVL_CODE", value);
	}
	


	public NString getCommDegcCode() {
		return toStr(super.getValue("COMM_DEGC_CODE"));
	}
	
	public void setCommDegcCode(NString value) {
		super.setValue("COMM_DEGC_CODE", value);
	}
	


	public NString getCommProgram() {
		return toStr(super.getValue("COMM_PROGRAM"));
	}
	
	public void setCommProgram(NString value) {
		super.setValue("COMM_PROGRAM", value);
	}
	


	public NString getCommMajrCode() {
		return toStr(super.getValue("COMM_MAJR_CODE"));
	}
	
	public void setCommMajrCode(NString value) {
		super.setValue("COMM_MAJR_CODE", value);
	}
	


	public NString getCommDeptCode() {
		return toStr(super.getValue("COMM_DEPT_CODE"));
	}
	
	public void setCommDeptCode(NString value) {
		super.setValue("COMM_DEPT_CODE", value);
	}
	


	public NString getOldCplnCode() {
		return toStr(super.getValue("OLD_CPLN_CODE"));
	}
	
	public void setOldCplnCode(NString value) {
		super.setValue("OLD_CPLN_CODE", value);
	}
	


	public NString getKeyFunction() {
		return toStr(super.getValue("KEY_FUNCTION"));
	}
	
	public void setKeyFunction(NString value) {
		super.setValue("KEY_FUNCTION", value);
	}
	


	public NString getOldCplnDesc() {
		return toStr(super.getValue("OLD_CPLN_DESC"));
	}
	
	public void setOldCplnDesc(NString value) {
		super.setValue("OLD_CPLN_DESC", value);
	}
	


	public NString getNewCplnCode() {
		return toStr(super.getValue("NEW_CPLN_CODE"));
	}
	
	public void setNewCplnCode(NString value) {
		super.setValue("NEW_CPLN_CODE", value);
	}
	


	public NString getNewCplnDesc() {
		return toStr(super.getValue("NEW_CPLN_DESC"));
	}
	
	public void setNewCplnDesc(NString value) {
		super.setValue("NEW_CPLN_DESC", value);
	}
	


	public NString getCommSaveFieldName() {
		return toStr(super.getValue("COMM_SAVE_FIELD_NAME"));
	}
	
	public void setCommSaveFieldName(NString value) {
		super.setValue("COMM_SAVE_FIELD_NAME", value);
	}
	


	public NNumber getCplnPidm() {
		return toNumber(super.getValue("CPLN_PIDM"));
	}
	
	public void setCplnPidm(NNumber value) {
		super.setValue("CPLN_PIDM", value);
	}
	


	public NString getCplnAction() {
		return toStr(super.getValue("CPLN_ACTION"));
	}
	
	public void setCplnAction(NString value) {
		super.setValue("CPLN_ACTION", value);
	}
	


	public NString getCplnTypeInd() {
		return toStr(super.getValue("CPLN_TYPE_IND"));
	}
	
	public void setCplnTypeInd(NString value) {
		super.setValue("CPLN_TYPE_IND", value);
	}
	


	public NString getCplnTermCode() {
		return toStr(super.getValue("CPLN_TERM_CODE"));
	}
	
	public void setCplnTermCode(NString value) {
		super.setValue("CPLN_TERM_CODE", value);
	}
	


	public NString getOldTermCode() {
		return toStr(super.getValue("OLD_TERM_CODE"));
	}
	
	public void setOldTermCode(NString value) {
		super.setValue("OLD_TERM_CODE", value);
	}
	


	public NNumber getCplnSeqno() {
		return toNumber(super.getValue("CPLN_SEQNO"));
	}
	
	public void setCplnSeqno(NNumber value) {
		super.setValue("CPLN_SEQNO", value);
	}
	


	public NNumber getOldSeqno() {
		return toNumber(super.getValue("OLD_SEQNO"));
	}
	
	public void setOldSeqno(NNumber value) {
		super.setValue("OLD_SEQNO", value);
	}
	


	public NString getCommitInd() {
		return toStr(super.getValue("COMMIT_IND"));
	}
	
	public void setCommitInd(NString value) {
		super.setValue("COMMIT_IND", value);
	}
	


	public NString getAddPlan() {
		return toStr(super.getValue("ADD_PLAN"));
	}
	
	public void setAddPlan(NString value) {
		super.setValue("ADD_PLAN", value);
	}
	


	public NString getPendingMail() {
		return toStr(super.getValue("PENDING_MAIL"));
	}
	
	public void setPendingMail(NString value) {
		super.setValue("PENDING_MAIL", value);
	}
	


	public NString getDeletePlanComm() {
		return toStr(super.getValue("DELETE_PLAN_COMM"));
	}
	
	public void setDeletePlanComm(NString value) {
		super.setValue("DELETE_PLAN_COMM", value);
	}
	


	public NString getDeleteMailComm() {
		return toStr(super.getValue("DELETE_MAIL_COMM"));
	}
	
	public void setDeleteMailComm(NString value) {
		super.setValue("DELETE_MAIL_COMM", value);
	}
	


	public NString getSaveFieldName() {
		return toStr(super.getValue("SAVE_FIELD_NAME"));
	}
	
	public void setSaveFieldName(NString value) {
		super.setValue("SAVE_FIELD_NAME", value);
	}
	



}




