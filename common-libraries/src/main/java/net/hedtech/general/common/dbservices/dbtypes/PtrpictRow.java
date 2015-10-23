package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id = "PtrpictRow", dataSourceName = "PTRPICT", rowType = true)
public class PtrpictRow {
	@DbRecordField(dataSourceName = "PTRPICT_CODE")
	public NString PtrpictCode;
	@DbRecordField(dataSourceName = "PTRPICT_DESC")
	public NString PtrpictDesc;
	@DbRecordField(dataSourceName = "PTRPICT_PAYS_PER_YEAR")
	public NNumber PtrpictPaysPerYear;
	@DbRecordField(dataSourceName = "PTRPICT_TAX_FACTOR")
	public NNumber PtrpictTaxFactor;
	@DbRecordField(dataSourceName = "PTRPICT_SUPP_PAY_IND")
	public NString PtrpictSuppPayInd;
	@DbRecordField(dataSourceName = "PTRPICT_CODE_ORIG")
	public NString PtrpictCodeOrig;
	@DbRecordField(dataSourceName = "PTRPICT_ACTIVITY_DATE")
	public NDate PtrpictActivityDate;
	@DbRecordField(dataSourceName = "PTRPICT_ROE_PERIOD_TYPE")
	public NString PtrpictRoePeriodType;
	@DbRecordField(dataSourceName = "PTRPICT_UI_MIN_HOURS")
	public NNumber PtrpictUiMinHours;
	@DbRecordField(dataSourceName = "PTRPICT_UI_MIN_EARNINGS")
	public NNumber PtrpictUiMinEarnings;
	@DbRecordField(dataSourceName = "PTRPICT_UI_MAX_EARNINGS")
	public NNumber PtrpictUiMaxEarnings;
	@DbRecordField(dataSourceName = "PTRPICT_UI_WEEKS")
	public NNumber PtrpictUiWeeks;
	@DbRecordField(dataSourceName = "PTRPICT_BANK_CODE")
	public NString PtrpictBankCode;
	@DbRecordField(dataSourceName = "PTRPICT_TS_CUTOFF_DAYS")
	public NNumber PtrpictTsCutoffDays;
	@DbRecordField(dataSourceName = "PTRPICT_TS_CUTOFF_TIME")
	public NString PtrpictTsCutoffTime;
	@DbRecordField(dataSourceName = "PTRPICT_TS_PRIOR_AFTER_IND")
	public NString PtrpictTsPriorAfterInd;
	@DbRecordField(dataSourceName = "PTRPICT_TS_WEB_VIEW_MONTHS")
	public NNumber PtrpictTsWebViewMonths;
	@DbRecordField(dataSourceName = "PTRPICT_TS_LEAVE_REQUESTS")
	public NNumber PtrpictTsLeaveRequests;
	@DbRecordField(dataSourceName = "PTRPICT_SURROGATE_ID")
	public NNumber PtrpictSurrogateId;
	@DbRecordField(dataSourceName = "PTRPICT_VERSION")
	public NNumber PtrpictVersion;
	@DbRecordField(dataSourceName = "PTRPICT_USER_ID")
	public NString PtrpictUserId;
	@DbRecordField(dataSourceName = "PTRPICT_DATA_ORIGIN")
	public NString PtrpictDataOrigin;
	@DbRecordField(dataSourceName = "PTRPICT_VPDI_CODE")
	public NString PtrpictVpdiCode;
	@DbRecordField(dataSourceName = "PTRPICT_TS_APR_CUTOFF_DAYS")
	public NNumber PtrpictTsAprCutoffDays;
	@DbRecordField(dataSourceName = "PTRPICT_TS_APR_CUTOFF_TIME")
	public NString PtrpictTsAprCutoffTime;
	@DbRecordField(dataSourceName = "PTRPICT_TS_APR_PRIOR_AFTER_IND")
	public NString PtrpictTsAprPriorAfterInd;
	@DbRecordField(dataSourceName = "PTRPICT_CHECK_ISSUED_DAYS")
	public NNumber PtrpictCheckIssuedDays;
	@DbRecordField(dataSourceName = "PTRPICT_CHECK_ISSUED_IND")
	public NString PtrpictCheckIssuedInd;
	@DbRecordField(dataSourceName = "PTRPICT_WEEK_REF")
	public NNumber PtrpictWeekRef;
	@DbRecordField(dataSourceName = "PTRPICT_PAY_PERIOD")
	public NNumber PtrpictPayPeriod;

