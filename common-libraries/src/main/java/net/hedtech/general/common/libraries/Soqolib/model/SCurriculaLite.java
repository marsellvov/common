package net.hedtech.general.common.libraries.Soqolib.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class SCurriculaLite extends SimpleBusinessObject
{
	public SCurriculaLite() {
		super();
	}

	public SCurriculaLite(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getSorlcurLiteResdCode() {
		return toStr(super.getValue("SORLCUR_LITE_RESD_CODE"));
	}
	
	public void setSorlcurLiteResdCode(NString value) {
		super.setValue("SORLCUR_LITE_RESD_CODE", value);
	}
	


	public NString getSorlcurLiteStypCode() {
		return toStr(super.getValue("SORLCUR_LITE_STYP_CODE"));
	}
	
	public void setSorlcurLiteStypCode(NString value) {
		super.setValue("SORLCUR_LITE_STYP_CODE", value);
	}
	


	public NString getSorlcurLiteFullPartInd() {
		return toStr(super.getValue("SORLCUR_LITE_FULL_PART_IND"));
	}
	
	public void setSorlcurLiteFullPartInd(NString value) {
		super.setValue("SORLCUR_LITE_FULL_PART_IND", value);
	}
	


	public NString getSorlcurLiteRateCode() {
		return toStr(super.getValue("SORLCUR_LITE_RATE_CODE"));
	}
	
	public void setSorlcurLiteRateCode(NString value) {
		super.setValue("SORLCUR_LITE_RATE_CODE", value);
	}
	


	public NString getSorlcurLiteEgolCode() {
		return toStr(super.getValue("SORLCUR_LITE_EGOL_CODE"));
	}
	
	public void setSorlcurLiteEgolCode(NString value) {
		super.setValue("SORLCUR_LITE_EGOL_CODE", value);
	}
	


	public NString getSorlcurLiteEdlvCode() {
		return toStr(super.getValue("SORLCUR_LITE_EDLV_CODE"));
	}
	
	public void setSorlcurLiteEdlvCode(NString value) {
		super.setValue("SORLCUR_LITE_EDLV_CODE", value);
	}
	


	public NString getDefaultUsed() {
		return toStr(super.getValue("DEFAULT_USED"));
	}
	
	public void setDefaultUsed(NString value) {
		super.setValue("DEFAULT_USED", value);
	}
	


	public NInteger getLfosRecNum() {
		return toInt(super.getValue("LFOS_REC_NUM"));
	}
	
	public void setLfosRecNum(NInteger value) {
		super.setValue("LFOS_REC_NUM", value);
	}
	


	public NInteger getLcurRecNum() {
		return toInt(super.getValue("LCUR_REC_NUM"));
	}
	
	public void setLcurRecNum(NInteger value) {
		super.setValue("LCUR_REC_NUM", value);
	}
	


	public NInteger getLcurRecCnt() {
		return toInt(super.getValue("LCUR_REC_CNT"));
	}
	
	public void setLcurRecCnt(NInteger value) {
		super.setValue("LCUR_REC_CNT", value);
	}
	


	public NString getDataSeparatorLineLite1() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_LITE_1"));
	}
	
	public void setDataSeparatorLineLite1(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_LITE_1", value);
	}
	



}




