package  net.hedtech.banner.general.common.Gxvdird.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GxvdirdAdapter extends BaseRowAdapter{
	

	public GxvdirdAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGxvdirdCodeBankRoutNum(NString value){
		this.setValue("GXVDIRD_CODE_BANK_ROUT_NUM", value.getValue());
	}


	public NString getGxvdirdCodeBankRoutNum(){
		NString v = new NString((String)this.getValue("GXVDIRD_CODE_BANK_ROUT_NUM"));
		return v;
	}


	
	
	public void setGxvdirdDesc(NString value){
		this.setValue("GXVDIRD_DESC", value.getValue());
	}


	public NString getGxvdirdDesc(){
		NString v = new NString((String)this.getValue("GXVDIRD_DESC"));
		return v;
	}


	
	
	public void setGxvdirdActivityDate(NDate value){
		this.setValue("GXVDIRD_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGxvdirdActivityDate(){
		NDate v = new NDate((Date)this.getValue("GXVDIRD_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setGxvdirdUserId(NString value){
		this.setValue("GXVDIRD_USER_ID", value.getValue());
	}


	public NString getGxvdirdUserId(){
		NString v = new NString((String)this.getValue("GXVDIRD_USER_ID"));
		return v;
	}


	
	
	public void setDelPending(NString value){
		this.setValue("DEL_PENDING", value.getValue());
	}


	public NString getDelPending(){
		NString v = new NString((String)this.getValue("DEL_PENDING"));
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
