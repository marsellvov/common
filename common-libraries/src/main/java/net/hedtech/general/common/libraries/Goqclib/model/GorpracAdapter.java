package  net.hedtech.general.common.libraries.Goqclib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;



public class GorpracAdapter extends BaseRowAdapter{
	

	public GorpracAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGorpracRaceCde(NString value){
		this.setValue("GORPRAC_RACE_CDE", value.getValue());
	}


	public NString getGorpracRaceCde(){
		NString v = new NString((String)this.getValue("GORPRAC_RACE_CDE"));
		return v;
	}


	
	
	public void setRaceDesc(NString value){
		this.setValue("RACE_DESC", value.getValue());
	}


	public NString getRaceDesc(){
		NString v = new NString((String)this.getValue("RACE_DESC"));
		return v;
	}


	
	
	public void setGorpracUserId(NString value){
		this.setValue("GORPRAC_USER_ID", value.getValue());
	}


	public NString getGorpracUserId(){
		NString v = new NString((String)this.getValue("GORPRAC_USER_ID"));
		return v;
	}


	
	
	public void setGorpracActivityDate(NDate value){
		this.setValue("GORPRAC_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGorpracActivityDate(){
		NDate v = new NDate((Date)this.getValue("GORPRAC_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setGorpracPidm(NNumber value){
		this.setValue("GORPRAC_PIDM", value.getValue());
	}


	public NNumber getGorpracPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GORPRAC_PIDM"));
		return v;
	}


	
	
	public void setGorpracDataOrigin(NString value){
		this.setValue("GORPRAC_DATA_ORIGIN", value.getValue());
	}


	public NString getGorpracDataOrigin(){
		NString v = new NString((String)this.getValue("GORPRAC_DATA_ORIGIN"));
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
}
