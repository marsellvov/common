package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;


@DbRecordType(id = "PtreclsRow", dataSourceName = "PTRECLS", rowType = true)
public class PtreclsRow {
	@DbRecordField(dataSourceName = "PTRECLS_CODE")
	public NString PtreclsCode;
	@DbRecordField(dataSourceName = "PTRECLS_SHORT_DESC")
	public NString PtreclsShortDesc;
	@DbRecordField(dataSourceName = "PTRECLS_LONG_DESC")
	public NString PtreclsLongDesc;
	@DbRecordField(dataSourceName = "PTRECLS_PICT_CODE")
	public NString PtreclsPictCode;
	@DbRecordField(dataSourceName = "PTRECLS_SHCD_CODE")
	public NString PtreclsShcdCode;
	@DbRecordField(dataSourceName = "PTRECLS_HOURS_PER_PAY")
	public NNumber PtreclsHoursPerPay;
	@DbRecordField(dataSourceName = "PTRECLS_HOURS_PER_DAY")
	public NNumber PtreclsHoursPerDay;
	@DbRecordField(dataSourceName = "PTRECLS_SALARY_ENCUMBRANCE_IND")
	public NString PtreclsSalaryEncumbranceInd;
	@DbRecordField(dataSourceName = "PTRECLS_TS_ROSTER_IND")
	public NString PtreclsTsRosterInd;
	@DbRecordField(dataSourceName = "PTRECLS_DEFAULT_HOURS_IND")
	public NString PtreclsDefaultHoursInd;
	@DbRecordField(dataSourceName = "PTRECLS_SALARY_IND")
	public NString PtreclsSalaryInd;
	@DbRecordField(dataSourceName = "PTRECLS_BUDGET_ROLL_IND")
	public NString PtreclsBudgetRollInd;
	@DbRecordField(dataSourceName = "PTRECLS_LCAT_CODE")
	public NString PtreclsLcatCode;
	@DbRecordField(dataSourceName = "PTRECLS_BCAT_CODE")
	public NString PtreclsBcatCode;
	@DbRecordField(dataSourceName = "PTRECLS_ACTIVITY_DATE")
	public NDate PtreclsActivityDate;
	@DbRecordField(dataSourceName = "PTRECLS_EEOG_CODE")
	public NString PtreclsEeogCode;
	@DbRecordField(dataSourceName = "PTRECLS_EMPR_CODE")
	public NString PtreclsEmprCode;
	@DbRecordField(dataSourceName = "PTRECLS_INSTRUCT_CODE")
	public NString PtreclsInstructCode;
	@DbRecordField(dataSourceName = "PTRECLS_STCA_CODE")
	public NString PtreclsStcaCode;
	@DbRecordField(dataSourceName = "PTRECLS_STGR_CODE")
	public NString PtreclsStgrCode;
	@DbRecordField(dataSourceName = "PTRECLS_WKPR_CODE")
	public NString PtreclsWkprCode;
	@DbRecordField(dataSourceName = "PTRECLS_LGCD_CODE")
	public NString PtreclsLgcdCode;
	@DbRecordField(dataSourceName = "PTRECLS_FLSA_IND")
	public NString PtreclsFlsaInd;
	@DbRecordField(dataSourceName = "PTRECLS_WKSH_CODE")
	public NString PtreclsWkshCode;
	@DbRecordField(dataSourceName = "PTRECLS_TIME_ENTRY_IND")
	public NString PtreclsTimeEntryInd;
	@DbRecordField(dataSourceName = "PTRECLS_TIME_ENTRY_DAY")
	public NString PtreclsTimeEntryDay;
	@DbRecordField(dataSourceName = "PTRECLS_DFPR_CODE")
	public NString PtreclsDfprCode;
	@DbRecordField(dataSourceName = "PTRECLS_PCAT_CODE")
	public NString PtreclsPcatCode;
	@DbRecordField(dataSourceName = "PTRECLS_PREMIUM_ROLL_IND")
	public NString PtreclsPremiumRollInd;
	@DbRecordField(dataSourceName = "PTRECLS_INTERNAL_FT_PT_IND")
	public NString PtreclsInternalFtPtInd;
	@DbRecordField(dataSourceName = "PTRECLS_EGRP_CODE")
	public NString PtreclsEgrpCode;
	@DbRecordField(dataSourceName = "PTRECLS_STRS_ASSN_CODE")
	public NString PtreclsStrsAssnCode;
	@DbRecordField(dataSourceName = "PTRECLS_STRS_PAY_CODE")
	public NString PtreclsStrsPayCode;
	@DbRecordField(dataSourceName = "PTRECLS_PERS_GROUP")
	public NString PtreclsPersGroup;
	@DbRecordField(dataSourceName = "PTRECLS_PERS_PAY_CODE")
	public NString PtreclsPersPayCode;
	@DbRecordField(dataSourceName = "PTRECLS_TIME_ENTRY_METHOD")
	public NString PtreclsTimeEntryMethod;
	@DbRecordField(dataSourceName = "PTRECLS_TIME_ENTRY_TYPE")
	public NString PtreclsTimeEntryType;
	@DbRecordField(dataSourceName = "PTRECLS_LEAVE_REQUEST_IND")
	public NString PtreclsLeaveRequestInd;
	@DbRecordField(dataSourceName = "PTRECLS_EXCEPTION_APPROVAL_IND")
	public NString PtreclsExceptionApprovalInd;
	@DbRecordField(dataSourceName = "PTRECLS_TIME_IN_OUT_IND")
	public NString PtreclsTimeInOutInd;
	@DbRecordField(dataSourceName = "PTRECLS_OVERRIDE_LD_WEB_IND")
	public NString PtreclsOverrideLdWebInd;
	@DbRecordField(dataSourceName = "PTRECLS_OVERRIDE_LD_DEPT_IND")
	public NString PtreclsOverrideLdDeptInd;
	@DbRecordField(dataSourceName = "PTRECLS_BUDG_BASIS")
	public NNumber PtreclsBudgBasis;
	@DbRecordField(dataSourceName = "PTRECLS_ANN_BASIS")
	public NNumber PtreclsAnnBasis;
	@DbRecordField(dataSourceName = "PTRECLS_CREATE_JFTE_IND")
	public NString PtreclsCreateJfteInd;
	@DbRecordField(dataSourceName = "PTRECLS_LEAV_REPT_METHOD")
	public NString PtreclsLeavReptMethod;
	@DbRecordField(dataSourceName = "PTRECLS_PICT_CODE_LEAV_REPT")
	public NString PtreclsPictCodeLeavRept;
	@DbRecordField(dataSourceName = "PTRECLS_CLOCK_IN_OUT_IND")
	public NString PtreclsClockInOutInd;
	@DbRecordField(dataSourceName = "PTRECLS_SURROGATE_ID")
	public NNumber PtreclsSurrogateId;
	@DbRecordField(dataSourceName = "PTRECLS_VERSION")
	public NNumber PtreclsVersion;
	@DbRecordField(dataSourceName = "PTRECLS_USER_ID")
	public NString PtreclsUserId;
	@DbRecordField(dataSourceName = "PTRECLS_DATA_ORIGIN")
	public NString PtreclsDataOrigin;
	@DbRecordField(dataSourceName = "PTRECLS_VPDI_CODE")
	public NString PtreclsVpdiCode;

