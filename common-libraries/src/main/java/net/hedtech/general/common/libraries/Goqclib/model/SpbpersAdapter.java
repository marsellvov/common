package  net.hedtech.general.common.libraries.Goqclib.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.configuration.DAOConfiguration;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;



public class SpbpersAdapter extends BaseRowAdapter{
	

	public SpbpersAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setPersSex(NString value){
		this.setValue("PERS_SEX", value.getValue());
	}


	public NString getPersSex(){
		NString v = new NString((String)this.getValue("PERS_SEX"));
		return v;
	}


	
	
	public void setSpbpersBirthDate(NDate value){
		this.setValue("SPBPERS_BIRTH_DATE", value.getValue());
	}


	public NDate getSpbpersBirthDate(){
		NDate v = new NDate((Date)this.getValue("SPBPERS_BIRTH_DATE"));
		return v;
	}


	
	
	public void setSpbpersSsn(NString value){
		this.setValue("SPBPERS_SSN", value.getValue());
	}


	public NString getSpbpersSsn(){
		NString v = new NString((String)this.getValue("SPBPERS_SSN"));
		return v;
	}


	
	
	public void setPersAge(NNumber value){
		this.setValue("PERS_AGE", value.getValue());
	}


	public NNumber getPersAge(){
		NNumber v = new NNumber((BigDecimal)this.getValue("PERS_AGE"));
		return v;
	}


	
	
	public void setSpbpersConfidInd(NString value){
		this.setValue("SPBPERS_CONFID_IND", value.getValue());
	}


	public NString getSpbpersConfidInd(){
		NString v = new NString((String)this.getValue("SPBPERS_CONFID_IND"));
		return v;
	}


	
	
	public void setSpbpersDeadInd(NString value){
		this.setValue("SPBPERS_DEAD_IND", value.getValue());
	}


	public NString getSpbpersDeadInd(){
		NString v = new NString((String)this.getValue("SPBPERS_DEAD_IND"));
		return v;
	}


	
	
	public void setSpbpersDeadDate(NDate value){
		this.setValue("SPBPERS_DEAD_DATE", value.getValue());
	}


	public NDate getSpbpersDeadDate(){
		NDate v = new NDate((Date)this.getValue("SPBPERS_DEAD_DATE"));
		return v;
	}


	
	
	public void setSpbpersCitzCode(NString value){
		this.setValue("SPBPERS_CITZ_CODE", value.getValue());
	}


	public NString getSpbpersCitzCode(){
		NString v = new NString((String)this.getValue("SPBPERS_CITZ_CODE"));
		return v;
	}


	
	
	public void setCitzDesc(NString value){
		this.setValue("CITZ_DESC", value.getValue());
	}


	public NString getCitzDesc(){
		NString v = new NString((String)this.getValue("CITZ_DESC"));
		return v;
	}


	
	
	public void setSpbpersMrtlCode(NString value){
		this.setValue("SPBPERS_MRTL_CODE", value.getValue());
	}


	public NString getSpbpersMrtlCode(){
		NString v = new NString((String)this.getValue("SPBPERS_MRTL_CODE"));
		return v;
	}


	
	
	public void setMrtlDescription(NString value){
		this.setValue("MRTL_DESCRIPTION", value.getValue());
	}


	public NString getMrtlDescription(){
		NString v = new NString((String)this.getValue("MRTL_DESCRIPTION"));
		return v;
	}


	
	
	public void setSpbpersRelgCode(NString value){
		this.setValue("SPBPERS_RELG_CODE", value.getValue());
	}


	public NString getSpbpersRelgCode(){
		NString v = new NString((String)this.getValue("SPBPERS_RELG_CODE"));
		return v;
	}


	
	
	public void setRelgDescription(NString value){
		this.setValue("RELG_DESCRIPTION", value.getValue());
	}


