package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckschd {
		public static NString fBuildumbrellastmt(NNumber numbCond,NNumber credCond,NString connector1,NNumber coursesCond) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.F_BUILDUMBRELLASTMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NUMB_COND", numbCond);
			cmd.addParameter("@CRED_COND", credCond);
			cmd.addParameter("@CONNECTOR1", connector1);
			cmd.addParameter("@COURSES_COND", coursesCond);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDecodedsetsubset(NString setCode,NString subset,NString prevSet,NString prevSubset,NBool firstReq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.F_DECODEDSETSUBSET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SET_CODE", setCode);
			cmd.addParameter("@SUBSET", subset);
			cmd.addParameter("@PREV_SET", prevSet);
			cmd.addParameter("@PREV_SUBSET", prevSubset);
			cmd.addParameter("@FIRST_REQ", firstReq);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fSyllabusExists(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.F_SYLLABUS_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pChkopenparen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_CHKOPENPAREN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pCrseSearchUnsec(List<OwaUtil.IdentArrRow> termIn,NBool subjectErrorIn,NString callProcIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_CRSE_SEARCH_UNSEC", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			cmd.addParameter("@SUBJECT_ERROR_IN", subjectErrorIn);
//			cmd.addParameter("@CALL_PROC_IN", callProcIn);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pDispCourseUnsec(NString lastTermIn,NBool firstIn,NString termIn,NString ptrmIn,List<OwaUtil.IdentArrRow> crnTblIn,NString crnIn,NString subjCodeIn,NString crseNumbIn,NString seqNumbIn,NDate regstartFdateIn,NDate regstartTdateIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_DISP_COURSE_UNSEC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@LAST_TERM_IN", lastTermIn);
//			cmd.addParameter("@FIRST_IN", firstIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@PTRM_IN", ptrmIn);
//			// cmd.addParameter(DbTypes.getTableType("CRN_TBL_IN", "", crnTblIn, object.class));
//			cmd.addParameter("@CRN_IN", crnIn);
//			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
//			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
//			cmd.addParameter("@SEQ_NUMB_IN", seqNumbIn);
//			cmd.addParameter("@REGSTART_FDATE_IN", regstartFdateIn);
//			cmd.addParameter("@REGSTART_TDATE_IN", regstartTdateIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDispDetailSched(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_DISP_DETAIL_SCHED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pDispDynSched() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_DISP_DYN_SCHED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispFeeAmount(NString termIn,NString crnIn,NNumber billHrsIn,NString billHrIndIn,NNumber billHrHighIn,NNumber billHrLowIn,NString credHrIndIn,NNumber credHrLowIn,NNumber credHrHighIn,NNumber credHrsIn,NNumber unitsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_DISP_FEE_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@BILL_HRS_IN", billHrsIn);
			cmd.addParameter("@BILL_HR_IND_IN", billHrIndIn);
			cmd.addParameter("@BILL_HR_HIGH_IN", billHrHighIn);
			cmd.addParameter("@BILL_HR_LOW_IN", billHrLowIn);
			cmd.addParameter("@CRED_HR_IND_IN", credHrIndIn);
			cmd.addParameter("@CRED_HR_LOW_IN", credHrLowIn);
			cmd.addParameter("@CRED_HR_HIGH_IN", credHrHighIn);
			cmd.addParameter("@CRED_HRS_IN", credHrsIn);
			cmd.addParameter("@UNITS_IN", unitsIn);
				
			cmd.execute();


		}
		
		public static void pDispListcrse(NString termIn,NString subjIn,NString crseIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_DISP_LISTCRSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SUBJ_IN", subjIn);
			cmd.addParameter("@CRSE_IN", crseIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pDispSyllabus(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_DISP_SYLLABUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pDispTermDate(NString pCallingProc,NString pTerm,NString pFromDate,NString pToDate,NString pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_DISP_TERM_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLING_PROC", pCallingProc);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg);
				
			cmd.execute();


		}
		
		public static void pDisplayareas(NString termIn,NString crnIn,NString subjCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_DISPLAYAREAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
				
			cmd.execute();


		}
		
		public static void pDisplaycorequisites(NString termIn,NString crnIn,Ref<NBool> coreqsFoundOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_DISPLAYCOREQUISITES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@COREQS_FOUND_OUT", NBool.class);
				
			cmd.execute();
			coreqsFoundOut.val = cmd.getParameterValue("@COREQS_FOUND_OUT", NBool.class);


		}
		
		public static void pDisplaydgw(NString termIn,NString subjIn,NString crseIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_DISPLAYDGW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SUBJ_IN", subjIn);
			cmd.addParameter("@CRSE_IN", crseIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pDisplayrestrictions(NString termIn,NString crnIn,NString subjIn,NString crseIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_DISPLAYRESTRICTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@SUBJ_IN", subjIn);
			cmd.addParameter("@CRSE_IN", crseIn);
				
			cmd.execute();


		}
		
		public static void pDisplayrtst(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_DISPLAYRTST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
//		public static void pGetCrseUnsec(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> selSubj,NString selCrse,NString selTitle,NString beginHh,NString beginMi,NString beginAp,List<OwaUtil.IdentArrRow> selDay,List<OwaUtil.IdentArrRow> selPtrm,NString endHh,NString endMi,NString endAp,List<OwaUtil.IdentArrRow> selCamp,List<OwaUtil.IdentArrRow> selSchd,List<OwaUtil.IdentArrRow> selSess,List<OwaUtil.IdentArrRow> selInstr,List<OwaUtil.IdentArrRow> selAttr,NString selDuntCode,NString selDuntUnit,List<OwaUtil.IdentArrRow> selLevl,NString selFromCred,NString selToCred,List<OwaUtil.IdentArrRow> selInsm,NString crnIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_GET_CRSE_UNSEC", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_SUBJ", "", selSubj, object.class));
//			cmd.addParameter("@SEL_CRSE", selCrse);
//			cmd.addParameter("@SEL_TITLE", selTitle);
//			cmd.addParameter("@BEGIN_HH", beginHh);
//			cmd.addParameter("@BEGIN_MI", beginMi);
//			cmd.addParameter("@BEGIN_AP", beginAp);
//			// cmd.addParameter(DbTypes.getTableType("SEL_DAY", "", selDay, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_PTRM", "", selPtrm, object.class));
//			cmd.addParameter("@END_HH", endHh);
//			cmd.addParameter("@END_MI", endMi);
//			cmd.addParameter("@END_AP", endAp);
//			// cmd.addParameter(DbTypes.getTableType("SEL_CAMP", "", selCamp, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_SCHD", "", selSchd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_SESS", "", selSess, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_INSTR", "", selInstr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_ATTR", "", selAttr, object.class));
//			cmd.addParameter("@SEL_DUNT_CODE", selDuntCode);
//			cmd.addParameter("@SEL_DUNT_UNIT", selDuntUnit);
//			// cmd.addParameter(DbTypes.getTableType("SEL_LEVL", "", selLevl, object.class));
//			cmd.addParameter("@SEL_FROM_CRED", selFromCred);
//			cmd.addParameter("@SEL_TO_CRED", selToCred);
//			// cmd.addParameter(DbTypes.getTableType("SEL_INSM", "", selInsm, object.class));
//			cmd.addParameter("@CRN_IN", crnIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pGetarearequirements(NString areaIn,NString termIn,NString subjCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_GETAREAREQUIREMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetarearulerequirements(NString areaIn,NString ruleIn,NString termIn,NString subjCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_GETAREARULEREQUIREMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@RULE_IN", ruleIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetarearwrreq(NString ruleIn,NString areaIn,NString termIn,NString subjCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_GETAREARWRREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_IN", ruleIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetattachedgroups(NString hAreaIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_GETATTACHEDGROUPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@H_AREA_IN", hAreaIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pGetattachedrulereq(NString ruleIn,NString areaIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_GETATTACHEDRULEREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_IN", ruleIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pGetattachedrwrreq(NString ruleIn,NString areaIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_GETATTACHEDRWRREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_IN", ruleIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pGetgrouprequirements(NString termIn,NString hGroupIn,NString subjCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_GETGROUPREQUIREMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@H_GROUP_IN", hGroupIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
				
			cmd.execute();


		}
		
		public static void pGrouprulereqmts(NString groupCodeIn,NString ruleIn,NString termIn,NString subjCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSCHD.P_GROUPRULEREQMTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_CODE_IN", groupCodeIn);
			cmd.addParameter("@RULE_IN", ruleIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
				
			cmd.execute();


		}
		
	
	
	
}
