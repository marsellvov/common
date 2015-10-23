package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbTermRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NNumber pCrnOneup,NString pRegAllowed,NString pReadmReq,NString pFeeAssessment,NDate pFeeAssessmntEffDate,NString pDuplSeverity,NString pLinkSeverity,NString pPreqSeverity,NString pCorqSeverity,NString pTimeSeverity,NString pCapcSeverity,NString pLevlSeverity,NString pCollSeverity,NString pMajrSeverity,NString pClasSeverity,NString pApprSeverity,NString pMinhSeverity,NString pMaxhSeverity,NString pHoldSeverity,NString pHold,NString pRefundInd,NString pBycrnInd,NString pReptSeverity,NString pRpthSeverity,NString pTestSeverity,NString pCampSeverity,NString pFeeAssessVr,NString pPrintBillVr,NString pTmstCalcInd,NString pInclAttmptHrsInd,NString pCredWebUpdInd,NString pGmodWebUpdInd,NString pLevlWebUpdInd,NString pClosectWebDispInd,NString pMailerWebInd,NString pSchdWebSearchInd,NString pCampWebSearchInd,NString pSessWebSearchInd,NString pInstrWebSearchInd,NString pFacschdWebDispInd,NString pClaslstWebDispInd,NString pOverappWebUpdInd,NString pAddDrpWebUpdInd,NString pDegreeSeverity,NString pProgramSeverity,NString pDeptSeverity,NString pAttsSeverity,NString pChrtSeverity,NString pMexcSeverity,NString pInprogressUsageInd,NString pGradeDetailWebInd,NString pMidtermWebInd,NString pProfileSendInd,NDate pCutoffDate,NString pTivDateSource,NString pWebCappTermInd,NString pWebCappCatlgInd,NString pAttrWebSearchInd,NString pLevlWebSearchInd,NString pInsmWebSearchInd,NString pLsTitleWebsDispInd,NString pLsDescWebsDispInd,NString pDurationWebSrchInd,NString pLevlWebCatlSrchInd,NString pStypWebCatlSrchInd,NString pCollWebCatlSrchInd,NString pDivWebCatlSrchInd,NString pDeptWebCatlSrchInd,NString pProgAttWebcSrchInd,NString pLcTitleWebcDispInd,NString pLcDescWebcDispInd,NString pDynamicSchedTermInd,NString pAssessSwapInd,NString pAssessRevNrfInd,NString pAssessRegGraceInd,NString pStudyPathInd,NString pFutureRepeatInd,NString pSpWebUpdInd,NString pSectionfeeInd,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN_ONEUP", pCrnOneup);
			cmd.addParameter("@P_REG_ALLOWED", pRegAllowed);
			cmd.addParameter("@P_READM_REQ", pReadmReq);
			cmd.addParameter("@P_FEE_ASSESSMENT", pFeeAssessment);
			cmd.addParameter("@P_FEE_ASSESSMNT_EFF_DATE", pFeeAssessmntEffDate);
			cmd.addParameter("@P_DUPL_SEVERITY", pDuplSeverity);
			cmd.addParameter("@P_LINK_SEVERITY", pLinkSeverity);
			cmd.addParameter("@P_PREQ_SEVERITY", pPreqSeverity);
			cmd.addParameter("@P_CORQ_SEVERITY", pCorqSeverity);
			cmd.addParameter("@P_TIME_SEVERITY", pTimeSeverity);
			cmd.addParameter("@P_CAPC_SEVERITY", pCapcSeverity);
			cmd.addParameter("@P_LEVL_SEVERITY", pLevlSeverity);
			cmd.addParameter("@P_COLL_SEVERITY", pCollSeverity);
			cmd.addParameter("@P_MAJR_SEVERITY", pMajrSeverity);
			cmd.addParameter("@P_CLAS_SEVERITY", pClasSeverity);
			cmd.addParameter("@P_APPR_SEVERITY", pApprSeverity);
			cmd.addParameter("@P_MINH_SEVERITY", pMinhSeverity);
			cmd.addParameter("@P_MAXH_SEVERITY", pMaxhSeverity);
			cmd.addParameter("@P_HOLD_SEVERITY", pHoldSeverity);
			cmd.addParameter("@P_HOLD", pHold);
			cmd.addParameter("@P_REFUND_IND", pRefundInd);
			cmd.addParameter("@P_BYCRN_IND", pBycrnInd);
			cmd.addParameter("@P_REPT_SEVERITY", pReptSeverity);
			cmd.addParameter("@P_RPTH_SEVERITY", pRpthSeverity);
			cmd.addParameter("@P_TEST_SEVERITY", pTestSeverity);
			cmd.addParameter("@P_CAMP_SEVERITY", pCampSeverity);
			cmd.addParameter("@P_FEE_ASSESS_VR", pFeeAssessVr);
			cmd.addParameter("@P_PRINT_BILL_VR", pPrintBillVr);
			cmd.addParameter("@P_TMST_CALC_IND", pTmstCalcInd);
			cmd.addParameter("@P_INCL_ATTMPT_HRS_IND", pInclAttmptHrsInd);
			cmd.addParameter("@P_CRED_WEB_UPD_IND", pCredWebUpdInd);
			cmd.addParameter("@P_GMOD_WEB_UPD_IND", pGmodWebUpdInd);
			cmd.addParameter("@P_LEVL_WEB_UPD_IND", pLevlWebUpdInd);
			cmd.addParameter("@P_CLOSECT_WEB_DISP_IND", pClosectWebDispInd);
			cmd.addParameter("@P_MAILER_WEB_IND", pMailerWebInd);
			cmd.addParameter("@P_SCHD_WEB_SEARCH_IND", pSchdWebSearchInd);
			cmd.addParameter("@P_CAMP_WEB_SEARCH_IND", pCampWebSearchInd);
			cmd.addParameter("@P_SESS_WEB_SEARCH_IND", pSessWebSearchInd);
			cmd.addParameter("@P_INSTR_WEB_SEARCH_IND", pInstrWebSearchInd);
			cmd.addParameter("@P_FACSCHD_WEB_DISP_IND", pFacschdWebDispInd);
			cmd.addParameter("@P_CLASLST_WEB_DISP_IND", pClaslstWebDispInd);
			cmd.addParameter("@P_OVERAPP_WEB_UPD_IND", pOverappWebUpdInd);
			cmd.addParameter("@P_ADD_DRP_WEB_UPD_IND", pAddDrpWebUpdInd);
			cmd.addParameter("@P_DEGREE_SEVERITY", pDegreeSeverity);
			cmd.addParameter("@P_PROGRAM_SEVERITY", pProgramSeverity);
			cmd.addParameter("@P_DEPT_SEVERITY", pDeptSeverity);
			cmd.addParameter("@P_ATTS_SEVERITY", pAttsSeverity);
			cmd.addParameter("@P_CHRT_SEVERITY", pChrtSeverity);
			cmd.addParameter("@P_MEXC_SEVERITY", pMexcSeverity);
			cmd.addParameter("@P_INPROGRESS_USAGE_IND", pInprogressUsageInd);
			cmd.addParameter("@P_GRADE_DETAIL_WEB_IND", pGradeDetailWebInd);
			cmd.addParameter("@P_MIDTERM_WEB_IND", pMidtermWebInd);
			cmd.addParameter("@P_PROFILE_SEND_IND", pProfileSendInd);
			cmd.addParameter("@P_CUTOFF_DATE", pCutoffDate);
			cmd.addParameter("@P_TIV_DATE_SOURCE", pTivDateSource);
			cmd.addParameter("@P_WEB_CAPP_TERM_IND", pWebCappTermInd);
			cmd.addParameter("@P_WEB_CAPP_CATLG_IND", pWebCappCatlgInd);
			cmd.addParameter("@P_ATTR_WEB_SEARCH_IND", pAttrWebSearchInd);
			cmd.addParameter("@P_LEVL_WEB_SEARCH_IND", pLevlWebSearchInd);
			cmd.addParameter("@P_INSM_WEB_SEARCH_IND", pInsmWebSearchInd);
			cmd.addParameter("@P_LS_TITLE_WEBS_DISP_IND", pLsTitleWebsDispInd);
			cmd.addParameter("@P_LS_DESC_WEBS_DISP_IND", pLsDescWebsDispInd);
			cmd.addParameter("@P_DURATION_WEB_SRCH_IND", pDurationWebSrchInd);
			cmd.addParameter("@P_LEVL_WEB_CATL_SRCH_IND", pLevlWebCatlSrchInd);
			cmd.addParameter("@P_STYP_WEB_CATL_SRCH_IND", pStypWebCatlSrchInd);
			cmd.addParameter("@P_COLL_WEB_CATL_SRCH_IND", pCollWebCatlSrchInd);
			cmd.addParameter("@P_DIV_WEB_CATL_SRCH_IND", pDivWebCatlSrchInd);
			cmd.addParameter("@P_DEPT_WEB_CATL_SRCH_IND", pDeptWebCatlSrchInd);
			cmd.addParameter("@P_PROG_ATT_WEBC_SRCH_IND", pProgAttWebcSrchInd);
			cmd.addParameter("@P_LC_TITLE_WEBC_DISP_IND", pLcTitleWebcDispInd);
			cmd.addParameter("@P_LC_DESC_WEBC_DISP_IND", pLcDescWebcDispInd);
			cmd.addParameter("@P_DYNAMIC_SCHED_TERM_IND", pDynamicSchedTermInd);
			cmd.addParameter("@P_ASSESS_SWAP_IND", pAssessSwapInd);
			cmd.addParameter("@P_ASSESS_REV_NRF_IND", pAssessRevNrfInd);
			cmd.addParameter("@P_ASSESS_REG_GRACE_IND", pAssessRegGraceInd);
			cmd.addParameter("@P_STUDY_PATH_IND", pStudyPathInd);
			cmd.addParameter("@P_FUTURE_REPEAT_IND", pFutureRepeatInd);
			cmd.addParameter("@P_SP_WEB_UPD_IND", pSpWebUpdInd);
			cmd.addParameter("@P_SECTIONFEE_IND", pSectionfeeInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NNumber pCrnOneup,NString pRegAllowed,NString pReadmReq,NString pFeeAssessment,NDate pFeeAssessmntEffDate,NString pDuplSeverity,NString pLinkSeverity,NString pPreqSeverity,NString pCorqSeverity,NString pTimeSeverity,NString pCapcSeverity,NString pLevlSeverity,NString pCollSeverity,NString pMajrSeverity,NString pClasSeverity,NString pApprSeverity,NString pMinhSeverity,NString pMaxhSeverity,NString pHoldSeverity,NString pHold,NString pRefundInd,NString pBycrnInd,NString pReptSeverity,NString pRpthSeverity,NString pTestSeverity,NString pCampSeverity,NString pFeeAssessVr,NString pPrintBillVr,NString pTmstCalcInd,NString pInclAttmptHrsInd,NString pCredWebUpdInd,NString pGmodWebUpdInd,NString pLevlWebUpdInd,NString pClosectWebDispInd,NString pMailerWebInd,NString pSchdWebSearchInd,NString pCampWebSearchInd,NString pSessWebSearchInd,NString pInstrWebSearchInd,NString pFacschdWebDispInd,NString pClaslstWebDispInd,NString pOverappWebUpdInd,NString pAddDrpWebUpdInd,NString pDegreeSeverity,NString pProgramSeverity,NString pDeptSeverity,NString pAttsSeverity,NString pChrtSeverity,NString pMexcSeverity,NString pInprogressUsageInd,NString pGradeDetailWebInd,NString pMidtermWebInd,NString pProfileSendInd,NDate pCutoffDate,NString pTivDateSource,NString pWebCappTermInd,NString pWebCappCatlgInd,NString pAttrWebSearchInd,NString pLevlWebSearchInd,NString pInsmWebSearchInd,NString pLsTitleWebsDispInd,NString pLsDescWebsDispInd,NString pDurationWebSrchInd,NString pLevlWebCatlSrchInd,NString pStypWebCatlSrchInd,NString pCollWebCatlSrchInd,NString pDivWebCatlSrchInd,NString pDeptWebCatlSrchInd,NString pProgAttWebcSrchInd,NString pLcTitleWebcDispInd,NString pLcDescWebcDispInd,NString pDynamicSchedTermInd,NString pAssessSwapInd,NString pAssessRevNrfInd,NString pAssessRegGraceInd,NString pStudyPathInd,NString pFutureRepeatInd,NString pSpWebUpdInd,NString pSectionfeeInd,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN_ONEUP", pCrnOneup);
			cmd.addParameter("@P_REG_ALLOWED", pRegAllowed);
			cmd.addParameter("@P_READM_REQ", pReadmReq);
			cmd.addParameter("@P_FEE_ASSESSMENT", pFeeAssessment);
			cmd.addParameter("@P_FEE_ASSESSMNT_EFF_DATE", pFeeAssessmntEffDate);
			cmd.addParameter("@P_DUPL_SEVERITY", pDuplSeverity);
			cmd.addParameter("@P_LINK_SEVERITY", pLinkSeverity);
			cmd.addParameter("@P_PREQ_SEVERITY", pPreqSeverity);
			cmd.addParameter("@P_CORQ_SEVERITY", pCorqSeverity);
			cmd.addParameter("@P_TIME_SEVERITY", pTimeSeverity);
			cmd.addParameter("@P_CAPC_SEVERITY", pCapcSeverity);
			cmd.addParameter("@P_LEVL_SEVERITY", pLevlSeverity);
			cmd.addParameter("@P_COLL_SEVERITY", pCollSeverity);
			cmd.addParameter("@P_MAJR_SEVERITY", pMajrSeverity);
			cmd.addParameter("@P_CLAS_SEVERITY", pClasSeverity);
			cmd.addParameter("@P_APPR_SEVERITY", pApprSeverity);
			cmd.addParameter("@P_MINH_SEVERITY", pMinhSeverity);
			cmd.addParameter("@P_MAXH_SEVERITY", pMaxhSeverity);
			cmd.addParameter("@P_HOLD_SEVERITY", pHoldSeverity);
			cmd.addParameter("@P_HOLD", pHold);
			cmd.addParameter("@P_REFUND_IND", pRefundInd);
			cmd.addParameter("@P_BYCRN_IND", pBycrnInd);
			cmd.addParameter("@P_REPT_SEVERITY", pReptSeverity);
			cmd.addParameter("@P_RPTH_SEVERITY", pRpthSeverity);
			cmd.addParameter("@P_TEST_SEVERITY", pTestSeverity);
			cmd.addParameter("@P_CAMP_SEVERITY", pCampSeverity);
			cmd.addParameter("@P_FEE_ASSESS_VR", pFeeAssessVr);
			cmd.addParameter("@P_PRINT_BILL_VR", pPrintBillVr);
			cmd.addParameter("@P_TMST_CALC_IND", pTmstCalcInd);
			cmd.addParameter("@P_INCL_ATTMPT_HRS_IND", pInclAttmptHrsInd);
			cmd.addParameter("@P_CRED_WEB_UPD_IND", pCredWebUpdInd);
			cmd.addParameter("@P_GMOD_WEB_UPD_IND", pGmodWebUpdInd);
			cmd.addParameter("@P_LEVL_WEB_UPD_IND", pLevlWebUpdInd);
			cmd.addParameter("@P_CLOSECT_WEB_DISP_IND", pClosectWebDispInd);
			cmd.addParameter("@P_MAILER_WEB_IND", pMailerWebInd);
			cmd.addParameter("@P_SCHD_WEB_SEARCH_IND", pSchdWebSearchInd);
			cmd.addParameter("@P_CAMP_WEB_SEARCH_IND", pCampWebSearchInd);
			cmd.addParameter("@P_SESS_WEB_SEARCH_IND", pSessWebSearchInd);
			cmd.addParameter("@P_INSTR_WEB_SEARCH_IND", pInstrWebSearchInd);
			cmd.addParameter("@P_FACSCHD_WEB_DISP_IND", pFacschdWebDispInd);
			cmd.addParameter("@P_CLASLST_WEB_DISP_IND", pClaslstWebDispInd);
			cmd.addParameter("@P_OVERAPP_WEB_UPD_IND", pOverappWebUpdInd);
			cmd.addParameter("@P_ADD_DRP_WEB_UPD_IND", pAddDrpWebUpdInd);
			cmd.addParameter("@P_DEGREE_SEVERITY", pDegreeSeverity);
			cmd.addParameter("@P_PROGRAM_SEVERITY", pProgramSeverity);
			cmd.addParameter("@P_DEPT_SEVERITY", pDeptSeverity);
			cmd.addParameter("@P_ATTS_SEVERITY", pAttsSeverity);
			cmd.addParameter("@P_CHRT_SEVERITY", pChrtSeverity);
			cmd.addParameter("@P_MEXC_SEVERITY", pMexcSeverity);
			cmd.addParameter("@P_INPROGRESS_USAGE_IND", pInprogressUsageInd);
			cmd.addParameter("@P_GRADE_DETAIL_WEB_IND", pGradeDetailWebInd);
			cmd.addParameter("@P_MIDTERM_WEB_IND", pMidtermWebInd);
			cmd.addParameter("@P_PROFILE_SEND_IND", pProfileSendInd);
			cmd.addParameter("@P_CUTOFF_DATE", pCutoffDate);
			cmd.addParameter("@P_TIV_DATE_SOURCE", pTivDateSource);
			cmd.addParameter("@P_WEB_CAPP_TERM_IND", pWebCappTermInd);
			cmd.addParameter("@P_WEB_CAPP_CATLG_IND", pWebCappCatlgInd);
			cmd.addParameter("@P_ATTR_WEB_SEARCH_IND", pAttrWebSearchInd);
			cmd.addParameter("@P_LEVL_WEB_SEARCH_IND", pLevlWebSearchInd);
			cmd.addParameter("@P_INSM_WEB_SEARCH_IND", pInsmWebSearchInd);
			cmd.addParameter("@P_LS_TITLE_WEBS_DISP_IND", pLsTitleWebsDispInd);
			cmd.addParameter("@P_LS_DESC_WEBS_DISP_IND", pLsDescWebsDispInd);
			cmd.addParameter("@P_DURATION_WEB_SRCH_IND", pDurationWebSrchInd);
			cmd.addParameter("@P_LEVL_WEB_CATL_SRCH_IND", pLevlWebCatlSrchInd);
			cmd.addParameter("@P_STYP_WEB_CATL_SRCH_IND", pStypWebCatlSrchInd);
			cmd.addParameter("@P_COLL_WEB_CATL_SRCH_IND", pCollWebCatlSrchInd);
			cmd.addParameter("@P_DIV_WEB_CATL_SRCH_IND", pDivWebCatlSrchInd);
			cmd.addParameter("@P_DEPT_WEB_CATL_SRCH_IND", pDeptWebCatlSrchInd);
			cmd.addParameter("@P_PROG_ATT_WEBC_SRCH_IND", pProgAttWebcSrchInd);
			cmd.addParameter("@P_LC_TITLE_WEBC_DISP_IND", pLcTitleWebcDispInd);
			cmd.addParameter("@P_LC_DESC_WEBC_DISP_IND", pLcDescWebcDispInd);
			cmd.addParameter("@P_DYNAMIC_SCHED_TERM_IND", pDynamicSchedTermInd);
			cmd.addParameter("@P_ASSESS_SWAP_IND", pAssessSwapInd);
			cmd.addParameter("@P_ASSESS_REV_NRF_IND", pAssessRevNrfInd);
			cmd.addParameter("@P_ASSESS_REG_GRACE_IND", pAssessRegGraceInd);
			cmd.addParameter("@P_STUDY_PATH_IND", pStudyPathInd);
			cmd.addParameter("@P_FUTURE_REPEAT_IND", pFutureRepeatInd);
			cmd.addParameter("@P_SP_WEB_UPD_IND", pSpWebUpdInd);
			cmd.addParameter("@P_SECTIONFEE_IND", pSectionfeeInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
