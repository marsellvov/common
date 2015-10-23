package net.hedtech.general.common.libraries.Soqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class SCurriculumFields extends SimpleBusinessObject
{
	public SCurriculumFields() {
		super();
	}

	public SCurriculumFields(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getCurrOptionTitle1() {
		return toStr(super.getValue("CURR_OPTION_TITLE1"));
	}
	
	public void setCurrOptionTitle1(NString value) {
		super.setValue("CURR_OPTION_TITLE1", value);
	}
	


	public NString getCurrOptionTitle2() {
		return toStr(super.getValue("CURR_OPTION_TITLE2"));
	}
	
	public void setCurrOptionTitle2(NString value) {
		super.setValue("CURR_OPTION_TITLE2", value);
	}
	


	public NString getCurrOptionKey1() {
		return toStr(super.getValue("CURR_OPTION_KEY1"));
	}
	
	public void setCurrOptionKey1(NString value) {
		super.setValue("CURR_OPTION_KEY1", value);
	}
	


	public NString getCurrOptionKey2() {
		return toStr(super.getValue("CURR_OPTION_KEY2"));
	}
	
	public void setCurrOptionKey2(NString value) {
		super.setValue("CURR_OPTION_KEY2", value);
	}
	


	public NString getCurrDeptDesc() {
		return toStr(super.getValue("CURR_DEPT_DESC"));
	}
	
	public void setCurrDeptDesc(NString value) {
		super.setValue("CURR_DEPT_DESC", value);
	}
	


	public NString getCurrMajrDesc() {
		return toStr(super.getValue("CURR_MAJR_DESC"));
	}
	
	public void setCurrMajrDesc(NString value) {
		super.setValue("CURR_MAJR_DESC", value);
	}
	


	public NString getCurrPidm() {
		return toStr(super.getValue("CURR_PIDM"));
	}
	
	public void setCurrPidm(NString value) {
		super.setValue("CURR_PIDM", value);
	}
	


	public NString getCurrProgramProcess() {
		return toStr(super.getValue("CURR_PROGRAM_PROCESS"));
	}
	
	public void setCurrProgramProcess(NString value) {
		super.setValue("CURR_PROGRAM_PROCESS", value);
	}
	


	public NString getCurrLov() {
		return toStr(super.getValue("CURR_LOV"));
	}
	
	public void setCurrLov(NString value) {
		super.setValue("CURR_LOV", value);
	}
	


	public NString getCurrSaveLov() {
		return toStr(super.getValue("CURR_SAVE_LOV"));
	}
	
	public void setCurrSaveLov(NString value) {
		super.setValue("CURR_SAVE_LOV", value);
	}
	


	public NString getCurrProcess() {
		return toStr(super.getValue("CURR_PROCESS"));
	}
	
	public void setCurrProcess(NString value) {
		super.setValue("CURR_PROCESS", value);
	}
	


	public NString getCurrBaseCheck() {
		return toStr(super.getValue("CURR_BASE_CHECK"));
	}
	
	public void setCurrBaseCheck(NString value) {
		super.setValue("CURR_BASE_CHECK", value);
	}
	


	public NString getCurrUpdBaseField() {
		return toStr(super.getValue("CURR_UPD_BASE_FIELD"));
	}
	
	public void setCurrUpdBaseField(NString value) {
		super.setValue("CURR_UPD_BASE_FIELD", value);
	}
	


	public NString getCurrUpdBaseField2() {
		return toStr(super.getValue("CURR_UPD_BASE_FIELD_2"));
	}
	
	public void setCurrUpdBaseField2(NString value) {
		super.setValue("CURR_UPD_BASE_FIELD_2", value);
	}
	


	public NString getCurrUpdMajrField() {
		return toStr(super.getValue("CURR_UPD_MAJR_FIELD"));
	}
	
	public void setCurrUpdMajrField(NString value) {
		super.setValue("CURR_UPD_MAJR_FIELD", value);
	}
	


	public NString getCurrUpdMajrField2() {
		return toStr(super.getValue("CURR_UPD_MAJR_FIELD_2"));
	}
	
	public void setCurrUpdMajrField2(NString value) {
		super.setValue("CURR_UPD_MAJR_FIELD_2", value);
	}
	


	public NString getCurrTermField() {
		return toStr(super.getValue("CURR_TERM_FIELD"));
	}
	
	public void setCurrTermField(NString value) {
		super.setValue("CURR_TERM_FIELD", value);
	}
	


	public NString getCurrTermCatlg1Field() {
		return toStr(super.getValue("CURR_TERM_CATLG_1_FIELD"));
	}
	
	public void setCurrTermCatlg1Field(NString value) {
		super.setValue("CURR_TERM_CATLG_1_FIELD", value);
	}
	


	public NString getCurrTermCatlgField() {
		return toStr(super.getValue("CURR_TERM_CATLG_FIELD"));
	}
	
	public void setCurrTermCatlgField(NString value) {
		super.setValue("CURR_TERM_CATLG_FIELD", value);
	}
	


	public NString getCurrLevlDesc() {
		return toStr(super.getValue("CURR_LEVL_DESC"));
	}
	
	public void setCurrLevlDesc(NString value) {
		super.setValue("CURR_LEVL_DESC", value);
	}
	


	public NString getCurrLevl2Desc() {
		return toStr(super.getValue("CURR_LEVL_2_DESC"));
	}
	
	public void setCurrLevl2Desc(NString value) {
		super.setValue("CURR_LEVL_2_DESC", value);
	}
	


	public NString getCurrDegcDesc() {
		return toStr(super.getValue("CURR_DEGC_DESC"));
	}
	
	public void setCurrDegcDesc(NString value) {
		super.setValue("CURR_DEGC_DESC", value);
	}
	


	public NString getCurrDegc2Desc() {
		return toStr(super.getValue("CURR_DEGC_2_DESC"));
	}
	
	public void setCurrDegc2Desc(NString value) {
		super.setValue("CURR_DEGC_2_DESC", value);
	}
	


	public NString getCurrCampDesc() {
		return toStr(super.getValue("CURR_CAMP_DESC"));
	}
	
	public void setCurrCampDesc(NString value) {
		super.setValue("CURR_CAMP_DESC", value);
	}
	


	public NString getCurrCamp2Desc() {
		return toStr(super.getValue("CURR_CAMP_2_DESC"));
	}
	
	public void setCurrCamp2Desc(NString value) {
		super.setValue("CURR_CAMP_2_DESC", value);
	}
	


	public NString getCurrCollDesc() {
		return toStr(super.getValue("CURR_COLL_DESC"));
	}
	
	public void setCurrCollDesc(NString value) {
		super.setValue("CURR_COLL_DESC", value);
	}
	


	public NString getCurrColl2Desc() {
		return toStr(super.getValue("CURR_COLL_2_DESC"));
	}
	
	public void setCurrColl2Desc(NString value) {
		super.setValue("CURR_COLL_2_DESC", value);
	}
	


	public NString getCurrLevl1Field() {
		return toStr(super.getValue("CURR_LEVL_1_FIELD"));
	}
	
	public void setCurrLevl1Field(NString value) {
		super.setValue("CURR_LEVL_1_FIELD", value);
	}
	


	public NString getCurrCamp1Field() {
		return toStr(super.getValue("CURR_CAMP_1_FIELD"));
	}
	
	public void setCurrCamp1Field(NString value) {
		super.setValue("CURR_CAMP_1_FIELD", value);
	}
	


	public NString getCurrDegc1Field() {
		return toStr(super.getValue("CURR_DEGC_1_FIELD"));
	}
	
	public void setCurrDegc1Field(NString value) {
		super.setValue("CURR_DEGC_1_FIELD", value);
	}
	


	public NString getCurrColl1Field() {
		return toStr(super.getValue("CURR_COLL_1_FIELD"));
	}
	
	public void setCurrColl1Field(NString value) {
		super.setValue("CURR_COLL_1_FIELD", value);
	}
	


	public NString getCurrProgram1Field() {
		return toStr(super.getValue("CURR_PROGRAM_1_FIELD"));
	}
	
	public void setCurrProgram1Field(NString value) {
		super.setValue("CURR_PROGRAM_1_FIELD", value);
	}
	


	public NString getCurrMajr1Field() {
		return toStr(super.getValue("CURR_MAJR_1_FIELD"));
	}
	
	public void setCurrMajr1Field(NString value) {
		super.setValue("CURR_MAJR_1_FIELD", value);
	}
	


	public NString getCurrDept1Field() {
		return toStr(super.getValue("CURR_DEPT_1_FIELD"));
	}
	
	public void setCurrDept1Field(NString value) {
		super.setValue("CURR_DEPT_1_FIELD", value);
	}
	


	public NString getCurrConc11Field() {
		return toStr(super.getValue("CURR_CONC_1_1_FIELD"));
	}
	
	public void setCurrConc11Field(NString value) {
		super.setValue("CURR_CONC_1_1_FIELD", value);
	}
	


	public NString getCurrConc12Field() {
		return toStr(super.getValue("CURR_CONC_1_2_FIELD"));
	}
	
	public void setCurrConc12Field(NString value) {
		super.setValue("CURR_CONC_1_2_FIELD", value);
	}
	


	public NString getCurrConc13Field() {
		return toStr(super.getValue("CURR_CONC_1_3_FIELD"));
	}
	
	public void setCurrConc13Field(NString value) {
		super.setValue("CURR_CONC_1_3_FIELD", value);
	}
	


	public NString getCurrMajr12Field() {
		return toStr(super.getValue("CURR_MAJR_1_2_FIELD"));
	}
	
	public void setCurrMajr12Field(NString value) {
		super.setValue("CURR_MAJR_1_2_FIELD", value);
	}
	


	public NString getCurrDept12Field() {
		return toStr(super.getValue("CURR_DEPT_1_2_FIELD"));
	}
	
	public void setCurrDept12Field(NString value) {
		super.setValue("CURR_DEPT_1_2_FIELD", value);
	}
	


	public NString getCurrConc121Field() {
		return toStr(super.getValue("CURR_CONC_121_FIELD"));
	}
	
	public void setCurrConc121Field(NString value) {
		super.setValue("CURR_CONC_121_FIELD", value);
	}
	


	public NString getCurrConc122Field() {
		return toStr(super.getValue("CURR_CONC_122_FIELD"));
	}
	
	public void setCurrConc122Field(NString value) {
		super.setValue("CURR_CONC_122_FIELD", value);
	}
	


	public NString getCurrConc123Field() {
		return toStr(super.getValue("CURR_CONC_123_FIELD"));
	}
	
	public void setCurrConc123Field(NString value) {
		super.setValue("CURR_CONC_123_FIELD", value);
	}
	


	public NString getCurrMinr11Field() {
		return toStr(super.getValue("CURR_MINR_1_1_FIELD"));
	}
	
	public void setCurrMinr11Field(NString value) {
		super.setValue("CURR_MINR_1_1_FIELD", value);
	}
	


	public NString getCurrMinr12Field() {
		return toStr(super.getValue("CURR_MINR_1_2_FIELD"));
	}
	
	public void setCurrMinr12Field(NString value) {
		super.setValue("CURR_MINR_1_2_FIELD", value);
	}
	


	public NString getCurrTermCatlg2Field() {
		return toStr(super.getValue("CURR_TERM_CATLG_2_FIELD"));
	}
	
	public void setCurrTermCatlg2Field(NString value) {
		super.setValue("CURR_TERM_CATLG_2_FIELD", value);
	}
	


	public NString getCurrLevl2Field() {
		return toStr(super.getValue("CURR_LEVL_2_FIELD"));
	}
	
	public void setCurrLevl2Field(NString value) {
		super.setValue("CURR_LEVL_2_FIELD", value);
	}
	


	public NString getCurrCamp2Field() {
		return toStr(super.getValue("CURR_CAMP_2_FIELD"));
	}
	
	public void setCurrCamp2Field(NString value) {
		super.setValue("CURR_CAMP_2_FIELD", value);
	}
	


	public NString getCurrColl2Field() {
		return toStr(super.getValue("CURR_COLL_2_FIELD"));
	}
	
	public void setCurrColl2Field(NString value) {
		super.setValue("CURR_COLL_2_FIELD", value);
	}
	


	public NString getCurrDegc2Field() {
		return toStr(super.getValue("CURR_DEGC_2_FIELD"));
	}
	
	public void setCurrDegc2Field(NString value) {
		super.setValue("CURR_DEGC_2_FIELD", value);
	}
	


	public NString getCurrProgram2Field() {
		return toStr(super.getValue("CURR_PROGRAM_2_FIELD"));
	}
	
	public void setCurrProgram2Field(NString value) {
		super.setValue("CURR_PROGRAM_2_FIELD", value);
	}
	


	public NString getCurrMajr2Field() {
		return toStr(super.getValue("CURR_MAJR_2_FIELD"));
	}
	
	public void setCurrMajr2Field(NString value) {
		super.setValue("CURR_MAJR_2_FIELD", value);
	}
	


	public NString getCurrDept2Field() {
		return toStr(super.getValue("CURR_DEPT_2_FIELD"));
	}
	
	public void setCurrDept2Field(NString value) {
		super.setValue("CURR_DEPT_2_FIELD", value);
	}
	


	public NString getCurrConc21Field() {
		return toStr(super.getValue("CURR_CONC_2_1_FIELD"));
	}
	
	public void setCurrConc21Field(NString value) {
		super.setValue("CURR_CONC_2_1_FIELD", value);
	}
	


	public NString getCurrConc22Field() {
		return toStr(super.getValue("CURR_CONC_2_2_FIELD"));
	}
	
	public void setCurrConc22Field(NString value) {
		super.setValue("CURR_CONC_2_2_FIELD", value);
	}
	


	public NString getCurrConc23Field() {
		return toStr(super.getValue("CURR_CONC_2_3_FIELD"));
	}
	
	public void setCurrConc23Field(NString value) {
		super.setValue("CURR_CONC_2_3_FIELD", value);
	}
	


	public NString getCurrMajr22Field() {
		return toStr(super.getValue("CURR_MAJR_2_2_FIELD"));
	}
	
	public void setCurrMajr22Field(NString value) {
		super.setValue("CURR_MAJR_2_2_FIELD", value);
	}
	


	public NString getCurrDept22Field() {
		return toStr(super.getValue("CURR_DEPT_2_2_FIELD"));
	}
	
	public void setCurrDept22Field(NString value) {
		super.setValue("CURR_DEPT_2_2_FIELD", value);
	}
	


	public NString getCurrConc221Field() {
		return toStr(super.getValue("CURR_CONC_221_FIELD"));
	}
	
	public void setCurrConc221Field(NString value) {
		super.setValue("CURR_CONC_221_FIELD", value);
	}
	


	public NString getCurrConc222Field() {
		return toStr(super.getValue("CURR_CONC_222_FIELD"));
	}
	
	public void setCurrConc222Field(NString value) {
		super.setValue("CURR_CONC_222_FIELD", value);
	}
	


	public NString getCurrConc223Field() {
		return toStr(super.getValue("CURR_CONC_223_FIELD"));
	}
	
	public void setCurrConc223Field(NString value) {
		super.setValue("CURR_CONC_223_FIELD", value);
	}
	


	public NString getCurrMinr21Field() {
		return toStr(super.getValue("CURR_MINR_2_1_FIELD"));
	}
	
	public void setCurrMinr21Field(NString value) {
		super.setValue("CURR_MINR_2_1_FIELD", value);
	}
	


	public NString getCurrMinr22Field() {
		return toStr(super.getValue("CURR_MINR_2_2_FIELD"));
	}
	
	public void setCurrMinr22Field(NString value) {
		super.setValue("CURR_MINR_2_2_FIELD", value);
	}
	


	public NString getCurrConcField() {
		return toStr(super.getValue("CURR_CONC_FIELD"));
	}
	
	public void setCurrConcField(NString value) {
		super.setValue("CURR_CONC_FIELD", value);
	}
	


	public NString getCurrProgramField() {
		return toStr(super.getValue("CURR_PROGRAM_FIELD"));
	}
	
	public void setCurrProgramField(NString value) {
		super.setValue("CURR_PROGRAM_FIELD", value);
	}
	


	public NString getCurrDeptField() {
		return toStr(super.getValue("CURR_DEPT_FIELD"));
	}
	
	public void setCurrDeptField(NString value) {
		super.setValue("CURR_DEPT_FIELD", value);
	}
	


	public NString getCurrDeptField2() {
		return toStr(super.getValue("CURR_DEPT_FIELD_2"));
	}
	
	public void setCurrDeptField2(NString value) {
		super.setValue("CURR_DEPT_FIELD_2", value);
	}
	


	public NString getCurrMajrField() {
		return toStr(super.getValue("CURR_MAJR_FIELD"));
	}
	
	public void setCurrMajrField(NString value) {
		super.setValue("CURR_MAJR_FIELD", value);
	}
	


	public NString getCurrMinrField() {
		return toStr(super.getValue("CURR_MINR_FIELD"));
	}
	
	public void setCurrMinrField(NString value) {
		super.setValue("CURR_MINR_FIELD", value);
	}
	


	public NString getCurrMajrField2() {
		return toStr(super.getValue("CURR_MAJR_FIELD_2"));
	}
	
	public void setCurrMajrField2(NString value) {
		super.setValue("CURR_MAJR_FIELD_2", value);
	}
	


	public NString getCurrRuleField() {
		return toStr(super.getValue("CURR_RULE_FIELD"));
	}
	
	public void setCurrRuleField(NString value) {
		super.setValue("CURR_RULE_FIELD", value);
	}
	


	public NString getCurrRule1Field() {
		return toStr(super.getValue("CURR_RULE_1_FIELD"));
	}
	
	public void setCurrRule1Field(NString value) {
		super.setValue("CURR_RULE_1_FIELD", value);
	}
	


	public NString getCurrRule2Field() {
		return toStr(super.getValue("CURR_RULE_2_FIELD"));
	}
	
	public void setCurrRule2Field(NString value) {
		super.setValue("CURR_RULE_2_FIELD", value);
	}
	


	public NString getCurrCmjrRuleField() {
		return toStr(super.getValue("CURR_CMJR_RULE_FIELD"));
	}
	
	public void setCurrCmjrRuleField(NString value) {
		super.setValue("CURR_CMJR_RULE_FIELD", value);
	}
	


	public NString getCurrCmjrRuleField2() {
		return toStr(super.getValue("CURR_CMJR_RULE_FIELD_2"));
	}
	
	public void setCurrCmjrRuleField2(NString value) {
		super.setValue("CURR_CMJR_RULE_FIELD_2", value);
	}
	


	public NString getCurrCmjrRule11Field() {
		return toStr(super.getValue("CURR_CMJR_RULE_1_1_FIELD"));
	}
	
	public void setCurrCmjrRule11Field(NString value) {
		super.setValue("CURR_CMJR_RULE_1_1_FIELD", value);
	}
	


	public NString getCurrCmjrRule21Field() {
		return toStr(super.getValue("CURR_CMJR_RULE_2_1_FIELD"));
	}
	
	public void setCurrCmjrRule21Field(NString value) {
		super.setValue("CURR_CMJR_RULE_2_1_FIELD", value);
	}
	


	public NString getCurrCmnrRuleField() {
		return toStr(super.getValue("CURR_CMNR_RULE_FIELD"));
	}
	
	public void setCurrCmnrRuleField(NString value) {
		super.setValue("CURR_CMNR_RULE_FIELD", value);
	}
	


	public NString getCurrCconRuleField() {
		return toStr(super.getValue("CURR_CCON_RULE_FIELD"));
	}
	
	public void setCurrCconRuleField(NString value) {
		super.setValue("CURR_CCON_RULE_FIELD", value);
	}
	



}




