package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlAcadsummaryExp {
		public static NString fAcademicsummarytype(NNumber pidmIn,NString levlCodeIn,NString typeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSUMMARY_EXP.F_ACADEMICSUMMARYTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
			cmd.addParameter("@TYPE_IN", typeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDelinquencies(NNumber pRequestPidmIn,NString pRequestLevlIn,NString pRequestTermIn,NString pCampusSelIn,NString pCampCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSUMMARY_EXP.F_DELINQUENCIES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_CAMPUS_SEL_IN", pCampusSelIn);
			cmd.addParameter("@P_CAMP_CODE_IN", pCampCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExitdate(NNumber pRequestPidmIn,NString pRequestLevlIn,NString pRequestTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSUMMARY_EXP.F_EXITDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSessionDelinquencies(NNumber pRequestPidmIn,NString pCurrentTermIn,NString pCampusSelIn,NString pCampCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSUMMARY_EXP.F_SESSION_DELINQUENCIES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_CURRENT_TERM_IN", pCurrentTermIn);
			cmd.addParameter("@P_CAMPUS_SEL_IN", pCampusSelIn);
			cmd.addParameter("@P_CAMP_CODE_IN", pCampCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAcawardAcsumDegrElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pRequestTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,NNumber pDgmrSeqNoIn,NString pCampCodeIn,Ref<NString> pAcademicsummarytypeOut,Ref<NString> pAcademicsummarylevelOut,Ref<NNumber> pCredithoursattemptedOut,Ref<NNumber> pCredithoursearnedOut,Ref<NString> pCreditunitOut,Ref<NNumber> pGradepointaverageOut,Ref<NNumber> pTotalqualitypointsOut,Ref<NNumber> pCredithoursforgpaOut,Ref<NString> pGpaNotemessageOut,Ref<NString> pHonorsTitleOut,Ref<NString> pHonorsLevelOut,Ref<NString> pHonorsNotemessageOut,Ref<NNumber> pClassrankOut,Ref<NNumber> pClasssizeOut,Ref<NString> pAcadsumNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSUMMARY_EXP.P_ACAWARD_ACSUM_DEGR_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_DGMR_SEQ_NO_IN", pDgmrSeqNoIn);
			cmd.addParameter("@P_CAMP_CODE_IN", pCampCodeIn);
			cmd.addParameter("@P_ACADEMICSUMMARYTYPE_OUT", NString.class);
			cmd.addParameter("@P_ACADEMICSUMMARYLEVEL_OUT", NString.class);
			cmd.addParameter("@P_CREDITHOURSATTEMPTED_OUT", NNumber.class);
			cmd.addParameter("@P_CREDITHOURSEARNED_OUT", NNumber.class);
			cmd.addParameter("@P_CREDITUNIT_OUT", NString.class);
			cmd.addParameter("@P_GRADEPOINTAVERAGE_OUT", NNumber.class);
			cmd.addParameter("@P_TOTALQUALITYPOINTS_OUT", NNumber.class);
			cmd.addParameter("@P_CREDITHOURSFORGPA_OUT", NNumber.class);
			cmd.addParameter("@P_GPA_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_HONORS_TITLE_OUT", NString.class);
			cmd.addParameter("@P_HONORS_LEVEL_OUT", NString.class);
			cmd.addParameter("@P_HONORS_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_CLASSRANK_OUT", NNumber.class);
			cmd.addParameter("@P_CLASSSIZE_OUT", NNumber.class);
			cmd.addParameter("@P_ACADSUM_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pAcademicsummarytypeOut.val = cmd.getParameterValue("@P_ACADEMICSUMMARYTYPE_OUT", NString.class);
			pAcademicsummarylevelOut.val = cmd.getParameterValue("@P_ACADEMICSUMMARYLEVEL_OUT", NString.class);
			pCredithoursattemptedOut.val = cmd.getParameterValue("@P_CREDITHOURSATTEMPTED_OUT", NNumber.class);
			pCredithoursearnedOut.val = cmd.getParameterValue("@P_CREDITHOURSEARNED_OUT", NNumber.class);
			pCreditunitOut.val = cmd.getParameterValue("@P_CREDITUNIT_OUT", NString.class);
			pGradepointaverageOut.val = cmd.getParameterValue("@P_GRADEPOINTAVERAGE_OUT", NNumber.class);
			pTotalqualitypointsOut.val = cmd.getParameterValue("@P_TOTALQUALITYPOINTS_OUT", NNumber.class);
			pCredithoursforgpaOut.val = cmd.getParameterValue("@P_CREDITHOURSFORGPA_OUT", NNumber.class);
			pGpaNotemessageOut.val = cmd.getParameterValue("@P_GPA_NOTEMESSAGE_OUT", NString.class);
			pHonorsTitleOut.val = cmd.getParameterValue("@P_HONORS_TITLE_OUT", NString.class);
			pHonorsLevelOut.val = cmd.getParameterValue("@P_HONORS_LEVEL_OUT", NString.class);
			pHonorsNotemessageOut.val = cmd.getParameterValue("@P_HONORS_NOTEMESSAGE_OUT", NString.class);
			pClassrankOut.val = cmd.getParameterValue("@P_CLASSRANK_OUT", NNumber.class);
			pClasssizeOut.val = cmd.getParameterValue("@P_CLASSSIZE_OUT", NNumber.class);
			pAcadsumNotemessageOut.val = cmd.getParameterValue("@P_ACADSUM_NOTEMESSAGE_OUT", NString.class);


		}
		
		public static void pAcrecAcsumElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pRequestTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,NString pSummarytypeIn,NString pCampusSelIn,NString pCampCodeIn,Ref<NString> pAcademicsummarytypeOut,Ref<NString> pAcademicsummarylevelOut,Ref<NNumber> pCredithoursattemptedOut,Ref<NNumber> pCredithoursearnedOut,Ref<NString> pCreditunitOut,Ref<NNumber> pGradepointaverageOut,Ref<NNumber> pTotalqualitypointsOut,Ref<NNumber> pCredithoursforgpaOut,Ref<NString> pGpaNotemessageOut,Ref<NString> pHonorsTitleOut,Ref<NString> pHonorsLevelOut,Ref<NString> pHonorsNotemessageOut,Ref<NNumber> pClassrankOut,Ref<NNumber> pClasssizeOut,Ref<DataCursor> pAcadsumNotemessageRef,Ref<NString> pDelinquenciesOut,Ref<NString> pExitdateOut,Ref<DataCursor> pAcademicEventRefOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSUMMARY_EXP.P_ACREC_ACSUM_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_SUMMARYTYPE_IN", pSummarytypeIn);
			cmd.addParameter("@P_CAMPUS_SEL_IN", pCampusSelIn);
			cmd.addParameter("@P_CAMP_CODE_IN", pCampCodeIn);
			cmd.addParameter("@P_ACADEMICSUMMARYTYPE_OUT", NString.class);
			cmd.addParameter("@P_ACADEMICSUMMARYLEVEL_OUT", NString.class);
			cmd.addParameter("@P_CREDITHOURSATTEMPTED_OUT", NNumber.class);
			cmd.addParameter("@P_CREDITHOURSEARNED_OUT", NNumber.class);
			cmd.addParameter("@P_CREDITUNIT_OUT", NString.class);
			cmd.addParameter("@P_GRADEPOINTAVERAGE_OUT", NNumber.class);
			cmd.addParameter("@P_TOTALQUALITYPOINTS_OUT", NNumber.class);
			cmd.addParameter("@P_CREDITHOURSFORGPA_OUT", NNumber.class);
			cmd.addParameter("@P_GPA_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_HONORS_TITLE_OUT", NString.class);
			cmd.addParameter("@P_HONORS_LEVEL_OUT", NString.class);
			cmd.addParameter("@P_HONORS_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_CLASSRANK_OUT", NNumber.class);
			cmd.addParameter("@P_CLASSSIZE_OUT", NNumber.class);
			cmd.addParameter("@P_ACADSUM_NOTEMESSAGE_REF", DataCursor.class);
			cmd.addParameter("@P_DELINQUENCIES_OUT", NString.class);
			cmd.addParameter("@P_EXITDATE_OUT", NString.class);
			cmd.addParameter("@P_ACADEMIC_EVENT_REF_OUT", DataCursor.class);
				
			cmd.execute();
			pAcademicsummarytypeOut.val = cmd.getParameterValue("@P_ACADEMICSUMMARYTYPE_OUT", NString.class);
			pAcademicsummarylevelOut.val = cmd.getParameterValue("@P_ACADEMICSUMMARYLEVEL_OUT", NString.class);
			pCredithoursattemptedOut.val = cmd.getParameterValue("@P_CREDITHOURSATTEMPTED_OUT", NNumber.class);
			pCredithoursearnedOut.val = cmd.getParameterValue("@P_CREDITHOURSEARNED_OUT", NNumber.class);
			pCreditunitOut.val = cmd.getParameterValue("@P_CREDITUNIT_OUT", NString.class);
			pGradepointaverageOut.val = cmd.getParameterValue("@P_GRADEPOINTAVERAGE_OUT", NNumber.class);
			pTotalqualitypointsOut.val = cmd.getParameterValue("@P_TOTALQUALITYPOINTS_OUT", NNumber.class);
			pCredithoursforgpaOut.val = cmd.getParameterValue("@P_CREDITHOURSFORGPA_OUT", NNumber.class);
			pGpaNotemessageOut.val = cmd.getParameterValue("@P_GPA_NOTEMESSAGE_OUT", NString.class);
			pHonorsTitleOut.val = cmd.getParameterValue("@P_HONORS_TITLE_OUT", NString.class);
			pHonorsLevelOut.val = cmd.getParameterValue("@P_HONORS_LEVEL_OUT", NString.class);
			pHonorsNotemessageOut.val = cmd.getParameterValue("@P_HONORS_NOTEMESSAGE_OUT", NString.class);
			pClassrankOut.val = cmd.getParameterValue("@P_CLASSRANK_OUT", NNumber.class);
			pClasssizeOut.val = cmd.getParameterValue("@P_CLASSSIZE_OUT", NNumber.class);
			pAcadsumNotemessageRef.val = cmd.getParameterValue("@P_ACADSUM_NOTEMESSAGE_REF", DataCursor.class);
			pDelinquenciesOut.val = cmd.getParameterValue("@P_DELINQUENCIES_OUT", NString.class);
			pExitdateOut.val = cmd.getParameterValue("@P_EXITDATE_OUT", NString.class);
			pAcademicEventRefOut.val = cmd.getParameterValue("@P_ACADEMIC_EVENT_REF_OUT", DataCursor.class);


		}
		
		public static void pAcsessAcsumElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pCurrentTermIn,NString pRequestLevlIn,NNumber pTritSeqNoIn,NNumber pTramSeqNoIn,NString pSummarytypeIn,NString pCampusSelIn,NString pCampCodeIn,Ref<NString> pAcademicsummarytypeOut,Ref<NString> pAcademicsummarylevelOut,Ref<NNumber> pCredithoursattemptedOut,Ref<NNumber> pCredithoursearnedOut,Ref<NString> pCreditunitOut,Ref<NNumber> pGradepointaverageOut,Ref<NNumber> pTotalqualitypointsOut,Ref<NNumber> pCredithoursforgpaOut,Ref<NString> pGpaNotemessageOut,Ref<NString> pHonorsTitleOut,Ref<NString> pHonorsLevelOut,Ref<NString> pHonorsNotemessageOut,Ref<NNumber> pClassrankOut,Ref<NNumber> pClasssizeOut,Ref<NString> pAcadsumNotemessageOut,Ref<NString> pDelinquenciesOut,Ref<NString> pExitdateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSUMMARY_EXP.P_ACSESS_ACSUM_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_CURRENT_TERM_IN", pCurrentTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_TRIT_SEQ_NO_IN", pTritSeqNoIn);
			cmd.addParameter("@P_TRAM_SEQ_NO_IN", pTramSeqNoIn);
			cmd.addParameter("@P_SUMMARYTYPE_IN", pSummarytypeIn);
			cmd.addParameter("@P_CAMPUS_SEL_IN", pCampusSelIn);
			cmd.addParameter("@P_CAMP_CODE_IN", pCampCodeIn);
			cmd.addParameter("@P_ACADEMICSUMMARYTYPE_OUT", NString.class);
			cmd.addParameter("@P_ACADEMICSUMMARYLEVEL_OUT", NString.class);
			cmd.addParameter("@P_CREDITHOURSATTEMPTED_OUT", NNumber.class);
			cmd.addParameter("@P_CREDITHOURSEARNED_OUT", NNumber.class);
			cmd.addParameter("@P_CREDITUNIT_OUT", NString.class);
			cmd.addParameter("@P_GRADEPOINTAVERAGE_OUT", NNumber.class);
			cmd.addParameter("@P_TOTALQUALITYPOINTS_OUT", NNumber.class);
			cmd.addParameter("@P_CREDITHOURSFORGPA_OUT", NNumber.class);
			cmd.addParameter("@P_GPA_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_HONORS_TITLE_OUT", NString.class);
			cmd.addParameter("@P_HONORS_LEVEL_OUT", NString.class);
			cmd.addParameter("@P_HONORS_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_CLASSRANK_OUT", NNumber.class);
			cmd.addParameter("@P_CLASSSIZE_OUT", NNumber.class);
			cmd.addParameter("@P_ACADSUM_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_DELINQUENCIES_OUT", NString.class);
			cmd.addParameter("@P_EXITDATE_OUT", NString.class);
				
			cmd.execute();
			pAcademicsummarytypeOut.val = cmd.getParameterValue("@P_ACADEMICSUMMARYTYPE_OUT", NString.class);
			pAcademicsummarylevelOut.val = cmd.getParameterValue("@P_ACADEMICSUMMARYLEVEL_OUT", NString.class);
			pCredithoursattemptedOut.val = cmd.getParameterValue("@P_CREDITHOURSATTEMPTED_OUT", NNumber.class);
			pCredithoursearnedOut.val = cmd.getParameterValue("@P_CREDITHOURSEARNED_OUT", NNumber.class);
			pCreditunitOut.val = cmd.getParameterValue("@P_CREDITUNIT_OUT", NString.class);
			pGradepointaverageOut.val = cmd.getParameterValue("@P_GRADEPOINTAVERAGE_OUT", NNumber.class);
			pTotalqualitypointsOut.val = cmd.getParameterValue("@P_TOTALQUALITYPOINTS_OUT", NNumber.class);
			pCredithoursforgpaOut.val = cmd.getParameterValue("@P_CREDITHOURSFORGPA_OUT", NNumber.class);
			pGpaNotemessageOut.val = cmd.getParameterValue("@P_GPA_NOTEMESSAGE_OUT", NString.class);
			pHonorsTitleOut.val = cmd.getParameterValue("@P_HONORS_TITLE_OUT", NString.class);
			pHonorsLevelOut.val = cmd.getParameterValue("@P_HONORS_LEVEL_OUT", NString.class);
			pHonorsNotemessageOut.val = cmd.getParameterValue("@P_HONORS_NOTEMESSAGE_OUT", NString.class);
			pClassrankOut.val = cmd.getParameterValue("@P_CLASSRANK_OUT", NNumber.class);
			pClasssizeOut.val = cmd.getParameterValue("@P_CLASSSIZE_OUT", NNumber.class);
			pAcadsumNotemessageOut.val = cmd.getParameterValue("@P_ACADSUM_NOTEMESSAGE_OUT", NString.class);
			pDelinquenciesOut.val = cmd.getParameterValue("@P_DELINQUENCIES_OUT", NString.class);
			pExitdateOut.val = cmd.getParameterValue("@P_EXITDATE_OUT", NString.class);


		}
		
		public static void pAcsessAcsumElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pCurrentTermIn,NString pRequestLevlIn,NNumber pTritSeqNoIn,NNumber pTramSeqNoIn,NString pSummarytypeIn,NString pCampusSelIn,NString pCampCodeIn,Ref<NString> pAcademicsummarytypeOut,Ref<NString> pAcademicsummarylevelOut,Ref<NNumber> pCredithoursattemptedOut,Ref<NNumber> pCredithoursearnedOut,Ref<NString> pCreditunitOut,Ref<NNumber> pGradepointaverageOut,Ref<NNumber> pTotalqualitypointsOut,Ref<NNumber> pCredithoursforgpaOut,Ref<NString> pGpaNotemessageOut,Ref<NString> pHonorsTitleOut,Ref<NString> pHonorsLevelOut,Ref<NString> pHonorsNotemessageOut,Ref<NNumber> pClassrankOut,Ref<NNumber> pClasssizeOut,Ref<NString> pAcadsumNotemessageOut,Ref<NString> pDelinquenciesOut,Ref<NString> pExitdateOut,NString pScpsStatsticsInd,NString pScpsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSUMMARY_EXP.P_ACSESS_ACSUM_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_CURRENT_TERM_IN", pCurrentTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_TRIT_SEQ_NO_IN", pTritSeqNoIn);
			cmd.addParameter("@P_TRAM_SEQ_NO_IN", pTramSeqNoIn);
			cmd.addParameter("@P_SUMMARYTYPE_IN", pSummarytypeIn);
			cmd.addParameter("@P_CAMPUS_SEL_IN", pCampusSelIn);
			cmd.addParameter("@P_CAMP_CODE_IN", pCampCodeIn);
			cmd.addParameter("@P_ACADEMICSUMMARYTYPE_OUT", NString.class);
			cmd.addParameter("@P_ACADEMICSUMMARYLEVEL_OUT", NString.class);
			cmd.addParameter("@P_CREDITHOURSATTEMPTED_OUT", NNumber.class);
			cmd.addParameter("@P_CREDITHOURSEARNED_OUT", NNumber.class);
			cmd.addParameter("@P_CREDITUNIT_OUT", NString.class);
			cmd.addParameter("@P_GRADEPOINTAVERAGE_OUT", NNumber.class);
			cmd.addParameter("@P_TOTALQUALITYPOINTS_OUT", NNumber.class);
			cmd.addParameter("@P_CREDITHOURSFORGPA_OUT", NNumber.class);
			cmd.addParameter("@P_GPA_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_HONORS_TITLE_OUT", NString.class);
			cmd.addParameter("@P_HONORS_LEVEL_OUT", NString.class);
			cmd.addParameter("@P_HONORS_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_CLASSRANK_OUT", NNumber.class);
			cmd.addParameter("@P_CLASSSIZE_OUT", NNumber.class);
			cmd.addParameter("@P_ACADSUM_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_DELINQUENCIES_OUT", NString.class);
			cmd.addParameter("@P_EXITDATE_OUT", NString.class);
			cmd.addParameter("@P_SCPS_STATSTICS_IND", pScpsStatsticsInd);
			cmd.addParameter("@P_SCPS_CODE_IN", pScpsCodeIn);
				
			cmd.execute();
			pAcademicsummarytypeOut.val = cmd.getParameterValue("@P_ACADEMICSUMMARYTYPE_OUT", NString.class);
			pAcademicsummarylevelOut.val = cmd.getParameterValue("@P_ACADEMICSUMMARYLEVEL_OUT", NString.class);
			pCredithoursattemptedOut.val = cmd.getParameterValue("@P_CREDITHOURSATTEMPTED_OUT", NNumber.class);
			pCredithoursearnedOut.val = cmd.getParameterValue("@P_CREDITHOURSEARNED_OUT", NNumber.class);
			pCreditunitOut.val = cmd.getParameterValue("@P_CREDITUNIT_OUT", NString.class);
			pGradepointaverageOut.val = cmd.getParameterValue("@P_GRADEPOINTAVERAGE_OUT", NNumber.class);
			pTotalqualitypointsOut.val = cmd.getParameterValue("@P_TOTALQUALITYPOINTS_OUT", NNumber.class);
			pCredithoursforgpaOut.val = cmd.getParameterValue("@P_CREDITHOURSFORGPA_OUT", NNumber.class);
			pGpaNotemessageOut.val = cmd.getParameterValue("@P_GPA_NOTEMESSAGE_OUT", NString.class);
			pHonorsTitleOut.val = cmd.getParameterValue("@P_HONORS_TITLE_OUT", NString.class);
			pHonorsLevelOut.val = cmd.getParameterValue("@P_HONORS_LEVEL_OUT", NString.class);
			pHonorsNotemessageOut.val = cmd.getParameterValue("@P_HONORS_NOTEMESSAGE_OUT", NString.class);
			pClassrankOut.val = cmd.getParameterValue("@P_CLASSRANK_OUT", NNumber.class);
			pClasssizeOut.val = cmd.getParameterValue("@P_CLASSSIZE_OUT", NNumber.class);
			pAcadsumNotemessageOut.val = cmd.getParameterValue("@P_ACADSUM_NOTEMESSAGE_OUT", NString.class);
			pDelinquenciesOut.val = cmd.getParameterValue("@P_DELINQUENCIES_OUT", NString.class);
			pExitdateOut.val = cmd.getParameterValue("@P_EXITDATE_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="AcademicEventRow", dataSourceName="ACADEMIC_EVENT")
	public static class AcademicEventRow
	{
		@DbRecordField(dataSourceName="EVEN_CODE")
		public NString EvenCode;
		@DbRecordField(dataSourceName="EVNT_DESC")
		public NString EvntDesc;
		@DbRecordField(dataSourceName="EVNT_DECISION")
		public NString EvntDecision;
		@DbRecordField(dataSourceName="EVNT_GRADE")
		public NString EvntGrade;
	}

	
	@DbRecordType(id="AcademicSummaryLevlCommentRow", dataSourceName="ACADEMIC_SUMMARY_LEVL_COMMENT")
	public static class AcademicSummaryLevlCommentRow
	{
		@DbRecordField(dataSourceName="TMCM_SEQ_NO")
		public NNumber TmcmSeqNo;
		@DbRecordField(dataSourceName="TMCM_COMMENT")
		public NString TmcmComment;
	}

	
	
}