	public NString getRelgDescription(){
		NString v = new NString((String)this.getValue("RELG_DESCRIPTION"));
		return v;
	}


	
	
	public void setSpbpersLgcyCode(NString value){
		this.setValue("SPBPERS_LGCY_CODE", value.getValue());
	}


	public NString getSpbpersLgcyCode(){
		NString v = new NString((String)this.getValue("SPBPERS_LGCY_CODE"));
		return v;
	}


	
	
	public void setLgcyDescription(NString value){
		this.setValue("LGCY_DESCRIPTION", value.getValue());
	}


	public NString getLgcyDescription(){
		NString v = new NString((String)this.getValue("LGCY_DESCRIPTION"));
		return v;
	}


	
	
	public void setSpbpersEthnCode(NString value){
		this.setValue("SPBPERS_ETHN_CODE", value.getValue());
	}


	public NString getSpbpersEthnCode(){
		NString v = new NString((String)this.getValue("SPBPERS_ETHN_CODE"));
		return v;
	}


	
	
	public void setEthnDescription(NString value){
		this.setValue("ETHN_DESCRIPTION", value.getValue());
	}


	public NString getEthnDescription(){
		NString v = new NString((String)this.getValue("ETHN_DESCRIPTION"));
		return v;
	}


	
	
	public void setSpbpersEthnCde(NString value){
		this.setValue("SPBPERS_ETHN_CDE", value.getValue());
	}


	public NString getSpbpersEthnCde(){
		NString v = new NString((String)this.getValue("SPBPERS_ETHN_CDE"));
		return v;
	}


	
	
	public void setSpbpersConfirmedReCde(NString value){
		this.setValue("SPBPERS_CONFIRMED_RE_CDE", value.getValue());
	}


	public NString getSpbpersConfirmedReCde(){
		NString v = new NString((String)this.getValue("SPBPERS_CONFIRMED_RE_CDE"));
		return v;
	}


	
	
	public void setSpbpersConfirmedReDate(NDate value){
		this.setValue("SPBPERS_CONFIRMED_RE_DATE", value.getValue());
	}


	public NDate getSpbpersConfirmedReDate(){
		NDate v = new NDate((Date)this.getValue("SPBPERS_CONFIRMED_RE_DATE"));
		return v;
	}


	
	
	public void setSpbpersVetcFileNumber(NString value){
		this.setValue("SPBPERS_VETC_FILE_NUMBER", value.getValue());
	}


	public NString getSpbpersVetcFileNumber(){
		NString v = new NString((String)this.getValue("SPBPERS_VETC_FILE_NUMBER"));
		return v;
	}


	
	
	public void setSpbpersVeraInd(NString value){
		this.setValue("SPBPERS_VERA_IND", value.getValue());
	}


	public NString getSpbpersVeraInd(){
		NString v = new NString((String)this.getValue("SPBPERS_VERA_IND"));
		return v;
	}


	
	
	public void setSpbpersActiveDutySeprDate(NDate value){
		this.setValue("SPBPERS_ACTIVE_DUTY_SEPR_DATE", value.getValue());
	}


	public NDate getSpbpersActiveDutySeprDate(){
		NDate v = new NDate((Date)this.getValue("SPBPERS_ACTIVE_DUTY_SEPR_DATE"));
		return v;
	}


	
	
	public void setSpbpersArmedServMedVetInd(NString value){
		this.setValue("SPBPERS_ARMED_SERV_MED_VET_IND", value.getValue());
	}


	public NString getSpbpersArmedServMedVetInd(){
		NString v = new NString((String)this.getValue("SPBPERS_ARMED_SERV_MED_VET_IND"));
		return v;
	}


	
	
	public void setSpbpersSdvetInd(NString value){
		this.setValue("SPBPERS_SDVET_IND", value.getValue());
	}


	public NString getSpbpersSdvetInd(){
		NString v = new NString((String)this.getValue("SPBPERS_SDVET_IND"));
		return v;
	}


	
	
