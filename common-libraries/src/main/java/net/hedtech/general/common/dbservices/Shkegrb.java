package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkegrb {
		public static NNumber fCalGcomPercent(NString termCodeIn,NString crnIn,NNumber gcomId,NNumber scoreIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_CAL_GCOM_PERCENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@SCORE_IN", scoreIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalculateFinalPercentage(NString termCodeIn,NString crnIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_CALCULATE_FINAL_PERCENTAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalculateFinalWeight(NString termCodeIn,NString crnIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_CALCULATE_FINAL_WEIGHT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalculateGcomPercentage(NString termCodeIn,NString crnIn,NNumber gcomId,NNumber scoreIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_CALCULATE_GCOM_PERCENTAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@SCORE_IN", scoreIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalculateMidtermPercentage(NString termCodeIn,NString crnIn,NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_CALCULATE_MIDTERM_PERCENTAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalculateMidtermWeight(NString termCodeIn,NString crnIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_CALCULATE_MIDTERM_WEIGHT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fCheckForCalculation(NString termCodeIn,NString crnIn,NNumber pidmIn,NString inclIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_CHECK_FOR_CALCULATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@INCL_IN", inclIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckShrcmrk(NString termCodeIn,NString crnIn,NNumber pidmIn,NString rectypeIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_CHECK_SHRCMRK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@RECTYPE_IND_IN", rectypeIndIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckShrmrksGrade(NString termCodeIn,NString crnIn,NNumber pidmIn,NNumber gcomId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_CHECK_SHRMRKS_GRADE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GCOM_ID", gcomId);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckshrmrksgrades(NString term,NString crn,NNumber pidm,NString rectypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_CHECKSHRMRKSGRADES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@RECTYPE_IND", rectypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fCountGcom(NString termCodeIn,NString crnIn,NString inclIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_COUNT_GCOM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@INCL_IN", inclIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCountScores(NString termCodeIn,NString crnIn,NNumber pidmIn,NString inclIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_COUNT_SCORES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@INCL_IN", inclIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fCountShrsmrkIncompletes(NString term,NString crn,NNumber gcomId,NNumber scomId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_COUNT_SHRSMRK_INCOMPLETES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@SCOM_ID", scomId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCountshrcmrkrecords(NString term,NString crn,NString rectypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_COUNTSHRCMRKRECORDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@RECTYPE_IND", rectypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCountshrmrksincompletes(NString term,NString crn,NNumber gcomId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_COUNTSHRMRKSINCOMPLETES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@GCOM_ID", gcomId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCreateExamId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_CREATE_EXAM_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fDefaultGradeScale(NString termCodeIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_DEFAULT_GRADE_SCALE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFailGrade(NString gradeScaleIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_GET_FAIL_GRADE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GRADE_SCALE_ID_IN", gradeScaleIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGradeCode(NString gradeScaleIdIn,NNumber percentIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_GET_GRADE_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GRADE_SCALE_ID_IN", gradeScaleIdIn);
			cmd.addParameter("@PERCENT_IN", percentIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGradeScale(NString termCodeIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_GET_GRADE_SCALE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetScore(NString termCodeIn,NString crnIn,NNumber gcomId,NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_GET_SCORE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetTotalScore(NString termCodeIn,NString crnIn,NNumber gcomId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_GET_TOTAL_SCORE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID", gcomId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetgcomrectype(NString term,NString crn,NNumber gcomId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_GETGCOMRECTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@GCOM_ID", gcomId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fSelectShrscom(NString pTermCode,NString pCrn,NNumber pGcomId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_SELECT_SHRSCOM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_GCOM_ID", pGcomId);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fTotalPassCheck(NString termCodeIn,NString crnIn,NNumber pidmIn,NString gradeScaleIdIn,NString inclIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.F_TOTAL_PASS_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GRADE_SCALE_ID_IN", gradeScaleIdIn);
			cmd.addParameter("@INCL_IND_IN", inclIndIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCalcClassScores(NString termCodeIn,NString crnIn,NString inclIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_CALC_CLASS_SCORES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@INCL_IN", inclIn);
				
			cmd.execute();


		}
		
		public static void pCalcGradableComp(NString termCodeIn,NString crnIn,NNumber pidmIn,NNumber gcomId,NNumber scoreIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_CALC_GRADABLE_COMP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@SCORE_IN", scoreIn);
				
			cmd.execute();


		}
		
		public static void pCalcShrsmrkGradeOrScore(NString termIn,NString crnIn,NNumber gcomIdIn,NNumber scomIdIn,NString gchgCodeIn,NBool gradeChangedIn,NBool scoreChangedIn,Ref<NNumber> scoreIo,Ref<NNumber> percentageIo,Ref<NString> grdeCodeIo,Ref<NString> gradeScaleOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_CALC_SHRSMRK_GRADE_OR_SCORE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID_IN", gcomIdIn);
			cmd.addParameter("@SCOM_ID_IN", scomIdIn);
			cmd.addParameter("@GCHG_CODE_IN", gchgCodeIn);
			cmd.addParameter("@GRADE_CHANGED_IN", gradeChangedIn);
			cmd.addParameter("@SCORE_CHANGED_IN", scoreChangedIn);
			cmd.addParameter("@SCORE_IO", scoreIo, true);
			cmd.addParameter("@PERCENTAGE_IO", percentageIo, true);
			cmd.addParameter("@GRDE_CODE_IO", grdeCodeIo, true);
			cmd.addParameter("@GRADE_SCALE_OUT", NString.class);
				
			cmd.execute();
			scoreIo.val = cmd.getParameterValue("@SCORE_IO", NNumber.class);
			percentageIo.val = cmd.getParameterValue("@PERCENTAGE_IO", NNumber.class);
			grdeCodeIo.val = cmd.getParameterValue("@GRDE_CODE_IO", NString.class);
			gradeScaleOut.val = cmd.getParameterValue("@GRADE_SCALE_OUT", NString.class);


		}
		
		public static void pCalcStudentScores(NNumber pidmIn,NString termCodeIn,NString crnIn,NString inclIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_CALC_STUDENT_SCORES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@INCL_IN", inclIn);
				
			cmd.execute();


		}
		
		public static void pCalcclassstudentgrade(NNumber pidm,NString termCode,NString crn,NString inclInd,Ref<NNumber> cmrkPercentage,Ref<NString> cmrkGrdeCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_CALCCLASSSTUDENTGRADE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@INCL_IND", inclInd);
			cmd.addParameter("@CMRK_PERCENTAGE", cmrkPercentage, true);
			cmd.addParameter("@CMRK_GRDE_CODE", NString.class);
				
			cmd.execute();
			cmrkPercentage.val = cmd.getParameterValue("@CMRK_PERCENTAGE", NNumber.class);
			cmrkGrdeCode.val = cmd.getParameterValue("@CMRK_GRDE_CODE", NString.class);


		}
		
//		public static void pCommitfingrd(List<Varchar2TabtypeRow> grdeTab,List<Varchar2TabtypeRow> attendTab,List<Varchar2TabtypeRow> hrsTab,List<Varchar2TabtypeRow> rowidTab,NNumber studentCount,NString menuName,Ref<NString> msgLabel,NString gradeUpdInd,NString pDateFormat,Ref<NBool> incmpFoundOut,Ref<List<Varchar2TabtypeRow>> incmpGrdeTabOut,Ref<List<Varchar2TabtypeRow>> incmpRowidTabOut,Ref<NNumber> incmpStudentCountOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_COMMITFINGRD", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("GRDE_TAB", "", grdeTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ATTEND_TAB", "", attendTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("HRS_TAB", "", hrsTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ROWID_TAB", "", rowidTab, object.class));
//			cmd.addParameter("@STUDENT_COUNT", studentCount);
//			cmd.addParameter("@MENU_NAME", menuName);
//			cmd.addParameter("@MSG_LABEL", NString.class);
//			cmd.addParameter("@GRADE_UPD_IND", gradeUpdInd);
//			cmd.addParameter("@P_DATE_FORMAT", pDateFormat);
//			cmd.addParameter("@INCMP_FOUND_OUT", NBool.class);
//			// cmd.addParameter(DbTypes.getTableType("INCMP_GRDE_TAB_OUT", "", object.class));
//			// cmd.addParameter(DbTypes.getTableType("INCMP_ROWID_TAB_OUT", "", object.class));
//			cmd.addParameter("@INCMP_STUDENT_COUNT_OUT", NNumber.class);
//				
//			cmd.execute();
//			msgLabel.val = cmd.getParameterValue("@MSG_LABEL", NString.class);
//			incmpFoundOut.val = cmd.getParameterValue("@INCMP_FOUND_OUT", NBool.class);
//			// incmpGrdeTabOut.val = cmd.getTableParameterValue("@INCMP_GRDE_TAB_OUT", object.class);
//			// incmpRowidTabOut.val = cmd.getTableParameterValue("@INCMP_ROWID_TAB_OUT", object.class);
//			incmpStudentCountOut.val = cmd.getParameterValue("@INCMP_STUDENT_COUNT_OUT", NNumber.class);
//
//
//		}
		
//		public static void pCommitincmpgrd(List<Varchar2TabtypeRow> grdeTab,List<Varchar2TabtypeRow> incmpTab,List<Varchar2TabtypeRow> extDateTab,List<Varchar2TabtypeRow> rowidTab,NNumber studentCount,Ref<NString> msgLabel,NString pSaveGrdeInd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_COMMITINCMPGRD", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("GRDE_TAB", "", grdeTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("INCMP_TAB", "", incmpTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EXT_DATE_TAB", "", extDateTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ROWID_TAB", "", rowidTab, object.class));
//			cmd.addParameter("@STUDENT_COUNT", studentCount);
//			cmd.addParameter("@MSG_LABEL", NString.class);
//			cmd.addParameter("@P_SAVE_GRDE_IND", pSaveGrdeInd);
//				
//			cmd.execute();
//			msgLabel.val = cmd.getParameterValue("@MSG_LABEL", NString.class);
//
//
//		}
		
		public static void pComponentLateresit(NString termCodeIn,NString crnIn,NNumber gcomIdIn,NNumber pidmIn,NDate completedDateIn,NDate dueDateIn,NDate extensionDateIn,Ref<NString> gradeChangeIo,Ref<NNumber> scoreIo,Ref<NNumber> percentageIo,Ref<NBool> compMarkRecalculatedOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_COMPONENT_LATERESIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID_IN", gcomIdIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@COMPLETED_DATE_IN", completedDateIn);
			cmd.addParameter("@DUE_DATE_IN", dueDateIn);
			cmd.addParameter("@EXTENSION_DATE_IN", extensionDateIn);
			cmd.addParameter("@GRADE_CHANGE_IO", gradeChangeIo, true);
			cmd.addParameter("@SCORE_IO", scoreIo, true);
			cmd.addParameter("@PERCENTAGE_IO", percentageIo, true);
			cmd.addParameter("@COMP_MARK_RECALCULATED_OUT", NBool.class);
				
			cmd.execute();
			gradeChangeIo.val = cmd.getParameterValue("@GRADE_CHANGE_IO", NString.class);
			scoreIo.val = cmd.getParameterValue("@SCORE_IO", NNumber.class);
			percentageIo.val = cmd.getParameterValue("@PERCENTAGE_IO", NNumber.class);
			compMarkRecalculatedOut.val = cmd.getParameterValue("@COMP_MARK_RECALCULATED_OUT", NBool.class);


		}
		
		public static void pDeleteShrcmrk(NString termCodeIn,NString crnIn,NNumber gcomIdIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_DELETE_SHRCMRK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID_IN", gcomIdIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pDeleteShrmrksForReg(NNumber pidmIn,NString termCodeIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_DELETE_SHRMRKS_FOR_REG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pGetShrgrscFromScore(NString gradeScaleIn,NNumber percentageIn,Ref<NString> gradeCodeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_GET_SHRGRSC_FROM_SCORE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GRADE_SCALE_IN", gradeScaleIn);
			cmd.addParameter("@PERCENTAGE_IN", percentageIn);
			cmd.addParameter("@GRADE_CODE_OUT", NString.class);
				
			cmd.execute();
			gradeCodeOut.val = cmd.getParameterValue("@GRADE_CODE_OUT", NString.class);


		}
		
		public static void pInsertShrcmrk(NString termCodeIn,NString crnIn,NNumber pidmIn,NString midFinIndIn,NString gradeIn,NNumber percentageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_INSERT_SHRCMRK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@MID_FIN_IND_IN", midFinIndIn);
			cmd.addParameter("@GRADE_IN", gradeIn);
			cmd.addParameter("@PERCENTAGE_IN", percentageIn);
				
			cmd.execute();


		}
		
		public static void pInsertShrmrks(NNumber gcomId,NString termCode,NString crn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_INSERT_SHRMRKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@CRN", crn);
				
			cmd.execute();


		}
		
		public static void pInsertShrmrksForReg(NNumber pidmIn,NString termCodeIn,NString crnIn,NString gchgCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_INSERT_SHRMRKS_FOR_REG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCHG_CODE_IN", gchgCodeIn);
				
			cmd.execute();


		}
		
		public static void pInsertShrmrksRecords(NNumber gcomId,NString termCodeIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_INSERT_SHRMRKS_RECORDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pRecalcClassScores(NString termCodeIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_RECALC_CLASS_SCORES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pSelectComponentResits(NString termCodeIn,NString crnIn,NNumber gcomIdIn,NNumber pidmIn,NString compResitRuleIn,Ref<NBool> resitCountExceededOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_SELECT_COMPONENT_RESITS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID_IN", gcomIdIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@COMP_RESIT_RULE_IN", compResitRuleIn);
			cmd.addParameter("@RESIT_COUNT_EXCEEDED_OUT", NBool.class);
				
			cmd.execute();
			resitCountExceededOut.val = cmd.getParameterValue("@RESIT_COUNT_EXCEEDED_OUT", NBool.class);


		}
		
		public static void pSelectSubComponentResits(NString termCodeIn,NString crnIn,NNumber gcomIdIn,NNumber scomIdIn,NNumber pidmIn,NString subResitRuleIn,Ref<NBool> resitCountExceededOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_SELECT_SUB_COMPONENT_RESITS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID_IN", gcomIdIn);
			cmd.addParameter("@SCOM_ID_IN", scomIdIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SUB_RESIT_RULE_IN", subResitRuleIn);
			cmd.addParameter("@RESIT_COUNT_EXCEEDED_OUT", NBool.class);
				
			cmd.execute();
			resitCountExceededOut.val = cmd.getParameterValue("@RESIT_COUNT_EXCEEDED_OUT", NBool.class);


		}
		
		public static void pShrcmrkprocess(NString term,NString crn,NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_SHRCMRKPROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pShrgcomupdateproc(NString term,NString crn,NNumber gcomId,NString gcomInclInd,NString ssbsectUpdind,NString dbAction) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_SHRGCOMUPDATEPROC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@GCOM_INCL_IND", gcomInclInd);
			cmd.addParameter("@SSBSECT_UPDIND", ssbsectUpdind);
			cmd.addParameter("@DB_ACTION", dbAction);
				
			cmd.execute();


		}
		
		public static void pShrmrksDeleteAudit(NString oldTermCodeIn,NString oldCrnIn,NNumber oldPidmIn,NNumber oldGcomIdIn,NString oldGchgCodeIn,NDate oldGcomDateIn,NDate oldMarkCalcDateIn,NNumber oldScoreIn,NNumber oldPercentageIn,NString oldGrdeCodeIn,NDate oldCompletedDateIn,NDate oldReturnedDateIn,NDate oldExtensionDateIn,NNumber oldMarkerIn,NString oldCommentsIn,NDate oldRollDateIn,NDate oldActDateIn,NString oldUserIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_SHRMRKS_DELETE_AUDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_TERM_CODE_IN", oldTermCodeIn);
			cmd.addParameter("@OLD_CRN_IN", oldCrnIn);
			cmd.addParameter("@OLD_PIDM_IN", oldPidmIn);
			cmd.addParameter("@OLD_GCOM_ID_IN", oldGcomIdIn);
			cmd.addParameter("@OLD_GCHG_CODE_IN", oldGchgCodeIn);
			cmd.addParameter("@OLD_GCOM_DATE_IN", oldGcomDateIn);
			cmd.addParameter("@OLD_MARK_CALC_DATE_IN", oldMarkCalcDateIn);
			cmd.addParameter("@OLD_SCORE_IN", oldScoreIn);
			cmd.addParameter("@OLD_PERCENTAGE_IN", oldPercentageIn);
			cmd.addParameter("@OLD_GRDE_CODE_IN", oldGrdeCodeIn);
			cmd.addParameter("@OLD_COMPLETED_DATE_IN", oldCompletedDateIn);
			cmd.addParameter("@OLD_RETURNED_DATE_IN", oldReturnedDateIn);
			cmd.addParameter("@OLD_EXTENSION_DATE_IN", oldExtensionDateIn);
			cmd.addParameter("@OLD_MARKER_IN", oldMarkerIn);
			cmd.addParameter("@OLD_COMMENTS_IN", oldCommentsIn);
			cmd.addParameter("@OLD_ROLL_DATE_IN", oldRollDateIn);
			cmd.addParameter("@OLD_ACT_DATE_IN", oldActDateIn);
			cmd.addParameter("@OLD_USER_IN", oldUserIn);
				
			cmd.execute();


		}
		
		public static void pShrmrksInsertAudit(NString newTermCodeIn,NString newCrnIn,NNumber newPidmIn,NNumber newGcomIdIn,NString newGchgCodeIn,NDate newGcomDateIn,NDate newMarkCalcDateIn,NNumber newScoreIn,NNumber newPercentageIn,NString newGrdeCodeIn,NDate newCompletedDateIn,NDate newReturnedDateIn,NDate newExtensionDateIn,NNumber newMarkerIn,NString newCommentsIn,NDate newRollDateIn,NDate newActDateIn,NString newUserIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_SHRMRKS_INSERT_AUDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_TERM_CODE_IN", newTermCodeIn);
			cmd.addParameter("@NEW_CRN_IN", newCrnIn);
			cmd.addParameter("@NEW_PIDM_IN", newPidmIn);
			cmd.addParameter("@NEW_GCOM_ID_IN", newGcomIdIn);
			cmd.addParameter("@NEW_GCHG_CODE_IN", newGchgCodeIn);
			cmd.addParameter("@NEW_GCOM_DATE_IN", newGcomDateIn);
			cmd.addParameter("@NEW_MARK_CALC_DATE_IN", newMarkCalcDateIn);
			cmd.addParameter("@NEW_SCORE_IN", newScoreIn);
			cmd.addParameter("@NEW_PERCENTAGE_IN", newPercentageIn);
			cmd.addParameter("@NEW_GRDE_CODE_IN", newGrdeCodeIn);
			cmd.addParameter("@NEW_COMPLETED_DATE_IN", newCompletedDateIn);
			cmd.addParameter("@NEW_RETURNED_DATE_IN", newReturnedDateIn);
			cmd.addParameter("@NEW_EXTENSION_DATE_IN", newExtensionDateIn);
			cmd.addParameter("@NEW_MARKER_IN", newMarkerIn);
			cmd.addParameter("@NEW_COMMENTS_IN", newCommentsIn);
			cmd.addParameter("@NEW_ROLL_DATE_IN", newRollDateIn);
			cmd.addParameter("@NEW_ACT_DATE_IN", newActDateIn);
			cmd.addParameter("@NEW_USER_IN", newUserIn);
				
			cmd.execute();


		}
		
		public static void pShrmrksProcess(NString termIn,NString crnIn,NNumber gcomIdIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_SHRMRKS_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID_IN", gcomIdIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pShrmrksUpdateAudit(NString oldTermCodeIn,NString oldCrnIn,NNumber oldPidmIn,NNumber oldGcomIdIn,NString oldGchgCodeIn,NDate oldGcomDateIn,NDate oldMarkCalcDateIn,NNumber oldScoreIn,NNumber oldPercentageIn,NString oldGrdeCodeIn,NDate oldCompletedDateIn,NDate oldReturnedDateIn,NDate oldExtensionDateIn,NNumber oldMarkerIn,NString oldCommentsIn,NDate oldRollDateIn,NDate oldActDateIn,NString oldUserIn,NString newTermCodeIn,NString newCrnIn,NNumber newPidmIn,NNumber newGcomIdIn,NString newGchgCodeIn,NDate newGcomDateIn,NDate newMarkCalcDateIn,NNumber newScoreIn,NNumber newPercentageIn,NString newGrdeCodeIn,NDate newCompletedDateIn,NDate newReturnedDateIn,NDate newExtensionDateIn,NNumber newMarkerIn,NString newCommentsIn,NDate newRollDateIn,NDate newActDateIn,NString newUserIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_SHRMRKS_UPDATE_AUDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_TERM_CODE_IN", oldTermCodeIn);
			cmd.addParameter("@OLD_CRN_IN", oldCrnIn);
			cmd.addParameter("@OLD_PIDM_IN", oldPidmIn);
			cmd.addParameter("@OLD_GCOM_ID_IN", oldGcomIdIn);
			cmd.addParameter("@OLD_GCHG_CODE_IN", oldGchgCodeIn);
			cmd.addParameter("@OLD_GCOM_DATE_IN", oldGcomDateIn);
			cmd.addParameter("@OLD_MARK_CALC_DATE_IN", oldMarkCalcDateIn);
			cmd.addParameter("@OLD_SCORE_IN", oldScoreIn);
			cmd.addParameter("@OLD_PERCENTAGE_IN", oldPercentageIn);
			cmd.addParameter("@OLD_GRDE_CODE_IN", oldGrdeCodeIn);
			cmd.addParameter("@OLD_COMPLETED_DATE_IN", oldCompletedDateIn);
			cmd.addParameter("@OLD_RETURNED_DATE_IN", oldReturnedDateIn);
			cmd.addParameter("@OLD_EXTENSION_DATE_IN", oldExtensionDateIn);
			cmd.addParameter("@OLD_MARKER_IN", oldMarkerIn);
			cmd.addParameter("@OLD_COMMENTS_IN", oldCommentsIn);
			cmd.addParameter("@OLD_ROLL_DATE_IN", oldRollDateIn);
			cmd.addParameter("@OLD_ACT_DATE_IN", oldActDateIn);
			cmd.addParameter("@OLD_USER_IN", oldUserIn);
			cmd.addParameter("@NEW_TERM_CODE_IN", newTermCodeIn);
			cmd.addParameter("@NEW_CRN_IN", newCrnIn);
			cmd.addParameter("@NEW_PIDM_IN", newPidmIn);
			cmd.addParameter("@NEW_GCOM_ID_IN", newGcomIdIn);
			cmd.addParameter("@NEW_GCHG_CODE_IN", newGchgCodeIn);
			cmd.addParameter("@NEW_GCOM_DATE_IN", newGcomDateIn);
			cmd.addParameter("@NEW_MARK_CALC_DATE_IN", newMarkCalcDateIn);
			cmd.addParameter("@NEW_SCORE_IN", newScoreIn);
			cmd.addParameter("@NEW_PERCENTAGE_IN", newPercentageIn);
			cmd.addParameter("@NEW_GRDE_CODE_IN", newGrdeCodeIn);
			cmd.addParameter("@NEW_COMPLETED_DATE_IN", newCompletedDateIn);
			cmd.addParameter("@NEW_RETURNED_DATE_IN", newReturnedDateIn);
			cmd.addParameter("@NEW_EXTENSION_DATE_IN", newExtensionDateIn);
			cmd.addParameter("@NEW_MARKER_IN", newMarkerIn);
			cmd.addParameter("@NEW_COMMENTS_IN", newCommentsIn);
			cmd.addParameter("@NEW_ROLL_DATE_IN", newRollDateIn);
			cmd.addParameter("@NEW_ACT_DATE_IN", newActDateIn);
			cmd.addParameter("@NEW_USER_IN", newUserIn);
				
			cmd.execute();


		}
		
		public static void pShrmrkscomponentgrade(NString termIn,NString crnIn,NNumber gcomIdIn,NString gchgCodeIn,NBool gradeChangedIn,NBool scoreChangedIn,Ref<NNumber> scoreIo,Ref<NNumber> percentageIo,Ref<NString> grdeCodeIo,Ref<NString> gradeScaleOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_SHRMRKSCOMPONENTGRADE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID_IN", gcomIdIn);
			cmd.addParameter("@GCHG_CODE_IN", gchgCodeIn);
			cmd.addParameter("@GRADE_CHANGED_IN", gradeChangedIn);
			cmd.addParameter("@SCORE_CHANGED_IN", scoreChangedIn);
			cmd.addParameter("@SCORE_IO", scoreIo, true);
			cmd.addParameter("@PERCENTAGE_IO", percentageIo, true);
			cmd.addParameter("@GRDE_CODE_IO", grdeCodeIo, true);
			cmd.addParameter("@GRADE_SCALE_OUT", NString.class);
				
			cmd.execute();
			scoreIo.val = cmd.getParameterValue("@SCORE_IO", NNumber.class);
			percentageIo.val = cmd.getParameterValue("@PERCENTAGE_IO", NNumber.class);
			grdeCodeIo.val = cmd.getParameterValue("@GRDE_CODE_IO", NString.class);
			gradeScaleOut.val = cmd.getParameterValue("@GRADE_SCALE_OUT", NString.class);


		}
		
		public static void pShrsmrkDeleteAudit(NString oldTermCodeIn,NString oldCrnIn,NNumber oldPidmIn,NNumber oldGcomIdIn,NNumber oldScomIdIn,NString oldGchgCodeIn,NDate oldDueDateIn,NDate oldMarkCalcDateIn,NNumber oldScoreIn,NNumber oldPercentageIn,NString oldGrdeCodeIn,NDate oldCompletedDateIn,NDate oldReturnedDateIn,NDate oldExtensionDateIn,NNumber oldMarkerIn,NString oldCommentsIn,NDate oldActDateIn,NString oldUserIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_SHRSMRK_DELETE_AUDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_TERM_CODE_IN", oldTermCodeIn);
			cmd.addParameter("@OLD_CRN_IN", oldCrnIn);
			cmd.addParameter("@OLD_PIDM_IN", oldPidmIn);
			cmd.addParameter("@OLD_GCOM_ID_IN", oldGcomIdIn);
			cmd.addParameter("@OLD_SCOM_ID_IN", oldScomIdIn);
			cmd.addParameter("@OLD_GCHG_CODE_IN", oldGchgCodeIn);
			cmd.addParameter("@OLD_DUE_DATE_IN", oldDueDateIn);
			cmd.addParameter("@OLD_MARK_CALC_DATE_IN", oldMarkCalcDateIn);
			cmd.addParameter("@OLD_SCORE_IN", oldScoreIn);
			cmd.addParameter("@OLD_PERCENTAGE_IN", oldPercentageIn);
			cmd.addParameter("@OLD_GRDE_CODE_IN", oldGrdeCodeIn);
			cmd.addParameter("@OLD_COMPLETED_DATE_IN", oldCompletedDateIn);
			cmd.addParameter("@OLD_RETURNED_DATE_IN", oldReturnedDateIn);
			cmd.addParameter("@OLD_EXTENSION_DATE_IN", oldExtensionDateIn);
			cmd.addParameter("@OLD_MARKER_IN", oldMarkerIn);
			cmd.addParameter("@OLD_COMMENTS_IN", oldCommentsIn);
			cmd.addParameter("@OLD_ACT_DATE_IN", oldActDateIn);
			cmd.addParameter("@OLD_USER_IN", oldUserIn);
				
			cmd.execute();


		}
		
		public static void pShrsmrkInsertAudit(NString newTermCodeIn,NString newCrnIn,NNumber newPidmIn,NNumber newGcomIdIn,NNumber newScomIdIn,NString newGchgCodeIn,NDate newDueDateIn,NDate newMarkCalcDateIn,NNumber newScoreIn,NNumber newPercentageIn,NString newGrdeCodeIn,NDate newCompletedDateIn,NDate newReturnedDateIn,NDate newExtensionDateIn,NNumber newMarkerIn,NString newCommentsIn,NDate newActDateIn,NString newUserIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_SHRSMRK_INSERT_AUDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_TERM_CODE_IN", newTermCodeIn);
			cmd.addParameter("@NEW_CRN_IN", newCrnIn);
			cmd.addParameter("@NEW_PIDM_IN", newPidmIn);
			cmd.addParameter("@NEW_GCOM_ID_IN", newGcomIdIn);
			cmd.addParameter("@NEW_SCOM_ID_IN", newScomIdIn);
			cmd.addParameter("@NEW_GCHG_CODE_IN", newGchgCodeIn);
			cmd.addParameter("@NEW_DUE_DATE_IN", newDueDateIn);
			cmd.addParameter("@NEW_MARK_CALC_DATE_IN", newMarkCalcDateIn);
			cmd.addParameter("@NEW_SCORE_IN", newScoreIn);
			cmd.addParameter("@NEW_PERCENTAGE_IN", newPercentageIn);
			cmd.addParameter("@NEW_GRDE_CODE_IN", newGrdeCodeIn);
			cmd.addParameter("@NEW_COMPLETED_DATE_IN", newCompletedDateIn);
			cmd.addParameter("@NEW_RETURNED_DATE_IN", newReturnedDateIn);
			cmd.addParameter("@NEW_EXTENSION_DATE_IN", newExtensionDateIn);
			cmd.addParameter("@NEW_MARKER_IN", newMarkerIn);
			cmd.addParameter("@NEW_COMMENTS_IN", newCommentsIn);
			cmd.addParameter("@NEW_ACT_DATE_IN", newActDateIn);
			cmd.addParameter("@NEW_USER_IN", newUserIn);
				
			cmd.execute();


		}
		
		public static void pShrsmrkUpdateAudit(NString oldTermCodeIn,NString oldCrnIn,NNumber oldPidmIn,NNumber oldGcomIdIn,NNumber oldScomIdIn,NString oldGchgCodeIn,NDate oldDueDateIn,NDate oldMarkCalcDateIn,NNumber oldScoreIn,NNumber oldPercentageIn,NString oldGrdeCodeIn,NDate oldCompletedDateIn,NDate oldReturnedDateIn,NDate oldExtensionDateIn,NNumber oldMarkerIn,NString oldCommentsIn,NDate oldActDateIn,NString oldUserIn,NString newTermCodeIn,NString newCrnIn,NNumber newPidmIn,NNumber newGcomIdIn,NNumber newScomIdIn,NString newGchgCodeIn,NDate newDueDateIn,NDate newMarkCalcDateIn,NNumber newScoreIn,NNumber newPercentageIn,NString newGrdeCodeIn,NDate newCompletedDateIn,NDate newReturnedDateIn,NDate newExtensionDateIn,NNumber newMarkerIn,NString newCommentsIn,NDate newActDateIn,NString newUserIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_SHRSMRK_UPDATE_AUDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_TERM_CODE_IN", oldTermCodeIn);
			cmd.addParameter("@OLD_CRN_IN", oldCrnIn);
			cmd.addParameter("@OLD_PIDM_IN", oldPidmIn);
			cmd.addParameter("@OLD_GCOM_ID_IN", oldGcomIdIn);
			cmd.addParameter("@OLD_SCOM_ID_IN", oldScomIdIn);
			cmd.addParameter("@OLD_GCHG_CODE_IN", oldGchgCodeIn);
			cmd.addParameter("@OLD_DUE_DATE_IN", oldDueDateIn);
			cmd.addParameter("@OLD_MARK_CALC_DATE_IN", oldMarkCalcDateIn);
			cmd.addParameter("@OLD_SCORE_IN", oldScoreIn);
			cmd.addParameter("@OLD_PERCENTAGE_IN", oldPercentageIn);
			cmd.addParameter("@OLD_GRDE_CODE_IN", oldGrdeCodeIn);
			cmd.addParameter("@OLD_COMPLETED_DATE_IN", oldCompletedDateIn);
			cmd.addParameter("@OLD_RETURNED_DATE_IN", oldReturnedDateIn);
			cmd.addParameter("@OLD_EXTENSION_DATE_IN", oldExtensionDateIn);
			cmd.addParameter("@OLD_MARKER_IN", oldMarkerIn);
			cmd.addParameter("@OLD_COMMENTS_IN", oldCommentsIn);
			cmd.addParameter("@OLD_ACT_DATE_IN", oldActDateIn);
			cmd.addParameter("@OLD_USER_IN", oldUserIn);
			cmd.addParameter("@NEW_TERM_CODE_IN", newTermCodeIn);
			cmd.addParameter("@NEW_CRN_IN", newCrnIn);
			cmd.addParameter("@NEW_PIDM_IN", newPidmIn);
			cmd.addParameter("@NEW_GCOM_ID_IN", newGcomIdIn);
			cmd.addParameter("@NEW_SCOM_ID_IN", newScomIdIn);
			cmd.addParameter("@NEW_GCHG_CODE_IN", newGchgCodeIn);
			cmd.addParameter("@NEW_DUE_DATE_IN", newDueDateIn);
			cmd.addParameter("@NEW_MARK_CALC_DATE_IN", newMarkCalcDateIn);
			cmd.addParameter("@NEW_SCORE_IN", newScoreIn);
			cmd.addParameter("@NEW_PERCENTAGE_IN", newPercentageIn);
			cmd.addParameter("@NEW_GRDE_CODE_IN", newGrdeCodeIn);
			cmd.addParameter("@NEW_COMPLETED_DATE_IN", newCompletedDateIn);
			cmd.addParameter("@NEW_RETURNED_DATE_IN", newReturnedDateIn);
			cmd.addParameter("@NEW_EXTENSION_DATE_IN", newExtensionDateIn);
			cmd.addParameter("@NEW_MARKER_IN", newMarkerIn);
			cmd.addParameter("@NEW_COMMENTS_IN", newCommentsIn);
			cmd.addParameter("@NEW_ACT_DATE_IN", newActDateIn);
			cmd.addParameter("@NEW_USER_IN", newUserIn);
				
			cmd.execute();


		}
		
		public static void pSubComponentLateresit(NString termCodeIn,NString crnIn,NNumber gcomIdIn,NNumber scomIdIn,NNumber pidmIn,NDate completedDateIn,NDate dueDateIn,NDate extensionDateIn,Ref<NString> gradeChangeIo,Ref<NNumber> scoreIo,Ref<NNumber> percentageIo,Ref<NBool> subCompMarkRecalculatedOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_SUB_COMPONENT_LATERESIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID_IN", gcomIdIn);
			cmd.addParameter("@SCOM_ID_IN", scomIdIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@COMPLETED_DATE_IN", completedDateIn);
			cmd.addParameter("@DUE_DATE_IN", dueDateIn);
			cmd.addParameter("@EXTENSION_DATE_IN", extensionDateIn);
			cmd.addParameter("@GRADE_CHANGE_IO", gradeChangeIo, true);
			cmd.addParameter("@SCORE_IO", scoreIo, true);
			cmd.addParameter("@PERCENTAGE_IO", percentageIo, true);
			cmd.addParameter("@SUB_COMP_MARK_RECALCULATED_OUT", NBool.class);
				
			cmd.execute();
			gradeChangeIo.val = cmd.getParameterValue("@GRADE_CHANGE_IO", NString.class);
			scoreIo.val = cmd.getParameterValue("@SCORE_IO", NNumber.class);
			percentageIo.val = cmd.getParameterValue("@PERCENTAGE_IO", NNumber.class);
			subCompMarkRecalculatedOut.val = cmd.getParameterValue("@SUB_COMP_MARK_RECALCULATED_OUT", NBool.class);


		}
		
		public static void pUpdateGradePercent(NString termCodeIn,NString crnIn,NNumber pidmIn,NNumber gcomId,NNumber percentageIn,NString gradeCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_UPDATE_GRADE_PERCENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@PERCENTAGE_IN", percentageIn);
			cmd.addParameter("@GRADE_CODE_IN", gradeCodeIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSfrstcrGrde(NString termCodeIn,NString crnIn,NNumber pidmIn,NString gradeCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_UPDATE_SFRSTCR_GRDE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GRADE_CODE_IN", gradeCodeIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSfrstcrGrdeMid(NString termCodeIn,NString crnIn,NNumber pidmIn,NString gradeCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_UPDATE_SFRSTCR_GRDE_MID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GRADE_CODE_IN", gradeCodeIn);
				
			cmd.execute();


		}
		
		public static void pUpdateShrcmrk(NString termCodeIn,NString crnIn,NNumber pidmIn,NString midFinIndIn,NString gradeIn,NNumber percentageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKEGRB.P_UPDATE_SHRCMRK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@MID_FIN_IND_IN", midFinIndIn);
			cmd.addParameter("@GRADE_IN", gradeIn);
			cmd.addParameter("@PERCENTAGE_IN", percentageIn);
				
			cmd.execute();


		}
		
	
	
	
}
