package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlAcadsessionExp {
		public static DataCursor fSelectSessions(NNumber pPidmIn,NString pLevlCodeIn,NString pSummaryTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSESSION_EXP.F_SELECT_SESSIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
			cmd.addParameter("@P_SUMMARY_TYPE_IN", pSummaryTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectSessions(NNumber pPidmIn,NString pLevlCodeIn,NString pSummaryTypeIn,NString pScpsStatsticsInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSESSION_EXP.F_SELECT_SESSIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
			cmd.addParameter("@P_SUMMARY_TYPE_IN", pSummaryTypeIn);
			cmd.addParameter("@P_SCPS_STATSTICS_IND", pScpsStatsticsInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectSessionsInprogress(NNumber pPidmIn,NString pLevlCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSESSION_EXP.F_SELECT_SESSIONS_INPROGRESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectSessionsInprogress(NNumber pPidmIn,NString pLevlCodeIn,NString pScpsStatsticsInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSESSION_EXP.F_SELECT_SESSIONS_INPROGRESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
			cmd.addParameter("@P_SCPS_STATSTICS_IND", pScpsStatsticsInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectSessionsTransfer(NNumber pPidmIn,NString pLevlCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSESSION_EXP.F_SELECT_SESSIONS_TRANSFER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pAcrecAcadsessInprgElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pRequestTermIn,NString pInProgTermIn,NString pLevlCodeIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,NString pCampusSelIn,NString pCampCodeIn,Ref<NString> pSessiondesignatorOut,Ref<NString> pSessiondesignatorsuffixOut,Ref<NString> pSessionnameOut,Ref<NString> pSessiontypeOut,Ref<NString> pSessionbegindateOut,Ref<NString> pSessionenddateOut,Ref<NString> pSessdetailNotemessageOut,Ref<NString> pStudentlevelcodeOut,Ref<NString> pStulevlNotemessageOut,Ref<NString> pAcadsessionNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSESSION_EXP.P_ACREC_ACADSESS_INPRG_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_IN_PROG_TERM_IN", pInProgTermIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_CAMPUS_SEL_IN", pCampusSelIn);
			cmd.addParameter("@P_CAMP_CODE_IN", pCampCodeIn);
			cmd.addParameter("@P_SESSIONDESIGNATOR_OUT", NString.class);
			cmd.addParameter("@P_SESSIONDESIGNATORSUFFIX_OUT", NString.class);
			cmd.addParameter("@P_SESSIONNAME_OUT", NString.class);
			cmd.addParameter("@P_SESSIONTYPE_OUT", NString.class);
			cmd.addParameter("@P_SESSIONBEGINDATE_OUT", NString.class);
			cmd.addParameter("@P_SESSIONENDDATE_OUT", NString.class);
			cmd.addParameter("@P_SESSDETAIL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_STUDENTLEVELCODE_OUT", NString.class);
			cmd.addParameter("@P_STULEVL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_ACADSESSION_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pSessiondesignatorOut.val = cmd.getParameterValue("@P_SESSIONDESIGNATOR_OUT", NString.class);
			pSessiondesignatorsuffixOut.val = cmd.getParameterValue("@P_SESSIONDESIGNATORSUFFIX_OUT", NString.class);
			pSessionnameOut.val = cmd.getParameterValue("@P_SESSIONNAME_OUT", NString.class);
			pSessiontypeOut.val = cmd.getParameterValue("@P_SESSIONTYPE_OUT", NString.class);
			pSessionbegindateOut.val = cmd.getParameterValue("@P_SESSIONBEGINDATE_OUT", NString.class);
			pSessionenddateOut.val = cmd.getParameterValue("@P_SESSIONENDDATE_OUT", NString.class);
			pSessdetailNotemessageOut.val = cmd.getParameterValue("@P_SESSDETAIL_NOTEMESSAGE_OUT", NString.class);
			pStudentlevelcodeOut.val = cmd.getParameterValue("@P_STUDENTLEVELCODE_OUT", NString.class);
			pStulevlNotemessageOut.val = cmd.getParameterValue("@P_STULEVL_NOTEMESSAGE_OUT", NString.class);
			pAcadsessionNotemessageOut.val = cmd.getParameterValue("@P_ACADSESSION_NOTEMESSAGE_OUT", NString.class);


		}
		
		public static void pAcrecAcadsessInprgElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pRequestTermIn,NString pInProgTermIn,NString pLevlCodeIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,NString pCampusSelIn,NString pCampCodeIn,Ref<NString> pSessiondesignatorOut,Ref<NString> pSessiondesignatorsuffixOut,Ref<NString> pSessionnameOut,Ref<NString> pSessiontypeOut,Ref<NString> pSessionbegindateOut,Ref<NString> pSessionenddateOut,Ref<NString> pSessdetailNotemessageOut,Ref<NString> pStudentlevelcodeOut,Ref<NString> pStulevlNotemessageOut,Ref<NString> pAcadsessionNotemessageOut,NString pScpsStatsticsInd,NString pScpsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSESSION_EXP.P_ACREC_ACADSESS_INPRG_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_IN_PROG_TERM_IN", pInProgTermIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_CAMPUS_SEL_IN", pCampusSelIn);
			cmd.addParameter("@P_CAMP_CODE_IN", pCampCodeIn);
			cmd.addParameter("@P_SESSIONDESIGNATOR_OUT", NString.class);
			cmd.addParameter("@P_SESSIONDESIGNATORSUFFIX_OUT", NString.class);
			cmd.addParameter("@P_SESSIONNAME_OUT", NString.class);
			cmd.addParameter("@P_SESSIONTYPE_OUT", NString.class);
			cmd.addParameter("@P_SESSIONBEGINDATE_OUT", NString.class);
			cmd.addParameter("@P_SESSIONENDDATE_OUT", NString.class);
			cmd.addParameter("@P_SESSDETAIL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_STUDENTLEVELCODE_OUT", NString.class);
			cmd.addParameter("@P_STULEVL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_ACADSESSION_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_SCPS_STATSTICS_IND", pScpsStatsticsInd);
			cmd.addParameter("@P_SCPS_CODE_IN", pScpsCodeIn);
				
			cmd.execute();
			pSessiondesignatorOut.val = cmd.getParameterValue("@P_SESSIONDESIGNATOR_OUT", NString.class);
			pSessiondesignatorsuffixOut.val = cmd.getParameterValue("@P_SESSIONDESIGNATORSUFFIX_OUT", NString.class);
			pSessionnameOut.val = cmd.getParameterValue("@P_SESSIONNAME_OUT", NString.class);
			pSessiontypeOut.val = cmd.getParameterValue("@P_SESSIONTYPE_OUT", NString.class);
			pSessionbegindateOut.val = cmd.getParameterValue("@P_SESSIONBEGINDATE_OUT", NString.class);
			pSessionenddateOut.val = cmd.getParameterValue("@P_SESSIONENDDATE_OUT", NString.class);
			pSessdetailNotemessageOut.val = cmd.getParameterValue("@P_SESSDETAIL_NOTEMESSAGE_OUT", NString.class);
			pStudentlevelcodeOut.val = cmd.getParameterValue("@P_STUDENTLEVELCODE_OUT", NString.class);
			pStulevlNotemessageOut.val = cmd.getParameterValue("@P_STULEVL_NOTEMESSAGE_OUT", NString.class);
			pAcadsessionNotemessageOut.val = cmd.getParameterValue("@P_ACADSESSION_NOTEMESSAGE_OUT", NString.class);


		}
		
		public static void pAcrecAcadsessInstElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pSessionTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,Ref<NString> pSessiondesignatorOut,Ref<NString> pSessiondesignatorsuffixOut,Ref<NString> pSessionnameOut,Ref<NString> pSessiontypeOut,Ref<NString> pSessionbegindateOut,Ref<NString> pSessionenddateOut,Ref<NString> pSessdetailNotemessageOut,Ref<NString> pStudentlevelcodeOut,Ref<NString> pStulevlNotemessageOut,Ref<DataCursor> pAcadsessionNotemessageRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSESSION_EXP.P_ACREC_ACADSESS_INST_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_SESSION_TERM_IN", pSessionTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_SESSIONDESIGNATOR_OUT", NString.class);
			cmd.addParameter("@P_SESSIONDESIGNATORSUFFIX_OUT", NString.class);
			cmd.addParameter("@P_SESSIONNAME_OUT", NString.class);
			cmd.addParameter("@P_SESSIONTYPE_OUT", NString.class);
			cmd.addParameter("@P_SESSIONBEGINDATE_OUT", NString.class);
			cmd.addParameter("@P_SESSIONENDDATE_OUT", NString.class);
			cmd.addParameter("@P_SESSDETAIL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_STUDENTLEVELCODE_OUT", NString.class);
			cmd.addParameter("@P_STULEVL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_ACADSESSION_NOTEMESSAGE_REF", DataCursor.class);
				
			cmd.execute();
			pSessiondesignatorOut.val = cmd.getParameterValue("@P_SESSIONDESIGNATOR_OUT", NString.class);
			pSessiondesignatorsuffixOut.val = cmd.getParameterValue("@P_SESSIONDESIGNATORSUFFIX_OUT", NString.class);
			pSessionnameOut.val = cmd.getParameterValue("@P_SESSIONNAME_OUT", NString.class);
			pSessiontypeOut.val = cmd.getParameterValue("@P_SESSIONTYPE_OUT", NString.class);
			pSessionbegindateOut.val = cmd.getParameterValue("@P_SESSIONBEGINDATE_OUT", NString.class);
			pSessionenddateOut.val = cmd.getParameterValue("@P_SESSIONENDDATE_OUT", NString.class);
			pSessdetailNotemessageOut.val = cmd.getParameterValue("@P_SESSDETAIL_NOTEMESSAGE_OUT", NString.class);
			pStudentlevelcodeOut.val = cmd.getParameterValue("@P_STUDENTLEVELCODE_OUT", NString.class);
			pStulevlNotemessageOut.val = cmd.getParameterValue("@P_STULEVL_NOTEMESSAGE_OUT", NString.class);
			pAcadsessionNotemessageRef.val = cmd.getParameterValue("@P_ACADSESSION_NOTEMESSAGE_REF", DataCursor.class);


		}
		
		public static void pAcrecAcadsessInstElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pSessionTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,Ref<NString> pSessiondesignatorOut,Ref<NString> pSessiondesignatorsuffixOut,Ref<NString> pSessionnameOut,Ref<NString> pSessiontypeOut,Ref<NString> pSessionbegindateOut,Ref<NString> pSessionenddateOut,Ref<NString> pSessdetailNotemessageOut,Ref<NString> pStudentlevelcodeOut,Ref<NString> pStulevlNotemessageOut,Ref<DataCursor> pAcadsessionNotemessageRef,NString pScpsStatsticsInd,NString pScpsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSESSION_EXP.P_ACREC_ACADSESS_INST_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_SESSION_TERM_IN", pSessionTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_SESSIONDESIGNATOR_OUT", NString.class);
			cmd.addParameter("@P_SESSIONDESIGNATORSUFFIX_OUT", NString.class);
			cmd.addParameter("@P_SESSIONNAME_OUT", NString.class);
			cmd.addParameter("@P_SESSIONTYPE_OUT", NString.class);
			cmd.addParameter("@P_SESSIONBEGINDATE_OUT", NString.class);
			cmd.addParameter("@P_SESSIONENDDATE_OUT", NString.class);
			cmd.addParameter("@P_SESSDETAIL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_STUDENTLEVELCODE_OUT", NString.class);
			cmd.addParameter("@P_STULEVL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_ACADSESSION_NOTEMESSAGE_REF", DataCursor.class);
			cmd.addParameter("@P_SCPS_STATSTICS_IND", pScpsStatsticsInd);
			cmd.addParameter("@P_SCPS_CODE_IN", pScpsCodeIn);
				
			cmd.execute();
			pSessiondesignatorOut.val = cmd.getParameterValue("@P_SESSIONDESIGNATOR_OUT", NString.class);
			pSessiondesignatorsuffixOut.val = cmd.getParameterValue("@P_SESSIONDESIGNATORSUFFIX_OUT", NString.class);
			pSessionnameOut.val = cmd.getParameterValue("@P_SESSIONNAME_OUT", NString.class);
			pSessiontypeOut.val = cmd.getParameterValue("@P_SESSIONTYPE_OUT", NString.class);
			pSessionbegindateOut.val = cmd.getParameterValue("@P_SESSIONBEGINDATE_OUT", NString.class);
			pSessionenddateOut.val = cmd.getParameterValue("@P_SESSIONENDDATE_OUT", NString.class);
			pSessdetailNotemessageOut.val = cmd.getParameterValue("@P_SESSDETAIL_NOTEMESSAGE_OUT", NString.class);
			pStudentlevelcodeOut.val = cmd.getParameterValue("@P_STUDENTLEVELCODE_OUT", NString.class);
			pStulevlNotemessageOut.val = cmd.getParameterValue("@P_STULEVL_NOTEMESSAGE_OUT", NString.class);
			pAcadsessionNotemessageRef.val = cmd.getParameterValue("@P_ACADSESSION_NOTEMESSAGE_REF", DataCursor.class);


		}
		
		public static void pAcrecAcadsessTransElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pSessionTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,NNumber pTritSeqNoIn,NNumber pTramSeqNoIn,Ref<NString> pSessiondesignatorOut,Ref<NString> pSessiondesignatorsuffixOut,Ref<NString> pSessionnameOut,Ref<NString> pSessiontypeOut,Ref<NString> pSessionbegindateOut,Ref<NString> pSessionenddateOut,Ref<NString> pSessdetailNotemessageOut,Ref<NString> pStudentlevelcodeOut,Ref<NString> pStulevlNotemessageOut,Ref<NString> pAcadsessionNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSESSION_EXP.P_ACREC_ACADSESS_TRANS_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_SESSION_TERM_IN", pSessionTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_TRIT_SEQ_NO_IN", pTritSeqNoIn);
			cmd.addParameter("@P_TRAM_SEQ_NO_IN", pTramSeqNoIn);
			cmd.addParameter("@P_SESSIONDESIGNATOR_OUT", NString.class);
			cmd.addParameter("@P_SESSIONDESIGNATORSUFFIX_OUT", NString.class);
			cmd.addParameter("@P_SESSIONNAME_OUT", NString.class);
			cmd.addParameter("@P_SESSIONTYPE_OUT", NString.class);
			cmd.addParameter("@P_SESSIONBEGINDATE_OUT", NString.class);
			cmd.addParameter("@P_SESSIONENDDATE_OUT", NString.class);
			cmd.addParameter("@P_SESSDETAIL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_STUDENTLEVELCODE_OUT", NString.class);
			cmd.addParameter("@P_STULEVL_NOTEMESSAGE_OUT", NString.class);
			cmd.addParameter("@P_ACADSESSION_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pSessiondesignatorOut.val = cmd.getParameterValue("@P_SESSIONDESIGNATOR_OUT", NString.class);
			pSessiondesignatorsuffixOut.val = cmd.getParameterValue("@P_SESSIONDESIGNATORSUFFIX_OUT", NString.class);
			pSessionnameOut.val = cmd.getParameterValue("@P_SESSIONNAME_OUT", NString.class);
			pSessiontypeOut.val = cmd.getParameterValue("@P_SESSIONTYPE_OUT", NString.class);
			pSessionbegindateOut.val = cmd.getParameterValue("@P_SESSIONBEGINDATE_OUT", NString.class);
			pSessionenddateOut.val = cmd.getParameterValue("@P_SESSIONENDDATE_OUT", NString.class);
			pSessdetailNotemessageOut.val = cmd.getParameterValue("@P_SESSDETAIL_NOTEMESSAGE_OUT", NString.class);
			pStudentlevelcodeOut.val = cmd.getParameterValue("@P_STUDENTLEVELCODE_OUT", NString.class);
			pStulevlNotemessageOut.val = cmd.getParameterValue("@P_STULEVL_NOTEMESSAGE_OUT", NString.class);
			pAcadsessionNotemessageOut.val = cmd.getParameterValue("@P_ACADSESSION_NOTEMESSAGE_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="AcademicSessionRow", dataSourceName="ACADEMIC_SESSION")
	public static class AcademicSessionRow
	{
		@DbRecordField(dataSourceName="TERM_CODE")
		public NString TermCode;
	}

	
	@DbRecordType(id="AcademicSessionTermCommentRow", dataSourceName="ACADEMIC_SESSION_TERM_COMMENT")
	public static class AcademicSessionTermCommentRow
	{
		@DbRecordField(dataSourceName="TTCM_SEQ_NO")
		public NNumber TtcmSeqNo;
		@DbRecordField(dataSourceName="TTCM_COMMENT")
		public NString TtcmComment;
	}

	
	@DbRecordType(id="AcademicSessionTransferRow", dataSourceName="ACADEMIC_SESSION_TRANSFER")
	public static class AcademicSessionTransferRow
	{
		@DbRecordField(dataSourceName="TRIT_SEQ_NO")
		public NNumber TritSeqNo;
		@DbRecordField(dataSourceName="TRAM_SEQ_NO")
		public NNumber TramSeqNo;
		@DbRecordField(dataSourceName="TERM_ENTERED")
		public NString TermEntered;
	}

	
	@DbRecordType(id="ScpsAcademicSessionRow", dataSourceName="SCPS_ACADEMIC_SESSION")
	public static class ScpsAcademicSessionRow
	{
		@DbRecordField(dataSourceName="SESSION_TERM_CODE")
		public NString SessionTermCode;
		@DbRecordField(dataSourceName="SCPS_CODE")
		public NString ScpsCode;
	}

	
	
}
