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


public class FrrprpiAdapter extends BaseRowAdapter{
	

	public FrrprpiAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFrrprpiId(NString value){
		this.setValue("FRRPRPI_ID", value.getValue());
	}


	public NString getFrrprpiId(){
		NString v = new NString((String)this.getValue("FRRPRPI_ID"));
		return v;
	}


	
	
	public void setFrrprpiIdName(NString value){
		this.setValue("FRRPRPI_ID_NAME", value.getValue());
	}


	public NString getFrrprpiIdName(){
		NString v = new NString((String)this.getValue("FRRPRPI_ID_NAME"));
		return v;
	}


	
	
	public void setFrrprpiCoas(NString value){
		this.setValue("FRRPRPI_COAS", value.getValue());
	}


	public NString getFrrprpiCoas(){
		NString v = new NString((String)this.getValue("FRRPRPI_COAS"));
		return v;
	}


	
	
	public void setFrrprpiIdInd(NString value){
		this.setValue("FRRPRPI_ID_IND", value.getValue());
	}


	public NString getFrrprpiIdInd(){
		NString v = new NString((String)this.getValue("FRRPRPI_ID_IND"));
		return v;
	}


	
	
	public void setFrrprpiIdIndName(NString value){
		this.setValue("FRRPRPI_ID_IND_NAME", value.getValue());
	}


	public NString getFrrprpiIdIndName(){
		NString v = new NString((String)this.getValue("FRRPRPI_ID_IND_NAME"));
		return v;
	}


	
	
	public void setFrrprpiOrgnCode(NString value){
		this.setValue("FRRPRPI_ORGN_CODE", value.getValue());
	}


	public NString getFrrprpiOrgnCode(){
		NString v = new NString((String)this.getValue("FRRPRPI_ORGN_CODE"));
		return v;
	}


	
	
	public void setFrrprpiOrgnCodeName(NString value){
		this.setValue("FRRPRPI_ORGN_CODE_NAME", value.getValue());
	}


	public NString getFrrprpiOrgnCodeName(){
		NString v = new NString((String)this.getValue("FRRPRPI_ORGN_CODE_NAME"));
		return v;
	}


	
	
	public void setFrrprpiSalutation(NString value){
		this.setValue("FRRPRPI_SALUTATION", value.getValue());
	}


	public NString getFrrprpiSalutation(){
		NString v = new NString((String)this.getValue("FRRPRPI_SALUTATION"));
		return v;
	}


	
	
	public void setFrrprpiTitle(NString value){
		this.setValue("FRRPRPI_TITLE", value.getValue());
	}


	public NString getFrrprpiTitle(){
		NString v = new NString((String)this.getValue("FRRPRPI_TITLE"));
		return v;
	}


	
	
	public void setFrrprpiFte(NNumber value){
		this.setValue("FRRPRPI_FTE", value.getValue());
	}


	public NNumber getFrrprpiFte(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRRPRPI_FTE"));
		return v;
	}


	
	
	public void setFrrprpiEmployeeInd(NString value){
		this.setValue("FRRPRPI_EMPLOYEE_IND", value.getValue());
	}


	public NString getFrrprpiEmployeeInd(){
		NString v = new NString((String)this.getValue("FRRPRPI_EMPLOYEE_IND"));
		return v;
	}


	
	// F2J_TODO : Item FRRPRPI_PROP_CODE has the "Copy Value from Item" property defined, with value: FRBPROP_CODE                  
	
	public void setFrrprpiPropCode(NString value){
		this.setValue("FRRPRPI_PROP_CODE", value.getValue());
	}


	public NString getFrrprpiPropCode(){
		NString v = new NString((String)this.getValue("FRRPRPI_PROP_CODE"));
		return v;
	}


	
	
	public void setFrrprpiActivityDate(NDate value){
		this.setValue("FRRPRPI_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFrrprpiActivityDate(){
		NDate v = new NDate((Date)this.getValue("FRRPRPI_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFrrprpiIdPidm(NNumber value){
		this.setValue("FRRPRPI_ID_PIDM", value.getValue());
	}


	public NNumber getFrrprpiIdPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRRPRPI_ID_PIDM"));
		return v;
	}


	
	
	public void setFrrprpiUserId(NString value){
		this.setValue("FRRPRPI_USER_ID", value.getValue());
	}


	public NString getFrrprpiUserId(){
		NString v = new NString((String)this.getValue("FRRPRPI_USER_ID"));
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
