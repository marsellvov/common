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



public class GorvisaAdapter extends BaseRowAdapter{
	

	public GorvisaAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns      
	
	public void setGorvisaPidm(NNumber value){
		this.setValue("GORVISA_PIDM", value.getValue());
	}


	public NNumber getGorvisaPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GORVISA_PIDM"));
		return v;
	}


	
	
	public void setGorvisaSeqNo(NNumber value){
		this.setValue("GORVISA_SEQ_NO", value.getValue());
	}


	public NNumber getGorvisaSeqNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GORVISA_SEQ_NO"));
		return v;
	}


	
	
	public void setSeqno(NNumber value){
		this.setValue("SEQNO", value.getValue());
	}


	public NNumber getSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SEQNO"));
		return v;
	}


	
	
	public void setGorvisaVtypCode(NString value){
		this.setValue("GORVISA_VTYP_CODE", value.getValue());
	}


	public NString getGorvisaVtypCode(){
		NString v = new NString((String)this.getValue("GORVISA_VTYP_CODE"));
		return v;
	}


	
	
	public void setVtypDesc(NString value){
		this.setValue("VTYP_DESC", value.getValue());
	}


	public NString getVtypDesc(){
		NString v = new NString((String)this.getValue("VTYP_DESC"));
		return v;
	}


	
	
	public void setGorvisaVisaNumber(NString value){
		this.setValue("GORVISA_VISA_NUMBER", value.getValue());
	}


	public NString getGorvisaVisaNumber(){
		NString v = new NString((String)this.getValue("GORVISA_VISA_NUMBER"));
		return v;
	}


	
	
	public void setGorvisaNatnCodeIssue(NString value){
		this.setValue("GORVISA_NATN_CODE_ISSUE", value.getValue());
	}


	public NString getGorvisaNatnCodeIssue(){
		NString v = new NString((String)this.getValue("GORVISA_NATN_CODE_ISSUE"));
		return v;
	}


	
	
	public void setIssueNatnDesc(NString value){
		this.setValue("ISSUE_NATN_DESC", value.getValue());
	}


	public NString getIssueNatnDesc(){
		NString v = new NString((String)this.getValue("ISSUE_NATN_DESC"));
		return v;
	}


	
	
	public void setGorvisaVissCode(NString value){
		this.setValue("GORVISA_VISS_CODE", value.getValue());
	}


	public NString getGorvisaVissCode(){
		NString v = new NString((String)this.getValue("GORVISA_VISS_CODE"));
		return v;
	}


	
	
	public void setVissDesc(NString value){
		this.setValue("VISS_DESC", value.getValue());
	}


	public NString getVissDesc(){
		NString v = new NString((String)this.getValue("VISS_DESC"));
		return v;
	}


	
	
	public void setGorvisaPentCode(NString value){
		this.setValue("GORVISA_PENT_CODE", value.getValue());
	}


	public NString getGorvisaPentCode(){
		NString v = new NString((String)this.getValue("GORVISA_PENT_CODE"));
		return v;
	}


	
	
	public void setPentDesc(NString value){
		this.setValue("PENT_DESC", value.getValue());
	}


	public NString getPentDesc(){
		NString v = new NString((String)this.getValue("PENT_DESC"));
		return v;
	}


	
	
	public void setGorvisaEntryInd(NString value){
		this.setValue("GORVISA_ENTRY_IND", value.getValue());
	}


	public NString getGorvisaEntryInd(){
		NString v = new NString((String)this.getValue("GORVISA_ENTRY_IND"));
		return v;
	}


	
	
	public void setGorvisaNoEntries(NString value){
		this.setValue("GORVISA_NO_ENTRIES", value.getValue());
	}


	public NString getGorvisaNoEntries(){
		NString v = new NString((String)this.getValue("GORVISA_NO_ENTRIES"));
		return v;
	}


	
	
	public void setGorvisaVisaReqDate(NDate value){
		this.setValue("GORVISA_VISA_REQ_DATE", value.getValue());
	}


	public NDate getGorvisaVisaReqDate(){
		NDate v = new NDate((Date)this.getValue("GORVISA_VISA_REQ_DATE"));
		return v;
	}


	
	
	public void setGorvisaVisaIssueDate(NDate value){
		this.setValue("GORVISA_VISA_ISSUE_DATE", value.getValue());
	}


	public NDate getGorvisaVisaIssueDate(){
		NDate v = new NDate((Date)this.getValue("GORVISA_VISA_ISSUE_DATE"));
		return v;
	}


	
	
	public void setGorvisaVisaStartDate(NDate value){
		this.setValue("GORVISA_VISA_START_DATE", value.getValue());
	}


	public NDate getGorvisaVisaStartDate(){
		NDate v = new NDate((Date)this.getValue("GORVISA_VISA_START_DATE"));
		return v;
	}


	
	
	public void setGorvisaVisaExpireDate(NDate value){
		this.setValue("GORVISA_VISA_EXPIRE_DATE", value.getValue());
	}


	public NDate getGorvisaVisaExpireDate(){
		NDate v = new NDate((Date)this.getValue("GORVISA_VISA_EXPIRE_DATE"));
		return v;
	}


	
	
	public void setGorvisaUserId(NString value){
		this.setValue("GORVISA_USER_ID", value.getValue());
	}


	public NString getGorvisaUserId(){
		NString v = new NString((String)this.getValue("GORVISA_USER_ID"));
		return v;
	}


	
	
	public void setGorvisaActivityDate(NDate value){
		this.setValue("GORVISA_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGorvisaActivityDate(){
		NDate v = new NDate((Date)this.getValue("GORVISA_ACTIVITY_DATE"));
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