	private TableRow ptrpictrow;

	public PtrpictRow(TableRow row) {

		this.ptrpictrow = row;
		this.PtrpictCode = ptrpictrow.getStr("PTRPICT_CODE");
		this.PtrpictDesc = ptrpictrow.getStr("PTRPICT_DESC");
		this.PtrpictPaysPerYear = ptrpictrow.getNumber("PTRPICT_PAYS_PER_YEAR");
		this.PtrpictTaxFactor = ptrpictrow.getNumber("PTRPICT_TAX_FACTOR");
		this.PtrpictSuppPayInd = ptrpictrow.getStr("PTRPICT_SUPP_PAY_IND");
		this.PtrpictCodeOrig = ptrpictrow.getStr("PTRPICT_CODE_ORIG");
		this.PtrpictActivityDate = ptrpictrow.getDate("PTRPICT_ACTIVITY_DATE");
		this.PtrpictRoePeriodType = ptrpictrow
				.getStr("PTRPICT_ROE_PERIOD_TYPE");
		this.PtrpictUiMinHours = ptrpictrow.getNumber("PTRPICT_UI_MIN_HOURS");
		this.PtrpictUiMinEarnings = ptrpictrow
				.getNumber("PTRPICT_UI_MIN_EARNINGS");
		this.PtrpictUiMaxEarnings = ptrpictrow
				.getNumber("PTRPICT_UI_MAX_EARNINGS");
		this.PtrpictUiWeeks = ptrpictrow.getNumber("PTRPICT_UI_WEEKS");
		this.PtrpictBankCode = ptrpictrow.getStr("PTRPICT_BANK_CODE");
		this.PtrpictTsCutoffDays = ptrpictrow
				.getNumber("PTRPICT_TS_CUTOFF_DAYS");
		this.PtrpictTsCutoffTime = ptrpictrow.getStr("PTRPICT_TS_CUTOFF_TIME");
		this.PtrpictTsPriorAfterInd = ptrpictrow
				.getStr("PTRPICT_TS_PRIOR_AFTER_IND");
		this.PtrpictTsWebViewMonths = ptrpictrow
				.getNumber("PTRPICT_TS_WEB_VIEW_MONTHS");
		this.PtrpictTsLeaveRequests = ptrpictrow
				.getNumber("PTRPICT_TS_LEAVE_REQUESTS");
		this.PtrpictSurrogateId = ptrpictrow.getNumber("PTRPICT_SURROGATE_ID");
		this.PtrpictVersion = ptrpictrow.getNumber("PTRPICT_VERSION");
		this.PtrpictUserId = ptrpictrow.getStr("PTRPICT_USER_ID");
		this.PtrpictDataOrigin = ptrpictrow.getStr("PTRPICT_DATA_ORIGIN");
		this.PtrpictVpdiCode = ptrpictrow.getStr("PTRPICT_VPDI_CODE");
		this.PtrpictTsAprCutoffDays = ptrpictrow
				.getNumber("PTRPICT_TS_APR_CUTOFF_DAYS");
		this.PtrpictTsAprCutoffTime = ptrpictrow
				.getStr("PTRPICT_TS_APR_CUTOFF_TIME");
		this.PtrpictTsAprPriorAfterInd = ptrpictrow
				.getStr("PTRPICT_TS_APR_PRIOR_AFTER_IND");
		this.PtrpictCheckIssuedDays = ptrpictrow
				.getNumber("PTRPICT_CHECK_ISSUED_DAYS");
		this.PtrpictCheckIssuedInd = ptrpictrow
				.getStr("PTRPICT_CHECK_ISSUED_IND");
		this.PtrpictWeekRef = ptrpictrow.getNumber("PTRPICT_WEEK_REF");
		this.PtrpictPayPeriod = ptrpictrow.getNumber("PTRPICT_PAY_PERIOD");
	}
}
