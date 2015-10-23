package  net.hedtech.banner.finance.common.Ftvfund.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvfundAdapter extends BaseRowAdapter{
	
	public java.sql.RowId getROWID(){ 
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID); 
		}
	
	
	public FtvfundAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvfundCoasCode(NString value){
		this.setValue("FTVFUND_COAS_CODE", value.getValue());
	}


	public NString getFtvfundCoasCode(){
		NString v = new NString((String)this.getValue("FTVFUND_COAS_CODE"));
		return v;
	}


	
	
	public void setFtvfundFundCode(NString value){
		this.setValue("FTVFUND_FUND_CODE", value.getValue());
	}


	public NString getFtvfundFundCode(){
		NString v = new NString((String)this.getValue("FTVFUND_FUND_CODE"));
		return v;
	}


	
	
	public void setFtvfundFtypCode(NString value){
		this.setValue("FTVFUND_FTYP_CODE", value.getValue());
	}


	public NString getFtvfundFtypCode(){
		NString v = new NString((String)this.getValue("FTVFUND_FTYP_CODE"));
		return v;
	}


	
	
	public void setFtvfundTitle(NString value){
		this.setValue("FTVFUND_TITLE", value.getValue());
	}


	public NString getFtvfundTitle(){
		NString v = new NString((String)this.getValue("FTVFUND_TITLE"));
		return v;
	}


	
	
	public void setFtvfundDataEntryInd(NString value){
		this.setValue("FTVFUND_DATA_ENTRY_IND", value.getValue());
	}


	public NString getFtvfundDataEntryInd(){
		NString v = new NString((String)this.getValue("FTVFUND_DATA_ENTRY_IND"));
		return v;
	}


	
	
	public void setFtvfundStatusInd(NString value){
		this.setValue("FTVFUND_STATUS_IND", value.getValue());
	}


	public NString getFtvfundStatusInd(){
		NString v = new NString((String)this.getValue("FTVFUND_STATUS_IND"));
		return v;
	}


	
	
	public void setFtvfundEffDate(NDate value){
		this.setValue("FTVFUND_EFF_DATE", value.getValue());
	}


	public NDate getFtvfundEffDate(){
		NDate v = new NDate((Date)this.getValue("FTVFUND_EFF_DATE"));
		return v;
	}


	
	
	public void setFtvfundTermDate(NDate value){
		this.setValue("FTVFUND_TERM_DATE", value.getValue());
	}


	public NDate getFtvfundTermDate(){
		NDate v = new NDate((Date)this.getValue("FTVFUND_TERM_DATE"));
		return v;
	}


	
	
	public void setFtvfundActivityDate(NDate value){
		this.setValue("FTVFUND_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtvfundActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVFUND_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFtvfundUserId(NString value){
		this.setValue("FTVFUND_USER_ID", value.getValue());
	}


	public NString getFtvfundUserId(){
		NString v = new NString((String)this.getValue("FTVFUND_USER_ID"));
		return v;
	}


	
	
	public void setFtvfundGrntCode(NString value){
		this.setValue("FTVFUND_GRNT_CODE", value.getValue());
	}


	public NString getFtvfundGrntCode(){
		NString v = new NString((String)this.getValue("FTVFUND_GRNT_CODE"));
		return v;
	}


	
	
	public void setGrntDesc(NString value){
		this.setValue("GRNT_DESC", value.getValue());
	}


	public NString getGrntDesc(){
		NString v = new NString((String)this.getValue("GRNT_DESC"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
