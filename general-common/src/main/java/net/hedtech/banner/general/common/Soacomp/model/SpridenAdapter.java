package  net.hedtech.banner.general.common.Soacomp.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class SpridenAdapter extends BaseRowAdapter{
	

	public SpridenAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setSpridenId(NString value){
		this.setValue("SPRIDEN_ID", value.getValue());
	}


	public NString getSpridenId(){
		NString v = new NString((String)this.getValue("SPRIDEN_ID"));
		return v;
	}


	
	
	public void setSpridenLastName(NString value){
		this.setValue("SPRIDEN_LAST_NAME", value.getValue());
	}


	public NString getSpridenLastName(){
		NString v = new NString((String)this.getValue("SPRIDEN_LAST_NAME"));
		return v;
	}


	
	
	public void setSpridenNtypCode(NString value){
		this.setValue("SPRIDEN_NTYP_CODE", value.getValue());
	}


	public NString getSpridenNtypCode(){
		NString v = new NString((String)this.getValue("SPRIDEN_NTYP_CODE"));
		return v;
	}


	
	
	public void setSpridenChangeInd(NString value){
		this.setValue("SPRIDEN_CHANGE_IND", value.getValue());
	}


	public NString getSpridenChangeInd(){
		NString v = new NString((String)this.getValue("SPRIDEN_CHANGE_IND"));
		return v;
	}


	
	
	public void setSpridenActivityDate(NDate value){
		this.setValue("SPRIDEN_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSpridenActivityDate(){
		NDate v = new NDate((Date)this.getValue("SPRIDEN_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setSpridenPidm(NNumber value){
		this.setValue("SPRIDEN_PIDM", value.getValue());
	}


	public NNumber getSpridenPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRIDEN_PIDM"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
