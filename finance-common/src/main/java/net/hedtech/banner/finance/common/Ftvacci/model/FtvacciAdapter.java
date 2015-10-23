package  net.hedtech.banner.finance.common.Ftvacci.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvacciAdapter extends BaseRowAdapter{
	

	public FtvacciAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvacciCoasCode(NString value){
		this.setValue("FTVACCI_COAS_CODE", value.getValue());
	}


	public NString getFtvacciCoasCode(){
		NString v = new NString((String)this.getValue("FTVACCI_COAS_CODE"));
		return v;
	}


	
	
	public void setFtvacciAcciCode(NString value){
		this.setValue("FTVACCI_ACCI_CODE", value.getValue());
	}


	public NString getFtvacciAcciCode(){
		NString v = new NString((String)this.getValue("FTVACCI_ACCI_CODE"));
		return v;
	}


	
	
	public void setFtvacciTitle(NString value){
		this.setValue("FTVACCI_TITLE", value.getValue());
	}


	public NString getFtvacciTitle(){
		NString v = new NString((String)this.getValue("FTVACCI_TITLE"));
		return v;
	}


	
	
	public void setFtvacciStatusInd(NString value){
		this.setValue("FTVACCI_STATUS_IND", value.getValue());
	}


	public NString getFtvacciStatusInd(){
		NString v = new NString((String)this.getValue("FTVACCI_STATUS_IND"));
		return v;
	}


	
	
	public void setFtvacciEffDate(NDate value){
		this.setValue("FTVACCI_EFF_DATE", value.getValue());
	}


	public NDate getFtvacciEffDate(){
		NDate v = new NDate((Date)this.getValue("FTVACCI_EFF_DATE"));
		return v;
	}


	
	
	public void setFtvacciTermDate(NDate value){
		this.setValue("FTVACCI_TERM_DATE", value.getValue());
	}


	public NDate getFtvacciTermDate(){
		NDate v = new NDate((Date)this.getValue("FTVACCI_TERM_DATE"));
		return v;
	}


	
	
	public void setFtvacciActivityDate(NDate value){
		this.setValue("FTVACCI_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtvacciActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVACCI_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFtvacciUserId(NString value){
		this.setValue("FTVACCI_USER_ID", value.getValue());
	}


	public NString getFtvacciUserId(){
		NString v = new NString((String)this.getValue("FTVACCI_USER_ID"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
