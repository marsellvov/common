package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkpxex {
		public static NNumber fCountOpenCursors() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_COUNT_OPEN_CURSORS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fDecrypt(NString encryptDecryptValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_DECRYPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ENCRYPT_DECRYPT_VALUE", encryptDecryptValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEncrypt(NString encryptDecryptValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_ENCRYPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ENCRYPT_DECRYPT_VALUE", encryptDecryptValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetValTableCodeDesc(NString pTableName,NString pCodeValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_GET_VAL_TABLE_CODE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_CODE_VALUE", pCodeValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fHoldForDegree(NNumber pRequestPidmIn,NString pRequestLevlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_HOLD_FOR_DEGREE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fHoldForGrades(NNumber pRequestPidmIn,NString pRequestLevlIn,NString pInProgressTermIn,NString pCampusSelIn,NString pCampCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_HOLD_FOR_GRADES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_IN_PROGRESS_TERM_IN", pInProgressTermIn);
			cmd.addParameter("@P_CAMPUS_SEL_IN", pCampusSelIn);
			cmd.addParameter("@P_CAMP_CODE_IN", pCampCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fSelectAcademicBatch(NString pSessionid,NString pUseTpopFile) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_SELECT_ACADEMIC_BATCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_USE_TPOP_FILE", pUseTpopFile);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectStudentsCollector(NString pSessionid,NString pFtpHostName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_SELECT_STUDENTS_COLLECTOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_FTP_HOST_NAME", pFtpHostName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectStudentsTpop(NString pFtpHostName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_SELECT_STUDENTS_TPOP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FTP_HOST_NAME", pFtpHostName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void fShrtprtRecord() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_SHRTPRT_RECORD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fTruncOrRound() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_TRUNC_OR_ROUND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidInstitution(NString pRequestSbgiCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_VALID_INSTITUTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidStuLevel(NNumber pRequestPidmIn,NString pRequestLevlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_VALID_STU_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fXrfExp(NString pName,NString pXref,NString pBannerValue,NString pNullableXref) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.F_XRF_EXP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_XREF", pXref);
			cmd.addParameter("@P_BANNER_VALUE", pBannerValue);
			cmd.addParameter("@P_NULLABLE_XREF", pNullableXref);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBuildError(NString pErrorname,NString pTran,NString pXml) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.P_BUILD_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ERRORNAME", pErrorname);
			cmd.addParameter("@P_TRAN", pTran);
			cmd.addParameter("@P_XML", pXml);
				
			cmd.execute();


		}
		
		public static void pDeleteCollectorTableParms(NString pSessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.P_DELETE_COLLECTOR_TABLE_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
				
			cmd.execute();


		}
		
		public static void pDeleteTpopData() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.P_DELETE_TPOP_DATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetDestinationData(NString pDestinationCode,Ref<NString> pHostNameOut,Ref<NString> pRemoteDirOut,Ref<NString> pDestUseridOut,Ref<NString> pDestPwOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.P_GET_DESTINATION_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DESTINATION_CODE", pDestinationCode);
			cmd.addParameter("@P_HOST_NAME_OUT", NString.class);
			cmd.addParameter("@P_REMOTE_DIR_OUT", NString.class);
			cmd.addParameter("@P_DEST_USERID_OUT", NString.class);
			cmd.addParameter("@P_DEST_PW_OUT", NString.class);
				
			cmd.execute();
			pHostNameOut.val = cmd.getParameterValue("@P_HOST_NAME_OUT", NString.class);
			pRemoteDirOut.val = cmd.getParameterValue("@P_REMOTE_DIR_OUT", NString.class);
			pDestUseridOut.val = cmd.getParameterValue("@P_DEST_USERID_OUT", NString.class);
			pDestPwOut.val = cmd.getParameterValue("@P_DEST_PW_OUT", NString.class);


		}
		
		public static void pInsertCollectorTableParms(NString pJobName,NNumber pJobNumber,NString pAddrDateParmNbr,NString pAddrTypeParmNbr,NString pIdSeqParmNbr,NString pTrnsTypeParmNbr,NString pSelfrptTescCodeParmNbr,NString pDomAddrNatnCodeParmNbr,NString pEmailTypeParmNbr,NString pGpaFormatParmNbr,Ref<NString> pSessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.P_INSERT_COLLECTOR_TABLE_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_JOB_NUMBER", pJobNumber);
			cmd.addParameter("@P_ADDR_DATE_PARM_NBR", pAddrDateParmNbr);
			cmd.addParameter("@P_ADDR_TYPE_PARM_NBR", pAddrTypeParmNbr);
			cmd.addParameter("@P_ID_SEQ_PARM_NBR", pIdSeqParmNbr);
			cmd.addParameter("@P_TRNS_TYPE_PARM_NBR", pTrnsTypeParmNbr);
			cmd.addParameter("@P_SELFRPT_TESC_CODE_PARM_NBR", pSelfrptTescCodeParmNbr);
			cmd.addParameter("@P_DOM_ADDR_NATN_CODE_PARM_NBR", pDomAddrNatnCodeParmNbr);
			cmd.addParameter("@P_EMAIL_TYPE_PARM_NBR", pEmailTypeParmNbr);
			cmd.addParameter("@P_GPA_FORMAT_PARM_NBR", pGpaFormatParmNbr);
			cmd.addParameter("@P_SESSIONID", pSessionid, true);
				
			cmd.execute();
			pSessionid.val = cmd.getParameterValue("@P_SESSIONID", NString.class);


		}
		
		public static void pOrgid(NString pNameIn,NString pSbgiCodeIn,Ref<NString> pEdiTypeOut,Ref<NString> pEdiValueOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.P_ORGID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NAME_IN", pNameIn);
			cmd.addParameter("@P_SBGI_CODE_IN", pSbgiCodeIn);
			cmd.addParameter("@P_EDI_TYPE_OUT", NString.class);
			cmd.addParameter("@P_EDI_VALUE_OUT", NString.class);
				
			cmd.execute();
			pEdiTypeOut.val = cmd.getParameterValue("@P_EDI_TYPE_OUT", NString.class);
			pEdiValueOut.val = cmd.getParameterValue("@P_EDI_VALUE_OUT", NString.class);


		}
		
		public static void pSetTransCollectorReq(NString pSessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.P_SET_TRANS_COLLECTOR_REQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
				
			cmd.execute();


		}
		
		public static void pUpdateDocStatus(NNumber pPidm,NNumber pRequestSeqNo,NString pUserId,NString pDocumentId,NDate pDocIdExtractDate,NDate pDocIdRcptProcDate,NDate pDocIdRespProcDate,NString pDocIdRespStatus,NString pDocIdReceiptStatus,NString pDocumentType,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.P_UPDATE_DOC_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_SEQ_NO", pRequestSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DOC_ID_EXTRACT_DATE", pDocIdExtractDate);
			cmd.addParameter("@P_DOC_ID_RCPT_PROC_DATE", pDocIdRcptProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_PROC_DATE", pDocIdRespProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_STATUS", pDocIdRespStatus);
			cmd.addParameter("@P_DOC_ID_RECEIPT_STATUS", pDocIdReceiptStatus);
			cmd.addParameter("@P_DOCUMENT_TYPE", pDocumentType);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pUpdateRequestData(NString pSessionid,NNumber pRequestPidmIn,NNumber pRequestNumberIn,NString pRequesttableIn,NString pErrorFlagIn,NString pErrorMessageIn,NString pHoldGradesFlagIn,NString pHoldDegreeFlagIn,NString pDuplicateRequestIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXEX.P_UPDATE_REQUEST_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_NUMBER_IN", pRequestNumberIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_ERROR_FLAG_IN", pErrorFlagIn);
			cmd.addParameter("@P_ERROR_MESSAGE_IN", pErrorMessageIn);
			cmd.addParameter("@P_HOLD_GRADES_FLAG_IN", pHoldGradesFlagIn);
			cmd.addParameter("@P_HOLD_DEGREE_FLAG_IN", pHoldDegreeFlagIn);
			cmd.addParameter("@P_DUPLICATE_REQUEST_IN", pDuplicateRequestIn);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AcadAttributeRow", dataSourceName="ACAD_ATTRIBUTE")
	public static class AcadAttributeRow
	{
		@DbRecordField(dataSourceName="RAPCODE")
		public NString Rapcode;
		@DbRecordField(dataSourceName="RAPNAME")
		public NString Rapname;
		@DbRecordField(dataSourceName="RAPSUBNAME")
		public NString Rapsubname;
		@DbRecordField(dataSourceName="CONDITIONSMETCODE")
		public NString Conditionsmetcode;
		@DbRecordField(dataSourceName="CONDITIONSMETDATE")
		public NString Conditionsmetdate;
		@DbRecordField(dataSourceName="NOTEMESSAGE")
		public NString Notemessage;
	}

	
	@DbRecordType(id="AcadProficiencyRow", dataSourceName="ACAD_PROFICIENCY")
	public static class AcadProficiencyRow
	{
		@DbRecordField(dataSourceName="RAPCODE")
		public NString Rapcode;
		@DbRecordField(dataSourceName="RAPNAME")
		public NString Rapname;
		@DbRecordField(dataSourceName="RAPSUBNAME")
		public NString Rapsubname;
		@DbRecordField(dataSourceName="CONDITIONSMETCODE")
		public NString Conditionsmetcode;
		@DbRecordField(dataSourceName="CONDITIONSMETDATE")
		public NString Conditionsmetdate;
		@DbRecordField(dataSourceName="NOTEMESSAGE")
		public NString Notemessage;
	}

	
	@DbRecordType(id="AcadRequirementRow", dataSourceName="ACAD_REQUIREMENT")
	public static class AcadRequirementRow
	{
		@DbRecordField(dataSourceName="RAPCODE")
		public NString Rapcode;
		@DbRecordField(dataSourceName="RAPNAME")
		public NString Rapname;
		@DbRecordField(dataSourceName="RAPSUBNAME")
		public NString Rapsubname;
		@DbRecordField(dataSourceName="CONDITIONSMETCODE")
		public NString Conditionsmetcode;
		@DbRecordField(dataSourceName="CONDITIONSMETDATE")
		public NString Conditionsmetdate;
		@DbRecordField(dataSourceName="NOTEMESSAGE")
		public NString Notemessage;
	}

	
	@DbRecordType(id="AcademicBatchRow", dataSourceName="ACADEMIC_BATCH")
	public static class AcademicBatchRow
	{
		@DbRecordField(dataSourceName="FTP_HOST_NAME")
		public NString FtpHostName;
		@DbRecordField(dataSourceName="FTP_REMOTE_DIRECTORY")
		public NString FtpRemoteDirectory;
		@DbRecordField(dataSourceName="FTP_USERNAME")
		public NString FtpUsername;
		@DbRecordField(dataSourceName="FTP_PASSWORD")
		public NString FtpPassword;
	}

	
	@DbRecordType(id="AcademicHonorsRow", dataSourceName="ACADEMIC_HONORS")
	public static class AcademicHonorsRow
	{
		@DbRecordField(dataSourceName="HONOR_CODE")
		public NString HonorCode;
		@DbRecordField(dataSourceName="HONOR_TITLE")
		public NString HonorTitle;
		@DbRecordField(dataSourceName="HONOR_LEVEL")
		public NString HonorLevel;
		@DbRecordField(dataSourceName="HONOR_NOTEMESSAGE")
		public NString HonorNotemessage;
	}

	
	@DbRecordType(id="LanguageOfInstructionRow", dataSourceName="LANGUAGE_OF_INSTRUCTION")
	public static class LanguageOfInstructionRow
	{
		@DbRecordField(dataSourceName="LANGUAGECODE")
		public NString Languagecode;
		@DbRecordField(dataSourceName="INSTRUCTIONUSAGE")
		public NString Instructionusage;
		@DbRecordField(dataSourceName="NOTEMESSAGE")
		public NString Notemessage;
	}

	
	@DbRecordType(id="LanguageProficiencyRow", dataSourceName="LANGUAGE_PROFICIENCY")
	public static class LanguageProficiencyRow
	{
		@DbRecordField(dataSourceName="LANGUAGECODE")
		public NString Languagecode;
		@DbRecordField(dataSourceName="LANGUAGEPROFICIENCY")
		public NString Languageproficiency;
		@DbRecordField(dataSourceName="LANGUAGEUSAGE")
		public NString Languageusage;
		@DbRecordField(dataSourceName="NOTEMESSAGE")
		public NString Notemessage;
	}

	
	@DbRecordType(id="LicensureRow", dataSourceName="LICENSURE")
	public static class LicensureRow
	{
		@DbRecordField(dataSourceName="LICENSURENAME")
		public NString Licensurename;
		@DbRecordField(dataSourceName="LICENSUREPASSAGEDATE")
		public NString Licensurepassagedate;
		@DbRecordField(dataSourceName="NOTEMESSAGE")
		public NString Notemessage;
	}

	
	@DbRecordType(id="TranscriptRequestRow", dataSourceName="TRANSCRIPT_REQUEST")
	public static class TranscriptRequestRow
	{
		@DbRecordField(dataSourceName="REQUEST_SOURCE")
		public NString RequestSource;
		@DbRecordField(dataSourceName="PIDM")
		public NNumber Pidm;
		@DbRecordField(dataSourceName="SEQ_NO")
		public NNumber SeqNo;
		@DbRecordField(dataSourceName="ID")
		public NString Id;
		@DbRecordField(dataSourceName="LAST_NAME")
		public NString LastName;
		@DbRecordField(dataSourceName="FIRST_NAME")
		public NString FirstName;
		@DbRecordField(dataSourceName="MI")
		public NString Mi;
		@DbRecordField(dataSourceName="USER_ID")
		public NString UserId;
		@DbRecordField(dataSourceName="LEVL_CODE")
		public NString LevlCode;
		@DbRecordField(dataSourceName="TERM_CODE")
		public NString TermCode;
		@DbRecordField(dataSourceName="SBGI_CODE")
		public NString SbgiCode;
		@DbRecordField(dataSourceName="DETC_DETAIL_CODE")
		public NString DetcDetailCode;
		@DbRecordField(dataSourceName="NBR_COPIES")
		public NNumber NbrCopies;
		@DbRecordField(dataSourceName="TPRT_CODE")
		public NString TprtCode;
		@DbRecordField(dataSourceName="TERM_CODE_DETC")
		public NString TermCodeDetc;
		@DbRecordField(dataSourceName="TERM_CODE_IN_PROG")
		public NString TermCodeInProg;
		@DbRecordField(dataSourceName="OFFICIAL_IND")
		public NString OfficialInd;
		@DbRecordField(dataSourceName="QUAL_PAPERS_PRINT")
		public NString QualPapersPrint;
		@DbRecordField(dataSourceName="QUAL_PAPERS_TEXT_PRINT")
		public NString QualPapersTextPrint;
		@DbRecordField(dataSourceName="DETAIL_PRINT")
		public NString DetailPrint;
		@DbRecordField(dataSourceName="ACAD_STANDING")
		public NString AcadStanding;
		@DbRecordField(dataSourceName="ADDR_PRINT")
		public NString AddrPrint;
		@DbRecordField(dataSourceName="BIRTH_DATE_PRINT")
		public NString BirthDatePrint;
		@DbRecordField(dataSourceName="HS_INFO_PRINT")
		public NString HsInfoPrint;
		@DbRecordField(dataSourceName="DEGR_MAJOR_PRINT")
		public NString DegrMajorPrint;
		@DbRecordField(dataSourceName="DEGR_MINOR_PRINT")
		public NString DegrMinorPrint;
		@DbRecordField(dataSourceName="DEGR_CONC_PRINT")
		public NString DegrConcPrint;
		@DbRecordField(dataSourceName="DEGR_LFST_PRINT")
		public NString DegrLfstPrint;
		@DbRecordField(dataSourceName="DEGR_MAJCONC_PRINT")
		public NString DegrMajconcPrint;
		@DbRecordField(dataSourceName="ACAD_EVENT_PRINT")
		public NString AcadEventPrint;
		@DbRecordField(dataSourceName="COURSE_COMMENT_PRINT")
		public NString CourseCommentPrint;
		@DbRecordField(dataSourceName="TERM_COMMENTS_PRINT")
		public NString TermCommentsPrint;
		@DbRecordField(dataSourceName="LEVEL_COMMENT_PRINT")
		public NString LevelCommentPrint;
		@DbRecordField(dataSourceName="INST_TOTALS_PRINT")
		public NString InstTotalsPrint;
		@DbRecordField(dataSourceName="TRNS_TOTALS_PRINT")
		public NString TrnsTotalsPrint;
		@DbRecordField(dataSourceName="OVERALL_TOTALS_PRINT")
		public NString OverallTotalsPrint;
		@DbRecordField(dataSourceName="GPA_STATISTICS_PRINT")
		public NString GpaStatisticsPrint;
		@DbRecordField(dataSourceName="CEU_HRS")
		public NString CeuHrs;
		@DbRecordField(dataSourceName="DGPA_PRINT")
		public NString DgpaPrint;
		@DbRecordField(dataSourceName="HOLD_FOR_GRADES")
		public NString HoldForGrades;
		@DbRecordField(dataSourceName="HOLD_FOR_DEGREE")
		public NString HoldForDegree;
		@DbRecordField(dataSourceName="DISPLAY_LONG_TITLE")
		public NString DisplayLongTitle;
		@DbRecordField(dataSourceName="ISSUE_ADDE_PRINT")
		public NString IssueAddePrint;
		@DbRecordField(dataSourceName="EVENT_DECISION_PRINT")
		public NString EventDecisionPrint;
		@DbRecordField(dataSourceName="EVENT_GRADE_PRINT")
		public NString EventGradePrint;
		@DbRecordField(dataSourceName="CURR_MAJOR_PRINT")
		public NString CurrMajorPrint;
		@DbRecordField(dataSourceName="CURR_MINOR_PRINT")
		public NString CurrMinorPrint;
		@DbRecordField(dataSourceName="CURR_CONC_PRINT")
		public NString CurrConcPrint;
		@DbRecordField(dataSourceName="CURR_LFST_PRINT")
		public NString CurrLfstPrint;
		@DbRecordField(dataSourceName="CURR_MAJCONC_PRINT")
		public NString CurrMajconcPrint;
		@DbRecordField(dataSourceName="SECCURR_MAJOR_PRINT")
		public NString SeccurrMajorPrint;
		@DbRecordField(dataSourceName="SECCURR_MINOR_PRINT")
		public NString SeccurrMinorPrint;
		@DbRecordField(dataSourceName="SECCURR_CONC_PRINT")
		public NString SeccurrConcPrint;
		@DbRecordField(dataSourceName="SECCURR_LFST_PRINT")
		public NString SeccurrLfstPrint;
		@DbRecordField(dataSourceName="SECCURR_MAJCONC_PRINT")
		public NString SeccurrMajconcPrint;
		@DbRecordField(dataSourceName="TEST_SCORE_PRINT")
		public NString TestScorePrint;
		@DbRecordField(dataSourceName="IMMUNIZATION_PRINT")
		public NString ImmunizationPrint;
		@DbRecordField(dataSourceName="DEGR_MAJR2_PRINT")
		public NString DegrMajr2Print;
		@DbRecordField(dataSourceName="DEGR_MINR2_PRINT")
		public NString DegrMinr2Print;
		@DbRecordField(dataSourceName="DEGR_CONC2_PRINT")
		public NString DegrConc2Print;
		@DbRecordField(dataSourceName="DEGR_LFST2_PRINT")
		public NString DegrLfst2Print;
		@DbRecordField(dataSourceName="DEGR_MAJCONC2_PRINT")
		public NString DegrMajconc2Print;
		@DbRecordField(dataSourceName="COLLEGE_TRANS_UDE_IND")
		public NString CollegeTransUdeInd;
		@DbRecordField(dataSourceName="STUDENT_UDE_IND")
		public NString StudentUdeInd;
		@DbRecordField(dataSourceName="ACAD_RECORD_UDE_IND")
		public NString AcadRecordUdeInd;
		@DbRecordField(dataSourceName="COURSE_UDE_IND")
		public NString CourseUdeInd;
		@DbRecordField(dataSourceName="DISPLAY_REGDATES_IND")
		public NString DisplayRegdatesInd;
		@DbRecordField(dataSourceName="SCPS_GPA_STATS_PRINT")
		public NString ScpsGpaStatsPrint;
	}

	
	
}