	public void setSpbpersUserId(NString value){
		this.setValue("SPBPERS_USER_ID", value.getValue());
	}


	public NString getSpbpersUserId(){
		NString v = new NString((String)this.getValue("SPBPERS_USER_ID"));
		return v;
	}


	
	
	public void setSpbpersActivityDate(NDate value){
		this.setValue("SPBPERS_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSpbpersActivityDate(){
		NDate v = new NDate((Date)this.getValue("SPBPERS_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setSpbpersPidm(NNumber value){
		this.setValue("SPBPERS_PIDM", value.getValue());
	}


	public NNumber getSpbpersPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SPBPERS_PIDM"));
		return v;
	}


	
	
	public void setSpbpersSex(NString value){
		this.setValue("SPBPERS_SEX", value.getValue());
	}


	public NString getSpbpersSex(){
		NString v = new NString((String)this.getValue("SPBPERS_SEX"));
		return v;
	}


	
	
	public void setSpbpersPrefFirstName(NString value){
		this.setValue("SPBPERS_PREF_FIRST_NAME", value.getValue());
	}


	public NString getSpbpersPrefFirstName(){
		NString v = new NString((String)this.getValue("SPBPERS_PREF_FIRST_NAME"));
		return v;
	}


	
	
	public void setSpbpersLegalName(NString value){
		this.setValue("SPBPERS_LEGAL_NAME", value.getValue());
	}


	public NString getSpbpersLegalName(){
		NString v = new NString((String)this.getValue("SPBPERS_LEGAL_NAME"));
		return v;
	}


	
	
	public void setSpbpersNamePrefix(NString value){
		this.setValue("SPBPERS_NAME_PREFIX", value.getValue());
	}


	public NString getSpbpersNamePrefix(){
		NString v = new NString((String)this.getValue("SPBPERS_NAME_PREFIX"));
		return v;
	}


	
	
	public void setSpbpersNameSuffix(NString value){
		this.setValue("SPBPERS_NAME_SUFFIX", value.getValue());
	}


	public NString getSpbpersNameSuffix(){
		NString v = new NString((String)this.getValue("SPBPERS_NAME_SUFFIX"));
		return v;
	}


	
	
	public void setHoldCitzCode(NString value){
		this.setValue("HOLD_CITZ_CODE", value.getValue());
	}


	public NString getHoldCitzCode(){
		NString v = new NString((String)this.getValue("HOLD_CITZ_CODE"));
		return v;
	}


	
	
	public void setHoldEthnCode(NString value){
		this.setValue("HOLD_ETHN_CODE", value.getValue());
	}


	public NString getHoldEthnCode(){
		NString v = new NString((String)this.getValue("HOLD_ETHN_CODE"));
		return v;
	}


	
	
	public void setHoldLgcyCode(NString value){
		this.setValue("HOLD_LGCY_CODE", value.getValue());
	}


	public NString getHoldLgcyCode(){
		NString v = new NString((String)this.getValue("HOLD_LGCY_CODE"));
		return v;
	}


	
	
	public void setHoldSex(NString value){
		this.setValue("HOLD_SEX", value.getValue());
	}


	public NString getHoldSex(){
		NString v = new NString((String)this.getValue("HOLD_SEX"));
		return v;
	}


	
	
	public void setHoldWebAccessDate(NDate value){
		this.setValue("HOLD_WEB_ACCESS_DATE", value.getValue());
	}


	public NDate getHoldWebAccessDate(){
		NDate v = new NDate((Date)this.getValue("HOLD_WEB_ACCESS_DATE"));
		return v;
	}


	
	
	public void setGreenDataBar1(NString value){
		this.setValue("GREEN_DATA_BAR_1", value.getValue());
	}


	public NString getGreenDataBar1(){
		NString v = new NString((String)this.getValue("GREEN_DATA_BAR_1"));
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
