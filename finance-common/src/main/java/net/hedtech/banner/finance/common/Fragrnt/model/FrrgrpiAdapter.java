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



public class FrrgrpiAdapter extends BaseRowAdapter{
	

	public FrrgrpiAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFrrgrpiId(NString value){
		this.setValue("FRRGRPI_ID", value.getValue());
	}


	public NString getFrrgrpiId(){
		NString v = new NString((String)this.getValue("FRRGRPI_ID"));
		return v;
	}


	
	
	public void setFrrgrpiIdName(NString value){
		this.setValue("FRRGRPI_ID_NAME", value.getValue());
	}


	public NString getFrrgrpiIdName(){
		NString v = new NString((String)this.getValue("FRRGRPI_ID_NAME"));
		return v;
	}


	
	
	public void setFrrgrpiIdInd(NString value){
		this.setValue("FRRGRPI_ID_IND", value.getValue());
	}


	public NString getFrrgrpiIdInd(){
		NString v = new NString((String)this.getValue("FRRGRPI_ID_IND"));
		return v;
	}


	
	
	public void setFrrgrpiCoas(NString value){
		this.setValue("FRRGRPI_COAS", value.getValue());
	}


	public NString getFrrgrpiCoas(){
		NString v = new NString((String)this.getValue("FRRGRPI_COAS"));
		return v;
	}


	
	
	public void setFrrgrpiIdIndName(NString value){
		this.setValue("FRRGRPI_ID_IND_NAME", value.getValue());
	}


	public NString getFrrgrpiIdIndName(){
		NString v = new NString((String)this.getValue("FRRGRPI_ID_IND_NAME"));
		return v;
	}


	
	
	public void setFrrgrpiOrgnCode(NString value){
		this.setValue("FRRGRPI_ORGN_CODE", value.getValue());
	}


	public NString getFrrgrpiOrgnCode(){
		NString v = new NString((String)this.getValue("FRRGRPI_ORGN_CODE"));
		return v;
	}


	
	
	public void setFrrgrpiOrgnCodeName(NString value){
		this.setValue("FRRGRPI_ORGN_CODE_NAME", value.getValue());
	}


	public NString getFrrgrpiOrgnCodeName(){
		NString v = new NString((String)this.getValue("FRRGRPI_ORGN_CODE_NAME"));
		return v;
	}


	
	
	public void setFrrgrpiSalutation(NString value){
		this.setValue("FRRGRPI_SALUTATION", value.getValue());
	}


	public NString getFrrgrpiSalutation(){
		NString v = new NString((String)this.getValue("FRRGRPI_SALUTATION"));
		return v;
	}


	
	
	public void setFrrgrpiTitle(NString value){
		this.setValue("FRRGRPI_TITLE", value.getValue());
	}


	public NString getFrrgrpiTitle(){
		NString v = new NString((String)this.getValue("FRRGRPI_TITLE"));
		return v;
	}


	
	
	public void setFrrgrpiAddrType(NString value){
		this.setValue("FRRGRPI_ADDR_TYPE", value.getValue());
	}


	public NString getFrrgrpiAddrType(){
		NString v = new NString((String)this.getValue("FRRGRPI_ADDR_TYPE"));
		return v;
	}


	
	
	public void setFrrgrpiAddrSeqno(NNumber value){
		this.setValue("FRRGRPI_ADDR_SEQNO", value.getValue());
	}


	public NNumber getFrrgrpiAddrSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRRGRPI_ADDR_SEQNO"));
		return v;
	}


	
	
	public void setFrrgrpiPhoneType(NString value){
		this.setValue("FRRGRPI_PHONE_TYPE", value.getValue());
	}


	public NString getFrrgrpiPhoneType(){
		NString v = new NString((String)this.getValue("FRRGRPI_PHONE_TYPE"));
		return v;
	}


	
	
	public void setFrrgrpiTeleSeqno(NNumber value){
		this.setValue("FRRGRPI_TELE_SEQNO", value.getValue());
	}


	public NNumber getFrrgrpiTeleSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRRGRPI_TELE_SEQNO"));
		return v;
	}


	
	
	public void setFrrgrpiEmail(NString value){
		this.setValue("FRRGRPI_EMAIL", value.getValue());
	}


	public NString getFrrgrpiEmail(){
		NString v = new NString((String)this.getValue("FRRGRPI_EMAIL"));
		return v;
	}


	
	
	public void setFrrgrpiBfrmCode(NString value){
		this.setValue("FRRGRPI_BFRM_CODE", value.getValue());
	}


	public NString getFrrgrpiBfrmCode(){
		NString v = new NString((String)this.getValue("FRRGRPI_BFRM_CODE"));
		return v;
	}


	
	
	public void setBfrmName(NString value){
		this.setValue("BFRM_NAME", value.getValue());
	}


	public NString getBfrmName(){
		NString v = new NString((String)this.getValue("BFRM_NAME"));
		return v;
	}


	
	
	public void setFrrgrpiFte(NNumber value){
		this.setValue("FRRGRPI_FTE", value.getValue());
	}


	public NNumber getFrrgrpiFte(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRRGRPI_FTE"));
		return v;
	}


	
	
	public void setFrrgrpiEmployeeInd(NString value){
		this.setValue("FRRGRPI_EMPLOYEE_IND", value.getValue());
	}


	public NString getFrrgrpiEmployeeInd(){
		NString v = new NString((String)this.getValue("FRRGRPI_EMPLOYEE_IND"));
		return v;
	}


		
	public void setFrrgrpiGrntCode(NString value){
		this.setValue("FRRGRPI_GRNT_CODE", value.getValue());
	}


	public NString getFrrgrpiGrntCode(){
		NString v = new NString((String)this.getValue("FRRGRPI_GRNT_CODE"));
		return v;
	}


	
	
	public void setFrrgrpiActivityDate(NDate value){
		this.setValue("FRRGRPI_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFrrgrpiActivityDate(){
		NDate v = new NDate((Date)this.getValue("FRRGRPI_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFrrgrpiIdPidm(NNumber value){
		this.setValue("FRRGRPI_ID_PIDM", value.getValue());
	}


	public NNumber getFrrgrpiIdPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRRGRPI_ID_PIDM"));
		return v;
	}


	
	
	public void setFrrgrpiUserId(NString value){
		this.setValue("FRRGRPI_USER_ID", value.getValue());
	}


	public NString getFrrgrpiUserId(){
		NString v = new NString((String)this.getValue("FRRGRPI_USER_ID"));
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
