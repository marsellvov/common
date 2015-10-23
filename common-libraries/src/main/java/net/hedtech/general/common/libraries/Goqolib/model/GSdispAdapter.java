package  net.hedtech.general.common.libraries.Goqolib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;



public class GSdispAdapter extends BaseRowAdapter{
	

	public GSdispAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGovsdavValueAsChar(NString value){
		this.setValue("GOVSDAV_VALUE_AS_CHAR", value.getValue());
	}


	public NString getGovsdavValueAsChar(){
		NString v = new NString((String)this.getValue("GOVSDAV_VALUE_AS_CHAR"));
		return v;
	}


	
	
	public void setGovsdavTableName(NString value){
		this.setValue("GOVSDAV_TABLE_NAME", value.getValue());
	}


	public NString getGovsdavTableName(){
		NString v = new NString((String)this.getValue("GOVSDAV_TABLE_NAME"));
		return v;
	}


	
	
	public void setGovsdavAttrName(NString value){
		this.setValue("GOVSDAV_ATTR_NAME", value.getValue());
	}


	public NString getGovsdavAttrName(){
		NString v = new NString((String)this.getValue("GOVSDAV_ATTR_NAME"));
		return v;
	}


	
	
	public void setGovsdavAttrType(NString value){
		this.setValue("GOVSDAV_ATTR_TYPE", value.getValue());
	}


	public NString getGovsdavAttrType(){
		NString v = new NString((String)this.getValue("GOVSDAV_ATTR_TYPE"));
		return v;
	}


	
	
	public void setGovsdavAttrOrder(NNumber value){
		this.setValue("GOVSDAV_ATTR_ORDER", value.getValue());
	}


	public NNumber getGovsdavAttrOrder(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GOVSDAV_ATTR_ORDER"));
		return v;
	}


	
	
	public void setGovsdavAttrReqdInd(NString value){
		this.setValue("GOVSDAV_ATTR_REQD_IND", value.getValue());
	}


	public NString getGovsdavAttrReqdInd(){
		NString v = new NString((String)this.getValue("GOVSDAV_ATTR_REQD_IND"));
		return v;
	}


	
	
	public void setGovsdavAttrDataType(NString value){
		this.setValue("GOVSDAV_ATTR_DATA_TYPE", value.getValue());
	}


	public NString getGovsdavAttrDataType(){
		NString v = new NString((String)this.getValue("GOVSDAV_ATTR_DATA_TYPE"));
		return v;
	}


	
	
	public void setGovsdavAttrDataLen(NNumber value){
		this.setValue("GOVSDAV_ATTR_DATA_LEN", value.getValue());
	}


	public NNumber getGovsdavAttrDataLen(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GOVSDAV_ATTR_DATA_LEN"));
		return v;
	}


	
	
	public void setGovsdavAttrDataScale(NNumber value){
		this.setValue("GOVSDAV_ATTR_DATA_SCALE", value.getValue());
	}


	public NNumber getGovsdavAttrDataScale(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GOVSDAV_ATTR_DATA_SCALE"));
		return v;
	}


	
	
	public void setGovsdavAttrInfo(NString value){
		this.setValue("GOVSDAV_ATTR_INFO", value.getValue());
	}


	public NString getGovsdavAttrInfo(){
		NString v = new NString((String)this.getValue("GOVSDAV_ATTR_INFO"));
		return v;
	}


	
	
	public void setGovsdavAttrBaseCol(NString value){
		this.setValue("GOVSDAV_ATTR_BASE_COL", value.getValue());
	}


	public NString getGovsdavAttrBaseCol(){
		NString v = new NString((String)this.getValue("GOVSDAV_ATTR_BASE_COL"));
		return v;
	}


	
	
	public void setGovsdavDiscType(NString value){
		this.setValue("GOVSDAV_DISC_TYPE", value.getValue());
	}


	public NString getGovsdavDiscType(){
		NString v = new NString((String)this.getValue("GOVSDAV_DISC_TYPE"));
		return v;
	}


	
	
	public void setGovsdavDiscMethod(NString value){
		this.setValue("GOVSDAV_DISC_METHOD", value.getValue());
	}


	public NString getGovsdavDiscMethod(){
		NString v = new NString((String)this.getValue("GOVSDAV_DISC_METHOD"));
		return v;
	}


	
	
	public void setGovsdavDiscValidation(NString value){
		this.setValue("GOVSDAV_DISC_VALIDATION", value.getValue());
	}


