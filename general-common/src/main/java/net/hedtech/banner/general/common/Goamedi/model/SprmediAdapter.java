package  net.hedtech.banner.general.common.Goamedi.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class SprmediAdapter extends BaseRowAdapter{
	

	public SprmediAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setSprmediPidm(NNumber value){
		this.setValue("SPRMEDI_PIDM", value.getValue());
	}


	public NNumber getSprmediPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRMEDI_PIDM"));
		return v;
	}


	
	
	public void setCommitSw(NString value){
		this.setValue("COMMIT_SW", value.getValue());
	}


	public NString getCommitSw(){
		NString v = new NString((String)this.getValue("COMMIT_SW"));
		return v;
	}


	
	
	public void setSprmediMediCode(NString value){
		this.setValue("SPRMEDI_MEDI_CODE", value.getValue());
	}


	public NString getSprmediMediCode(){
		NString v = new NString((String)this.getValue("SPRMEDI_MEDI_CODE"));
		return v;
	}


	
	
	public void setHoldMediCode(NString value){
		this.setValue("HOLD_MEDI_CODE", value.getValue());
	}


	public NString getHoldMediCode(){
		NString v = new NString((String)this.getValue("HOLD_MEDI_CODE"));
		return v;
	}


	
	
	public void setMediDescription(NString value){
		this.setValue("MEDI_DESCRIPTION", value.getValue());
	}


	public NString getMediDescription(){
		NString v = new NString((String)this.getValue("MEDI_DESCRIPTION"));
		return v;
	}


	
	
	public void setSprmediMediCodeDate(NDate value){
		this.setValue("SPRMEDI_MEDI_CODE_DATE", value.getValue());
	}


	public NDate getSprmediMediCodeDate(){
		NDate v = new NDate((Date)this.getValue("SPRMEDI_MEDI_CODE_DATE"));
		return v;
	}


	
	
	public void setSprmediDisaCode(NString value){
		this.setValue("SPRMEDI_DISA_CODE", value.getValue());
	}


	public NString getSprmediDisaCode(){
		NString v = new NString((String)this.getValue("SPRMEDI_DISA_CODE"));
		return v;
	}


	
	
	public void setDisaDescription(NString value){
		this.setValue("DISA_DESCRIPTION", value.getValue());
	}


	public NString getDisaDescription(){
		NString v = new NString((String)this.getValue("DISA_DESCRIPTION"));
		return v;
	}


	
	
	public void setSprmediOnsetAge(NNumber value){
		this.setValue("SPRMEDI_ONSET_AGE", value.getValue());
	}


	public NNumber getSprmediOnsetAge(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRMEDI_ONSET_AGE"));
		return v;
	}


	
	
	public void setSprmediDisbInd(NString value){
		this.setValue("SPRMEDI_DISB_IND", value.getValue());
	}


	public NString getSprmediDisbInd(){
		NString v = new NString((String)this.getValue("SPRMEDI_DISB_IND"));
		return v;
	}


	
	
	public void setSprmediMdeqCode(NString value){
		this.setValue("SPRMEDI_MDEQ_CODE", value.getValue());
	}


	public NString getSprmediMdeqCode(){
		NString v = new NString((String)this.getValue("SPRMEDI_MDEQ_CODE"));
		return v;
	}


	
	
	public void setMdeqDescription(NString value){
		this.setValue("MDEQ_DESCRIPTION", value.getValue());
	}


	public NString getMdeqDescription(){
		NString v = new NString((String)this.getValue("MDEQ_DESCRIPTION"));
		return v;
	}


	
	
	public void setSprmediSpsrCode(NString value){
		this.setValue("SPRMEDI_SPSR_CODE", value.getValue());
	}


	public NString getSprmediSpsrCode(){
		NString v = new NString((String)this.getValue("SPRMEDI_SPSR_CODE"));
		return v;
	}


	
	
	public void setSpsrDescription(NString value){
		this.setValue("SPSR_DESCRIPTION", value.getValue());
	}


	public NString getSpsrDescription(){
		NString v = new NString((String)this.getValue("SPSR_DESCRIPTION"));
		return v;
	}


	
	
	public void setSprmediComment(NString value){
		this.setValue("SPRMEDI_COMMENT", value.getValue());
	}


	public NString getSprmediComment(){
		NString v = new NString((String)this.getValue("SPRMEDI_COMMENT"));
		return v;
	}


	
	
	public void setSprmediUserId(NString value){
		this.setValue("SPRMEDI_USER_ID", value.getValue());
	}


	public NString getSprmediUserId(){
		NString v = new NString((String)this.getValue("SPRMEDI_USER_ID"));
		return v;
	}


	
	
	public void setSprmediActivityDate(NDate value){
		this.setValue("SPRMEDI_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSprmediActivityDate(){
		NDate v = new NDate((Date)this.getValue("SPRMEDI_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setCntPrimary(NNumber value){
		this.setValue("CNT_PRIMARY", value.getValue());
	}


	public NNumber getCntPrimary(){
		NNumber v = new NNumber((BigDecimal)this.getValue("CNT_PRIMARY"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
	public void setROWID(NString rowId){
		this.setROWID(rowId.getValue().getBytes());
	}
	
	public java.sql.RowId getROWID(){
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID);
		} 
	
}
