package  net.hedtech.banner.general.common.Guqintf.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GjbprunAdapter extends BaseRowAdapter{
	

	public GjbprunAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGjbprunJob(NString value){
		this.setValue("GJBPRUN_JOB", value.getValue());
	}


	public NString getGjbprunJob(){
		NString v = new NString((String)this.getValue("GJBPRUN_JOB"));
		return v;
	}


	
	
	public void setGjbprunDummy(NString value){
		this.setValue("GJBPRUN_DUMMY", value.getValue());
	}


	public NString getGjbprunDummy(){
		NString v = new NString((String)this.getValue("GJBPRUN_DUMMY"));
		return v;
	}


	
	
	public void setGjbprunOneUpNo(NNumber value){
		this.setValue("GJBPRUN_ONE_UP_NO", value.getValue());
	}


	public NNumber getGjbprunOneUpNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GJBPRUN_ONE_UP_NO"));
		return v;
	}


	
	
	public void setGjbprunNumber(NString value){
		this.setValue("GJBPRUN_NUMBER", value.getValue());
	}


	public NString getGjbprunNumber(){
		NString v = new NString((String)this.getValue("GJBPRUN_NUMBER"));
		return v;
	}


	
	
	public void setGjbprunActivityDate(NDate value){
		this.setValue("GJBPRUN_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGjbprunActivityDate(){
		NDate v = new NDate((Date)this.getValue("GJBPRUN_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setGjbprunValue(NString value){
		this.setValue("GJBPRUN_VALUE", value.getValue());
	}


	public NString getGjbprunValue(){
		NString v = new NString((String)this.getValue("GJBPRUN_VALUE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
