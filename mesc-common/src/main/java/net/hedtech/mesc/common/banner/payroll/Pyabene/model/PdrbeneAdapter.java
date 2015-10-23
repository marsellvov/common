package  net.hedtech.mesc.common.banner.payroll.Pyabene.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class PdrbeneAdapter extends BaseRowAdapter{
	

	public PdrbeneAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	// F2J_TODO : Item PDRBENE_PIDM has the "Copy Value from Item" property defined, with value: KEY_BLOCK.PIDM                  
	
	public void setPdrbenePidm(NNumber value){
		this.setValue("PDRBENE_PIDM", value.getValue());
	}


	public NNumber getPdrbenePidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("PDRBENE_PIDM"));
		return v;
	}


	
	
	public void setPdrbeneSeqNo(NNumber value){
		this.setValue("PDRBENE_SEQ_NO", value.getValue());
	}


	public NNumber getPdrbeneSeqNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("PDRBENE_SEQ_NO"));
		return v;
	}


	
	
	public void setPdrbeneBenePidm(NNumber value){
		this.setValue("PDRBENE_BENE_PIDM", value.getValue());
	}


	public NNumber getPdrbeneBenePidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("PDRBENE_BENE_PIDM"));
		return v;
	}


	
	
	public void setPdrbeneBeneLastName(NString value){
		this.setValue("PDRBENE_BENE_LAST_NAME", value.getValue());
	}


	public NString getPdrbeneBeneLastName(){
		NString v = new NString((String)this.getValue("PDRBENE_BENE_LAST_NAME"));
		return v;
	}


	
	
	public void setPdrbeneBeneFirstName(NString value){
		this.setValue("PDRBENE_BENE_FIRST_NAME", value.getValue());
	}


	public NString getPdrbeneBeneFirstName(){
		NString v = new NString((String)this.getValue("PDRBENE_BENE_FIRST_NAME"));
		return v;
	}


	
	
	public void setPdrbeneAge(NNumber value){
		this.setValue("PDRBENE_AGE", value.getValue());
	}


	public NNumber getPdrbeneAge(){
		NNumber v = new NNumber((BigDecimal)this.getValue("PDRBENE_AGE"));
		return v;
	}


	
	
	public void setMartlCode(NString value){
		this.setValue("MARTL_CODE", value.getValue());
	}


	public NString getMartlCode(){
		NString v = new NString((String)this.getValue("MARTL_CODE"));
		return v;
	}


	
	
	public void setBirthNatn(NString value){
		this.setValue("BIRTH_NATN", value.getValue());
	}


	public NString getBirthNatn(){
		NString v = new NString((String)this.getValue("BIRTH_NATN"));
		return v;
	}


	
	
	public void setNatnCode(NString value){
		this.setValue("NATN_CODE", value.getValue());
	}


	public NString getNatnCode(){
		NString v = new NString((String)this.getValue("NATN_CODE"));
		return v;
	}


	
	
	public void setPdrbeneSexInd(NString value){
		this.setValue("PDRBENE_SEX_IND", value.getValue());
	}


	public NString getPdrbeneSexInd(){
		NString v = new NString((String)this.getValue("PDRBENE_SEX_IND"));
		return v;
	}


	
	
	public void setPdrbeneBrelCode(NString value){
		this.setValue("PDRBENE_BREL_CODE", value.getValue());
	}


	public NString getPdrbeneBrelCode(){
		NString v = new NString((String)this.getValue("PDRBENE_BREL_CODE"));
		return v;
	}


	
	
	public void setPdrbeneBrelDesc(NString value){
		this.setValue("PDRBENE_BREL_DESC", value.getValue());
	}


	public NString getPdrbeneBrelDesc(){
		NString v = new NString((String)this.getValue("PDRBENE_BREL_DESC"));
		return v;
	}
	
	public void setPdrbeneBrelType(NString value){
		this.setValue("PDRBENE_BREL_TYPE", value.getValue());
	}


	public NString getPdrbeneBrelType(){
		NString v = new NString((String)this.getValue("PDRBENE_BREL_TYPE"));
		return v;
	}


	
	
	public void setPdrbeneMartlCode(NString value){
		this.setValue("PDRBENE_MARTL_CODE", value.getValue());
	}


	public NString getPdrbeneMartlCode(){
		NString v = new NString((String)this.getValue("PDRBENE_MARTL_CODE"));
		return v;
	}


	
	
	public void setPdrbeneMartlDesc(NString value){
		this.setValue("PDRBENE_MARTL_DESC", value.getValue());
	}


	public NString getPdrbeneMartlDesc(){
		NString v = new NString((String)this.getValue("PDRBENE_MARTL_DESC"));
		return v;
	}


	
	
	public void setPdrbeneNatnCode(NString value){
		this.setValue("PDRBENE_NATN_CODE", value.getValue());
	}


	public NString getPdrbeneNatnCode(){
		NString v = new NString((String)this.getValue("PDRBENE_NATN_CODE"));
		return v;
	}


	
	
	public void setPdrbeneNatnDesc(NString value){
		this.setValue("PDRBENE_NATN_DESC", value.getValue());
	}


	public NString getPdrbeneNatnDesc(){
		NString v = new NString((String)this.getValue("PDRBENE_NATN_DESC"));
		return v;
	}


	
	
	public void setPdrbeneBirthNatn(NString value){
		this.setValue("PDRBENE_BIRTH_NATN", value.getValue());
	}


	public NString getPdrbeneBirthNatn(){
		NString v = new NString((String)this.getValue("PDRBENE_BIRTH_NATN"));
		return v;
	}


	
	
	public void setPdrbeneBirthNatnDesc(NString value){
		this.setValue("PDRBENE_BIRTH_NATN_DESC", value.getValue());
	}


	public NString getPdrbeneBirthNatnDesc(){
		NString v = new NString((String)this.getValue("PDRBENE_BIRTH_NATN_DESC"));
		return v;
	}


	
	
	public void setPdrbeneTktElgbty(NString value){
		this.setValue("PDRBENE_TKT_ELGBTY", value.getValue());
	}


	public NString getPdrbeneTktElgbty(){
		NString v = new NString((String)this.getValue("PDRBENE_TKT_ELGBTY"));
		return v;
	}


	
	
	public void setPdrbeneAirfareCode(NString value){
		this.setValue("PDRBENE_AIRFARE_CODE", value.getValue());
	}


	public NString getPdrbeneAirfareCode(){
		NString v = new NString((String)this.getValue("PDRBENE_AIRFARE_CODE"));
		return v;
	}


	
	
	public void setPdrbeneAirfareDesc(NString value){
		this.setValue("PDRBENE_AIRFARE_DESC", value.getValue());
	}


	public NString getPdrbeneAirfareDesc(){
		NString v = new NString((String)this.getValue("PDRBENE_AIRFARE_DESC"));
		return v;
	}


	
	
	public void setPdrbeneHomeAirport(NString value){
		this.setValue("PDRBENE_HOME_AIRPORT", value.getValue());
	}


	public NString getPdrbeneHomeAirport(){
		NString v = new NString((String)this.getValue("PDRBENE_HOME_AIRPORT"));
		return v;
	}


	
	
	public void setPdrbeneHomeAirportDesc(NString value){
		this.setValue("PDRBENE_HOME_AIRPORT_DESC", value.getValue());
	}


	public NString getPdrbeneHomeAirportDesc(){
		NString v = new NString((String)this.getValue("PDRBENE_HOME_AIRPORT_DESC"));
		return v;
	}


	
	
	public void setPdrbeneHomeNatn(NString value){
		this.setValue("PDRBENE_HOME_NATN", value.getValue());
	}


	public NString getPdrbeneHomeNatn(){
		NString v = new NString((String)this.getValue("PDRBENE_HOME_NATN"));
		return v;
	}


	
	
	public void setPdrbeneHomeNatnDesc(NString value){
		this.setValue("PDRBENE_HOME_NATN_DESC", value.getValue());
	}


	public NString getPdrbeneHomeNatnDesc(){
		NString v = new NString((String)this.getValue("PDRBENE_HOME_NATN_DESC"));
		return v;
	}


	
	
	public void setPdrbeneElgbtyReason(NString value){
		this.setValue("PDRBENE_ELGBTY_REASON", value.getValue());
	}


	public NString getPdrbeneElgbtyReason(){
		NString v = new NString((String)this.getValue("PDRBENE_ELGBTY_REASON"));
		return v;
	}


	
	
	public void setPdrbeneElgbtyReasonDesc(NString value){
		this.setValue("PDRBENE_ELGBTY_REASON_DESC", value.getValue());
	}


	public NString getPdrbeneElgbtyReasonDesc(){
		NString v = new NString((String)this.getValue("PDRBENE_ELGBTY_REASON_DESC"));
		return v;
	}


	
	
	public void setPdrbeneReasonDate(NDate value){
		this.setValue("PDRBENE_REASON_DATE", value.getValue());
	}


	public NDate getPdrbeneReasonDate(){
		NDate v = new NDate((Date)this.getValue("PDRBENE_REASON_DATE"));
		return v;
	}


	
	
	public void setPdrbeneActivityDate(NDate value){
		this.setValue("PDRBENE_ACTIVITY_DATE", value.getValue());
	}


	public NDate getPdrbeneActivityDate(){
		NDate v = new NDate((Date)this.getValue("PDRBENE_ACTIVITY_DATE"));
		return v;
	}
	
	public void setPdrbeneEdufeeElgbty(NString value){
		this.setValue("PDRBENE_EDUFEE_ELGBTY", value.getValue());
	}


	public NString getPdrbeneEdufeeElgbty(){
		NString v = new NString((String)this.getValue("PDRBENE_EDUFEE_ELGBTY"));
		return v;
	}


	
	
	public void setPdrbeneSplfeeElgbty(NString value){
		this.setValue("PDRBENE_SPLFEE_ELGBTY", value.getValue());
	}


	public NString getPdrbeneSplfeeElgbty(){
		NString v = new NString((String)this.getValue("PDRBENE_SPLFEE_ELGBTY"));
		return v;
	}


	

	
}
