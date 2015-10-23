package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwrkbudg {
//		public static List<BudgetsummaryrectabRow> fGetBudget(NString pAidyCode,NNumber pPidm) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKBUDG.F_GET_BUDGET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<BudgetsummaryrectabRow>.class);
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<BudgetsummaryrectabRow>.class);
//
//		}
		
		public static NString fGetBudgetEfcInd(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKBUDG.F_GET_BUDGET_EFC_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetBudgetTotal(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKBUDG.F_GET_BUDGET_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pDispbudg(NString aidyIn,NString callingProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKBUDG.P_DISPBUDG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
				
			cmd.execute();


		}
		
		public static void pDisplayBudget(NString pAidyCode,NNumber pPidm,NString pCaption,NString pHeader,NString pWidth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKBUDG.P_DISPLAY_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CAPTION", pCaption);
			cmd.addParameter("@P_HEADER", pHeader);
			cmd.addParameter("@P_WIDTH", pWidth);
				
			cmd.execute();


		}
		
		public static void pDisplayBudgetStatus(NString pAidyCode,NNumber pPidm,NString pInfoText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKBUDG.P_DISPLAY_BUDGET_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFO_TEXT", pInfoText);
				
			cmd.execute();


		}
		
	
	
	
}
