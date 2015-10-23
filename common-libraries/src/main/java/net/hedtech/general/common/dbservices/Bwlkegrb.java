package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkegrb {
		public static NString fAccessInd(NString termIn,NString crnIn,NNumber gcomIn,NNumber pidmIn,NString updateIn,NString calledFrom) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.F_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_IN", gcomIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@UPDATE_IN", updateIn);
			cmd.addParameter("@CALLED_FROM", calledFrom);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFacAccessInd(NNumber pidmIn,NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.F_FAC_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fNewfmtdate(NString str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.F_NEWFMTDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@STR", str);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fPrimaryInd(NString termIn,NString crnIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.F_PRIMARY_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRollAccessInd(NNumber pidmIn,NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.F_ROLL_ACCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pFacdispshrcmrk(NString term,NString crn,NString rectypeInd,NString callingProcName,NString callingProcName2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.P_FACDISPSHRCMRK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@RECTYPE_IND", rectypeInd);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
				
			cmd.execute();


		}
		
		public static void pFacdispshrmrks(NString term,NString crn,NNumber gcomId,NString callingProcName,NString callingProcName2,NNumber targetRec,NNumber classSize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.P_FACDISPSHRMRKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
			cmd.addParameter("@TARGET_REC", targetRec);
			cmd.addParameter("@CLASS_SIZE", classSize);
				
			cmd.execute();


		}
		
		public static void pFacdispshrsmrk(NString term,NString crn,NNumber scomId,NNumber gcomId,NString callingProcName,NString callingProcName2,NNumber targetRec,NNumber classSize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.P_FACDISPSHRSMRK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@SCOM_ID", scomId);
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
			cmd.addParameter("@TARGET_REC", targetRec);
			cmd.addParameter("@CLASS_SIZE", classSize);
				
			cmd.execute();


		}
		
		public static void pFacgradecomponents(NString term,NString crn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.P_FACGRADECOMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
				
			cmd.execute();


		}
		
		public static void pFacgradesubcomponents(NString term,NString crn,NNumber gcomId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.P_FACGRADESUBCOMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@GCOM_ID", gcomId);
				
			cmd.execute();


		}
		
		public static void pFaciddispshrmrks(NString term,NString crn,NString callingProcName,NString callingProcName2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.P_FACIDDISPSHRMRKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
				
			cmd.execute();


		}
		
		public static void pFacidshrmrksproc(NString term,NString crn,NString studId,NString callingProcName,NString callingProcName2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.P_FACIDSHRMRKSPROC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@STUD_ID", studId);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
				
			cmd.execute();


		}
		
		public static void pFacidshrsmrkproc(NString term,NString crn,NNumber gcomId,NString studId,NString callingProcName,NString callingProcName2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.P_FACIDSHRSMRKPROC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@STUD_ID", studId);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
				
			cmd.execute();


		}
		
//		public static void pFacscorepost(List<Varchar2TabtypeRow> marksTab,List<Varchar2TabtypeRow> rowidTab,List<Varchar2TabtypeRow> pidmTab,List<Varchar2TabtypeRow> inclindTab,NNumber studentCount,NString returnProc,NString menuName,List<Varchar2TabtypeRow> califTab,List<Varchar2TabtypeRow> subdateTab,List<Varchar2TabtypeRow> extdateTab,List<Varchar2TabtypeRow> markernameTab,List<Varchar2TabtypeRow> grdchgcdeTab,NNumber targetRec,NNumber classSize) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.P_FACSCOREPOST", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("MARKS_TAB", "", marksTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ROWID_TAB", "", rowidTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PIDM_TAB", "", pidmTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("INCLIND_TAB", "", inclindTab, object.class));
//			cmd.addParameter("@STUDENT_COUNT", studentCount);
//			cmd.addParameter("@RETURN_PROC", returnProc);
//			cmd.addParameter("@MENU_NAME", menuName);
//			// cmd.addParameter(DbTypes.getTableType("CALIF_TAB", "", califTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBDATE_TAB", "", subdateTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EXTDATE_TAB", "", extdateTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MARKERNAME_TAB", "", markernameTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GRDCHGCDE_TAB", "", grdchgcdeTab, object.class));
//			cmd.addParameter("@TARGET_REC", targetRec);
//			cmd.addParameter("@CLASS_SIZE", classSize);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pFacscorepost2(List<Varchar2TabtypeRow> mrks1Tab,List<Varchar2TabtypeRow> rowidTab,List<Varchar2TabtypeRow> pidmTab,List<Varchar2TabtypeRow> gradecdeTab,List<Varchar2TabtypeRow> subdateTab,List<Varchar2TabtypeRow> extdateTab,List<Varchar2TabtypeRow> markernameTab,List<Varchar2TabtypeRow> grdchgcdeTab,NNumber studentCounts,NString returnProc1,NNumber targetRec,NNumber classSize) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.P_FACSCOREPOST2", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("MRKS1_TAB", "", mrks1Tab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ROWID_TAB", "", rowidTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PIDM_TAB", "", pidmTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GRADECDE_TAB", "", gradecdeTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBDATE_TAB", "", subdateTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EXTDATE_TAB", "", extdateTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MARKERNAME_TAB", "", markernameTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GRDCHGCDE_TAB", "", grdchgcdeTab, object.class));
//			cmd.addParameter("@STUDENT_COUNTS", studentCounts);
//			cmd.addParameter("@RETURN_PROC1", returnProc1);
//			cmd.addParameter("@TARGET_REC", targetRec);
//			cmd.addParameter("@CLASS_SIZE", classSize);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pPrintlinks(NNumber pageSizeIn,NNumber classSizeIn,NString crnIn,NString termIn,NNumber targetIn,NString linkIn,NNumber idIn,NNumber scomIdIn,NString callName1In,NString callName2In,NString msgLabelIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKEGRB.P_PRINTLINKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAGE_SIZE_IN", pageSizeIn);
			cmd.addParameter("@CLASS_SIZE_IN", classSizeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@TARGET_IN", targetIn);
			cmd.addParameter("@LINK_IN", linkIn);
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@SCOM_ID_IN", scomIdIn);
			cmd.addParameter("@CALL_NAME1_IN", callName1In);
			cmd.addParameter("@CALL_NAME2_IN", callName2In);
			cmd.addParameter("@MSG_LABEL_IN", msgLabelIn);
				
			cmd.execute();


		}
		
	
	
	
}
