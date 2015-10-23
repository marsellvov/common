package  net.hedtech.general.common.libraries.Goqclib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;



public class SpridenCurrentAdapter extends BaseRowAdapter{
	

	public SpridenCurrentAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setSpridenId(NString value){
		this.setValue("SPRIDEN_ID", value.getValue());
	}


	public NString getSpridenId(){
		NString v = new NString((String)this.getValue("SPRIDEN_ID"));
		return v;
	}


	
	
	public void setSpridenNtypCode(NString value){
		this.setValue("SPRIDEN_NTYP_CODE", value.getValue());
	}


	public NString getSpridenNtypCode(){
		NString v = new NString((String)this.getValue("SPRIDEN_NTYP_CODE"));
		return v;
	}


	
	
	public void setCurrentNtypDesc(NString value){
		this.setValue("CURRENT_NTYP_DESC", value.getValue());
	}


	public NString getCurrentNtypDesc(){
		NString v = new NString((String)this.getValue("CURRENT_NTYP_DESC"));
		return v;
	}


	
	
	public void setPersSsn(NString value){
		this.setValue("PERS_SSN", value.getValue());
	}


	public NString getPersSsn(){
		NString v = new NString((String)this.getValue("PERS_SSN"));
		return v;
	}


	
	
	public void setPersSurnamePrefix(NString value){
		this.setValue("PERS_SURNAME_PREFIX", value.getValue());
	}


	public NString getPersSurnamePrefix(){
		NString v = new NString((String)this.getValue("PERS_SURNAME_PREFIX"));
		return v;
	}


	
	
	public void setPersLastName(NString value){
		this.setValue("PERS_LAST_NAME", value.getValue());
	}


	public NString getPersLastName(){
		NString v = new NString((String)this.getValue("PERS_LAST_NAME"));
		return v;
	}


	
	
	public void setPersFirstName(NString value){
		this.setValue("PERS_FIRST_NAME", value.getValue());
	}


	public NString getPersFirstName(){
		NString v = new NString((String)this.getValue("PERS_FIRST_NAME"));
		return v;
	}


	
	
	public void setPersMi(NString value){
		this.setValue("PERS_MI", value.getValue());
	}


	public NString getPersMi(){
		NString v = new NString((String)this.getValue("PERS_MI"));
		return v;
	}


	
	
	public void setPersPrefix(NString value){
		this.setValue("PERS_PREFIX", value.getValue());
	}


	public NString getPersPrefix(){
		NString v = new NString((String)this.getValue("PERS_PREFIX"));
		return v;
	}


	
	
	public void setPersSuffix(NString value){
		this.setValue("PERS_SUFFIX", value.getValue());
	}


	public NString getPersSuffix(){
		NString v = new NString((String)this.getValue("PERS_SUFFIX"));
		return v;
	}


	
	
	public void setPersPrefFname(NString value){
		this.setValue("PERS_PREF_FNAME", value.getValue());
	}


	public NString getPersPrefFname(){
		NString v = new NString((String)this.getValue("PERS_PREF_FNAME"));
		return v;
	}


	
	
	public void setPersLegalName(NString value){
		this.setValue("PERS_LEGAL_NAME", value.getValue());
	}


	public NString getPersLegalName(){
		NString v = new NString((String)this.getValue("PERS_LEGAL_NAME"));
		return v;
	}


	
	
	public void setPersMrtlCode(NString value){
		this.setValue("PERS_MRTL_CODE", value.getValue());
	}


	public NString getPersMrtlCode(){
		NString v = new NString((String)this.getValue("PERS_MRTL_CODE"));
		return v;
	}


	
	
	public void setMrtlDesc(NString value){
		this.setValue("MRTL_DESC", value.getValue());
	}


	public NString getMrtlDesc(){
		NString v = new NString((String)this.getValue("MRTL_DESC"));
		return v;
	}


	
	
	public void setNonPersName(NString value){
		this.setValue("NON_PERS_NAME", value.getValue());
	}


	public NString getNonPersName(){
		NString v = new NString((String)this.getValue("NON_PERS_NAME"));
		return v;
	}


	
	
	public void setSpridenUser(NString value){
		this.setValue("SPRIDEN_USER", value.getValue());
	}


	public NString getSpridenUser(){
		NString v = new NString((String)this.getValue("SPRIDEN_USER"));
		return v;
	}


	
	
