package  net.hedtech.banner.general.common.Soaidns.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class SgbstdnAdapter extends BaseRowAdapter{
	

	public SgbstdnAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setStvclasDesc(NString value){
		this.setValue("STVCLAS_DESC", value.getValue());
	}


	public NString getStvclasDesc(){
		NString v = new NString((String)this.getValue("STVCLAS_DESC"));
		return v;
	}


	
	
	public void setTermEffEnd(NString value){
		this.setValue("TERM_EFF_END", value.getValue());
	}


	public NString getTermEffEnd(){
		NString v = new NString((String)this.getValue("TERM_EFF_END"));
		return v;
	}


	
	
	public void setReqTerm(NString value){
		this.setValue("REQ_TERM", value.getValue());
	}


	public NString getReqTerm(){
		NString v = new NString((String)this.getValue("REQ_TERM"));
		return v;
	}


	
	
	public void setShrttrmClasCode(NString value){
		this.setValue("SHRTTRM_CLAS_CODE", value.getValue());
	}


	public NString getShrttrmClasCode(){
		NString v = new NString((String)this.getValue("SHRTTRM_CLAS_CODE"));
		return v;
	}


	
	
	public void setStvststDesc(NString value){
		this.setValue("STVSTST_DESC", value.getValue());
	}


	public NString getStvststDesc(){
		NString v = new NString((String)this.getValue("STVSTST_DESC"));
		return v;
	}


	
	
	public void setSgbstdnResdCode(NString value){
		this.setValue("SGBSTDN_RESD_CODE", value.getValue());
	}


	public NString getSgbstdnResdCode(){
		NString v = new NString((String)this.getValue("SGBSTDN_RESD_CODE"));
		return v;
	}


	
	
	public void setSgbstdnTermCodeEff(NString value){
		this.setValue("SGBSTDN_TERM_CODE_EFF", value.getValue());
	}


	public NString getSgbstdnTermCodeEff(){
		NString v = new NString((String)this.getValue("SGBSTDN_TERM_CODE_EFF"));
		return v;
	}


	
	
	public void setSgbstdnStstCode(NString value){
		this.setValue("SGBSTDN_STST_CODE", value.getValue());
	}


	public NString getSgbstdnStstCode(){
		NString v = new NString((String)this.getValue("SGBSTDN_STST_CODE"));
		return v;
	}


	
	
	public void setSgbstdnLevlCode(NString value){
		this.setValue("SGBSTDN_LEVL_CODE", value.getValue());
	}


	public NString getSgbstdnLevlCode(){
		NString v = new NString((String)this.getValue("SGBSTDN_LEVL_CODE"));
		return v;
	}


	
	
	public void setSgbstdnStypCode(NString value){
		this.setValue("SGBSTDN_STYP_CODE", value.getValue());
	}


	public NString getSgbstdnStypCode(){
		NString v = new NString((String)this.getValue("SGBSTDN_STYP_CODE"));
		return v;
	}


	
	
	public void setSgbstdnDegcCode1(NString value){
		this.setValue("SGBSTDN_DEGC_CODE_1", value.getValue());
	}


	public NString getSgbstdnDegcCode1(){
		NString v = new NString((String)this.getValue("SGBSTDN_DEGC_CODE_1"));
		return v;
	}


	
	
	public void setSgbstdnCollCode1(NString value){
		this.setValue("SGBSTDN_COLL_CODE_1", value.getValue());
	}


	public NString getSgbstdnCollCode1(){
		NString v = new NString((String)this.getValue("SGBSTDN_COLL_CODE_1"));
		return v;
	}


	
	
	public void setSgbstdnMajrCode1(NString value){
		this.setValue("SGBSTDN_MAJR_CODE_1", value.getValue());
	}


	public NString getSgbstdnMajrCode1(){
		NString v = new NString((String)this.getValue("SGBSTDN_MAJR_CODE_1"));
		return v;
	}


	
	
	public void setSgbstdnAdmtCode(NString value){
		this.setValue("SGBSTDN_ADMT_CODE", value.getValue());
	}


	public NString getSgbstdnAdmtCode(){
		NString v = new NString((String)this.getValue("SGBSTDN_ADMT_CODE"));
		return v;
	}


	
	
	public void setSgbstdnActivityDate(NDate value){
		this.setValue("SGBSTDN_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSgbstdnActivityDate(){
		NDate v = new NDate((Date)this.getValue("SGBSTDN_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setSgbstdnTermCodeAdmit(NString value){
		this.setValue("SGBSTDN_TERM_CODE_ADMIT", value.getValue());
	}


	public NString getSgbstdnTermCodeAdmit(){
		NString v = new NString((String)this.getValue("SGBSTDN_TERM_CODE_ADMIT"));
		return v;
	}


	
	
	public void setSgbstdnFullPartInd(NString value){
		this.setValue("SGBSTDN_FULL_PART_IND", value.getValue());
	}


	public NString getSgbstdnFullPartInd(){
		NString v = new NString((String)this.getValue("SGBSTDN_FULL_PART_IND"));
		return v;
	}


	
	
	public void setStatusDesc(NString value){
		this.setValue("STATUS_DESC", value.getValue());
	}


	public NString getStatusDesc(){
		NString v = new NString((String)this.getValue("STATUS_DESC"));
		return v;
	}


	
	
	public void setResidenceDesc(NString value){
		this.setValue("RESIDENCE_DESC", value.getValue());
	}


	public NString getResidenceDesc(){
		NString v = new NString((String)this.getValue("RESIDENCE_DESC"));
		return v;
	}


	
	
	public void setFullPartDesc(NString value){
		this.setValue("FULL_PART_DESC", value.getValue());
	}


	public NString getFullPartDesc(){
		NString v = new NString((String)this.getValue("FULL_PART_DESC"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
