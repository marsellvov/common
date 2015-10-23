package  net.hedtech.banner.general.common.Noqlibr.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.StringHelper;
import morphis.foundations.core.appsupportlib.model.*;



public class NorcmntAdapter extends BaseRowAdapter{
	

	public NorcmntAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setNorcmntComments(NString value){
		this.setValue("NORCMNT_COMMENTS", value.getValue());
	}


	public NString getNorcmntComments(){
		NString v = new NString((String)this.getValue("NORCMNT_COMMENTS"));
		return v;
	}


	
	
	public void setNorcmntActivityDate(NDate value){
		this.setValue("NORCMNT_ACTIVITY_DATE", value.getValue());
	}


	public NDate getNorcmntActivityDate(){
		NDate v = new NDate((Date)this.getValue("NORCMNT_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setNorcmntUserId(NString value){
		this.setValue("NORCMNT_USER_ID", value.getValue());
	}


	public NString getNorcmntUserId(){
		NString v = new NString((String)this.getValue("NORCMNT_USER_ID"));
		return v;
	}


	
	
	public void setNorcmntTransactionNo(NNumber value){
		this.setValue("NORCMNT_TRANSACTION_NO", value.getValue());
	}


	public NNumber getNorcmntTransactionNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("NORCMNT_TRANSACTION_NO"));
		return v;
	}


	
	
	public void setNorcmntDataOrigin(NString value){
		this.setValue("NORCMNT_DATA_ORIGIN", value.getValue());
	}


	public NString getNorcmntDataOrigin(){
		NString v = new NString((String)this.getValue("NORCMNT_DATA_ORIGIN"));
		return v;
	}


	
	
	public void setNorcmntSeqNo(NNumber value){
		this.setValue("NORCMNT_SEQ_NO", value.getValue());
	}


	public NNumber getNorcmntSeqNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("NORCMNT_SEQ_NO"));
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
	
	public void setROWID(NString rowId){
		this.setROWID(rowId.getValue().getBytes());
	}
	
}
