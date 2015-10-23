package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbJobDetailRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pStatus,NString pDesc,NString pEclsCode,NString pPictCode,NString pCoasCodeTs,NString pOrgnCodeTs,NString pSalTable,NString pSalGrade,NNumber pSalStep,NNumber pApptPct,NNumber pFte,NNumber pHrsDay,NNumber pHrsPay,NString pShift,NNumber pRegRate,NNumber pAssgnSalary,NNumber pFactor,NNumber pAnnSalary,NNumber pPerPaySalary,NNumber pPays,NNumber pPerPayDeferAmt,NString pJcreCode,NString pSgrpCode,NString pEmprCode,NString pLgcdCode,NString pLocnCode,NString pSchlCode,NNumber pSupervisorPidm,NString pSupervisorPosn,NString pSupervisorSuff,NString pWkcpCode,NString pJblnCode,NDate pPersChgDate,NString pPcatCode,NString pDfprCode,NNumber pEncumbranceHrs,NString pContractNo,NString pStrsAssnCode,NString pStrsPayCode,NString pPersPayCode,NString pTimeEntryMethod,NString pTimeEntryType,NString pTimeInOutInd,NString pLcatCode,NString pLeavReptMethod,NString pPictCodeLeavRept,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_PER_PAY_SALARY", pPerPaySalary);
			cmd.addParameter("@P_PAYS", pPays);
			cmd.addParameter("@P_PER_PAY_DEFER_AMT", pPerPayDeferAmt);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(Ref<NbJobDetail.JobDetailRecRow> pValRecInout,NNumber pOperationType,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pStatus,NString pDesc,NString pEclsCode,NString pPictCode,NString pCoasCodeTs,NString pOrgnCodeTs,NString pSalTable,NString pSalGrade,NNumber pSalStep,NNumber pApptPct,NNumber pFte,NNumber pHrsDay,NNumber pHrsPay,NString pShift,NNumber pRegRate,NNumber pAssgnSalary,NNumber pFactor,NNumber pAnnSalary,NNumber pPays,NString pJcreCode,NString pSgrpCode,NString pEmprCode,NString pLgcdCode,NString pLocnCode,NString pSchlCode,NNumber pSupervisorPidm,NString pSupervisorPosn,NString pSupervisorSuff,NString pWkcpCode,NString pJblnCode,NDate pPersChgDate,NString pPcatCode,NString pDfprCode,NNumber pEncumbranceHrs,NString pContractNo,NString pStrsAssnCode,NString pStrsPayCode,NString pPersPayCode,NString pTimeEntryMethod,NString pTimeEntryType,NString pTimeInOutInd,NString pLcatCode,NString pLeavReptMethod,NString pPictCodeLeavRept,NString pUserId,NString pDataOrigin,Ref<NString> pDeferPayIndOut,Ref<NNumber> pDeferAccrualsOut,Ref<NNumber> pAdjPerPaySalaryOut,Ref<NNumber> pAdjPerPayDeferAmtOut,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_VAL_REC_INOUT", pValRecInout.val, NbJobDetail.JobDetailRecRow.class, true));
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_DEFER_PAY_IND_OUT", NString.class);
			cmd.addParameter("@P_DEFER_ACCRUALS_OUT", NNumber.class);
			cmd.addParameter("@P_ADJ_PER_PAY_SALARY_OUT", NNumber.class);
			cmd.addParameter("@P_ADJ_PER_PAY_DEFER_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pValRecInout.val = cmd.getParameterValue("@P_VAL_REC_INOUT", NbJobDetail.JobDetailRecRow.class);
			pDeferPayIndOut.val = cmd.getParameterValue("@P_DEFER_PAY_IND_OUT", NString.class);
			pDeferAccrualsOut.val = cmd.getParameterValue("@P_DEFER_ACCRUALS_OUT", NNumber.class);
			pAdjPerPaySalaryOut.val = cmd.getParameterValue("@P_ADJ_PER_PAY_SALARY_OUT", NNumber.class);
			pAdjPerPayDeferAmtOut.val = cmd.getParameterValue("@P_ADJ_PER_PAY_DEFER_AMT_OUT", NNumber.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pValidateDelete(NbJobDetail.JobDetailRecRow pValRec,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_DETAIL_RULES.P_VALIDATE_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_VAL_REC", pValRec, NbJobDetail.JobDetailRecRow.class ));
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
	
	
	
}
