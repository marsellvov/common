package  net.hedtech.banner.alumni.common.Apaiden.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class AptaddrAdapter extends BaseRowAdapter{
	

	public AptaddrAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setAptaddrSlctInd(NString value){
		this.setValue("APTADDR_SLCT_IND", value.getValue());
	}


	public NString getAptaddrSlctInd(){
		NString v = new NString((String)this.getValue("APTADDR_SLCT_IND"));
		return v;
	}


	
	
	public void setAptaddrUpdatableInd(NString value){
		this.setValue("APTADDR_UPDATABLE_IND", value.getValue());
	}


	public NString getAptaddrUpdatableInd(){
		NString v = new NString((String)this.getValue("APTADDR_UPDATABLE_IND"));
		return v;
	}


	
	
	public void setAptaddrPidm(NNumber value){
		this.setValue("APTADDR_PIDM", value.getValue());
	}


	public NNumber getAptaddrPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("APTADDR_PIDM"));
		return v;
	}


	
	
	public void setAptaddrHeadInd(NString value){
		this.setValue("APTADDR_HEAD_IND", value.getValue());
	}


	public NString getAptaddrHeadInd(){
		NString v = new NString((String)this.getValue("APTADDR_HEAD_IND"));
		return v;
	}


	
	
	public void setAptaddrAtypCode(NString value){
		this.setValue("APTADDR_ATYP_CODE", value.getValue());
	}


	public NString getAptaddrAtypCode(){
		NString v = new NString((String)this.getValue("APTADDR_ATYP_CODE"));
		return v;
	}


	
	
	public void setAptaddrCntyCode(NString value){
		this.setValue("APTADDR_CNTY_CODE", value.getValue());
	}


	public NString getAptaddrCntyCode(){
		NString v = new NString((String)this.getValue("APTADDR_CNTY_CODE"));
		return v;
	}


	
	
	public void setAptaddrNatnCode(NString value){
		this.setValue("APTADDR_NATN_CODE", value.getValue());
	}


	public NString getAptaddrNatnCode(){
		NString v = new NString((String)this.getValue("APTADDR_NATN_CODE"));
		return v;
	}


	
	
	public void setAptaddrSessionid(NString value){
		this.setValue("APTADDR_SESSIONID", value.getValue());
	}


	public NString getAptaddrSessionid(){
		NString v = new NString((String)this.getValue("APTADDR_SESSIONID"));
		return v;
	}


	
	
	public void setAptaddrUser(NString value){
		this.setValue("APTADDR_USER", value.getValue());
	}


	public NString getAptaddrUser(){
		NString v = new NString((String)this.getValue("APTADDR_USER"));
		return v;
	}


	
	
	public void setAptaddrActivityDatetime(NDate value){
		this.setValue("APTADDR_ACTIVITY_DATE", value.getValue());
	}


	public NDate getAptaddrActivityDatetime(){
		NDate v = new NDate((Date)this.getValue("APTADDR_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setAptaddrNameLf30(NString value){
		this.setValue("APTADDR_NAME_LF30", value.getValue());
	}


	public NString getAptaddrNameLf30(){
		NString v = new NString((String)this.getValue("APTADDR_NAME_LF30"));
		return v;
	}


	
	
	public void setAptaddrId(NString value){
		this.setValue("APTADDR_ID", value.getValue());
	}


	public NString getAptaddrId(){
		NString v = new NString((String)this.getValue("APTADDR_ID"));
		return v;
	}


	
	
	public void setAptaddrXrefCode(NString value){
		this.setValue("APTADDR_XREF_CODE", value.getValue());
	}


	public NString getAptaddrXrefCode(){
		NString v = new NString((String)this.getValue("APTADDR_XREF_CODE"));
		return v;
	}


	
	
	public void setAptaddrAge(NNumber value){
		this.setValue("APTADDR_AGE", value.getValue());
	}


	public NNumber getAptaddrAge(){
		NNumber v = new NNumber((BigDecimal)this.getValue("APTADDR_AGE"));
		return v;
	}


	
	
	public void setAptaddrAddressCompareInd(NString value){
		this.setValue("APTADDR_ADDRESS_COMPARE_IND", value.getValue());
	}


	public NString getAptaddrAddressCompareInd(){
		NString v = new NString((String)this.getValue("APTADDR_ADDRESS_COMPARE_IND"));
		return v;
	}


	
	
	public void setAptaddrHouseNumber(NString value){
		this.setValue("APTADDR_HOUSE_NUMBER", value.getValue());
	}


	public NString getAptaddrHouseNumber(){
		NString v = new NString((String)this.getValue("APTADDR_HOUSE_NUMBER"));
		return v;
	}


	
	
	public void setAptaddrStreetLine1(NString value){
		this.setValue("APTADDR_STREET_LINE1", value.getValue());
	}


	public NString getAptaddrStreetLine1(){
		NString v = new NString((String)this.getValue("APTADDR_STREET_LINE1"));
		return v;
	}


	
	
	public void setAptaddrStreetLine2(NString value){
		this.setValue("APTADDR_STREET_LINE2", value.getValue());
	}


	public NString getAptaddrStreetLine2(){
		NString v = new NString((String)this.getValue("APTADDR_STREET_LINE2"));
		return v;
	}


	
	
	public void setAptaddrStreetLine3(NString value){
		this.setValue("APTADDR_STREET_LINE3", value.getValue());
	}


	public NString getAptaddrStreetLine3(){
		NString v = new NString((String)this.getValue("APTADDR_STREET_LINE3"));
		return v;
	}


	
	
	public void setAptaddrStreetLine4(NString value){
		this.setValue("APTADDR_STREET_LINE4", value.getValue());
	}


	public NString getAptaddrStreetLine4(){
		NString v = new NString((String)this.getValue("APTADDR_STREET_LINE4"));
		return v;
	}


	
	
	public void setAptaddrCity(NString value){
		this.setValue("APTADDR_CITY", value.getValue());
	}


	public NString getAptaddrCity(){
		NString v = new NString((String)this.getValue("APTADDR_CITY"));
		return v;
	}


	
	
	public void setAptaddrStatCode(NString value){
		this.setValue("APTADDR_STAT_CODE", value.getValue());
	}


	public NString getAptaddrStatCode(){
		NString v = new NString((String)this.getValue("APTADDR_STAT_CODE"));
		return v;
	}


	
	
	public void setAptaddrZip(NString value){
		this.setValue("APTADDR_ZIP", value.getValue());
	}


	public NString getAptaddrZip(){
		NString v = new NString((String)this.getValue("APTADDR_ZIP"));
		return v;
	}


	
	
	public void setTaddrNatnDesc(NString value){
		this.setValue("TADDR_NATN_DESC", value.getValue());
	}


	public NString getTaddrNatnDesc(){
		NString v = new NString((String)this.getValue("TADDR_NATN_DESC"));
		return v;
	}


	
	
	public void setTaddrCntyDesc(NString value){
		this.setValue("TADDR_CNTY_DESC", value.getValue());
	}


	public NString getTaddrCntyDesc(){
		NString v = new NString((String)this.getValue("TADDR_CNTY_DESC"));
		return v;
	}


	
	
	public void setAptaddrPhoneCompareInd(NString value){
		this.setValue("APTADDR_PHONE_COMPARE_IND", value.getValue());
	}


	public NString getAptaddrPhoneCompareInd(){
		NString v = new NString((String)this.getValue("APTADDR_PHONE_COMPARE_IND"));
		return v;
	}


	
	
	public void setAptaddrPhone(NString value){
		this.setValue("APTADDR_PHONE", value.getValue());
	}


	public NString getAptaddrPhone(){
		NString v = new NString((String)this.getValue("APTADDR_PHONE"));
		return v;
	}


	
	
	public void setAptaddrFromDate(NDate value){
		this.setValue("APTADDR_FROM_DATE", value.getValue());
	}


	public NDate getAptaddrFromDate(){
		NDate v = new NDate((Date)this.getValue("APTADDR_FROM_DATE"));
		return v;
	}


	
	
	public void setAptaddrToDate(NDate value){
		this.setValue("APTADDR_TO_DATE", value.getValue());
	}


	public NDate getAptaddrToDate(){
		NDate v = new NDate((Date)this.getValue("APTADDR_TO_DATE"));
		return v;
	}


	

	
}
