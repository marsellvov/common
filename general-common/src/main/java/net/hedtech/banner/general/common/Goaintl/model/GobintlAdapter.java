package  net.hedtech.banner.general.common.Goaintl.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GobintlAdapter extends BaseRowAdapter{
	

	public GobintlAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns                 
	
	public void setGobintlPidm(NNumber value){
		this.setValue("GOBINTL_PIDM", value.getValue());
	}


	public NNumber getGobintlPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GOBINTL_PIDM"));
		return v;
	}


	
	
	public void setGobintlPassportId(NString value){
		this.setValue("GOBINTL_PASSPORT_ID", value.getValue());
	}


	public NString getGobintlPassportId(){
		NString v = new NString((String)this.getValue("GOBINTL_PASSPORT_ID"));
		return v;
	}


	
	
	public void setGobintlNatnCodeIssue(NString value){
		this.setValue("GOBINTL_NATN_CODE_ISSUE", value.getValue());
	}


	public NString getGobintlNatnCodeIssue(){
		NString v = new NString((String)this.getValue("GOBINTL_NATN_CODE_ISSUE"));
		return v;
	}


	
	
	public void setIssueNatnDesc(NString value){
		this.setValue("ISSUE_NATN_DESC", value.getValue());
	}


	public NString getIssueNatnDesc(){
		NString v = new NString((String)this.getValue("ISSUE_NATN_DESC"));
		return v;
	}


	
	
	public void setGobintlPassportExpDate(NDate value){
		this.setValue("GOBINTL_PASSPORT_EXP_DATE", value.getValue());
	}


	public NDate getGobintlPassportExpDate(){
		NDate v = new NDate((Date)this.getValue("GOBINTL_PASSPORT_EXP_DATE"));
		return v;
	}


	
	
	public void setGobintlI94Status(NString value){
		this.setValue("GOBINTL_I94_STATUS", value.getValue());
	}


	public NString getGobintlI94Status(){
		NString v = new NString((String)this.getValue("GOBINTL_I94_STATUS"));
		return v;
	}


	
	
	public void setGobintlI94Date(NDate value){
		this.setValue("GOBINTL_I94_DATE", value.getValue());
	}


	public NDate getGobintlI94Date(){
		NDate v = new NDate((Date)this.getValue("GOBINTL_I94_DATE"));
		return v;
	}


	
	
	public void setGobintlRegNumber(NString value){
		this.setValue("GOBINTL_REG_NUMBER", value.getValue());
	}


	public NString getGobintlRegNumber(){
		NString v = new NString((String)this.getValue("GOBINTL_REG_NUMBER"));
		return v;
	}


	
	
	public void setGobintlDuration(NString value){
		this.setValue("GOBINTL_DURATION", value.getValue());
	}


	public NString getGobintlDuration(){
		NString v = new NString((String)this.getValue("GOBINTL_DURATION"));
		return v;
	}


	
	
	public void setGobintlCelgCode(NString value){
		this.setValue("GOBINTL_CELG_CODE", value.getValue());
	}


	public NString getGobintlCelgCode(){
		NString v = new NString((String)this.getValue("GOBINTL_CELG_CODE"));
		return v;
	}


	
	
	public void setCelgDesc(NString value){
		this.setValue("CELG_DESC", value.getValue());
	}


	public NString getCelgDesc(){
		NString v = new NString((String)this.getValue("CELG_DESC"));
		return v;
	}


	
	
	public void setGobintlCertNumber(NString value){
		this.setValue("GOBINTL_CERT_NUMBER", value.getValue());
	}


	public NString getGobintlCertNumber(){
		NString v = new NString((String)this.getValue("GOBINTL_CERT_NUMBER"));
		return v;
	}


	
	
	public void setGobintlCertDateIssue(NDate value){
		this.setValue("GOBINTL_CERT_DATE_ISSUE", value.getValue());
	}


	public NDate getGobintlCertDateIssue(){
		NDate v = new NDate((Date)this.getValue("GOBINTL_CERT_DATE_ISSUE"));
		return v;
	}


	
	
	public void setGobintlCertDateReceipt(NDate value){
		this.setValue("GOBINTL_CERT_DATE_RECEIPT", value.getValue());
	}


	public NDate getGobintlCertDateReceipt(){
		NDate v = new NDate((Date)this.getValue("GOBINTL_CERT_DATE_RECEIPT"));
		return v;
	}


	
	
	public void setGobintlAdmrCode(NString value){
		this.setValue("GOBINTL_ADMR_CODE", value.getValue());
	}


	public NString getGobintlAdmrCode(){
		NString v = new NString((String)this.getValue("GOBINTL_ADMR_CODE"));
		return v;
	}


	
	
	public void setAdmrDesc(NString value){
		this.setValue("ADMR_DESC", value.getValue());
	}


	public NString getAdmrDesc(){
		NString v = new NString((String)this.getValue("ADMR_DESC"));
		return v;
	}


	
	
	public void setGobintlNatnCodeBirth(NString value){
		this.setValue("GOBINTL_NATN_CODE_BIRTH", value.getValue());
	}


	public NString getGobintlNatnCodeBirth(){
		NString v = new NString((String)this.getValue("GOBINTL_NATN_CODE_BIRTH"));
		return v;
	}


	
	
	public void setBirthNatnDesc(NString value){
		this.setValue("BIRTH_NATN_DESC", value.getValue());
	}


	public NString getBirthNatnDesc(){
		NString v = new NString((String)this.getValue("BIRTH_NATN_DESC"));
		return v;
	}


	
	
	public void setGobintlNatnCodeLegal(NString value){
		this.setValue("GOBINTL_NATN_CODE_LEGAL", value.getValue());
	}


	public NString getGobintlNatnCodeLegal(){
		NString v = new NString((String)this.getValue("GOBINTL_NATN_CODE_LEGAL"));
		return v;
	}


	
	
	public void setLegalNatnDesc(NString value){
		this.setValue("LEGAL_NATN_DESC", value.getValue());
	}


	public NString getLegalNatnDesc(){
		NString v = new NString((String)this.getValue("LEGAL_NATN_DESC"));
		return v;
	}


	
	
	public void setGobintlLangCode(NString value){
		this.setValue("GOBINTL_LANG_CODE", value.getValue());
	}


	public NString getGobintlLangCode(){
		NString v = new NString((String)this.getValue("GOBINTL_LANG_CODE"));
		return v;
	}


	
	
	public void setLangDesc(NString value){
		this.setValue("LANG_DESC", value.getValue());
	}


	public NString getLangDesc(){
		NString v = new NString((String)this.getValue("LANG_DESC"));
		return v;
	}


	
	
	public void setGobintlSponCode(NString value){
		this.setValue("GOBINTL_SPON_CODE", value.getValue());
	}


	public NString getGobintlSponCode(){
		NString v = new NString((String)this.getValue("GOBINTL_SPON_CODE"));
		return v;
	}


	
	
	public void setSponDesc(NString value){
		this.setValue("SPON_DESC", value.getValue());
	}


	public NString getSponDesc(){
		NString v = new NString((String)this.getValue("SPON_DESC"));
		return v;
	}


	
	
	public void setGobintlEmptCode(NString value){
		this.setValue("GOBINTL_EMPT_CODE", value.getValue());
	}


	public NString getGobintlEmptCode(){
		NString v = new NString((String)this.getValue("GOBINTL_EMPT_CODE"));
		return v;
	}


	
	
	public void setEmptDesc(NString value){
		this.setValue("EMPT_DESC", value.getValue());
	}


	public NString getEmptDesc(){
		NString v = new NString((String)this.getValue("EMPT_DESC"));
		return v;
	}


	
	
	public void setGobintlForeignSsn(NString value){
		this.setValue("GOBINTL_FOREIGN_SSN", value.getValue());
	}


	public NString getGobintlForeignSsn(){
		NString v = new NString((String)this.getValue("GOBINTL_FOREIGN_SSN"));
		return v;
	}


	
	
	public void setGobintlSpouseInd(NString value){
		this.setValue("GOBINTL_SPOUSE_IND", value.getValue());
	}


	public NString getGobintlSpouseInd(){
		NString v = new NString((String)this.getValue("GOBINTL_SPOUSE_IND"));
		return v;
	}


	
	
	public void setGobintlChildNumber(NNumber value){
		this.setValue("GOBINTL_CHILD_NUMBER", value.getValue());
	}


	public NNumber getGobintlChildNumber(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GOBINTL_CHILD_NUMBER"));
		return v;
	}


	
	
	public void setGobintlSignatureInd(NString value){
		this.setValue("GOBINTL_SIGNATURE_IND", value.getValue());
	}


	public NString getGobintlSignatureInd(){
		NString v = new NString((String)this.getValue("GOBINTL_SIGNATURE_IND"));
		return v;
	}


	
	
	public void setGobintlUserId(NString value){
		this.setValue("GOBINTL_USER_ID", value.getValue());
	}


	public NString getGobintlUserId(){
		NString v = new NString((String)this.getValue("GOBINTL_USER_ID"));
		return v;
	}


	
	
	public void setGobintlActivityDate(NDate value){
		this.setValue("GOBINTL_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGobintlActivityDate(){
		NDate v = new NDate((Date)this.getValue("GOBINTL_ACTIVITY_DATE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
	public java.sql.RowId getROWID(){ 
		return (java.sql.RowId) this.getValue(DAOConfiguration.MODEL_ROWID); 
		}
	
}
