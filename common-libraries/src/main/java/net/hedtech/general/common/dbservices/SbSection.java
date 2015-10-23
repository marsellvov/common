package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbSection {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTermCode,NString pCrn,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsSubjCrseSeq(NString pTermCode,NString pSubjCode,NString pCrseNumb,NString pSeqNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION.F_EXISTS_SUBJ_CRSE_SEQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_SEQ_NUMB", pSeqNumb);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPrereqChkMethodCde(NString pTermCode,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION.F_GET_PREREQ_CHK_METHOD_CDE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(SectionRecRow recOne,SectionRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, SectionRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, SectionRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode,NString pCrn,NString pSubjCode,NString pCrseNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NString pCrn,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCode,NString pCrn,NString pPtrmCode,NString pSubjCode,NString pCrseNumb,NString pSeqNumb,NString pSstsCode,NString pSchdCode,NString pCampCode,NString pCrseTitle,NNumber pCreditHrs,NNumber pBillHrs,NString pGmodCode,NString pSaprCode,NString pSessCode,NString pLinkIdent,NString pPrntInd,NString pGradableInd,NString pTuiwInd,NNumber pRegOneup,NNumber pPriorEnrl,NNumber pProjEnrl,NNumber pMaxEnrl,NNumber pEnrl,NNumber pSeatsAvail,NNumber pTotCreditHrs,NNumber pCensusEnrl,NDate pCensusEnrlDate,NDate pPtrmStartDate,NDate pPtrmEndDate,NNumber pPtrmWeeks,NString pReservedInd,NNumber pWaitCapacity,NNumber pWaitCount,NNumber pWaitAvail,NNumber pLecHr,NNumber pLabHr,NNumber pOthHr,NNumber pContHr,NString pAcctCode,NString pAcclCode,NDate pCensus2Date,NDate pEnrlCutOffDate,NDate pAcadCutOffDate,NDate pDropCutOffDate,NNumber pCensus2Enrl,NString pVoiceAvail,NString pCappPrereqTestInd,NString pGschName,NNumber pBestOfComp,NNumber pSubsetOfComp,NString pInsmCode,NDate pRegFromDate,NDate pRegToDate,NDate pLearnerRegstartFdate,NDate pLearnerRegstartTdate,NString pDuntCode,NNumber pNumberOfUnits,NNumber pNumberOfExtensions,NString pDataOrigin,NString pUserId,NString pIntgCde,NString pPrereqChkMethodCde,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_SEQ_NUMB", pSeqNumb);
			cmd.addParameter("@P_SSTS_CODE", pSstsCode);
			cmd.addParameter("@P_SCHD_CODE", pSchdCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_CRSE_TITLE", pCrseTitle);
			cmd.addParameter("@P_CREDIT_HRS", pCreditHrs);
			cmd.addParameter("@P_BILL_HRS", pBillHrs);
			cmd.addParameter("@P_GMOD_CODE", pGmodCode);
			cmd.addParameter("@P_SAPR_CODE", pSaprCode);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_LINK_IDENT", pLinkIdent);
			cmd.addParameter("@P_PRNT_IND", pPrntInd);
			cmd.addParameter("@P_GRADABLE_IND", pGradableInd);
			cmd.addParameter("@P_TUIW_IND", pTuiwInd);
			cmd.addParameter("@P_REG_ONEUP", pRegOneup);
			cmd.addParameter("@P_PRIOR_ENRL", pPriorEnrl);
			cmd.addParameter("@P_PROJ_ENRL", pProjEnrl);
			cmd.addParameter("@P_MAX_ENRL", pMaxEnrl);
			cmd.addParameter("@P_ENRL", pEnrl);
			cmd.addParameter("@P_SEATS_AVAIL", pSeatsAvail);
			cmd.addParameter("@P_TOT_CREDIT_HRS", pTotCreditHrs);
			cmd.addParameter("@P_CENSUS_ENRL", pCensusEnrl);
			cmd.addParameter("@P_CENSUS_ENRL_DATE", pCensusEnrlDate);
			cmd.addParameter("@P_PTRM_START_DATE", pPtrmStartDate);
			cmd.addParameter("@P_PTRM_END_DATE", pPtrmEndDate);
			cmd.addParameter("@P_PTRM_WEEKS", pPtrmWeeks);
			cmd.addParameter("@P_RESERVED_IND", pReservedInd);
			cmd.addParameter("@P_WAIT_CAPACITY", pWaitCapacity);
			cmd.addParameter("@P_WAIT_COUNT", pWaitCount);
			cmd.addParameter("@P_WAIT_AVAIL", pWaitAvail);
			cmd.addParameter("@P_LEC_HR", pLecHr);
			cmd.addParameter("@P_LAB_HR", pLabHr);
			cmd.addParameter("@P_OTH_HR", pOthHr);
			cmd.addParameter("@P_CONT_HR", pContHr);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_ACCL_CODE", pAcclCode);
			cmd.addParameter("@P_CENSUS_2_DATE", pCensus2Date);
			cmd.addParameter("@P_ENRL_CUT_OFF_DATE", pEnrlCutOffDate);
			cmd.addParameter("@P_ACAD_CUT_OFF_DATE", pAcadCutOffDate);
			cmd.addParameter("@P_DROP_CUT_OFF_DATE", pDropCutOffDate);
			cmd.addParameter("@P_CENSUS_2_ENRL", pCensus2Enrl);
			cmd.addParameter("@P_VOICE_AVAIL", pVoiceAvail);
			cmd.addParameter("@P_CAPP_PREREQ_TEST_IND", pCappPrereqTestInd);
			cmd.addParameter("@P_GSCH_NAME", pGschName);
			cmd.addParameter("@P_BEST_OF_COMP", pBestOfComp);
			cmd.addParameter("@P_SUBSET_OF_COMP", pSubsetOfComp);
			cmd.addParameter("@P_INSM_CODE", pInsmCode);
			cmd.addParameter("@P_REG_FROM_DATE", pRegFromDate);
			cmd.addParameter("@P_REG_TO_DATE", pRegToDate);
			cmd.addParameter("@P_LEARNER_REGSTART_FDATE", pLearnerRegstartFdate);
			cmd.addParameter("@P_LEARNER_REGSTART_TDATE", pLearnerRegstartTdate);
			cmd.addParameter("@P_DUNT_CODE", pDuntCode);
			cmd.addParameter("@P_NUMBER_OF_UNITS", pNumberOfUnits);
			cmd.addParameter("@P_NUMBER_OF_EXTENSIONS", pNumberOfExtensions);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTG_CDE", pIntgCde);
			cmd.addParameter("@P_PREREQ_CHK_METHOD_CDE", pPrereqChkMethodCde);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NString pCrn,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,NString pCrn,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NString pCrn,NString pPtrmCode,NString pSubjCode,NString pCrseNumb,NString pSeqNumb,NString pSstsCode,NString pSchdCode,NString pCampCode,NString pCrseTitle,NNumber pCreditHrs,NNumber pBillHrs,NString pGmodCode,NString pSaprCode,NString pSessCode,NString pLinkIdent,NString pPrntInd,NString pGradableInd,NString pTuiwInd,NNumber pRegOneup,NNumber pPriorEnrl,NNumber pProjEnrl,NNumber pMaxEnrl,NNumber pEnrl,NNumber pSeatsAvail,NNumber pTotCreditHrs,NNumber pCensusEnrl,NDate pCensusEnrlDate,NDate pPtrmStartDate,NDate pPtrmEndDate,NNumber pPtrmWeeks,NString pReservedInd,NNumber pWaitCapacity,NNumber pWaitCount,NNumber pWaitAvail,NNumber pLecHr,NNumber pLabHr,NNumber pOthHr,NNumber pContHr,NString pAcctCode,NString pAcclCode,NDate pCensus2Date,NDate pEnrlCutOffDate,NDate pAcadCutOffDate,NDate pDropCutOffDate,NNumber pCensus2Enrl,NString pVoiceAvail,NString pCappPrereqTestInd,NString pGschName,NNumber pBestOfComp,NNumber pSubsetOfComp,NString pInsmCode,NDate pRegFromDate,NDate pRegToDate,NDate pLearnerRegstartFdate,NDate pLearnerRegstartTdate,NString pDuntCode,NNumber pNumberOfUnits,NNumber pNumberOfExtensions,NString pDataOrigin,NString pUserId,NString pIntgCde,NString pPrereqChkMethodCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_SEQ_NUMB", pSeqNumb);
			cmd.addParameter("@P_SSTS_CODE", pSstsCode);
			cmd.addParameter("@P_SCHD_CODE", pSchdCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_CRSE_TITLE", pCrseTitle);
			cmd.addParameter("@P_CREDIT_HRS", pCreditHrs);
			cmd.addParameter("@P_BILL_HRS", pBillHrs);
			cmd.addParameter("@P_GMOD_CODE", pGmodCode);
			cmd.addParameter("@P_SAPR_CODE", pSaprCode);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_LINK_IDENT", pLinkIdent);
			cmd.addParameter("@P_PRNT_IND", pPrntInd);
			cmd.addParameter("@P_GRADABLE_IND", pGradableInd);
			cmd.addParameter("@P_TUIW_IND", pTuiwInd);
			cmd.addParameter("@P_REG_ONEUP", pRegOneup);
			cmd.addParameter("@P_PRIOR_ENRL", pPriorEnrl);
			cmd.addParameter("@P_PROJ_ENRL", pProjEnrl);
			cmd.addParameter("@P_MAX_ENRL", pMaxEnrl);
			cmd.addParameter("@P_ENRL", pEnrl);
			cmd.addParameter("@P_SEATS_AVAIL", pSeatsAvail);
			cmd.addParameter("@P_TOT_CREDIT_HRS", pTotCreditHrs);
			cmd.addParameter("@P_CENSUS_ENRL", pCensusEnrl);
			cmd.addParameter("@P_CENSUS_ENRL_DATE", pCensusEnrlDate);
			cmd.addParameter("@P_PTRM_START_DATE", pPtrmStartDate);
			cmd.addParameter("@P_PTRM_END_DATE", pPtrmEndDate);
			cmd.addParameter("@P_PTRM_WEEKS", pPtrmWeeks);
			cmd.addParameter("@P_RESERVED_IND", pReservedInd);
			cmd.addParameter("@P_WAIT_CAPACITY", pWaitCapacity);
			cmd.addParameter("@P_WAIT_COUNT", pWaitCount);
			cmd.addParameter("@P_WAIT_AVAIL", pWaitAvail);
			cmd.addParameter("@P_LEC_HR", pLecHr);
			cmd.addParameter("@P_LAB_HR", pLabHr);
			cmd.addParameter("@P_OTH_HR", pOthHr);
			cmd.addParameter("@P_CONT_HR", pContHr);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_ACCL_CODE", pAcclCode);
			cmd.addParameter("@P_CENSUS_2_DATE", pCensus2Date);
			cmd.addParameter("@P_ENRL_CUT_OFF_DATE", pEnrlCutOffDate);
			cmd.addParameter("@P_ACAD_CUT_OFF_DATE", pAcadCutOffDate);
			cmd.addParameter("@P_DROP_CUT_OFF_DATE", pDropCutOffDate);
			cmd.addParameter("@P_CENSUS_2_ENRL", pCensus2Enrl);
			cmd.addParameter("@P_VOICE_AVAIL", pVoiceAvail);
			cmd.addParameter("@P_CAPP_PREREQ_TEST_IND", pCappPrereqTestInd);
			cmd.addParameter("@P_GSCH_NAME", pGschName);
			cmd.addParameter("@P_BEST_OF_COMP", pBestOfComp);
			cmd.addParameter("@P_SUBSET_OF_COMP", pSubsetOfComp);
			cmd.addParameter("@P_INSM_CODE", pInsmCode);
			cmd.addParameter("@P_REG_FROM_DATE", pRegFromDate);
			cmd.addParameter("@P_REG_TO_DATE", pRegToDate);
			cmd.addParameter("@P_LEARNER_REGSTART_FDATE", pLearnerRegstartFdate);
			cmd.addParameter("@P_LEARNER_REGSTART_TDATE", pLearnerRegstartTdate);
			cmd.addParameter("@P_DUNT_CODE", pDuntCode);
			cmd.addParameter("@P_NUMBER_OF_UNITS", pNumberOfUnits);
			cmd.addParameter("@P_NUMBER_OF_EXTENSIONS", pNumberOfExtensions);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTG_CDE", pIntgCde);
			cmd.addParameter("@P_PREREQ_CHK_METHOD_CDE", pPrereqChkMethodCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="SectionRecRow", dataSourceName="SECTION_REC")
	public static class SectionRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_PTRM_CODE")
		public NString RPtrmCode;
		@DbRecordField(dataSourceName="R_SUBJ_CODE")
		public NString RSubjCode;
		@DbRecordField(dataSourceName="R_CRSE_NUMB")
		public NString RCrseNumb;
		@DbRecordField(dataSourceName="R_SEQ_NUMB")
		public NString RSeqNumb;
		@DbRecordField(dataSourceName="R_SSTS_CODE")
		public NString RSstsCode;
		@DbRecordField(dataSourceName="R_SCHD_CODE")
		public NString RSchdCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_CRSE_TITLE")
		public NString RCrseTitle;
		@DbRecordField(dataSourceName="R_CREDIT_HRS")
		public NNumber RCreditHrs;
		@DbRecordField(dataSourceName="R_BILL_HRS")
		public NNumber RBillHrs;
		@DbRecordField(dataSourceName="R_GMOD_CODE")
		public NString RGmodCode;
		@DbRecordField(dataSourceName="R_SAPR_CODE")
		public NString RSaprCode;
		@DbRecordField(dataSourceName="R_SESS_CODE")
		public NString RSessCode;
		@DbRecordField(dataSourceName="R_LINK_IDENT")
		public NString RLinkIdent;
		@DbRecordField(dataSourceName="R_PRNT_IND")
		public NString RPrntInd;
		@DbRecordField(dataSourceName="R_GRADABLE_IND")
		public NString RGradableInd;
		@DbRecordField(dataSourceName="R_TUIW_IND")
		public NString RTuiwInd;
		@DbRecordField(dataSourceName="R_REG_ONEUP")
		public NNumber RRegOneup;
		@DbRecordField(dataSourceName="R_PRIOR_ENRL")
		public NNumber RPriorEnrl;
		@DbRecordField(dataSourceName="R_PROJ_ENRL")
		public NNumber RProjEnrl;
		@DbRecordField(dataSourceName="R_MAX_ENRL")
		public NNumber RMaxEnrl;
		@DbRecordField(dataSourceName="R_ENRL")
		public NNumber REnrl;
		@DbRecordField(dataSourceName="R_SEATS_AVAIL")
		public NNumber RSeatsAvail;
		@DbRecordField(dataSourceName="R_TOT_CREDIT_HRS")
		public NNumber RTotCreditHrs;
		@DbRecordField(dataSourceName="R_CENSUS_ENRL")
		public NNumber RCensusEnrl;
		@DbRecordField(dataSourceName="R_CENSUS_ENRL_DATE")
		public NDate RCensusEnrlDate;
		@DbRecordField(dataSourceName="R_PTRM_START_DATE")
		public NDate RPtrmStartDate;
		@DbRecordField(dataSourceName="R_PTRM_END_DATE")
		public NDate RPtrmEndDate;
		@DbRecordField(dataSourceName="R_PTRM_WEEKS")
		public NNumber RPtrmWeeks;
		@DbRecordField(dataSourceName="R_RESERVED_IND")
		public NString RReservedInd;
		@DbRecordField(dataSourceName="R_WAIT_CAPACITY")
		public NNumber RWaitCapacity;
		@DbRecordField(dataSourceName="R_WAIT_COUNT")
		public NNumber RWaitCount;
		@DbRecordField(dataSourceName="R_WAIT_AVAIL")
		public NNumber RWaitAvail;
		@DbRecordField(dataSourceName="R_LEC_HR")
		public NNumber RLecHr;
		@DbRecordField(dataSourceName="R_LAB_HR")
		public NNumber RLabHr;
		@DbRecordField(dataSourceName="R_OTH_HR")
		public NNumber ROthHr;
		@DbRecordField(dataSourceName="R_CONT_HR")
		public NNumber RContHr;
		@DbRecordField(dataSourceName="R_ACCT_CODE")
		public NString RAcctCode;
		@DbRecordField(dataSourceName="R_ACCL_CODE")
		public NString RAcclCode;
		@DbRecordField(dataSourceName="R_CENSUS_2_DATE")
		public NDate RCensus2Date;
		@DbRecordField(dataSourceName="R_ENRL_CUT_OFF_DATE")
		public NDate REnrlCutOffDate;
		@DbRecordField(dataSourceName="R_ACAD_CUT_OFF_DATE")
		public NDate RAcadCutOffDate;
		@DbRecordField(dataSourceName="R_DROP_CUT_OFF_DATE")
		public NDate RDropCutOffDate;
		@DbRecordField(dataSourceName="R_CENSUS_2_ENRL")
		public NNumber RCensus2Enrl;
		@DbRecordField(dataSourceName="R_VOICE_AVAIL")
		public NString RVoiceAvail;
		@DbRecordField(dataSourceName="R_CAPP_PREREQ_TEST_IND")
		public NString RCappPrereqTestInd;
		@DbRecordField(dataSourceName="R_GSCH_NAME")
		public NString RGschName;
		@DbRecordField(dataSourceName="R_BEST_OF_COMP")
		public NNumber RBestOfComp;
		@DbRecordField(dataSourceName="R_SUBSET_OF_COMP")
		public NNumber RSubsetOfComp;
		@DbRecordField(dataSourceName="R_INSM_CODE")
		public NString RInsmCode;
		@DbRecordField(dataSourceName="R_REG_FROM_DATE")
		public NDate RRegFromDate;
		@DbRecordField(dataSourceName="R_REG_TO_DATE")
		public NDate RRegToDate;
		@DbRecordField(dataSourceName="R_LEARNER_REGSTART_FDATE")
		public NDate RLearnerRegstartFdate;
		@DbRecordField(dataSourceName="R_LEARNER_REGSTART_TDATE")
		public NDate RLearnerRegstartTdate;
		@DbRecordField(dataSourceName="R_DUNT_CODE")
		public NString RDuntCode;
		@DbRecordField(dataSourceName="R_NUMBER_OF_UNITS")
		public NNumber RNumberOfUnits;
		@DbRecordField(dataSourceName="R_NUMBER_OF_EXTENSIONS")
		public NNumber RNumberOfExtensions;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTG_CDE")
		public NString RIntgCde;
		@DbRecordField(dataSourceName="R_PREREQ_CHK_METHOD_CDE")
		public NString RPrereqChkMethodCde;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
