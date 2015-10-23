package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbSectionRules {
		public static NString fCheckAcct(NString pAcctCode,NBool pOpenLearning) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_ACCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_OPEN_LEARNING", pOpenLearning);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckBillHrs(NString pBillHrInd,NNumber pBillHrs,NNumber pBillHrLow,NNumber pBillHrHigh) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_BILL_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BILL_HR_IND", pBillHrInd);
			cmd.addParameter("@P_BILL_HRS", pBillHrs);
			cmd.addParameter("@P_BILL_HR_LOW", pBillHrLow);
			cmd.addParameter("@P_BILL_HR_HIGH", pBillHrHigh);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckCampus(NString pTermCode,NString pSubjCode,NString pCrseNumb,NString pCampCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_CAMPUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckContHrs(NString pContHrInd,NNumber pContHrs,NNumber pContHrLow,NNumber pContHrHigh,NString pCeuInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_CONT_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CONT_HR_IND", pContHrInd);
			cmd.addParameter("@P_CONT_HRS", pContHrs);
			cmd.addParameter("@P_CONT_HR_LOW", pContHrLow);
			cmd.addParameter("@P_CONT_HR_HIGH", pContHrHigh);
			cmd.addParameter("@P_CEU_IND", pCeuInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckCreditHrs(NString pCreditHrInd,NNumber pCreditHrs,NNumber pCreditHrLow,NNumber pCreditHrHigh) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_CREDIT_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CREDIT_HR_IND", pCreditHrInd);
			cmd.addParameter("@P_CREDIT_HRS", pCreditHrs);
			cmd.addParameter("@P_CREDIT_HR_LOW", pCreditHrLow);
			cmd.addParameter("@P_CREDIT_HR_HIGH", pCreditHrHigh);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckCsta(NString pCstaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_CSTA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CSTA_CODE", pCstaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckGmod(NString pTermCode,NString pSubjCode,NString pCrseNumb,NString pGmodCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_GMOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_GMOD_CODE", pGmodCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckGsch(NString pGschName,SbSection.SectionRecRow pSectRec,SbCourse.CourseRecRow pCrseRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_GSCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GSCH_NAME", pGschName);
			cmd.addParameter(DbTypes.createStructType("P_SECT_REC", pSectRec, SbSection.SectionRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("P_CRSE_REC", pCrseRec, SbCourse.CourseRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckIndicators(NString pVoiceInd,NString pCappInd,NString pPrntInd,NString pGradableInd,NString pTuiwInd,NString pReservedInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_INDICATORS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VOICE_IND", pVoiceInd);
			cmd.addParameter("@P_CAPP_IND", pCappInd);
			cmd.addParameter("@P_PRNT_IND", pPrntInd);
			cmd.addParameter("@P_GRADABLE_IND", pGradableInd);
			cmd.addParameter("@P_TUIW_IND", pTuiwInd);
			cmd.addParameter("@P_RESERVED_IND", pReservedInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckLabHrs(NString pLabHrInd,NNumber pLabHr,NNumber pLabHrLow,NNumber pLabHrHigh) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_LAB_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LAB_HR_IND", pLabHrInd);
			cmd.addParameter("@P_LAB_HR", pLabHr);
			cmd.addParameter("@P_LAB_HR_LOW", pLabHrLow);
			cmd.addParameter("@P_LAB_HR_HIGH", pLabHrHigh);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckLecHrs(NString pLecHrInd,NNumber pLecHr,NNumber pLecHrLow,NNumber pLecHrHigh) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_LEC_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LEC_HR_IND", pLecHrInd);
			cmd.addParameter("@P_LEC_HR", pLecHr);
			cmd.addParameter("@P_LEC_HR_LOW", pLecHrLow);
			cmd.addParameter("@P_LEC_HR_HIGH", pLecHrHigh);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckLink(NString pTermCode,NString pCrn,NString pLinkIdent) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_LINK_IDENT", pLinkIdent);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckOffered(NString pTermCode,NString pSubjCode,NString pCrseNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_OFFERED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckOthHrs(NString pOthHrInd,NNumber pOthHr,NNumber pOthHrLow,NNumber pOthHrHigh) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_OTH_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OTH_HR_IND", pOthHrInd);
			cmd.addParameter("@P_OTH_HR", pOthHr);
			cmd.addParameter("@P_OTH_HR_LOW", pOthHrLow);
			cmd.addParameter("@P_OTH_HR_HIGH", pOthHrHigh);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckSchd(NString pTermCode,NString pSubjCode,NString pCrseNumb,NString pSchdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_SCHD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_SCHD_CODE", pSchdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckSsts(NString pSstsCode,NString pOldSstsCode,NBool pMeetingExists,NBool pEnrollmentExists) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_SSTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SSTS_CODE", pSstsCode);
			cmd.addParameter("@P_OLD_SSTS_CODE", pOldSstsCode);
			cmd.addParameter("@P_MEETING_EXISTS", pMeetingExists);
			cmd.addParameter("@P_ENROLLMENT_EXISTS", pEnrollmentExists);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckTermRestrict(NString pTermCode,NString pSubjCode,NString pCrseNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_CHECK_TERM_RESTRICT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fOlrControl(NString pType,NDate pRegStartDate,NDate pRegEndDate,NDate pCensusDateOne,NDate pCensusDateTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_OLR_CONTROL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_REG_START_DATE", pRegStartDate);
			cmd.addParameter("@P_REG_END_DATE", pRegEndDate);
			cmd.addParameter("@P_CENSUS_DATE_ONE", pCensusDateOne);
			cmd.addParameter("@P_CENSUS_DATE_TWO", pCensusDateTwo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fParentExists(NString pSubjCode,NString pCrseNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTermControl(NString pType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_TERM_CONTROL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TYPE", pType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidPtrm(NString pTermCode,NString pPtrmCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.F_VALID_PTRM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCheckRequiredFields(NString pTermCode,NString pCrn,NString pSubjCode,NString pCrseNumb,NString pSeqNumb,NString pSstsCode,NString pSchdCode,NString pCampCode,NNumber pRegOneup,NNumber pPriorEnrl,NNumber pProjEnrl,NNumber pMaxEnrl,NNumber pEnrl,NNumber pSeatsAvail,NDate pCensusEnrlDate,NString pVoiceAvail,NString pCappPrereqTestInd,NNumber pNumberOfExtensions,NString pPrereqChkMethodCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.P_CHECK_REQUIRED_FIELDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_SEQ_NUMB", pSeqNumb);
			cmd.addParameter("@P_SSTS_CODE", pSstsCode);
			cmd.addParameter("@P_SCHD_CODE", pSchdCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_REG_ONEUP", pRegOneup);
			cmd.addParameter("@P_PRIOR_ENRL", pPriorEnrl);
			cmd.addParameter("@P_PROJ_ENRL", pProjEnrl);
			cmd.addParameter("@P_MAX_ENRL", pMaxEnrl);
			cmd.addParameter("@P_ENRL", pEnrl);
			cmd.addParameter("@P_SEATS_AVAIL", pSeatsAvail);
			cmd.addParameter("@P_CENSUS_ENRL_DATE", pCensusEnrlDate);
			cmd.addParameter("@P_VOICE_AVAIL", pVoiceAvail);
			cmd.addParameter("@P_CAPP_PREREQ_TEST_IND", pCappPrereqTestInd);
			cmd.addParameter("@P_NUMBER_OF_EXTENSIONS", pNumberOfExtensions);
			cmd.addParameter("@P_PREREQ_CHK_METHOD_CDE", pPrereqChkMethodCde);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NString pCrn,NString pPtrmCode,NString pSubjCode,NString pCrseNumb,NString pSeqNumb,NString pSstsCode,NString pSchdCode,NString pCampCode,NString pCrseTitle,NNumber pCreditHrs,NNumber pBillHrs,NString pGmodCode,NString pSaprCode,NString pSessCode,NString pLinkIdent,NString pPrntInd,NString pGradableInd,NString pTuiwInd,NNumber pRegOneup,NNumber pPriorEnrl,NNumber pProjEnrl,NNumber pMaxEnrl,NNumber pEnrl,NNumber pSeatsAvail,NNumber pTotCreditHrs,NNumber pCensusEnrl,NDate pCensusEnrlDate,NDate pPtrmStartDate,NDate pPtrmEndDate,NNumber pPtrmWeeks,NString pReservedInd,NNumber pWaitCapacity,NNumber pWaitCount,NNumber pWaitAvail,NNumber pLecHr,NNumber pLabHr,NNumber pOthHr,NNumber pContHr,NString pAcctCode,NString pAcclCode,NDate pCensus2Date,NDate pEnrlCutOffDate,NDate pAcadCutOffDate,NDate pDropCutOffDate,NNumber pCensus2Enrl,NString pVoiceAvail,NString pCappPrereqTestInd,NString pGschName,NNumber pBestOfComp,NNumber pSubsetOfComp,NString pInsmCode,NDate pRegFromDate,NDate pRegToDate,NDate pLearnerRegstartFdate,NDate pLearnerRegstartTdate,NString pDuntCode,NNumber pNumberOfUnits,NNumber pNumberOfExtensions,NString pDataOrigin,NString pUserId,NString pIntgCde,NString pPrereqChkMethodCde,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidateCreate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.P_VALIDATE_CREATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pValidateUpdate(Ref<SbSection.SectionRecRow> lvValidationRecIo,SbSection.SectionRecRow lvExistingRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECTION_RULES.P_VALIDATE_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("LV_VALIDATION_REC_IO", lvValidationRecIo.val, SbSection.SectionRecRow.class, true));
			cmd.addParameter(DbTypes.createStructType("LV_EXISTING_REC", lvExistingRec, SbSection.SectionRecRow.class ));
				
			cmd.execute();
			lvValidationRecIo.val = cmd.getParameterValue("@LV_VALIDATION_REC_IO", SbSection.SectionRecRow.class);


		}
		
	
	
	
}
