package  net.hedtech.banner.general.common.Guagmnu.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class MessagesAdapter extends BaseRowAdapter{
	

	public MessagesAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGurtklrTodoDate(NDate value){
		this.setValue("GURTKLR_TODO_DATE", value.getValue());
	}


	public NDate getGurtklrTodoDate(){
		NDate v = new NDate((Date)this.getValue("GURTKLR_TODO_DATE"));
		return v;
	}


	
	
	public void setGurtklrComment(NString value){
		this.setValue("GURTKLR_COMMENT", value.getValue());
	}


	public NString getGurtklrComment(){
		NString v = new NString((String)this.getValue("GURTKLR_COMMENT"));
		return v;
	}


	
	
	public void setGurtklrActivityDate(NDate value){
		this.setValue("GURTKLR_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGurtklrActivityDate(){
		NDate v = new NDate((Date)this.getValue("GURTKLR_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setGurtklrTodoTime(NNumber value){
		this.setValue("GURTKLR_TODO_TIME", value.getValue());
	}


	public NNumber getGurtklrTodoTime(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GURTKLR_TODO_TIME"));
		return v;
	}


	public java.sql.RowId getROWID(){ 
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID); 
		}
		

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
