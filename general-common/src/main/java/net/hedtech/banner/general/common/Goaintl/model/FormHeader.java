package net.hedtech.banner.general.common.Goaintl.model;

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
	

	



	public NString getGobintlExists() {
		return toStr(super.getValue("GOBINTL_EXISTS"));
	}
	
	public void setGobintlExists(NString value) {
		super.setValue("GOBINTL_EXISTS", value);
	}
	


	public NString getCurrentInstitution() {
		return toStr(super.getValue("CURRENT_INSTITUTION"));
	}
	
	public void setCurrentInstitution(NString value) {
		super.setValue("CURRENT_INSTITUTION", value);
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
	


	public NString getCurrentUser() {
		return toStr(super.getValue("CURRENT_USER"));
	}
	
	public void setCurrentUser(NString value) {
		super.setValue("CURRENT_USER", value);
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
	


	public NString getConvertedDate() {
		return toStr(super.getValue("CONVERTED_DATE"));
	}
	
	public void setConvertedDate(NString value) {
		super.setValue("CONVERTED_DATE", value);
	}
	


	public NString getDateToConvert() {
		return toStr(super.getValue("DATE_TO_CONVERT"));
	}
	
	public void setDateToConvert(NString value) {
		super.setValue("DATE_TO_CONVERT", value);
	}
	


	public NNumber getYear() {
		return toNumber(super.getValue("YEAR"));
	}
	
	public void setYear(NNumber value) {
		super.setValue("YEAR", value);
	}
	


	public NString getHoldDateToConvert() {
		return toStr(super.getValue("HOLD_DATE_TO_CONVERT"));
	}
	
	public void setHoldDateToConvert(NString value) {
		super.setValue("HOLD_DATE_TO_CONVERT", value);
	}
	


	public NNumber getMaxSeqno() {
		return toNumber(super.getValue("MAX_SEQNO"));
	}
	
	public void setMaxSeqno(NNumber value) {
		super.setValue("MAX_SEQNO", value);
	}
	


	public NNumber getRecordNumber() {
		return toNumber(super.getValue("RECORD_NUMBER"));
	}
	
	public void setRecordNumber(NNumber value) {
		super.setValue("RECORD_NUMBER", value);
	}
	


	public NString getDeletionFlag() {
		return toStr(super.getValue("DELETION_FLAG"));
	}
	
	public void setDeletionFlag(NString value) {
		super.setValue("DELETION_FLAG", value);
	}
	


	public NString getErrorItem() {
		return toStr(super.getValue("ERROR_ITEM"));
	}
	
	public void setErrorItem(NString value) {
		super.setValue("ERROR_ITEM", value);
	}
	


	public NString getPreviousBlock() {
		return toStr(super.getValue("PREVIOUS_BLOCK"));
	}
	
	public void setPreviousBlock(NString value) {
		super.setValue("PREVIOUS_BLOCK", value);
	}
	


	public NString getGtvsdaxVisantndefValue() {
		return toStr(super.getValue("GTVSDAX_VISANTNDEF_VALUE"));
	}
	
	public void setGtvsdaxVisantndefValue(NString value) {
		super.setValue("GTVSDAX_VISANTNDEF_VALUE", value);
	}
	


	public NString getGtvsdaxVisaissdefValue() {
		return toStr(super.getValue("GTVSDAX_VISAISSDEF_VALUE"));
	}
	
	public void setGtvsdaxVisaissdefValue(NString value) {
		super.setValue("GTVSDAX_VISAISSDEF_VALUE", value);
	}
	


	public NString getGtvsdaxVisanbrdefValue() {
		return toStr(super.getValue("GTVSDAX_VISANBRDEF_VALUE"));
	}
	
	public void setGtvsdaxVisanbrdefValue(NString value) {
		super.setValue("GTVSDAX_VISANBRDEF_VALUE", value);
	}
	


	public NDate getGtvsdaxVisadatedefValue() {
		return toDate(super.getValue("GTVSDAX_VISADATEDEF_VALUE"));
	}
	
	public void setGtvsdaxVisadatedefValue(NDate value) {
		super.setValue("GTVSDAX_VISADATEDEF_VALUE", value);
	}
	


	public NString getFormAction() {
		return toStr(super.getValue("FORM_ACTION"));
	}
	
	public void setFormAction(NString value) {
		super.setValue("FORM_ACTION", value);
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




