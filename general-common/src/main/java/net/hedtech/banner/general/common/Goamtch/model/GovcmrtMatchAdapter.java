package  net.hedtech.banner.general.common.Goamtch.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GovcmrtMatchAdapter extends BaseRowAdapter{
	

	public GovcmrtMatchAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setMatchId(NString value){
		this.setValue("MATCH_ID", value.getValue());
	}


	public NString getMatchId(){
		NString v = new NString((String)this.getValue("MATCH_ID"));
		return v;
	}


	
	
	public void setMatchName(NString value){
		this.setValue("MATCH_NAME", value.getValue());
	}


	public NString getMatchName(){
		NString v = new NString((String)this.getValue("MATCH_NAME"));
		return v;
	}


	
	
	public void setMatchSsn(NString value){
		this.setValue("MATCH_SSN", value.getValue());
	}


	public NString getMatchSsn(){
		NString v = new NString((String)this.getValue("MATCH_SSN"));
		return v;
	}


	
	
	public void setMatchBirthDate(NDate value){
		this.setValue("MATCH_BIRTH_DATE", value.getValue());
	}


	public NDate getMatchBirthDate(){
		NDate v = new NDate((Date)this.getValue("MATCH_BIRTH_DATE"));
		return v;
	}


	
	
	public void setMatchSex(NString value){
		this.setValue("MATCH_SEX", value.getValue());
	}


	public NString getMatchSex(){
		NString v = new NString((String)this.getValue("MATCH_SEX"));
		return v;
	}


	
	
	public void setMatchAtypDescription(NString value){
		this.setValue("MATCH_ATYP_DESCRIPTION", value.getValue());
	}


	public NString getMatchAtypDescription(){
		NString v = new NString((String)this.getValue("MATCH_ATYP_DESCRIPTION"));
		return v;
	}


	
	
	public void setMatchAddressStatusInd(NString value){
		this.setValue("MATCH_ADDRESS_STATUS_IND", value.getValue());
	}


	public NString getMatchAddressStatusInd(){
		NString v = new NString((String)this.getValue("MATCH_ADDRESS_STATUS_IND"));
		return v;
	}


	
	
	public void setMatchStreetLine1(NString value){
		this.setValue("MATCH_STREET_LINE1", value.getValue());
	}


	public NString getMatchStreetLine1(){
		NString v = new NString((String)this.getValue("MATCH_STREET_LINE1"));
		return v;
	}


	
	
	public void setMatchStreetLine2(NString value){
		this.setValue("MATCH_STREET_LINE2", value.getValue());
	}


	public NString getMatchStreetLine2(){
		NString v = new NString((String)this.getValue("MATCH_STREET_LINE2"));
		return v;
	}


	
	
	public void setMatchStreetLine3(NString value){
		this.setValue("MATCH_STREET_LINE3", value.getValue());
	}


	public NString getMatchStreetLine3(){
		NString v = new NString((String)this.getValue("MATCH_STREET_LINE3"));
		return v;
	}


	
	
	public void setMatchCityStateZip(NString value){
		this.setValue("MATCH_CITY_STATE_ZIP", value.getValue());
	}


	public NString getMatchCityStateZip(){
		NString v = new NString((String)this.getValue("MATCH_CITY_STATE_ZIP"));
		return v;
	}


	
	
	public void setMatchCounty(NString value){
		this.setValue("MATCH_COUNTY", value.getValue());
	}


	public NString getMatchCounty(){
		NString v = new NString((String)this.getValue("MATCH_COUNTY"));
		return v;
	}


	
	
	public void setMatchCountyNation(NString value){
		this.setValue("MATCH_COUNTY_NATION", value.getValue());
	}


	public NString getMatchCountyNation(){
		NString v = new NString((String)this.getValue("MATCH_COUNTY_NATION"));
		return v;
	}


	
	
	public void setMatchNation(NString value){
		this.setValue("MATCH_NATION", value.getValue());
	}


	public NString getMatchNation(){
		NString v = new NString((String)this.getValue("MATCH_NATION"));
		return v;
	}


	
	
	public void setMatchPhone(NString value){
		this.setValue("MATCH_PHONE", value.getValue());
	}


	public NString getMatchPhone(){
		NString v = new NString((String)this.getValue("MATCH_PHONE"));
		return v;
	}


	
	
	public void setMatchEmail(NString value){
		this.setValue("MATCH_EMAIL", value.getValue());
	}


	public NString getMatchEmail(){
		NString v = new NString((String)this.getValue("MATCH_EMAIL"));
		return v;
	}


	
	
	public void setMatchAdidCode(NString value){
		this.setValue("MATCH_ADID_CODE", value.getValue());
	}


	public NString getMatchAdidCode(){
		NString v = new NString((String)this.getValue("MATCH_ADID_CODE"));
		return v;
	}


	
	
	public void setMatchAdditionalId(NString value){
		this.setValue("MATCH_ADDITIONAL_ID", value.getValue());
	}


	public NString getMatchAdditionalId(){
		NString v = new NString((String)this.getValue("MATCH_ADDITIONAL_ID"));
		return v;
	}


	
	
	public void setAddressList(NString value){
		this.setValue("ADDRESS_LIST", value.getValue());
	}


	public NString getAddressList(){
		NString v = new NString((String)this.getValue("ADDRESS_LIST"));
		return v;
	}


	
	
	public void setPhoneList(NString value){
		this.setValue("PHONE_LIST", value.getValue());
	}


	public NString getPhoneList(){
		NString v = new NString((String)this.getValue("PHONE_LIST"));
		return v;
	}


	
	
	public void setEmailList(NString value){
		this.setValue("EMAIL_LIST", value.getValue());
	}


	public NString getEmailList(){
		NString v = new NString((String)this.getValue("EMAIL_LIST"));
		return v;
	}


	
	
	public void setMatchList(NString value){
		this.setValue("MATCH_LIST", value.getValue());
	}


	public NString getMatchList(){
		NString v = new NString((String)this.getValue("MATCH_LIST"));
		return v;
	}


	
	
	public void setGovcmrtCmsrPriorityNo(NNumber value){
		this.setValue("GOVCMRT_CMSR_PRIORITY_NO", value.getValue());
	}


	public NNumber getGovcmrtCmsrPriorityNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GOVCMRT_CMSR_PRIORITY_NO"));
		return v;
	}


	
	
	public void setGovcmrtMessage(NString value){
		this.setValue("GOVCMRT_MESSAGE", value.getValue());
	}


	public NString getGovcmrtMessage(){
		NString v = new NString((String)this.getValue("GOVCMRT_MESSAGE"));
		return v;
	}


	
	
	public void setGovcmrtPidm(NNumber value){
		this.setValue("GOVCMRT_PIDM", value.getValue());
	}


	public NNumber getGovcmrtPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GOVCMRT_PIDM"));
		return v;
	}


	
	
	public void setGovcmrtSpridenIdRowid(NString value){
		this.setValue("GOVCMRT_SPRIDEN_ID_ROWID", value.getValue());
	}


	public NString getGovcmrtSpridenIdRowid(){
		NString v = new NString((String)this.getValue("GOVCMRT_SPRIDEN_ID_ROWID"));
		return v;
	}


	
	
	public void setGovcmrtSpridenNameRowid(NString value){
		this.setValue("GOVCMRT_SPRIDEN_NAME_ROWID", value.getValue());
	}


	public NString getGovcmrtSpridenNameRowid(){
		NString v = new NString((String)this.getValue("GOVCMRT_SPRIDEN_NAME_ROWID"));
		return v;
	}


	
	
	public void setGovcmrtSpraddrRowid(NString value){
		this.setValue("GOVCMRT_SPRADDR_ROWID", value.getValue());
	}


	public NString getGovcmrtSpraddrRowid(){
		NString v = new NString((String)this.getValue("GOVCMRT_SPRADDR_ROWID"));
		return v;
	}


	
	
	public void setGovcmrtSprteleRowid(NString value){
		this.setValue("GOVCMRT_SPRTELE_ROWID", value.getValue());
	}


	public NString getGovcmrtSprteleRowid(){
		NString v = new NString((String)this.getValue("GOVCMRT_SPRTELE_ROWID"));
		return v;
	}


	
	
	public void setGovcmrtGoremalRowid(NString value){
		this.setValue("GOVCMRT_GOREMAL_ROWID", value.getValue());
	}


	public NString getGovcmrtGoremalRowid(){
		NString v = new NString((String)this.getValue("GOVCMRT_GOREMAL_ROWID"));
		return v;
	}


	
	
	public void setGovcmrtGoradidRowid(NString value){
		this.setValue("GOVCMRT_GORADID_ROWID", value.getValue());
	}


	public NString getGovcmrtGoradidRowid(){
		NString v = new NString((String)this.getValue("GOVCMRT_GORADID_ROWID"));
		return v;
	}


	
	
	public void setGovcmrtId(NString value){
		this.setValue("GOVCMRT_ID", value.getValue());
	}


	public NString getGovcmrtId(){
		NString v = new NString((String)this.getValue("GOVCMRT_ID"));
		return v;
	}


	
	
	public void setGovcmrtName(NString value){
		this.setValue("GOVCMRT_NAME", value.getValue());
	}


	public NString getGovcmrtName(){
		NString v = new NString((String)this.getValue("GOVCMRT_NAME"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}


	public java.sql.RowId getROWID() {
		
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID);
	}
	
}
