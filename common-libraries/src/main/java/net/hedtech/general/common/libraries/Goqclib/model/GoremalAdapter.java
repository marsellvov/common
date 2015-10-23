package  net.hedtech.general.common.libraries.Goqclib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;



public class GoremalAdapter extends BaseRowAdapter{
	

	public GoremalAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGoremalEmalCode(NString value){
		this.setValue("GOREMAL_EMAL_CODE", value.getValue());
	}


	public NString getGoremalEmalCode(){
		NString v = new NString((String)this.getValue("GOREMAL_EMAL_CODE"));
		return v;
	}


	
	
	public void setEmailDesc(NString value){
		this.setValue("EMAIL_DESC", value.getValue());
	}


	public NString getEmailDesc(){
		NString v = new NString((String)this.getValue("EMAIL_DESC"));
		return v;
	}


	
	
	public void setGoremalEmailAddress(NString value){
		this.setValue("GOREMAL_EMAIL_ADDRESS", value.getValue());
	}


	public NString getGoremalEmailAddress(){
		NString v = new NString((String)this.getValue("GOREMAL_EMAIL_ADDRESS"));
		return v;
	}


	
	
	public void setGoremalPreferredInd(NString value){
		this.setValue("GOREMAL_PREFERRED_IND", value.getValue());
	}


	public NString getGoremalPreferredInd(){
		NString v = new NString((String)this.getValue("GOREMAL_PREFERRED_IND"));
		return v;
	}


	
	
	public void setGoremalStatusInd(NString value){
		this.setValue("GOREMAL_STATUS_IND", value.getValue());
	}


	public NString getGoremalStatusInd(){
		NString v = new NString((String)this.getValue("GOREMAL_STATUS_IND"));
		return v;
	}


	
	
	public void setGoremalDispWebInd(NString value){
		this.setValue("GOREMAL_DISP_WEB_IND", value.getValue());
	}


	public NString getGoremalDispWebInd(){
		NString v = new NString((String)this.getValue("GOREMAL_DISP_WEB_IND"));
		return v;
	}


	
	
	public void setUrlInd(NString value){
		this.setValue("URL_IND", value.getValue());
	}


	public NString getUrlInd(){
		NString v = new NString((String)this.getValue("URL_IND"));
		return v;
	}


	
	
	public void setGoremalComment(NString value){
		this.setValue("GOREMAL_COMMENT", value.getValue());
	}


	public NString getGoremalComment(){
		NString v = new NString((String)this.getValue("GOREMAL_COMMENT"));
		return v;
	}


	
	
	public void setGoremalActivityDate(NDate value){
		this.setValue("GOREMAL_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGoremalActivityDate(){
		NDate v = new NDate((Date)this.getValue("GOREMAL_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setGoremalUserId(NString value){
		this.setValue("GOREMAL_USER_ID", value.getValue());
	}


	public NString getGoremalUserId(){
		NString v = new NString((String)this.getValue("GOREMAL_USER_ID"));
		return v;
	}


	
	
	public void setGoremalPidm(NNumber value){
		this.setValue("GOREMAL_PIDM", value.getValue());
	}


	public NNumber getGoremalPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GOREMAL_PIDM"));
		return v;
	}


	

	public  java.sql.RowId getROWID(){
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID);
	}
	
	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
	
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
}
