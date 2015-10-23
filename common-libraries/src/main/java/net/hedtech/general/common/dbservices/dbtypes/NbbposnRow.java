package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;


@DbRecordType(id = "NbbposnRow", dataSourceName = "NBBPOSN", rowType = true)
public class NbbposnRow {
	@DbRecordField(dataSourceName = "NBBPOSN_POSN")
	public NString NbbposnPosn;
	@DbRecordField(dataSourceName = "NBBPOSN_STATUS")
	public NString NbbposnStatus;
	@DbRecordField(dataSourceName = "NBBPOSN_TITLE")
	public NString NbbposnTitle;
	@DbRecordField(dataSourceName = "NBBPOSN_PLOC_CODE")
	public NString NbbposnPlocCode;
	@DbRecordField(dataSourceName = "NBBPOSN_BEGIN_DATE")
	public NDate NbbposnBeginDate;
	@DbRecordField(dataSourceName = "NBBPOSN_END_DATE")
	public NDate NbbposnEndDate;
	@DbRecordField(dataSourceName = "NBBPOSN_TYPE")
	public NString NbbposnType;
	@DbRecordField(dataSourceName = "NBBPOSN_PCLS_CODE")
	public NString NbbposnPclsCode;
	@DbRecordField(dataSourceName = "NBBPOSN_ECLS_CODE")
	public NString NbbposnEclsCode;
	@DbRecordField(dataSourceName = "NBBPOSN_POSN_REPORTS")
	public NString NbbposnPosnReports;
	@DbRecordField(dataSourceName = "NBBPOSN_AUTH_NUMBER")
	public NString NbbposnAuthNumber;
	@DbRecordField(dataSourceName = "NBBPOSN_TABLE")
	public NString NbbposnTable;
	@DbRecordField(dataSourceName = "NBBPOSN_GRADE")
	public NString NbbposnGrade;
	@DbRecordField(dataSourceName = "NBBPOSN_STEP")
	public NNumber NbbposnStep;
	@DbRecordField(dataSourceName = "NBBPOSN_APPT_PCT")
	public NNumber NbbposnApptPct;
	@DbRecordField(dataSourceName = "NBBPOSN_CIPC_CODE")
	public NString NbbposnCipcCode;
	@DbRecordField(dataSourceName = "NBBPOSN_ROLL_IND")
	public NString NbbposnRollInd;
	@DbRecordField(dataSourceName = "NBBPOSN_COAS_CODE")
	public NString NbbposnCoasCode;
	@DbRecordField(dataSourceName = "NBBPOSN_ACTIVITY_DATE")
	public NDate NbbposnActivityDate;
	@DbRecordField(dataSourceName = "NBBPOSN_SGRP_CODE")
	public NString NbbposnSgrpCode;
	@DbRecordField(dataSourceName = "NBBPOSN_PGRP_CODE")
	public NString NbbposnPgrpCode;
	@DbRecordField(dataSourceName = "NBBPOSN_WKSH_CODE")
	public NString NbbposnWkshCode;
	@DbRecordField(dataSourceName = "NBBPOSN_PREMIUM_ROLL_IND")
	public NString NbbposnPremiumRollInd;
	@DbRecordField(dataSourceName = "NBBPOSN_PFOC_CODE")
	public NString NbbposnPfocCode;
	@DbRecordField(dataSourceName = "NBBPOSN_PNOC_CODE")
	public NString NbbposnPnocCode;
	@DbRecordField(dataSourceName = "NBBPOSN_DOTT_CODE")
	public NString NbbposnDottCode;
	@DbRecordField(dataSourceName = "NBBPOSN_CHANGE_DATE_TIME")
	public NDate NbbposnChangeDateTime;
	@DbRecordField(dataSourceName = "NBBPOSN_CALIF_TYPE")
	public NString NbbposnCalifType;
	@DbRecordField(dataSourceName = "NBBPOSN_EXEMPT_IND")
	public NString NbbposnExemptInd;
	@DbRecordField(dataSourceName = "NBBPOSN_JBLN_CODE")
	public NString NbbposnJblnCode;
	@DbRecordField(dataSourceName = "NBBPOSN_BARG_CODE")
	public NString NbbposnBargCode;
	@DbRecordField(dataSourceName = "NBBPOSN_PROBATION_UNITS")
	public NNumber NbbposnProbationUnits;
	@DbRecordField(dataSourceName = "NBBPOSN_COMMENT")
	public NString NbbposnComment;
	@DbRecordField(dataSourceName = "NBBPOSN_ACCRUE_SENIORITY_IND")
	public NString NbbposnAccrueSeniorityInd;
	@DbRecordField(dataSourceName = "NBBPOSN_JOBP_CODE")
	public NString NbbposnJobpCode;
	@DbRecordField(dataSourceName = "NBBPOSN_BPRO_CODE")
	public NString NbbposnBproCode;
	@DbRecordField(dataSourceName = "NBBPOSN_BUDGET_TYPE")
	public NString NbbposnBudgetType;
	@DbRecordField(dataSourceName = "NBBPOSN_SURROGATE_ID")
	public NNumber NbbposnSurrogateId;
	@DbRecordField(dataSourceName = "NBBPOSN_VERSION")
	public NNumber NbbposnVersion;
	@DbRecordField(dataSourceName = "NBBPOSN_USER_ID")
	public NString NbbposnUserId;
	@DbRecordField(dataSourceName = "NBBPOSN_DATA_ORIGIN")
	public NString NbbposnDataOrigin;
	@DbRecordField(dataSourceName = "NBBPOSN_VPDI_CODE")
	public NString NbbposnVpdiCode;
	@DbRecordField(dataSourceName = "NBBPOSN_ESOC_CODE")
	public NString NbbposnEsocCode;
	@DbRecordField(dataSourceName = "NBBPOSN_ECIP_CODE")
	public NString NbbposnEcipCode;

