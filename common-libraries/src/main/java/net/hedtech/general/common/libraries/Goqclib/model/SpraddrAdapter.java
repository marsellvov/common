package  net.hedtech.general.common.libraries.Goqclib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;



public class SpraddrAdapter extends BaseRowAdapter{
	

	public SpraddrAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setSpraddrFromDate(NDate value){
		this.setValue("SPRADDR_FROM_DATE", value.getValue());
	}


	public NDate getSpraddrFromDate(){
		NDate v = new NDate((Date)this.getValue("SPRADDR_FROM_DATE"));
		return v;
	}


	
	
	public void setSpraddrToDate(NDate value){
		this.setValue("SPRADDR_TO_DATE", value.getValue());
	}


	public NDate getSpraddrToDate(){
		NDate v = new NDate((Date)this.getValue("SPRADDR_TO_DATE"));
		return v;
	}


	
	
	public void setSpraddrAtypCode(NString value){
		this.setValue("SPRADDR_ATYP_CODE", value.getValue());
	}


	public NString getSpraddrAtypCode(){
		NString v = new NString((String)this.getValue("SPRADDR_ATYP_CODE"));
		return v;
	}


	
	
	public void setAtypDescription(NString value){
		this.setValue("ATYP_DESCRIPTION", value.getValue());
	}


	public NString getAtypDescription(){
		NString v = new NString((String)this.getValue("ATYP_DESCRIPTION"));
		return v;
	}


	
	
	public void setSpraddrSeqno(NNumber value){
		this.setValue("SPRADDR_SEQNO", value.getValue());
	}


