package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowHelp {
		public static void createHelpIndex(NString pLang) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HELP.CREATE_HELP_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LANG", pLang);
				
			cmd.execute();


		}
		
		public static void dropHelpIndexes() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HELP.DROP_HELP_INDEXES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString FgetRuntimeDocPath(NString pFilename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HELP.GET_RUNTIME_DOC_PATH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FILENAME", pFilename);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FhitResult(NString pLang,NString pTextkey,NString pTextQuery,NString pPlaintext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HELP.HIT_RESULT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_TEXTKEY", pTextkey);
			cmd.addParameter("@P_TEXT_QUERY", pTextQuery);
			cmd.addParameter("@P_PLAINTEXT", pPlaintext);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FparseSearchString(NString pSearchStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HELP.PARSE_SEARCH_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SEARCH_STR", pSearchStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void showGetStartNav() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HELP.SHOW_GET_START_NAV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void showGetStarted() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HELP.SHOW_GET_STARTED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void showHelp(NString pSession,NString pLang,NString pFlowId,NString pStepId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HELP.SHOW_HELP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSION", pSession);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_STEP_ID", pStepId);
				
			cmd.execute();


		}
		
		public static void showHelpContent(NString pSession,NString pLang,NString pFlowId,NString pStepId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HELP.SHOW_HELP_CONTENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSION", pSession);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_STEP_ID", pStepId);
				
			cmd.execute();


		}
		
		public static void showNavigation(NString pSession,NString pLang,NString pFlowId,NString pStepId,NString pBookId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_HELP.SHOW_NAVIGATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSION", pSession);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_STEP_ID", pStepId);
			cmd.addParameter("@P_BOOK_ID", pBookId);
				
			cmd.execute();


		}
		
	
	
	
}
