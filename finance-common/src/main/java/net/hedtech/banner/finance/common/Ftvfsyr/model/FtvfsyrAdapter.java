package  net.hedtech.banner.finance.common.Ftvfsyr.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FtvfsyrAdapter extends BaseRowAdapter{
	

	public FtvfsyrAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFtvfsyrCoasCode(NString value){
		this.setValue("FTVFSYR_COAS_CODE", value.getValue());
	}


	public NString getFtvfsyrCoasCode(){
		NString v = new NString((String)this.getValue("FTVFSYR_COAS_CODE"));
		return v;
	}


	
	
	public void setFtvfsyrFsyrCode(NString value){
		this.setValue("FTVFSYR_FSYR_CODE", value.getValue());
	}


	public NString getFtvfsyrFsyrCode(){
		NString v = new NString((String)this.getValue("FTVFSYR_FSYR_CODE"));
		return v;
	}


	
	
	public void setFtvfsyrStartDate(NDate value){
		this.setValue("FTVFSYR_START_DATE", value.getValue());
	}


	public NDate getFtvfsyrStartDate(){
		NDate v = new NDate((Date)this.getValue("FTVFSYR_START_DATE"));
		return v;
	}


	
	
	public void setFtvfsyrEndDate(NDate value){
		this.setValue("FTVFSYR_END_DATE", value.getValue());
	}


	public NDate getFtvfsyrEndDate(){
		NDate v = new NDate((Date)this.getValue("FTVFSYR_END_DATE"));
		return v;
	}


	
	
	public void setCurrentPeriod(NString value){
		this.setValue("CURRENT_PERIOD", value.getValue());
	}


	public NString getCurrentPeriod(){
		NString v = new NString((String)this.getValue("CURRENT_PERIOD"));
		return v;
	}


	
	
	public void setCurrentPeriodStartDate(NDate value){
		this.setValue("CURRENT_PERIOD_START_DATE", value.getValue());
	}


	public NDate getCurrentPeriodStartDate(){
		NDate v = new NDate((Date)this.getValue("CURRENT_PERIOD_START_DATE"));
		return v;
	}


	
	
	public void setCurrentPeriodEndDate(NDate value){
		this.setValue("CURRENT_PERIOD_END_DATE", value.getValue());
	}


	public NDate getCurrentPeriodEndDate(){
		NDate v = new NDate((Date)this.getValue("CURRENT_PERIOD_END_DATE"));
		return v;
	}


	
	
	public void setEarliestOpenPeriod(NString value){
		this.setValue("EARLIEST_OPEN_PERIOD", value.getValue());
	}


	public NString getEarliestOpenPeriod(){
		NString v = new NString((String)this.getValue("EARLIEST_OPEN_PERIOD"));
		return v;
	}


	
	
	public void setFtvfsyrEoyAccrStatusInd(NString value){
		this.setValue("FTVFSYR_EOY_ACCR_STATUS_IND", value.getValue());
	}


	public NString getFtvfsyrEoyAccrStatusInd(){
		NString v = new NString((String)this.getValue("FTVFSYR_EOY_ACCR_STATUS_IND"));
		return v;
	}


	
	
	public void setFtvfsyrActivityDate(NDate value){
		this.setValue("FTVFSYR_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFtvfsyrActivityDate(){
		NDate v = new NDate((Date)this.getValue("FTVFSYR_ACTIVITY_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
