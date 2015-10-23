package  net.hedtech.banner.finance.common.Fragrnt.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FrrgrecAdapter extends BaseRowAdapter{
	

	public FrrgrecAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFrrgrecAcctElement(NString value){
		this.setValue("FRRGREC_ACCT_ELEMENT", value.getValue());
	}


	public NString getFrrgrecAcctElement(){
		NString v = new NString((String)this.getValue("FRRGREC_ACCT_ELEMENT"));
		return v;
	}


	
	
	public void setFrrgrecCoasCode(NString value){
		this.setValue("FRRGREC_COAS_CODE", value.getValue());
	}


	public NString getFrrgrecCoasCode(){
		NString v = new NString((String)this.getValue("FRRGREC_COAS_CODE"));
		return v;
	}


	
	
	public void setFrrgrecAcctElementValue(NString value){
		this.setValue("FRRGREC_ACCT_ELEMENT_VALUE", value.getValue());
	}


	public NString getFrrgrecAcctElementValue(){
		NString v = new NString((String)this.getValue("FRRGREC_ACCT_ELEMENT_VALUE"));
		return v;
	}


	
	
	public void setFrrgrecAcctElementValueDes(NString value){
		this.setValue("FRRGREC_ACCT_ELEMENT_VALUE_DES", value.getValue());
	}


	public NString getFrrgrecAcctElementValueDes(){
		NString v = new NString((String)this.getValue("FRRGREC_ACCT_ELEMENT_VALUE_DES"));
		return v;
	}


	
	
	public void setFrrgrecEccgCode(NString value){
		this.setValue("FRRGREC_ECCG_CODE", value.getValue());
	}


	public NString getFrrgrecEccgCode(){
		NString v = new NString((String)this.getValue("FRRGREC_ECCG_CODE"));
		return v;
	}


	
	
	public void setFrrgrecReportSection(NString value){
		this.setValue("FRRGREC_REPORT_SECTION", value.getValue());
	}


	public NString getFrrgrecReportSection(){
		NString v = new NString((String)this.getValue("FRRGREC_REPORT_SECTION"));
		return v;
	}


	
	
	public void setFrrgrecChargeType(NString value){
		this.setValue("FRRGREC_CHARGE_TYPE", value.getValue());
	}


	public NString getFrrgrecChargeType(){
		NString v = new NString((String)this.getValue("FRRGREC_CHARGE_TYPE"));
		return v;
	}


	
	
	public void setFrrgrecGrntCode(NString value){
		this.setValue("FRRGREC_GRNT_CODE", value.getValue());
	}


	public NString getFrrgrecGrntCode(){
		NString v = new NString((String)this.getValue("FRRGREC_GRNT_CODE"));
		return v;
	}


	
	
	public void setFrrgrecActivityDate(NDate value){
		this.setValue("FRRGREC_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFrrgrecActivityDate(){
		NDate v = new NDate((Date)this.getValue("FRRGREC_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFrrgrecId(NNumber value){
		this.setValue("FRRGREC_ID", value.getValue());
	}


	public NNumber getFrrgrecId(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRRGREC_ID"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
	public java.sql.RowId getROWID(){ 
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID); 
		}
}
