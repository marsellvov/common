package net.hedtech.banner.general.common.Guainst.model;

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
	


	public NString getWorkfld() {
		return toStr(super.getValue("WORKFLD"));
	}
	
	public void setWorkfld(NString value) {
		super.setValue("WORKFLD", value);
	}
	


	public NString getCallfld() {
		return toStr(super.getValue("CALLFLD"));
	}
	
	public void setCallfld(NString value) {
		super.setValue("CALLFLD", value);
	}
	


	public NString getWorkdate() {
		return toStr(super.getValue("WORKDATE"));
	}
	
	public void setWorkdate(NString value) {
		super.setValue("WORKDATE", value);
	}
	


	public NString getQryChgInd() {
		return toStr(super.getValue("QRY_CHG_IND"));
	}
	
	public void setQryChgInd(NString value) {
		super.setValue("QRY_CHG_IND", value);
	}
	


	public NString getEffdateEffDateTime() {
		return toStr(super.getValue("EFFDATE_EFF_DATE_TIME"));
	}
	
	public void setEffdateEffDateTime(NString value) {
		super.setValue("EFFDATE_EFF_DATE_TIME", value);
	}
	


	public NDate getWorkDatetime() {
		return toDate(super.getValue("WORK_DATETIME"));
	}
	
	public void setWorkDatetime(NDate value) {
		super.setValue("WORK_DATETIME", value);
	}
	


	public NNumber getHoldConvRate() {
		return toNumber(super.getValue("HOLD_CONV_RATE"));
	}
	
	public void setHoldConvRate(NNumber value) {
		super.setValue("HOLD_CONV_RATE", value);
	}
	


	public NString getSaveItem() {
		return toStr(super.getValue("SAVE_ITEM"));
	}
	
	public void setSaveItem(NString value) {
		super.setValue("SAVE_ITEM", value);
	}
	


	public NString getDataSeparatorLine0() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_0"));
	}
	
	public void setDataSeparatorLine0(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_0", value);
	}
	


	public NString getDataSeparatorLine1() {
		return toStr(super.getValue("DATA_SEPARATOR_LINE_1"));
	}
	
	public void setDataSeparatorLine1(NString value) {
		super.setValue("DATA_SEPARATOR_LINE_1", value);
	}
	



}




