package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbTerm {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fEligibleToRegister(NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM.F_ELIGIBLE_TO_REGISTER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TermRecRow recOne,TermRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TermRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TermRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCode,NNumber pCrnOneup,NString pRegAllowed,NString pReadmReq,NString pFeeAssessment,NDate pFeeAssessmntEffDate,NString pDuplSeverity,NString pLinkSeverity,NString pPreqSeverity,NString pCorqSeverity,NString pTimeSeverity,NString pCapcSeverity,NString pLevlSeverity,NString pCollSeverity,NString pMajrSeverity,NString pClasSeverity,NString pApprSeverity,NString pMinhSeverity,NString pMaxhSeverity,NString pHoldSeverity,NString pHold,NString pRefundInd,NString pBycrnInd,NString pReptSeverity,NString pRpthSeverity,NString pTestSeverity,NString pCampSeverity,NString pFeeAssessVr,NString pPrintBillVr,NString pTmstCalcInd,NString pInclAttmptHrsInd,NString pCredWebUpdInd,NString pGmodWebUpdInd,NString pLevlWebUpdInd,NString pClosectWebDispInd,NString pMailerWebInd,NString pSchdWebSearchInd,NString pCampWebSearchInd,NString pSessWebSearchInd,NString pInstrWebSearchInd,NString pFacschdWebDispInd,NString pClaslstWebDispInd,NString pOverappWebUpdInd,NString pAddDrpWebUpdInd,NString pDegreeSeverity,NString pProgramSeverity,NString pDeptSeverity,NString pAttsSeverity,NString pChrtSeverity,NString pMexcSeverity,NString pInprogressUsageInd,NString pGradeDetailWebInd,NString pMidtermWebInd,NString pProfileSendInd,NDate pCutoffDate,NString pTivDateSource,NString pWebCappTermInd,NString pWebCappCatlgInd,NString pAttrWebSearchInd,NString pLevlWebSearchInd,NString pInsmWebSearchInd,NString pLsTitleWebsDispInd,NString pLsDescWebsDispInd,NString pDurationWebSrchInd,NString pLevlWebCatlSrchInd,NString pStypWebCatlSrchInd,NString pCollWebCatlSrchInd,NString pDivWebCatlSrchInd,NString pDeptWebCatlSrchInd,NString pProgAttWebcSrchInd,NString pLcTitleWebcDispInd,NString pLcDescWebcDispInd,NString pDynamicSchedTermInd,NString pAssessSwapInd,NString pAssessRevNrfInd,NString pAssessRegGraceInd,NString pStudyPathInd,NString pFutureRepeatInd,NString pSpWebUpdInd,NString pSectionfeeInd,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NNumber pCrnOneup,NString pRegAllowed,NString pReadmReq,NString pFeeAssessment,NDate pFeeAssessmntEffDate,NString pDuplSeverity,NString pLinkSeverity,NString pPreqSeverity,NString pCorqSeverity,NString pTimeSeverity,NString pCapcSeverity,NString pLevlSeverity,NString pCollSeverity,NString pMajrSeverity,NString pClasSeverity,NString pApprSeverity,NString pMinhSeverity,NString pMaxhSeverity,NString pHoldSeverity,NString pHold,NString pRefundInd,NString pBycrnInd,NString pReptSeverity,NString pRpthSeverity,NString pTestSeverity,NString pCampSeverity,NString pFeeAssessVr,NString pPrintBillVr,NString pTmstCalcInd,NString pInclAttmptHrsInd,NString pCredWebUpdInd,NString pGmodWebUpdInd,NString pLevlWebUpdInd,NString pClosectWebDispInd,NString pMailerWebInd,NString pSchdWebSearchInd,NString pCampWebSearchInd,NString pSessWebSearchInd,NString pInstrWebSearchInd,NString pFacschdWebDispInd,NString pClaslstWebDispInd,NString pOverappWebUpdInd,NString pAddDrpWebUpdInd,NString pDegreeSeverity,NString pProgramSeverity,NString pDeptSeverity,NString pAttsSeverity,NString pChrtSeverity,NString pMexcSeverity,NString pInprogressUsageInd,NString pGradeDetailWebInd,NString pMidtermWebInd,NString pProfileSendInd,NDate pCutoffDate,NString pTivDateSource,NString pWebCappTermInd,NString pWebCappCatlgInd,NString pAttrWebSearchInd,NString pLevlWebSearchInd,NString pInsmWebSearchInd,NString pLsTitleWebsDispInd,NString pLsDescWebsDispInd,NString pDurationWebSrchInd,NString pLevlWebCatlSrchInd,NString pStypWebCatlSrchInd,NString pCollWebCatlSrchInd,NString pDivWebCatlSrchInd,NString pDeptWebCatlSrchInd,NString pProgAttWebcSrchInd,NString pLcTitleWebcDispInd,NString pLcDescWebcDispInd,NString pDynamicSchedTermInd,NString pAssessSwapInd,NString pAssessRevNrfInd,NString pAssessRegGraceInd,NString pStudyPathInd,NString pFutureRepeatInd,NString pSpWebUpdInd,NString pSectionfeeInd,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TERM.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TermRecRow", dataSourceName="TERM_REC")
	public static class TermRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_CRN_ONEUP")
		public NNumber RCrnOneup;
		@DbRecordField(dataSourceName="R_REG_ALLOWED")
		public NString RRegAllowed;
		@DbRecordField(dataSourceName="R_READM_REQ")
		public NString RReadmReq;
		@DbRecordField(dataSourceName="R_FEE_ASSESSMENT")
		public NString RFeeAssessment;
		@DbRecordField(dataSourceName="R_FEE_ASSESSMNT_EFF_DATE")
		public NDate RFeeAssessmntEffDate;
		@DbRecordField(dataSourceName="R_DUPL_SEVERITY")
		public NString RDuplSeverity;
		@DbRecordField(dataSourceName="R_LINK_SEVERITY")
		public NString RLinkSeverity;
		@DbRecordField(dataSourceName="R_PREQ_SEVERITY")
		public NString RPreqSeverity;
		@DbRecordField(dataSourceName="R_CORQ_SEVERITY")
		public NString RCorqSeverity;
		@DbRecordField(dataSourceName="R_TIME_SEVERITY")
		public NString RTimeSeverity;
		@DbRecordField(dataSourceName="R_CAPC_SEVERITY")
		public NString RCapcSeverity;
		@DbRecordField(dataSourceName="R_LEVL_SEVERITY")
		public NString RLevlSeverity;
		@DbRecordField(dataSourceName="R_COLL_SEVERITY")
		public NString RCollSeverity;
		@DbRecordField(dataSourceName="R_MAJR_SEVERITY")
		public NString RMajrSeverity;
		@DbRecordField(dataSourceName="R_CLAS_SEVERITY")
		public NString RClasSeverity;
		@DbRecordField(dataSourceName="R_APPR_SEVERITY")
		public NString RApprSeverity;
		@DbRecordField(dataSourceName="R_MINH_SEVERITY")
		public NString RMinhSeverity;
		@DbRecordField(dataSourceName="R_MAXH_SEVERITY")
		public NString RMaxhSeverity;
		@DbRecordField(dataSourceName="R_HOLD_SEVERITY")
		public NString RHoldSeverity;
		@DbRecordField(dataSourceName="R_HOLD")
		public NString RHold;
		@DbRecordField(dataSourceName="R_REFUND_IND")
		public NString RRefundInd;
		@DbRecordField(dataSourceName="R_BYCRN_IND")
		public NString RBycrnInd;
		@DbRecordField(dataSourceName="R_REPT_SEVERITY")
		public NString RReptSeverity;
		@DbRecordField(dataSourceName="R_RPTH_SEVERITY")
		public NString RRpthSeverity;
		@DbRecordField(dataSourceName="R_TEST_SEVERITY")
		public NString RTestSeverity;
		@DbRecordField(dataSourceName="R_CAMP_SEVERITY")
		public NString RCampSeverity;
		@DbRecordField(dataSourceName="R_FEE_ASSESS_VR")
		public NString RFeeAssessVr;
		@DbRecordField(dataSourceName="R_PRINT_BILL_VR")
		public NString RPrintBillVr;
		@DbRecordField(dataSourceName="R_TMST_CALC_IND")
		public NString RTmstCalcInd;
		@DbRecordField(dataSourceName="R_INCL_ATTMPT_HRS_IND")
		public NString RInclAttmptHrsInd;
		@DbRecordField(dataSourceName="R_CRED_WEB_UPD_IND")
		public NString RCredWebUpdInd;
		@DbRecordField(dataSourceName="R_GMOD_WEB_UPD_IND")
		public NString RGmodWebUpdInd;
		@DbRecordField(dataSourceName="R_LEVL_WEB_UPD_IND")
		public NString RLevlWebUpdInd;
		@DbRecordField(dataSourceName="R_CLOSECT_WEB_DISP_IND")
		public NString RClosectWebDispInd;
		@DbRecordField(dataSourceName="R_MAILER_WEB_IND")
		public NString RMailerWebInd;
		@DbRecordField(dataSourceName="R_SCHD_WEB_SEARCH_IND")
		public NString RSchdWebSearchInd;
		@DbRecordField(dataSourceName="R_CAMP_WEB_SEARCH_IND")
		public NString RCampWebSearchInd;
		@DbRecordField(dataSourceName="R_SESS_WEB_SEARCH_IND")
		public NString RSessWebSearchInd;
		@DbRecordField(dataSourceName="R_INSTR_WEB_SEARCH_IND")
		public NString RInstrWebSearchInd;
		@DbRecordField(dataSourceName="R_FACSCHD_WEB_DISP_IND")
		public NString RFacschdWebDispInd;
		@DbRecordField(dataSourceName="R_CLASLST_WEB_DISP_IND")
		public NString RClaslstWebDispInd;
		@DbRecordField(dataSourceName="R_OVERAPP_WEB_UPD_IND")
		public NString ROverappWebUpdInd;
		@DbRecordField(dataSourceName="R_ADD_DRP_WEB_UPD_IND")
		public NString RAddDrpWebUpdInd;
		@DbRecordField(dataSourceName="R_DEGREE_SEVERITY")
		public NString RDegreeSeverity;
		@DbRecordField(dataSourceName="R_PROGRAM_SEVERITY")
		public NString RProgramSeverity;
		@DbRecordField(dataSourceName="R_DEPT_SEVERITY")
		public NString RDeptSeverity;
		@DbRecordField(dataSourceName="R_ATTS_SEVERITY")
		public NString RAttsSeverity;
		@DbRecordField(dataSourceName="R_CHRT_SEVERITY")
		public NString RChrtSeverity;
		@DbRecordField(dataSourceName="R_MEXC_SEVERITY")
		public NString RMexcSeverity;
		@DbRecordField(dataSourceName="R_INPROGRESS_USAGE_IND")
		public NString RInprogressUsageInd;
		@DbRecordField(dataSourceName="R_GRADE_DETAIL_WEB_IND")
		public NString RGradeDetailWebInd;
		@DbRecordField(dataSourceName="R_MIDTERM_WEB_IND")
		public NString RMidtermWebInd;
		@DbRecordField(dataSourceName="R_PROFILE_SEND_IND")
		public NString RProfileSendInd;
		@DbRecordField(dataSourceName="R_CUTOFF_DATE")
		public NDate RCutoffDate;
		@DbRecordField(dataSourceName="R_TIV_DATE_SOURCE")
		public NString RTivDateSource;
		@DbRecordField(dataSourceName="R_WEB_CAPP_TERM_IND")
		public NString RWebCappTermInd;
		@DbRecordField(dataSourceName="R_WEB_CAPP_CATLG_IND")
		public NString RWebCappCatlgInd;
		@DbRecordField(dataSourceName="R_ATTR_WEB_SEARCH_IND")
		public NString RAttrWebSearchInd;
		@DbRecordField(dataSourceName="R_LEVL_WEB_SEARCH_IND")
		public NString RLevlWebSearchInd;
		@DbRecordField(dataSourceName="R_INSM_WEB_SEARCH_IND")
		public NString RInsmWebSearchInd;
		@DbRecordField(dataSourceName="R_LS_TITLE_WEBS_DISP_IND")
		public NString RLsTitleWebsDispInd;
		@DbRecordField(dataSourceName="R_LS_DESC_WEBS_DISP_IND")
		public NString RLsDescWebsDispInd;
		@DbRecordField(dataSourceName="R_DURATION_WEB_SRCH_IND")
		public NString RDurationWebSrchInd;
		@DbRecordField(dataSourceName="R_LEVL_WEB_CATL_SRCH_IND")
		public NString RLevlWebCatlSrchInd;
		@DbRecordField(dataSourceName="R_STYP_WEB_CATL_SRCH_IND")
		public NString RStypWebCatlSrchInd;
		@DbRecordField(dataSourceName="R_COLL_WEB_CATL_SRCH_IND")
		public NString RCollWebCatlSrchInd;
		@DbRecordField(dataSourceName="R_DIV_WEB_CATL_SRCH_IND")
		public NString RDivWebCatlSrchInd;
		@DbRecordField(dataSourceName="R_DEPT_WEB_CATL_SRCH_IND")
		public NString RDeptWebCatlSrchInd;
		@DbRecordField(dataSourceName="R_PROG_ATT_WEBC_SRCH_IND")
		public NString RProgAttWebcSrchInd;
		@DbRecordField(dataSourceName="R_LC_TITLE_WEBC_DISP_IND")
		public NString RLcTitleWebcDispInd;
		@DbRecordField(dataSourceName="R_LC_DESC_WEBC_DISP_IND")
		public NString RLcDescWebcDispInd;
		@DbRecordField(dataSourceName="R_DYNAMIC_SCHED_TERM_IND")
		public NString RDynamicSchedTermInd;
		@DbRecordField(dataSourceName="R_ASSESS_SWAP_IND")
		public NString RAssessSwapInd;
		@DbRecordField(dataSourceName="R_ASSESS_REV_NRF_IND")
		public NString RAssessRevNrfInd;
		@DbRecordField(dataSourceName="R_ASSESS_REG_GRACE_IND")
		public NString RAssessRegGraceInd;
		@DbRecordField(dataSourceName="R_STUDY_PATH_IND")
		public NString RStudyPathInd;
		@DbRecordField(dataSourceName="R_FUTURE_REPEAT_IND")
		public NString RFutureRepeatInd;
		@DbRecordField(dataSourceName="R_SP_WEB_UPD_IND")
		public NString RSpWebUpdInd;
		@DbRecordField(dataSourceName="R_SECTIONFEE_IND")
		public NString RSectionfeeInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
