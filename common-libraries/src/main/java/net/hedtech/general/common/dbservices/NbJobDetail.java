package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbJobDetail {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(JobDetailRecRow recOne,JobDetailRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, JobDetailRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, JobDetailRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByDate(NNumber pPidm,NString pPosn,NString pSuff,NDate pQueryDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL.F_QUERY_BY_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_QUERY_DATE", pQueryDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryNext(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL.F_QUERY_NEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pStatus,NString pDesc,NString pEclsCode,NString pPictCode,NString pCoasCodeTs,NString pOrgnCodeTs,NString pSalTable,NString pSalGrade,NNumber pSalStep,NNumber pApptPct,NNumber pFte,NNumber pHrsDay,NNumber pHrsPay,NString pShift,NNumber pRegRate,NNumber pAssgnSalary,NNumber pFactor,NNumber pAnnSalary,NNumber pPays,NString pJcreCode,NString pSgrpCode,NString pEmprCode,NString pLgcdCode,NString pLocnCode,NString pSchlCode,NNumber pSupervisorPidm,NString pSupervisorPosn,NString pSupervisorSuff,NString pWkcpCode,NString pJblnCode,NDate pPersChgDate,NString pPcatCode,NString pDfprCode,NNumber pEncumbranceHrs,NString pContractNo,NString pStrsAssnCode,NString pStrsPayCode,NString pPersPayCode,NString pTimeEntryMethod,NString pTimeEntryType,NString pTimeInOutInd,NString pLcatCode,NString pLeavReptMethod,NString pPictCodeLeavRept,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pRowid,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pLock(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pStatus,NString pDesc,NString pEclsCode,NString pPictCode,NString pCoasCodeTs,NString pOrgnCodeTs,NString pSalTable,NString pSalGrade,NNumber pSalStep,NNumber pApptPct,NNumber pFte,NNumber pHrsDay,NNumber pHrsPay,NString pShift,NNumber pRegRate,NNumber pAssgnSalary,NNumber pFactor,NNumber pAnnSalary,NNumber pPays,NString pJcreCode,NString pSgrpCode,NString pEmprCode,NString pLgcdCode,NString pLocnCode,NString pSchlCode,NNumber pSupervisorPidm,NString pSupervisorPosn,NString pSupervisorSuff,NString pWkcpCode,NString pJblnCode,NDate pPersChgDate,NString pPcatCode,NString pDfprCode,NNumber pEncumbranceHrs,NString pContractNo,NString pStrsAssnCode,NString pStrsPayCode,NString pPersPayCode,NString pTimeEntryMethod,NString pTimeEntryType,NString pTimeInOutInd,NString pLcatCode,NString pLeavReptMethod,NString pPictCodeLeavRept,NString pUserId,NString pDataOrigin,NString pRowid,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
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
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="JobDetailRecRow", dataSourceName="JOB_DETAIL_REC")
	public static class JobDetailRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_SUFF")
		public NString RSuff;
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
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
