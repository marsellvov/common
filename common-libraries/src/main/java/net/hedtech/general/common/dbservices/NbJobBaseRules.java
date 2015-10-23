package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbJobBaseRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPosn,NString pSuff,NDate pBeginDate,NDate pEndDate,NNumber pDeferBal,NString pContractType,NNumber pSalaryEncumbrance,NDate pContractBeginDate,NDate pContractEndDate,NNumber pTotalContractHrs,NNumber pTotalEncumbranceHrs,NString pStepIncrMon,NString pStepIncrDay,NString pCoasCode,NString pAccrueLeaveInd,NString pCivilServiceInd,NString pEncumbranceChangeInd,NNumber pFringeEncumbrance,NString pIpedsReptInd,NString pFaclStatscanReptInd,NDate pProbationBeginDate,NDate pProbationEndDate,NNumber pProbationUnits,NDate pEligibleDate,NString pUserId,NString pDataOrigin,NString pInternalRecordId,NNumber pFutureSalaryEnc,NNumber pFutureFringeEnc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
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
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
			cmd.addParameter("@P_FUTURE_SALARY_ENC", pFutureSalaryEnc);
			cmd.addParameter("@P_FUTURE_FRINGE_ENC", pFutureFringeEnc);
				
			cmd.execute();


		}
		
		public static void pValidate(Ref<NbJobBase.JobBaseRecRow> pValRecInout,NNumber pOperationType,NNumber pPidm,NString pPosn,NString pSuff,NDate pBeginDate,NDate pEndDate,NNumber pDeferBal,NString pContractType,NNumber pSalaryEncumbrance,NDate pContractBeginDate,NDate pContractEndDate,NNumber pTotalContractHrs,NNumber pTotalEncumbranceHrs,NString pStepIncrMon,NString pStepIncrDay,NString pAccrueLeaveInd,NString pCivilServiceInd,NString pEncumbranceChangeInd,NNumber pFringeEncumbrance,NString pIpedsReptInd,NString pFaclStatscanReptInd,NDate pProbationBeginDate,NDate pProbationEndDate,NNumber pProbationUnits,NDate pEligibleDate,NString pUserId,NString pDataOrigin,Ref<NString> pWarningMsgOut,NNumber pFutureSalaryEnc,NNumber pFutureFringeEnc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_VAL_REC_INOUT", pValRecInout.val, NbJobBase.JobBaseRecRow.class, true));
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
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
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
			cmd.addParameter("@P_FUTURE_SALARY_ENC", pFutureSalaryEnc);
			cmd.addParameter("@P_FUTURE_FRINGE_ENC", pFutureFringeEnc);
				
			cmd.execute();
			pValRecInout.val = cmd.getParameterValue("@P_VAL_REC_INOUT", NbJobBase.JobBaseRecRow.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pValidateDelete(NbJobBase.JobBaseRecRow pValRec,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_BASE_RULES.P_VALIDATE_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_VAL_REC", pValRec, NbJobBase.JobBaseRecRow.class ));
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
	
	
	
}
