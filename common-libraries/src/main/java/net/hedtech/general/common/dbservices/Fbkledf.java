package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fbkledf {
		public static NString fExistOtag(NString pOtagCode,NString pCurrenContext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKLEDF.F_EXIST_OTAG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OTAG_CODE", pOtagCode);
			cmd.addParameter("@P_CURREN_CONTEXT", pCurrenContext);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetBaseLedger() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKLEDF.F_GET_BASE_LEDGER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCtxOnFmb(NString pCurrOpenForms,NString pGlobalLedger) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKLEDF.F_GET_CTX_ON_FMB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CURR_OPEN_FORMS", pCurrOpenForms);
			cmd.addParameter("@P_GLOBAL_LEDGER", pGlobalLedger);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetIfrsContext() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKLEDF.F_GET_IFRS_CONTEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetLedger(NString pCurrenContext,NString pTable,NString pDocument) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKLEDF.F_GET_LEDGER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CURREN_CONTEXT", pCurrenContext);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_DOCUMENT", pDocument);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fGetLedgerFunctionality() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKLEDF.F_GET_LEDGER_FUNCTIONALITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pClearIfrsContext() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKLEDF.P_CLEAR_IFRS_CONTEXT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pCreateWhereClause(NString pTableName,java.sql.RowId pRowid,NString pManipulation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKLEDF.P_CREATE_WHERE_CLAUSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_MANIPULATION", pManipulation);
				
			cmd.execute();


		}
		
		public static void pSetFmbIfrsContext(NString pContext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKLEDF.P_SET_FMB_IFRS_CONTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CONTEXT", pContext);
				
			cmd.execute();


		}
		
		public static void pSetIfrsContext() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKLEDF.P_SET_IFRS_CONTEXT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateFfbmastTag(NString pOtagCode,NString pCurrenContext,NString pInUse) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKLEDF.P_UPDATE_FFBMAST_TAG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OTAG_CODE", pOtagCode);
			cmd.addParameter("@P_CURREN_CONTEXT", pCurrenContext);
			cmd.addParameter("@P_IN_USE", pInUse);
				
			cmd.execute();


		}
		
	
	
	
}