	public NString getGovsdavDiscValidation(){
		NString v = new NString((String)this.getValue("GOVSDAV_DISC_VALIDATION"));
		return v;
	}


	
	
	public void setGovsdavPkParenttab(NString value){
		this.setValue("GOVSDAV_PK_PARENTTAB", value.getValue());
	}


	public NString getGovsdavPkParenttab(){
		NString v = new NString((String)this.getValue("GOVSDAV_PK_PARENTTAB"));
		return v;
	}


	
	
	public void setGovsdavAttrPromptDisp(NString value){
		this.setValue("GOVSDAV_ATTR_PROMPT_DISP", value.getValue());
	}


	public NString getGovsdavAttrPromptDisp(){
		NString v = new NString((String)this.getValue("GOVSDAV_ATTR_PROMPT_DISP"));
		return v;
	}


	
	
	public void setGovsdavAttrPrompt(NString value){
		this.setValue("GOVSDAV_ATTR_PROMPT", value.getValue());
	}


	public NString getGovsdavAttrPrompt(){
		NString v = new NString((String)this.getValue("GOVSDAV_ATTR_PROMPT"));
		return v;
	}


	
	
	public void setGovsdavDisc(NString value){
		this.setValue("GOVSDAV_DISC", value.getValue());
	}


	public NString getGovsdavDisc(){
		NString v = new NString((String)this.getValue("GOVSDAV_DISC"));
		return v;
	}


	
	
	public void setGovsdavDesc(NString value){
		this.setValue("GOVSDAV_DESC", value.getValue());
	}


	public NString getGovsdavDesc(){
		NString v = new NString((String)this.getValue("GOVSDAV_DESC"));
		return v;
	}


	
	
	public void setGovsdavRowid(java.sql.RowId value){
		this.setValue("GOVSDAV_ROWID", value);
	}


	public java.sql.RowId getGovsdavRowid(){
		return (java.sql.RowId)this.getValue("GOVSDAV_ROWID");
		
	}


	
	
	public void setReqdIsNull(NString value){
		this.setValue("REQD_IS_NULL", value.getValue());
	}


	public NString getReqdIsNull(){
		NString v = new NString((String)this.getValue("REQD_IS_NULL"));
		return v;
	}


	
	
	public void setIsLastIdx(NString value){
		this.setValue("IS_LAST_IDX", value.getValue());
	}


	public NString getIsLastIdx(){
		NString v = new NString((String)this.getValue("IS_LAST_IDX"));
		return v;
	}


	
	
	public void setGovsdavSddcCode(NString value){
		this.setValue("GOVSDAV_SDDC_CODE", value.getValue());
	}


	public NString getGovsdavSddcCode(){
		NString v = new NString((String)this.getValue("GOVSDAV_SDDC_CODE"));
		return v;
	}


	
	
	public void setGovsdavLovForm(NString value){
		this.setValue("GOVSDAV_LOV_FORM", value.getValue());
	}


	public NString getGovsdavLovForm(){
		NString v = new NString((String)this.getValue("GOVSDAV_LOV_FORM"));
		return v;
	}


	
	
	public void setGovsdavLovTableOvrd(NString value){
		this.setValue("GOVSDAV_LOV_TABLE_OVRD", value.getValue());
	}


	public NString getGovsdavLovTableOvrd(){
		NString v = new NString((String)this.getValue("GOVSDAV_LOV_TABLE_OVRD"));
		return v;
	}


	
	
	public void setGovsdavLovAttrOvrd(NString value){
		this.setValue("GOVSDAV_LOV_ATTR_OVRD", value.getValue());
	}


	public NString getGovsdavLovAttrOvrd(){
		NString v = new NString((String)this.getValue("GOVSDAV_LOV_ATTR_OVRD"));
		return v;
	}


	
	
	public void setGovsdavLovCodeTitle(NString value){
		this.setValue("GOVSDAV_LOV_CODE_TITLE", value.getValue());
	}


	public NString getGovsdavLovCodeTitle(){
		NString v = new NString((String)this.getValue("GOVSDAV_LOV_CODE_TITLE"));
		return v;
	}


	
	
	public void setGovsdavLovDescTitle(NString value){
		this.setValue("GOVSDAV_LOV_DESC_TITLE", value.getValue());
	}


	public NString getGovsdavLovDescTitle(){
		NString v = new NString((String)this.getValue("GOVSDAV_LOV_DESC_TITLE"));
		return v;
	}


	

	public  java.sql.RowId getROWID(){
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID);
	}
	
}
