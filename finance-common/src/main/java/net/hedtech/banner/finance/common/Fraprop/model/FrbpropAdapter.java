package  net.hedtech.banner.finance.common.Fraprop.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;
import morphis.foundations.core.appdatalayer.data.DbManager;

public class FrbpropAdapter extends BaseRowAdapter{
	

	public FrbpropAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setFrbpropCoasCode(NString value){
		this.setValue("FRBPROP_COAS_CODE", value.getValue());
	}


	public NString getFrbpropCoasCode(){
		NString v = new NString((String)this.getValue("FRBPROP_COAS_CODE"));
		return v;
	}


	
	
	public void setFrbpropOrgnCodeRespOffice(NString value){
		this.setValue("FRBPROP_ORGN_CODE_RESP_OFFICE", value.getValue());
	}


	public NString getFrbpropOrgnCodeRespOffice(){
		NString v = new NString((String)this.getValue("FRBPROP_ORGN_CODE_RESP_OFFICE"));
		return v;
	}


	
	
	public void setOrgnCodeDescr(NString value){
		this.setValue("ORGN_CODE_DESCR", value.getValue());
	}


	public NString getOrgnCodeDescr(){
		NString v = new NString((String)this.getValue("ORGN_CODE_DESCR"));
		return v;
	}


	
	
	public void setFrbpropLongTitle(NString value){
		this.setValue("FRBPROP_LONG_TITLE", value.getValue());
	}


	public NString getFrbpropLongTitle(){
		NString v = new NString((String)this.getValue("FRBPROP_LONG_TITLE"));
		return v;
	}


	
	
	public void setFrbpropTitle(NString value){
		this.setValue("FRBPROP_TITLE", value.getValue());
	}


	public NString getFrbpropTitle(){
		NString v = new NString((String)this.getValue("FRBPROP_TITLE"));
		return v;
	}


	
	
	public void setFrbpropAgencyCode(NString value){
		this.setValue("FRBPROP_AGENCY_CODE", value.getValue());
	}


	public NString getFrbpropAgencyCode(){
		NString v = new NString((String)this.getValue("FRBPROP_AGENCY_CODE"));
		return v;
	}


	
	
	public void setFrbpropAgencyName(NString value){
		this.setValue("FRBPROP_AGENCY_NAME", value.getValue());
	}


	public NString getFrbpropAgencyName(){
		NString v = new NString((String)this.getValue("FRBPROP_AGENCY_NAME"));
		return v;
	}


	
	
	public void setFrbpropPiIdCode(NString value){
		this.setValue("FRBPROP_PI_ID_CODE", value.getValue());
	}


	public NString getFrbpropPiIdCode(){
		NString v = new NString((String)this.getValue("FRBPROP_PI_ID_CODE"));
		return v;
	}


	
	
	public void setFrbpropPiIdName(NString value){
		this.setValue("FRBPROP_PI_ID_NAME", value.getValue());
	}


	public NString getFrbpropPiIdName(){
		NString v = new NString((String)this.getValue("FRBPROP_PI_ID_NAME"));
		return v;
	}


	
	
	public void setFrbpropRequestedAmt(NNumber value){
		this.setValue("FRBPROP_REQUESTED_AMT", value.getValue());
	}


	public NNumber getFrbpropRequestedAmt(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBPROP_REQUESTED_AMT"));
		return v;
	}


	
	
	public void setDisplayPassThruInd(NString value){
		this.setValue("DISPLAY_PASS_THRU_IND", value.getValue());
	}


	public NString getDisplayPassThruInd(){
		NString v = new NString((String)this.getValue("DISPLAY_PASS_THRU_IND"));
		return v;
	}


	
	
	public void setFrbpropOrigPrepDate(NDate value){
		this.setValue("FRBPROP_ORIG_PREP_DATE", value.getValue());
	}


	public NDate getFrbpropOrigPrepDate(){
		NDate v = new NDate((Date)this.getValue("FRBPROP_ORIG_PREP_DATE"));
		return v;
	}


	
	
	public void setFrbpropDueDate(NDate value){
		this.setValue("FRBPROP_DUE_DATE", value.getValue());
	}


	public NDate getFrbpropDueDate(){
		NDate v = new NDate((Date)this.getValue("FRBPROP_DUE_DATE"));
		return v;
	}


	
	
