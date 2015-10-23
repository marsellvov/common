package  net.hedtech.general.common.libraries.Soqolib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class SobcplnAdapter extends BaseRowAdapter{
	

	public SobcplnAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setSobcplnPidm(NNumber value){
		this.setValue("SOBCPLN_PIDM", value.getValue());
	}


	public NNumber getSobcplnPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOBCPLN_PIDM"));
		return v;
	}


	
	
	public void setSobcplnCplnCode(NString value){
		this.setValue("SOBCPLN_CPLN_CODE", value.getValue());
	}


	public NString getSobcplnCplnCode(){
		NString v = new NString((String)this.getValue("SOBCPLN_CPLN_CODE"));
		return v;
	}


	
	
	public void setStvcplnDesc(NString value){
		this.setValue("STVCPLN_DESC", value.getValue());
	}


	public NString getStvcplnDesc(){
		NString v = new NString((String)this.getValue("STVCPLN_DESC"));
		return v;
	}


	
	
	public void setSobcplnTypeInd(NString value){
		this.setValue("SOBCPLN_TYPE_IND", value.getValue());
	}


	public NString getSobcplnTypeInd(){
		NString v = new NString((String)this.getValue("SOBCPLN_TYPE_IND"));
		return v;
	}


	
	
	public void setSobcplnTermCode(NString value){
		this.setValue("SOBCPLN_TERM_CODE", value.getValue());
	}


	public NString getSobcplnTermCode(){
		NString v = new NString((String)this.getValue("SOBCPLN_TERM_CODE"));
		return v;
	}


	
	
	public void setSobcplnSeqno(NNumber value){
		this.setValue("SOBCPLN_SEQNO", value.getValue());
	}


	public NNumber getSobcplnSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SOBCPLN_SEQNO"));
		return v;
	}


	
	
	public void setSobcplnActiveInd(NString value){
		this.setValue("SOBCPLN_ACTIVE_IND", value.getValue());
	}


	public NString getSobcplnActiveInd(){
		NString v = new NString((String)this.getValue("SOBCPLN_ACTIVE_IND"));
		return v;
	}


	
	
	public void setUnsentMail(NString value){
		this.setValue("UNSENT_MAIL", value.getValue());
	}


	public NString getUnsentMail(){
		NString v = new NString((String)this.getValue("UNSENT_MAIL"));
		return v;
	}


	
	
	public void setDeleteMail(NString value){
		this.setValue("DELETE_MAIL", value.getValue());
	}


	public NString getDeleteMail(){
		NString v = new NString((String)this.getValue("DELETE_MAIL"));
		return v;
	}


	
	
	public void setSobcplnActivityDate(NDate value){
		this.setValue("SOBCPLN_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSobcplnActivityDate(){
		NDate v = new NDate((Date)this.getValue("SOBCPLN_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setDeletePlan(NString value){
		this.setValue("DELETE_PLAN", value.getValue());
	}


	public NString getDeletePlan(){
		NString v = new NString((String)this.getValue("DELETE_PLAN"));
		return v;
	}


	
	
	public void setCplnMessage(NString value){
		this.setValue("CPLN_MESSAGE", value.getValue());
	}


	public NString getCplnMessage(){
		NString v = new NString((String)this.getValue("CPLN_MESSAGE"));
		return v;
	}


	
	
	public void setInsertFlag(NString value){
		this.setValue("INSERT_FLAG", value.getValue());
	}


	public NString getInsertFlag(){
		NString v = new NString((String)this.getValue("INSERT_FLAG"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
