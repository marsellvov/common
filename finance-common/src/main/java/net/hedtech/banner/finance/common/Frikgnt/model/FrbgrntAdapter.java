package  net.hedtech.banner.finance.common.Frikgnt.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FrbgrntAdapter extends BaseRowAdapter{
	

	public FrbgrntAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFrbgrntCode(NString value){
		this.setValue("FRBGRNT_CODE", value.getValue());
	}


	public NString getFrbgrntCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_CODE"));
		return v;
	}


	
	
	public void setFrbgrntPropCode(NString value){
		this.setValue("FRBGRNT_PROP_CODE", value.getValue());
	}


	public NString getFrbgrntPropCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_PROP_CODE"));
		return v;
	}


	
	
	public void setFrbgrntStatusCode(NString value){
		this.setValue("FRBGRNT_STATUS_CODE", value.getValue());
	}


	public NString getFrbgrntStatusCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_STATUS_CODE"));
		return v;
	}


	
	
	public void setFrbgrntTitle(NString value){
		this.setValue("FRBGRNT_TITLE", value.getValue());
	}


	public NString getFrbgrntTitle(){
		NString v = new NString((String)this.getValue("FRBGRNT_TITLE"));
		return v;
	}


	
	
	public void setFrbgrntStatusDate(NDate value){
		this.setValue("FRBGRNT_STATUS_DATE", value.getValue());
	}


	public NDate getFrbgrntStatusDate(){
		NDate v = new NDate((Date)this.getValue("FRBGRNT_STATUS_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
