package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.NpJobEarnings.JobEarningsTabRow;
import net.hedtech.general.common.dbservices.NpJobLabor.JobLaborTabRow;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NpJobAssignment {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_ASSIGNMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_ASSIGNMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryByDate(NNumber pPidm,NString pPosn,NString pSuff,NDate pQueryDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_ASSIGNMENT.F_QUERY_BY_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_QUERY_DATE", pQueryDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pJobBaseRowid,NString pJobDetailRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_ASSIGNMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_JOB_BASE_ROWID", pJobBaseRowid);
			cmd.addParameter("@P_JOB_DETAIL_ROWID", pJobDetailRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryNext(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_ASSIGNMENT.F_QUERY_NEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static Cursor fQueryOne(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_ASSIGNMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pPosn,NString pSuff,NDate pBeginDate,NString pContractType,NNumber pSalaryEncumbrance,NDate pContractBeginDate,NDate pContractEndDate,NNumber pTotalContractHrs,NNumber pTotalEncumbranceHrs,NString pStepIncrMon,NString pStepIncrDay,NString pAccrueLeaveInd,NString pCivilServiceInd,NString pIpedsReptInd,NString pFaclStatscanReptInd,NDate pProbationBeginDate,NDate pProbationEndDate,NNumber pProbationUnits,NDate pEligibleDate,NString pStatus,NString pDesc,NString pEclsCode,NString pPictCode,NString pCoasCodeTs,NString pOrgnCodeTs,NString pSalTable,NString pSalGrade,NNumber pSalStep,NNumber pApptPct,NNumber pFte,NNumber pHrsDay,NNumber pHrsPay,NString pShift,NNumber pRegRate,NNumber pAssgnSalary,NNumber pFactor,NNumber pAnnSalary,NNumber pPays,NString pJcreCode,NString pSgrpCode,NString pEmprCode,NString pLgcdCode,NString pLocnCode,NString pSchlCode,NNumber pSupervisorPidm,NString pSupervisorPosn,NString pSupervisorSuff,NString pWkcpCode,NString pJblnCode,NDate pPersChgDate,NString pPcatCode,NString pDfprCode,NNumber pEncumbranceHrs,NString pContractNo,NString pStrsAssnCode,NString pStrsPayCode,NString pPersPayCode,NString pTimeEntryMethod,NString pTimeEntryType,NString pTimeInOutInd,NString pLcatCode,NString pLeavReptMethod,NString pPictCodeLeavRept,NString pUserId,NString pDataOrigin,NpJobEarnings.JobEarningsTabRow pJobEarningsTable,NpJobLabor.JobLaborTabRow pJobLaborTable,NString pComment,Ref<NString> pBaseRowidOut,Ref<NString> pDetailRowidOut,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_ASSIGNMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_CONTRACT_TYPE", pContractType);
			cmd.addParameter("@P_SALARY_ENCUMBRANCE", pSalaryEncumbrance);
			cmd.addParameter("@P_CONTRACT_BEGIN_DATE", pContractBeginDate);
			cmd.addParameter("@P_CONTRACT_END_DATE", pContractEndDate);
			cmd.addParameter("@P_TOTAL_CONTRACT_HRS", pTotalContractHrs);
			cmd.addParameter("@P_TOTAL_ENCUMBRANCE_HRS", pTotalEncumbranceHrs);
			cmd.addParameter("@P_STEP_INCR_MON", pStepIncrMon);
			cmd.addParameter("@P_STEP_INCR_DAY", pStepIncrDay);
			cmd.addParameter("@P_ACCRUE_LEAVE_IND", pAccrueLeaveInd);
			cmd.addParameter("@P_CIVIL_SERVICE_IND", pCivilServiceInd);
			cmd.addParameter("@P_IPEDS_REPT_IND", pIpedsReptInd);
			cmd.addParameter("@P_FACL_STATSCAN_REPT_IND", pFaclStatscanReptInd);
			cmd.addParameter("@P_PROBATION_BEGIN_DATE", pProbationBeginDate);
			cmd.addParameter("@P_PROBATION_END_DATE", pProbationEndDate);
			cmd.addParameter("@P_PROBATION_UNITS", pProbationUnits);
			cmd.addParameter("@P_ELIGIBLE_DATE", pEligibleDate);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_COAS_CODE_TS", pCoasCodeTs);
			cmd.addParameter("@P_ORGN_CODE_TS", pOrgnCodeTs);
			cmd.addParameter("@P_SAL_TABLE", pSalTable);
			cmd.addParameter("@P_SAL_GRADE", pSalGrade);
			cmd.addParameter("@P_SAL_STEP", pSalStep);
			cmd.addParameter("@P_APPT_PCT", pApptPct);
			cmd.addParameter("@P_FTE", pFte);
			cmd.addParameter("@P_HRS_DAY", pHrsDay);
			cmd.addParameter("@P_HRS_PAY", pHrsPay);
			cmd.addParameter("@P_SHIFT", pShift);
			cmd.addParameter("@P_REG_RATE", pRegRate);
			cmd.addParameter("@P_ASSGN_SALARY", pAssgnSalary);
			cmd.addParameter("@P_FACTOR", pFactor);
			cmd.addParameter("@P_ANN_SALARY", pAnnSalary);
			cmd.addParameter("@P_PAYS", pPays);
			cmd.addParameter("@P_JCRE_CODE", pJcreCode);
			cmd.addParameter("@P_SGRP_CODE", pSgrpCode);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_LGCD_CODE", pLgcdCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_SCHL_CODE", pSchlCode);
			cmd.addParameter("@P_SUPERVISOR_PIDM", pSupervisorPidm);
			cmd.addParameter("@P_SUPERVISOR_POSN", pSupervisorPosn);
			cmd.addParameter("@P_SUPERVISOR_SUFF", pSupervisorSuff);
			cmd.addParameter("@P_WKCP_CODE", pWkcpCode);
			cmd.addParameter("@P_JBLN_CODE", pJblnCode);
			cmd.addParameter("@P_PERS_CHG_DATE", pPersChgDate);
			cmd.addParameter("@P_PCAT_CODE", pPcatCode);
			cmd.addParameter("@P_DFPR_CODE", pDfprCode);
			cmd.addParameter("@P_ENCUMBRANCE_HRS", pEncumbranceHrs);
			cmd.addParameter("@P_CONTRACT_NO", pContractNo);
			cmd.addParameter("@P_STRS_ASSN_CODE", pStrsAssnCode);
			cmd.addParameter("@P_STRS_PAY_CODE", pStrsPayCode);
			cmd.addParameter("@P_PERS_PAY_CODE", pPersPayCode);
			cmd.addParameter("@P_TIME_ENTRY_METHOD", pTimeEntryMethod);
			cmd.addParameter("@P_TIME_ENTRY_TYPE", pTimeEntryType);
			cmd.addParameter("@P_TIME_IN_OUT_IND", pTimeInOutInd);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_LEAV_REPT_METHOD", pLeavReptMethod);
			cmd.addParameter("@P_PICT_CODE_LEAV_REPT", pPictCodeLeavRept);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			
			/******************************************************************************************************
			cmd.addParameter(DbTypes.getCollectionType("PAR_TABLE_ROOT", parTableRoot.val, TableRoot.class, true));
			cmd.addParameter(DbTypes.getTableType("P_JOB_EARNINGS_TABLE", "", pJobEarningsTable, object.class));
			cmd.addParameter(DbTypes.getTableType("P_JOB_LABOR_TABLE", "", pJobLaborTable, object.class));
			******************************************************************************************************/
			//ADICIONADO
			cmd.addParameter(DbTypes.getCollectionType("P_JOB_EARNINGS_TABLE", pJobEarningsTable, JobEarningsTabRow.class, false));
			cmd.addParameter(DbTypes.getCollectionType("P_JOB_LABOR_TABLE", pJobLaborTable, JobLaborTabRow.class, false));
			
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_BASE_ROWID_OUT", NString.class);
			cmd.addParameter("@P_DETAIL_ROWID_OUT", NString.class);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pBaseRowidOut.val = cmd.getParameterValue("@P_BASE_ROWID_OUT", NString.class);
			pDetailRowidOut.val = cmd.getParameterValue("@P_DETAIL_ROWID_OUT", NString.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pUserId,NString pDataOrigin,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_ASSIGNMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NNumber pDeferBal,NString pContractType,NNumber pSalaryEncumbrance,NDate pContractBeginDate,NDate pContractEndDate,NNumber pTotalContractHrs,NNumber pTotalEncumbranceHrs,NString pStepIncrMon,NString pStepIncrDay,NString pAccrueLeaveInd,NString pCivilServiceInd,NString pIpedsReptInd,NString pFaclStatscanReptInd,NDate pProbationBeginDate,NDate pProbationEndDate,NNumber pProbationUnits,NDate pEligibleDate,NString pStatus,NString pDesc,NString pEclsCode,NString pPictCode,NString pCoasCodeTs,NString pOrgnCodeTs,NString pSalTable,NString pSalGrade,NNumber pSalStep,NNumber pApptPct,NNumber pFte,NNumber pHrsDay,NNumber pHrsPay,NString pShift,NNumber pRegRate,NNumber pAssgnSalary,NNumber pFactor,NNumber pAnnSalary,NNumber pPays,NString pJcreCode,NString pSgrpCode,NString pEmprCode,NString pLgcdCode,NString pLocnCode,NString pSchlCode,NNumber pSupervisorPidm,NString pSupervisorPosn,NString pSupervisorSuff,NString pWkcpCode,NString pJblnCode,NDate pPersChgDate,NString pPcatCode,NString pDfprCode,NNumber pEncumbranceHrs,NString pContractNo,NString pStrsAssnCode,NString pStrsPayCode,NString pPersPayCode,NString pTimeEntryMethod,NString pTimeEntryType,NString pTimeInOutInd,NString pLcatCode,NString pLeavReptMethod,NString pPictCodeLeavRept,NString pUserId,NString pDataOrigin,NString pComment,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_ASSIGNMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_DEFER_BAL", pDeferBal);
			cmd.addParameter("@P_CONTRACT_TYPE", pContractType);
			cmd.addParameter("@P_SALARY_ENCUMBRANCE", pSalaryEncumbrance);
			cmd.addParameter("@P_CONTRACT_BEGIN_DATE", pContractBeginDate);
			cmd.addParameter("@P_CONTRACT_END_DATE", pContractEndDate);
			cmd.addParameter("@P_TOTAL_CONTRACT_HRS", pTotalContractHrs);
			cmd.addParameter("@P_TOTAL_ENCUMBRANCE_HRS", pTotalEncumbranceHrs);
			cmd.addParameter("@P_STEP_INCR_MON", pStepIncrMon);
			cmd.addParameter("@P_STEP_INCR_DAY", pStepIncrDay);
			cmd.addParameter("@P_ACCRUE_LEAVE_IND", pAccrueLeaveInd);
			cmd.addParameter("@P_CIVIL_SERVICE_IND", pCivilServiceInd);
			cmd.addParameter("@P_IPEDS_REPT_IND", pIpedsReptInd);
			cmd.addParameter("@P_FACL_STATSCAN_REPT_IND", pFaclStatscanReptInd);
			cmd.addParameter("@P_PROBATION_BEGIN_DATE", pProbationBeginDate);
			cmd.addParameter("@P_PROBATION_END_DATE", pProbationEndDate);
			cmd.addParameter("@P_PROBATION_UNITS", pProbationUnits);
			cmd.addParameter("@P_ELIGIBLE_DATE", pEligibleDate);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_COAS_CODE_TS", pCoasCodeTs);
			cmd.addParameter("@P_ORGN_CODE_TS", pOrgnCodeTs);
			cmd.addParameter("@P_SAL_TABLE", pSalTable);
			cmd.addParameter("@P_SAL_GRADE", pSalGrade);
			cmd.addParameter("@P_SAL_STEP", pSalStep);
			cmd.addParameter("@P_APPT_PCT", pApptPct);
			cmd.addParameter("@P_FTE", pFte);
			cmd.addParameter("@P_HRS_DAY", pHrsDay);
			cmd.addParameter("@P_HRS_PAY", pHrsPay);
			cmd.addParameter("@P_SHIFT", pShift);
			cmd.addParameter("@P_REG_RATE", pRegRate);
			cmd.addParameter("@P_ASSGN_SALARY", pAssgnSalary);
			cmd.addParameter("@P_FACTOR", pFactor);
			cmd.addParameter("@P_ANN_SALARY", pAnnSalary);
			cmd.addParameter("@P_PAYS", pPays);
			cmd.addParameter("@P_JCRE_CODE", pJcreCode);
			cmd.addParameter("@P_SGRP_CODE", pSgrpCode);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_LGCD_CODE", pLgcdCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_SCHL_CODE", pSchlCode);
			cmd.addParameter("@P_SUPERVISOR_PIDM", pSupervisorPidm);
			cmd.addParameter("@P_SUPERVISOR_POSN", pSupervisorPosn);
			cmd.addParameter("@P_SUPERVISOR_SUFF", pSupervisorSuff);
			cmd.addParameter("@P_WKCP_CODE", pWkcpCode);
			cmd.addParameter("@P_JBLN_CODE", pJblnCode);
			cmd.addParameter("@P_PERS_CHG_DATE", pPersChgDate);
			cmd.addParameter("@P_PCAT_CODE", pPcatCode);
			cmd.addParameter("@P_DFPR_CODE", pDfprCode);
			cmd.addParameter("@P_ENCUMBRANCE_HRS", pEncumbranceHrs);
			cmd.addParameter("@P_CONTRACT_NO", pContractNo);
			cmd.addParameter("@P_STRS_ASSN_CODE", pStrsAssnCode);
			cmd.addParameter("@P_STRS_PAY_CODE", pStrsPayCode);
			cmd.addParameter("@P_PERS_PAY_CODE", pPersPayCode);
			cmd.addParameter("@P_TIME_ENTRY_METHOD", pTimeEntryMethod);
			cmd.addParameter("@P_TIME_ENTRY_TYPE", pTimeEntryType);
			cmd.addParameter("@P_TIME_IN_OUT_IND", pTimeInOutInd);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_LEAV_REPT_METHOD", pLeavReptMethod);
			cmd.addParameter("@P_PICT_CODE_LEAV_REPT", pPictCodeLeavRept);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class, true);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pUpdateSalaryEncumbrance(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NNumber pSalaryEncumbrance,NString pUserId,NString pDataOrigin,NString pComment,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_ASSIGNMENT.P_UPDATE_SALARY_ENCUMBRANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SALARY_ENCUMBRANCE", pSalaryEncumbrance);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="JobAssignmentRecRow", dataSourceName="JOB_ASSIGNMENT_REC")
	public static class JobAssignmentRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_SUFF")
		public NString RSuff;
		@DbRecordField(dataSourceName="R_BEGIN_DATE")
		public NDate RBeginDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_DEFER_BAL")
		public NNumber RDeferBal;
		@DbRecordField(dataSourceName="R_CONTRACT_TYPE")
		public NString RContractType;
		@DbRecordField(dataSourceName="R_SALARY_ENCUMBRANCE")
		public NNumber RSalaryEncumbrance;
		@DbRecordField(dataSourceName="R_CONTRACT_BEGIN_DATE")
		public NDate RContractBeginDate;
		@DbRecordField(dataSourceName="R_CONTRACT_END_DATE")
		public NDate RContractEndDate;
		@DbRecordField(dataSourceName="R_TOTAL_CONTRACT_HRS")
		public NNumber RTotalContractHrs;
		@DbRecordField(dataSourceName="R_TOTAL_ENCUMBRANCE_HRS")
		public NNumber RTotalEncumbranceHrs;
		@DbRecordField(dataSourceName="R_STEP_INCR_MON")
		public NString RStepIncrMon;
		@DbRecordField(dataSourceName="R_STEP_INCR_DAY")
		public NString RStepIncrDay;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_ACCRUE_LEAVE_IND")
		public NString RAccrueLeaveInd;
		@DbRecordField(dataSourceName="R_CIVIL_SERVICE_IND")
		public NString RCivilServiceInd;
		@DbRecordField(dataSourceName="R_ENCUMBRANCE_CHANGE_IND")
		public NString REncumbranceChangeInd;
		@DbRecordField(dataSourceName="R_FRINGE_ENCUMBRANCE")
		public NNumber RFringeEncumbrance;
		@DbRecordField(dataSourceName="R_IPEDS_REPT_IND")
		public NString RIpedsReptInd;
		@DbRecordField(dataSourceName="R_FACL_STATSCAN_REPT_IND")
		public NString RFaclStatscanReptInd;
		@DbRecordField(dataSourceName="R_PROBATION_BEGIN_DATE")
		public NDate RProbationBeginDate;
		@DbRecordField(dataSourceName="R_PROBATION_END_DATE")
		public NDate RProbationEndDate;
		@DbRecordField(dataSourceName="R_PROBATION_UNITS")
		public NNumber RProbationUnits;
		@DbRecordField(dataSourceName="R_ELIGIBLE_DATE")
		public NDate REligibleDate;
		@DbRecordField(dataSourceName="R_EFFECTIVE_DATE")
		public NDate REffectiveDate;
		@DbRecordField(dataSourceName="R_STATUS")
		public NString RStatus;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_ECLS_CODE")
		public NString REclsCode;
		@DbRecordField(dataSourceName="R_PICT_CODE")
		public NString RPictCode;
		@DbRecordField(dataSourceName="R_COAS_CODE_TS")
		public NString RCoasCodeTs;
		@DbRecordField(dataSourceName="R_ORGN_CODE_TS")
		public NString ROrgnCodeTs;
		@DbRecordField(dataSourceName="R_SAL_TABLE")
		public NString RSalTable;
		@DbRecordField(dataSourceName="R_SAL_GRADE")
		public NString RSalGrade;
		@DbRecordField(dataSourceName="R_SAL_STEP")
		public NNumber RSalStep;
		@DbRecordField(dataSourceName="R_APPT_PCT")
		public NNumber RApptPct;
		@DbRecordField(dataSourceName="R_FTE")
		public NNumber RFte;
		@DbRecordField(dataSourceName="R_HRS_DAY")
		public NNumber RHrsDay;
		@DbRecordField(dataSourceName="R_HRS_PAY")
		public NNumber RHrsPay;
		@DbRecordField(dataSourceName="R_SHIFT")
		public NString RShift;
		@DbRecordField(dataSourceName="R_REG_RATE")
		public NNumber RRegRate;
		@DbRecordField(dataSourceName="R_ASSGN_SALARY")
		public NNumber RAssgnSalary;
		@DbRecordField(dataSourceName="R_FACTOR")
		public NNumber RFactor;
		@DbRecordField(dataSourceName="R_ANN_SALARY")
		public NNumber RAnnSalary;
		@DbRecordField(dataSourceName="R_PER_PAY_SALARY")
		public NNumber RPerPaySalary;
		@DbRecordField(dataSourceName="R_PAYS")
		public NNumber RPays;
		@DbRecordField(dataSourceName="R_PER_PAY_DEFER_AMT")
		public NNumber RPerPayDeferAmt;
		@DbRecordField(dataSourceName="R_JCRE_CODE")
		public NString RJcreCode;
		@DbRecordField(dataSourceName="R_SGRP_CODE")
		public NString RSgrpCode;
		@DbRecordField(dataSourceName="R_EMPR_CODE")
		public NString REmprCode;
		@DbRecordField(dataSourceName="R_LGCD_CODE")
		public NString RLgcdCode;
		@DbRecordField(dataSourceName="R_LOCN_CODE")
		public NString RLocnCode;
		@DbRecordField(dataSourceName="R_SCHL_CODE")
		public NString RSchlCode;
		@DbRecordField(dataSourceName="R_SUPERVISOR_PIDM")
		public NNumber RSupervisorPidm;
		@DbRecordField(dataSourceName="R_SUPERVISOR_POSN")
		public NString RSupervisorPosn;
		@DbRecordField(dataSourceName="R_SUPERVISOR_SUFF")
		public NString RSupervisorSuff;
		@DbRecordField(dataSourceName="R_WKCP_CODE")
		public NString RWkcpCode;
		@DbRecordField(dataSourceName="R_JBLN_CODE")
		public NString RJblnCode;
		@DbRecordField(dataSourceName="R_PERS_CHG_DATE")
		public NDate RPersChgDate;
		@DbRecordField(dataSourceName="R_PCAT_CODE")
		public NString RPcatCode;
		@DbRecordField(dataSourceName="R_DFPR_CODE")
		public NString RDfprCode;
		@DbRecordField(dataSourceName="R_ENCUMBRANCE_HRS")
		public NNumber REncumbranceHrs;
		@DbRecordField(dataSourceName="R_CONTRACT_NO")
		public NString RContractNo;
		@DbRecordField(dataSourceName="R_STRS_ASSN_CODE")
		public NString RStrsAssnCode;
		@DbRecordField(dataSourceName="R_STRS_PAY_CODE")
		public NString RStrsPayCode;
		@DbRecordField(dataSourceName="R_PERS_PAY_CODE")
		public NString RPersPayCode;
		@DbRecordField(dataSourceName="R_TIME_ENTRY_METHOD")
		public NString RTimeEntryMethod;
		@DbRecordField(dataSourceName="R_TIME_ENTRY_TYPE")
		public NString RTimeEntryType;
		@DbRecordField(dataSourceName="R_TIME_IN_OUT_IND")
		public NString RTimeInOutInd;
		@DbRecordField(dataSourceName="R_LCAT_CODE")
		public NString RLcatCode;
		@DbRecordField(dataSourceName="R_LEAV_REPT_METHOD")
		public NString RLeavReptMethod;
		@DbRecordField(dataSourceName="R_PICT_CODE_LEAV_REPT")
		public NString RPictCodeLeavRept;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_BASE_INTERNAL_RECORD_ID")
		public NString RBaseInternalRecordId;
		@DbRecordField(dataSourceName="R_DETAIL_INTERNAL_RECORD_ID")
		public NString RDetailInternalRecordId;
		@DbRecordField(dataSourceName="R_FUTURE_SALARY_ENC")
		public NNumber RFutureSalaryEnc;
		@DbRecordField(dataSourceName="R_FUTURE_FRINGE_ENC")
		public NNumber RFutureFringeEnc;
	}

	
	
}
