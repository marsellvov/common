package  net.hedtech.banner.finance.common.Fraprop.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;
import morphis.foundations.core.appdatalayer.data.DbManager;


public class FrrprptAdapter extends BaseRowAdapter{
	

	public FrrprptAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	// F2J_TODO : Item FRRPRPT_PROP_CODE has the "Copy Value from Item" property defined, with value: KEY_BLOCK.DISPLAY_FRBPROP_CODE                  
	
	public void setFrrprptPropCode(NString value){
		this.setValue("FRRPRPT_PROP_CODE", value.getValue());
	}


	public NString getFrrprptPropCode(){
		NString v = new NString((String)this.getValue("FRRPRPT_PROP_CODE"));
		return v;
	}


	
	
	public void setFrrprptAgencyCode(NString value){
		this.setValue("FRRPRPT_AGENCY_CODE", value.getValue());
	}


	public NString getFrrprptAgencyCode(){
		NString v = new NString((String)this.getValue("FRRPRPT_AGENCY_CODE"));
		return v;
	}


	
	
	public void setFrrprptAgcyPidm(NNumber value){
		this.setValue("FRRPRPT_AGCY_PIDM", value.getValue());
	}


	public NNumber getFrrprptAgcyPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRRPRPT_AGCY_PIDM"));
		return v;
	}


	
	
	public void setFrrprptAgcyName(NString value){
		this.setValue("FRRPRPT_AGCY_NAME", value.getValue());
	}


	public NString getFrrprptAgcyName(){
		NString v = new NString((String)this.getValue("FRRPRPT_AGCY_NAME"));
		return v;
	}


	
	
	public void setFrrprptFederalFundPercent(NNumber value){
		this.setValue("FRRPRPT_FEDERAL_FUND_PERCENT", value.getValue());
	}


	public NNumber getFrrprptFederalFundPercent(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRRPRPT_FEDERAL_FUND_PERCENT"));
		return v;
	}


	
	
	public void setFrrprptSponsorId(NString value){
		this.setValue("FRRPRPT_SPONSOR_ID", value.getValue());
	}


	public NString getFrrprptSponsorId(){
		NString v = new NString((String)this.getValue("FRRPRPT_SPONSOR_ID"));
		return v;
	}


	
	
	public void setFrrprptActivityDate(NDate value){
		this.setValue("FRRPRPT_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFrrprptActivityDate(){
		NDate v = new NDate((Date)this.getValue("FRRPRPT_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFrrprptUserId(NString value){
		this.setValue("FRRPRPT_USER_ID", value.getValue());
	}


	public NString getFrrprptUserId(){
		NString v = new NString((String)this.getValue("FRRPRPT_USER_ID"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
