package  net.hedtech.banner.general.common.Guainst.model;

import java.util.Date;
import java.math.BigDecimal;

import org.jdesktop.databuffer.DataRow;

import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class GubinstAdapter extends BaseRowAdapter{
	

	public GubinstAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGubinstName(NString value){
		this.setValue("GUBINST_NAME", value.getValue());
	}


	public NString getGubinstName(){
		NString v = new NString((String)this.getValue("GUBINST_NAME"));
		return v;
	}


	
	
	public void setGubinstHouseNumber(NString value){
		this.setValue("GUBINST_HOUSE_NUMBER", value.getValue());
	}


	public NString getGubinstHouseNumber(){
		NString v = new NString((String)this.getValue("GUBINST_HOUSE_NUMBER"));
		return v;
	}


	
	
	public void setGubinstStreetLine1(NString value){
		this.setValue("GUBINST_STREET_LINE1", value.getValue());
	}


	public NString getGubinstStreetLine1(){
		NString v = new NString((String)this.getValue("GUBINST_STREET_LINE1"));
		return v;
	}


	
	
	public void setGubinstStreetLine2(NString value){
		this.setValue("GUBINST_STREET_LINE2", value.getValue());
	}


	public NString getGubinstStreetLine2(){
		NString v = new NString((String)this.getValue("GUBINST_STREET_LINE2"));
		return v;
	}


	
	
	public void setGubinstStreetLine3(NString value){
		this.setValue("GUBINST_STREET_LINE3", value.getValue());
	}


	public NString getGubinstStreetLine3(){
		NString v = new NString((String)this.getValue("GUBINST_STREET_LINE3"));
		return v;
	}


	
	
	public void setGubinstStreetLine4(NString value){
		this.setValue("GUBINST_STREET_LINE4", value.getValue());
	}


	public NString getGubinstStreetLine4(){
		NString v = new NString((String)this.getValue("GUBINST_STREET_LINE4"));
		return v;
	}


	
	
	public void setGubinstCity(NString value){
		this.setValue("GUBINST_CITY", value.getValue());
	}


	public NString getGubinstCity(){
		NString v = new NString((String)this.getValue("GUBINST_CITY"));
		return v;
	}


	
	
	public void setGubinstStatCode(NString value){
		this.setValue("GUBINST_STAT_CODE", value.getValue());
	}


	public NString getGubinstStatCode(){
		NString v = new NString((String)this.getValue("GUBINST_STAT_CODE"));
		return v;
	}


	
	
	public void setGubinstZip(NString value){
		this.setValue("GUBINST_ZIP", value.getValue());
	}


	public NString getGubinstZip(){
		NString v = new NString((String)this.getValue("GUBINST_ZIP"));
		return v;
	}


	
	
	public void setGubinstNatnCode(NString value){
		this.setValue("GUBINST_NATN_CODE", value.getValue());
	}


	public NString getGubinstNatnCode(){
		NString v = new NString((String)this.getValue("GUBINST_NATN_CODE"));
		return v;
	}


	
	
	public void setNatnDescription(NString value){
		this.setValue("NATN_DESCRIPTION", value.getValue());
	}


	public NString getNatnDescription(){
		NString v = new NString((String)this.getValue("NATN_DESCRIPTION"));
		return v;
	}


	
	
	public void setGubinstCtryCodePhone(NString value){
		this.setValue("GUBINST_CTRY_CODE_PHONE", value.getValue());
	}


	public NString getGubinstCtryCodePhone(){
		NString v = new NString((String)this.getValue("GUBINST_CTRY_CODE_PHONE"));
		return v;
	}


	
	
	public void setGubinstPhoneArea(NString value){
		this.setValue("GUBINST_PHONE_AREA", value.getValue());
	}


	public NString getGubinstPhoneArea(){
		NString v = new NString((String)this.getValue("GUBINST_PHONE_AREA"));
		return v;
	}


	
	
	public void setGubinstPhone(NString value){
		this.setValue("GUBINST_PHONE", value.getValue());
	}


	public NString getGubinstPhone(){
		NString v = new NString((String)this.getValue("GUBINST_PHONE"));
		return v;
	}


	
	
	public void setGubinstPhoneExt(NString value){
		this.setValue("GUBINST_PHONE_EXT", value.getValue());
	}


	public NString getGubinstPhoneExt(){
		NString v = new NString((String)this.getValue("GUBINST_PHONE_EXT"));
		return v;
	}


	
	
	public void setGubinstOperatingSystemInd(NString value){
		this.setValue("GUBINST_OPERATING_SYSTEM_IND", value.getValue());
	}


	public NString getGubinstOperatingSystemInd(){
		NString v = new NString((String)this.getValue("GUBINST_OPERATING_SYSTEM_IND"));
		return v;
	}


	
	
	public void setGubinstHighedGovtInd(NString value){
		this.setValue("GUBINST_HIGHED_GOVT_IND", value.getValue());
	}


	public NString getGubinstHighedGovtInd(){
		NString v = new NString((String)this.getValue("GUBINST_HIGHED_GOVT_IND"));
		return v;
	}


	
	
	public void setGubinstInstanceName(NString value){
		this.setValue("GUBINST_INSTANCE_NAME", value.getValue());
	}


	public NString getGubinstInstanceName(){
		NString v = new NString((String)this.getValue("GUBINST_INSTANCE_NAME"));
		return v;
	}


	
	
	public void setGubinstZipDefaultLength(NNumber value){
		this.setValue("GUBINST_ZIP_DEFAULT_LENGTH", value.getValue());
	}


	public NNumber getGubinstZipDefaultLength(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GUBINST_ZIP_DEFAULT_LENGTH"));
		return v;
	}


	
	
	public void setGubinstMaxOpenForms(NNumber value){
		this.setValue("GUBINST_MAX_OPEN_FORMS", value.getValue());
	}


	public NNumber getGubinstMaxOpenForms(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GUBINST_MAX_OPEN_FORMS"));
		return v;
	}


	
	
	public void setGubinstBaseCurrCode(NString value){
		this.setValue("GUBINST_BASE_CURR_CODE", value.getValue());
	}


	public NString getGubinstBaseCurrCode(){
		NString v = new NString((String)this.getValue("GUBINST_BASE_CURR_CODE"));
		return v;
	}


	
	
	public void setCurrTitle(NString value){
		this.setValue("CURR_TITLE", value.getValue());
	}


	public NString getCurrTitle(){
		NString v = new NString((String)this.getValue("CURR_TITLE"));
		return v;
	}


	
	
	public void setGubinstSsnMaxLength(NNumber value){
		this.setValue("GUBINST_SSN_MAX_LENGTH", value.getValue());
	}


	public NNumber getGubinstSsnMaxLength(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GUBINST_SSN_MAX_LENGTH"));
		return v;
	}


	
	
	public void setGubinstCenturyPivot(NNumber value){
		this.setValue("GUBINST_CENTURY_PIVOT", value.getValue());
	}


	public NNumber getGubinstCenturyPivot(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GUBINST_CENTURY_PIVOT"));
		return v;
	}


	
	
	public void setGubinstDateDefaultFormat(NNumber value){
		this.setValue("GUBINST_DATE_DEFAULT_FORMAT", value.getValue());
	}


	public NNumber getGubinstDateDefaultFormat(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GUBINST_DATE_DEFAULT_FORMAT"));
		return v;
	}


	
	
	public void setGubinstOnlineMatchInd(NString value){
		this.setValue("GUBINST_ONLINE_MATCH_IND", value.getValue());
	}


	public NString getGubinstOnlineMatchInd(){
		NString v = new NString((String)this.getValue("GUBINST_ONLINE_MATCH_IND"));
		return v;
	}


	
	
	public void setGubinstWfEnabledInd(NString value){
		this.setValue("GUBINST_WF_ENABLED_IND", value.getValue());
	}


	public NString getGubinstWfEnabledInd(){
		NString v = new NString((String)this.getValue("GUBINST_WF_ENABLED_IND"));
		return v;
	}


	
	
	public void setGubinstSqltraceEnabledInd(NString value){
		this.setValue("GUBINST_SQLTRACE_ENABLED_IND", value.getValue());
	}


	public NString getGubinstSqltraceEnabledInd(){
		NString v = new NString((String)this.getValue("GUBINST_SQLTRACE_ENABLED_IND"));
		return v;
	}


	
	
	public void setGubinstMessageEnabledInd(NString value){
		this.setValue("GUBINST_MESSAGE_ENABLED_IND", value.getValue());
	}


	public NString getGubinstMessageEnabledInd(){
		NString v = new NString((String)this.getValue("GUBINST_MESSAGE_ENABLED_IND"));
		return v;
	}


	
	
	public void setGubinstSsnSearchEnabledInd(NString value){
		this.setValue("GUBINST_SSN_SEARCH_ENABLED_IND", value.getValue());
	}


	public NString getGubinstSsnSearchEnabledInd(){
		NString v = new NString((String)this.getValue("GUBINST_SSN_SEARCH_ENABLED_IND"));
		return v;
	}


	
	
	public void setGubinstGeneralInstalled(NString value){
		this.setValue("GUBINST_GENERAL_INSTALLED", value.getValue());
	}


	public NString getGubinstGeneralInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_GENERAL_INSTALLED"));
		return v;
	}


	
	
	public void setGeneralRelease(NString value){
		this.setValue("GENERAL_RELEASE", value.getValue());
	}


	public NString getGeneralRelease(){
		NString v = new NString((String)this.getValue("GENERAL_RELEASE"));
		return v;
	}


	
	
	public void setGeneralStageDate(NDate value){
		this.setValue("GENERAL_STAGE_DATE", value.getValue());
	}


	public NDate getGeneralStageDate(){
		NDate v = new NDate((Date)this.getValue("GENERAL_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstActivityDate(NDate value){
		this.setValue("GUBINST_ACTIVITY_DATE", value.getValue());
	}


	public NDate getGubinstActivityDate(){
		NDate v = new NDate((Date)this.getValue("GUBINST_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setGubinstCharmodeGurjobsInd(byte[] value){
		//this.setValue("GUBINST_CHARMODE_GURJOBS_IND", value.getValue());
		this.setValue("GUBINST_CHARMODE_GURJOBS_IND", value);
	}


	public byte[] getGubinstCharmodeGurjobsInd(){
		//byte[] v = new byte[]((String)this.getValue("GUBINST_CHARMODE_GURJOBS_IND"));
		byte[] v = this.getValue("GUBINST_CHARMODE_GURJOBS_IND").toString().getBytes();
		return v;
	}

	
	
	
	
	public void setGubinstAlumniInstalled(NString value){
		this.setValue("GUBINST_ALUMNI_INSTALLED", value.getValue());
	}


	public NString getGubinstAlumniInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_ALUMNI_INSTALLED"));
		return v;
	}


	
	
	public void setAlumniRelease(NString value){
		this.setValue("ALUMNI_RELEASE", value.getValue());
	}


	public NString getAlumniRelease(){
		NString v = new NString((String)this.getValue("ALUMNI_RELEASE"));
		return v;
	}


	
	
	public void setAlumniStageDate(NDate value){
		this.setValue("ALUMNI_STAGE_DATE", value.getValue());
	}


	public NDate getAlumniStageDate(){
		NDate v = new NDate((Date)this.getValue("ALUMNI_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstCourtsInstalled(NString value){
		this.setValue("GUBINST_COURTS_INSTALLED", value.getValue());
	}


	public NString getGubinstCourtsInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_COURTS_INSTALLED"));
		return v;
	}


	
	
	public void setCourtsRelease(NString value){
		this.setValue("COURTS_RELEASE", value.getValue());
	}


	public NString getCourtsRelease(){
		NString v = new NString((String)this.getValue("COURTS_RELEASE"));
		return v;
	}


	
	
	public void setCourtsStageDate(NDate value){
		this.setValue("COURTS_STAGE_DATE", value.getValue());
	}


	public NDate getCourtsStageDate(){
		NDate v = new NDate((Date)this.getValue("COURTS_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstBilcshInstalled(NString value){
		this.setValue("GUBINST_BILCSH_INSTALLED", value.getValue());
	}


	public NString getGubinstBilcshInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_BILCSH_INSTALLED"));
		return v;
	}


	
	
	public void setBilcshRelease(NString value){
		this.setValue("BILCSH_RELEASE", value.getValue());
	}


	public NString getBilcshRelease(){
		NString v = new NString((String)this.getValue("BILCSH_RELEASE"));
		return v;
	}


	
	
	public void setBilcshStageDate(NDate value){
		this.setValue("BILCSH_STAGE_DATE", value.getValue());
	}


	public NDate getBilcshStageDate(){
		NDate v = new NDate((Date)this.getValue("BILCSH_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstCashrecInstalled(NString value){
		this.setValue("GUBINST_CASHREC_INSTALLED", value.getValue());
	}


	public NString getGubinstCashrecInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_CASHREC_INSTALLED"));
		return v;
	}


	
	
	public void setCashrecRelease(NString value){
		this.setValue("CASHREC_RELEASE", value.getValue());
	}


	public NString getCashrecRelease(){
		NString v = new NString((String)this.getValue("CASHREC_RELEASE"));
		return v;
	}


	
	
	public void setCashrecStageDate(NDate value){
		this.setValue("CASHREC_STAGE_DATE", value.getValue());
	}


	public NDate getCashrecStageDate(){
		NDate v = new NDate((Date)this.getValue("CASHREC_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstFinaidInstalled(NString value){
		this.setValue("GUBINST_FINAID_INSTALLED", value.getValue());
	}


	public NString getGubinstFinaidInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_FINAID_INSTALLED"));
		return v;
	}


	
	
	public void setFinaidRelease(NString value){
		this.setValue("FINAID_RELEASE", value.getValue());
	}


	public NString getFinaidRelease(){
		NString v = new NString((String)this.getValue("FINAID_RELEASE"));
		return v;
	}


	
	
	public void setFinaidStageDate(NDate value){
		this.setValue("FINAID_STAGE_DATE", value.getValue());
	}


	public NDate getFinaidStageDate(){
		NDate v = new NDate((Date)this.getValue("FINAID_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstRecordsInstalled(NString value){
		this.setValue("GUBINST_RECORDS_INSTALLED", value.getValue());
	}


	public NString getGubinstRecordsInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_RECORDS_INSTALLED"));
		return v;
	}


	
	
	public void setRecordsRelease(NString value){
		this.setValue("RECORDS_RELEASE", value.getValue());
	}


	public NString getRecordsRelease(){
		NString v = new NString((String)this.getValue("RECORDS_RELEASE"));
		return v;
	}


	
	
	public void setRecordsStageDate(NDate value){
		this.setValue("RECORDS_STAGE_DATE", value.getValue());
	}


	public NDate getRecordsStageDate(){
		NDate v = new NDate((Date)this.getValue("RECORDS_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstFinaidInd(NString value){
		this.setValue("GUBINST_FINAID_IND", value.getValue());
	}


	public NString getGubinstFinaidInd(){
		NString v = new NString((String)this.getValue("GUBINST_FINAID_IND"));
		return v;
	}


	
	
	public void setGubinstPtaxInstalled(NString value){
		this.setValue("GUBINST_PTAX_INSTALLED", value.getValue());
	}


	public NString getGubinstPtaxInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_PTAX_INSTALLED"));
		return v;
	}


	
	
	public void setPtaxRelease(NString value){
		this.setValue("PTAX_RELEASE", value.getValue());
	}


	public NString getPtaxRelease(){
		NString v = new NString((String)this.getValue("PTAX_RELEASE"));
		return v;
	}


	
	
	public void setPtaxStageDate(NDate value){
		this.setValue("PTAX_STAGE_DATE", value.getValue());
	}


	public NDate getPtaxStageDate(){
		NDate v = new NDate((Date)this.getValue("PTAX_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstFinanceInstalled(NString value){
		this.setValue("GUBINST_FINANCE_INSTALLED", value.getValue());
	}


	public NString getGubinstFinanceInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_FINANCE_INSTALLED"));
		return v;
	}


	
	
	public void setFinanceRelease(NString value){
		this.setValue("FINANCE_RELEASE", value.getValue());
	}


	public NString getFinanceRelease(){
		NString v = new NString((String)this.getValue("FINANCE_RELEASE"));
		return v;
	}


	
	
	public void setFinanceStageDate(NDate value){
		this.setValue("FINANCE_STAGE_DATE", value.getValue());
	}


	public NDate getFinanceStageDate(){
		NDate v = new NDate((Date)this.getValue("FINANCE_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstOcctaxInstalled(NString value){
		this.setValue("GUBINST_OCCTAX_INSTALLED", value.getValue());
	}


	public NString getGubinstOcctaxInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_OCCTAX_INSTALLED"));
		return v;
	}


	
	
	public void setOcctaxRelease(NString value){
		this.setValue("OCCTAX_RELEASE", value.getValue());
	}


	public NString getOcctaxRelease(){
		NString v = new NString((String)this.getValue("OCCTAX_RELEASE"));
		return v;
	}


	
	
	public void setOcctaxStageDate(NDate value){
		this.setValue("OCCTAX_STAGE_DATE", value.getValue());
	}


	public NDate getOcctaxStageDate(){
		NDate v = new NDate((Date)this.getValue("OCCTAX_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstHumanreInstalled(NString value){
		this.setValue("GUBINST_HUMANRE_INSTALLED", value.getValue());
	}


	public NString getGubinstHumanreInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_HUMANRE_INSTALLED"));
		return v;
	}


	
	
	public void setHumanreRelease(NString value){
		this.setValue("HUMANRE_RELEASE", value.getValue());
	}


	public NString getHumanreRelease(){
		NString v = new NString((String)this.getValue("HUMANRE_RELEASE"));
		return v;
	}


	
	
	public void setHumanreStageDate(NDate value){
		this.setValue("HUMANRE_STAGE_DATE", value.getValue());
	}


	public NDate getHumanreStageDate(){
		NDate v = new NDate((Date)this.getValue("HUMANRE_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstPosbudInstalled(NString value){
		this.setValue("GUBINST_POSBUD_INSTALLED", value.getValue());
	}


	public NString getGubinstPosbudInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_POSBUD_INSTALLED"));
		return v;
	}


	
	
	public void setPosbudRelease(NString value){
		this.setValue("POSBUD_RELEASE", value.getValue());
	}


	public NString getPosbudRelease(){
		NString v = new NString((String)this.getValue("POSBUD_RELEASE"));
		return v;
	}


	
	
	public void setPosbudStageDate(NDate value){
		this.setValue("POSBUD_STAGE_DATE", value.getValue());
	}


	public NDate getPosbudStageDate(){
		NDate v = new NDate((Date)this.getValue("POSBUD_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstStudentInstalled(NString value){
		this.setValue("GUBINST_STUDENT_INSTALLED", value.getValue());
	}


	public NString getGubinstStudentInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_STUDENT_INSTALLED"));
		return v;
	}


	
	
	public void setStudentRelease(NString value){
		this.setValue("STUDENT_RELEASE", value.getValue());
	}


	public NString getStudentRelease(){
		NString v = new NString((String)this.getValue("STUDENT_RELEASE"));
		return v;
	}


	
	
	public void setStudentStageDate(NDate value){
		this.setValue("STUDENT_STAGE_DATE", value.getValue());
	}


	public NDate getStudentStageDate(){
		NDate v = new NDate((Date)this.getValue("STUDENT_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstUtilitiesInstalled(NString value){
		this.setValue("GUBINST_UTILITIES_INSTALLED", value.getValue());
	}


	public NString getGubinstUtilitiesInstalled(){
		NString v = new NString((String)this.getValue("GUBINST_UTILITIES_INSTALLED"));
		return v;
	}


	
	
	public void setUtilitiesRelease(NString value){
		this.setValue("UTILITIES_RELEASE", value.getValue());
	}


	public NString getUtilitiesRelease(){
		NString v = new NString((String)this.getValue("UTILITIES_RELEASE"));
		return v;
	}


	
	
	public void setUtilitiesStageDate(NDate value){
		this.setValue("UTILITIES_STAGE_DATE", value.getValue());
	}


	public NDate getUtilitiesStageDate(){
		NDate v = new NDate((Date)this.getValue("UTILITIES_STAGE_DATE"));
		return v;
	}


	
	
	public void setGubinstKey(NString value){
		this.setValue("GUBINST_KEY", value.getValue());
	}


	public NString getGubinstKey(){
		NString v = new NString((String)this.getValue("GUBINST_KEY"));
		return v;
	}


	
	
	public void setDisplayBilcshRelease(NString value){
		this.setValue("DISPLAY_BILCSH_RELEASE", value.getValue());
	}


	public NString getDisplayBilcshRelease(){
		NString v = new NString((String)this.getValue("DISPLAY_BILCSH_RELEASE"));
		return v;
	}


	

	public void setROWID(byte[] bytes) {
		this.setROWID(DbManager.getDataBaseFactory().createRowid(bytes));
	}
 
	public void setROWID(java.sql.RowId rowId) {
		this.setValue(DAOConfiguration.MODEL_ROWID, rowId);
	}
	
}
