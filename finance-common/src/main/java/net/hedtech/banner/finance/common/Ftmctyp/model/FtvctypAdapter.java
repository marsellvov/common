package  net.hedtech.banner.finance.common.Ftmctyp.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvctypAdapter extends BaseRowAdapter{
	

	public FtvctypAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvctypUserId(NString value){
		this.setValue("FTVCTYP_USER_ID", value.getValue());
	}


	public NString getFtvctypUserId(){
		NString v = new NString((String)this.getValue("FTVCTYP_USER_ID"));
		return v;
	}


	
	
	public void setFtvctypActivityDate(NDate value){
		this.setValue("FTVCTYP_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtvctypActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVCTYP_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFtvctypCode(NString value){
		this.setValue("FTVCTYP_CODE", value.getValue());
	}


	public NString getFtvctypCode(){
		NString v = new NString((String)this.getValue("FTVCTYP_CODE"));
		return v;
	}


	
	
	public void setFtvctypShortDesc(NString value){
		this.setValue("FTVCTYP_SHORT_DESC", value.getValue());
	}


	public NString getFtvctypShortDesc(){
		NString v = new NString((String)this.getValue("FTVCTYP_SHORT_DESC"));
		return v;
	}


	
	
	public void setFtvctypLongDesc(NString value){
		this.setValue("FTVCTYP_LONG_DESC", value.getValue());
	}


	public NString getFtvctypLongDesc(){
		NString v = new NString((String)this.getValue("FTVCTYP_LONG_DESC"));
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
