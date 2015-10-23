package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkffcs {
		public static void pDispDynCtlg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFFCS.P_DISP_DYN_CTLG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispDynSched() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFFCS.P_DISP_DYN_SCHED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pDispDynSchedList(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> selSubj,NString selCrse,NString selTitle,NString beginHh,NString beginMi,NString beginAp,List<OwaUtil.IdentArrRow> selDay,List<OwaUtil.IdentArrRow> selPtrm,NString endHh,NString endMi,NString endAp,List<OwaUtil.IdentArrRow> selCamp,List<OwaUtil.IdentArrRow> selSchd,List<OwaUtil.IdentArrRow> selSess,List<OwaUtil.IdentArrRow> selInstr,List<OwaUtil.IdentArrRow> selAttr,NString selDuntCode,NString selDuntUnit,List<OwaUtil.IdentArrRow> selLevl,NString selFromCred,NString selToCred,List<OwaUtil.IdentArrRow> selInsm,NString crnIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFFCS.P_DISP_DYN_SCHED_LIST", DbManager.getDataBaseFactory());
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
//		
//		public static void pDispDynSchedSearch(List<OwaUtil.IdentArrRow> pTerm,NBool pSubjectError) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFFCS.P_DISP_DYN_SCHED_SEARCH", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_TERM", "", pTerm, object.class));
//			cmd.addParameter("@P_SUBJECT_ERROR", pSubjectError);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDispTermDate(NString pCallingProc,NString pTerm,NString pFromDate,NString pToDate,NString pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFFCS.P_DISP_TERM_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLING_PROC", pCallingProc);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg);
				
			cmd.execute();


		}
		
		public static void pFacSelCrseSearch() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFFCS.P_FAC_SEL_CRSE_SEARCH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pFaccrsesearch(List<OwaUtil.IdentArrRow> termIn,NBool subjectErrorIn,NString xyz,NString stupin) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFFCS.P_FACCRSESEARCH", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			cmd.addParameter("@SUBJECT_ERROR_IN", subjectErrorIn);
//			cmd.addParameter("@XYZ", xyz);
//			cmd.addParameter("@STUPIN", stupin);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pFacgetcrse(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> selSubj,NString selCrse,NString selTitle,NString beginHh,NString beginMi,NString beginAp,List<OwaUtil.IdentArrRow> selDay,List<OwaUtil.IdentArrRow> selPtrm,NString endHh,NString endMi,NString endAp,List<OwaUtil.IdentArrRow> selCamp,List<OwaUtil.IdentArrRow> selSchd,List<OwaUtil.IdentArrRow> selSess,List<OwaUtil.IdentArrRow> selInstr,List<OwaUtil.IdentArrRow> selAttr,NString selDuntCode,NString selDuntUnit,List<OwaUtil.IdentArrRow> selLevl,NString selFromCred,NString selToCred,List<OwaUtil.IdentArrRow> selInsm) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFFCS.P_FACGETCRSE", DbManager.getDataBaseFactory());
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
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
