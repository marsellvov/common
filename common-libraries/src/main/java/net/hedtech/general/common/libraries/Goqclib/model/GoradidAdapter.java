package  net.hedtech.general.common.libraries.Goqclib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;



public class GoradidAdapter extends BaseRowAdapter{
	

	public GoradidAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGoradidAdidCode(NString value){
		this.setValue("GORADID_ADID_CODE", value.getValue());
	}


	public NString getGoradidAdidCode(){
		NString v = new NString((String)this.getValue("GORADID_ADID_CODE"));
		return v;
	}


	
	
	public void setAdidDesc(NString value){
		this.setValue("ADID_DESC", value.getValue());
	}


	public NString getAdidDesc(){
		NString v = new NString((String)this.getValue("ADID_DESC"));
		return v;
	}


	
	
	public void setGoradidAdditionalId(NString value){
		this.setValue("GORADID_ADDITIONAL_ID", value.getValue());
	}


	public NString getGoradidAdditionalId(){
		NString v = new NString((String)this.getValue("GORADID_ADDITIONAL_ID"));
		return v;
	}


	
	
	public void setGoradidActivityDate(NDate value){
		this.setValue("GORADID_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGoradidActivityDate(){
		NDate v = new NDate((Date)this.getValue("GORADID_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setGoradidUserId(NString value){
		this.setValue("GORADID_USER_ID", value.getValue());
	}


	public NString getGoradidUserId(){
		NString v = new NString((String)this.getValue("GORADID_USER_ID"));
		return v;
	}


	
	
	public void setGoradidDataOrigin(NString value){
		this.setValue("GORADID_DATA_ORIGIN", value.getValue());
	}


	public NString getGoradidDataOrigin(){
		NString v = new NString((String)this.getValue("GORADID_DATA_ORIGIN"));
		return v;
	}


	
	
	public void setGoradidPidm(NNumber value){
		this.setValue("GORADID_PIDM", value.getValue());
	}


	public NNumber getGoradidPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GORADID_PIDM"));
		return v;
	}


	

	public  java.sql.RowId getROWID(){
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID);
	}
	
	public void setROWID(byte[] bytes) {
		this.setValue(DAOConfiguration.MODEL_ROWID, DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
}
