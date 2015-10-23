package  net.hedtech.banner.finance.common.Foqolib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class RqpoSuspenseBlockAdapter extends BaseRowAdapter{
	

	public RqpoSuspenseBlockAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setRecordCount(NInteger value){
		this.setValue("RECORD_COUNT", value.getValue());
	}


	public NInteger getRecordCount(){
		NInteger v = new NInteger((Integer) this.getValue("RECORD_COUNT"));
		return v;
	}


	
	
	public void setSingleAcctgInd(NString value){
		this.setValue("SINGLE_ACCTG_IND", value.getValue());
	}


	public NString getSingleAcctgInd(){
		NString v = new NString((String)this.getValue("SINGLE_ACCTG_IND"));
		return v;
	}


	
	
	public void setAcctgSuspInd(NString value){
		this.setValue("ACCTG_SUSP_IND", value.getValue());
	}


	public NString getAcctgSuspInd(){
		NString v = new NString((String)this.getValue("ACCTG_SUSP_IND"));
		return v;
	}


	
	
	public void setAcctgNsfSuspInd(NString value){
		this.setValue("ACCTG_NSF_SUSP_IND", value.getValue());
	}


	public NString getAcctgNsfSuspInd(){
		NString v = new NString((String)this.getValue("ACCTG_NSF_SUSP_IND"));
		return v;
	}


	
	
	public void setCommSuspInd(NString value){
		this.setValue("COMM_SUSP_IND", value.getValue());
	}


	public NString getCommSuspInd(){
		NString v = new NString((String)this.getValue("COMM_SUSP_IND"));
		return v;
	}


	
	
	public void setAcctgSeqNo(NNumber value){
		this.setValue("ACCTG_SEQ_NO", value.getValue());
	}


	public NNumber getAcctgSeqNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("ACCTG_SEQ_NO"));
		return v;
	}


	
	
	public void setItemNo(NNumber value){
		this.setValue("ITEM_NO", value.getValue());
	}


	public NNumber getItemNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("ITEM_NO"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
