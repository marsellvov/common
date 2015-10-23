package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbLearnerRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pTermCodeEff,NString pStstCode,NString pStypCode,NDate pExpGradDate,NString pFullPartInd,NString pSessCode,NString pResdCode,NString pOrsnCode,NString pPracCode,NNumber pAdvrPidm,NString pGradCreditApprInd,NString pCaplCode,NString pLeavCode,NDate pLeavFromDate,NDate pLeavToDate,NString pAstdCode,NString pTermCodeAstd,NString pRateCode,NString pEdlvCode,NString pIncmCode,NString pEmexCode,NString pAprnCode,NString pTrcnCode,NString pGainCode,NString pVoedCode,NString pBlckCode,NString pTermCodeGrad,NString pAcyrCode,NString pSiteCode,NString pEgolCode,NString pDegcCodeDual,NString pLevlCodeDual,NString pDeptCodeDual,NString pCollCodeDual,NString pMajrCodeDual,NString pBsklCode,NString pPrevCode,NString pTermCodePrev,NString pCastCode,NString pTermCodeCast,NString pUserId,NString pDataOrigin,NString pScpcCode,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_STST_CODE", pStstCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_EXP_GRAD_DATE", pExpGradDate);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_ORSN_CODE", pOrsnCode);
			cmd.addParameter("@P_PRAC_CODE", pPracCode);
			cmd.addParameter("@P_ADVR_PIDM", pAdvrPidm);
			cmd.addParameter("@P_GRAD_CREDIT_APPR_IND", pGradCreditApprInd);
			cmd.addParameter("@P_CAPL_CODE", pCaplCode);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_LEAV_FROM_DATE", pLeavFromDate);
			cmd.addParameter("@P_LEAV_TO_DATE", pLeavToDate);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_TERM_CODE_ASTD", pTermCodeAstd);
			cmd.addParameter("@P_RATE_CODE", pRateCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_INCM_CODE", pIncmCode);
			cmd.addParameter("@P_EMEX_CODE", pEmexCode);
			cmd.addParameter("@P_APRN_CODE", pAprnCode);
			cmd.addParameter("@P_TRCN_CODE", pTrcnCode);
			cmd.addParameter("@P_GAIN_CODE", pGainCode);
			cmd.addParameter("@P_VOED_CODE", pVoedCode);
			cmd.addParameter("@P_BLCK_CODE", pBlckCode);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_DEGC_CODE_DUAL", pDegcCodeDual);
			cmd.addParameter("@P_LEVL_CODE_DUAL", pLevlCodeDual);
			cmd.addParameter("@P_DEPT_CODE_DUAL", pDeptCodeDual);
			cmd.addParameter("@P_COLL_CODE_DUAL", pCollCodeDual);
			cmd.addParameter("@P_MAJR_CODE_DUAL", pMajrCodeDual);
			cmd.addParameter("@P_BSKL_CODE", pBsklCode);
			cmd.addParameter("@P_PREV_CODE", pPrevCode);
			cmd.addParameter("@P_TERM_CODE_PREV", pTermCodePrev);
			cmd.addParameter("@P_CAST_CODE", pCastCode);
			cmd.addParameter("@P_TERM_CODE_CAST", pTermCodeCast);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SCPC_CODE", pScpcCode);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pTermCodeEff,NString pStstCode,NString pStypCode,NDate pExpGradDate,NString pFullPartInd,NString pSessCode,NString pResdCode,NString pOrsnCode,NString pPracCode,NNumber pAdvrPidm,NString pGradCreditApprInd,NString pCaplCode,NString pLeavCode,NDate pLeavFromDate,NDate pLeavToDate,NString pAstdCode,NString pTermCodeAstd,NString pRateCode,NString pEdlvCode,NString pIncmCode,NString pEmexCode,NString pAprnCode,NString pTrcnCode,NString pGainCode,NString pVoedCode,NString pBlckCode,NString pTermCodeGrad,NString pAcyrCode,NString pSiteCode,NString pEgolCode,NString pDegcCodeDual,NString pLevlCodeDual,NString pDeptCodeDual,NString pCollCodeDual,NString pMajrCodeDual,NString pBsklCode,NString pPrevCode,NString pTermCodePrev,NString pCastCode,NString pTermCodeCast,NString pUserId,NString pDataOrigin,NString pScpcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_STST_CODE", pStstCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_EXP_GRAD_DATE", pExpGradDate);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_ORSN_CODE", pOrsnCode);
			cmd.addParameter("@P_PRAC_CODE", pPracCode);
			cmd.addParameter("@P_ADVR_PIDM", pAdvrPidm);
			cmd.addParameter("@P_GRAD_CREDIT_APPR_IND", pGradCreditApprInd);
			cmd.addParameter("@P_CAPL_CODE", pCaplCode);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_LEAV_FROM_DATE", pLeavFromDate);
			cmd.addParameter("@P_LEAV_TO_DATE", pLeavToDate);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_TERM_CODE_ASTD", pTermCodeAstd);
			cmd.addParameter("@P_RATE_CODE", pRateCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_INCM_CODE", pIncmCode);
			cmd.addParameter("@P_EMEX_CODE", pEmexCode);
			cmd.addParameter("@P_APRN_CODE", pAprnCode);
			cmd.addParameter("@P_TRCN_CODE", pTrcnCode);
			cmd.addParameter("@P_GAIN_CODE", pGainCode);
			cmd.addParameter("@P_VOED_CODE", pVoedCode);
			cmd.addParameter("@P_BLCK_CODE", pBlckCode);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_DEGC_CODE_DUAL", pDegcCodeDual);
			cmd.addParameter("@P_LEVL_CODE_DUAL", pLevlCodeDual);
			cmd.addParameter("@P_DEPT_CODE_DUAL", pDeptCodeDual);
			cmd.addParameter("@P_COLL_CODE_DUAL", pCollCodeDual);
			cmd.addParameter("@P_MAJR_CODE_DUAL", pMajrCodeDual);
			cmd.addParameter("@P_BSKL_CODE", pBsklCode);
			cmd.addParameter("@P_PREV_CODE", pPrevCode);
			cmd.addParameter("@P_TERM_CODE_PREV", pTermCodePrev);
			cmd.addParameter("@P_CAST_CODE", pCastCode);
			cmd.addParameter("@P_TERM_CODE_CAST", pTermCodeCast);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SCPC_CODE", pScpcCode);
				
			cmd.execute();


		}
		
	
	
	
}
