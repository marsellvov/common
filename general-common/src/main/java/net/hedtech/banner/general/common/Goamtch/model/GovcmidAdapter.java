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



public class GovcmidAdapter extends BaseRowAdapter{
	

	public GovcmidAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGovcmidPidm(NNumber value){
		this.setValue("GOVCMID_PIDM", value.getValue());
	}


	public NNumber getGovcmidPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GOVCMID_PIDM"));
		return v;
	}


	
	
	public void setGovcmidId(NString value){
		this.setValue("GOVCMID_ID", value.getValue());
	}


	public NString getGovcmidId(){
		NString v = new NString((String)this.getValue("GOVCMID_ID"));
		return v;
	}


	
	
	public void setGovcmidName(NString value){
		this.setValue("GOVCMID_NAME", value.getValue());
	}


	public NString getGovcmidName(){
		NString v = new NString((String)this.getValue("GOVCMID_NAME"));
		return v;
	}


	
	
	public void setMatchId(NString value){
		this.setValue("MATCH_ID", value.getValue());
	}


	public NString getMatchId(){
		NString v = new NString((String)this.getValue("MATCH_ID"));
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


	
	
	public void setAddressHierarchyMatch(NString value){
		this.setValue("ADDRESS_HIERARCHY_MATCH", value.getValue());
	}


	public NString getAddressHierarchyMatch(){
		NString v = new NString((String)this.getValue("ADDRESS_HIERARCHY_MATCH"));
		return v;
	}


	
	
	public void setTelephoneHierarchyMatch(NString value){
		this.setValue("TELEPHONE_HIERARCHY_MATCH", value.getValue());
	}


	public NString getTelephoneHierarchyMatch(){
		NString v = new NString((String)this.getValue("TELEPHONE_HIERARCHY_MATCH"));
		return v;
	}


	
	
	public void setEmailHierarchyMatch(NString value){
		this.setValue("EMAIL_HIERARCHY_MATCH", value.getValue());
	}


	public NString getEmailHierarchyMatch(){
		NString v = new NString((String)this.getValue("EMAIL_HIERARCHY_MATCH"));
		return v;
	}


	
	
	public void setMatchAddCode(NString value){
		this.setValue("MATCH_ADD_CODE", value.getValue());
	}


	public NString getMatchAddCode(){
		NString v = new NString((String)this.getValue("MATCH_ADD_CODE"));
		return v;
	}


	
	
	public void setMatchAddId(NString value){
		this.setValue("MATCH_ADD_ID", value.getValue());
	}


	public NString getMatchAddId(){
		NString v = new NString((String)this.getValue("MATCH_ADD_ID"));
		return v;
	}


	
	
	public void setMatchPriorityList(NString value){
		this.setValue("MATCH_PRIORITY_LIST", value.getValue());
	}


	public NString getMatchPriorityList(){
		NString v = new NString((String)this.getValue("MATCH_PRIORITY_LIST"));
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


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
