package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbGradappEligibleRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pSeqno,NString pLmodCde,NString pUserId,NString pLevlCode,NString pCampCode,NString pCollCode,NString pDegcCode,NString pProgram,NString pLfstCode,NString pMajrCode,NString pDeptCode,NString pTermCodeMatric,NString pTermCodeAdmit,NDate pExpGradFromDate,NDate pExpGradToDate,NString pTermCodeGrad,NString pStstCode,NString pClasCode,NString pAttsCode,NString pChrtCode,NString pStdnTermCodeGrad,NDate pStdnGradFromDate,NDate pStdnGradToDate,NString pAstdCode,NString pCastCode,NString pDgmrTermCodeGrad,NDate pDgmrGradFromDate,NDate pDgmrGradToDate,NString pGrstCode,NString pDegsCode,NString pLevlCodeGpaCalc,NString pInProgressInd,NNumber pInstHoursEarned,NNumber pInstGpaHours,NNumber pInstGpa,NNumber pHoursEarned,NNumber pGpaHours,NNumber pGpa,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LMOD_CDE", pLmodCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_TERM_CODE_MATRIC", pTermCodeMatric);
			cmd.addParameter("@P_TERM_CODE_ADMIT", pTermCodeAdmit);
			cmd.addParameter("@P_EXP_GRAD_FROM_DATE", pExpGradFromDate);
			cmd.addParameter("@P_EXP_GRAD_TO_DATE", pExpGradToDate);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_STST_CODE", pStstCode);
			cmd.addParameter("@P_CLAS_CODE", pClasCode);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_STDN_TERM_CODE_GRAD", pStdnTermCodeGrad);
			cmd.addParameter("@P_STDN_GRAD_FROM_DATE", pStdnGradFromDate);
			cmd.addParameter("@P_STDN_GRAD_TO_DATE", pStdnGradToDate);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_CAST_CODE", pCastCode);
			cmd.addParameter("@P_DGMR_TERM_CODE_GRAD", pDgmrTermCodeGrad);
			cmd.addParameter("@P_DGMR_GRAD_FROM_DATE", pDgmrGradFromDate);
			cmd.addParameter("@P_DGMR_GRAD_TO_DATE", pDgmrGradToDate);
			cmd.addParameter("@P_GRST_CODE", pGrstCode);
			cmd.addParameter("@P_DEGS_CODE", pDegsCode);
			cmd.addParameter("@P_LEVL_CODE_GPA_CALC", pLevlCodeGpaCalc);
			cmd.addParameter("@P_IN_PROGRESS_IND", pInProgressInd);
			cmd.addParameter("@P_INST_HOURS_EARNED", pInstHoursEarned);
			cmd.addParameter("@P_INST_GPA_HOURS", pInstGpaHours);
			cmd.addParameter("@P_INST_GPA", pInstGpa);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_GPA_HOURS", pGpaHours);
			cmd.addParameter("@P_GPA", pGpa);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pSeqno,NString pLmodCde,NString pUserId,NString pLevlCode,NString pCampCode,NString pCollCode,NString pDegcCode,NString pProgram,NString pLfstCode,NString pMajrCode,NString pDeptCode,NString pTermCodeMatric,NString pTermCodeAdmit,NDate pExpGradFromDate,NDate pExpGradToDate,NString pTermCodeGrad,NString pStstCode,NString pClasCode,NString pAttsCode,NString pChrtCode,NString pStdnTermCodeGrad,NDate pStdnGradFromDate,NDate pStdnGradToDate,NString pAstdCode,NString pCastCode,NString pDgmrTermCodeGrad,NDate pDgmrGradFromDate,NDate pDgmrGradToDate,NString pGrstCode,NString pDegsCode,NString pLevlCodeGpaCalc,NString pInProgressInd,NNumber pInstHoursEarned,NNumber pInstGpaHours,NNumber pInstGpa,NNumber pHoursEarned,NNumber pGpaHours,NNumber pGpa,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LMOD_CDE", pLmodCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_TERM_CODE_MATRIC", pTermCodeMatric);
			cmd.addParameter("@P_TERM_CODE_ADMIT", pTermCodeAdmit);
			cmd.addParameter("@P_EXP_GRAD_FROM_DATE", pExpGradFromDate);
			cmd.addParameter("@P_EXP_GRAD_TO_DATE", pExpGradToDate);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_STST_CODE", pStstCode);
			cmd.addParameter("@P_CLAS_CODE", pClasCode);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_STDN_TERM_CODE_GRAD", pStdnTermCodeGrad);
			cmd.addParameter("@P_STDN_GRAD_FROM_DATE", pStdnGradFromDate);
			cmd.addParameter("@P_STDN_GRAD_TO_DATE", pStdnGradToDate);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_CAST_CODE", pCastCode);
			cmd.addParameter("@P_DGMR_TERM_CODE_GRAD", pDgmrTermCodeGrad);
			cmd.addParameter("@P_DGMR_GRAD_FROM_DATE", pDgmrGradFromDate);
			cmd.addParameter("@P_DGMR_GRAD_TO_DATE", pDgmrGradToDate);
			cmd.addParameter("@P_GRST_CODE", pGrstCode);
			cmd.addParameter("@P_DEGS_CODE", pDegsCode);
			cmd.addParameter("@P_LEVL_CODE_GPA_CALC", pLevlCodeGpaCalc);
			cmd.addParameter("@P_IN_PROGRESS_IND", pInProgressInd);
			cmd.addParameter("@P_INST_HOURS_EARNED", pInstHoursEarned);
			cmd.addParameter("@P_INST_GPA_HOURS", pInstGpaHours);
			cmd.addParameter("@P_INST_GPA", pInstGpa);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_GPA_HOURS", pGpaHours);
			cmd.addParameter("@P_GPA", pGpa);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
