package  net.hedtech.general.common.libraries.Goqclib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;



public class SpremrgAdapter extends BaseRowAdapter{
	

	public SpremrgAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setSpremrgPriority(NString value){
		this.setValue("SPREMRG_PRIORITY", value.getValue());
	}


	public NString getSpremrgPriority(){
		NString v = new NString((String)this.getValue("SPREMRG_PRIORITY"));
		return v;
	}


	
	
	public void setSpremrgReltCode(NString value){
		this.setValue("SPREMRG_RELT_CODE", value.getValue());
	}


	public NString getSpremrgReltCode(){
		NString v = new NString((String)this.getValue("SPREMRG_RELT_CODE"));
		return v;
	}


	
	
	public void setReltDescription(NString value){
		this.setValue("RELT_DESCRIPTION", value.getValue());
	}


	public NString getReltDescription(){
		NString v = new NString((String)this.getValue("RELT_DESCRIPTION"));
		return v;
	}


	
	
	public void setSpremrgSurnamePrefix(NString value){
		this.setValue("SPREMRG_SURNAME_PREFIX", value.getValue());
	}


	public NString getSpremrgSurnamePrefix(){
		NString v = new NString((String)this.getValue("SPREMRG_SURNAME_PREFIX"));
		return v;
	}


	
	
	public void setSpremrgLastName(NString value){
		this.setValue("SPREMRG_LAST_NAME", value.getValue());
	}


	public NString getSpremrgLastName(){
		NString v = new NString((String)this.getValue("SPREMRG_LAST_NAME"));
		return v;
	}


	
	
	public void setSpremrgFirstName(NString value){
		this.setValue("SPREMRG_FIRST_NAME", value.getValue());
	}


	public NString getSpremrgFirstName(){
		NString v = new NString((String)this.getValue("SPREMRG_FIRST_NAME"));
		return v;
	}


	
	
	public void setSpremrgMi(NString value){
		this.setValue("SPREMRG_MI", value.getValue());
	}


	public NString getSpremrgMi(){
		NString v = new NString((String)this.getValue("SPREMRG_MI"));
		return v;
	}


	
	
	public void setSpremrgAtypCode(NString value){
		this.setValue("SPREMRG_ATYP_CODE", value.getValue());
	}


	public NString getSpremrgAtypCode(){
		NString v = new NString((String)this.getValue("SPREMRG_ATYP_CODE"));
		return v;
	}


	
	
	public void setAtypDescription(NString value){
		this.setValue("ATYP_DESCRIPTION", value.getValue());
	}


	public NString getAtypDescription(){
		NString v = new NString((String)this.getValue("ATYP_DESCRIPTION"));
		return v;
	}


	
	
	public void setSpremrgHouseNumber(NString value){
		this.setValue("SPREMRG_HOUSE_NUMBER", value.getValue());
	}


	public NString getSpremrgHouseNumber(){
		NString v = new NString((String)this.getValue("SPREMRG_HOUSE_NUMBER"));
		return v;
	}


	
	
	public void setSpremrgStreetLine1(NString value){
		this.setValue("SPREMRG_STREET_LINE1", value.getValue());
	}


	public NString getSpremrgStreetLine1(){
		NString v = new NString((String)this.getValue("SPREMRG_STREET_LINE1"));
		return v;
	}


	
	
	public void setSpremrgStreetLine2(NString value){
		this.setValue("SPREMRG_STREET_LINE2", value.getValue());
	}


	public NString getSpremrgStreetLine2(){
		NString v = new NString((String)this.getValue("SPREMRG_STREET_LINE2"));
		return v;
	}


	
	
	public void setSpremrgStreetLine3(NString value){
		this.setValue("SPREMRG_STREET_LINE3", value.getValue());
	}


	public NString getSpremrgStreetLine3(){
		NString v = new NString((String)this.getValue("SPREMRG_STREET_LINE3"));
		return v;
	}


	
	
	public void setSpremrgStreetLine4(NString value){
		this.setValue("SPREMRG_STREET_LINE4", value.getValue());
	}


	public NString getSpremrgStreetLine4(){
		NString v = new NString((String)this.getValue("SPREMRG_STREET_LINE4"));
		return v;
	}


	
	
	public void setSpremrgCity(NString value){
		this.setValue("SPREMRG_CITY", value.getValue());
	}


