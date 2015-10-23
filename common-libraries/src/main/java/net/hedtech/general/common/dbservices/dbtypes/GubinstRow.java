package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id="GubinstRow", dataSourceName="GUBINST", rowType=true)
public class GubinstRow
{
	@DbRecordField(dataSourceName="GUBINST_KEY")
	public NString GubinstKey;
	@DbRecordField(dataSourceName="GUBINST_OPERATING_SYSTEM_IND")
	public NString GubinstOperatingSystemInd;
	@DbRecordField(dataSourceName="GUBINST_NAME")
	public NString GubinstName;
	@DbRecordField(dataSourceName="GUBINST_STREET_LINE1")
	public NString GubinstStreetLine1;
	@DbRecordField(dataSourceName="GUBINST_STREET_LINE2")
	public NString GubinstStreetLine2;
	@DbRecordField(dataSourceName="GUBINST_STREET_LINE3")
	public NString GubinstStreetLine3;
	@DbRecordField(dataSourceName="GUBINST_CITY")
	public NString GubinstCity;
	@DbRecordField(dataSourceName="GUBINST_STAT_CODE")
	public NString GubinstStatCode;
	@DbRecordField(dataSourceName="GUBINST_ZIP")
	public NString GubinstZip;
	@DbRecordField(dataSourceName="GUBINST_PHONE_AREA")
	public NString GubinstPhoneArea;
	@DbRecordField(dataSourceName="GUBINST_PHONE")
	public NString GubinstPhone;
	@DbRecordField(dataSourceName="GUBINST_PHONE_EXT")
	public NString GubinstPhoneExt;
	@DbRecordField(dataSourceName="GUBINST_NATN_CODE")
	public NString GubinstNatnCode;
	@DbRecordField(dataSourceName="GUBINST_FINAID_IND")
	public NString GubinstFinaidInd;
	@DbRecordField(dataSourceName="GUBINST_ACTIVITY_DATE")
	public NDate GubinstActivityDate;
	@DbRecordField(dataSourceName="GUBINST_STUDENT_INSTALLED")
	public NString GubinstStudentInstalled;
	@DbRecordField(dataSourceName="GUBINST_ALUMNI_INSTALLED")
	public NString GubinstAlumniInstalled;
	@DbRecordField(dataSourceName="GUBINST_FINANCE_INSTALLED")
	public NString GubinstFinanceInstalled;
	@DbRecordField(dataSourceName="GUBINST_HUMANRE_INSTALLED")
	public NString GubinstHumanreInstalled;
	@DbRecordField(dataSourceName="GUBINST_BYPASS_ALT_VAL")
	public NString GubinstBypassAltVal;
	@DbRecordField(dataSourceName="GUBINST_POSBUD_INSTALLED")
	public NString GubinstPosbudInstalled;
	@DbRecordField(dataSourceName="GUBINST_BILCSH_INSTALLED")
	public NString GubinstBilcshInstalled;
	@DbRecordField(dataSourceName="GUBINST_SECURITY_IND")
	public java.lang.Byte[] GubinstSecurityInd;
	@DbRecordField(dataSourceName="GUBINST_FINAID_INSTALLED")
	public NString GubinstFinaidInstalled;
	@DbRecordField(dataSourceName="GUBINST_COURTS_INSTALLED")
	public NString GubinstCourtsInstalled;
	@DbRecordField(dataSourceName="GUBINST_HIGHED_GOVT_IND")
	public NString GubinstHighedGovtInd;
	@DbRecordField(dataSourceName="GUBINST_BASE_CURR_CODE")
	public NString GubinstBaseCurrCode;
	@DbRecordField(dataSourceName="GUBINST_UTILITIES_INSTALLED")
	public NString GubinstUtilitiesInstalled;
	@DbRecordField(dataSourceName="GUBINST_ZIP_DEFAULT_LENGTH")
	public NNumber GubinstZipDefaultLength;
	@DbRecordField(dataSourceName="GUBINST_CENTURY_PIVOT")
	public NNumber GubinstCenturyPivot;
	@DbRecordField(dataSourceName="GUBINST_DATE_DEFAULT_FORMAT")
	public NNumber GubinstDateDefaultFormat;
	@DbRecordField(dataSourceName="GUBINST_INSTANCE_NAME")
	public NString GubinstInstanceName;
	@DbRecordField(dataSourceName="GUBINST_PTAX_INSTALLED")
	public NString GubinstPtaxInstalled;
	@DbRecordField(dataSourceName="GUBINST_OCCTAX_INSTALLED")
	public NString GubinstOcctaxInstalled;
	@DbRecordField(dataSourceName="GUBINST_RECORDS_INSTALLED")
	public NString GubinstRecordsInstalled;
	@DbRecordField(dataSourceName="GUBINST_CASHREC_INSTALLED")
	public NString GubinstCashrecInstalled;
	@DbRecordField(dataSourceName="GUBINST_MAX_OPEN_FORMS")
	public NNumber GubinstMaxOpenForms;
	@DbRecordField(dataSourceName="GUBINST_CHARMODE_GURJOBS_IND")
	public java.lang.Byte[] GubinstCharmodeGurjobsInd;
	@DbRecordField(dataSourceName="GUBINST_WF_ENABLED_IND")
	public NString GubinstWfEnabledInd;
	@DbRecordField(dataSourceName="GUBINST_MESSAGE_ENABLED_IND")
	public NString GubinstMessageEnabledInd;
	@DbRecordField(dataSourceName="GUBINST_SQLTRACE_ENABLED_IND")
	public NString GubinstSqltraceEnabledInd;
	@DbRecordField(dataSourceName="GUBINST_ONLINE_MATCH_IND")
	public NString GubinstOnlineMatchInd;
	@DbRecordField(dataSourceName="GUBINST_SSN_SEARCH_ENABLED_IND")
	public NString GubinstSsnSearchEnabledInd;
	@DbRecordField(dataSourceName="GUBINST_CTRY_CODE_PHONE")
	public NString GubinstCtryCodePhone;
	@DbRecordField(dataSourceName="GUBINST_HOUSE_NUMBER")
	public NString GubinstHouseNumber;
	@DbRecordField(dataSourceName="GUBINST_STREET_LINE4")
	public NString GubinstStreetLine4;
	@DbRecordField(dataSourceName="GUBINST_SSN_MAX_LENGTH")
	public NNumber GubinstSsnMaxLength;
	@DbRecordField(dataSourceName="GUBINST_SURROGATE_ID")
	public NNumber GubinstSurrogateId;
	@DbRecordField(dataSourceName="GUBINST_VERSION")
	public NNumber GubinstVersion;
	@DbRecordField(dataSourceName="GUBINST_USER_ID")
	public NString GubinstUserId;
	@DbRecordField(dataSourceName="GUBINST_DATA_ORIGIN")
	public NString GubinstDataOrigin;
	@DbRecordField(dataSourceName="GUBINST_VPDI_CODE")
	public NString GubinstVpdiCode;
}

