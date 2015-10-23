package net.hedtech.general.common.libraries.Soqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class SCurricula extends SimpleBusinessObject
{
	public SCurricula() {
		super();
	}

	public SCurricula(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getCommplanDeleteTrigger() {
		return toStr(super.getValue("COMMPLAN_DELETE_TRIGGER"));
	}
	
	public void setCommplanDeleteTrigger(NString value) {
		super.setValue("COMMPLAN_DELETE_TRIGGER", value);
	}
	


	public NString getCurrentRole() {
		return toStr(super.getValue("CURRENT_ROLE"));
	}
	
	public void setCurrentRole(NString value) {
		super.setValue("CURRENT_ROLE", value);
	}
	


	public NString getCurrentObj() {
		return toStr(super.getValue("CURRENT_OBJ"));
	}
	
	public void setCurrentObj(NString value) {
		super.setValue("CURRENT_OBJ", value);
	}
	


	public NString getCommitInprogress() {
		return toStr(super.getValue("COMMIT_INPROGRESS"));
	}
	
	public void setCommitInprogress(NString value) {
		super.setValue("COMMIT_INPROGRESS", value);
	}
	


	public NString getCreateRecr() {
		return toStr(super.getValue("CREATE_RECR"));
	}
	
	public void setCreateRecr(NString value) {
		super.setValue("CREATE_RECR", value);
	}
	


	public NString getCreateAdm() {
		return toStr(super.getValue("CREATE_ADM"));
	}
	
	public void setCreateAdm(NString value) {
		super.setValue("CREATE_ADM", value);
	}
	


	public NString getSaveErrorItem() {
		return toStr(super.getValue("SAVE_ERROR_ITEM"));
	}
	
	public void setSaveErrorItem(NString value) {
		super.setValue("SAVE_ERROR_ITEM", value);
	}
	


	public NString getLearnerEffTerm() {
		return toStr(super.getValue("LEARNER_EFF_TERM"));
	}
	
	public void setLearnerEffTerm(NString value) {
		super.setValue("LEARNER_EFF_TERM", value);
	}
	


	public NString getOptionsInd() {
		return toStr(super.getValue("OPTIONS_IND"));
	}
	
	public void setOptionsInd(NString value) {
		super.setValue("OPTIONS_IND", value);
	}
	


	public NString getEvaluateCourses() {
		return toStr(super.getValue("EVALUATE_COURSES"));
	}
	
	public void setEvaluateCourses(NString value) {
		super.setValue("EVALUATE_COURSES", value);
	}
	


	public NNumber getOriginalSorlcurCount() {
		return toNumber(super.getValue("ORIGINAL_SORLCUR_COUNT"));
	}
	
	public void setOriginalSorlcurCount(NNumber value) {
		super.setValue("ORIGINAL_SORLCUR_COUNT", value);
	}
	


	public NString getCurricCommitErrorMsg() {
		return toStr(super.getValue("CURRIC_COMMIT_ERROR_MSG"));
	}
	
	public void setCurricCommitErrorMsg(NString value) {
		super.setValue("CURRIC_COMMIT_ERROR_MSG", value);
	}
	


	public NString getCurriculaUpdated() {
		return toStr(super.getValue("CURRICULA_UPDATED"));
	}
	
	public void setCurriculaUpdated(NString value) {
		super.setValue("CURRICULA_UPDATED", value);
	}
	


	public NString getCurriculaDupInprogress() {
		return toStr(super.getValue("CURRICULA_DUP_INPROGRESS"));
	}
	
	public void setCurriculaDupInprogress(NString value) {
		super.setValue("CURRICULA_DUP_INPROGRESS", value);
	}
	


	public NString getDefaultOptionsInd() {
		return toStr(super.getValue("DEFAULT_OPTIONS_IND"));
	}
	
	public void setDefaultOptionsInd(NString value) {
		super.setValue("DEFAULT_OPTIONS_IND", value);
	}
	


	public NString getSorlcurDelInd() {
		return toStr(super.getValue("SORLCUR_DEL_IND"));
	}
	
	public void setSorlcurDelInd(NString value) {
		super.setValue("SORLCUR_DEL_IND", value);
	}
	


	public NString getDupCreateInd() {
		return toStr(super.getValue("DUP_CREATE_IND"));
	}
	
	public void setDupCreateInd(NString value) {
		super.setValue("DUP_CREATE_IND", value);
	}
	


	public NString getSorlfosDelInd() {
		return toStr(super.getValue("SORLFOS_DEL_IND"));
	}
	
	public void setSorlfosDelInd(NString value) {
		super.setValue("SORLFOS_DEL_IND", value);
	}
	


	public NNumber getHoldCurrRule() {
		return toNumber(super.getValue("HOLD_CURR_RULE"));
	}
	
	public void setHoldCurrRule(NNumber value) {
		super.setValue("HOLD_CURR_RULE", value);
	}
	


	public NString getHoldTermCtlg() {
		return toStr(super.getValue("HOLD_TERM_CTLG"));
	}
	
	public void setHoldTermCtlg(NString value) {
		super.setValue("HOLD_TERM_CTLG", value);
	}
	


	public NString getHoldDept() {
		return toStr(super.getValue("HOLD_DEPT"));
	}
	
	public void setHoldDept(NString value) {
		super.setValue("HOLD_DEPT", value);
	}
	


	public NNumber getHoldMajrRule() {
		return toNumber(super.getValue("HOLD_MAJR_RULE"));
	}
	
	public void setHoldMajrRule(NNumber value) {
		super.setValue("HOLD_MAJR_RULE", value);
	}
	


	public NString getSorlcurBlockStatus() {
		return toStr(super.getValue("SORLCUR_BLOCK_STATUS"));
	}
	
	public void setSorlcurBlockStatus(NString value) {
		super.setValue("SORLCUR_BLOCK_STATUS", value);
	}
	


	public NString getCurrProgram() {
		return toStr(super.getValue("CURR_PROGRAM"));
	}
	
	public void setCurrProgram(NString value) {
		super.setValue("CURR_PROGRAM", value);
	}
	


	public NString getCurrLevlCode() {
		return toStr(super.getValue("CURR_LEVL_CODE"));
	}
	
	public void setCurrLevlCode(NString value) {
		super.setValue("CURR_LEVL_CODE", value);
	}
	


	public NString getCurrCampCode() {
		return toStr(super.getValue("CURR_CAMP_CODE"));
	}
	
	public void setCurrCampCode(NString value) {
		super.setValue("CURR_CAMP_CODE", value);
	}
	


	public NString getCurrDegcCode() {
		return toStr(super.getValue("CURR_DEGC_CODE"));
	}
	
	public void setCurrDegcCode(NString value) {
		super.setValue("CURR_DEGC_CODE", value);
	}
	


	public NString getCurrCollCode() {
		return toStr(super.getValue("CURR_COLL_CODE"));
	}
	
	public void setCurrCollCode(NString value) {
		super.setValue("CURR_COLL_CODE", value);
	}
	


	public NString getCurrCtlgTerm() {
		return toStr(super.getValue("CURR_CTLG_TERM"));
	}
	
	public void setCurrCtlgTerm(NString value) {
		super.setValue("CURR_CTLG_TERM", value);
	}
	


	public NString getDefaultCact() {
		return toStr(super.getValue("DEFAULT_CACT"));
	}
	
	public void setDefaultCact(NString value) {
		super.setValue("DEFAULT_CACT", value);
	}
	


	public NString getDefaultCsts() {
		return toStr(super.getValue("DEFAULT_CSTS"));
	}
	
	public void setDefaultCsts(NString value) {
		super.setValue("DEFAULT_CSTS", value);
	}
	


	public NString getDefaultMajor() {
		return toStr(super.getValue("DEFAULT_MAJOR"));
	}
	
	public void setDefaultMajor(NString value) {
		super.setValue("DEFAULT_MAJOR", value);
	}
	


	public NNumber getDefaultCmjrRule() {
		return toNumber(super.getValue("DEFAULT_CMJR_RULE"));
	}
	
	public void setDefaultCmjrRule(NNumber value) {
		super.setValue("DEFAULT_CMJR_RULE", value);
	}
	


	public NString getDefaultDept() {
		return toStr(super.getValue("DEFAULT_DEPT"));
	}
	
	public void setDefaultDept(NString value) {
		super.setValue("DEFAULT_DEPT", value);
	}
	


	public NString getDefaultLevel() {
		return toStr(super.getValue("DEFAULT_LEVEL"));
	}
	
	public void setDefaultLevel(NString value) {
		super.setValue("DEFAULT_LEVEL", value);
	}
	


	public NString getDefaultCampus() {
		return toStr(super.getValue("DEFAULT_CAMPUS"));
	}
	
	public void setDefaultCampus(NString value) {
		super.setValue("DEFAULT_CAMPUS", value);
	}
	


	public NString getDefaultProgram() {
		return toStr(super.getValue("DEFAULT_PROGRAM"));
	}
	
	public void setDefaultProgram(NString value) {
		super.setValue("DEFAULT_PROGRAM", value);
	}
	


	public NString getDefaultCollege() {
		return toStr(super.getValue("DEFAULT_COLLEGE"));
	}
	
	public void setDefaultCollege(NString value) {
		super.setValue("DEFAULT_COLLEGE", value);
	}
	


	public NString getDefaultDegree() {
		return toStr(super.getValue("DEFAULT_DEGREE"));
	}
	
	public void setDefaultDegree(NString value) {
		super.setValue("DEFAULT_DEGREE", value);
	}
	


	public NString getDefaultAdmt() {
		return toStr(super.getValue("DEFAULT_ADMT"));
	}
	
	public void setDefaultAdmt(NString value) {
		super.setValue("DEFAULT_ADMT", value);
	}
	


	public NString getDefaultCurricTermCtlg() {
		return toStr(super.getValue("DEFAULT_CURRIC_TERM_CTLG"));
	}
	
	public void setDefaultCurricTermCtlg(NString value) {
		super.setValue("DEFAULT_CURRIC_TERM_CTLG", value);
	}
	


	public NString getHostBlockField() {
		return toStr(super.getValue("HOST_BLOCK_FIELD"));
	}
	
	public void setHostBlockField(NString value) {
		super.setValue("HOST_BLOCK_FIELD", value);
	}
	


	public NString getLcurProcess() {
		return toStr(super.getValue("LCUR_PROCESS"));
	}
	
	public void setLcurProcess(NString value) {
		super.setValue("LCUR_PROCESS", value);
	}
	


	public NString getLcurLov() {
		return toStr(super.getValue("LCUR_LOV"));
	}
	
	public void setLcurLov(NString value) {
		super.setValue("LCUR_LOV", value);
	}
	


	public NString getLcurProgramField() {
		return toStr(super.getValue("LCUR_PROGRAM_FIELD"));
	}
	
	public void setLcurProgramField(NString value) {
		super.setValue("LCUR_PROGRAM_FIELD", value);
	}
	


	public NString getLcurLevlField() {
		return toStr(super.getValue("LCUR_LEVL_FIELD"));
	}
	
	public void setLcurLevlField(NString value) {
		super.setValue("LCUR_LEVL_FIELD", value);
	}
	


	public NString getLcurCollField() {
		return toStr(super.getValue("LCUR_COLL_FIELD"));
	}
	
	public void setLcurCollField(NString value) {
		super.setValue("LCUR_COLL_FIELD", value);
	}
	


	public NString getLcurCampField() {
		return toStr(super.getValue("LCUR_CAMP_FIELD"));
	}
	
	public void setLcurCampField(NString value) {
		super.setValue("LCUR_CAMP_FIELD", value);
	}
	


	public NString getLcurDegcField() {
		return toStr(super.getValue("LCUR_DEGC_FIELD"));
	}
	
	public void setLcurDegcField(NString value) {
		super.setValue("LCUR_DEGC_FIELD", value);
	}
	


	public NString getLcurSobctrlCurrRuleInd() {
		return toStr(super.getValue("LCUR_SOBCTRL_CURR_RULE_IND"));
	}
	
	public void setLcurSobctrlCurrRuleInd(NString value) {
		super.setValue("LCUR_SOBCTRL_CURR_RULE_IND", value);
	}
	


	public NString getLcurOriginalCurrInd() {
		return toStr(super.getValue("LCUR_ORIGINAL_CURR_IND"));
	}
	
	public void setLcurOriginalCurrInd(NString value) {
		super.setValue("LCUR_ORIGINAL_CURR_IND", value);
	}
	


	public NString getLcurTempRuleInd() {
		return toStr(super.getValue("LCUR_TEMP_RULE_IND"));
	}
	
	public void setLcurTempRuleInd(NString value) {
		super.setValue("LCUR_TEMP_RULE_IND", value);
	}
	


	public NString getLcurSobctrlProgramInd() {
		return toStr(super.getValue("LCUR_SOBCTRL_PROGRAM_IND"));
	}
	
	public void setLcurSobctrlProgramInd(NString value) {
		super.setValue("LCUR_SOBCTRL_PROGRAM_IND", value);
	}
	


	public NString getLcurSobctrlConcInd() {
		return toStr(super.getValue("LCUR_SOBCTRL_CONC_IND"));
	}
	
	public void setLcurSobctrlConcInd(NString value) {
		super.setValue("LCUR_SOBCTRL_CONC_IND", value);
	}
	


	public NString getLcurLevlDesc() {
		return toStr(super.getValue("LCUR_LEVL_DESC"));
	}
	
	public void setLcurLevlDesc(NString value) {
		super.setValue("LCUR_LEVL_DESC", value);
	}
	


	public NString getLcurCampDesc() {
		return toStr(super.getValue("LCUR_CAMP_DESC"));
	}
	
	public void setLcurCampDesc(NString value) {
		super.setValue("LCUR_CAMP_DESC", value);
	}
	


	public NString getLcurCollDesc() {
		return toStr(super.getValue("LCUR_COLL_DESC"));
	}
	
	public void setLcurCollDesc(NString value) {
		super.setValue("LCUR_COLL_DESC", value);
	}
	


	public NString getLcurDegcDesc() {
		return toStr(super.getValue("LCUR_DEGC_DESC"));
	}
	
	public void setLcurDegcDesc(NString value) {
		super.setValue("LCUR_DEGC_DESC", value);
	}
	


	public NString getLcurChangeInd() {
		return toStr(super.getValue("LCUR_CHANGE_IND"));
	}
	
	public void setLcurChangeInd(NString value) {
		super.setValue("LCUR_CHANGE_IND", value);
	}
	


	public NString getReturnFromSorlcur() {
		return toStr(super.getValue("RETURN_FROM_SORLCUR"));
	}
	
	public void setReturnFromSorlcur(NString value) {
		super.setValue("RETURN_FROM_SORLCUR", value);
	}
	


	public NString getNextBlockSorlfos() {
		return toStr(super.getValue("NEXT_BLOCK_SORLFOS"));
	}
	
	public void setNextBlockSorlfos(NString value) {
		super.setValue("NEXT_BLOCK_SORLFOS", value);
	}
	


	public NString getSorlfosNextBlockNav() {
		return toStr(super.getValue("SORLFOS_NEXT_BLOCK_NAV"));
	}
	
	public void setSorlfosNextBlockNav(NString value) {
		super.setValue("SORLFOS_NEXT_BLOCK_NAV", value);
	}
	


	public NString getExitFromSorlcur() {
		return toStr(super.getValue("EXIT_FROM_SORLCUR"));
	}
	
	public void setExitFromSorlcur(NString value) {
		super.setValue("EXIT_FROM_SORLCUR", value);
	}
	


	public NNumber getModuleKeySeqno() {
		return toNumber(super.getValue("MODULE_KEY_SEQNO"));
	}
	
	public void setModuleKeySeqno(NNumber value) {
		super.setValue("MODULE_KEY_SEQNO", value);
	}
	


	public NString getModuleTermCode() {
		return toStr(super.getValue("MODULE_TERM_CODE"));
	}
	
	public void setModuleTermCode(NString value) {
		super.setValue("MODULE_TERM_CODE", value);
	}
	


	public NString getModuleEndTerm() {
		return toStr(super.getValue("MODULE_END_TERM"));
	}
	
	public void setModuleEndTerm(NString value) {
		super.setValue("MODULE_END_TERM", value);
	}
	


	public NString getModuleCode() {
		return toStr(super.getValue("MODULE_CODE"));
	}
	
	public void setModuleCode(NString value) {
		super.setValue("MODULE_CODE", value);
	}
	


	public NString getModuleDegsCode() {
		return toStr(super.getValue("MODULE_DEGS_CODE"));
	}
	
	public void setModuleDegsCode(NString value) {
		super.setValue("MODULE_DEGS_CODE", value);
	}
	


	public NString getModuleStstCode() {
		return toStr(super.getValue("MODULE_STST_CODE"));
	}
	
	public void setModuleStstCode(NString value) {
		super.setValue("MODULE_STST_CODE", value);
	}
	


	public NString getModuleInsertWarning() {
		return toStr(super.getValue("MODULE_INSERT_WARNING"));
	}
	
	public void setModuleInsertWarning(NString value) {
		super.setValue("MODULE_INSERT_WARNING", value);
	}
	


	public NString getModuleInsertRestriction() {
		return toStr(super.getValue("MODULE_INSERT_RESTRICTION"));
	}
	
	public void setModuleInsertRestriction(NString value) {
		super.setValue("MODULE_INSERT_RESTRICTION", value);
	}
	


	public NString getLcurLockInd() {
		return toStr(super.getValue("LCUR_LOCK_IND"));
	}
	
	public void setLcurLockInd(NString value) {
		super.setValue("LCUR_LOCK_IND", value);
	}
	


	public NString getLcurProgramProcess() {
		return toStr(super.getValue("LCUR_PROGRAM_PROCESS"));
	}
	
	public void setLcurProgramProcess(NString value) {
		super.setValue("LCUR_PROGRAM_PROCESS", value);
	}
	


	public NString getLcurLevlCode() {
		return toStr(super.getValue("LCUR_LEVL_CODE"));
	}
	
	public void setLcurLevlCode(NString value) {
		super.setValue("LCUR_LEVL_CODE", value);
	}
	


	public NString getLcurCampCode() {
		return toStr(super.getValue("LCUR_CAMP_CODE"));
	}
	
	public void setLcurCampCode(NString value) {
		super.setValue("LCUR_CAMP_CODE", value);
	}
	


	public NString getLcurDegcCode() {
		return toStr(super.getValue("LCUR_DEGC_CODE"));
	}
	
	public void setLcurDegcCode(NString value) {
		super.setValue("LCUR_DEGC_CODE", value);
	}
	


	public NString getLcurProgram() {
		return toStr(super.getValue("LCUR_PROGRAM"));
	}
	
	public void setLcurProgram(NString value) {
		super.setValue("LCUR_PROGRAM", value);
	}
	


	public NString getLcurCollCode() {
		return toStr(super.getValue("LCUR_COLL_CODE"));
	}
	
	public void setLcurCollCode(NString value) {
		super.setValue("LCUR_COLL_CODE", value);
	}
	


	public NString getLcurEffTerm() {
		return toStr(super.getValue("LCUR_EFF_TERM"));
	}
	
	public void setLcurEffTerm(NString value) {
		super.setValue("LCUR_EFF_TERM", value);
	}
	


	public NString getLcurCtlgTerm() {
		return toStr(super.getValue("LCUR_CTLG_TERM"));
	}
	
	public void setLcurCtlgTerm(NString value) {
		super.setValue("LCUR_CTLG_TERM", value);
	}
	


	public NString getChangeLevlCode() {
		return toStr(super.getValue("CHANGE_LEVL_CODE"));
	}
	
	public void setChangeLevlCode(NString value) {
		super.setValue("CHANGE_LEVL_CODE", value);
	}
	


	public NString getChangeProgram() {
		return toStr(super.getValue("CHANGE_PROGRAM"));
	}
	
	public void setChangeProgram(NString value) {
		super.setValue("CHANGE_PROGRAM", value);
	}
	


	public NString getChangeCollCode() {
		return toStr(super.getValue("CHANGE_COLL_CODE"));
	}
	
	public void setChangeCollCode(NString value) {
		super.setValue("CHANGE_COLL_CODE", value);
	}
	


	public NString getChangeDegcCode() {
		return toStr(super.getValue("CHANGE_DEGC_CODE"));
	}
	
	public void setChangeDegcCode(NString value) {
		super.setValue("CHANGE_DEGC_CODE", value);
	}
	


	public NString getChangeCampCode() {
		return toStr(super.getValue("CHANGE_CAMP_CODE"));
	}
	
	public void setChangeCampCode(NString value) {
		super.setValue("CHANGE_CAMP_CODE", value);
	}
	


	public NNumber getErrNumber() {
		return toNumber(super.getValue("ERR_NUMBER"));
	}
	
	public void setErrNumber(NNumber value) {
		super.setValue("ERR_NUMBER", value);
	}
	


	public NString getDelrecInd() {
		return toStr(super.getValue("DELREC_IND"));
	}
	
	public void setDelrecInd(NString value) {
		super.setValue("DELREC_IND", value);
	}
	


	public NString getDeleteInprogress() {
		return toStr(super.getValue("DELETE_INPROGRESS"));
	}
	
	public void setDeleteInprogress(NString value) {
		super.setValue("DELETE_INPROGRESS", value);
	}
	


	public NString getDefaultinsertInprogress() {
		return toStr(super.getValue("DEFAULTINSERT_INPROGRESS"));
	}
	
	public void setDefaultinsertInprogress(NString value) {
		super.setValue("DEFAULTINSERT_INPROGRESS", value);
	}
	


	public NNumber getCurrentRecord() {
		return toNumber(super.getValue("CURRENT_RECORD"));
	}
	
	public void setCurrentRecord(NNumber value) {
		super.setValue("CURRENT_RECORD", value);
	}
	


	public NNumber getNextRecord() {
		return toNumber(super.getValue("NEXT_RECORD"));
	}
	
	public void setNextRecord(NNumber value) {
		super.setValue("NEXT_RECORD", value);
	}
	


	public NString getOptInd() {
		return toStr(super.getValue("OPT_IND"));
	}
	
	public void setOptInd(NString value) {
		super.setValue("OPT_IND", value);
	}
	


	public NNumber getModulePidm() {
		return toNumber(super.getValue("MODULE_PIDM"));
	}
	
	public void setModulePidm(NNumber value) {
		super.setValue("MODULE_PIDM", value);
	}
	


	public NString getSaveAdmitTerm() {
		return toStr(super.getValue("SAVE_ADMIT_TERM"));
	}
	
	public void setSaveAdmitTerm(NString value) {
		super.setValue("SAVE_ADMIT_TERM", value);
	}
	


	public NString getSaveMatricTerm() {
		return toStr(super.getValue("SAVE_MATRIC_TERM"));
	}
	
	public void setSaveMatricTerm(NString value) {
		super.setValue("SAVE_MATRIC_TERM", value);
	}
	


	public NString getSaveAdmitCode() {
		return toStr(super.getValue("SAVE_ADMIT_CODE"));
	}
	
	public void setSaveAdmitCode(NString value) {
		super.setValue("SAVE_ADMIT_CODE", value);
	}
	


	public NString getSaveCatlgTerm() {
		return toStr(super.getValue("SAVE_CATLG_TERM"));
	}
	
	public void setSaveCatlgTerm(NString value) {
		super.setValue("SAVE_CATLG_TERM", value);
	}
	


	public NNumber getSavePriorityNo() {
		return toNumber(super.getValue("SAVE_PRIORITY_NO"));
	}
	
	public void setSavePriorityNo(NNumber value) {
		super.setValue("SAVE_PRIORITY_NO", value);
	}
	



}