	private TableRow nbbposnrow;

	public NbbposnRow(TableRow row) {

		this.nbbposnrow = row;
		this.NbbposnPosn = nbbposnrow.getStr("NBBPOSN_POSN");
		this.NbbposnStatus = nbbposnrow.getStr("NBBPOSN_STATUS");
		this.NbbposnTitle = nbbposnrow.getStr("NBBPOSN_TITLE");
		this.NbbposnPlocCode = nbbposnrow.getStr("NBBPOSN_PLOC_CODE");
		this.NbbposnBeginDate = nbbposnrow.getDate("NBBPOSN_BEGIN_DATE");
		this.NbbposnEndDate = nbbposnrow.getDate("NBBPOSN_END_DATE");
		this.NbbposnType = nbbposnrow.getStr("NBBPOSN_TYPE");
		this.NbbposnPclsCode = nbbposnrow.getStr("NBBPOSN_PCLS_CODE");
		this.NbbposnEclsCode = nbbposnrow.getStr("NBBPOSN_ECLS_CODE");
		this.NbbposnPosnReports = nbbposnrow.getStr("NBBPOSN_POSN_REPORTS");
		this.NbbposnAuthNumber = nbbposnrow.getStr("NBBPOSN_AUTH_NUMBER");
		this.NbbposnTable = nbbposnrow.getStr("NBBPOSN_TABLE");
		this.NbbposnGrade = nbbposnrow.getStr("NBBPOSN_GRADE");
		this.NbbposnStep = nbbposnrow.getNumber("NBBPOSN_STEP");
		this.NbbposnApptPct = nbbposnrow.getNumber("NBBPOSN_APPT_PCT");
		this.NbbposnCipcCode = nbbposnrow.getStr("NBBPOSN_CIPC_CODE");
		this.NbbposnRollInd = nbbposnrow.getStr("NBBPOSN_ROLL_IND");
		this.NbbposnCoasCode = nbbposnrow.getStr("NBBPOSN_COAS_CODE");
		this.NbbposnActivityDate = nbbposnrow.getDate("NBBPOSN_ACTIVITY_DATE");
		this.NbbposnSgrpCode = nbbposnrow.getStr("NBBPOSN_SGRP_CODE");
		this.NbbposnPgrpCode = nbbposnrow.getStr("NBBPOSN_PGRP_CODE");
		this.NbbposnWkshCode = nbbposnrow.getStr("NBBPOSN_WKSH_CODE");
		this.NbbposnPremiumRollInd = nbbposnrow
				.getStr("NBBPOSN_PREMIUM_ROLL_IND");
		this.NbbposnPfocCode = nbbposnrow.getStr("NBBPOSN_PFOC_CODE");
		this.NbbposnPnocCode = nbbposnrow.getStr("NBBPOSN_PNOC_CODE");
		this.NbbposnDottCode = nbbposnrow.getStr("NBBPOSN_DOTT_CODE");
		this.NbbposnChangeDateTime = nbbposnrow
				.getDate("NBBPOSN_CHANGE_DATE_TIME");
		this.NbbposnCalifType = nbbposnrow.getStr("NBBPOSN_CALIF_TYPE");
		this.NbbposnExemptInd = nbbposnrow.getStr("NBBPOSN_EXEMPT_IND");
		this.NbbposnJblnCode = nbbposnrow.getStr("NBBPOSN_JBLN_CODE");
		this.NbbposnBargCode = nbbposnrow.getStr("NBBPOSN_BARG_CODE");
		this.NbbposnProbationUnits = nbbposnrow
				.getNumber("NBBPOSN_PROBATION_UNITS");
		this.NbbposnComment = nbbposnrow.getStr("NBBPOSN_COMMENT");
		this.NbbposnAccrueSeniorityInd = nbbposnrow
				.getStr("NBBPOSN_ACCRUE_SENIORITY_IND");
		this.NbbposnJobpCode = nbbposnrow.getStr("NBBPOSN_JOBP_CODE");
		this.NbbposnBproCode = nbbposnrow.getStr("NBBPOSN_BPRO_CODE");
		this.NbbposnBudgetType = nbbposnrow.getStr("NBBPOSN_BUDGET_TYPE");
		this.NbbposnSurrogateId = nbbposnrow.getNumber("NBBPOSN_SURROGATE_ID");
		this.NbbposnVersion = nbbposnrow.getNumber("NBBPOSN_VERSION");
		this.NbbposnUserId = nbbposnrow.getStr("NBBPOSN_USER_ID");
		this.NbbposnDataOrigin = nbbposnrow.getStr("NBBPOSN_DATA_ORIGIN");
		this.NbbposnVpdiCode = nbbposnrow.getStr("NBBPOSN_VPDI_CODE");
		this.NbbposnEsocCode = nbbposnrow.getStr("NBBPOSN_ESOC_CODE");
		this.NbbposnEcipCode = nbbposnrow.getStr("NBBPOSN_ECIP_CODE");
	}

}
