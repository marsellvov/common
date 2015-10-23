package  net.hedtech.banner.general.common.Goaintl.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GordocmAdapter extends BaseRowAdapter{
	

	public GordocmAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGordocmPidm(NNumber value){
		this.setValue("GORDOCM_PIDM", value.getValue());
	}


	public NNumber getGordocmPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GORDOCM_PIDM"));
		return v;
	}


	
	
	public void setGordocmSeqNo(NNumber value){
		this.setValue("GORDOCM_SEQ_NO", value.getValue());
	}


	public NNumber getGordocmSeqNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GORDOCM_SEQ_NO"));
		return v;
	}


	
	
	public void setGordocmVtypCode(NString value){
		this.setValue("GORDOCM_VTYP_CODE", value.getValue());
	}


	public NString getGordocmVtypCode(){
		NString v = new NString((String)this.getValue("GORDOCM_VTYP_CODE"));
		return v;
	}


	
	
	public void setGordocmVisaNumber(NString value){
		this.setValue("GORDOCM_VISA_NUMBER", value.getValue());
	}


	public NString getGordocmVisaNumber(){
		NString v = new NString((String)this.getValue("GORDOCM_VISA_NUMBER"));
		return v;
	}


	
	
	public void setGordocmUserId(NString value){
		this.setValue("GORDOCM_USER_ID", value.getValue());
	}


	public NString getGordocmUserId(){
		NString v = new NString((String)this.getValue("GORDOCM_USER_ID"));
		return v;
	}


	
	
	public void setGordocmActivityDate(NDate value){
		this.setValue("GORDOCM_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGordocmActivityDate(){
		NDate v = new NDate((Date)this.getValue("GORDOCM_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setGordocmDocmCode(NString value){
		this.setValue("GORDOCM_DOCM_CODE", value.getValue());
	}


	public NString getGordocmDocmCode(){
		NString v = new NString((String)this.getValue("GORDOCM_DOCM_CODE"));
		return v;
	}


	
	
	public void setDocmDesc(NString value){
		this.setValue("DOCM_DESC", value.getValue());
	}


	public NString getDocmDesc(){
		NString v = new NString((String)this.getValue("DOCM_DESC"));
		return v;
	}


	
	
	public void setGordocmSrceCode(NString value){
		this.setValue("GORDOCM_SRCE_CODE", value.getValue());
	}


	public NString getGordocmSrceCode(){
		NString v = new NString((String)this.getValue("GORDOCM_SRCE_CODE"));
		return v;
	}


	
	
	public void setSrceDesc(NString value){
		this.setValue("SRCE_DESC", value.getValue());
	}


	public NString getSrceDesc(){
		NString v = new NString((String)this.getValue("SRCE_DESC"));
		return v;
	}


	
	
	public void setGordocmRequestDate(NDate value){
		this.setValue("GORDOCM_REQUEST_DATE", value.getValue());
	}


	public NDate getGordocmRequestDate(){
		NDate v = new NDate((Date)this.getValue("GORDOCM_REQUEST_DATE"));
		return v;
	}


	
	
	public void setGordocmDisposition(NString value){
		this.setValue("GORDOCM_DISPOSITION", value.getValue());
	}


	public NString getGordocmDisposition(){
		NString v = new NString((String)this.getValue("GORDOCM_DISPOSITION"));
		return v;
	}


	
	
	public void setGordocmReceivedDate(NDate value){
		this.setValue("GORDOCM_RECEIVED_DATE", value.getValue());
	}


	public NDate getGordocmReceivedDate(){
		NDate v = new NDate((Date)this.getValue("GORDOCM_RECEIVED_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
	public java.sql.RowId getROWID(){ 
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID); 
		}
	
}