	public NNumber getSpraddrSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRADDR_SEQNO"));
		return v;
	}


	
	
	public void setSpraddrHouseNumber(NString value){
		this.setValue("SPRADDR_HOUSE_NUMBER", value.getValue());
	}


	public NString getSpraddrHouseNumber(){
		NString v = new NString((String)this.getValue("SPRADDR_HOUSE_NUMBER"));
		return v;
	}


	
	
	public void setSpraddrStreetLine1(NString value){
		this.setValue("SPRADDR_STREET_LINE1", value.getValue());
	}


	public NString getSpraddrStreetLine1(){
		NString v = new NString((String)this.getValue("SPRADDR_STREET_LINE1"));
		return v;
	}


	
	
	public void setSpraddrStreetLine2(NString value){
		this.setValue("SPRADDR_STREET_LINE2", value.getValue());
	}


	public NString getSpraddrStreetLine2(){
		NString v = new NString((String)this.getValue("SPRADDR_STREET_LINE2"));
		return v;
	}


	
	
	public void setSpraddrStreetLine3(NString value){
		this.setValue("SPRADDR_STREET_LINE3", value.getValue());
	}


	public NString getSpraddrStreetLine3(){
		NString v = new NString((String)this.getValue("SPRADDR_STREET_LINE3"));
		return v;
	}


	
	
	public void setSpraddrStreetLine4(NString value){
		this.setValue("SPRADDR_STREET_LINE4", value.getValue());
	}


	public NString getSpraddrStreetLine4(){
		NString v = new NString((String)this.getValue("SPRADDR_STREET_LINE4"));
		return v;
	}


	
	
	public void setSpraddrCity(NString value){
		this.setValue("SPRADDR_CITY", value.getValue());
	}


	public NString getSpraddrCity(){
		NString v = new NString((String)this.getValue("SPRADDR_CITY"));
		return v;
	}


	
	
	public void setSpraddrStatCode(NString value){
		this.setValue("SPRADDR_STAT_CODE", value.getValue());
	}


	public NString getSpraddrStatCode(){
		NString v = new NString((String)this.getValue("SPRADDR_STAT_CODE"));
		return v;
	}


	
	
	public void setStatDescription(NString value){
		this.setValue("STAT_DESCRIPTION", value.getValue());
	}


	public NString getStatDescription(){
		NString v = new NString((String)this.getValue("STAT_DESCRIPTION"));
		return v;
	}


	
	
	public void setSpraddrZip(NString value){
		this.setValue("SPRADDR_ZIP", value.getValue());
	}


	public NString getSpraddrZip(){
		NString v = new NString((String)this.getValue("SPRADDR_ZIP"));
		return v;
	}


	
	
	public void setSpraddrCntyCode(NString value){
		this.setValue("SPRADDR_CNTY_CODE", value.getValue());
	}


	public NString getSpraddrCntyCode(){
		NString v = new NString((String)this.getValue("SPRADDR_CNTY_CODE"));
		return v;
	}


	
	
	public void setCntyDescription(NString value){
		this.setValue("CNTY_DESCRIPTION", value.getValue());
	}


	public NString getCntyDescription(){
		NString v = new NString((String)this.getValue("CNTY_DESCRIPTION"));
		return v;
	}


	
	
	public void setSpraddrNatnCode(NString value){
		this.setValue("SPRADDR_NATN_CODE", value.getValue());
	}


	public NString getSpraddrNatnCode(){
		NString v = new NString((String)this.getValue("SPRADDR_NATN_CODE"));
		return v;
	}


	
	
	public void setNatnDescription(NString value){
		this.setValue("NATN_DESCRIPTION", value.getValue());
	}


	public NString getNatnDescription(){
		NString v = new NString((String)this.getValue("NATN_DESCRIPTION"));
		return v;
	}


	
	
	public void setTeleCode(NString value){
		this.setValue("TELE_CODE", value.getValue());
	}


	public NString getTeleCode(){
		NString v = new NString((String)this.getValue("TELE_CODE"));
		return v;
	}


	
	
	public void setTeleDescription(NString value){
		this.setValue("TELE_DESCRIPTION", value.getValue());
	}


	public NString getTeleDescription(){
		NString v = new NString((String)this.getValue("TELE_DESCRIPTION"));
		return v;
	}


	
	
	public void setPhoneCtry(NString value){
		this.setValue("PHONE_CTRY", value.getValue());
	}


	public NString getPhoneCtry(){
		NString v = new NString((String)this.getValue("PHONE_CTRY"));
		return v;
	}


	
	
	public void setPhoneArea(NString value){
		this.setValue("PHONE_AREA", value.getValue());
	}


	public NString getPhoneArea(){
		NString v = new NString((String)this.getValue("PHONE_AREA"));
		return v;
	}


	
	
	public void setPhoneNumber(NString value){
		this.setValue("PHONE_NUMBER", value.getValue());
	}


	public NString getPhoneNumber(){
		NString v = new NString((String)this.getValue("PHONE_NUMBER"));
		return v;
	}


	
	
	public void setPhoneExt(NString value){
		this.setValue("PHONE_EXT", value.getValue());
	}


	public NString getPhoneExt(){
		NString v = new NString((String)this.getValue("PHONE_EXT"));
		return v;
	}


	
	
	public void setFaxCtry(NString value){
		this.setValue("FAX_CTRY", value.getValue());
	}


	public NString getFaxCtry(){
		NString v = new NString((String)this.getValue("FAX_CTRY"));
		return v;
	}


	
	
	public void setFaxArea(NString value){
		this.setValue("FAX_AREA", value.getValue());
	}


	public NString getFaxArea(){
		NString v = new NString((String)this.getValue("FAX_AREA"));
		return v;
	}


	
	
	public void setFaxNumber(NString value){
		this.setValue("FAX_NUMBER", value.getValue());
	}


	public NString getFaxNumber(){
		NString v = new NString((String)this.getValue("FAX_NUMBER"));
		return v;
	}


	
	
	public void setFaxExt(NString value){
		this.setValue("FAX_EXT", value.getValue());
	}


	public NString getFaxExt(){
		NString v = new NString((String)this.getValue("FAX_EXT"));
		return v;
	}


	
	
	public void setPreferredAddr(NString value){
		this.setValue("PREFERRED_ADDR", value.getValue());
	}


	public NString getPreferredAddr(){
		NString v = new NString((String)this.getValue("PREFERRED_ADDR"));
		return v;
	}


	
	
	public void setPreferredRegion(NString value){
		this.setValue("PREFERRED_REGION", value.getValue());
	}


	public NString getPreferredRegion(){
		NString v = new NString((String)this.getValue("PREFERRED_REGION"));
		return v;
	}


	
	
	public void setCombinedMailing(NString value){
		this.setValue("COMBINED_MAILING", value.getValue());
	}


	public NString getCombinedMailing(){
		NString v = new NString((String)this.getValue("COMBINED_MAILING"));
		return v;
	}


	
	
	public void setSpraddrStatusInd(NString value){
		this.setValue("SPRADDR_STATUS_IND", value.getValue());
	}


	public NString getSpraddrStatusInd(){
		NString v = new NString((String)this.getValue("SPRADDR_STATUS_IND"));
		return v;
	}


	
	
	public void setSpraddrAsrcCode(NString value){
		this.setValue("SPRADDR_ASRC_CODE", value.getValue());
	}


	public NString getSpraddrAsrcCode(){
		NString v = new NString((String)this.getValue("SPRADDR_ASRC_CODE"));
		return v;
	}


	
	
	public void setSpraddrDeliveryPoint(NNumber value){
		this.setValue("SPRADDR_DELIVERY_POINT", value.getValue());
	}


	public NNumber getSpraddrDeliveryPoint(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRADDR_DELIVERY_POINT"));
		return v;
	}


	
	
	public void setSpraddrCorrectionDigit(NNumber value){
		this.setValue("SPRADDR_CORRECTION_DIGIT", value.getValue());
	}


	public NNumber getSpraddrCorrectionDigit(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRADDR_CORRECTION_DIGIT"));
		return v;
	}


	
	
	public void setSpraddrCarrierRoute(NString value){
		this.setValue("SPRADDR_CARRIER_ROUTE", value.getValue());
	}


	public NString getSpraddrCarrierRoute(){
		NString v = new NString((String)this.getValue("SPRADDR_CARRIER_ROUTE"));
		return v;
	}


	
	
	public void setSpraddrGstTaxId(NString value){
		this.setValue("SPRADDR_GST_TAX_ID", value.getValue());
	}


	public NString getSpraddrGstTaxId(){
		NString v = new NString((String)this.getValue("SPRADDR_GST_TAX_ID"));
		return v;
	}


	
	
	public void setSpraddrUser(NString value){
		this.setValue("SPRADDR_USER", value.getValue());
	}


	public NString getSpraddrUser(){
		NString v = new NString((String)this.getValue("SPRADDR_USER"));
		return v;
	}


	
	
	public void setSpraddrActivityDate(NDate value){
		this.setValue("SPRADDR_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSpraddrActivityDate(){
		NDate v = new NDate((Date)this.getValue("SPRADDR_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setSpraddrPidm(NNumber value){
		this.setValue("SPRADDR_PIDM", value.getValue());
	}


	public NNumber getSpraddrPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRADDR_PIDM"));
		return v;
	}


	
	
	public void setSprteleSeqno(NNumber value){
		this.setValue("SPRTELE_SEQNO", value.getValue());
	}


	public NNumber getSprteleSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRTELE_SEQNO"));
		return v;
	}


	
	
	public void setChangeFax(NString value){
		this.setValue("CHANGE_FAX", value.getValue());
	}


	public NString getChangeFax(){
		NString v = new NString((String)this.getValue("CHANGE_FAX"));
		return v;
	}


	
	
	public void setChangePhone(NString value){
		this.setValue("CHANGE_PHONE", value.getValue());
	}


	public NString getChangePhone(){
		NString v = new NString((String)this.getValue("CHANGE_PHONE"));
		return v;
	}


	
	
	public void setChangeStatus(NString value){
		this.setValue("CHANGE_STATUS", value.getValue());
	}


	public NString getChangeStatus(){
		NString v = new NString((String)this.getValue("CHANGE_STATUS"));
		return v;
	}


	
	
	public void setHoldAddrTeleSeqno(NNumber value){
		this.setValue("HOLD_ADDR_TELE_SEQNO", value.getValue());
	}


	public NNumber getHoldAddrTeleSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("HOLD_ADDR_TELE_SEQNO"));
		return v;
	}


	
	
	public void setHoldPhoneCtry(NString value){
		this.setValue("HOLD_PHONE_CTRY", value.getValue());
	}


	public NString getHoldPhoneCtry(){
		NString v = new NString((String)this.getValue("HOLD_PHONE_CTRY"));
		return v;
	}


	
	
	public void setHoldPhoneArea(NString value){
		this.setValue("HOLD_PHONE_AREA", value.getValue());
	}


	public NString getHoldPhoneArea(){
		NString v = new NString((String)this.getValue("HOLD_PHONE_AREA"));
		return v;
	}


	
	
	public void setHoldPhoneNumber(NString value){
		this.setValue("HOLD_PHONE_NUMBER", value.getValue());
	}


	public NString getHoldPhoneNumber(){
		NString v = new NString((String)this.getValue("HOLD_PHONE_NUMBER"));
		return v;
	}


	
	
	public void setHoldPhoneExt(NString value){
		this.setValue("HOLD_PHONE_EXT", value.getValue());
	}


	public NString getHoldPhoneExt(){
		NString v = new NString((String)this.getValue("HOLD_PHONE_EXT"));
		return v;
	}


	
	
	public void setHoldFaxArea(NString value){
		this.setValue("HOLD_FAX_AREA", value.getValue());
	}


	public NString getHoldFaxArea(){
		NString v = new NString((String)this.getValue("HOLD_FAX_AREA"));
		return v;
	}


	
	
	public void setHoldFaxNumber(NString value){
		this.setValue("HOLD_FAX_NUMBER", value.getValue());
	}


	public NString getHoldFaxNumber(){
		NString v = new NString((String)this.getValue("HOLD_FAX_NUMBER"));
		return v;
	}


	
	
	public void setHoldFaxExt(NString value){
		this.setValue("HOLD_FAX_EXT", value.getValue());
	}


	public NString getHoldFaxExt(){
		NString v = new NString((String)this.getValue("HOLD_FAX_EXT"));
		return v;
	}


	
	
	public void setHoldSeqno(NNumber value){
		this.setValue("HOLD_SEQNO", value.getValue());
	}


	public NNumber getHoldSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("HOLD_SEQNO"));
		return v;
	}


	
	
	public void setHoldStatCode(NString value){
		this.setValue("HOLD_STAT_CODE", value.getValue());
	}


	public NString getHoldStatCode(){
		NString v = new NString((String)this.getValue("HOLD_STAT_CODE"));
		return v;
	}


	
	
	public void setHoldStatus(NString value){
		this.setValue("HOLD_STATUS", value.getValue());
	}


	public NString getHoldStatus(){
		NString v = new NString((String)this.getValue("HOLD_STATUS"));
		return v;
	}


	
	
	public void setHoldTeleCode(NString value){
		this.setValue("HOLD_TELE_CODE", value.getValue());
	}


	public NString getHoldTeleCode(){
		NString v = new NString((String)this.getValue("HOLD_TELE_CODE"));
		return v;
	}


	
	
	public void setNoAddrInfo(NNumber value){
		this.setValue("NO_ADDR_INFO", value.getValue());
	}


	public NNumber getNoAddrInfo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("NO_ADDR_INFO"));
		return v;
	}


	
	
	public void setPhoneExists(NString value){
		this.setValue("PHONE_EXISTS", value.getValue());
	}


	public NString getPhoneExists(){
		NString v = new NString((String)this.getValue("PHONE_EXISTS"));
		return v;
	}


	

	public  java.sql.RowId getROWID(){
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID);
	}
	
	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
	
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
}
