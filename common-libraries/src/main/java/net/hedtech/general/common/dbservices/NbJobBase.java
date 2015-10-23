package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbJobBase {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pPosn,NString pSuff,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(JobBaseRecRow recOne,JobBaseRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, JobBaseRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, JobBaseRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pPosn,NString pSuff,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pPosn,NString pSuff,NDate pBeginDate,NString pContractType,NNumber pSalaryEncumbrance,NDate pContractBeginDate,NDate pContractEndDate,NNumber pTotalContractHrs,NNumber pTotalEncumbranceHrs,NString pStepIncrMon,NString pStepIncrDay,NString pAccrueLeaveInd,NString pCivilServiceInd,NString pIpedsReptInd,NString pFaclStatscanReptInd,NDate pProbationBeginDate,NDate pProbationEndDate,NNumber pProbationUnits,NDate pEligibleDate,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pPosn,NString pSuff,NString pRowid,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pLock(NNumber pPidm,NString pPosn,NString pSuff,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pPosn,NString pSuff,NDate pEndDate,NNumber pDeferBal,NString pContractType,NNumber pSalaryEncumbrance,NDate pContractBeginDate,NDate pContractEndDate,NNumber pTotalContractHrs,NNumber pTotalEncumbranceHrs,NString pStepIncrMon,NString pStepIncrDay,NString pAccrueLeaveInd,NString pCivilServiceInd,NString pEncumbranceChangeInd,NNumber pFringeEncumbrance,NString pIpedsReptInd,NString pFaclStatscanReptInd,NDate pProbationBeginDate,NDate pProbationEndDate,NNumber pProbationUnits,NDate pEligibleDate,NString pUserId,NString pDataOrigin,NString pRowid,Ref<NString> pWarningMsgOut,NNumber pFutureSalaryEnc,NNumber pFutureFringeEnc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_END_DATE", pEndDate);
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
			cmd.addParameter("@P_ENCUMBRANCE_CHANGE_IND", pEncumbranceChangeInd);
			cmd.addParameter("@P_FRINGE_ENCUMBRANCE", pFringeEncumbrance);
			cmd.addParameter("@P_IPEDS_REPT_IND", pIpedsReptInd);
			cmd.addParameter("@P_FACL_STATSCAN_REPT_IND", pFaclStatscanReptInd);
			cmd.addParameter("@P_PROBATION_BEGIN_DATE", pProbationBeginDate);
			cmd.addParameter("@P_PROBATION_END_DATE", pProbationEndDate);
			cmd.addParameter("@P_PROBATION_UNITS", pProbationUnits);
			cmd.addParameter("@P_ELIGIBLE_DATE", pEligibleDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
			cmd.addParameter("@P_FUTURE_SALARY_ENC", pFutureSalaryEnc);
			cmd.addParameter("@P_FUTURE_FRINGE_ENC", pFutureFringeEnc);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="JobBaseRecRow", dataSourceName="JOB_BASE_REC")
	public static class JobBaseRecRow
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
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		@DbRecordField(dataSourceName="R_FUTURE_SALARY_ENC")
		public NNumber RFutureSalaryEnc;
		@DbRecordField(dataSourceName="R_FUTURE_FRINGE_ENC")
		public NNumber RFutureFringeEnc;
	}

	
	
}
