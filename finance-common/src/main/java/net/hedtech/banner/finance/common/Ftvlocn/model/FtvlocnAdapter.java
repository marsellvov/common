package  net.hedtech.banner.finance.common.Ftvlocn.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvlocnAdapter extends BaseRowAdapter{
	

	public FtvlocnAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvlocnCoasCode(NString value){
		this.setValue("FTVLOCN_COAS_CODE", value.getValue());
	}


	public NString getFtvlocnCoasCode(){
		NString v = new NString((String)this.getValue("FTVLOCN_COAS_CODE"));
		return v;
	}


	
	
	public void setFtvlocnLocnCode(NString value){
		this.setValue("FTVLOCN_LOCN_CODE", value.getValue());
	}


	public NString getFtvlocnLocnCode(){
		NString v = new NString((String)this.getValue("FTVLOCN_LOCN_CODE"));
		return v;
	}


	
	
	public void setFtvlocnTitle(NString value){
		this.setValue("FTVLOCN_TITLE", value.getValue());
	}


	public NString getFtvlocnTitle(){
		NString v = new NString((String)this.getValue("FTVLOCN_TITLE"));
		return v;
	}


	
	
	public void setFtvlocnStatusInd(NString value){
		this.setValue("FTVLOCN_STATUS_IND", value.getValue());
	}


	public NString getFtvlocnStatusInd(){
		NString v = new NString((String)this.getValue("FTVLOCN_STATUS_IND"));
		return v;
	}


	
	
	public void setFtvlocnEffDate(NDate value){
		this.setValue("FTVLOCN_EFF_DATE", value.getValue());
	}


	public NDate getFtvlocnEffDate(){
		NDate v = new NDate((Date)this.getValue("FTVLOCN_EFF_DATE"));
		return v;
	}


	
	
	public void setFtvlocnTermDate(NDate value){
		this.setValue("FTVLOCN_TERM_DATE", value.getValue());
	}


	public NDate getFtvlocnTermDate(){
		NDate v = new NDate((Date)this.getValue("FTVLOCN_TERM_DATE"));
		return v;
	}


	
	
	public void setFtvlocnActivityDate(NDate value){
		this.setValue("FTVLOCN_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtvlocnActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVLOCN_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFtvlocnUserId(NString value){
		this.setValue("FTVLOCN_USER_ID", value.getValue());
	}


	public NString getFtvlocnUserId(){
		NString v = new NString((String)this.getValue("FTVLOCN_USER_ID"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
