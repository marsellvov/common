package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokmaud {
		public static NString fMeclValue(NString pMeclCode,NString pSearchUpdateCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKMAUD.F_MECL_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MECL_CODE", pMeclCode);
			cmd.addParameter("@P_SEARCH_UPDATE_CDE", pSearchUpdateCde);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNextJob(NString pFormName,NString pAddUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKMAUD.F_NEXT_JOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pInsertGurmail(NNumber pPidm,NString pTermCode,NNumber pKeySeqno,NString pModuleCde,NString pLetrCode,NNumber pWaitDays,NString pInitCode,NDate pPrintDate,NDate pInitialDate,Ref<NString> pErrorMsg,Ref<NString> pInsertOk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKMAUD.P_INSERT_GURMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_MODULE_CDE", pModuleCde);
			cmd.addParameter("@P_LETR_CODE", pLetrCode);
			cmd.addParameter("@P_WAIT_DAYS", pWaitDays);
			cmd.addParameter("@P_INIT_CODE", pInitCode);
			cmd.addParameter("@P_PRINT_DATE", pPrintDate);
			cmd.addParameter("@P_INITIAL_DATE", pInitialDate);
			cmd.addParameter("@P_ERROR_MSG", NString.class);
			cmd.addParameter("@P_INSERT_OK", NString.class);
				
			cmd.execute();
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);
			pInsertOk.val = cmd.getParameterValue("@P_INSERT_OK", NString.class);


		}
		
		public static void pInsertMecl(NString pFormName,NString pAddUserId,NDate pAddDate,NString pMeclCode,NString pMeclValue,NString pSearchUpdateCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKMAUD.P_INSERT_MECL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_MECL_CODE", pMeclCode);
			cmd.addParameter("@P_MECL_VALUE", pMeclValue);
			cmd.addParameter("@P_SEARCH_UPDATE_CDE", pSearchUpdateCde);
				
			cmd.execute();


		}
		
		public static void pInsertSobmaud(NString pFormName,NString pAddUserId,NDate pAddDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKMAUD.P_INSERT_SOBMAUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
				
			cmd.execute();


		}
		
		public static void pPopulateSearch(NString pFormName,NString pAddUserId,NDate pAddDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKMAUD.P_POPULATE_SEARCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
				
			cmd.execute();


		}
		
		public static void pProcessMassEntry(NString pFormName,NString pAddUserId,NDate pAddDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKMAUD.P_PROCESS_MASS_ENTRY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
				
			cmd.execute();


		}
		
		public static void pRemoveColumnTable() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKMAUD.P_REMOVE_COLUMN_TABLE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
