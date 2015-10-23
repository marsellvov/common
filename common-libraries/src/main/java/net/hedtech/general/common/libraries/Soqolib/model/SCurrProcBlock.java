package net.hedtech.general.common.libraries.Soqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class SCurrProcBlock extends SimpleBusinessObject
{
	public SCurrProcBlock() {
		super();
	}

	public SCurrProcBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
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
	


	public NString getHoldDeptAttach() {
		return toStr(super.getValue("HOLD_DEPT_ATTACH"));
	}
	
	public void setHoldDeptAttach(NString value) {
		super.setValue("HOLD_DEPT_ATTACH", value);
	}
	


	public NNumber getConcAttachNum() {
		return toNumber(super.getValue("CONC_ATTACH_NUM"));
	}
	
	public void setConcAttachNum(NNumber value) {
		super.setValue("CONC_ATTACH_NUM", value);
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
	


	public NString getModuleInd() {
		return toStr(super.getValue("MODULE_IND"));
	}
	
	public void setModuleInd(NString value) {
		super.setValue("MODULE_IND", value);
	}
	


	public NString getHoldEffTerm() {
		return toStr(super.getValue("HOLD_EFF_TERM"));
	}
	
	public void setHoldEffTerm(NString value) {
		super.setValue("HOLD_EFF_TERM", value);
	}
	


	public NNumber getHoldMajrRule() {
		return toNumber(super.getValue("HOLD_MAJR_RULE"));
	}
	
	public void setHoldMajrRule(NNumber value) {
		super.setValue("HOLD_MAJR_RULE", value);
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
	


	public NNumber getHoldMinrRule() {
		return toNumber(super.getValue("HOLD_MINR_RULE"));
	}
	
	public void setHoldMinrRule(NNumber value) {
		super.setValue("HOLD_MINR_RULE", value);
	}
	


	public NNumber getHoldConcRule() {
		return toNumber(super.getValue("HOLD_CONC_RULE"));
	}
	
	public void setHoldConcRule(NNumber value) {
		super.setValue("HOLD_CONC_RULE", value);
	}
	


	public NString getHoldProgmajrLov() {
		return toStr(super.getValue("HOLD_PROGMAJR_LOV"));
	}
	
	public void setHoldProgmajrLov(NString value) {
		super.setValue("HOLD_PROGMAJR_LOV", value);
	}
	


	public NString getHoldCresLov() {
		return toStr(super.getValue("HOLD_CRES_LOV"));
	}
	
	public void setHoldCresLov(NString value) {
		super.setValue("HOLD_CRES_LOV", value);
	}
	


	public NString getHoldAttachLov() {
		return toStr(super.getValue("HOLD_ATTACH_LOV"));
	}
	
	public void setHoldAttachLov(NString value) {
		super.setValue("HOLD_ATTACH_LOV", value);
	}
	


	public NString getHoldItemLov() {
		return toStr(super.getValue("HOLD_ITEM_LOV"));
	}
	
	public void setHoldItemLov(NString value) {
		super.setValue("HOLD_ITEM_LOV", value);
	}
	


	public NNumber getFndLit() {
		return toNumber(super.getValue("FND_LIT"));
	}
	
	public void setFndLit(NNumber value) {
		super.setValue("FND_LIT", value);
	}
	


	public NString getHelpItemType() {
		return toStr(super.getValue("HELP_ITEM_TYPE"));
	}
	
	public void setHelpItemType(NString value) {
		super.setValue("HELP_ITEM_TYPE", value);
	}
	


	public NString getHoldHelpItem() {
		return toStr(super.getValue("HOLD_HELP_ITEM"));
	}
	
	public void setHoldHelpItem(NString value) {
		super.setValue("HOLD_HELP_ITEM", value);
	}
	


	public NString getHelpBaseKey() {
		return toStr(super.getValue("HELP_BASE_KEY"));
	}
	
	public void setHelpBaseKey(NString value) {
		super.setValue("HELP_BASE_KEY", value);
	}
	


	public NString getCconAttachInd() {
		return toStr(super.getValue("CCON_ATTACH_IND"));
	}
	
	public void setCconAttachInd(NString value) {
		super.setValue("CCON_ATTACH_IND", value);
	}
	


	public NString getCcngCampCode() {
		return toStr(super.getValue("CCNG_CAMP_CODE"));
	}
	
	public void setCcngCampCode(NString value) {
		super.setValue("CCNG_CAMP_CODE", value);
	}
	


	public NString getCcngCollCode() {
		return toStr(super.getValue("CCNG_COLL_CODE"));
	}
	
	public void setCcngCollCode(NString value) {
		super.setValue("CCNG_COLL_CODE", value);
	}
	


	public NString getCcngDegcCode() {
		return toStr(super.getValue("CCNG_DEGC_CODE"));
	}
	
	public void setCcngDegcCode(NString value) {
		super.setValue("CCNG_DEGC_CODE", value);
	}
	


	public NString getCcngLevlCode() {
		return toStr(super.getValue("CCNG_LEVL_CODE"));
	}
	
	public void setCcngLevlCode(NString value) {
		super.setValue("CCNG_LEVL_CODE", value);
	}
	


	public NString getCcngProgram() {
		return toStr(super.getValue("CCNG_PROGRAM"));
	}
	
	public void setCcngProgram(NString value) {
		super.setValue("CCNG_PROGRAM", value);
	}
	


	public NString getMajorInd() {
		return toStr(super.getValue("MAJOR_IND"));
	}
	
	public void setMajorInd(NString value) {
		super.setValue("MAJOR_IND", value);
	}
	


	public NString getCurrUpdBase() {
		return toStr(super.getValue("CURR_UPD_BASE"));
	}
	
	public void setCurrUpdBase(NString value) {
		super.setValue("CURR_UPD_BASE", value);
	}
	


	public NString getCurrCtlgTerm() {
		return toStr(super.getValue("CURR_CTLG_TERM"));
	}
	
	public void setCurrCtlgTerm(NString value) {
		super.setValue("CURR_CTLG_TERM", value);
	}
	


	public NString getCurrEffTerm() {
		return toStr(super.getValue("CURR_EFF_TERM"));
	}
	
	public void setCurrEffTerm(NString value) {
		super.setValue("CURR_EFF_TERM", value);
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
	


	public NString getCurrCollCode() {
		return toStr(super.getValue("CURR_COLL_CODE"));
	}
	
	public void setCurrCollCode(NString value) {
		super.setValue("CURR_COLL_CODE", value);
	}
	


	public NString getCurrDegcCode() {
		return toStr(super.getValue("CURR_DEGC_CODE"));
	}
	
	public void setCurrDegcCode(NString value) {
		super.setValue("CURR_DEGC_CODE", value);
	}
	


	public NString getCurrMajrCode() {
		return toStr(super.getValue("CURR_MAJR_CODE"));
	}
	
	public void setCurrMajrCode(NString value) {
		super.setValue("CURR_MAJR_CODE", value);
	}
	


	public NString getTempRuleInd() {
		return toStr(super.getValue("TEMP_RULE_IND"));
	}
	
	public void setTempRuleInd(NString value) {
		super.setValue("TEMP_RULE_IND", value);
	}
	


	public NString getTempRule2Ind() {
		return toStr(super.getValue("TEMP_RULE_2_IND"));
	}
	
	public void setTempRule2Ind(NString value) {
		super.setValue("TEMP_RULE_2_IND", value);
	}
	



}




