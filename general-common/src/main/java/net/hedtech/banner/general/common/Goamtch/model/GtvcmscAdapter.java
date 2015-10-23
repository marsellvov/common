package  net.hedtech.banner.general.common.Goamtch.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GtvcmscAdapter extends BaseRowAdapter{
	

	public GtvcmscAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGtvcmscCode(NString value){
		this.setValue("GTVCMSC_CODE", value.getValue());
	}


	public NString getGtvcmscCode(){
		NString v = new NString((String)this.getValue("GTVCMSC_CODE"));
		return v;
	}


	
	
	public void setGtvcmscDesc(NString value){
		this.setValue("GTVCMSC_DESC", value.getValue());
	}


	public NString getGtvcmscDesc(){
		NString v = new NString((String)this.getValue("GTVCMSC_DESC"));
		return v;
	}


	
	
	public void setGtvcmscLongDesc(NString value){
		this.setValue("GTVCMSC_LONG_DESC", value.getValue());
	}


	public NString getGtvcmscLongDesc(){
		NString v = new NString((String)this.getValue("GTVCMSC_LONG_DESC"));
		return v;
	}


	
	
	public void setLongDesc(NString value){
		this.setValue("LONG_DESC", value.getValue());
	}


	public NString getLongDesc(){
		NString v = new NString((String)this.getValue("LONG_DESC"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
