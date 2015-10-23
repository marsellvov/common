package net.hedtech.general.common.libraries.Soqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class SCurriculaTraditional extends SimpleBusinessObject
{
	public SCurriculaTraditional() {
		super();
	}

	public SCurriculaTraditional(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NInteger getLcurRecNum() {
		return toInt(super.getValue("LCUR_REC_NUM"));
	}
	
	public void setLcurRecNum(NInteger value) {
		super.setValue("LCUR_REC_NUM", value);
	}
	


	public NInteger getLfosRecNum() {
		return toInt(super.getValue("LFOS_REC_NUM"));
	}
	
	public void setLfosRecNum(NInteger value) {
		super.setValue("LFOS_REC_NUM", value);
	}
	


	public NInteger getLcurRecNumLfos() {
		return toInt(super.getValue("LCUR_REC_NUM_LFOS"));
	}
	
	public void setLcurRecNumLfos(NInteger value) {
		super.setValue("LCUR_REC_NUM_LFOS", value);
	}
	


	public NInteger getLcurRecCnt() {
		return toInt(super.getValue("LCUR_REC_CNT"));
	}
	
	public void setLcurRecCnt(NInteger value) {
		super.setValue("LCUR_REC_CNT", value);
	}
	


	public NInteger getLcurRecCntLfos() {
		return toInt(super.getValue("LCUR_REC_CNT_LFOS"));
	}
	
	public void setLcurRecCntLfos(NInteger value) {
		super.setValue("LCUR_REC_CNT_LFOS", value);
	}
	


	public NString getLcurPriorityDisplay() {
		return toStr(super.getValue("LCUR_PRIORITY_DISPLAY"));
	}
	
	public void setLcurPriorityDisplay(NString value) {
		super.setValue("LCUR_PRIORITY_DISPLAY", value);
	}
	


	public NString getLcurProgramDisplay() {
		return toStr(super.getValue("LCUR_PROGRAM_DISPLAY"));
	}
	
	public void setLcurProgramDisplay(NString value) {
		super.setValue("LCUR_PROGRAM_DISPLAY", value);
	}
	


	public NString getLcurLevelDisplay() {
		return toStr(super.getValue("LCUR_LEVEL_DISPLAY"));
	}
	
	public void setLcurLevelDisplay(NString value) {
		super.setValue("LCUR_LEVEL_DISPLAY", value);
	}
	


	public NString getLcurCollegeDisplay() {
		return toStr(super.getValue("LCUR_COLLEGE_DISPLAY"));
	}
	
	public void setLcurCollegeDisplay(NString value) {
		super.setValue("LCUR_COLLEGE_DISPLAY", value);
	}
	


	public NString getLcurCampusDisplay() {
		return toStr(super.getValue("LCUR_CAMPUS_DISPLAY"));
	}
	
	public void setLcurCampusDisplay(NString value) {
		super.setValue("LCUR_CAMPUS_DISPLAY", value);
	}
	


	public NString getLcurDegreeDisplay() {
		return toStr(super.getValue("LCUR_DEGREE_DISPLAY"));
	}
	
	public void setLcurDegreeDisplay(NString value) {
		super.setValue("LCUR_DEGREE_DISPLAY", value);
	}
	


	public NString getLcurCatlgDisplay() {
		return toStr(super.getValue("LCUR_CATLG_DISPLAY"));
	}
	
	public void setLcurCatlgDisplay(NString value) {
		super.setValue("LCUR_CATLG_DISPLAY", value);
	}
	


	public NString getLcurCurrentIndDisplay() {
		return toStr(super.getValue("LCUR_CURRENT_IND_DISPLAY"));
	}
	
	public void setLcurCurrentIndDisplay(NString value) {
		super.setValue("LCUR_CURRENT_IND_DISPLAY", value);
	}
	


	public NNumber getLcurSeqnoDisplay() {
		return toNumber(super.getValue("LCUR_SEQNO_DISPLAY"));
	}
	
	public void setLcurSeqnoDisplay(NNumber value) {
		super.setValue("LCUR_SEQNO_DISPLAY", value);
	}
	


	public NString getLcurCactCodeDisplay() {
		return toStr(super.getValue("LCUR_CACT_CODE_DISPLAY"));
	}
	
	public void setLcurCactCodeDisplay(NString value) {
		super.setValue("LCUR_CACT_CODE_DISPLAY", value);
	}
	


	public NNumber getLcurKeySeqnoDisplay() {
		return toNumber(super.getValue("LCUR_KEY_SEQNO_DISPLAY"));
	}
	
	public void setLcurKeySeqnoDisplay(NNumber value) {
		super.setValue("LCUR_KEY_SEQNO_DISPLAY", value);
	}
	


	public NString getLcurTermCodeDisplay() {
		return toStr(super.getValue("LCUR_TERM_CODE_DISPLAY"));
	}
	
	public void setLcurTermCodeDisplay(NString value) {
		super.setValue("LCUR_TERM_CODE_DISPLAY", value);
	}
	


	public NString getLcurTermCodeEndDisplay() {
		return toStr(super.getValue("LCUR_TERM_CODE_END_DISPLAY"));
	}
	
	public void setLcurTermCodeEndDisplay(NString value) {
		super.setValue("LCUR_TERM_CODE_END_DISPLAY", value);
	}
	


	public NString getLcurLmodCodeDisplay() {
		return toStr(super.getValue("LCUR_LMOD_CODE_DISPLAY"));
	}
	
	public void setLcurLmodCodeDisplay(NString value) {
		super.setValue("LCUR_LMOD_CODE_DISPLAY", value);
	}
	


	public NString getDataSeparatorLine1() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_1"));
	}
	
	public void setDataSeparatorLine1(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_1", value);
	}
	


	public NString getDataSeparatorLine2() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_2"));
	}
	
	public void setDataSeparatorLine2(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_2", value);
	}
	


	public NString getDataSeparatorLine2a() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_2A"));
	}
	
	public void setDataSeparatorLine2a(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_2A", value);
	}
	


	public NString getPromptLcurCommit() {
		return toStr(super.getValue("PROMPT_LCUR_COMMIT"));
	}
	
	public void setPromptLcurCommit(NString value) {
		super.setValue("PROMPT_LCUR_COMMIT", value);
	}
	


	public NString getLcurDeleteError() {
		return toStr(super.getValue("LCUR_DELETE_ERROR"));
	}
	
	public void setLcurDeleteError(NString value) {
		super.setValue("LCUR_DELETE_ERROR", value);
	}
	


	public NString getActiveRegInd() {
		return toStr(super.getValue("ACTIVE_REG_IND"));
	}
	
	public void setActiveRegInd(NString value) {
		super.setValue("ACTIVE_REG_IND", value);
	}
	



}




