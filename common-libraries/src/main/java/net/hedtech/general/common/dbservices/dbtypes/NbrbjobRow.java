package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id="NbrbjobRow",     dataSourceName="NBRBJOB", rowType=true)
public class NbrbjobRow
{
@DbRecordField(dataSourceName="NBRBJOB_PIDM")
public NNumber NbrbjobPidm;
@DbRecordField(dataSourceName="NBRBJOB_POSN")
public NString NbrbjobPosn;
@DbRecordField(dataSourceName="NBRBJOB_SUFF")
public NString NbrbjobSuff;
@DbRecordField(dataSourceName="NBRBJOB_BEGIN_DATE")
public NDate NbrbjobBeginDate;
@DbRecordField(dataSourceName="NBRBJOB_END_DATE")
public NDate NbrbjobEndDate;
@DbRecordField(dataSourceName="NBRBJOB_DEFER_BAL")
public NNumber NbrbjobDeferBal;
@DbRecordField(dataSourceName="NBRBJOB_CONTRACT_TYPE")
public NString NbrbjobContractType;
@DbRecordField(dataSourceName="NBRBJOB_SALARY_ENCUMBRANCE")
public NNumber NbrbjobSalaryEncumbrance;
@DbRecordField(dataSourceName="NBRBJOB_CONTRACT_BEGIN_DATE")
public NDate NbrbjobContractBeginDate;
@DbRecordField(dataSourceName="NBRBJOB_CONTRACT_END_DATE")
public NDate NbrbjobContractEndDate;
@DbRecordField(dataSourceName="NBRBJOB_TOTAL_CONTRACT_HRS")
public NNumber NbrbjobTotalContractHrs;
@DbRecordField(dataSourceName="NBRBJOB_TOTAL_ENCUMBRANCE_HRS")
public NNumber NbrbjobTotalEncumbranceHrs;
@DbRecordField(dataSourceName="NBRBJOB_STEP_INCR_MON")
public NString NbrbjobStepIncrMon;
@DbRecordField(dataSourceName="NBRBJOB_STEP_INCR_DAY")
public NString NbrbjobStepIncrDay;
@DbRecordField(dataSourceName="NBRBJOB_COAS_CODE")
public NString NbrbjobCoasCode;
@DbRecordField(dataSourceName="NBRBJOB_ACTIVITY_DATE")
public NDate NbrbjobActivityDate;
@DbRecordField(dataSourceName="NBRBJOB_ACCRUE_LEAVE_IND")
public NString NbrbjobAccrueLeaveInd;
@DbRecordField(dataSourceName="NBRBJOB_CIVIL_SERVICE_IND")
public NString NbrbjobCivilServiceInd;
@DbRecordField(dataSourceName="NBRBJOB_ENCUMBRANCE_CHANGE_IND")
public NString NbrbjobEncumbranceChangeInd;
@DbRecordField(dataSourceName="NBRBJOB_FRINGE_ENCUMBRANCE")
public NNumber NbrbjobFringeEncumbrance;
@DbRecordField(dataSourceName="NBRBJOB_IPEDS_REPT_IND")
public NString NbrbjobIpedsReptInd;
@DbRecordField(dataSourceName="NBRBJOB_FACL_STATSCAN_REPT_IND")
public NString NbrbjobFaclStatscanReptInd;
@DbRecordField(dataSourceName="NBRBJOB_PROBATION_BEGIN_DATE")
public NDate NbrbjobProbationBeginDate;
@DbRecordField(dataSourceName="NBRBJOB_PROBATION_END_DATE")
public NDate NbrbjobProbationEndDate;
@DbRecordField(dataSourceName="NBRBJOB_PROBATION_UNITS")
public NNumber NbrbjobProbationUnits;
@DbRecordField(dataSourceName="NBRBJOB_ELIGIBLE_DATE")
public NDate NbrbjobEligibleDate;
@DbRecordField(dataSourceName="NBRBJOB_USER_ID")
public NString NbrbjobUserId;
@DbRecordField(dataSourceName="NBRBJOB_DATA_ORIGIN")
public NString NbrbjobDataOrigin;
@DbRecordField(dataSourceName="NBRBJOB_FUTURE_SALARY_ENC")
public NNumber NbrbjobFutureSalaryEnc;
@DbRecordField(dataSourceName="NBRBJOB_FUTURE_FRINGE_ENC")
public NNumber NbrbjobFutureFringeEnc;
@DbRecordField(dataSourceName="NBRBJOB_SURROGATE_ID")
public NNumber NbrbjobSurrogateId;
@DbRecordField(dataSourceName="NBRBJOB_VERSION")
public NNumber NbrbjobVersion;
@DbRecordField(dataSourceName="NBRBJOB_VPDI_CODE")
public NString NbrbjobVpdiCode;
@DbRecordField(dataSourceName="NBRBJOB_WEEK_REF")
public NNumber NbrbjobWeekRef;
private TableRow nbrbjobrow;
public NbrbjobRow(){
super();
}
public NbrbjobRow(TableRow row) {
this.nbrbjobrow = row;
this.NbrbjobPidm = nbrbjobrow.getNumber("NBRBJOB_PIDM");
this.NbrbjobPosn = nbrbjobrow.getStr("NBRBJOB_POSN");
this.NbrbjobSuff = nbrbjobrow.getStr("NBRBJOB_SUFF");
this.NbrbjobBeginDate = nbrbjobrow.getDate("NBRBJOB_BEGIN_DATE");
this.NbrbjobEndDate = nbrbjobrow.getDate("NBRBJOB_END_DATE");
this.NbrbjobDeferBal = nbrbjobrow.getNumber("NBRBJOB_DEFER_BAL");
this.NbrbjobContractType = nbrbjobrow.getStr("NBRBJOB_CONTRACT_TYPE");
this.NbrbjobSalaryEncumbrance = nbrbjobrow.getNumber("NBRBJOB_SALARY_ENCUMBRANCE");
this.NbrbjobContractBeginDate = nbrbjobrow.getDate("NBRBJOB_CONTRACT_BEGIN_DATE");
this.NbrbjobContractEndDate = nbrbjobrow.getDate("NBRBJOB_CONTRACT_END_DATE");
this.NbrbjobTotalContractHrs = nbrbjobrow.getNumber("NBRBJOB_TOTAL_CONTRACT_HRS");
this.NbrbjobTotalEncumbranceHrs = nbrbjobrow.getNumber("NBRBJOB_TOTAL_ENCUMBRANCE_HRS");
this.NbrbjobStepIncrMon = nbrbjobrow.getStr("NBRBJOB_STEP_INCR_MON");
this.NbrbjobStepIncrDay = nbrbjobrow.getStr("NBRBJOB_STEP_INCR_DAY");
this.NbrbjobCoasCode = nbrbjobrow.getStr("NBRBJOB_COAS_CODE");
this.NbrbjobActivityDate = nbrbjobrow.getDate("NBRBJOB_ACTIVITY_DATE");
this.NbrbjobAccrueLeaveInd = nbrbjobrow.getStr("NBRBJOB_ACCRUE_LEAVE_IND");
this.NbrbjobCivilServiceInd = nbrbjobrow.getStr("NBRBJOB_CIVIL_SERVICE_IND");
this.NbrbjobEncumbranceChangeInd = nbrbjobrow.getStr("NBRBJOB_ENCUMBRANCE_CHANGE_IND");
this.NbrbjobFringeEncumbrance = nbrbjobrow.getNumber("NBRBJOB_FRINGE_ENCUMBRANCE");
this.NbrbjobIpedsReptInd = nbrbjobrow.getStr("NBRBJOB_IPEDS_REPT_IND");
this.NbrbjobFaclStatscanReptInd = nbrbjobrow.getStr("NBRBJOB_FACL_STATSCAN_REPT_IND");
this.NbrbjobProbationBeginDate = nbrbjobrow.getDate("NBRBJOB_PROBATION_BEGIN_DATE");
this.NbrbjobProbationEndDate = nbrbjobrow.getDate("NBRBJOB_PROBATION_END_DATE");
this.NbrbjobProbationUnits = nbrbjobrow.getNumber("NBRBJOB_PROBATION_UNITS");
this.NbrbjobEligibleDate = nbrbjobrow.getDate("NBRBJOB_ELIGIBLE_DATE");
this.NbrbjobUserId = nbrbjobrow.getStr("NBRBJOB_USER_ID");
this.NbrbjobDataOrigin = nbrbjobrow.getStr("NBRBJOB_DATA_ORIGIN");
this.NbrbjobFutureSalaryEnc = nbrbjobrow.getNumber("NBRBJOB_FUTURE_SALARY_ENC");
this.NbrbjobFutureFringeEnc = nbrbjobrow.getNumber("NBRBJOB_FUTURE_FRINGE_ENC");
this.NbrbjobSurrogateId = nbrbjobrow.getNumber("NBRBJOB_SURROGATE_ID");
this.NbrbjobVersion = nbrbjobrow.getNumber("NBRBJOB_VERSION");
this.NbrbjobVpdiCode = nbrbjobrow.getStr("NBRBJOB_VPDI_CODE");
this.NbrbjobWeekRef = nbrbjobrow.getNumber("NBRBJOB_WEEK_REF");
}
}

