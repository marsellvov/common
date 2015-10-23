package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckgens {
		public static void pDispActiveRegs(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_DISP_ACTIVE_REGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pDispRegHist() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_DISP_REG_HIST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispTermDate(NString pCallingProc,NString pTerm,NString pFromDate,NString pToDate,NString pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_DISP_TERM_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLING_PROC", pCallingProc);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg);
				
			cmd.execute();


		}
		
		public static void pDispTermDateAdvanced(NString pCallingProc,NString pTerm,NString pFromDate,NString pToDate,NString pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_DISP_TERM_DATE_ADVANCED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLING_PROC", pCallingProc);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg);
				
			cmd.execute();


		}
		
		public static void pDispcrseschddetl(NString crn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_DISPCRSESCHDDETL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
//		public static void pListcourseonly(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> selSubj,List<OwaUtil.IdentArrRow> crn,List<OwaUtil.IdentArrRow> rsts,List<OwaUtil.IdentArrRow> assocTermIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_LISTCOURSEONLY", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_SUBJ", "", selSubj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN", "", crn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS", "", rsts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pListcourseonly2(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> rsts,List<OwaUtil.IdentArrRow> selSubj,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> crn,List<OwaUtil.IdentArrRow> startDateIn,List<OwaUtil.IdentArrRow> endDateIn,List<OwaUtil.IdentArrRow> subj,List<OwaUtil.IdentArrRow> crse,List<OwaUtil.IdentArrRow> sec,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<Bwckcoms.Varchar2TabtypeRow> title,List<OwaUtil.IdentArrRow> mesg,NNumber regsRow,NNumber addRow,NNumber waitRow,NString callValueIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_LISTCOURSEONLY2", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS", "", rsts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_SUBJ", "", selSubj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN", "", crn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_IN", "", startDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_IN", "", endDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBJ", "", subj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRSE", "", crse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEC", "", sec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TITLE", "", title, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MESG", "", mesg, object.class));
//			cmd.addParameter("@REGS_ROW", regsRow);
//			cmd.addParameter("@ADD_ROW", addRow);
//			cmd.addParameter("@WAIT_ROW", waitRow);
//			cmd.addParameter("@CALL_VALUE_IN", callValueIn);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pListcrse(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> selSubj,NString selCrse,NString selTitle,NString beginHh,NString beginMi,NString beginAp,List<OwaUtil.IdentArrRow> selDay,List<OwaUtil.IdentArrRow> selPtrm,NString endHh,NString endMi,NString endAp,List<OwaUtil.IdentArrRow> selCamp,List<OwaUtil.IdentArrRow> selSchd,List<OwaUtil.IdentArrRow> selSess,List<OwaUtil.IdentArrRow> selInstr,List<OwaUtil.IdentArrRow> selAttr,List<OwaUtil.IdentArrRow> crn,List<OwaUtil.IdentArrRow> rsts,NString selDuntCode,NString selDuntUnit,List<OwaUtil.IdentArrRow> selLevl,NString selFromCred,NString selToCred,List<OwaUtil.IdentArrRow> selInsm,NString callValueIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_LISTCRSE", DbManager.getDataBaseFactory());
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
//			// cmd.addParameter(DbTypes.getTableType("CRN", "", crn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS", "", rsts, object.class));
//			cmd.addParameter("@SEL_DUNT_CODE", selDuntCode);
//			cmd.addParameter("@SEL_DUNT_UNIT", selDuntUnit);
//			// cmd.addParameter(DbTypes.getTableType("SEL_LEVL", "", selLevl, object.class));
//			cmd.addParameter("@SEL_FROM_CRED", selFromCred);
//			cmd.addParameter("@SEL_TO_CRED", selToCred);
//			// cmd.addParameter(DbTypes.getTableType("SEL_INSM", "", selInsm, object.class));
//			cmd.addParameter("@CALL_VALUE_IN", callValueIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pProcTermDate(NString pCallingProc,NString pTerm,NString pByDate,NString pFromDate,NString pToDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_PROC_TERM_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLING_PROC", pCallingProc);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_BY_DATE", pByDate);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
				
			cmd.execute();


		}
		
//		public static void pRegscrsesearch(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> rsts,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> crn,List<OwaUtil.IdentArrRow> startDateIn,List<OwaUtil.IdentArrRow> endDateIn,List<OwaUtil.IdentArrRow> subj,List<OwaUtil.IdentArrRow> crse,List<OwaUtil.IdentArrRow> sec,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<Bwckcoms.Varchar2TabtypeRow> title,List<OwaUtil.IdentArrRow> mesg,NNumber regsRow,NNumber addRow,NNumber waitRow,NBool subjectErrorIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_REGSCRSESEARCH", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS", "", rsts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN", "", crn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_IN", "", startDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_IN", "", endDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBJ", "", subj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRSE", "", crse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEC", "", sec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TITLE", "", title, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MESG", "", mesg, object.class));
//			cmd.addParameter("@REGS_ROW", regsRow);
//			cmd.addParameter("@ADD_ROW", addRow);
//			cmd.addParameter("@WAIT_ROW", waitRow);
//			cmd.addParameter("@SUBJECT_ERROR_IN", subjectErrorIn);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pRegscrsesearchAdvanced(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> rsts,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> crn,List<OwaUtil.IdentArrRow> startDateIn,List<OwaUtil.IdentArrRow> endDateIn,List<OwaUtil.IdentArrRow> subj,List<OwaUtil.IdentArrRow> crse,List<OwaUtil.IdentArrRow> sec,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<Bwckcoms.Varchar2TabtypeRow> title,List<OwaUtil.IdentArrRow> mesg,NNumber regsRow,NNumber addRow,NNumber waitRow,NBool subjectErrorIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_REGSCRSESEARCH_ADVANCED", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS", "", rsts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN", "", crn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_IN", "", startDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_IN", "", endDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBJ", "", subj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRSE", "", crse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEC", "", sec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TITLE", "", title, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MESG", "", mesg, object.class));
//			cmd.addParameter("@REGS_ROW", regsRow);
//			cmd.addParameter("@ADD_ROW", addRow);
//			cmd.addParameter("@WAIT_ROW", waitRow);
//			cmd.addParameter("@SUBJECT_ERROR_IN", subjectErrorIn);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pRegsgetcrse(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> selSubj,NString selCrse,NString selTitle,NString beginHh,NString beginMi,NString beginAp,List<OwaUtil.IdentArrRow> selDay,List<OwaUtil.IdentArrRow> selPtrm,NString endHh,NString endMi,NString endAp,List<OwaUtil.IdentArrRow> selCamp,List<OwaUtil.IdentArrRow> selSchd,List<OwaUtil.IdentArrRow> selSess,List<OwaUtil.IdentArrRow> selInstr,List<OwaUtil.IdentArrRow> selAttr,List<OwaUtil.IdentArrRow> rsts,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> crn,List<OwaUtil.IdentArrRow> startDateIn,List<OwaUtil.IdentArrRow> endDateIn,List<OwaUtil.IdentArrRow> subj,List<OwaUtil.IdentArrRow> crse,List<OwaUtil.IdentArrRow> sec,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<Bwckcoms.Varchar2TabtypeRow> title,List<OwaUtil.IdentArrRow> mesg,NNumber regsRow,NNumber addRow,NNumber waitRow,NString selDuntCode,NString selDuntUnit,List<OwaUtil.IdentArrRow> selLevl,NString selFromCred,NString selToCred,List<OwaUtil.IdentArrRow> selInsm,List<OwaUtil.IdentArrRow> subBtn,List<OwaUtil.IdentArrRow> path,NString callValueIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_REGSGETCRSE", DbManager.getDataBaseFactory());
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
//			// cmd.addParameter(DbTypes.getTableType("RSTS", "", rsts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN", "", crn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_IN", "", startDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_IN", "", endDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBJ", "", subj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRSE", "", crse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEC", "", sec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TITLE", "", title, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MESG", "", mesg, object.class));
//			cmd.addParameter("@REGS_ROW", regsRow);
//			cmd.addParameter("@ADD_ROW", addRow);
//			cmd.addParameter("@WAIT_ROW", waitRow);
//			cmd.addParameter("@SEL_DUNT_CODE", selDuntCode);
//			cmd.addParameter("@SEL_DUNT_UNIT", selDuntUnit);
//			// cmd.addParameter(DbTypes.getTableType("SEL_LEVL", "", selLevl, object.class));
//			cmd.addParameter("@SEL_FROM_CRED", selFromCred);
//			cmd.addParameter("@SEL_TO_CRED", selToCred);
//			// cmd.addParameter(DbTypes.getTableType("SEL_INSM", "", selInsm, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUB_BTN", "", subBtn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PATH", "", path, object.class));
//			cmd.addParameter("@CALL_VALUE_IN", callValueIn);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pRegsgetcrseAdvanced(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> selSubj,NString selCrse,NString selTitle,NString beginHh,NString beginMi,NString beginAp,List<OwaUtil.IdentArrRow> selDay,List<OwaUtil.IdentArrRow> selPtrm,NString endHh,NString endMi,NString endAp,List<OwaUtil.IdentArrRow> selCamp,List<OwaUtil.IdentArrRow> selSchd,List<OwaUtil.IdentArrRow> selSess,List<OwaUtil.IdentArrRow> selInstr,List<OwaUtil.IdentArrRow> selAttr,List<OwaUtil.IdentArrRow> rsts,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> crn,List<OwaUtil.IdentArrRow> startDateIn,List<OwaUtil.IdentArrRow> endDateIn,List<OwaUtil.IdentArrRow> subj,List<OwaUtil.IdentArrRow> crse,List<OwaUtil.IdentArrRow> sec,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<Bwckcoms.Varchar2TabtypeRow> title,List<OwaUtil.IdentArrRow> mesg,NNumber regsRow,NNumber addRow,NNumber waitRow,NString selDuntCode,NString selDuntUnit,List<OwaUtil.IdentArrRow> selLevl,NString selFromCred,NString selToCred,List<OwaUtil.IdentArrRow> selInsm,List<OwaUtil.IdentArrRow> subBtn,List<OwaUtil.IdentArrRow> path) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_REGSGETCRSE_ADVANCED", DbManager.getDataBaseFactory());
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
//			// cmd.addParameter(DbTypes.getTableType("RSTS", "", rsts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN", "", crn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_IN", "", startDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_IN", "", endDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBJ", "", subj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRSE", "", crse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEC", "", sec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TITLE", "", title, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MESG", "", mesg, object.class));
//			cmd.addParameter("@REGS_ROW", regsRow);
//			cmd.addParameter("@ADD_ROW", addRow);
//			cmd.addParameter("@WAIT_ROW", waitRow);
//			cmd.addParameter("@SEL_DUNT_CODE", selDuntCode);
//			cmd.addParameter("@SEL_DUNT_UNIT", selDuntUnit);
//			// cmd.addParameter(DbTypes.getTableType("SEL_LEVL", "", selLevl, object.class));
//			cmd.addParameter("@SEL_FROM_CRED", selFromCred);
//			cmd.addParameter("@SEL_TO_CRED", selToCred);
//			// cmd.addParameter(DbTypes.getTableType("SEL_INSM", "", selInsm, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUB_BTN", "", subBtn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PATH", "", path, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pRegsupd(NString term,List<OwaUtil.IdentArrRow> crn,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> credOld,List<OwaUtil.IdentArrRow> gmodOld,List<OwaUtil.IdentArrRow> levlOld,List<OwaUtil.IdentArrRow> spath,List<OwaUtil.IdentArrRow> spathOld) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_REGSUPD", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TERM", term);
//			// cmd.addParameter(DbTypes.getTableType("CRN", "", crn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED_OLD", "", credOld, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD_OLD", "", gmodOld, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL_OLD", "", levlOld, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SPATH", "", spath, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SPATH_OLD", "", spathOld, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pReturnToDispTermDate(NString pCallingProc,NString pTerm,NString pFromDate,NString pToDate,NString pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_RETURN_TO_DISP_TERM_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLING_PROC", pCallingProc);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg);
				
			cmd.execute();


		}
		
//		public static void pSearch(List<OwaUtil.IdentArrRow> termIn,NString callValueIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_SEARCH", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			cmd.addParameter("@CALL_VALUE_IN", callValueIn);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pSearchAdvanced(List<OwaUtil.IdentArrRow> termIn,NString callValueIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_SEARCH_ADVANCED", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			cmd.addParameter("@CALL_VALUE_IN", callValueIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pSearchchk() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGENS.P_SEARCHCHK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
