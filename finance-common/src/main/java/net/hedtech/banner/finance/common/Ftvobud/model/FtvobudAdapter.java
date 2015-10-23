package  net.hedtech.banner.finance.common.Ftvobud.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvobudAdapter extends BaseRowAdapter{
	

	public FtvobudAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvobudCoasCode(NString value){
		this.setValue("FTVOBUD_COAS_CODE", value.getValue());
	}


	public NString getFtvobudCoasCode(){
		NString v = new NString((String)this.getValue("FTVOBUD_COAS_CODE"));
		return v;
	}


	
	
	public void setFtvobudObudCode(NString value){
		this.setValue("FTVOBUD_OBUD_CODE", value.getValue());
	}


	public NString getFtvobudObudCode(){
		NString v = new NString((String)this.getValue("FTVOBUD_OBUD_CODE"));
		return v;
	}


	
	
	public void setFtvobudBudgTitle(NString value){
		this.setValue("FTVOBUD_BUDG_TITLE", value.getValue());
	}


	public NString getFtvobudBudgTitle(){
		NString v = new NString((String)this.getValue("FTVOBUD_BUDG_TITLE"));
		return v;
	}


	
	
	public void setFtvobudYrsBudgeted(NNumber value){
		this.setValue("FTVOBUD_YRS_BUDGETED", value.getValue());
	}


	public NNumber getFtvobudYrsBudgeted(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FTVOBUD_YRS_BUDGETED"));
		return v;
	}


	
	
	public void setFtvobudBudgPrdType(NString value){
		this.setValue("FTVOBUD_BUDG_PRD_TYPE", value.getValue());
	}


	public NString getFtvobudBudgPrdType(){
		NString v = new NString((String)this.getValue("FTVOBUD_BUDG_PRD_TYPE"));
		return v;
	}


	
	
	public void setFtvobudActivityDate(NDate value){
		this.setValue("FTVOBUD_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtvobudActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVOBUD_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFtvobudUserId(NString value){
		this.setValue("FTVOBUD_USER_ID", value.getValue());
	}


	public NString getFtvobudUserId(){
		NString v = new NString((String)this.getValue("FTVOBUD_USER_ID"));
		return v;
	}


	
	
	public void setFtvobudBudgShortTitle(NString value){
		this.setValue("FTVOBUD_BUDG_SHORT_TITLE", value.getValue());
	}


	public NString getFtvobudBudgShortTitle(){
		NString v = new NString((String)this.getValue("FTVOBUD_BUDG_SHORT_TITLE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
