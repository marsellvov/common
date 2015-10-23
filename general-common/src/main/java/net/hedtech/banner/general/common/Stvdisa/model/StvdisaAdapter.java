package  net.hedtech.banner.general.common.Stvdisa.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class StvdisaAdapter extends BaseRowAdapter{
	

	public StvdisaAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setStvdisaCode(NString value){
		this.setValue("STVDISA_CODE", value.getValue());
	}


	public NString getStvdisaCode(){
		NString v = new NString((String)this.getValue("STVDISA_CODE"));
		return v;
	}


	
	
	public void setStvdisaDesc(NString value){
		this.setValue("STVDISA_DESC", value.getValue());
	}


	public NString getStvdisaDesc(){
		NString v = new NString((String)this.getValue("STVDISA_DESC"));
		return v;
	}


	
	
	public void setStvdisaActivityDate(NDate value){
		this.setValue("STVDISA_ACTIVITY_DATE", value.getValue());
	}


	public NDate getStvdisaActivityDate(){
		NDate v = new NDate((Date)this.getValue("STVDISA_ACTIVITY_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
