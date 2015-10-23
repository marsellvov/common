package  net.hedtech.banner.finance.common.Ftvactv.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvactvAdapter extends BaseRowAdapter{
	

	public FtvactvAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvactvCoasCode(NString value){
		this.setValue("FTVACTV_COAS_CODE", value.getValue());
	}


	public NString getFtvactvCoasCode(){
		NString v = new NString((String)this.getValue("FTVACTV_COAS_CODE"));
		return v;
	}


	
	
	public void setFtvactvActvCode(NString value){
		this.setValue("FTVACTV_ACTV_CODE", value.getValue());
	}


	public NString getFtvactvActvCode(){
		NString v = new NString((String)this.getValue("FTVACTV_ACTV_CODE"));
		return v;
	}


	
	
	public void setFtvactvTitle(NString value){
		this.setValue("FTVACTV_TITLE", value.getValue());
	}


	public NString getFtvactvTitle(){
		NString v = new NString((String)this.getValue("FTVACTV_TITLE"));
		return v;
	}


	
	
	public void setFtvactvStatusInd(NString value){
		this.setValue("FTVACTV_STATUS_IND", value.getValue());
	}


	public NString getFtvactvStatusInd(){
		NString v = new NString((String)this.getValue("FTVACTV_STATUS_IND"));
		return v;
	}


	
	
	public void setFtvactvEffDate(NDate value){
		this.setValue("FTVACTV_EFF_DATE", value.getValue());
	}


	public NDate getFtvactvEffDate(){
		NDate v = new NDate((Date)this.getValue("FTVACTV_EFF_DATE"));
		return v;
	}


	
	
	public void setFtvactvTermDate(NDate value){
		this.setValue("FTVACTV_TERM_DATE", value.getValue());
	}


	public NDate getFtvactvTermDate(){
		NDate v = new NDate((Date)this.getValue("FTVACTV_TERM_DATE"));
		return v;
	}


	
	
	public void setFtvactvActivityDate(NDate value){
		this.setValue("FTVACTV_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtvactvActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVACTV_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFtvactvUserId(NString value){
		this.setValue("FTVACTV_USER_ID", value.getValue());
	}


	public NString getFtvactvUserId(){
		NString v = new NString((String)this.getValue("FTVACTV_USER_ID"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
