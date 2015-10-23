package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkcgpa {
		public static void pCombTermGpa(NNumber pidm,NString levlCode,NString termCode,Ref<NNumber> combHoursAttempted,Ref<NNumber> combHoursPassed,Ref<NNumber> combHoursEarned,Ref<NNumber> combGpaHours,Ref<NNumber> combQualityPoints,Ref<NNumber> combGpa) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_COMB_TERM_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEVL_CODE", levlCode);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@COMB_HOURS_ATTEMPTED", combHoursAttempted, true);
			cmd.addParameter("@COMB_HOURS_PASSED", combHoursPassed, true);
			cmd.addParameter("@COMB_HOURS_EARNED", combHoursEarned, true);
			cmd.addParameter("@COMB_GPA_HOURS", combGpaHours, true);
			cmd.addParameter("@COMB_QUALITY_POINTS", combQualityPoints, true);
			cmd.addParameter("@COMB_GPA", combGpa, true);
				
			cmd.execute();
			combHoursAttempted.val = cmd.getParameterValue("@COMB_HOURS_ATTEMPTED", NNumber.class);
			combHoursPassed.val = cmd.getParameterValue("@COMB_HOURS_PASSED", NNumber.class);
			combHoursEarned.val = cmd.getParameterValue("@COMB_HOURS_EARNED", NNumber.class);
			combGpaHours.val = cmd.getParameterValue("@COMB_GPA_HOURS", NNumber.class);
			combQualityPoints.val = cmd.getParameterValue("@COMB_QUALITY_POINTS", NNumber.class);
			combGpa.val = cmd.getParameterValue("@COMB_GPA", NNumber.class);


		}
		
		public static void pCumScpsGpa(NNumber pidm,NString levlCode,NString scpsCode,Ref<NNumber> cumHoursAttempted,Ref<NNumber> cumHoursPassed,Ref<NNumber> cumHoursEarned,Ref<NNumber> cumGpaHours,Ref<NNumber> cumQualityPoints,Ref<NNumber> cumGpa) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_CUM_SCPS_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEVL_CODE", levlCode);
			cmd.addParameter("@SCPS_CODE", scpsCode);
			cmd.addParameter("@CUM_HOURS_ATTEMPTED", cumHoursAttempted, true);
			cmd.addParameter("@CUM_HOURS_PASSED", cumHoursPassed, true);
			cmd.addParameter("@CUM_HOURS_EARNED", cumHoursEarned, true);
			cmd.addParameter("@CUM_GPA_HOURS", cumGpaHours, true);
			cmd.addParameter("@CUM_QUALITY_POINTS", cumQualityPoints, true);
			cmd.addParameter("@CUM_GPA", cumGpa, true);
				
			cmd.execute();
			cumHoursAttempted.val = cmd.getParameterValue("@CUM_HOURS_ATTEMPTED", NNumber.class);
			cumHoursPassed.val = cmd.getParameterValue("@CUM_HOURS_PASSED", NNumber.class);
			cumHoursEarned.val = cmd.getParameterValue("@CUM_HOURS_EARNED", NNumber.class);
			cumGpaHours.val = cmd.getParameterValue("@CUM_GPA_HOURS", NNumber.class);
			cumQualityPoints.val = cmd.getParameterValue("@CUM_QUALITY_POINTS", NNumber.class);
			cumGpa.val = cmd.getParameterValue("@CUM_GPA", NNumber.class);


		}
		
		public static void pCumTermGpa(NNumber pidm,NString levlCode,NString termCode,Ref<NNumber> cumHoursAttempted,Ref<NNumber> cumHoursPassed,Ref<NNumber> cumHoursEarned,Ref<NNumber> cumGpaHours,Ref<NNumber> cumQualityPoints,Ref<NNumber> cumGpa) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_CUM_TERM_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEVL_CODE", levlCode);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@CUM_HOURS_ATTEMPTED", cumHoursAttempted, true);
			cmd.addParameter("@CUM_HOURS_PASSED", cumHoursPassed, true);
			cmd.addParameter("@CUM_HOURS_EARNED", cumHoursEarned, true);
			cmd.addParameter("@CUM_GPA_HOURS", cumGpaHours, true);
			cmd.addParameter("@CUM_QUALITY_POINTS", cumQualityPoints, true);
			cmd.addParameter("@CUM_GPA", cumGpa, true);
				
			cmd.execute();
			cumHoursAttempted.val = cmd.getParameterValue("@CUM_HOURS_ATTEMPTED", NNumber.class);
			cumHoursPassed.val = cmd.getParameterValue("@CUM_HOURS_PASSED", NNumber.class);
			cumHoursEarned.val = cmd.getParameterValue("@CUM_HOURS_EARNED", NNumber.class);
			cumGpaHours.val = cmd.getParameterValue("@CUM_GPA_HOURS", NNumber.class);
			cumQualityPoints.val = cmd.getParameterValue("@CUM_QUALITY_POINTS", NNumber.class);
			cumGpa.val = cmd.getParameterValue("@CUM_GPA", NNumber.class);


		}
		
		public static void pDegrGpa(NNumber pidm,NNumber dgmrSeqNo,Ref<NNumber> instHoursAttempted,Ref<NNumber> instHoursPassed,Ref<NNumber> instHoursEarned,Ref<NNumber> instGpaHours,Ref<NNumber> instQualityPoints,Ref<NNumber> instGpa,Ref<NNumber> tranHoursAttempted,Ref<NNumber> tranHoursPassed,Ref<NNumber> tranHoursEarned,Ref<NNumber> tranGpaHours,Ref<NNumber> tranQualityPoints,Ref<NNumber> tranGpa,Ref<NNumber> overHoursAttempted,Ref<NNumber> overHoursPassed,Ref<NNumber> overHoursEarned,Ref<NNumber> overGpaHours,Ref<NNumber> overQualityPoints,Ref<NNumber> overGpa) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_DEGR_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DGMR_SEQ_NO", dgmrSeqNo);
			cmd.addParameter("@INST_HOURS_ATTEMPTED", instHoursAttempted, true);
			cmd.addParameter("@INST_HOURS_PASSED", instHoursPassed, true);
			cmd.addParameter("@INST_HOURS_EARNED", instHoursEarned, true);
			cmd.addParameter("@INST_GPA_HOURS", instGpaHours, true);
			cmd.addParameter("@INST_QUALITY_POINTS", instQualityPoints, true);
			cmd.addParameter("@INST_GPA", instGpa, true);
			cmd.addParameter("@TRAN_HOURS_ATTEMPTED", tranHoursAttempted, true);
			cmd.addParameter("@TRAN_HOURS_PASSED", tranHoursPassed, true);
			cmd.addParameter("@TRAN_HOURS_EARNED", tranHoursEarned, true);
			cmd.addParameter("@TRAN_GPA_HOURS", tranGpaHours, true);
			cmd.addParameter("@TRAN_QUALITY_POINTS", tranQualityPoints, true);
			cmd.addParameter("@TRAN_GPA", tranGpa, true);
			cmd.addParameter("@OVER_HOURS_ATTEMPTED", overHoursAttempted, true);
			cmd.addParameter("@OVER_HOURS_PASSED", overHoursPassed, true);
			cmd.addParameter("@OVER_HOURS_EARNED", overHoursEarned, true);
			cmd.addParameter("@OVER_GPA_HOURS", overGpaHours, true);
			cmd.addParameter("@OVER_QUALITY_POINTS", overQualityPoints, true);
			cmd.addParameter("@OVER_GPA", overGpa, true);
				
			cmd.execute();
			instHoursAttempted.val = cmd.getParameterValue("@INST_HOURS_ATTEMPTED", NNumber.class);
			instHoursPassed.val = cmd.getParameterValue("@INST_HOURS_PASSED", NNumber.class);
			instHoursEarned.val = cmd.getParameterValue("@INST_HOURS_EARNED", NNumber.class);
			instGpaHours.val = cmd.getParameterValue("@INST_GPA_HOURS", NNumber.class);
			instQualityPoints.val = cmd.getParameterValue("@INST_QUALITY_POINTS", NNumber.class);
			instGpa.val = cmd.getParameterValue("@INST_GPA", NNumber.class);
			tranHoursAttempted.val = cmd.getParameterValue("@TRAN_HOURS_ATTEMPTED", NNumber.class);
			tranHoursPassed.val = cmd.getParameterValue("@TRAN_HOURS_PASSED", NNumber.class);
			tranHoursEarned.val = cmd.getParameterValue("@TRAN_HOURS_EARNED", NNumber.class);
			tranGpaHours.val = cmd.getParameterValue("@TRAN_GPA_HOURS", NNumber.class);
			tranQualityPoints.val = cmd.getParameterValue("@TRAN_QUALITY_POINTS", NNumber.class);
			tranGpa.val = cmd.getParameterValue("@TRAN_GPA", NNumber.class);
			overHoursAttempted.val = cmd.getParameterValue("@OVER_HOURS_ATTEMPTED", NNumber.class);
			overHoursPassed.val = cmd.getParameterValue("@OVER_HOURS_PASSED", NNumber.class);
			overHoursEarned.val = cmd.getParameterValue("@OVER_HOURS_EARNED", NNumber.class);
			overGpaHours.val = cmd.getParameterValue("@OVER_GPA_HOURS", NNumber.class);
			overQualityPoints.val = cmd.getParameterValue("@OVER_QUALITY_POINTS", NNumber.class);
			overGpa.val = cmd.getParameterValue("@OVER_GPA", NNumber.class);


		}
		
		public static void pDeleteScpGpa(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_DELETE_SCP_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pGetScpCode(NNumber pidm,NString termCode,Ref<NString> scpsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_GET_SCP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@SCPS_CODE", NString.class);
				
			cmd.execute();
			scpsCode.val = cmd.getParameterValue("@SCPS_CODE", NString.class);


		}
		
		public static void pGetStudentFormats(NNumber pidm,NString levl,NString campus,Ref<NString> stuTerm,Ref<NString> gpaRound,Ref<NNumber> gpaDigits,Ref<NString> qpRound,Ref<NNumber> qpDigits) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_GET_STUDENT_FORMATS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEVL", levl);
			cmd.addParameter("@CAMPUS", campus);
			cmd.addParameter("@STU_TERM", stuTerm, true);
			cmd.addParameter("@GPA_ROUND", NString.class);
			cmd.addParameter("@GPA_DIGITS", NNumber.class);
			cmd.addParameter("@QP_ROUND", NString.class);
			cmd.addParameter("@QP_DIGITS", NNumber.class);
				
			cmd.execute();
			stuTerm.val = cmd.getParameterValue("@STU_TERM", NString.class);
			gpaRound.val = cmd.getParameterValue("@GPA_ROUND", NString.class);
			gpaDigits.val = cmd.getParameterValue("@GPA_DIGITS", NNumber.class);
			qpRound.val = cmd.getParameterValue("@QP_ROUND", NString.class);
			qpDigits.val = cmd.getParameterValue("@QP_DIGITS", NNumber.class);


		}
		
		public static void pGetStudentFormatsOa(NNumber pidm,NString levl,NString campus,Ref<NString> stuTerm,Ref<NString> gpaRound,Ref<NNumber> gpaDigits,Ref<NString> qpRound,Ref<NNumber> qpDigits) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_GET_STUDENT_FORMATS_OA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEVL", levl);
			cmd.addParameter("@CAMPUS", campus);
			cmd.addParameter("@STU_TERM", stuTerm, true);
			cmd.addParameter("@GPA_ROUND", NString.class);
			cmd.addParameter("@GPA_DIGITS", NNumber.class);
			cmd.addParameter("@QP_ROUND", NString.class);
			cmd.addParameter("@QP_DIGITS", NNumber.class);
				
			cmd.execute();
			stuTerm.val = cmd.getParameterValue("@STU_TERM", NString.class);
			gpaRound.val = cmd.getParameterValue("@GPA_ROUND", NString.class);
			gpaDigits.val = cmd.getParameterValue("@GPA_DIGITS", NNumber.class);
			qpRound.val = cmd.getParameterValue("@QP_ROUND", NString.class);
			qpDigits.val = cmd.getParameterValue("@QP_DIGITS", NNumber.class);


		}
		
		public static void pInsertShrgpac(NNumber pidm,Ref<NString> term,NString levl,NString camp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_INSERT_SHRGPAC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term, true);
			cmd.addParameter("@LEVL", levl);
			cmd.addParameter("@CAMP", camp);
				
			cmd.execute();
			term.val = cmd.getParameterValue("@TERM", NString.class);


		}
		
		public static void pInsertShrgpacPrebanner(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_INSERT_SHRGPAC_PREBANNER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pLevelGpa(NNumber pidm,NString levlCodeIn,Ref<NNumber> hoursAttempted,Ref<NNumber> hoursPassed,Ref<NNumber> hoursEarned,Ref<NNumber> gpaHours,Ref<NNumber> qualityPoints,Ref<NNumber> gpa) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_LEVEL_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
			cmd.addParameter("@HOURS_ATTEMPTED", hoursAttempted, true);
			cmd.addParameter("@HOURS_PASSED", hoursPassed, true);
			cmd.addParameter("@HOURS_EARNED", hoursEarned, true);
			cmd.addParameter("@GPA_HOURS", gpaHours, true);
			cmd.addParameter("@QUALITY_POINTS", qualityPoints, true);
			cmd.addParameter("@GPA", gpa, true);
				
			cmd.execute();
			hoursAttempted.val = cmd.getParameterValue("@HOURS_ATTEMPTED", NNumber.class);
			hoursPassed.val = cmd.getParameterValue("@HOURS_PASSED", NNumber.class);
			hoursEarned.val = cmd.getParameterValue("@HOURS_EARNED", NNumber.class);
			gpaHours.val = cmd.getParameterValue("@GPA_HOURS", NNumber.class);
			qualityPoints.val = cmd.getParameterValue("@QUALITY_POINTS", NNumber.class);
			gpa.val = cmd.getParameterValue("@GPA", NNumber.class);


		}
		
		public static void pLevlcampGpa(NNumber pidm,NString levlCodeIn,NString campCode,Ref<NNumber> hoursAttempted,Ref<NNumber> hoursPassed,Ref<NNumber> hoursEarned,Ref<NNumber> gpaHours,Ref<NNumber> qualityPoints,Ref<NNumber> gpa) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_LEVLCAMP_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
			cmd.addParameter("@CAMP_CODE", campCode);
			cmd.addParameter("@HOURS_ATTEMPTED", hoursAttempted, true);
			cmd.addParameter("@HOURS_PASSED", hoursPassed, true);
			cmd.addParameter("@HOURS_EARNED", hoursEarned, true);
			cmd.addParameter("@GPA_HOURS", gpaHours, true);
			cmd.addParameter("@QUALITY_POINTS", qualityPoints, true);
			cmd.addParameter("@GPA", gpa, true);
				
			cmd.execute();
			hoursAttempted.val = cmd.getParameterValue("@HOURS_ATTEMPTED", NNumber.class);
			hoursPassed.val = cmd.getParameterValue("@HOURS_PASSED", NNumber.class);
			hoursEarned.val = cmd.getParameterValue("@HOURS_EARNED", NNumber.class);
			gpaHours.val = cmd.getParameterValue("@GPA_HOURS", NNumber.class);
			qualityPoints.val = cmd.getParameterValue("@QUALITY_POINTS", NNumber.class);
			gpa.val = cmd.getParameterValue("@GPA", NNumber.class);


		}
		
		public static void pMakeDispFormat(NNumber nbr,Ref<NString> nbrOut,Ref<NString> fmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_MAKE_DISP_FORMAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NBR", nbr);
			cmd.addParameter("@NBR_OUT", NString.class);
			cmd.addParameter("@FMT", NString.class);
				
			cmd.execute();
			nbrOut.val = cmd.getParameterValue("@NBR_OUT", NString.class);
			fmt.val = cmd.getParameterValue("@FMT", NString.class);


		}
		
		public static void pMakeDispWebFormat(NNumber nbr,Ref<NString> nbrOut,Ref<NString> fmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_MAKE_DISP_WEB_FORMAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NBR", nbr);
			cmd.addParameter("@NBR_OUT", NString.class);
			cmd.addParameter("@FMT", NString.class);
				
			cmd.execute();
			nbrOut.val = cmd.getParameterValue("@NBR_OUT", NString.class);
			fmt.val = cmd.getParameterValue("@FMT", NString.class);


		}
		
		public static void pMakeFieldFormat(NNumber maxlength,NNumber nbrDigits,Ref<NString> fmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_MAKE_FIELD_FORMAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAXLENGTH", maxlength);
			cmd.addParameter("@NBR_DIGITS", nbrDigits);
			cmd.addParameter("@FMT", NString.class);
				
			cmd.execute();
			fmt.val = cmd.getParameterValue("@FMT", NString.class);


		}
		
		public static void pMakeWebFormat(NNumber maxlength,NNumber nbrDigits,Ref<NString> fmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_MAKE_WEB_FORMAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAXLENGTH", maxlength);
			cmd.addParameter("@NBR_DIGITS", nbrDigits);
			cmd.addParameter("@FMT", NString.class);
				
			cmd.execute();
			fmt.val = cmd.getParameterValue("@FMT", NString.class);


		}
		
		public static void pScpGpa(NNumber pidm,NString levlCodeIn,NString termCode,Ref<NNumber> hoursAttempted,Ref<NNumber> hoursPassed,Ref<NNumber> hoursEarned,Ref<NNumber> gpaHours,Ref<NNumber> qualityPoints,Ref<NNumber> gpa) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_SCP_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@HOURS_ATTEMPTED", hoursAttempted, true);
			cmd.addParameter("@HOURS_PASSED", hoursPassed, true);
			cmd.addParameter("@HOURS_EARNED", hoursEarned, true);
			cmd.addParameter("@GPA_HOURS", gpaHours, true);
			cmd.addParameter("@QUALITY_POINTS", qualityPoints, true);
			cmd.addParameter("@GPA", gpa, true);
				
			cmd.execute();
			hoursAttempted.val = cmd.getParameterValue("@HOURS_ATTEMPTED", NNumber.class);
			hoursPassed.val = cmd.getParameterValue("@HOURS_PASSED", NNumber.class);
			hoursEarned.val = cmd.getParameterValue("@HOURS_EARNED", NNumber.class);
			gpaHours.val = cmd.getParameterValue("@GPA_HOURS", NNumber.class);
			qualityPoints.val = cmd.getParameterValue("@QUALITY_POINTS", NNumber.class);
			gpa.val = cmd.getParameterValue("@GPA", NNumber.class);


		}
		
		public static void pScpScpGpa(NNumber pidm,NString levlCodeIn,NString scpCode,Ref<NNumber> hoursAttempted,Ref<NNumber> hoursPassed,Ref<NNumber> hoursEarned,Ref<NNumber> gpaHours,Ref<NNumber> qualityPoints,Ref<NNumber> gpa) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_SCP_SCP_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
			cmd.addParameter("@SCP_CODE", scpCode);
			cmd.addParameter("@HOURS_ATTEMPTED", hoursAttempted, true);
			cmd.addParameter("@HOURS_PASSED", hoursPassed, true);
			cmd.addParameter("@HOURS_EARNED", hoursEarned, true);
			cmd.addParameter("@GPA_HOURS", gpaHours, true);
			cmd.addParameter("@QUALITY_POINTS", qualityPoints, true);
			cmd.addParameter("@GPA", gpa, true);
				
			cmd.execute();
			hoursAttempted.val = cmd.getParameterValue("@HOURS_ATTEMPTED", NNumber.class);
			hoursPassed.val = cmd.getParameterValue("@HOURS_PASSED", NNumber.class);
			hoursEarned.val = cmd.getParameterValue("@HOURS_EARNED", NNumber.class);
			gpaHours.val = cmd.getParameterValue("@GPA_HOURS", NNumber.class);
			qualityPoints.val = cmd.getParameterValue("@QUALITY_POINTS", NNumber.class);
			gpa.val = cmd.getParameterValue("@GPA", NNumber.class);


		}
		
		public static void pSubjGpa(NNumber pidm,NString subjCode,NString levlCode,Ref<NNumber> instHoursAttempted,Ref<NNumber> instHoursPassed,Ref<NNumber> instHoursEarned,Ref<NNumber> instGpaHours,Ref<NNumber> instQualityPoints,Ref<NNumber> instGpa,Ref<NNumber> tranHoursAttempted,Ref<NNumber> tranHoursPassed,Ref<NNumber> tranHoursEarned,Ref<NNumber> tranGpaHours,Ref<NNumber> tranQualityPoints,Ref<NNumber> tranGpa,Ref<NNumber> overHoursAttempted,Ref<NNumber> overHoursPassed,Ref<NNumber> overHoursEarned,Ref<NNumber> overGpaHours,Ref<NNumber> overQualityPoints,Ref<NNumber> overGpa) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_SUBJ_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SUBJ_CODE", subjCode);
			cmd.addParameter("@LEVL_CODE", levlCode);
			cmd.addParameter("@INST_HOURS_ATTEMPTED", instHoursAttempted, true);
			cmd.addParameter("@INST_HOURS_PASSED", instHoursPassed, true);
			cmd.addParameter("@INST_HOURS_EARNED", instHoursEarned, true);
			cmd.addParameter("@INST_GPA_HOURS", instGpaHours, true);
			cmd.addParameter("@INST_QUALITY_POINTS", instQualityPoints, true);
			cmd.addParameter("@INST_GPA", instGpa, true);
			cmd.addParameter("@TRAN_HOURS_ATTEMPTED", tranHoursAttempted, true);
			cmd.addParameter("@TRAN_HOURS_PASSED", tranHoursPassed, true);
			cmd.addParameter("@TRAN_HOURS_EARNED", tranHoursEarned, true);
			cmd.addParameter("@TRAN_GPA_HOURS", tranGpaHours, true);
			cmd.addParameter("@TRAN_QUALITY_POINTS", tranQualityPoints, true);
			cmd.addParameter("@TRAN_GPA", tranGpa, true);
			cmd.addParameter("@OVER_HOURS_ATTEMPTED", overHoursAttempted, true);
			cmd.addParameter("@OVER_HOURS_PASSED", overHoursPassed, true);
			cmd.addParameter("@OVER_HOURS_EARNED", overHoursEarned, true);
			cmd.addParameter("@OVER_GPA_HOURS", overGpaHours, true);
			cmd.addParameter("@OVER_QUALITY_POINTS", overQualityPoints, true);
			cmd.addParameter("@OVER_GPA", overGpa, true);
				
			cmd.execute();
			instHoursAttempted.val = cmd.getParameterValue("@INST_HOURS_ATTEMPTED", NNumber.class);
			instHoursPassed.val = cmd.getParameterValue("@INST_HOURS_PASSED", NNumber.class);
			instHoursEarned.val = cmd.getParameterValue("@INST_HOURS_EARNED", NNumber.class);
			instGpaHours.val = cmd.getParameterValue("@INST_GPA_HOURS", NNumber.class);
			instQualityPoints.val = cmd.getParameterValue("@INST_QUALITY_POINTS", NNumber.class);
			instGpa.val = cmd.getParameterValue("@INST_GPA", NNumber.class);
			tranHoursAttempted.val = cmd.getParameterValue("@TRAN_HOURS_ATTEMPTED", NNumber.class);
			tranHoursPassed.val = cmd.getParameterValue("@TRAN_HOURS_PASSED", NNumber.class);
			tranHoursEarned.val = cmd.getParameterValue("@TRAN_HOURS_EARNED", NNumber.class);
			tranGpaHours.val = cmd.getParameterValue("@TRAN_GPA_HOURS", NNumber.class);
			tranQualityPoints.val = cmd.getParameterValue("@TRAN_QUALITY_POINTS", NNumber.class);
			tranGpa.val = cmd.getParameterValue("@TRAN_GPA", NNumber.class);
			overHoursAttempted.val = cmd.getParameterValue("@OVER_HOURS_ATTEMPTED", NNumber.class);
			overHoursPassed.val = cmd.getParameterValue("@OVER_HOURS_PASSED", NNumber.class);
			overHoursEarned.val = cmd.getParameterValue("@OVER_HOURS_EARNED", NNumber.class);
			overGpaHours.val = cmd.getParameterValue("@OVER_GPA_HOURS", NNumber.class);
			overQualityPoints.val = cmd.getParameterValue("@OVER_QUALITY_POINTS", NNumber.class);
			overGpa.val = cmd.getParameterValue("@OVER_GPA", NNumber.class);


		}
		
		public static void pTermGpa(NNumber pidm,NString termCode,NString samsys) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_TERM_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@SAMSYS", samsys);
				
			cmd.execute();


		}
		
		public static void pTermcampGpa(NNumber pidm,NString levlCode,NString termCode,NString campCode,Ref<NNumber> hoursAttempted,Ref<NNumber> hoursPassed,Ref<NNumber> hoursEarned,Ref<NNumber> gpaHours,Ref<NNumber> qualityPoints,Ref<NNumber> gpa) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_TERMCAMP_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEVL_CODE", levlCode);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@CAMP_CODE", campCode);
			cmd.addParameter("@HOURS_ATTEMPTED", hoursAttempted, true);
			cmd.addParameter("@HOURS_PASSED", hoursPassed, true);
			cmd.addParameter("@HOURS_EARNED", hoursEarned, true);
			cmd.addParameter("@GPA_HOURS", gpaHours, true);
			cmd.addParameter("@QUALITY_POINTS", qualityPoints, true);
			cmd.addParameter("@GPA", gpa, true);
				
			cmd.execute();
			hoursAttempted.val = cmd.getParameterValue("@HOURS_ATTEMPTED", NNumber.class);
			hoursPassed.val = cmd.getParameterValue("@HOURS_PASSED", NNumber.class);
			hoursEarned.val = cmd.getParameterValue("@HOURS_EARNED", NNumber.class);
			gpaHours.val = cmd.getParameterValue("@GPA_HOURS", NNumber.class);
			qualityPoints.val = cmd.getParameterValue("@QUALITY_POINTS", NNumber.class);
			gpa.val = cmd.getParameterValue("@GPA", NNumber.class);


		}
		
		public static void pTermlvlGpa(NNumber pidm,NString levlCode,NString termCode,Ref<NNumber> hoursAttempted,Ref<NNumber> hoursPassed,Ref<NNumber> hoursEarned,Ref<NNumber> gpaHours,Ref<NNumber> qualityPoints,Ref<NNumber> gpa) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_TERMLVL_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEVL_CODE", levlCode);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@HOURS_ATTEMPTED", hoursAttempted, true);
			cmd.addParameter("@HOURS_PASSED", hoursPassed, true);
			cmd.addParameter("@HOURS_EARNED", hoursEarned, true);
			cmd.addParameter("@GPA_HOURS", gpaHours, true);
			cmd.addParameter("@QUALITY_POINTS", qualityPoints, true);
			cmd.addParameter("@GPA", gpa, true);
				
			cmd.execute();
			hoursAttempted.val = cmd.getParameterValue("@HOURS_ATTEMPTED", NNumber.class);
			hoursPassed.val = cmd.getParameterValue("@HOURS_PASSED", NNumber.class);
			hoursEarned.val = cmd.getParameterValue("@HOURS_EARNED", NNumber.class);
			gpaHours.val = cmd.getParameterValue("@GPA_HOURS", NNumber.class);
			qualityPoints.val = cmd.getParameterValue("@QUALITY_POINTS", NNumber.class);
			gpa.val = cmd.getParameterValue("@GPA", NNumber.class);


		}
		
		public static void pTranGpa(NNumber pidm,NNumber tritSeqNo,NNumber tramSeqNo,NString samsys) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_TRAN_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TRIT_SEQ_NO", tritSeqNo);
			cmd.addParameter("@TRAM_SEQ_NO", tramSeqNo);
			cmd.addParameter("@SAMSYS", samsys);
				
			cmd.execute();


		}
		
		public static void pTruncOrRound(NNumber nbrDigits,NString truncRoundCde,NNumber valueIn,Ref<NNumber> valueOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKCGPA.P_TRUNC_OR_ROUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NBR_DIGITS", nbrDigits);
			cmd.addParameter("@TRUNC_ROUND_CDE", truncRoundCde);
			cmd.addParameter("@VALUE_IN", valueIn);
			cmd.addParameter("@VALUE_OUT", NNumber.class);
				
			cmd.execute();
			valueOut.val = cmd.getParameterValue("@VALUE_OUT", NNumber.class);


		}
		
	
	
	
}
