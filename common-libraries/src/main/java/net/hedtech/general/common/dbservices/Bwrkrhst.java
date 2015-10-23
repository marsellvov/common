package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwrkrhst {
		public static NString fAllowwebupdate(NNumber pidm,NString aidy,NString fund) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKRHST.F_ALLOWWEBUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@AIDY", aidy);
			cmd.addParameter("@FUND", fund);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAcceptawardoffertab() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKRHST.P_ACCEPTAWARDOFFERTAB", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispawdaidyear(NString aidyIn,NString callingProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKRHST.P_DISPAWDAIDYEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
				
			cmd.execute();


		}
		
		public static void pDispawdhst() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKRHST.P_DISPAWDHST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispawdmsg(NString aidyIn,NString callingProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKRHST.P_DISPAWDMSG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
				
			cmd.execute();


		}
		
		public static void pDisplaytabs(NString tabType,NString aidyIn,NString callingProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKRHST.P_DISPLAYTABS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TAB_TYPE", tabType);
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
				
			cmd.execute();


		}
		
		public static void pDisplaytabs(NString aidyIn,NString callingProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKRHST.P_DISPLAYTABS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
				
			cmd.execute();


		}
		
		public static void pPopupMessage(NString aidy,NString fund) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKRHST.P_POPUP_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY", aidy);
			cmd.addParameter("@FUND", fund);
				
			cmd.execute();


		}
		
		public static void pPrintawardoverview(NString termsCondPrint) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKRHST.P_PRINTAWARDOVERVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERMS_COND_PRINT", termsCondPrint);
				
			cmd.execute();


		}
		
//		public static void pProcessacceptoffer(NString aidy,List<OwaUtil.IdentArrRow> fund,List<OwaUtil.IdentArrRow> accept,List<OwaUtil.IdentArrRow> partial,List<OwaUtil.IdentArrRow> lender,List<OwaUtil.IdentArrRow> loanType,NString acceptAllButton,NString submitButton,NString comment,NString submitInfo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKRHST.P_PROCESSACCEPTOFFER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@AIDY", aidy);
//			// cmd.addParameter(DbTypes.getTableType("FUND", "", fund, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ACCEPT", "", accept, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PARTIAL", "", partial, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LENDER", "", lender, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LOAN_TYPE", "", loanType, object.class));
//			cmd.addParameter("@ACCEPT_ALL_BUTTON", acceptAllButton);
//			cmd.addParameter("@SUBMIT_BUTTON", submitButton);
//			cmd.addParameter("@COMMENT", comment);
//			cmd.addParameter("@SUBMIT_INFO", submitInfo);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pProcessresources(NString aidy,List<OwaUtil.IdentArrRow> questionCode,List<OwaUtil.VcArrRow> answers,List<OwaUtil.VcArrRow> resDescs,List<OwaUtil.IdentArrRow> resTerm,List<OwaUtil.IdentArrRow> resAmt,List<OwaUtil.VcArrRow> resComment,NString submitButton) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKRHST.P_PROCESSRESOURCES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@AIDY", aidy);
//			// cmd.addParameter(DbTypes.getTableType("QUESTION_CODE", "", questionCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ANSWERS", "", answers, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RES_DESCS", "", resDescs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RES_TERM", "", resTerm, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RES_AMT", "", resAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RES_COMMENT", "", resComment, object.class));
//			cmd.addParameter("@SUBMIT_BUTTON", submitButton);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pProcesstermcondition(NString aidy,NString acceptButton,NString declineButton) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKRHST.P_PROCESSTERMCONDITION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY", aidy);
			cmd.addParameter("@ACCEPT_BUTTON", acceptButton);
			cmd.addParameter("@DECLINE_BUTTON", declineButton);
				
			cmd.execute();


		}
		
	
	
	
}
