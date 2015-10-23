package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Goksvis {
		public static NBool fChangeedulevelExists(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.F_CHANGEEDULEVEL_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fExtensionInHistory(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.F_EXTENSION_IN_HISTORY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pCompareCurrentActSite() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_COMPARE_CURRENT_ACT_SITE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pCompareCurrentDep() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_COMPARE_CURRENT_DEP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pCompareCurrentEmpInfo() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_COMPARE_CURRENT_EMP_INFO", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pCompareCurrentEv() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_COMPARE_CURRENT_EV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pCompareCurrentStu() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_COMPARE_CURRENT_STU", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pCreateActRow(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_CREATE_ACT_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pCreateDepRow(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_CREATE_DEP_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pCreateEmpRow(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_CREATE_EMP_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pCreateEvRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_CREATE_EV_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pCreateGorsevh(NNumber pidmIn,NString usageIn,NNumber depSeqnoIn,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_CREATE_GORSEVH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@USAGE_IN", usageIn);
			cmd.addParameter("@DEP_SEQNO_IN", depSeqnoIn);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void pCreateGorsvah(NNumber pidmIn,NNumber actSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_CREATE_GORSVAH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ACT_SEQNO_IN", actSeqnoIn);
				
			cmd.execute();


		}
		
		public static void pCreateGorsveh(NNumber pidmIn,NNumber empSeqnoIn,Ref<NString> svts8Out,Ref<NString> errMsg8,Ref<NString> svts9Out,Ref<NString> errMsg9) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_CREATE_GORSVEH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@EMP_SEQNO_IN", empSeqnoIn);
			cmd.addParameter("@SVTS8_OUT", NString.class);
			cmd.addParameter("@ERR_MSG8", NString.class);
			cmd.addParameter("@SVTS9_OUT", NString.class);
			cmd.addParameter("@ERR_MSG9", NString.class);
				
			cmd.execute();
			svts8Out.val = cmd.getParameterValue("@SVTS8_OUT", NString.class);
			errMsg8.val = cmd.getParameterValue("@ERR_MSG8", NString.class);
			svts9Out.val = cmd.getParameterValue("@SVTS9_OUT", NString.class);
			errMsg9.val = cmd.getParameterValue("@ERR_MSG9", NString.class);


		}
		
		public static void pCreateHistory(NNumber pidmIn,NString usageIn,Ref<NString> svtsCodeOut,Ref<NString> errMsgOut,Ref<NString> svts1Out,Ref<NString> errMsg1,Ref<NString> svts2Out,Ref<NString> errMsg2,Ref<NString> svts3Out,Ref<NString> errMsg3,Ref<NString> svts4Out,Ref<NString> errMsg4,Ref<NString> svts5Out,Ref<NString> errMsg5,Ref<NString> svts6Out,Ref<NString> errMsg6,Ref<NString> svts7Out,Ref<NString> errMsg7,Ref<NString> svts8Out,Ref<NString> errMsg8,Ref<NString> svts9Out,Ref<NString> errMsg9,Ref<NString> svts10Out,Ref<NString> errMsg10,Ref<NString> svts11Out,Ref<NString> errMsg11,Ref<NString> svts12Out,Ref<NString> errMsg12) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_CREATE_HISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@USAGE_IN", usageIn);
			cmd.addParameter("@SVTS_CODE_OUT", NString.class);
			cmd.addParameter("@ERR_MSG_OUT", NString.class);
			cmd.addParameter("@SVTS1_OUT", NString.class);
			cmd.addParameter("@ERR_MSG1", NString.class);
			cmd.addParameter("@SVTS2_OUT", NString.class);
			cmd.addParameter("@ERR_MSG2", NString.class);
			cmd.addParameter("@SVTS3_OUT", NString.class);
			cmd.addParameter("@ERR_MSG3", NString.class);
			cmd.addParameter("@SVTS4_OUT", NString.class);
			cmd.addParameter("@ERR_MSG4", NString.class);
			cmd.addParameter("@SVTS5_OUT", NString.class);
			cmd.addParameter("@ERR_MSG5", NString.class);
			cmd.addParameter("@SVTS6_OUT", NString.class);
			cmd.addParameter("@ERR_MSG6", NString.class);
			cmd.addParameter("@SVTS7_OUT", NString.class);
			cmd.addParameter("@ERR_MSG7", NString.class);
			cmd.addParameter("@SVTS8_OUT", NString.class);
			cmd.addParameter("@ERR_MSG8", NString.class);
			cmd.addParameter("@SVTS9_OUT", NString.class);
			cmd.addParameter("@ERR_MSG9", NString.class);
			cmd.addParameter("@SVTS10_OUT", NString.class);
			cmd.addParameter("@ERR_MSG10", NString.class);
			cmd.addParameter("@SVTS11_OUT", NString.class);
			cmd.addParameter("@ERR_MSG11", NString.class);
			cmd.addParameter("@SVTS12_OUT", NString.class);
			cmd.addParameter("@ERR_MSG12", NString.class);
				
			cmd.execute();
			svtsCodeOut.val = cmd.getParameterValue("@SVTS_CODE_OUT", NString.class);
			errMsgOut.val = cmd.getParameterValue("@ERR_MSG_OUT", NString.class);
			svts1Out.val = cmd.getParameterValue("@SVTS1_OUT", NString.class);
			errMsg1.val = cmd.getParameterValue("@ERR_MSG1", NString.class);
			svts2Out.val = cmd.getParameterValue("@SVTS2_OUT", NString.class);
			errMsg2.val = cmd.getParameterValue("@ERR_MSG2", NString.class);
			svts3Out.val = cmd.getParameterValue("@SVTS3_OUT", NString.class);
			errMsg3.val = cmd.getParameterValue("@ERR_MSG3", NString.class);
			svts4Out.val = cmd.getParameterValue("@SVTS4_OUT", NString.class);
			errMsg4.val = cmd.getParameterValue("@ERR_MSG4", NString.class);
			svts5Out.val = cmd.getParameterValue("@SVTS5_OUT", NString.class);
			errMsg5.val = cmd.getParameterValue("@ERR_MSG5", NString.class);
			svts6Out.val = cmd.getParameterValue("@SVTS6_OUT", NString.class);
			errMsg6.val = cmd.getParameterValue("@ERR_MSG6", NString.class);
			svts7Out.val = cmd.getParameterValue("@SVTS7_OUT", NString.class);
			errMsg7.val = cmd.getParameterValue("@ERR_MSG7", NString.class);
			svts8Out.val = cmd.getParameterValue("@SVTS8_OUT", NString.class);
			errMsg8.val = cmd.getParameterValue("@ERR_MSG8", NString.class);
			svts9Out.val = cmd.getParameterValue("@SVTS9_OUT", NString.class);
			errMsg9.val = cmd.getParameterValue("@ERR_MSG9", NString.class);
			svts10Out.val = cmd.getParameterValue("@SVTS10_OUT", NString.class);
			errMsg10.val = cmd.getParameterValue("@ERR_MSG10", NString.class);
			svts11Out.val = cmd.getParameterValue("@SVTS11_OUT", NString.class);
			errMsg11.val = cmd.getParameterValue("@ERR_MSG11", NString.class);
			svts12Out.val = cmd.getParameterValue("@SVTS12_OUT", NString.class);
			errMsg12.val = cmd.getParameterValue("@ERR_MSG12", NString.class);


		}
		
		public static void pCreateStuRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_CREATE_STU_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGorsevhInsert(NNumber pidm,NNumber sevisSeqNo,NNumber seqNo,NString reltCde,NDate activityDate,NString userId,NNumber depPidm,NString depLastName,NString depFirstName,NString depMiddleName,NString depNameSuffix,NString depBirthNatnCde,NString depLegalNatnCde,NDate depBirthDate,NString depSevisId,NString svdtCode,NString gender,NString vtypCde,NString depBirthCity,NString natnCdePermRes,NDate terminateEffDate,NString depComment,NString svdtComment,NString depCancelCde,NString depDeleteInd,NString depReprintRequestInd,NString depSvrpCode,NString depSvrpComment,NString formPurposeCde,NString depBirthNatnReasonCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSEVH_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEVIS_SEQ_NO", sevisSeqNo);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@RELT_CDE", reltCde);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@DEP_PIDM", depPidm);
			cmd.addParameter("@DEP_LAST_NAME", depLastName);
			cmd.addParameter("@DEP_FIRST_NAME", depFirstName);
			cmd.addParameter("@DEP_MIDDLE_NAME", depMiddleName);
			cmd.addParameter("@DEP_NAME_SUFFIX", depNameSuffix);
			cmd.addParameter("@DEP_BIRTH_NATN_CDE", depBirthNatnCde);
			cmd.addParameter("@DEP_LEGAL_NATN_CDE", depLegalNatnCde);
			cmd.addParameter("@DEP_BIRTH_DATE", depBirthDate);
			cmd.addParameter("@DEP_SEVIS_ID", depSevisId);
			cmd.addParameter("@SVDT_CODE", svdtCode);
			cmd.addParameter("@GENDER", gender);
			cmd.addParameter("@VTYP_CDE", vtypCde);
			cmd.addParameter("@DEP_BIRTH_CITY", depBirthCity);
			cmd.addParameter("@NATN_CDE_PERM_RES", natnCdePermRes);
			cmd.addParameter("@TERMINATE_EFF_DATE", terminateEffDate);
			cmd.addParameter("@DEP_COMMENT", depComment);
			cmd.addParameter("@SVDT_COMMENT", svdtComment);
			cmd.addParameter("@DEP_CANCEL_CDE", depCancelCde);
			cmd.addParameter("@DEP_DELETE_IND", depDeleteInd);
			cmd.addParameter("@DEP_REPRINT_REQUEST_IND", depReprintRequestInd);
			cmd.addParameter("@DEP_SVRP_CODE", depSvrpCode);
			cmd.addParameter("@DEP_SVRP_COMMENT", depSvrpComment);
			cmd.addParameter("@FORM_PURPOSE_CDE", formPurposeCde);
			cmd.addParameter("@DEP_BIRTH_NATN_REASON_CDE", depBirthNatnReasonCde);
				
			cmd.execute();


		}
		
		public static void pGorsevhInsertAll(NNumber pidmIn,NNumber sevisSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSEVH_INSERT_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SEVIS_SEQNO_IN", sevisSeqnoIn);
				
			cmd.execute();


		}
		
		public static void pGorsevhInsertDepRows(NNumber pidmIn,NNumber holdSevisSeqno,NNumber currentSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSEVH_INSERT_DEP_ROWS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@HOLD_SEVIS_SEQNO", holdSevisSeqno);
			cmd.addParameter("@CURRENT_SEQNO", currentSeqno);
				
			cmd.execute();


		}
		
		public static void pGorsevhInsertOne(NNumber pidmIn,NNumber seqnoIn,NNumber sevisSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSEVH_INSERT_ONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SEQNO_IN", seqnoIn);
			cmd.addParameter("@SEVIS_SEQNO_IN", sevisSeqnoIn);
				
			cmd.execute();


		}
		
		public static void pGorsevsInsert(NNumber pidm,NNumber sevsSeqno,NDate submitDate,NDate activityDate,NString userId,NString engProfReqInd,NString engProfMetInd,NString criminalConvictInd,NString terminateStudentInd,NString extendFailureInd,NString transferFailInd,NString approvalFailInd,NString otherInfractInd,NString lastName,NString firstName,NString mi,NDate birthDate,NString birthNatnCde,NString legalNatnCde,NString usaStreetLine1,NString usaStreetLine2,NString usaCity,NString usaStatCode,NString usaZip,NString routingCde,NString nonusaStreetLine1,NString nonusaStreetLine2,NString nonusaCity,NString nonusaState,NString nonusaNatnCde,NString nonusaZip,NDate programBeginDate,NDate programEndDate,NDate programEnrollDate,NString engProfReason,NNumber academicTermMonths,NNumber tuitionExpense,NNumber personalFunds,NString fundingComment,NString sevisId,NString vtypCde,NString svcrCode,NDate sessionStartDate,NDate sessionEndDate,NString transferComment,NString issueComment,NString svelCode,NString svelComment,NString majrCde,NNumber studyLength,NNumber livingExpenses,NString svftCode,NDate authStartDate,NDate authEndDate,NString completionRemarks,NDate newProgramEndDate,NDate daProgramStartDate,NDate daProgramEndDate,NString discActionText,NDate extendEndDate,NString svtrCode,NDate terminateDate,NString approvalFailComment,NString otherInfractComment,NString svitCode,NString svepCode,NDate endProgramEffDate,NString evFormNumber,NString svrpCode,NString reprintReasonComment,NDate createDate,NString svtsCode,NString svcrComment,NString printRequestInd,NNumber dependentExpenses,NNumber otherFunds,NString otherFundsComment,NNumber otherExpenses,NString otherExpComment,NDate newProgramStartDate,NString svpcCode,NString svscCode,NString svscComment,NString svccCode,NString gender,NString suffix,NString commuterInd,NString admissionNumber,NString driversLicNumber,NString statCodeDriversLic,NString ssn,NString tin,NString majrCde2,NString majrCdeMinr,NNumber schoolFunds,NString schoolFundsComment,NNumber employmentFunds,NString svftComment,NString svepComment,NString svtrComment,NString daComment,NString passportNumber,NString natnCdePassport,NDate passportExpireDate,NString visaNumber,NString svcpCode,NDate visaExpireDate,NString pentCde,NString pentComment,NDate entryDate,NString emplAuthInd,NString rescindRecInd,NString rfcComment,NString editProgramComment,NNumber programSponsorFunds,NString usFundsInd,NNumber govtOrgFunds,NString svgoCode,NNumber govtOrgFunds2,NString svgoCode2,NNumber intlOrgFunds,NString svioCode,NNumber intlOrgFunds2,NString svioCode2,NNumber evGovtFunds,NNumber binationFunds,NNumber otherOrgFunds,NString programStartInd,NString extendProgramComment,NString amendProgramComment,NString matriculationCde,NString extendFailureComment,NString concludeTransComment,NString birthCity,NString natnCdePermRes,NString editBioComment,NString structureUpdate,NString schoolCde,NString programCde,NString officerId,NString svftCancelInd,NString svcaCode,NString svcaComment,NString verifyStatusInd,NString extensionCancelInd,NDate visaIssueDate,NString priorSvftCode,NDate priorAuthStartDate,NDate priorAuthEndDate,NString svgoName,NString svgoName2,NString svioName,NString svioName2,NString otherOrgName,NString noshowInd,NString birthNatnReasonCde,NString sevisRecordStatus,NString svscDesc,NString svelCancelInd,NString svctCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSEVS_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEVS_SEQNO", sevsSeqno);
			cmd.addParameter("@SUBMIT_DATE", submitDate);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@ENG_PROF_REQ_IND", engProfReqInd);
			cmd.addParameter("@ENG_PROF_MET_IND", engProfMetInd);
			cmd.addParameter("@CRIMINAL_CONVICT_IND", criminalConvictInd);
			cmd.addParameter("@TERMINATE_STUDENT_IND", terminateStudentInd);
			cmd.addParameter("@EXTEND_FAILURE_IND", extendFailureInd);
			cmd.addParameter("@TRANSFER_FAIL_IND", transferFailInd);
			cmd.addParameter("@APPROVAL_FAIL_IND", approvalFailInd);
			cmd.addParameter("@OTHER_INFRACT_IND", otherInfractInd);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@MI", mi);
			cmd.addParameter("@BIRTH_DATE", birthDate);
			cmd.addParameter("@BIRTH_NATN_CDE", birthNatnCde);
			cmd.addParameter("@LEGAL_NATN_CDE", legalNatnCde);
			cmd.addParameter("@USA_STREET_LINE1", usaStreetLine1);
			cmd.addParameter("@USA_STREET_LINE2", usaStreetLine2);
			cmd.addParameter("@USA_CITY", usaCity);
			cmd.addParameter("@USA_STAT_CODE", usaStatCode);
			cmd.addParameter("@USA_ZIP", usaZip);
			cmd.addParameter("@ROUTING_CDE", routingCde);
			cmd.addParameter("@NONUSA_STREET_LINE1", nonusaStreetLine1);
			cmd.addParameter("@NONUSA_STREET_LINE2", nonusaStreetLine2);
			cmd.addParameter("@NONUSA_CITY", nonusaCity);
			cmd.addParameter("@NONUSA_STATE", nonusaState);
			cmd.addParameter("@NONUSA_NATN_CDE", nonusaNatnCde);
			cmd.addParameter("@NONUSA_ZIP", nonusaZip);
			cmd.addParameter("@PROGRAM_BEGIN_DATE", programBeginDate);
			cmd.addParameter("@PROGRAM_END_DATE", programEndDate);
			cmd.addParameter("@PROGRAM_ENROLL_DATE", programEnrollDate);
			cmd.addParameter("@ENG_PROF_REASON", engProfReason);
			cmd.addParameter("@ACADEMIC_TERM_MONTHS", academicTermMonths);
			cmd.addParameter("@TUITION_EXPENSE", tuitionExpense);
			cmd.addParameter("@PERSONAL_FUNDS", personalFunds);
			cmd.addParameter("@FUNDING_COMMENT", fundingComment);
			cmd.addParameter("@SEVIS_ID", sevisId);
			cmd.addParameter("@VTYP_CDE", vtypCde);
			cmd.addParameter("@SVCR_CODE", svcrCode);
			cmd.addParameter("@SESSION_START_DATE", sessionStartDate);
			cmd.addParameter("@SESSION_END_DATE", sessionEndDate);
			cmd.addParameter("@TRANSFER_COMMENT", transferComment);
			cmd.addParameter("@ISSUE_COMMENT", issueComment);
			cmd.addParameter("@SVEL_CODE", svelCode);
			cmd.addParameter("@SVEL_COMMENT", svelComment);
			cmd.addParameter("@MAJR_CDE", majrCde);
			cmd.addParameter("@STUDY_LENGTH", studyLength);
			cmd.addParameter("@LIVING_EXPENSES", livingExpenses);
			cmd.addParameter("@SVFT_CODE", svftCode);
			cmd.addParameter("@AUTH_START_DATE", authStartDate);
			cmd.addParameter("@AUTH_END_DATE", authEndDate);
			cmd.addParameter("@COMPLETION_REMARKS", completionRemarks);
			cmd.addParameter("@NEW_PROGRAM_END_DATE", newProgramEndDate);
			cmd.addParameter("@DA_PROGRAM_START_DATE", daProgramStartDate);
			cmd.addParameter("@DA_PROGRAM_END_DATE", daProgramEndDate);
			cmd.addParameter("@DISC_ACTION_TEXT", discActionText);
			cmd.addParameter("@EXTEND_END_DATE", extendEndDate);
			cmd.addParameter("@SVTR_CODE", svtrCode);
			cmd.addParameter("@TERMINATE_DATE", terminateDate);
			cmd.addParameter("@APPROVAL_FAIL_COMMENT", approvalFailComment);
			cmd.addParameter("@OTHER_INFRACT_COMMENT", otherInfractComment);
			cmd.addParameter("@SVIT_CODE", svitCode);
			cmd.addParameter("@SVEP_CODE", svepCode);
			cmd.addParameter("@END_PROGRAM_EFF_DATE", endProgramEffDate);
			cmd.addParameter("@EV_FORM_NUMBER", evFormNumber);
			cmd.addParameter("@SVRP_CODE", svrpCode);
			cmd.addParameter("@REPRINT_REASON_COMMENT", reprintReasonComment);
			cmd.addParameter("@CREATE_DATE", createDate);
			cmd.addParameter("@SVTS_CODE", svtsCode);
			cmd.addParameter("@SVCR_COMMENT", svcrComment);
			cmd.addParameter("@PRINT_REQUEST_IND", printRequestInd);
			cmd.addParameter("@DEPENDENT_EXPENSES", dependentExpenses);
			cmd.addParameter("@OTHER_FUNDS", otherFunds);
			cmd.addParameter("@OTHER_FUNDS_COMMENT", otherFundsComment);
			cmd.addParameter("@OTHER_EXPENSES", otherExpenses);
			cmd.addParameter("@OTHER_EXP_COMMENT", otherExpComment);
			cmd.addParameter("@NEW_PROGRAM_START_DATE", newProgramStartDate);
			cmd.addParameter("@SVPC_CODE", svpcCode);
			cmd.addParameter("@SVSC_CODE", svscCode);
			cmd.addParameter("@SVSC_COMMENT", svscComment);
			cmd.addParameter("@SVCC_CODE", svccCode);
			cmd.addParameter("@GENDER", gender);
			cmd.addParameter("@SUFFIX", suffix);
			cmd.addParameter("@COMMUTER_IND", commuterInd);
			cmd.addParameter("@ADMISSION_NUMBER", admissionNumber);
			cmd.addParameter("@DRIVERS_LIC_NUMBER", driversLicNumber);
			cmd.addParameter("@STAT_CODE_DRIVERS_LIC", statCodeDriversLic);
			cmd.addParameter("@SSN", ssn);
			cmd.addParameter("@TIN", tin);
			cmd.addParameter("@MAJR_CDE_2", majrCde2);
			cmd.addParameter("@MAJR_CDE_MINR", majrCdeMinr);
			cmd.addParameter("@SCHOOL_FUNDS", schoolFunds);
			cmd.addParameter("@SCHOOL_FUNDS_COMMENT", schoolFundsComment);
			cmd.addParameter("@EMPLOYMENT_FUNDS", employmentFunds);
			cmd.addParameter("@SVFT_COMMENT", svftComment);
			cmd.addParameter("@SVEP_COMMENT", svepComment);
			cmd.addParameter("@SVTR_COMMENT", svtrComment);
			cmd.addParameter("@DA_COMMENT", daComment);
			cmd.addParameter("@PASSPORT_NUMBER", passportNumber);
			cmd.addParameter("@NATN_CDE_PASSPORT", natnCdePassport);
			cmd.addParameter("@PASSPORT_EXPIRE_DATE", passportExpireDate);
			cmd.addParameter("@VISA_NUMBER", visaNumber);
			cmd.addParameter("@SVCP_CODE", svcpCode);
			cmd.addParameter("@VISA_EXPIRE_DATE", visaExpireDate);
			cmd.addParameter("@PENT_CDE", pentCde);
			cmd.addParameter("@PENT_COMMENT", pentComment);
			cmd.addParameter("@ENTRY_DATE", entryDate);
			cmd.addParameter("@EMPL_AUTH_IND", emplAuthInd);
			cmd.addParameter("@RESCIND_REC_IND", rescindRecInd);
			cmd.addParameter("@RFC_COMMENT", rfcComment);
			cmd.addParameter("@EDIT_PROGRAM_COMMENT", editProgramComment);
			cmd.addParameter("@PROGRAM_SPONSOR_FUNDS", programSponsorFunds);
			cmd.addParameter("@US_FUNDS_IND", usFundsInd);
			cmd.addParameter("@GOVT_ORG_FUNDS", govtOrgFunds);
			cmd.addParameter("@SVGO_CODE", svgoCode);
			cmd.addParameter("@GOVT_ORG_FUNDS_2", govtOrgFunds2);
			cmd.addParameter("@SVGO_CODE_2", svgoCode2);
			cmd.addParameter("@INTL_ORG_FUNDS", intlOrgFunds);
			cmd.addParameter("@SVIO_CODE", svioCode);
			cmd.addParameter("@INTL_ORG_FUNDS_2", intlOrgFunds2);
			cmd.addParameter("@SVIO_CODE_2", svioCode2);
			cmd.addParameter("@EV_GOVT_FUNDS", evGovtFunds);
			cmd.addParameter("@BINATION_FUNDS", binationFunds);
			cmd.addParameter("@OTHER_ORG_FUNDS", otherOrgFunds);
			cmd.addParameter("@PROGRAM_START_IND", programStartInd);
			cmd.addParameter("@EXTEND_PROGRAM_COMMENT", extendProgramComment);
			cmd.addParameter("@AMEND_PROGRAM_COMMENT", amendProgramComment);
			cmd.addParameter("@MATRICULATION_CDE", matriculationCde);
			cmd.addParameter("@EXTEND_FAILURE_COMMENT", extendFailureComment);
			cmd.addParameter("@CONCLUDE_TRANS_COMMENT", concludeTransComment);
			cmd.addParameter("@BIRTH_CITY", birthCity);
			cmd.addParameter("@NATN_CDE_PERM_RES", natnCdePermRes);
			cmd.addParameter("@EDIT_BIO_COMMENT", editBioComment);
			cmd.addParameter("@STRUCTURE_UPDATE", structureUpdate);
			cmd.addParameter("@SCHOOL_CDE", schoolCde);
			cmd.addParameter("@PROGRAM_CDE", programCde);
			cmd.addParameter("@OFFICER_ID", officerId);
			cmd.addParameter("@SVFT_CANCEL_IND", svftCancelInd);
			cmd.addParameter("@SVCA_CODE", svcaCode);
			cmd.addParameter("@SVCA_COMMENT", svcaComment);
			cmd.addParameter("@VERIFY_STATUS_IND", verifyStatusInd);
			cmd.addParameter("@EXTENSION_CANCEL_IND", extensionCancelInd);
			cmd.addParameter("@VISA_ISSUE_DATE", visaIssueDate);
			cmd.addParameter("@PRIOR_SVFT_CODE", priorSvftCode);
			cmd.addParameter("@PRIOR_AUTH_START_DATE", priorAuthStartDate);
			cmd.addParameter("@PRIOR_AUTH_END_DATE", priorAuthEndDate);
			cmd.addParameter("@SVGO_NAME", svgoName);
			cmd.addParameter("@SVGO_NAME_2", svgoName2);
			cmd.addParameter("@SVIO_NAME", svioName);
			cmd.addParameter("@SVIO_NAME_2", svioName2);
			cmd.addParameter("@OTHER_ORG_NAME", otherOrgName);
			cmd.addParameter("@NOSHOW_IND", noshowInd);
			cmd.addParameter("@BIRTH_NATN_REASON_CDE", birthNatnReasonCde);
			cmd.addParameter("@SEVIS_RECORD_STATUS", sevisRecordStatus);
			cmd.addParameter("@SVSC_DESC", svscDesc);
			cmd.addParameter("@SVEL_CANCEL_IND", svelCancelInd);
			cmd.addParameter("@SVCT_CODE", svctCode);
				
			cmd.execute();


		}
		
		public static void pGorsevsInsertRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSEVS_INSERT_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGorsvahInsert(NNumber pidm,NNumber sevisSeqNo,NNumber seqNo,NString actSiteName,NString terminationInd,NDate activityDate,NString userId,NString streetLine1,NString streetLine2,NString city,NString statCode,NString zip,NString routingCde,NString actSiteComment,NString primarySiteInd,NString priorSiteName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSVAH_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEVIS_SEQ_NO", sevisSeqNo);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@ACT_SITE_NAME", actSiteName);
			cmd.addParameter("@TERMINATION_IND", terminationInd);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@STREET_LINE1", streetLine1);
			cmd.addParameter("@STREET_LINE2", streetLine2);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@STAT_CODE", statCode);
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@ROUTING_CDE", routingCde);
			cmd.addParameter("@ACT_SITE_COMMENT", actSiteComment);
			cmd.addParameter("@PRIMARY_SITE_IND", primarySiteInd);
			cmd.addParameter("@PRIOR_SITE_NAME", priorSiteName);
				
			cmd.execute();


		}
		
		public static void pGorsvahInsertActRows(NNumber pidmIn,NNumber holdSevisSeqno,NNumber currentSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSVAH_INSERT_ACT_ROWS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@HOLD_SEVIS_SEQNO", holdSevisSeqno);
			cmd.addParameter("@CURRENT_SEQNO", currentSeqno);
				
			cmd.execute();


		}
		
		public static void pGorsvahInsertAll(NNumber pidmIn,NNumber sevisSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSVAH_INSERT_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SEVIS_SEQNO_IN", sevisSeqnoIn);
				
			cmd.execute();


		}
		
		public static void pGorsvahInsertOne(NNumber pidmIn,NNumber seqnoIn,NNumber sevisSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSVAH_INSERT_ONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SEQNO_IN", seqnoIn);
			cmd.addParameter("@SEVIS_SEQNO_IN", sevisSeqnoIn);
				
			cmd.execute();


		}
		
		public static void pGorsvahUpdateOne() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSVAH_UPDATE_ONE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGorsvehInsert(NNumber pidm,NNumber sevisSeqNo,NNumber seqNo,NString employerName,NString empAuthInd,NString employmentTypeCde,NDate activityDate,NString userId,NString employmentCde,NString employmentTimeCde,NDate startDate,NDate endDate,NString streetLine1,NString streetLine2,NString city,NString statCode,NString zip,NString routingCde,NString courseRelevance,NString employmentComment,NString empCancelInd,NDate empPriorStartDate,NDate empPriorEndDate,NString priorEmploymentCde,NString empRecommendation,NString optAcadYrMetInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSVEH_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEVIS_SEQ_NO", sevisSeqNo);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@EMPLOYER_NAME", employerName);
			cmd.addParameter("@EMP_AUTH_IND", empAuthInd);
			cmd.addParameter("@EMPLOYMENT_TYPE_CDE", employmentTypeCde);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@EMPLOYMENT_CDE", employmentCde);
			cmd.addParameter("@EMPLOYMENT_TIME_CDE", employmentTimeCde);
			cmd.addParameter("@START_DATE", startDate);
			cmd.addParameter("@END_DATE", endDate);
			cmd.addParameter("@STREET_LINE1", streetLine1);
			cmd.addParameter("@STREET_LINE2", streetLine2);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@STAT_CODE", statCode);
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@ROUTING_CDE", routingCde);
			cmd.addParameter("@COURSE_RELEVANCE", courseRelevance);
			cmd.addParameter("@EMPLOYMENT_COMMENT", employmentComment);
			cmd.addParameter("@EMP_CANCEL_IND", empCancelInd);
			cmd.addParameter("@EMP_PRIOR_START_DATE", empPriorStartDate);
			cmd.addParameter("@EMP_PRIOR_END_DATE", empPriorEndDate);
			cmd.addParameter("@PRIOR_EMPLOYMENT_CDE", priorEmploymentCde);
			cmd.addParameter("@EMP_RECOMMENDATION", empRecommendation);
			cmd.addParameter("@OPT_ACAD_YR_MET_IND", optAcadYrMetInd);
				
			cmd.execute();


		}
		
		public static void pGorsvehInsertAll(NNumber pidmIn,NNumber sevisSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSVEH_INSERT_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SEVIS_SEQNO_IN", sevisSeqnoIn);
				
			cmd.execute();


		}
		
		public static void pGorsvehInsertEmpRows(NNumber pidmIn,NNumber holdSevisSeqno,NNumber currentSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSVEH_INSERT_EMP_ROWS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@HOLD_SEVIS_SEQNO", holdSevisSeqno);
			cmd.addParameter("@CURRENT_SEQNO", currentSeqno);
				
			cmd.execute();


		}
		
		public static void pGorsvehInsertOne(NNumber pidmIn,NNumber seqnoIn,NNumber sevisSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSVEH_INSERT_ONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SEQNO_IN", seqnoIn);
			cmd.addParameter("@SEVIS_SEQNO_IN", sevisSeqnoIn);
				
			cmd.execute();


		}
		
		public static void pGorsvehUpdateOne() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_GORSVEH_UPDATE_ONE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSelectCurrentActSite(NNumber pidmIn,NNumber actSeqnoIn,NNumber sevisSeqnoIn,Ref<NString> addInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_SELECT_CURRENT_ACT_SITE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ACT_SEQNO_IN", actSeqnoIn);
			cmd.addParameter("@SEVIS_SEQNO_IN", sevisSeqnoIn);
			cmd.addParameter("@ADD_IND", NString.class);
				
			cmd.execute();
			addInd.val = cmd.getParameterValue("@ADD_IND", NString.class);


		}
		
		public static void pSelectCurrentDep(NNumber pidmIn,NNumber depSeqnoIn,NString depSevisId,NNumber sevisSeqnoIn,Ref<NString> addInd,Ref<NString> reactivateInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_SELECT_CURRENT_DEP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DEP_SEQNO_IN", depSeqnoIn);
			cmd.addParameter("@DEP_SEVIS_ID", depSevisId);
			cmd.addParameter("@SEVIS_SEQNO_IN", sevisSeqnoIn);
			cmd.addParameter("@ADD_IND", NString.class);
			cmd.addParameter("@REACTIVATE_IND", NString.class);
				
			cmd.execute();
			addInd.val = cmd.getParameterValue("@ADD_IND", NString.class);
			reactivateInd.val = cmd.getParameterValue("@REACTIVATE_IND", NString.class);


		}
		
		public static void pSelectCurrentEmpInfo(NNumber pidmIn,NNumber empSeqnoIn,NNumber sevisSeqnoIn,Ref<NString> addInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_SELECT_CURRENT_EMP_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@EMP_SEQNO_IN", empSeqnoIn);
			cmd.addParameter("@SEVIS_SEQNO_IN", sevisSeqnoIn);
			cmd.addParameter("@ADD_IND", NString.class);
				
			cmd.execute();
			addInd.val = cmd.getParameterValue("@ADD_IND", NString.class);


		}
		
		public static void pSelectCurrentSevis(NNumber pidmIn,NString usageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_SELECT_CURRENT_SEVIS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@USAGE_IN", usageIn);
				
			cmd.execute();


		}
		
		public static void pSelectGovsvas(NNumber pidmIn,NNumber actSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_SELECT_GOVSVAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ACT_SEQNO_IN", actSeqnoIn);
				
			cmd.execute();


		}
		
		public static void pSelectGovsvdp(NNumber pidmIn,NNumber depSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_SELECT_GOVSVDP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DEP_SEQNO_IN", depSeqnoIn);
				
			cmd.execute();


		}
		
		public static void pSelectGovsvei(NNumber pidmIn,NNumber empSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_SELECT_GOVSVEI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@EMP_SEQNO_IN", empSeqnoIn);
				
			cmd.execute();


		}
		
		public static void pSelectGovsvev(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_SELECT_GOVSVEV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pSelectGovsvsd(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_SELECT_GOVSVSD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pValidateEvReqFields() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_VALIDATE_EV_REQ_FIELDS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pValidateStuReqFields() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVIS.P_VALIDATE_STU_REQ_FIELDS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
