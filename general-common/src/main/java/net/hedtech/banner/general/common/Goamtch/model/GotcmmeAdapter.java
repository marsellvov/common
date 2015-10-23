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



public class GotcmmeAdapter extends BaseRowAdapter{
	

	public GotcmmeAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setLastName(NString value){
		this.setValue("LAST_NAME", value.getValue());
	}


	public NString getLastName(){
		NString v = new NString((String)this.getValue("LAST_NAME"));
		return v;
	}


	
	
	public void setGotcmmeFirstName(NString value){
		this.setValue("GOTCMME_FIRST_NAME", value.getValue());
	}


	public NString getGotcmmeFirstName(){
		NString v = new NString((String)this.getValue("GOTCMME_FIRST_NAME"));
		return v;
	}


	
	
	public void setGotcmmeMi(NString value){
		this.setValue("GOTCMME_MI", value.getValue());
	}


	public NString getGotcmmeMi(){
		NString v = new NString((String)this.getValue("GOTCMME_MI"));
		return v;
	}


	
	
	public void setGotcmmeAtypCode(NString value){
		this.setValue("GOTCMME_ATYP_CODE", value.getValue());
	}


	public NString getGotcmmeAtypCode(){
		NString v = new NString((String)this.getValue("GOTCMME_ATYP_CODE"));
		return v;
	}


	
	
	public void setAtypDescription(NString value){
		this.setValue("ATYP_DESCRIPTION", value.getValue());
	}


	public NString getAtypDescription(){
		NString v = new NString((String)this.getValue("ATYP_DESCRIPTION"));
		return v;
	}


	
	
	public void setGotcmmeStreetLine1(NString value){
		this.setValue("GOTCMME_STREET_LINE1", value.getValue());
	}


	public NString getGotcmmeStreetLine1(){
		NString v = new NString((String)this.getValue("GOTCMME_STREET_LINE1"));
		return v;
	}


	
	
	public void setGotcmmeStreetLine2(NString value){
		this.setValue("GOTCMME_STREET_LINE2", value.getValue());
	}


	public NString getGotcmmeStreetLine2(){
		NString v = new NString((String)this.getValue("GOTCMME_STREET_LINE2"));
		return v;
	}


	
	
	public void setGotcmmeStreetLine3(NString value){
		this.setValue("GOTCMME_STREET_LINE3", value.getValue());
	}


	public NString getGotcmmeStreetLine3(){
		NString v = new NString((String)this.getValue("GOTCMME_STREET_LINE3"));
		return v;
	}


	
	
	public void setGotcmmeCity(NString value){
		this.setValue("GOTCMME_CITY", value.getValue());
	}


	public NString getGotcmmeCity(){
		NString v = new NString((String)this.getValue("GOTCMME_CITY"));
		return v;
	}


	
	
	public void setGotcmmeStatCode(NString value){
		this.setValue("GOTCMME_STAT_CODE", value.getValue());
	}


	public NString getGotcmmeStatCode(){
		NString v = new NString((String)this.getValue("GOTCMME_STAT_CODE"));
		return v;
	}


	
	
	public void setStatDescription(NString value){
		this.setValue("STAT_DESCRIPTION", value.getValue());
	}


	public NString getStatDescription(){
		NString v = new NString((String)this.getValue("STAT_DESCRIPTION"));
		return v;
	}


	
	
	public void setGotcmmeZip(NString value){
		this.setValue("GOTCMME_ZIP", value.getValue());
	}


	public NString getGotcmmeZip(){
		NString v = new NString((String)this.getValue("GOTCMME_ZIP"));
		return v;
	}


	
	
	public void setGotcmmeCntyCode(NString value){
		this.setValue("GOTCMME_CNTY_CODE", value.getValue());
	}


	public NString getGotcmmeCntyCode(){
		NString v = new NString((String)this.getValue("GOTCMME_CNTY_CODE"));
		return v;
	}


	
	
	public void setCntyDescription(NString value){
		this.setValue("CNTY_DESCRIPTION", value.getValue());
	}


