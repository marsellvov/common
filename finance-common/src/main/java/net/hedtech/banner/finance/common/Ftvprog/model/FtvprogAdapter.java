package  net.hedtech.banner.finance.common.Ftvprog.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvprogAdapter extends BaseRowAdapter{
	

	public FtvprogAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvprogCoasCode(NString value){
		this.setValue("FTVPROG_COAS_CODE", value.getValue());
	}


	public NString getFtvprogCoasCode(){
		NString v = new NString((String)this.getValue("FTVPROG_COAS_CODE"));
		return v;
	}


	
	
	public void setFtvprogProgCode(NString value){
		this.setValue("FTVPROG_PROG_CODE", value.getValue());
	}


	public NString getFtvprogProgCode(){
		NString v = new NString((String)this.getValue("FTVPROG_PROG_CODE"));
		return v;
	}


	
	
	public void setFtvprogTitle(NString value){
		this.setValue("FTVPROG_TITLE", value.getValue());
	}


	public NString getFtvprogTitle(){
		NString v = new NString((String)this.getValue("FTVPROG_TITLE"));
		return v;
	}


	
	
	public void setFtvprogDataEntryInd(NString value){
		this.setValue("FTVPROG_DATA_ENTRY_IND", value.getValue());
	}


	public NString getFtvprogDataEntryInd(){
		NString v = new NString((String)this.getValue("FTVPROG_DATA_ENTRY_IND"));
		return v;
	}


	
	
	public void setFtvprogStatusInd(NString value){
		this.setValue("FTVPROG_STATUS_IND", value.getValue());
	}


	public NString getFtvprogStatusInd(){
		NString v = new NString((String)this.getValue("FTVPROG_STATUS_IND"));
		return v;
	}


	
	
	public void setFtvprogEffDate(NDate value){
		this.setValue("FTVPROG_EFF_DATE", value.getValue());
	}


	public NDate getFtvprogEffDate(){
		NDate v = new NDate((Date)this.getValue("FTVPROG_EFF_DATE"));
		return v;
	}


	
	
	public void setFtvprogTermDate(NDate value){
		this.setValue("FTVPROG_TERM_DATE", value.getValue());
	}


	public NDate getFtvprogTermDate(){
		NDate v = new NDate((Date)this.getValue("FTVPROG_TERM_DATE"));
		return v;
	}


	
	
	public void setFtvprogActivityDate(NDate value){
		this.setValue("FTVPROG_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtvprogActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVPROG_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFtvprogUserId(NString value){
		this.setValue("FTVPROG_USER_ID", value.getValue());
	}


	public NString getFtvprogUserId(){
		NString v = new NString((String)this.getValue("FTVPROG_USER_ID"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
