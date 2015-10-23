package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbFacJobdetailRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NDate pPersChgDate,NDate pBeginDate,NString pJcreCode,NString pContractType,NString pLockInd,NString pAcknowledgeInd,NString pApplyInd,NString pOrgnCodePosn,NString pEclsCode,NString pPictCode,NString pSgrpCode,NNumber pApptPct,NNumber pAssgnSalary,NNumber pAnnSalary,NNumber pFactor,NNumber pPays,NString pUserId,NString pDataOrigin,NDate pAcknowledgeDate,NString pAcknowledgeUserId,NString pDesc,NDate pEndDate,NString pDfprCode,NNumber pHrsDay,NNumber pHrsPay,NString pSalTable,NString pSalGrade,NNumber pSalStep,NNumber pFte,NNumber pRegRate,NString pCoasCodePosn,NString pPosnOvrloadSrce,NString pSuffOvrloadSrce,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_PERS_CHG_DATE", pPersChgDate);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_JCRE_CODE", pJcreCode);
			cmd.addParameter("@P_CONTRACT_TYPE", pContractType);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_ACKNOWLEDGE_IND", pAcknowledgeInd);
			cmd.addParameter("@P_APPLY_IND", pApplyInd);
			cmd.addParameter("@P_ORGN_CODE_POSN", pOrgnCodePosn);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_SGRP_CODE", pSgrpCode);
			cmd.addParameter("@P_APPT_PCT", pApptPct);
			cmd.addParameter("@P_ASSGN_SALARY", pAssgnSalary);
			cmd.addParameter("@P_ANN_SALARY", pAnnSalary);
			cmd.addParameter("@P_FACTOR", pFactor);
			cmd.addParameter("@P_PAYS", pPays);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ACKNOWLEDGE_DATE", pAcknowledgeDate);
			cmd.addParameter("@P_ACKNOWLEDGE_USER_ID", pAcknowledgeUserId);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_DFPR_CODE", pDfprCode);
			cmd.addParameter("@P_HRS_DAY", pHrsDay);
			cmd.addParameter("@P_HRS_PAY", pHrsPay);
			cmd.addParameter("@P_SAL_TABLE", pSalTable);
			cmd.addParameter("@P_SAL_GRADE", pSalGrade);
			cmd.addParameter("@P_SAL_STEP", pSalStep);
			cmd.addParameter("@P_FTE", pFte);
			cmd.addParameter("@P_REG_RATE", pRegRate);
			cmd.addParameter("@P_COAS_CODE_POSN", pCoasCodePosn);
			cmd.addParameter("@P_POSN_OVRLOAD_SRCE", pPosnOvrloadSrce);
			cmd.addParameter("@P_SUFF_OVRLOAD_SRCE", pSuffOvrloadSrce);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NDate pPersChgDate,NDate pBeginDate,NString pJcreCode,NString pContractType,NString pLockInd,NString pAcknowledgeInd,NString pApplyInd,NString pOrgnCodePosn,NString pEclsCode,NString pPictCode,NString pSgrpCode,NNumber pApptPct,NNumber pAssgnSalary,NNumber pAnnSalary,NNumber pFactor,NNumber pPays,NString pUserId,NString pDataOrigin,NDate pAcknowledgeDate,NString pAcknowledgeUserId,NString pDesc,NDate pEndDate,NString pDfprCode,NNumber pHrsDay,NNumber pHrsPay,NString pSalTable,NString pSalGrade,NNumber pSalStep,NNumber pFte,NNumber pRegRate,NString pCoasCodePosn,NString pPosnOvrloadSrce,NString pSuffOvrloadSrce) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_PERS_CHG_DATE", pPersChgDate);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_JCRE_CODE", pJcreCode);
			cmd.addParameter("@P_CONTRACT_TYPE", pContractType);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_ACKNOWLEDGE_IND", pAcknowledgeInd);
			cmd.addParameter("@P_APPLY_IND", pApplyInd);
			cmd.addParameter("@P_ORGN_CODE_POSN", pOrgnCodePosn);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_SGRP_CODE", pSgrpCode);
			cmd.addParameter("@P_APPT_PCT", pApptPct);
			cmd.addParameter("@P_ASSGN_SALARY", pAssgnSalary);
			cmd.addParameter("@P_ANN_SALARY", pAnnSalary);
			cmd.addParameter("@P_FACTOR", pFactor);
			cmd.addParameter("@P_PAYS", pPays);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ACKNOWLEDGE_DATE", pAcknowledgeDate);
			cmd.addParameter("@P_ACKNOWLEDGE_USER_ID", pAcknowledgeUserId);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_DFPR_CODE", pDfprCode);
			cmd.addParameter("@P_HRS_DAY", pHrsDay);
			cmd.addParameter("@P_HRS_PAY", pHrsPay);
			cmd.addParameter("@P_SAL_TABLE", pSalTable);
			cmd.addParameter("@P_SAL_GRADE", pSalGrade);
			cmd.addParameter("@P_SAL_STEP", pSalStep);
			cmd.addParameter("@P_FTE", pFte);
			cmd.addParameter("@P_REG_RATE", pRegRate);
			cmd.addParameter("@P_COAS_CODE_POSN", pCoasCodePosn);
			cmd.addParameter("@P_POSN_OVRLOAD_SRCE", pPosnOvrloadSrce);
			cmd.addParameter("@P_SUFF_OVRLOAD_SRCE", pSuffOvrloadSrce);
				
			cmd.execute();


		}
		
	
	
	
}
