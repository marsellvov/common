package  net.hedtech.banner.general.common.Gxadird.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GxrdirdAdapter extends BaseRowAdapter{
	

	public GxrdirdAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setHoldRowid(NString value){
		this.setValue("HOLD_ROWID", value.getValue());
	}


	public NString getHoldRowid(){
		NString v = new NString((String)this.getValue("HOLD_ROWID"));
		return v;
	}

	public java.sql.RowId getROWID(){ 
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID); 
		}

	
	
	public void setGxrdirdBankRoutNum(NString value){
		this.setValue("GXRDIRD_BANK_ROUT_NUM", value.getValue());
	}


	public NString getGxrdirdBankRoutNum(){
		NString v = new NString((String)this.getValue("GXRDIRD_BANK_ROUT_NUM"));
		return v;
	}


	
	
	public void setBankDesc(NString value){
		this.setValue("BANK_DESC", value.getValue());
	}


	public NString getBankDesc(){
		NString v = new NString((String)this.getValue("BANK_DESC"));
		return v;
	}


	
	
	public void setGxrdirdActivityDate(NDate value){
		this.setValue("GXRDIRD_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGxrdirdActivityDate(){
		NDate v = new NDate((Date)this.getValue("GXRDIRD_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setGxrdirdAtypCode(NString value){
		this.setValue("GXRDIRD_ATYP_CODE", value.getValue());
	}


	public NString getGxrdirdAtypCode(){
		NString v = new NString((String)this.getValue("GXRDIRD_ATYP_CODE"));
		return v;
	}


	
	
	public void setGxrdirdAddrSeqno(NNumber value){
		this.setValue("GXRDIRD_ADDR_SEQNO", value.getValue());
	}


	public NNumber getGxrdirdAddrSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GXRDIRD_ADDR_SEQNO"));
		return v;
	}


	
	
	public void setGxrdirdApInd(NString value){
		this.setValue("GXRDIRD_AP_IND", value.getValue());
	}


	public NString getGxrdirdApInd(){
		NString v = new NString((String)this.getValue("GXRDIRD_AP_IND"));
		return v;
	}


	
	
	public void setGxrdirdHrInd(NString value){
		this.setValue("GXRDIRD_HR_IND", value.getValue());
	}


	public NString getGxrdirdHrInd(){
		NString v = new NString((String)this.getValue("GXRDIRD_HR_IND"));
		return v;
	}


	
	
	public void setGxrdirdBankAcctNum(NString value){
		this.setValue("GXRDIRD_BANK_ACCT_NUM", value.getValue());
	}


	public NString getGxrdirdBankAcctNum(){
		NString v = new NString((String)this.getValue("GXRDIRD_BANK_ACCT_NUM"));
		return v;
	}


	
	
	public void setGxrdirdAcctType(NString value){
		this.setValue("GXRDIRD_ACCT_TYPE", value.getValue());
	}


	public NString getGxrdirdAcctType(){
		NString v = new NString((String)this.getValue("GXRDIRD_ACCT_TYPE"));
		return v;
	}


	
	
	public void setGxrdirdStatus(NString value){
		this.setValue("GXRDIRD_STATUS", value.getValue());
	}


	public NString getGxrdirdStatus(){
		NString v = new NString((String)this.getValue("GXRDIRD_STATUS"));
		return v;
	}


	
	
	public void setGxrdirdPriority(NNumber value){
		this.setValue("GXRDIRD_PRIORITY", value.getValue());
	}


	public NNumber getGxrdirdPriority(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GXRDIRD_PRIORITY"));
		return v;
	}


	
	
	public void setGxrdirdAmount(NNumber value){
		this.setValue("GXRDIRD_AMOUNT", value.getValue());
	}


	public NNumber getGxrdirdAmount(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GXRDIRD_AMOUNT"));
		return v;
	}


	
	
	public void setGxrdirdPercent(NNumber value){
		this.setValue("GXRDIRD_PERCENT", value.getValue());
	}


	public NNumber getGxrdirdPercent(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GXRDIRD_PERCENT"));
		return v;
	}


	
	
	public void setGxrdirdAchIatInd(NString value){
		this.setValue("GXRDIRD_ACH_IAT_IND", value.getValue());
	}


	public NString getGxrdirdAchIatInd(){
		NString v = new NString((String)this.getValue("GXRDIRD_ACH_IAT_IND"));
		return v;
	}


	
	
	public void setGxrdirdScodCodeIso(NString value){
		this.setValue("GXRDIRD_SCOD_CODE_ISO", value.getValue());
	}


	public NString getGxrdirdScodCodeIso(){
		NString v = new NString((String)this.getValue("GXRDIRD_SCOD_CODE_ISO"));
		return v;
	}


	
	
	public void setScodCodeDesc(NString value){
		this.setValue("SCOD_CODE_DESC", value.getValue());
	}


	public NString getScodCodeDesc(){
		NString v = new NString((String)this.getValue("SCOD_CODE_DESC"));
		return v;
	}


	
	
	public void setGxrdirdAchtCode(NString value){
		this.setValue("GXRDIRD_ACHT_CODE", value.getValue());
	}


	public NString getGxrdirdAchtCode(){
		NString v = new NString((String)this.getValue("GXRDIRD_ACHT_CODE"));
		return v;
	}


	
	
	public void setGxrdirdAtypCodeIat(NString value){
		this.setValue("GXRDIRD_ATYP_CODE_IAT", value.getValue());
	}


	public NString getGxrdirdAtypCodeIat(){
		NString v = new NString((String)this.getValue("GXRDIRD_ATYP_CODE_IAT"));
		return v;
	}


	
	
	public void setGxrdirdAddrSeqnoIat(NNumber value){
		this.setValue("GXRDIRD_ADDR_SEQNO_IAT", value.getValue());
	}


	public NNumber getGxrdirdAddrSeqnoIat(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GXRDIRD_ADDR_SEQNO_IAT"));
		return v;
	}


	
	
	public void setGxrdirdDocType(NString value){
		this.setValue("GXRDIRD_DOC_TYPE", value.getValue());
	}


	public NString getGxrdirdDocType(){
		NString v = new NString((String)this.getValue("GXRDIRD_DOC_TYPE"));
		return v;
	}


	
	
	public void setGxrdirdUserId(NString value){
		this.setValue("GXRDIRD_USER_ID", value.getValue());
	}


	public NString getGxrdirdUserId(){
		NString v = new NString((String)this.getValue("GXRDIRD_USER_ID"));
		return v;
	}


	
	// F2J_TODO : Item GXRDIRD_PIDM has the "Copy Value from Item" property defined, with value: KEY_BLOCK.PIDM                  
	
	public void setGxrdirdPidm(NNumber value){
		this.setValue("GXRDIRD_PIDM", value.getValue());
	}


	public NNumber getGxrdirdPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GXRDIRD_PIDM"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
