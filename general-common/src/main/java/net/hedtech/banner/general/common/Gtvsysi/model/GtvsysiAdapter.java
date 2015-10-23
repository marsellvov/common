package  net.hedtech.banner.general.common.Gtvsysi.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GtvsysiAdapter extends BaseRowAdapter{
	

	public GtvsysiAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGtvsysiCode(NString value){
		this.setValue("GTVSYSI_CODE", value.getValue());
	}


	public NString getGtvsysiCode(){
		NString v = new NString((String)this.getValue("GTVSYSI_CODE"));
		return v;
	}


	
	
	public void setGtvsysiDesc(NString value){
		this.setValue("GTVSYSI_DESC", value.getValue());
	}


	public NString getGtvsysiDesc(){
		NString v = new NString((String)this.getValue("GTVSYSI_DESC"));
		return v;
	}


	
	
	public void setGtvsysiActivityDate(NDate value){
		this.setValue("GTVSYSI_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGtvsysiActivityDate(){
		NDate v = new NDate((Date)this.getValue("GTVSYSI_ACTIVITY_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
