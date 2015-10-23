package  net.hedtech.banner.finance.common.Fragrnt.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class FrbgrntAdapter extends BaseRowAdapter{
	

	public FrbgrntAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFrbgrntAgencyCode2(NString value){
		this.setValue("FRBGRNT_AGENCY_CODE_2", value.getValue());
	}


	public NString getFrbgrntAgencyCode2(){
		NString v = new NString((String)this.getValue("FRBGRNT_AGENCY_CODE_2"));
		return v;
	}


	
	
	public void setFrbgrntAgencyName2(NString value){
		this.setValue("FRBGRNT_AGENCY_NAME_2", value.getValue());
	}


	public NString getFrbgrntAgencyName2(){
		NString v = new NString((String)this.getValue("FRBGRNT_AGENCY_NAME_2"));
		return v;
	}


	
	
	public void setFrbgrntCoasCode(NString value){
		this.setValue("FRBGRNT_COAS_CODE", value.getValue());
	}


	public NString getFrbgrntCoasCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_COAS_CODE"));
		return v;
	}


	
	
	public void setFrbgrntOrgnCodeRespOffice(NString value){
		this.setValue("FRBGRNT_ORGN_CODE_RESP_OFFICE", value.getValue());
	}


	public NString getFrbgrntOrgnCodeRespOffice(){
		NString v = new NString((String)this.getValue("FRBGRNT_ORGN_CODE_RESP_OFFICE"));
		return v;
	}


	
	
	public void setOrgnCodeDescr(NString value){
		this.setValue("ORGN_CODE_DESCR", value.getValue());
	}


	public NString getOrgnCodeDescr(){
		NString v = new NString((String)this.getValue("ORGN_CODE_DESCR"));
		return v;
	}


	
	
	public void setFrbgrntLongTitle(NString value){
		this.setValue("FRBGRNT_LONG_TITLE", value.getValue());
	}


	public NString getFrbgrntLongTitle(){
		NString v = new NString((String)this.getValue("FRBGRNT_LONG_TITLE"));
		return v;
	}


	
	
	public void setFrbgrntTitle(NString value){
		this.setValue("FRBGRNT_TITLE", value.getValue());
	}


	public NString getFrbgrntTitle(){
		NString v = new NString((String)this.getValue("FRBGRNT_TITLE"));
		return v;
	}


	
	
	public void setFrbgrntEffCertRequiredInd(NString value){
		this.setValue("FRBGRNT_EFF_CERT_REQUIRED_IND", value.getValue());
	}


	public NString getFrbgrntEffCertRequiredInd(){
		NString v = new NString((String)this.getValue("FRBGRNT_EFF_CERT_REQUIRED_IND"));
		return v;
	}


	
	
	public void setFrbgrntAgencyCode(NString value){
		this.setValue("FRBGRNT_AGENCY_CODE", value.getValue());
	}


	public NString getFrbgrntAgencyCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_AGENCY_CODE"));
		return v;
	}


	
	
	public void setFrbgrntAgencyName(NString value){
		this.setValue("FRBGRNT_AGENCY_NAME", value.getValue());
	}


	public NString getFrbgrntAgencyName(){
		NString v = new NString((String)this.getValue("FRBGRNT_AGENCY_NAME"));
		return v;
	}


	
	
	public void setFrbgrntPiIdCode(NString value){
		this.setValue("FRBGRNT_PI_ID_CODE", value.getValue());
	}


	public NString getFrbgrntPiIdCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_PI_ID_CODE"));
		return v;
	}


	
	
	public void setFrbgrntPiIdName(NString value){
		this.setValue("FRBGRNT_PI_ID_NAME", value.getValue());
	}


	public NString getFrbgrntPiIdName(){
		NString v = new NString((String)this.getValue("FRBGRNT_PI_ID_NAME"));
		return v;
	}


	
	
	public void setFrbgrntProjectStartDate(NDate value){
		this.setValue("FRBGRNT_PROJECT_START_DATE", value.getValue());
	}


	public NDate getFrbgrntProjectStartDate(){
		NDate v = new NDate((Date)this.getValue("FRBGRNT_PROJECT_START_DATE"));
		return v;
	}


	
	
	public void setFrbgrntProjectEndDate(NDate value){
		this.setValue("FRBGRNT_PROJECT_END_DATE", value.getValue());
	}


	public NDate getFrbgrntProjectEndDate(){
		NDate v = new NDate((Date)this.getValue("FRBGRNT_PROJECT_END_DATE"));
		return v;
	}


	
	
	public void setFrbgrntPropCode(NString value){
		this.setValue("FRBGRNT_PROP_CODE", value.getValue());
	}


	public NString getFrbgrntPropCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_PROP_CODE"));
		return v;
	}


	
	
	public void setFrbgrntTermDate(NDate value){
		this.setValue("FRBGRNT_TERM_DATE", value.getValue());
	}


	public NDate getFrbgrntTermDate(){
		NDate v = new NDate((Date)this.getValue("FRBGRNT_TERM_DATE"));
		return v;
	}


	
	
	public void setHoldEndDate(NDate value){
		this.setValue("HOLD_END_DATE", value.getValue());
	}


	public NDate getHoldEndDate(){
		NDate v = new NDate((Date)this.getValue("HOLD_END_DATE"));
		return v;
	}


	
	
	public void setHoldStartDate(NDate value){
		this.setValue("HOLD_START_DATE", value.getValue());
	}


	public NDate getHoldStartDate(){
		NDate v = new NDate((Date)this.getValue("HOLD_START_DATE"));
		return v;
	}


	
	
	public void setFrbgrntExpendEndDate(NDate value){
		this.setValue("FRBGRNT_EXPEND_END_DATE", value.getValue());
	}


	public NDate getFrbgrntExpendEndDate(){
		NDate v = new NDate((Date)this.getValue("FRBGRNT_EXPEND_END_DATE"));
		return v;
	}


	
	
	public void setFrbgrntStatusCode(NString value){
		this.setValue("FRBGRNT_STATUS_CODE", value.getValue());
	}


	public NString getFrbgrntStatusCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_STATUS_CODE"));
		return v;
	}


	
	
	public void setStatusDescr(NString value){
		this.setValue("STATUS_DESCR", value.getValue());
	}


	public NString getStatusDescr(){
		NString v = new NString((String)this.getValue("STATUS_DESCR"));
		return v;
	}


	
	
	public void setDisplayPassThruInd(NString value){
		this.setValue("DISPLAY_PASS_THRU_IND", value.getValue());
	}


	public NString getDisplayPassThruInd(){
		NString v = new NString((String)this.getValue("DISPLAY_PASS_THRU_IND"));
		return v;
	}


	
	
	public void setFrbgrntAlternateStatusDesc(NString value){
		this.setValue("FRBGRNT_ALTERNATE_STATUS_DESC", value.getValue());
	}


	public NString getFrbgrntAlternateStatusDesc(){
		NString v = new NString((String)this.getValue("FRBGRNT_ALTERNATE_STATUS_DESC"));
		return v;
	}


	
	
	public void setFrbgrntStatusDate(NDate value){
		this.setValue("FRBGRNT_STATUS_DATE", value.getValue());
	}


	public NDate getFrbgrntStatusDate(){
		NDate v = new NDate((Date)this.getValue("FRBGRNT_STATUS_DATE"));
		return v;
	}


	
	
	public void setFrbgrntCode(NString value){
		this.setValue("FRBGRNT_CODE", value.getValue());
	}


	public NString getFrbgrntCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_CODE"));
		return v;
	}


	
	
	public void setFrbgrntGrntCodeRelated(NString value){
		this.setValue("FRBGRNT_GRNT_CODE_RELATED", value.getValue());
	}


	public NString getFrbgrntGrntCodeRelated(){
		NString v = new NString((String)this.getValue("FRBGRNT_GRNT_CODE_RELATED"));
		return v;
	}


	
	
	public void setRelatedGrntDescr(NString value){
		this.setValue("RELATED_GRNT_DESCR", value.getValue());
	}


	public NString getRelatedGrntDescr(){
		NString v = new NString((String)this.getValue("RELATED_GRNT_DESCR"));
		return v;
	}


	
	
	public void setFrbgrntCurrentFundingAmt(NNumber value){
		this.setValue("FRBGRNT_CURRENT_FUNDING_AMT", value.getValue());
	}


	public NNumber getFrbgrntCurrentFundingAmt(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_CURRENT_FUNDING_AMT"));
		return v;
	}


	
	
	public void setFrbgrntCumFundingAmt(NNumber value){
		this.setValue("FRBGRNT_CUM_FUNDING_AMT", value.getValue());
	}


	public NNumber getFrbgrntCumFundingAmt(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_CUM_FUNDING_AMT"));
		return v;
	}


	
	
	public void setFrbgrntMaxFundingAmt(NNumber value){
		this.setValue("FRBGRNT_MAX_FUNDING_AMT", value.getValue());
	}


	public NNumber getFrbgrntMaxFundingAmt(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_MAX_FUNDING_AMT"));
		return v;
	}


	
	
	public void setFrbgrntRcptShareTotal(NNumber value){
		this.setValue("FRBGRNT_RCPT_SHARE_TOTAL", value.getValue());
	}


	public NNumber getFrbgrntRcptShareTotal(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_RCPT_SHARE_TOTAL"));
		return v;
	}


	
	
	public void setFrbgrntGrantType(NString value){
		this.setValue("FRBGRNT_GRANT_TYPE", value.getValue());
	}


	public NString getFrbgrntGrantType(){
		NString v = new NString((String)this.getValue("FRBGRNT_GRANT_TYPE"));
		return v;
	}


	
	
	public void setFrbgrntGrantDesc(NString value){
		this.setValue("FRBGRNT_GRANT_DESC", value.getValue());
	}


	public NString getFrbgrntGrantDesc(){
		NString v = new NString((String)this.getValue("FRBGRNT_GRANT_DESC"));
		return v;
	}


	
	
	public void setFrbgrntCategory(NString value){
		this.setValue("FRBGRNT_CATEGORY", value.getValue());
	}


	public NString getFrbgrntCategory(){
		NString v = new NString((String)this.getValue("FRBGRNT_CATEGORY"));
		return v;
	}


	
	
	public void setFrbgrntCategoryDesc(NString value){
		this.setValue("FRBGRNT_CATEGORY_DESC", value.getValue());
	}


	public NString getFrbgrntCategoryDesc(){
		NString v = new NString((String)this.getValue("FRBGRNT_CATEGORY_DESC"));
		return v;
	}


	
	
	public void setFrbgrntSubCategory(NString value){
		this.setValue("FRBGRNT_SUB_CATEGORY", value.getValue());
	}


	public NString getFrbgrntSubCategory(){
		NString v = new NString((String)this.getValue("FRBGRNT_SUB_CATEGORY"));
		return v;
	}


	
	
	public void setFrbgrntSubCatDesc(NString value){
		this.setValue("FRBGRNT_SUB_CAT_DESC", value.getValue());
	}


	public NString getFrbgrntSubCatDesc(){
		NString v = new NString((String)this.getValue("FRBGRNT_SUB_CAT_DESC"));
		return v;
	}


	
	
	public void setFrbgrntCfdaCode(NString value){
		this.setValue("FRBGRNT_CFDA_CODE", value.getValue());
	}


	public NString getFrbgrntCfdaCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_CFDA_CODE"));
		return v;
	}


	
	
	public void setFrbgrntSponsorId(NString value){
		this.setValue("FRBGRNT_SPONSOR_ID", value.getValue());
	}


	public NString getFrbgrntSponsorId(){
		NString v = new NString((String)this.getValue("FRBGRNT_SPONSOR_ID"));
		return v;
	}


	
	
	public void setFrbgrntAgencyContact(NString value){
		this.setValue("FRBGRNT_AGENCY_CONTACT", value.getValue());
	}


	public NString getFrbgrntAgencyContact(){
		NString v = new NString((String)this.getValue("FRBGRNT_AGENCY_CONTACT"));
		return v;
	}


	
	
	public void setFrbgrntAgencyAddrCode(NString value){
		this.setValue("FRBGRNT_AGENCY_ADDR_CODE", value.getValue());
	}


	public NString getFrbgrntAgencyAddrCode(){
		NString v = new NString((String)this.getValue("FRBGRNT_AGENCY_ADDR_CODE"));
		return v;
	}


	
	
	public void setFrbgrntAgencyAddrSeqNum(NNumber value){
		this.setValue("FRBGRNT_AGENCY_ADDR_SEQ_NUM", value.getValue());
	}


	public NNumber getFrbgrntAgencyAddrSeqNum(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_AGENCY_ADDR_SEQ_NUM"));
		return v;
	}


	
	
	public void setHouseNumber(NString value){
		this.setValue("HOUSE_NUMBER", value.getValue());
	}


	public NString getHouseNumber(){
		NString v = new NString((String)this.getValue("HOUSE_NUMBER"));
		return v;
	}


	
	
	public void setAddressLine1(NString value){
		this.setValue("ADDRESS_LINE_1", value.getValue());
	}


	public NString getAddressLine1(){
		NString v = new NString((String)this.getValue("ADDRESS_LINE_1"));
		return v;
	}


	
	
	public void setAddressLine2(NString value){
		this.setValue("ADDRESS_LINE_2", value.getValue());
	}


	public NString getAddressLine2(){
		NString v = new NString((String)this.getValue("ADDRESS_LINE_2"));
		return v;
	}


	
	
	public void setAddressLine3(NString value){
		this.setValue("ADDRESS_LINE_3", value.getValue());
	}


	public NString getAddressLine3(){
		NString v = new NString((String)this.getValue("ADDRESS_LINE_3"));
		return v;
	}


	
	
	public void setAddressLine4(NString value){
		this.setValue("ADDRESS_LINE_4", value.getValue());
	}


	public NString getAddressLine4(){
		NString v = new NString((String)this.getValue("ADDRESS_LINE_4"));
		return v;
	}


	
	
	public void setCity(NString value){
		this.setValue("CITY", value.getValue());
	}


	public NString getCity(){
		NString v = new NString((String)this.getValue("CITY"));
		return v;
	}


	
	
	public void setState(NString value){
		this.setValue("STATE", value.getValue());
	}


	public NString getState(){
		NString v = new NString((String)this.getValue("STATE"));
		return v;
	}


	
	
	public void setZipCode(NString value){
		this.setValue("ZIP_CODE", value.getValue());
	}


	public NString getZipCode(){
		NString v = new NString((String)this.getValue("ZIP_CODE"));
		return v;
	}


	
	
	public void setFrbgrntAgencyEmail(NString value){
		this.setValue("FRBGRNT_AGENCY_EMAIL", value.getValue());
	}


	public NString getFrbgrntAgencyEmail(){
		NString v = new NString((String)this.getValue("FRBGRNT_AGENCY_EMAIL"));
		return v;
	}


	
	
	public void setPhoneExists(NString value){
		this.setValue("PHONE_EXISTS", value.getValue());
	}


	public NString getPhoneExists(){
		NString v = new NString((String)this.getValue("PHONE_EXISTS"));
		return v;
	}


	
	
	public void setFrbgrntAgencyPhoneType(NString value){
		this.setValue("FRBGRNT_AGENCY_PHONE_TYPE", value.getValue());
	}


	public NString getFrbgrntAgencyPhoneType(){
		NString v = new NString((String)this.getValue("FRBGRNT_AGENCY_PHONE_TYPE"));
		return v;
	}


	
	
	public void setCtryCodePhone(NString value){
		this.setValue("CTRY_CODE_PHONE", value.getValue());
	}


	public NString getCtryCodePhone(){
		NString v = new NString((String)this.getValue("CTRY_CODE_PHONE"));
		return v;
	}


	
	
	public void setAreaCode(NString value){
		this.setValue("AREA_CODE", value.getValue());
	}


	public NString getAreaCode(){
		NString v = new NString((String)this.getValue("AREA_CODE"));
		return v;
	}


	
	
	public void setPhoneNumber(NString value){
		this.setValue("PHONE_NUMBER", value.getValue());
	}


	public NString getPhoneNumber(){
		NString v = new NString((String)this.getValue("PHONE_NUMBER"));
		return v;
	}


	
	
	public void setExtension(NString value){
		this.setValue("EXTENSION", value.getValue());
	}


	public NString getExtension(){
		NString v = new NString((String)this.getValue("EXTENSION"));
		return v;
	}


	
	
	public void setFrbgrntAgencyTeleSeqno(NNumber value){
		this.setValue("FRBGRNT_AGENCY_TELE_SEQNO", value.getValue());
	}


	public NNumber getFrbgrntAgencyTeleSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_AGENCY_TELE_SEQNO"));
		return v;
	}


	
	
	public void setFrbgrntIdcEncInd(NString value){
		this.setValue("FRBGRNT_IDC_ENC_IND", value.getValue());
	}


	public NString getFrbgrntIdcEncInd(){
		NString v = new NString((String)this.getValue("FRBGRNT_IDC_ENC_IND"));
		return v;
	}


	
	
	public void setFrbgrntCoasCodeIcCs(NString value){
		this.setValue("FRBGRNT_COAS_CODE_IC_CS", value.getValue());
	}


	public NString getFrbgrntCoasCodeIcCs(){
		NString v = new NString((String)this.getValue("FRBGRNT_COAS_CODE_IC_CS"));
		return v;
	}


	
	
	public void setFrbgrntBasiCodeIc(NString value){
		this.setValue("FRBGRNT_BASI_CODE_IC", value.getValue());
	}


	public NString getFrbgrntBasiCodeIc(){
		NString v = new NString((String)this.getValue("FRBGRNT_BASI_CODE_IC"));
		return v;
	}


	
	
	public void setFrbgrntBasiCodeIcName(NString value){
		this.setValue("FRBGRNT_BASI_CODE_IC_NAME", value.getValue());
	}


	public NString getFrbgrntBasiCodeIcName(){
		NString v = new NString((String)this.getValue("FRBGRNT_BASI_CODE_IC_NAME"));
		return v;
	}


	
	
	public void setFrbgrntIndrCodeRate(NString value){
		this.setValue("FRBGRNT_INDR_CODE_RATE", value.getValue());
	}


	public NString getFrbgrntIndrCodeRate(){
		NString v = new NString((String)this.getValue("FRBGRNT_INDR_CODE_RATE"));
		return v;
	}


	
	
	public void setFrbgrntIndrCodeRateName(NString value){
		this.setValue("FRBGRNT_INDR_CODE_RATE_NAME", value.getValue());
	}


	public NString getFrbgrntIndrCodeRateName(){
		NString v = new NString((String)this.getValue("FRBGRNT_INDR_CODE_RATE_NAME"));
		return v;
	}


	
	
	public void setFrbgrntIndaCodeCharge(NString value){
		this.setValue("FRBGRNT_INDA_CODE_CHARGE", value.getValue());
	}


	public NString getFrbgrntIndaCodeCharge(){
		NString v = new NString((String)this.getValue("FRBGRNT_INDA_CODE_CHARGE"));
		return v;
	}


	
	
	public void setFrbgrntIndaCodeChargeName(NString value){
		this.setValue("FRBGRNT_INDA_CODE_CHARGE_NAME", value.getValue());
	}


	public NString getFrbgrntIndaCodeChargeName(){
		NString v = new NString((String)this.getValue("FRBGRNT_INDA_CODE_CHARGE_NAME"));
		return v;
	}


	
	
	public void setFrbgrntInddCodeDistr(NString value){
		this.setValue("FRBGRNT_INDD_CODE_DISTR", value.getValue());
	}


	public NString getFrbgrntInddCodeDistr(){
		NString v = new NString((String)this.getValue("FRBGRNT_INDD_CODE_DISTR"));
		return v;
	}


	
	
	public void setFrbgrntInddCodeDistrName(NString value){
		this.setValue("FRBGRNT_INDD_CODE_DISTR_NAME", value.getValue());
	}


	public NString getFrbgrntInddCodeDistrName(){
		NString v = new NString((String)this.getValue("FRBGRNT_INDD_CODE_DISTR_NAME"));
		return v;
	}


	
	
	public void setFrbgrntBasiCodeCs(NString value){
		this.setValue("FRBGRNT_BASI_CODE_CS", value.getValue());
	}


	public NString getFrbgrntBasiCodeCs(){
		NString v = new NString((String)this.getValue("FRBGRNT_BASI_CODE_CS"));
		return v;
	}


	
	
	public void setFrbgrntBasiCodeCsName(NString value){
		this.setValue("FRBGRNT_BASI_CODE_CS_NAME", value.getValue());
	}


	public NString getFrbgrntBasiCodeCsName(){
		NString v = new NString((String)this.getValue("FRBGRNT_BASI_CODE_CS_NAME"));
		return v;
	}


	
	
	public void setFrbgrntCstrCodeRate(NString value){
		this.setValue("FRBGRNT_CSTR_CODE_RATE", value.getValue());
	}


	public NString getFrbgrntCstrCodeRate(){
		NString v = new NString((String)this.getValue("FRBGRNT_CSTR_CODE_RATE"));
		return v;
	}


	
	
	public void setFrbgrntCstrCodeRateName(NString value){
		this.setValue("FRBGRNT_CSTR_CODE_RATE_NAME", value.getValue());
	}


	public NString getFrbgrntCstrCodeRateName(){
		NString v = new NString((String)this.getValue("FRBGRNT_CSTR_CODE_RATE_NAME"));
		return v;
	}


	
	
	public void setFrbgrntCstaCodeCharge(NString value){
		this.setValue("FRBGRNT_CSTA_CODE_CHARGE", value.getValue());
	}


	public NString getFrbgrntCstaCodeCharge(){
		NString v = new NString((String)this.getValue("FRBGRNT_CSTA_CODE_CHARGE"));
		return v;
	}


	
	
	public void setFrbgrntCstaCodeChargeName(NString value){
		this.setValue("FRBGRNT_CSTA_CODE_CHARGE_NAME", value.getValue());
	}


	public NString getFrbgrntCstaCodeChargeName(){
		NString v = new NString((String)this.getValue("FRBGRNT_CSTA_CODE_CHARGE_NAME"));
		return v;
	}


	
	
	public void setFrbgrntCstdCodeDistr(NString value){
		this.setValue("FRBGRNT_CSTD_CODE_DISTR", value.getValue());
	}


	public NString getFrbgrntCstdCodeDistr(){
		NString v = new NString((String)this.getValue("FRBGRNT_CSTD_CODE_DISTR"));
		return v;
	}


	
	
	public void setFrbgrntCstdCodeDistrName(NString value){
		this.setValue("FRBGRNT_CSTD_CODE_DISTR_NAME", value.getValue());
	}


	public NString getFrbgrntCstdCodeDistrName(){
		NString v = new NString((String)this.getValue("FRBGRNT_CSTD_CODE_DISTR_NAME"));
		return v;
	}


	
	
	public void setFrbgrntAgencyPidm(NNumber value){
		this.setValue("FRBGRNT_AGENCY_PIDM", value.getValue());
	}


	public NNumber getFrbgrntAgencyPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_AGENCY_PIDM"));
		return v;
	}


	
	
	public void setFrbgrntAgencyPredPidm(NNumber value){
		this.setValue("FRBGRNT_AGENCY_PRED_PIDM", value.getValue());
	}


	public NNumber getFrbgrntAgencyPredPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_AGENCY_PRED_PIDM"));
		return v;
	}


	
	
	public void setFrbgrntCfdaInternalIdNo(NNumber value){
		this.setValue("FRBGRNT_CFDA_INTERNAL_ID_NO", value.getValue());
	}


	public NNumber getFrbgrntCfdaInternalIdNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_CFDA_INTERNAL_ID_NO"));
		return v;
	}


	
	
	public void setFrbgrntActivityDate(NDate value){
		this.setValue("FRBGRNT_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFrbgrntActivityDate(){
		NDate v = new NDate((Date)this.getValue("FRBGRNT_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFrbgrntPiPidm(NNumber value){
		this.setValue("FRBGRNT_PI_PIDM", value.getValue());
	}


	public NNumber getFrbgrntPiPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBGRNT_PI_PIDM"));
		return v;
	}


	
	
	public void setFrbgrntUserId(NString value){
		this.setValue("FRBGRNT_USER_ID", value.getValue());
	}


	public NString getFrbgrntUserId(){
		NString v = new NString((String)this.getValue("FRBGRNT_USER_ID"));
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
