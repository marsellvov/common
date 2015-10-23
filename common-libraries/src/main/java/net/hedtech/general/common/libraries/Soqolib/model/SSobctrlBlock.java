package net.hedtech.general.common.libraries.Soqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class SSobctrlBlock extends SimpleBusinessObject
{
	public SSobctrlBlock() {
		super();
	}

	public SSobctrlBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getTablemodule() {
		return toStr(super.getValue("TABLEMODULE"));
	}
	
	public void setTablemodule(NString value) {
		super.setValue("TABLEMODULE", value);
	}
	


	public NString getHoldDegree() {
		return toStr(super.getValue("HOLD_DEGREE"));
	}
	
	public void setHoldDegree(NString value) {
		super.setValue("HOLD_DEGREE", value);
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
	


	public NString getCai() {
		return toStr(super.getValue("CAI"));
	}
	
	public void setCai(NString value) {
		super.setValue("CAI", value);
	}
	


	public NString getSobctrlCurrRuleInd() {
		return toStr(super.getValue("SOBCTRL_CURR_RULE_IND"));
	}
	
	public void setSobctrlCurrRuleInd(NString value) {
		super.setValue("SOBCTRL_CURR_RULE_IND", value);
	}
	


	public NString getHoldCurrRuleInd() {
		return toStr(super.getValue("HOLD_CURR_RULE_IND"));
	}
	
	public void setHoldCurrRuleInd(NString value) {
		super.setValue("HOLD_CURR_RULE_IND", value);
	}
	


	public NString getSecdMajrError() {
		return toStr(super.getValue("SECD_MAJR_ERROR"));
	}
	
	public void setSecdMajrError(NString value) {
		super.setValue("SECD_MAJR_ERROR", value);
	}
	


	public NString getReturnErrorItem() {
		return toStr(super.getValue("RETURN_ERROR_ITEM"));
	}
	
	public void setReturnErrorItem(NString value) {
		super.setValue("RETURN_ERROR_ITEM", value);
	}
	


	public NString getConc1AttachInd() {
		return toStr(super.getValue("CONC1_ATTACH_IND"));
	}
	
	public void setConc1AttachInd(NString value) {
		super.setValue("CONC1_ATTACH_IND", value);
	}
	


	public NString getConc2AttachInd() {
		return toStr(super.getValue("CONC2_ATTACH_IND"));
	}
	
	public void setConc2AttachInd(NString value) {
		super.setValue("CONC2_ATTACH_IND", value);
	}
	


	public NString getCconmajrAttachInd() {
		return toStr(super.getValue("CCONMAJR_ATTACH_IND"));
	}
	
	public void setCconmajrAttachInd(NString value) {
		super.setValue("CCONMAJR_ATTACH_IND", value);
	}
	


	public NString getCconbase1AttachInd() {
		return toStr(super.getValue("CCONBASE1_ATTACH_IND"));
	}
	
	public void setCconbase1AttachInd(NString value) {
		super.setValue("CCONBASE1_ATTACH_IND", value);
	}
	


	public NString getCconbase2AttachInd() {
		return toStr(super.getValue("CCONBASE2_ATTACH_IND"));
	}
	
	public void setCconbase2AttachInd(NString value) {
		super.setValue("CCONBASE2_ATTACH_IND", value);
	}
	


	public NString getCconmajr2AttachInd() {
		return toStr(super.getValue("CCONMAJR2_ATTACH_IND"));
	}
	
	public void setCconmajr2AttachInd(NString value) {
		super.setValue("CCONMAJR2_ATTACH_IND", value);
	}
	


	public NString getSobctrlProgramInd() {
		return toStr(super.getValue("SOBCTRL_PROGRAM_IND"));
	}
	
	public void setSobctrlProgramInd(NString value) {
		super.setValue("SOBCTRL_PROGRAM_IND", value);
	}
	


	public NString getSobctrlConcInd() {
		return toStr(super.getValue("SOBCTRL_CONC_IND"));
	}
	
	public void setSobctrlConcInd(NString value) {
		super.setValue("SOBCTRL_CONC_IND", value);
	}
	


	public NString getSobctrlPrimRollInd() {
		return toStr(super.getValue("SOBCTRL_PRIM_ROLL_IND"));
	}
	
	public void setSobctrlPrimRollInd(NString value) {
		super.setValue("SOBCTRL_PRIM_ROLL_IND", value);
	}
	


	public NString getSobctrlSecdRollInd() {
		return toStr(super.getValue("SOBCTRL_SECD_ROLL_IND"));
	}
	
	public void setSobctrlSecdRollInd(NString value) {
		super.setValue("SOBCTRL_SECD_ROLL_IND", value);
	}
	


	public NString getSobctrlRecErrlvlInd() {
		return toStr(super.getValue("SOBCTRL_REC_ERRLVL_IND"));
	}
	
	public void setSobctrlRecErrlvlInd(NString value) {
		super.setValue("SOBCTRL_REC_ERRLVL_IND", value);
	}
	


	public NString getSobctrlAdmErrlvlInd() {
		return toStr(super.getValue("SOBCTRL_ADM_ERRLVL_IND"));
	}
	
	public void setSobctrlAdmErrlvlInd(NString value) {
		super.setValue("SOBCTRL_ADM_ERRLVL_IND", value);
	}
	


	public NString getSobctrlStuErrlvlInd() {
		return toStr(super.getValue("SOBCTRL_STU_ERRLVL_IND"));
	}
	
	public void setSobctrlStuErrlvlInd(NString value) {
		super.setValue("SOBCTRL_STU_ERRLVL_IND", value);
	}
	


	public NString getSobctrlHisErrlvlInd() {
		return toStr(super.getValue("SOBCTRL_HIS_ERRLVL_IND"));
	}
	
	public void setSobctrlHisErrlvlInd(NString value) {
		super.setValue("SOBCTRL_HIS_ERRLVL_IND", value);
	}
	


	public NString getSobctrlDauErrlvlInd() {
		return toStr(super.getValue("SOBCTRL_DAU_ERRLVL_IND"));
	}
	
	public void setSobctrlDauErrlvlInd(NString value) {
		super.setValue("SOBCTRL_DAU_ERRLVL_IND", value);
	}
	


	public NString getHoldPrimRollInd() {
		return toStr(super.getValue("HOLD_PRIM_ROLL_IND"));
	}
	
	public void setHoldPrimRollInd(NString value) {
		super.setValue("HOLD_PRIM_ROLL_IND", value);
	}
	


	public NString getHoldSecdRollInd() {
		return toStr(super.getValue("HOLD_SECD_ROLL_IND"));
	}
	
	public void setHoldSecdRollInd(NString value) {
		super.setValue("HOLD_SECD_ROLL_IND", value);
	}
	


	public NString getCurrChangeInd() {
		return toStr(super.getValue("CURR_CHANGE_IND"));
	}
	
	public void setCurrChangeInd(NString value) {
		super.setValue("CURR_CHANGE_IND", value);
	}
	


	public NString getCurrInd() {
		return toStr(super.getValue("CURR_IND"));
	}
	
	public void setCurrInd(NString value) {
		super.setValue("CURR_IND", value);
	}
	


	public NString getCurrErrorInd() {
		return toStr(super.getValue("CURR_ERROR_IND"));
	}
	
	public void setCurrErrorInd(NString value) {
		super.setValue("CURR_ERROR_IND", value);
	}
	


	public NString getConc11AttachInd() {
		return toStr(super.getValue("CONC11_ATTACH_IND"));
	}
	
	public void setConc11AttachInd(NString value) {
		super.setValue("CONC11_ATTACH_IND", value);
	}
	


	public NString getCcon1AttachInd() {
		return toStr(super.getValue("CCON1_ATTACH_IND"));
	}
	
	public void setCcon1AttachInd(NString value) {
		super.setValue("CCON1_ATTACH_IND", value);
	}
	


	public NString getCcon2AttachInd() {
		return toStr(super.getValue("CCON2_ATTACH_IND"));
	}
	
	public void setCcon2AttachInd(NString value) {
		super.setValue("CCON2_ATTACH_IND", value);
	}
	


	public NString getConc12AttachInd() {
		return toStr(super.getValue("CONC12_ATTACH_IND"));
	}
	
	public void setConc12AttachInd(NString value) {
		super.setValue("CONC12_ATTACH_IND", value);
	}
	


	public NString getConc21AttachInd() {
		return toStr(super.getValue("CONC21_ATTACH_IND"));
	}
	
	public void setConc21AttachInd(NString value) {
		super.setValue("CONC21_ATTACH_IND", value);
	}
	


	public NString getConc22AttachInd() {
		return toStr(super.getValue("CONC22_ATTACH_IND"));
	}
	
	public void setConc22AttachInd(NString value) {
		super.setValue("CONC22_ATTACH_IND", value);
	}
	


	public NString getMinr1AttachInd() {
		return toStr(super.getValue("MINR1_ATTACH_IND"));
	}
	
	public void setMinr1AttachInd(NString value) {
		super.setValue("MINR1_ATTACH_IND", value);
	}
	


	public NString getMinr2AttachInd() {
		return toStr(super.getValue("MINR2_ATTACH_IND"));
	}
	
	public void setMinr2AttachInd(NString value) {
		super.setValue("MINR2_ATTACH_IND", value);
	}
	


	public NString getMajr1AttachInd() {
		return toStr(super.getValue("MAJR1_ATTACH_IND"));
	}
	
	public void setMajr1AttachInd(NString value) {
		super.setValue("MAJR1_ATTACH_IND", value);
	}
	


	public NString getMajr2AttachInd() {
		return toStr(super.getValue("MAJR2_ATTACH_IND"));
	}
	
	public void setMajr2AttachInd(NString value) {
		super.setValue("MAJR2_ATTACH_IND", value);
	}
	


	public NString getCurrInitTerm() {
		return toStr(super.getValue("CURR_INIT_TERM"));
	}
	
	public void setCurrInitTerm(NString value) {
		super.setValue("CURR_INIT_TERM", value);
	}
	


	public NString getCurrInitTerm2() {
		return toStr(super.getValue("CURR_INIT_TERM_2"));
	}
	
	public void setCurrInitTerm2(NString value) {
		super.setValue("CURR_INIT_TERM_2", value);
	}
	


	public NString getDept() {
		return toStr(super.getValue("DEPT"));
	}
	
	public void setDept(NString value) {
		super.setValue("DEPT", value);
	}
	


	public NString getMajor() {
		return toStr(super.getValue("MAJOR"));
	}
	
	public void setMajor(NString value) {
		super.setValue("MAJOR", value);
	}
	


	public NString getCheckBase2Ind() {
		return toStr(super.getValue("CHECK_BASE2_IND"));
	}
	
	public void setCheckBase2Ind(NString value) {
		super.setValue("CHECK_BASE2_IND", value);
	}
	



}