	private TableRow ptreclsrow;

	public PtreclsRow(TableRow row) {

		this.ptreclsrow = row;
		this.PtreclsCode = ptreclsrow.getStr("PTRECLS_CODE");
		this.PtreclsShortDesc = ptreclsrow.getStr("PTRECLS_SHORT_DESC");
		this.PtreclsLongDesc = ptreclsrow.getStr("PTRECLS_LONG_DESC");
		this.PtreclsPictCode = ptreclsrow.getStr("PTRECLS_PICT_CODE");
		this.PtreclsShcdCode = ptreclsrow.getStr("PTRECLS_SHCD_CODE");
		this.PtreclsHoursPerPay = ptreclsrow.getNumber("PTRECLS_HOURS_PER_PAY");
		this.PtreclsHoursPerDay = ptreclsrow.getNumber("PTRECLS_HOURS_PER_DAY");
		this.PtreclsSalaryEncumbranceInd = ptreclsrow
				.getStr("PTRECLS_SALARY_ENCUMBRANCE_IND");
		this.PtreclsTsRosterInd = ptreclsrow.getStr("PTRECLS_TS_ROSTER_IND");
		this.PtreclsDefaultHoursInd = ptreclsrow
				.getStr("PTRECLS_DEFAULT_HOURS_IND");
		this.PtreclsSalaryInd = ptreclsrow.getStr("PTRECLS_SALARY_IND");
		this.PtreclsBudgetRollInd = ptreclsrow
				.getStr("PTRECLS_BUDGET_ROLL_IND");
		this.PtreclsLcatCode = ptreclsrow.getStr("PTRECLS_LCAT_CODE");
		this.PtreclsBcatCode = ptreclsrow.getStr("PTRECLS_BCAT_CODE");
		this.PtreclsActivityDate = ptreclsrow.getDate("PTRECLS_ACTIVITY_DATE");
		this.PtreclsEeogCode = ptreclsrow.getStr("PTRECLS_EEOG_CODE");
		this.PtreclsEmprCode = ptreclsrow.getStr("PTRECLS_EMPR_CODE");
		this.PtreclsInstructCode = ptreclsrow.getStr("PTRECLS_INSTRUCT_CODE");
		this.PtreclsStcaCode = ptreclsrow.getStr("PTRECLS_STCA_CODE");
		this.PtreclsStgrCode = ptreclsrow.getStr("PTRECLS_STGR_CODE");
		this.PtreclsWkprCode = ptreclsrow.getStr("PTRECLS_WKPR_CODE");
		this.PtreclsLgcdCode = ptreclsrow.getStr("PTRECLS_LGCD_CODE");
		this.PtreclsFlsaInd = ptreclsrow.getStr("PTRECLS_FLSA_IND");
		this.PtreclsWkshCode = ptreclsrow.getStr("PTRECLS_WKSH_CODE");
		this.PtreclsTimeEntryInd = ptreclsrow.getStr("PTRECLS_TIME_ENTRY_IND");
		this.PtreclsTimeEntryDay = ptreclsrow.getStr("PTRECLS_TIME_ENTRY_DAY");
		this.PtreclsDfprCode = ptreclsrow.getStr("PTRECLS_DFPR_CODE");
		this.PtreclsPcatCode = ptreclsrow.getStr("PTRECLS_PCAT_CODE");
		this.PtreclsPremiumRollInd = ptreclsrow
				.getStr("PTRECLS_PREMIUM_ROLL_IND");
		this.PtreclsInternalFtPtInd = ptreclsrow
				.getStr("PTRECLS_INTERNAL_FT_PT_IND");
		this.PtreclsEgrpCode = ptreclsrow.getStr("PTRECLS_EGRP_CODE");
		this.PtreclsStrsAssnCode = ptreclsrow.getStr("PTRECLS_STRS_ASSN_CODE");
		this.PtreclsStrsPayCode = ptreclsrow.getStr("PTRECLS_STRS_PAY_CODE");
		this.PtreclsPersGroup = ptreclsrow.getStr("PTRECLS_PERS_GROUP");
		this.PtreclsPersPayCode = ptreclsrow.getStr("PTRECLS_PERS_PAY_CODE");
		this.PtreclsTimeEntryMethod = ptreclsrow
				.getStr("PTRECLS_TIME_ENTRY_METHOD");
		this.PtreclsTimeEntryType = ptreclsrow
				.getStr("PTRECLS_TIME_ENTRY_TYPE");
		this.PtreclsLeaveRequestInd = ptreclsrow
				.getStr("PTRECLS_LEAVE_REQUEST_IND");
		this.PtreclsExceptionApprovalInd = ptreclsrow
				.getStr("PTRECLS_EXCEPTION_APPROVAL_IND");
		this.PtreclsTimeInOutInd = ptreclsrow.getStr("PTRECLS_TIME_IN_OUT_IND");
		this.PtreclsOverrideLdWebInd = ptreclsrow
				.getStr("PTRECLS_OVERRIDE_LD_WEB_IND");
		this.PtreclsOverrideLdDeptInd = ptreclsrow
				.getStr("PTRECLS_OVERRIDE_LD_DEPT_IND");
		this.PtreclsBudgBasis = ptreclsrow.getNumber("PTRECLS_BUDG_BASIS");
		this.PtreclsAnnBasis = ptreclsrow.getNumber("PTRECLS_ANN_BASIS");
		this.PtreclsCreateJfteInd = ptreclsrow
				.getStr("PTRECLS_CREATE_JFTE_IND");
		this.PtreclsLeavReptMethod = ptreclsrow
				.getStr("PTRECLS_LEAV_REPT_METHOD");
		this.PtreclsPictCodeLeavRept = ptreclsrow
				.getStr("PTRECLS_PICT_CODE_LEAV_REPT");
		this.PtreclsClockInOutInd = ptreclsrow
				.getStr("PTRECLS_CLOCK_IN_OUT_IND");
		this.PtreclsSurrogateId = ptreclsrow.getNumber("PTRECLS_SURROGATE_ID");
		this.PtreclsVersion = ptreclsrow.getNumber("PTRECLS_VERSION");
		this.PtreclsUserId = ptreclsrow.getStr("PTRECLS_USER_ID");
		this.PtreclsDataOrigin = ptreclsrow.getStr("PTRECLS_DATA_ORIGIN");
		this.PtreclsVpdiCode = ptreclsrow.getStr("PTRECLS_VPDI_CODE");
	}
}

