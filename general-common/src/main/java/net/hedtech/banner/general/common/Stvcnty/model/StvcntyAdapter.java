package  net.hedtech.banner.general.common.Stvcnty.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class StvcntyAdapter extends BaseRowAdapter{
	

	public StvcntyAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setStvcntyCode(NString value){
		this.setValue("STVCNTY_CODE", value.getValue());
	}


	public NString getStvcntyCode(){
		NString v = new NString((String)this.getValue("STVCNTY_CODE"));
		return v;
	}


	
	
	public void setStvcntyDesc(NString value){
		this.setValue("STVCNTY_DESC", value.getValue());
	}


	public NString getStvcntyDesc(){
		NString v = new NString((String)this.getValue("STVCNTY_DESC"));
		return v;
	}


	
	
	public void setStvcntyActivityDate(NDate value){
		this.setValue("STVCNTY_ACTIVITY_DATE", value.getValue());
	}


	public NDate getStvcntyActivityDate(){
		NDate v = new NDate((Date)this.getValue("STVCNTY_ACTIVITY_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