	public NString getSpremrgCity(){
		NString v = new NString((String)this.getValue("SPREMRG_CITY"));
		return v;
	}


	
	
	public void setSpremrgStatCode(NString value){
		this.setValue("SPREMRG_STAT_CODE", value.getValue());
	}


	public NString getSpremrgStatCode(){
		NString v = new NString((String)this.getValue("SPREMRG_STAT_CODE"));
		return v;
	}


	
	
	public void setStateDescription(NString value){
		this.setValue("STATE_DESCRIPTION", value.getValue());
	}


	public NString getStateDescription(){
		NString v = new NString((String)this.getValue("STATE_DESCRIPTION"));
		return v;
	}


	
	
	public void setSpremrgZip(NString value){
		this.setValue("SPREMRG_ZIP", value.getValue());
	}


	public NString getSpremrgZip(){
		NString v = new NString((String)this.getValue("SPREMRG_ZIP"));
		return v;
	}


	
	
	public void setSpremrgNatnCode(NString value){
		this.setValue("SPREMRG_NATN_CODE", value.getValue());
	}


	public NString getSpremrgNatnCode(){
		NString v = new NString((String)this.getValue("SPREMRG_NATN_CODE"));
		return v;
	}


	
	
	public void setNatnDescription(NString value){
		this.setValue("NATN_DESCRIPTION", value.getValue());
	}


	public NString getNatnDescription(){
		NString v = new NString((String)this.getValue("NATN_DESCRIPTION"));
		return v;
	}


	
	
	public void setSpremrgCtryCodePhone(NString value){
		this.setValue("SPREMRG_CTRY_CODE_PHONE", value.getValue());
	}


	public NString getSpremrgCtryCodePhone(){
		NString v = new NString((String)this.getValue("SPREMRG_CTRY_CODE_PHONE"));
		return v;
	}


	
	
	public void setSpremrgPhoneArea(NString value){
		this.setValue("SPREMRG_PHONE_AREA", value.getValue());
	}


	public NString getSpremrgPhoneArea(){
		NString v = new NString((String)this.getValue("SPREMRG_PHONE_AREA"));
		return v;
	}


	
	
	public void setSpremrgPhoneNumber(NString value){
		this.setValue("SPREMRG_PHONE_NUMBER", value.getValue());
	}


	public NString getSpremrgPhoneNumber(){
		NString v = new NString((String)this.getValue("SPREMRG_PHONE_NUMBER"));
		return v;
	}


	
	
	public void setSpremrgPhoneExt(NString value){
		this.setValue("SPREMRG_PHONE_EXT", value.getValue());
	}


	public NString getSpremrgPhoneExt(){
		NString v = new NString((String)this.getValue("SPREMRG_PHONE_EXT"));
		return v;
	}


	
	
	public void setSpremrgUserId(NString value){
		this.setValue("SPREMRG_USER_ID", value.getValue());
	}


	public NString getSpremrgUserId(){
		NString v = new NString((String)this.getValue("SPREMRG_USER_ID"));
		return v;
	}


	
	
	public void setSpremrgActivityDate(NDate value){
		this.setValue("SPREMRG_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSpremrgActivityDate(){
		NDate v = new NDate((Date)this.getValue("SPREMRG_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setSpremrgPidm(NNumber value){
		this.setValue("SPREMRG_PIDM", value.getValue());
	}


	public NNumber getSpremrgPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPREMRG_PIDM"));
		return v;
	}


	
	
	public void setPage0Seqno(NNumber value){
		this.setValue("PAGE0_SEQNO", value.getValue());
	}


	public NNumber getPage0Seqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("PAGE0_SEQNO"));
		return v;
	}


	
	
	public void setNoAddrInfo(NNumber value){
		this.setValue("NO_ADDR_INFO", value.getValue());
	}


	public NNumber getNoAddrInfo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("NO_ADDR_INFO"));
		return v;
	}


	
	
	public void setParmCnty(NString value){
		this.setValue("PARM_CNTY", value.getValue());
	}


	public NString getParmCnty(){
		NString v = new NString((String)this.getValue("PARM_CNTY"));
		return v;
	}


	
	
	public void setHldRowid(NString value){
		this.setValue("HLD_ROWID", value.getValue());
	}


	public NString getHldRowid(){
		NString v = new NString((String)this.getValue("HLD_ROWID"));
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
