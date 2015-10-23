package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwrkolib {
		public static NString fCheckpellcrossover(NString pCurrentAidy,NNumber pPidm,NString pAidyCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKOLIB.F_CHECKPELLCROSSOVER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CURRENT_AIDY", pCurrentAidy);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fProcessuserdeftxt(NNumber pidm,NString aidy,NString tab,NString fundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKOLIB.F_PROCESSUSERDEFTXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@AIDY", aidy);
			cmd.addParameter("@TAB", tab);
			cmd.addParameter("@FUND_CODE", fundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fValidaidy(NString aidy) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKOLIB.F_VALIDAIDY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDY", aidy);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDisableTab(NString pUrlText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKOLIB.P_DISABLE_TAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_URL_TEXT", pUrlText);
				
			cmd.execute();


		}
		
		public static void pFormhidden(NString cname,NString cvalue,NString cattributes,NString bypassEsc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKOLIB.P_FORMHIDDEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@BYPASS_ESC", bypassEsc);
				
			cmd.execute();


		}
		
		public static void pGetuserdeftxt(NNumber pidm,NString aidy,NString tab,NString fundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKOLIB.P_GETUSERDEFTXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@AIDY", aidy);
			cmd.addParameter("@TAB", tab);
			cmd.addParameter("@FUND_CODE", fundCode);
				
			cmd.execute();


		}
		
		public static void pPrintjavascript(NString text) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKOLIB.P_PRINTJAVASCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEXT", text);
				
			cmd.execute();


		}
		
		public static void pProcessuserdeftxt(NNumber pidm,NString aidy,NString tab,NString fundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKOLIB.P_PROCESSUSERDEFTXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@AIDY", aidy);
			cmd.addParameter("@TAB", tab);
			cmd.addParameter("@FUND_CODE", fundCode);
				
			cmd.execute();


		}
		
		public static void pSeldefaidy(NString aidy,NString callingProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKOLIB.P_SELDEFAIDY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY", aidy);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
				
			cmd.execute();


		}
		
		public static void pStoreaidy(NString aidyIn,NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKOLIB.P_STOREAIDY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();


		}
		
	
	
	
}
