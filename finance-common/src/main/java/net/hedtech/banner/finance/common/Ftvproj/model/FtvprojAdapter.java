package  net.hedtech.banner.finance.common.Ftvproj.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvprojAdapter extends BaseRowAdapter{
	

	public FtvprojAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvprojCoasCode(NString value){
		this.setValue("FTVPROJ_COAS_CODE", value.getValue());
	}


	public NString getFtvprojCoasCode(){
		NString v = new NString((String)this.getValue("FTVPROJ_COAS_CODE"));
		return v;
	}


	
	
	public void setFtvprojCode(NString value){
		this.setValue("FTVPROJ_CODE", value.getValue());
	}


	public NString getFtvprojCode(){
		NString v = new NString((String)this.getValue("FTVPROJ_CODE"));
		return v;
	}


	
	
	public void setFtvprojLongDesc(NString value){
		this.setValue("FTVPROJ_LONG_DESC", value.getValue());
	}


	public NString getFtvprojLongDesc(){
		NString v = new NString((String)this.getValue("FTVPROJ_LONG_DESC"));
		return v;
	}


	
	
	public void setFtvprojEffDate(NDate value){
		this.setValue("FTVPROJ_EFF_DATE", value.getValue());
	}


	public NDate getFtvprojEffDate(){
		NDate v = new NDate((Date)this.getValue("FTVPROJ_EFF_DATE"));
		return v;
	}


	
	
	public void setFtvprojTermDate(NDate value){
		this.setValue("FTVPROJ_TERM_DATE", value.getValue());
	}


	public NDate getFtvprojTermDate(){
		NDate v = new NDate((Date)this.getValue("FTVPROJ_TERM_DATE"));
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
