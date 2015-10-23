package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckctlg {
		public static NString fBuildumbrellastmt(NNumber numbCond,NNumber credCond,NString connector1,NNumber coursesCond) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.F_BUILDUMBRELLASTMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NUMB_COND", numbCond);
			cmd.addParameter("@CRED_COND", credCond);
			cmd.addParameter("@CONNECTOR1", connector1);
			cmd.addParameter("@COURSES_COND", coursesCond);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fCatalogSyllabusExists(NString catTermIn,NString subjCodeIn,NString crseNumbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.F_CATALOG_SYLLABUS_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fDecodedsetsubset(NString setCode,NString subset,NString prevSet,NString prevSubset,NBool firstReq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.F_DECODEDSETSUBSET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SET_CODE", setCode);
			cmd.addParameter("@SUBSET", subset);
			cmd.addParameter("@PREV_SET", prevSet);
			cmd.addParameter("@PREV_SUBSET", prevSubset);
			cmd.addParameter("@FIRST_REQ", firstReq);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCatSearch(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_CAT_SEARCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pChkopenparen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_CHKOPENPAREN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispCatTermDate(NString catTermIn,NString callProcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISP_CAT_TERM_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@CALL_PROC_IN", callProcIn);
				
			cmd.execute();


		}
		
		public static void pDispCatalogSyllabus(NString catTermIn,NString subjCodeIn,NString crseNumbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISP_CATALOG_SYLLABUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
				
			cmd.execute();


		}
		
		public static void pDispCourseDetail(NString catTermIn,NString subjCodeIn,NString crseNumbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISP_COURSE_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
				
			cmd.execute();


		}
		
		public static void pDispDynCtlg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISP_DYN_CTLG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispListcrse(NString termIn,NString subjIn,NString crseIn,NString schdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISP_LISTCRSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SUBJ_IN", subjIn);
			cmd.addParameter("@CRSE_IN", crseIn);
			cmd.addParameter("@SCHD_IN", schdIn);
				
			cmd.execute();


		}
		
		public static void pDisplayCatCriteria(NString termIn,NBool subjectErrorIn,NString callProcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISPLAY_CAT_CRITERIA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SUBJECT_ERROR_IN", subjectErrorIn);
			cmd.addParameter("@CALL_PROC_IN", callProcIn);
				
			cmd.execute();


		}
		
//		public static void pDisplayCourses(NString termIn,NString oneSubj,List<OwaUtil.IdentArrRow> selSubj,NString selCrseStrt,NString selCrseEnd,NString selTitle,List<OwaUtil.IdentArrRow> selLevl,List<OwaUtil.IdentArrRow> selSchd,List<OwaUtil.IdentArrRow> selColl,List<OwaUtil.IdentArrRow> selDivs,List<OwaUtil.IdentArrRow> selDept,NString selFromCred,NString selToCred,List<OwaUtil.IdentArrRow> selAttr) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISPLAY_COURSES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@ONE_SUBJ", oneSubj);
//			// cmd.addParameter(DbTypes.getTableType("SEL_SUBJ", "", selSubj, object.class));
//			cmd.addParameter("@SEL_CRSE_STRT", selCrseStrt);
//			cmd.addParameter("@SEL_CRSE_END", selCrseEnd);
//			cmd.addParameter("@SEL_TITLE", selTitle);
//			// cmd.addParameter(DbTypes.getTableType("SEL_LEVL", "", selLevl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_SCHD", "", selSchd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_COLL", "", selColl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_DIVS", "", selDivs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_DEPT", "", selDept, object.class));
//			cmd.addParameter("@SEL_FROM_CRED", selFromCred);
//			cmd.addParameter("@SEL_TO_CRED", selToCred);
//			// cmd.addParameter(DbTypes.getTableType("SEL_ATTR", "", selAttr, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDisplayInfo(NString catTermIn,NString subjCodeIn,NString crseNumbIn,NString creditHrHighIn,NString creditHrLowIn,NString creditHrIndIn,NString lectureHrHighIn,NString lectureHrLowIn,NString lecHrIndIn,NString labHrHighIn,NString labHrLowIn,NString labHrIndIn,NString otherHrHighIn,NString otherHrLowIn,NString othHrIndIn,NString collCodeIn,NString divsCodeIn,NString deptCodeIn,NString ceuIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISPLAY_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
			cmd.addParameter("@CREDIT_HR_HIGH_IN", creditHrHighIn);
			cmd.addParameter("@CREDIT_HR_LOW_IN", creditHrLowIn);
			cmd.addParameter("@CREDIT_HR_IND_IN", creditHrIndIn);
			cmd.addParameter("@LECTURE_HR_HIGH_IN", lectureHrHighIn);
			cmd.addParameter("@LECTURE_HR_LOW_IN", lectureHrLowIn);
			cmd.addParameter("@LEC_HR_IND_IN", lecHrIndIn);
			cmd.addParameter("@LAB_HR_HIGH_IN", labHrHighIn);
			cmd.addParameter("@LAB_HR_LOW_IN", labHrLowIn);
			cmd.addParameter("@LAB_HR_IND_IN", labHrIndIn);
			cmd.addParameter("@OTHER_HR_HIGH_IN", otherHrHighIn);
			cmd.addParameter("@OTHER_HR_LOW_IN", otherHrLowIn);
			cmd.addParameter("@OTH_HR_IND_IN", othHrIndIn);
			cmd.addParameter("@COLL_CODE_IN", collCodeIn);
			cmd.addParameter("@DIVS_CODE_IN", divsCodeIn);
			cmd.addParameter("@DEPT_CODE_IN", deptCodeIn);
			cmd.addParameter("@CEU_IND_IN", ceuIndIn);
				
			cmd.execute();


		}
		
		public static void pDisplayareas(NString catTermIn,NString subjCodeIn,NString crseNumbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISPLAYAREAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
				
			cmd.execute();


		}
		
		public static void pDisplaycorequisites(NString catTermIn,NString subjCodeIn,NString crseNumbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISPLAYCOREQUISITES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
				
			cmd.execute();


		}
		
		public static void pDisplaydgw(NString catTermIn,NString subjCodeIn,NString crseNumbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISPLAYDGW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
				
			cmd.execute();


		}
		
		public static void pDisplaymutualexclusions(NString catTermIn,NString subjCodeIn,NString crseNumbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISPLAYMUTUALEXCLUSIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
				
			cmd.execute();


		}
		
		public static void pDisplayrestrictions(NString catTermIn,NString subjCodeIn,NString crseNumbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISPLAYRESTRICTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
				
			cmd.execute();


		}
		
		public static void pDisplayrtst(NString catTermIn,NString subjCodeIn,NString crseNumbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_DISPLAYRTST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
				
			cmd.execute();


		}
		
		public static void pGetarearequirements(NString areaIn,NString catTermIn,NString subjCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_GETAREAREQUIREMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetarearulerequirements(NString areaIn,NString ruleIn,NString catTermIn,NString subjCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_GETAREARULEREQUIREMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@RULE_IN", ruleIn);
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetarearwrreq(NString ruleIn,NString areaIn,NString catTermIn,NString subjCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_GETAREARWRREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_IN", ruleIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetattachedgroups(NString hAreaIn,NString catTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_GETATTACHEDGROUPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@H_AREA_IN", hAreaIn);
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
				
			cmd.execute();


		}
		
		public static void pGetattachedrulereq(NString ruleIn,NString areaIn,NString catTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_GETATTACHEDRULEREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_IN", ruleIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
				
			cmd.execute();


		}
		
		public static void pGetattachedrwrreq(NString ruleIn,NString areaIn,NString catTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_GETATTACHEDRWRREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_IN", ruleIn);
			cmd.addParameter("@AREA_IN", areaIn);
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
				
			cmd.execute();


		}
		
		public static void pGetgrouprequirements(NString catTermIn,NString hGroupIn,NString subjCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_GETGROUPREQUIREMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@H_GROUP_IN", hGroupIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
				
			cmd.execute();


		}
		
		public static void pGrouprulereqmts(NString groupCodeIn,NString ruleIn,NString catTermIn,NString subjCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.P_GROUPRULEREQMTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_CODE_IN", groupCodeIn);
			cmd.addParameter("@RULE_IN", ruleIn);
			cmd.addParameter("@CAT_TERM_IN", catTermIn);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
				
			cmd.execute();


		}
		
		public static void xml(NString termIn,NString subjIn,NString titleIn,NString divsIn,NString deptIn,NString collIn,NString schdIn,NString levlIn,NString attrIn,NString crseStrtIn,NString crseEndIn,NString credFromIn,NString credToIn,NString lastUpdated) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCTLG.XML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SUBJ_IN", subjIn);
			cmd.addParameter("@TITLE_IN", titleIn);
			cmd.addParameter("@DIVS_IN", divsIn);
			cmd.addParameter("@DEPT_IN", deptIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@SCHD_IN", schdIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@ATTR_IN", attrIn);
			cmd.addParameter("@CRSE_STRT_IN", crseStrtIn);
			cmd.addParameter("@CRSE_END_IN", crseEndIn);
			cmd.addParameter("@CRED_FROM_IN", credFromIn);
			cmd.addParameter("@CRED_TO_IN", credToIn);
			cmd.addParameter("@LAST_UPDATED", lastUpdated);
				
			cmd.execute();


		}
		
	
	
	
}
