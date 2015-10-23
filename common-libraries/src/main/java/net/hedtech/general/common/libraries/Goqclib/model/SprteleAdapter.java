package  net.hedtech.general.common.libraries.Goqclib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;



public class SprteleAdapter extends BaseRowAdapter{
	

	public SprteleAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setSprteleTeleCode(NString value){
		this.setValue("SPRTELE_TELE_CODE", value.getValue());
	}


	public NString getSprteleTeleCode(){
		NString v = new NString((String)this.getValue("SPRTELE_TELE_CODE"));
		return v;
	}


	
	
	public void setTeleDescription(NString value){
		this.setValue("TELE_DESCRIPTION", value.getValue());
	}


	public NString getTeleDescription(){
		NString v = new NString((String)this.getValue("TELE_DESCRIPTION"));
		return v;
	}


	
	
	public void setSprteleCtryCodePhone(NString value){
		this.setValue("SPRTELE_CTRY_CODE_PHONE", value.getValue());
	}


	public NString getSprteleCtryCodePhone(){
		NString v = new NString((String)this.getValue("SPRTELE_CTRY_CODE_PHONE"));
		return v;
	}


	
	
	public void setSprtelePhoneArea(NString value){
		this.setValue("SPRTELE_PHONE_AREA", value.getValue());
	}


	public NString getSprtelePhoneArea(){
		NString v = new NString((String)this.getValue("SPRTELE_PHONE_AREA"));
		return v;
	}


	
	
	public void setSprtelePhoneNumber(NString value){
		this.setValue("SPRTELE_PHONE_NUMBER", value.getValue());
	}


	public NString getSprtelePhoneNumber(){
		NString v = new NString((String)this.getValue("SPRTELE_PHONE_NUMBER"));
		return v;
	}


	
	
	public void setSprtelePhoneExt(NString value){
		this.setValue("SPRTELE_PHONE_EXT", value.getValue());
	}


	public NString getSprtelePhoneExt(){
		NString v = new NString((String)this.getValue("SPRTELE_PHONE_EXT"));
		return v;
	}


	
	
	public void setSprteleIntlAccess(NString value){
		this.setValue("SPRTELE_INTL_ACCESS", value.getValue());
	}


	public NString getSprteleIntlAccess(){
		NString v = new NString((String)this.getValue("SPRTELE_INTL_ACCESS"));
		return v;
	}


	
	
	public void setSprtelePrimaryInd(NString value){
		this.setValue("SPRTELE_PRIMARY_IND", value.getValue());
	}


	public NString getSprtelePrimaryInd(){
		NString v = new NString((String)this.getValue("SPRTELE_PRIMARY_IND"));
		return v;
	}


	
	
	public void setSprteleUnlistInd(NString value){
		this.setValue("SPRTELE_UNLIST_IND", value.getValue());
	}


	public NString getSprteleUnlistInd(){
		NString v = new NString((String)this.getValue("SPRTELE_UNLIST_IND"));
		return v;
	}


	
	
	public void setSprteleStatusInd(NString value){
		this.setValue("SPRTELE_STATUS_IND", value.getValue());
	}


	public NString getSprteleStatusInd(){
		NString v = new NString((String)this.getValue("SPRTELE_STATUS_IND"));
		return v;
	}


	
	
	public void setSprteleComment(NString value){
		this.setValue("SPRTELE_COMMENT", value.getValue());
	}


	public NString getSprteleComment(){
		NString v = new NString((String)this.getValue("SPRTELE_COMMENT"));
		return v;
	}


	
	
	public void setSprteleAtypCode(NString value){
		this.setValue("SPRTELE_ATYP_CODE", value.getValue());
	}


	public NString getSprteleAtypCode(){
		NString v = new NString((String)this.getValue("SPRTELE_ATYP_CODE"));
		return v;
	}


	
	
	public void setAtypDescription(NString value){
		this.setValue("ATYP_DESCRIPTION", value.getValue());
	}


	public NString getAtypDescription(){
		NString v = new NString((String)this.getValue("ATYP_DESCRIPTION"));
		return v;
	}


	
	
	public void setSprteleAddrSeqno(NNumber value){
		this.setValue("SPRTELE_ADDR_SEQNO", value.getValue());
	}


	public NNumber getSprteleAddrSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRTELE_ADDR_SEQNO"));
		return v;
	}


	
	
	public void setSprteleActivityDate(NDate value){
		this.setValue("SPRTELE_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSprteleActivityDate(){
		NDate v = new NDate((Date)this.getValue("SPRTELE_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setSprteleUserId(NString value){
		this.setValue("SPRTELE_USER_ID", value.getValue());
	}


	public NString getSprteleUserId(){
		NString v = new NString((String)this.getValue("SPRTELE_USER_ID"));
		return v;
	}


	
	// F2J_TODO : Item SPRTELE_PIDM has the "Copy Value from Item" property defined, with value: KEY_BLOCK.PIDM                  
	
	public void setSprtelePidm(NNumber value){
		this.setValue("SPRTELE_PIDM", value.getValue());
	}


	public NNumber getSprtelePidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRTELE_PIDM"));
		return v;
	}


	
	
	public void setSprteleSeqno(NNumber value){
		this.setValue("SPRTELE_SEQNO", value.getValue());
	}


	public NNumber getSprteleSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRTELE_SEQNO"));
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
