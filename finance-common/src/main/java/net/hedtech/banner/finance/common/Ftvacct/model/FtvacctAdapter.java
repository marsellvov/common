package  net.hedtech.banner.finance.common.Ftvacct.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvacctAdapter extends BaseRowAdapter{
	

	public FtvacctAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvacctCoasCode(NString value){
		this.setValue("FTVACCT_COAS_CODE", value.getValue());
	}


	public NString getFtvacctCoasCode(){
		NString v = new NString((String)this.getValue("FTVACCT_COAS_CODE"));
		return v;
	}


	
	
	public void setFtvacctAcctCode(NString value){
		this.setValue("FTVACCT_ACCT_CODE", value.getValue());
	}


	public NString getFtvacctAcctCode(){
		NString v = new NString((String)this.getValue("FTVACCT_ACCT_CODE"));
		return v;
	}


	
	
	public void setFtvacctTitle(NString value){
		this.setValue("FTVACCT_TITLE", value.getValue());
	}


	public NString getFtvacctTitle(){
		NString v = new NString((String)this.getValue("FTVACCT_TITLE"));
		return v;
	}


	
	
	public void setFtvacctAtypCode(NString value){
		this.setValue("FTVACCT_ATYP_CODE", value.getValue());
	}


	public NString getFtvacctAtypCode(){
		NString v = new NString((String)this.getValue("FTVACCT_ATYP_CODE"));
		return v;
	}


	
	
	public void setFtvacctDataEntryInd(NString value){
		this.setValue("FTVACCT_DATA_ENTRY_IND", value.getValue());
	}


	public NString getFtvacctDataEntryInd(){
		NString v = new NString((String)this.getValue("FTVACCT_DATA_ENTRY_IND"));
		return v;
	}


	
	
	public void setFtvacctAcctClassCode(NString value){
		this.setValue("FTVACCT_ACCT_CLASS_CODE", value.getValue());
	}


	public NString getFtvacctAcctClassCode(){
		NString v = new NString((String)this.getValue("FTVACCT_ACCT_CLASS_CODE"));
		return v;
	}


	
	
	public void setFtvacctStatusInd(NString value){
		this.setValue("FTVACCT_STATUS_IND", value.getValue());
	}


	public NString getFtvacctStatusInd(){
		NString v = new NString((String)this.getValue("FTVACCT_STATUS_IND"));
		return v;
	}


	
	
	public void setInternalAtyp(NString value){
		this.setValue("INTERNAL_ATYP", value.getValue());
	}


	public NString getInternalAtyp(){
		NString v = new NString((String)this.getValue("INTERNAL_ATYP"));
		return v;
	}


	
	
	public void setFtvacctEffDate(NDate value){
		this.setValue("FTVACCT_EFF_DATE", value.getValue());
	}


	public NDate getFtvacctEffDate(){
		NDate v = new NDate((Date)this.getValue("FTVACCT_EFF_DATE"));
		return v;
	}


	
	
	public void setFtvacctTermDate(NDate value){
		this.setValue("FTVACCT_TERM_DATE", value.getValue());
	}


	public NDate getFtvacctTermDate(){
		NDate v = new NDate((Date)this.getValue("FTVACCT_TERM_DATE"));
		return v;
	}


	
	
	public void setFtvacctActivityDate(NDate value){
		this.setValue("FTVACCT_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtvacctActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVACCT_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFtvacctUserId(NString value){
		this.setValue("FTVACCT_USER_ID", value.getValue());
	}


	public NString getFtvacctUserId(){
		NString v = new NString((String)this.getValue("FTVACCT_USER_ID"));
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
