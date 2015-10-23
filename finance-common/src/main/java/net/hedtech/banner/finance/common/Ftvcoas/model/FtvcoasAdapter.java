package  net.hedtech.banner.finance.common.Ftvcoas.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvcoasAdapter extends BaseRowAdapter{
	

	public FtvcoasAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvcoasCoasCode(NString value){
		this.setValue("FTVCOAS_COAS_CODE", value.getValue());
	}


	public NString getFtvcoasCoasCode(){
		NString v = new NString((String)this.getValue("FTVCOAS_COAS_CODE"));
		return v;
	}


	
	
	public void setFtvcoasActivityDate(NDate value){
		this.setValue("FTVCOAS_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtvcoasActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVCOAS_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFtvcoasUserId(NString value){
		this.setValue("FTVCOAS_USER_ID", value.getValue());
	}


	public NString getFtvcoasUserId(){
		NString v = new NString((String)this.getValue("FTVCOAS_USER_ID"));
		return v;
	}


	
	
	public void setFtvcoasTitle(NString value){
		this.setValue("FTVCOAS_TITLE", value.getValue());
	}


	public NString getFtvcoasTitle(){
		NString v = new NString((String)this.getValue("FTVCOAS_TITLE"));
		return v;
	}


	
	
	public void setFtvcoasStatusInd(NString value){
		this.setValue("FTVCOAS_STATUS_IND", value.getValue());
	}


	public NString getFtvcoasStatusInd(){
		NString v = new NString((String)this.getValue("FTVCOAS_STATUS_IND"));
		return v;
	}


	
	
	public void setFtvcoasEffDate(NDate value){
		this.setValue("FTVCOAS_EFF_DATE", value.getValue());
	}


	public NDate getFtvcoasEffDate(){
		NDate v = new NDate((Date)this.getValue("FTVCOAS_EFF_DATE"));
		return v;
	}


	
	
	public void setFtvcoasTermDate(NDate value){
		this.setValue("FTVCOAS_TERM_DATE", value.getValue());
	}


	public NDate getFtvcoasTermDate(){
		NDate v = new NDate((Date)this.getValue("FTVCOAS_TERM_DATE"));
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
