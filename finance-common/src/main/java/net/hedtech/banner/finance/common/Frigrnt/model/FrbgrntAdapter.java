package  net.hedtech.banner.finance.common.Frigrnt.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FrbgrntAdapter extends BaseRowAdapter{
	

	public FrbgrntAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFrbgrntCode(NString value){
		this.setValue("FRBGRNT_CODE", value.getValue());
	}


	public NString getFrbgrntCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_CODE"));
		return v;
	}


	
	
	public void setFrbgrntTitle(NString value){
		this.setValue("FRBGRNT_TITLE", value.getValue());
	}


	public NString getFrbgrntTitle(){
		NString v = new NString((String)this.getValue("FRBGRNT_TITLE"));
		return v;
	}


	
	
	public void setPiId(NString value){
		this.setValue("PI_ID", value.getValue());
	}


	public NString getPiId(){
		NString v = new NString((String)this.getValue("PI_ID"));
		return v;
	}


	
	
	public void setFrbgrntPiPidm(NNumber value){
		this.setValue("FRBGRNT_PI_PIDM", value.getValue());
	}


	public NNumber getFrbgrntPiPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_PI_PIDM"));
		return v;
	}


	
	
	public void setPiLastName(NString value){
		this.setValue("PI_LAST_NAME", value.getValue());
	}


	public NString getPiLastName(){
		NString v = new NString((String)this.getValue("PI_LAST_NAME"));
		return v;
	}


	
	
	public void setPiFirstName(NString value){
		this.setValue("PI_FIRST_NAME", value.getValue());
	}


	public NString getPiFirstName(){
		NString v = new NString((String)this.getValue("PI_FIRST_NAME"));
		return v;
	}


	
	
	public void setAgencyId(NString value){
		this.setValue("AGENCY_ID", value.getValue());
	}


	public NString getAgencyId(){
		NString v = new NString((String)this.getValue("AGENCY_ID"));
		return v;
	}


	
	
	public void setAgencyName(NString value){
		this.setValue("AGENCY_NAME", value.getValue());
	}


	public NString getAgencyName(){
		NString v = new NString((String)this.getValue("AGENCY_NAME"));
		return v;
	}


	
	
	public void setFrbgrntAgencyPidm(NNumber value){
		this.setValue("FRBGRNT_AGENCY_PIDM", value.getValue());
	}


	public NNumber getFrbgrntAgencyPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_AGENCY_PIDM"));
		return v;
	}


	
	
	public void setFrbgrntCurrentFundingAmt(NNumber value){
		this.setValue("FRBGRNT_CURRENT_FUNDING_AMT", value.getValue());
	}


	public NNumber getFrbgrntCurrentFundingAmt(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_CURRENT_FUNDING_AMT"));
		return v;
	}


	
	
	public void setFrbgrntCumFundingAmt(NNumber value){
		this.setValue("FRBGRNT_CUM_FUNDING_AMT", value.getValue());
	}


	public NNumber getFrbgrntCumFundingAmt(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_CUM_FUNDING_AMT"));
		return v;
	}


	
	
	public void setFrbgrntMaxFundingAmt(NNumber value){
		this.setValue("FRBGRNT_MAX_FUNDING_AMT", value.getValue());
	}


	public NNumber getFrbgrntMaxFundingAmt(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_MAX_FUNDING_AMT"));
		return v;
	}


	
	
	public void setFrbgrntStatusCode(NString value){
		this.setValue("FRBGRNT_STATUS_CODE", value.getValue());
	}


	public NString getFrbgrntStatusCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_STATUS_CODE"));
		return v;
	}


	
	
	public void setFrbgrntAlternateStatusDesc(NString value){
		this.setValue("FRBGRNT_ALTERNATE_STATUS_DESC", value.getValue());
	}


	public NString getFrbgrntAlternateStatusDesc(){
		NString v = new NString((String)this.getValue("FRBGRNT_ALTERNATE_STATUS_DESC"));
		return v;
	}


	
	
	public void setFrbgrntStatusDesc(NString value){
		this.setValue("FRBGRNT_STATUS_DESC", value.getValue());
	}


	public NString getFrbgrntStatusDesc(){
		NString v = new NString((String)this.getValue("FRBGRNT_STATUS_DESC"));
		return v;
	}


	
	
	public void setFrbgrntStatusDate(NDate value){
		this.setValue("FRBGRNT_STATUS_DATE", value.getValue());
	}


	public NDate getFrbgrntStatusDate(){
		NDate v = new NDate((Date)this.getValue("FRBGRNT_STATUS_DATE"));
		return v;
	}


	
	
	public void setFrbgrntProjectStartDate(NDate value){
		this.setValue("FRBGRNT_PROJECT_START_DATE", value.getValue());
	}


	public NDate getFrbgrntProjectStartDate(){
		NDate v = new NDate((Date)this.getValue("FRBGRNT_PROJECT_START_DATE"));
		return v;
	}


	
	
	public void setFrbgrntProjectEndDate(NDate value){
		this.setValue("FRBGRNT_PROJECT_END_DATE", value.getValue());
	}


	public NDate getFrbgrntProjectEndDate(){
		NDate v = new NDate((Date)this.getValue("FRBGRNT_PROJECT_END_DATE"));
		return v;
	}


	
	
	public void setFrbgrntSponsorId(NString value){
		this.setValue("FRBGRNT_SPONSOR_ID", value.getValue());
	}


	public NString getFrbgrntSponsorId(){
		NString v = new NString((String)this.getValue("FRBGRNT_SPONSOR_ID"));
		return v;
	}


	
	
	public void setFrbgrntCoasCode(NString value){
		this.setValue("FRBGRNT_COAS_CODE", value.getValue());
	}


	public NString getFrbgrntCoasCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_COAS_CODE"));
		return v;
	}


	
	
	public void setFrbgrntOrgnCodeRespOffice(NString value){
		this.setValue("FRBGRNT_ORGN_CODE_RESP_OFFICE", value.getValue());
	}


	public NString getFrbgrntOrgnCodeRespOffice(){
		NString v = new NString((String)this.getValue("FRBGRNT_ORGN_CODE_RESP_OFFICE"));
		return v;
	}


	
	
	public void setOrgnDesc(NString value){
		this.setValue("ORGN_DESC", value.getValue());
	}


	public NString getOrgnDesc(){
		NString v = new NString((String)this.getValue("ORGN_DESC"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