	public void setFrbpropSubmittedDate(NDate value){
		this.setValue("FRBPROP_SUBMITTED_DATE", value.getValue());
	}


	public NDate getFrbpropSubmittedDate(){
		NDate v = new NDate((Date)this.getValue("FRBPROP_SUBMITTED_DATE"));
		return v;
	}


	
	
	public void setFrbpropStatusCode(NString value){
		this.setValue("FRBPROP_STATUS_CODE", value.getValue());
	}


	public NString getFrbpropStatusCode(){
		NString v = new NString((String)this.getValue("FRBPROP_STATUS_CODE"));
		return v;
	}


	
	
	public void setStatusDescr(NString value){
		this.setValue("STATUS_DESCR", value.getValue());
	}


	public NString getStatusDescr(){
		NString v = new NString((String)this.getValue("STATUS_DESCR"));
		return v;
	}


	
	
	public void setFrbpropAlternateStatusDesc(NString value){
		this.setValue("FRBPROP_ALTERNATE_STATUS_DESC", value.getValue());
	}


	public NString getFrbpropAlternateStatusDesc(){
		NString v = new NString((String)this.getValue("FRBPROP_ALTERNATE_STATUS_DESC"));
		return v;
	}


	
	
	public void setFrbpropStatusDate(NDate value){
		this.setValue("FRBPROP_STATUS_DATE", value.getValue());
	}


	public NDate getFrbpropStatusDate(){
		NDate v = new NDate((Date)this.getValue("FRBPROP_STATUS_DATE"));
		return v;
	}


	
	
	public void setFrbpropAgencyPredPidm(NNumber value){
		this.setValue("FRBPROP_AGENCY_PRED_PIDM", value.getValue());
	}


	public NNumber getFrbpropAgencyPredPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBPROP_AGENCY_PRED_PIDM"));
		return v;
	}


	
	
	public void setFrbpropProjectStartDate(NDate value){
		this.setValue("FRBPROP_PROJECT_START_DATE", value.getValue());
	}


	public NDate getFrbpropProjectStartDate(){
		NDate v = new NDate((Date)this.getValue("FRBPROP_PROJECT_START_DATE"));
		return v;
	}


	
	
	public void setFrbpropProjectEndDate(NDate value){
		this.setValue("FRBPROP_PROJECT_END_DATE", value.getValue());
	}


	public NDate getFrbpropProjectEndDate(){
		NDate v = new NDate((Date)this.getValue("FRBPROP_PROJECT_END_DATE"));
		return v;
	}


	
	
	public void setFrbpropGrntCode(NString value){
		this.setValue("FRBPROP_GRNT_CODE", value.getValue());
	}


	public NString getFrbpropGrntCode(){
		NString v = new NString((String)this.getValue("FRBPROP_GRNT_CODE"));
		return v;
	}


	
	
	public void setFrbpropBudgPrdStartDat(NDate value){
		this.setValue("FRBPROP_BUDG_PRD_START_DATE", value.getValue());
	}


	public NDate getFrbpropBudgPrdStartDat(){
		NDate v = new NDate((Date)this.getValue("FRBPROP_BUDG_PRD_START_DATE"));
		return v;
	}


	
	
	public void setFrbpropBudgPrdEndDate(NDate value){
		this.setValue("FRBPROP_BUDG_PRD_END_DATE", value.getValue());
	}


	public NDate getFrbpropBudgPrdEndDate(){
		NDate v = new NDate((Date)this.getValue("FRBPROP_BUDG_PRD_END_DATE"));
		return v;
	}


	
	
	public void setFrbpropExpectedGrantDat(NDate value){
		this.setValue("FRBPROP_EXPECTED_GRANT_DATE", value.getValue());
	}


	public NDate getFrbpropExpectedGrantDat(){
		NDate v = new NDate((Date)this.getValue("FRBPROP_EXPECTED_GRANT_DATE"));
		return v;
	}


	
	
	public void setFrbpropPropCodeRelated(NString value){
		this.setValue("FRBPROP_PROP_CODE_RELATED", value.getValue());
	}


	public NString getFrbpropPropCodeRelated(){
		NString v = new NString((String)this.getValue("FRBPROP_PROP_CODE_RELATED"));
		return v;
	}


	
	
	public void setRelatedPropDescr(NString value){
		this.setValue("RELATED_PROP_DESCR", value.getValue());
	}


	public NString getRelatedPropDescr(){
		NString v = new NString((String)this.getValue("RELATED_PROP_DESCR"));
		return v;
	}


	
	
	public void setFrbpropProbabilityRate(NNumber value){
		this.setValue("FRBPROP_PROBABILITY_RATE", value.getValue());
	}


	public NNumber getFrbpropProbabilityRate(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBPROP_PROBABILITY_RATE"));
		return v;
	}


	
	
	public void setFrbpropProposalType(NString value){
		this.setValue("FRBPROP_PROPOSAL_TYPE", value.getValue());
	}


	public NString getFrbpropProposalType(){
		NString v = new NString((String)this.getValue("FRBPROP_PROPOSAL_TYPE"));
		return v;
	}


	
	
	public void setFrbpropProposalDesc(NString value){
		this.setValue("FRBPROP_PROPOSAL_DESC", value.getValue());
	}


	public NString getFrbpropProposalDesc(){
		NString v = new NString((String)this.getValue("FRBPROP_PROPOSAL_DESC"));
		return v;
	}


	
	
	public void setFrbpropCategory(NString value){
		this.setValue("FRBPROP_CATEGORY", value.getValue());
	}


	public NString getFrbpropCategory(){
		NString v = new NString((String)this.getValue("FRBPROP_CATEGORY"));
		return v;
	}


	
	
	public void setFrbpropCategoryDesc(NString value){
		this.setValue("FRBPROP_CATEGORY_DESC", value.getValue());
	}


	public NString getFrbpropCategoryDesc(){
		NString v = new NString((String)this.getValue("FRBPROP_CATEGORY_DESC"));
		return v;
	}


	
	
	public void setFrbpropSubCategory(NString value){
		this.setValue("FRBPROP_SUB_CATEGORY", value.getValue());
	}


	public NString getFrbpropSubCategory(){
		NString v = new NString((String)this.getValue("FRBPROP_SUB_CATEGORY"));
		return v;
	}


	
	
	public void setFrbpropSubCatDesc(NString value){
		this.setValue("FRBPROP_SUB_CAT_DESC", value.getValue());
	}


	public NString getFrbpropSubCatDesc(){
		NString v = new NString((String)this.getValue("FRBPROP_SUB_CAT_DESC"));
		return v;
	}


	
	
	public void setFrbpropCfdaCode(NString value){
		this.setValue("FRBPROP_CFDA_CODE", value.getValue());
	}


	public NString getFrbpropCfdaCode(){
		NString v = new NString((String)this.getValue("FRBPROP_CFDA_CODE"));
		return v;
	}


	
	
	public void setFrbpropSponsorId(NString value){
		this.setValue("FRBPROP_SPONSOR_ID", value.getValue());
	}


	public NString getFrbpropSponsorId(){
		NString v = new NString((String)this.getValue("FRBPROP_SPONSOR_ID"));
		return v;
	}


	
	
	public void setFrbpropAgencyContact(NString value){
		this.setValue("FRBPROP_AGENCY_CONTACT", value.getValue());
	}


	public NString getFrbpropAgencyContact(){
		NString v = new NString((String)this.getValue("FRBPROP_AGENCY_CONTACT"));
		return v;
	}


	
	
	public void setFrbpropAgencyPredCode(NString value){
		this.setValue("FRBPROP_AGENCY_PRED_CODE", value.getValue());
	}


	public NString getFrbpropAgencyPredCode(){
		NString v = new NString((String)this.getValue("FRBPROP_AGENCY_PRED_CODE"));
		return v;
	}


	
	
	public void setFrbpropAgencyPredName(NString value){
		this.setValue("FRBPROP_AGENCY_PRED_NAME", value.getValue());
	}


	public NString getFrbpropAgencyPredName(){
		NString v = new NString((String)this.getValue("FRBPROP_AGENCY_PRED_NAME"));
		return v;
	}


	
	
	public void setFrbpropAgencyAddrCode(NString value){
		this.setValue("FRBPROP_AGENCY_ADDR_CODE", value.getValue());
	}


	public NString getFrbpropAgencyAddrCode(){
		NString v = new NString((String)this.getValue("FRBPROP_AGENCY_ADDR_CODE"));
		return v;
	}


	
	
	public void setFrbpropAgencyAddrSeqNum(NNumber value){
		this.setValue("FRBPROP_AGENCY_ADDR_SEQ_NUM", value.getValue());
	}


	public NNumber getFrbpropAgencyAddrSeqNum(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBPROP_AGENCY_ADDR_SEQ_NUM"));
		return v;
	}


	
	
	public void setAddressHouseNumber(NString value){
		this.setValue("ADDRESS_HOUSE_NUMBER", value.getValue());
	}


	public NString getAddressHouseNumber(){
		NString v = new NString((String)this.getValue("ADDRESS_HOUSE_NUMBER"));
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


	
	
	public void setPhoneExists(NString value){
		this.setValue("PHONE_EXISTS", value.getValue());
	}


	public NString getPhoneExists(){
		NString v = new NString((String)this.getValue("PHONE_EXISTS"));
		return v;
	}


	
	
	public void setPhoneType(NString value){
		this.setValue("PHONE_TYPE", value.getValue());
	}


	public NString getPhoneType(){
		NString v = new NString((String)this.getValue("PHONE_TYPE"));
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


	
	
	public void setFrbpropCoasCodeIcCs(NString value){
		this.setValue("FRBPROP_COAS_CODE_IC_CS", value.getValue());
	}


	public NString getFrbpropCoasCodeIcCs(){
		NString v = new NString((String)this.getValue("FRBPROP_COAS_CODE_IC_CS"));
		return v;
	}


	
	
	public void setFrbpropBasiCodeIc(NString value){
		this.setValue("FRBPROP_BASI_CODE_IC", value.getValue());
	}


	public NString getFrbpropBasiCodeIc(){
		NString v = new NString((String)this.getValue("FRBPROP_BASI_CODE_IC"));
		return v;
	}


	
	
	public void setFrbpropBasiCodeIcName(NString value){
		this.setValue("FRBPROP_BASI_CODE_IC_NAME", value.getValue());
	}


	public NString getFrbpropBasiCodeIcName(){
		NString v = new NString((String)this.getValue("FRBPROP_BASI_CODE_IC_NAME"));
		return v;
	}


	
	
	public void setFrbpropIndrCodeRate(NString value){
		this.setValue("FRBPROP_INDR_CODE_RATE", value.getValue());
	}


	public NString getFrbpropIndrCodeRate(){
		NString v = new NString((String)this.getValue("FRBPROP_INDR_CODE_RATE"));
		return v;
	}


	
	
	public void setFrbpropIndrCodeRateName(NString value){
		this.setValue("FRBPROP_INDR_CODE_RATE_NAME", value.getValue());
	}


	public NString getFrbpropIndrCodeRateName(){
		NString v = new NString((String)this.getValue("FRBPROP_INDR_CODE_RATE_NAME"));
		return v;
	}


	
	
	public void setFrbpropIndaCodeCharge(NString value){
		this.setValue("FRBPROP_INDA_CODE_CHARGE", value.getValue());
	}


	public NString getFrbpropIndaCodeCharge(){
		NString v = new NString((String)this.getValue("FRBPROP_INDA_CODE_CHARGE"));
		return v;
	}


	
	
	public void setFrbpropIndaCodeChargeName(NString value){
		this.setValue("FRBPROP_INDA_CODE_CHARGE_NAME", value.getValue());
	}


	public NString getFrbpropIndaCodeChargeName(){
		NString v = new NString((String)this.getValue("FRBPROP_INDA_CODE_CHARGE_NAME"));
		return v;
	}


	
	
	public void setFrbpropInddCodeDistr(NString value){
		this.setValue("FRBPROP_INDD_CODE_DISTR", value.getValue());
	}


	public NString getFrbpropInddCodeDistr(){
		NString v = new NString((String)this.getValue("FRBPROP_INDD_CODE_DISTR"));
		return v;
	}


	
	
	public void setFrbpropInddCodeDistrName(NString value){
		this.setValue("FRBPROP_INDD_CODE_DISTR_NAME", value.getValue());
	}


	public NString getFrbpropInddCodeDistrName(){
		NString v = new NString((String)this.getValue("FRBPROP_INDD_CODE_DISTR_NAME"));
		return v;
	}


	
	
	public void setFrbpropBasiCodeCs(NString value){
		this.setValue("FRBPROP_BASI_CODE_CS", value.getValue());
	}


	public NString getFrbpropBasiCodeCs(){
		NString v = new NString((String)this.getValue("FRBPROP_BASI_CODE_CS"));
		return v;
	}


	
	
	public void setFrbpropBasiCodeCsName(NString value){
		this.setValue("FRBPROP_BASI_CODE_CS_NAME", value.getValue());
	}


	public NString getFrbpropBasiCodeCsName(){
		NString v = new NString((String)this.getValue("FRBPROP_BASI_CODE_CS_NAME"));
		return v;
	}


	
	
	public void setFrbpropCstrCodeRate(NString value){
		this.setValue("FRBPROP_CSTR_CODE_RATE", value.getValue());
	}


	public NString getFrbpropCstrCodeRate(){
		NString v = new NString((String)this.getValue("FRBPROP_CSTR_CODE_RATE"));
		return v;
	}


	
	
	public void setFrbpropCstrCodeRateName(NString value){
		this.setValue("FRBPROP_CSTR_CODE_RATE_NAME", value.getValue());
	}


	public NString getFrbpropCstrCodeRateName(){
		NString v = new NString((String)this.getValue("FRBPROP_CSTR_CODE_RATE_NAME"));
		return v;
	}


	
	
	public void setFrbpropCstaCodeCharge(NString value){
		this.setValue("FRBPROP_CSTA_CODE_CHARGE", value.getValue());
	}


	public NString getFrbpropCstaCodeCharge(){
		NString v = new NString((String)this.getValue("FRBPROP_CSTA_CODE_CHARGE"));
		return v;
	}


	
	
	public void setFrbpropCstaCodeChargeName(NString value){
		this.setValue("FRBPROP_CSTA_CODE_CHARGE_NAME", value.getValue());
	}


	public NString getFrbpropCstaCodeChargeName(){
		NString v = new NString((String)this.getValue("FRBPROP_CSTA_CODE_CHARGE_NAME"));
		return v;
	}


	
	
	public void setFrbpropCstdCodeDistr(NString value){
		this.setValue("FRBPROP_CSTD_CODE_DISTR", value.getValue());
	}


	public NString getFrbpropCstdCodeDistr(){
		NString v = new NString((String)this.getValue("FRBPROP_CSTD_CODE_DISTR"));
		return v;
	}


	
	
	public void setFrbpropCstdCodeDistrName(NString value){
		this.setValue("FRBPROP_CSTD_CODE_DISTR_NAME", value.getValue());
	}


	public NString getFrbpropCstdCodeDistrName(){
		NString v = new NString((String)this.getValue("FRBPROP_CSTD_CODE_DISTR_NAME"));
		return v;
	}


	
	
	public void setFrbpropFringeRate(NNumber value){
		this.setValue("FRBPROP_FRINGE_RATE", value.getValue());
	}


	public NNumber getFrbpropFringeRate(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBPROP_FRINGE_RATE"));
		return v;
	}


	
	
	public void setFrbpropCode(NString value){
		this.setValue("FRBPROP_CODE", value.getValue());
	}


	public NString getFrbpropCode(){
		NString v = new NString((String)this.getValue("FRBPROP_CODE"));
		return v;
	}


	
	
	public void setFrbpropAgencyPidm(NNumber value){
		this.setValue("FRBPROP_AGENCY_PIDM", value.getValue());
	}


	public NNumber getFrbpropAgencyPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBPROP_AGENCY_PIDM"));
		return v;
	}


	
	
	public void setFrbpropCfdaInternalIdNo(NNumber value){
		this.setValue("FRBPROP_CFDA_INTERNAL_ID_NO", value.getValue());
	}


	public NNumber getFrbpropCfdaInternalIdNo(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBPROP_CFDA_INTERNAL_ID_NO"));
		return v;
	}


	
	
	public void setFrbpropActivityDate(NDate value){
		this.setValue("FRBPROP_ACTIVITY_DATE", value.getValue());
	}


	public NDate getFrbpropActivityDate(){
		NDate v = new NDate((Date)this.getValue("FRBPROP_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setFrbpropPiPidm(NNumber value){
		this.setValue("FRBPROP_PI_PIDM", value.getValue());
	}


	public NNumber getFrbpropPiPidm(){
		NNumber v = new NNumber((BigDecimal)this.getValue("FRBPROP_PI_PIDM"));
		return v;
	}


	
	
	public void setFrbpropUserId(NString value){
		this.setValue("FRBPROP_USER_ID", value.getValue());
	}


	public NString getFrbpropUserId(){
		NString v = new NString((String)this.getValue("FRBPROP_USER_ID"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
