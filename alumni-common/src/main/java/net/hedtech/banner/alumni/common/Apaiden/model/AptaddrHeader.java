package net.hedtech.banner.alumni.common.Apaiden.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class AptaddrHeader extends SimpleBusinessObject
{
	public AptaddrHeader() {
		super();
	}

	public AptaddrHeader(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getAddrNameLf30() {
		return toStr(super.getValue("ADDR_NAME_LF30"));
	}
	
	public void setAddrNameLf30(NString value) {
		super.setValue("ADDR_NAME_LF30", value);
	}
	


	public NString getAddrId() {
		return toStr(super.getValue("ADDR_ID"));
	}
	
	public void setAddrId(NString value) {
		super.setValue("ADDR_ID", value);
	}
	


	public NString getAddrAtypCode() {
		return toStr(super.getValue("ADDR_ATYP_CODE"));
	}
	
	public void setAddrAtypCode(NString value) {
		super.setValue("ADDR_ATYP_CODE", value);
	}
	


	public NString getAddrAtypDesc() {
		return toStr(super.getValue("ADDR_ATYP_DESC"));
	}
	
	public void setAddrAtypDesc(NString value) {
		super.setValue("ADDR_ATYP_DESC", value);
	}
	


	public NNumber getAddrAddrSeqno() {
		return toNumber(super.getValue("ADDR_ADDR_SEQNO"));
	}
	
	public void setAddrAddrSeqno(NNumber value) {
		super.setValue("ADDR_ADDR_SEQNO", value);
	}
	


	public NString getAddrHouseNumber() {
		return toStr(super.getValue("ADDR_HOUSE_NUMBER"));
	}
	
	public void setAddrHouseNumber(NString value) {
		super.setValue("ADDR_HOUSE_NUMBER", value);
	}
	


	public NString getAddrStreetLine1() {
		return toStr(super.getValue("ADDR_STREET_LINE1"));
	}
	
	public void setAddrStreetLine1(NString value) {
		super.setValue("ADDR_STREET_LINE1", value);
	}
	


	public NString getAddrStreetLine2() {
		return toStr(super.getValue("ADDR_STREET_LINE2"));
	}
	
	public void setAddrStreetLine2(NString value) {
		super.setValue("ADDR_STREET_LINE2", value);
	}
	


	public NString getAddrStreetLine3() {
		return toStr(super.getValue("ADDR_STREET_LINE3"));
	}
	
	public void setAddrStreetLine3(NString value) {
		super.setValue("ADDR_STREET_LINE3", value);
	}
	


	public NString getAddrStreetLine4() {
		return toStr(super.getValue("ADDR_STREET_LINE4"));
	}
	
	public void setAddrStreetLine4(NString value) {
		super.setValue("ADDR_STREET_LINE4", value);
	}
	


	public NString getAddrCity() {
		return toStr(super.getValue("ADDR_CITY"));
	}
	
	public void setAddrCity(NString value) {
		super.setValue("ADDR_CITY", value);
	}
	


	public NString getAddrStatCode() {
		return toStr(super.getValue("ADDR_STAT_CODE"));
	}
	
	public void setAddrStatCode(NString value) {
		super.setValue("ADDR_STAT_CODE", value);
	}
	


	public NString getAddrZip() {
		return toStr(super.getValue("ADDR_ZIP"));
	}
	
	public void setAddrZip(NString value) {
		super.setValue("ADDR_ZIP", value);
	}
	


	public NDate getAddrFromDate() {
		return toDate(super.getValue("ADDR_FROM_DATE"));
	}
	
	public void setAddrFromDate(NDate value) {
		super.setValue("ADDR_FROM_DATE", value);
	}
	


	public NString getAddrNatnDesc() {
		return toStr(super.getValue("ADDR_NATN_DESC"));
	}
	
	public void setAddrNatnDesc(NString value) {
		super.setValue("ADDR_NATN_DESC", value);
	}
	


	public NString getAddrCntyDesc() {
		return toStr(super.getValue("ADDR_CNTY_DESC"));
	}
	
	public void setAddrCntyDesc(NString value) {
		super.setValue("ADDR_CNTY_DESC", value);
	}
	


	public NDate getAddrToDate() {
		return toDate(super.getValue("ADDR_TO_DATE"));
	}
	
	public void setAddrToDate(NDate value) {
		super.setValue("ADDR_TO_DATE", value);
	}
	


	public NString getAddrTeleCode() {
		return toStr(super.getValue("ADDR_TELE_CODE"));
	}
	
	public void setAddrTeleCode(NString value) {
		super.setValue("ADDR_TELE_CODE", value);
	}
	


	public NString getAddrTeleDesc() {
		return toStr(super.getValue("ADDR_TELE_DESC"));
	}
	
	public void setAddrTeleDesc(NString value) {
		super.setValue("ADDR_TELE_DESC", value);
	}
	


	public NString getAddrPhone() {
		return toStr(super.getValue("ADDR_PHONE"));
	}
	
	public void setAddrPhone(NString value) {
		super.setValue("ADDR_PHONE", value);
	}
	


	public NString getAddrCntyCode() {
		return toStr(super.getValue("ADDR_CNTY_CODE"));
	}
	
	public void setAddrCntyCode(NString value) {
		super.setValue("ADDR_CNTY_CODE", value);
	}
	


	public NString getAddrNatnCode() {
		return toStr(super.getValue("ADDR_NATN_CODE"));
	}
	
	public void setAddrNatnCode(NString value) {
		super.setValue("ADDR_NATN_CODE", value);
	}
	


	public NString getAddrInUsePidm() {
		return toStr(super.getValue("ADDR_IN_USE_PIDM"));
	}
	
	public void setAddrInUsePidm(NString value) {
		super.setValue("ADDR_IN_USE_PIDM", value);
	}
	


	public NString getAddrInUseUser() {
		return toStr(super.getValue("ADDR_IN_USE_USER"));
	}
	
	public void setAddrInUseUser(NString value) {
		super.setValue("ADDR_IN_USE_USER", value);
	}
	


	public NString getAddrInUseNameLf30() {
		return toStr(super.getValue("ADDR_IN_USE_NAME_LF30"));
	}
	
	public void setAddrInUseNameLf30(NString value) {
		super.setValue("ADDR_IN_USE_NAME_LF30", value);
	}
	


	public NString getHouseholdCount() {
		return toStr(super.getValue("HOUSEHOLD_COUNT"));
	}
	
	public void setHouseholdCount(NString value) {
		super.setValue("HOUSEHOLD_COUNT", value);
	}
	


	public NString getAddrDataBar1() {
		return toStr(super.getValue("ADDR_DATA_BAR_1"));
	}
	
	public void setAddrDataBar1(NString value) {
		super.setValue("ADDR_DATA_BAR_1", value);
	}
	



}