	public NString getCntyDescription(){
		NString v = new NString((String)this.getValue("CNTY_DESCRIPTION"));
		return v;
	}


	
	
	public void setGotcmmeNatnCode(NString value){
		this.setValue("GOTCMME_NATN_CODE", value.getValue());
	}


	public NString getGotcmmeNatnCode(){
		NString v = new NString((String)this.getValue("GOTCMME_NATN_CODE"));
		return v;
	}


	
	
	public void setNatnDescription(NString value){
		this.setValue("NATN_DESCRIPTION", value.getValue());
	}


	public NString getNatnDescription(){
		NString v = new NString((String)this.getValue("NATN_DESCRIPTION"));
		return v;
	}


	
	public void setNonpersonName(NString value){
		this.setValue("NONPERSON_NAME", value.getValue());
	}


	public NString getNonpersonName(){
		NString v = new NString((String)this.getValue("NONPERSON_NAME"));
		return v;
	}


	
	
	public void setGotcmmeSsn(NString value){
		this.setValue("GOTCMME_SSN", value.getValue());
	}


	public NString getGotcmmeSsn(){
		NString v = new NString((String)this.getValue("GOTCMME_SSN"));
		return v;
	}


	
	
	public void setHoldGotcmmeSsn(NString value){
		this.setValue("HOLD_GOTCMME_SSN", value.getValue());
	}


	public NString getHoldGotcmmeSsn(){
		NString v = new NString((String)this.getValue("HOLD_GOTCMME_SSN"));
		return v;
	}


	
	
	public void setGotcmmeBirthDay(NString value){
		this.setValue("GOTCMME_BIRTH_DAY", value.getValue());
	}


	public NString getGotcmmeBirthDay(){
		NString v = new NString((String)this.getValue("GOTCMME_BIRTH_DAY"));
		return v;
	}


	
	
	public void setGotcmmeBirthMon(NString value){
		this.setValue("GOTCMME_BIRTH_MON", value.getValue());
	}


	public NString getGotcmmeBirthMon(){
		NString v = new NString((String)this.getValue("GOTCMME_BIRTH_MON"));
		return v;
	}


	
	
	public void setGotcmmeBirthYear(NString value){
		this.setValue("GOTCMME_BIRTH_YEAR", value.getValue());
	}


	public NString getGotcmmeBirthYear(){
		NString v = new NString((String)this.getValue("GOTCMME_BIRTH_YEAR"));
		return v;
	}


	
	
	public void setGotcmmeSex(NString value){
		this.setValue("GOTCMME_SEX", value.getValue());
	}


	public NString getGotcmmeSex(){
		NString v = new NString((String)this.getValue("GOTCMME_SEX"));
		return v;
	}


	
	
	public void setGotcmmeTeleCode(NString value){
		this.setValue("GOTCMME_TELE_CODE", value.getValue());
	}


	public NString getGotcmmeTeleCode(){
		NString v = new NString((String)this.getValue("GOTCMME_TELE_CODE"));
		return v;
	}


	
	
	public void setTeleDescription(NString value){
		this.setValue("TELE_DESCRIPTION", value.getValue());
	}


	public NString getTeleDescription(){
		NString v = new NString((String)this.getValue("TELE_DESCRIPTION"));
		return v;
	}


	
	
	public void setGotcmmePhoneArea(NString value){
		this.setValue("GOTCMME_PHONE_AREA", value.getValue());
	}


	public NString getGotcmmePhoneArea(){
		NString v = new NString((String)this.getValue("GOTCMME_PHONE_AREA"));
		return v;
	}


	
	
	public void setGotcmmePhoneNumber(NString value){
		this.setValue("GOTCMME_PHONE_NUMBER", value.getValue());
	}


	public NString getGotcmmePhoneNumber(){
		NString v = new NString((String)this.getValue("GOTCMME_PHONE_NUMBER"));
		return v;
	}


	
	
	public void setGotcmmePhoneExt(NString value){
		this.setValue("GOTCMME_PHONE_EXT", value.getValue());
	}


	public NString getGotcmmePhoneExt(){
		NString v = new NString((String)this.getValue("GOTCMME_PHONE_EXT"));
		return v;
	}


	
	