	public void setSpridenActivityDate(NDate value){
		this.setValue("SPRIDEN_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSpridenActivityDate(){
		NDate v = new NDate((Date)this.getValue("SPRIDEN_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setSpridenOrigin(NString value){
		this.setValue("SPRIDEN_ORIGIN", value.getValue());
	}


	public NString getSpridenOrigin(){
		NString v = new NString((String)this.getValue("SPRIDEN_ORIGIN"));
		return v;
	}


	
	
	public void setSpridenCreateUser(NString value){
		this.setValue("SPRIDEN_CREATE_USER", value.getValue());
	}


	public NString getSpridenCreateUser(){
		NString v = new NString((String)this.getValue("SPRIDEN_CREATE_USER"));
		return v;
	}


	
	
	public void setSpridenCreateDate(NDate value){
		this.setValue("SPRIDEN_CREATE_DATE", value.getValue());
	}


	public NDate getSpridenCreateDate(){
		NDate v = new NDate((Date)this.getValue("SPRIDEN_CREATE_DATE"));
		return v;
	}


	
	
	public void setSpridenPidm(NNumber value){
		this.setValue("SPRIDEN_PIDM", value.getValue());
	}


	public NNumber getSpridenPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPRIDEN_PIDM"));
		return v;
	}


	
	
	public void setSpridenChangeInd(NString value){
		this.setValue("SPRIDEN_CHANGE_IND", value.getValue());
	}


	public NString getSpridenChangeInd(){
		NString v = new NString((String)this.getValue("SPRIDEN_CHANGE_IND"));
		return v;
	}


	
	
	public void setSpridenMi(NString value){
		this.setValue("SPRIDEN_MI", value.getValue());
	}


	public NString getSpridenMi(){
		NString v = new NString((String)this.getValue("SPRIDEN_MI"));
		return v;
	}


	
	
	public void setSpridenFirstName(NString value){
		this.setValue("SPRIDEN_FIRST_NAME", value.getValue());
	}


	public NString getSpridenFirstName(){
		NString v = new NString((String)this.getValue("SPRIDEN_FIRST_NAME"));
		return v;
	}


	
	
	public void setSpridenEntityInd(NString value){
		this.setValue("SPRIDEN_ENTITY_IND", value.getValue());
	}


	public NString getSpridenEntityInd(){
		NString v = new NString((String)this.getValue("SPRIDEN_ENTITY_IND"));
		return v;
	}


	
	
	public void setSpridenSurnamePrefix(NString value){
		this.setValue("SPRIDEN_SURNAME_PREFIX", value.getValue());
	}


	public NString getSpridenSurnamePrefix(){
		NString v = new NString((String)this.getValue("SPRIDEN_SURNAME_PREFIX"));
		return v;
	}


	
	
	public void setSpridenLastName(NString value){
		this.setValue("SPRIDEN_LAST_NAME", value.getValue());
	}


	public NString getSpridenLastName(){
		NString v = new NString((String)this.getValue("SPRIDEN_LAST_NAME"));
		return v;
	}


	
	
	public void setChangeSpbpers(NString value){
		this.setValue("CHANGE_SPBPERS", value.getValue());
	}


	public NString getChangeSpbpers(){
		NString v = new NString((String)this.getValue("CHANGE_SPBPERS"));
		return v;
	}


	
	
	public void setFoundSpbpers(NString value){
		this.setValue("FOUND_SPBPERS", value.getValue());
	}


	public NString getFoundSpbpers(){
		NString v = new NString((String)this.getValue("FOUND_SPBPERS"));
		return v;
	}


	
	
	public void setHoldItem(NString value){
		this.setValue("HOLD_ITEM", value.getValue());
	}


	public NString getHoldItem(){
		NString v = new NString((String)this.getValue("HOLD_ITEM"));
		return v;
	}


	
	
	public void setHoldMrtlCode(NString value){
		this.setValue("HOLD_MRTL_CODE", value.getValue());
	}


	public NString getHoldMrtlCode(){
		NString v = new NString((String)this.getValue("HOLD_MRTL_CODE"));
		return v;
	}


	
	
	public void setHoldSsn(NString value){
		this.setValue("HOLD_SSN", value.getValue());
	}


	public NString getHoldSsn(){
		NString v = new NString((String)this.getValue("HOLD_SSN"));
		return v;
	}


	
	
	public void setHoldPrefix(NString value){
		this.setValue("HOLD_PREFIX", value.getValue());
	}


	public NString getHoldPrefix(){
		NString v = new NString((String)this.getValue("HOLD_PREFIX"));
		return v;
	}


	
	
	public void setHoldSuffix(NString value){
		this.setValue("HOLD_SUFFIX", value.getValue());
	}


	public NString getHoldSuffix(){
		NString v = new NString((String)this.getValue("HOLD_SUFFIX"));
		return v;
	}


	
	
	public void setHoldPrefFname(NString value){
		this.setValue("HOLD_PREF_FNAME", value.getValue());
	}


	public NString getHoldPrefFname(){
		NString v = new NString((String)this.getValue("HOLD_PREF_FNAME"));
		return v;
	}


	
	
	public void setHoldLegalName(NString value){
		this.setValue("HOLD_LEGAL_NAME", value.getValue());
	}


	public NString getHoldLegalName(){
		NString v = new NString((String)this.getValue("HOLD_LEGAL_NAME"));
		return v;
	}


	
	
	public void setChangeIden(NString value){
		this.setValue("CHANGE_IDEN", value.getValue());
	}


	public NString getChangeIden(){
		NString v = new NString((String)this.getValue("CHANGE_IDEN"));
		return v;
	}


	
	
	public void setGreenDataBar1(NString value){
		this.setValue("GREEN_DATA_BAR_1", value.getValue());
	}


	public NString getGreenDataBar1(){
		NString v = new NString((String)this.getValue("GREEN_DATA_BAR_1"));
		return v;
	}


	
	
	public void setGreenDataBar2(NString value){
		this.setValue("GREEN_DATA_BAR_2", value.getValue());
	}


	public NString getGreenDataBar2(){
		NString v = new NString((String)this.getValue("GREEN_DATA_BAR_2"));
		return v;
	}


	
	
	public void setGreenDataBar3(NString value){
		this.setValue("GREEN_DATA_BAR_3", value.getValue());
	}


	public NString getGreenDataBar3(){
		NString v = new NString((String)this.getValue("GREEN_DATA_BAR_3"));
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