	public void setGotcmmeEmalCode(NString value){
		this.setValue("GOTCMME_EMAL_CODE", value.getValue());
	}


	public NString getGotcmmeEmalCode(){
		NString v = new NString((String)this.getValue("GOTCMME_EMAL_CODE"));
		return v;
	}


	
	
	public void setEmalDescription(NString value){
		this.setValue("EMAL_DESCRIPTION", value.getValue());
	}


	public NString getEmalDescription(){
		NString v = new NString((String)this.getValue("EMAL_DESCRIPTION"));
		return v;
	}


	
	
	public void setGotcmmeEmailAddress(NString value){
		this.setValue("GOTCMME_EMAIL_ADDRESS", value.getValue());
	}


	public NString getGotcmmeEmailAddress(){
		NString v = new NString((String)this.getValue("GOTCMME_EMAIL_ADDRESS"));
		return v;
	}


	
	
	public void setGotcmmeAdidCode(NString value){
		this.setValue("GOTCMME_ADID_CODE", value.getValue());
	}


	public NString getGotcmmeAdidCode(){
		NString v = new NString((String)this.getValue("GOTCMME_ADID_CODE"));
		return v;
	}


	
	
	public void setAdidDesc(NString value){
		this.setValue("ADID_DESC", value.getValue());
	}


	public NString getAdidDesc(){
		NString v = new NString((String)this.getValue("ADID_DESC"));
		return v;
	}


	
	
	public void setGotcmmeAdditionalId(NString value){
		this.setValue("GOTCMME_ADDITIONAL_ID", value.getValue());
	}


	public NString getGotcmmeAdditionalId(){
		NString v = new NString((String)this.getValue("GOTCMME_ADDITIONAL_ID"));
		return v;
	}


	
	
	public void setGreenDataBar1(NString value){
		this.setValue("GREEN_DATA_BAR_1", value.getValue());
	}


	public NString getGreenDataBar1(){
		NString v = new NString((String)this.getValue("GREEN_DATA_BAR_1"));
		return v;
	}


	
	
	public void setGotcmmeId(NString value){
		this.setValue("GOTCMME_ID", value.getValue());
	}


	public NString getGotcmmeId(){
		NString v = new NString((String)this.getValue("GOTCMME_ID"));
		return v;
	}


	
	
	public void setGotcmmeLastName(NString value){
		this.setValue("GOTCMME_LAST_NAME", value.getValue());
	}


	public NString getGotcmmeLastName(){
		NString v = new NString((String)this.getValue("GOTCMME_LAST_NAME"));
		return v;
	}


	
	
	public void setGotcmmeEntityCde(NString value){
		this.setValue("GOTCMME_ENTITY_CDE", value.getValue());
	}


	public NString getGotcmmeEntityCde(){
		NString v = new NString((String)this.getValue("GOTCMME_ENTITY_CDE"));
		return v;
	}


	
	
	public void setGotcmmeAsrcCode(NString value){
		this.setValue("GOTCMME_ASRC_CODE", value.getValue());
	}


	public NString getGotcmmeAsrcCode(){
		NString v = new NString((String)this.getValue("GOTCMME_ASRC_CODE"));
		return v;
	}


	
	
	public void setGotcmmePidm(NNumber value){
		this.setValue("GOTCMME_PIDM", value.getValue());
	}


	public NNumber getGotcmmePidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GOTCMME_PIDM"));
		return v;
	}


	
	
	public void setNoAddrInfo(NNumber value){
		this.setValue("NO_ADDR_INFO", value.getValue());
	}


	public NNumber getNoAddrInfo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("NO_ADDR_INFO"));
		return v;
	}


	
	
	public void setSourceComment(NString value){
		this.setValue("SOURCE_COMMENT", value.getValue());
	}


	public NString getSourceComment(){
		NString v = new NString((String)this.getValue("SOURCE_COMMENT"));
		return v;
	}

	public java.sql.RowId getROWID() {
		
		return (java.sql.RowId)this.getValue(DAOConfiguration.MODEL_ROWID);
	}
	
	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}


	
}
