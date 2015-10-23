package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pokfltr {
		public static void pDeleteAllNbtempf(NNumber pPidm,NString pSpexCode,NString pScenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKFLTR.P_DELETE_ALL_NBTEMPF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SPEX_CODE", pSpexCode);
			cmd.addParameter("@P_SCENARIO", pScenario);
				
			cmd.execute();


		}
		
		public static void pDeleteAllNbtfprm(NNumber pPidm,NString pSpexCode,NString pScenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKFLTR.P_DELETE_ALL_NBTFPRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SPEX_CODE", pSpexCode);
			cmd.addParameter("@P_SCENARIO", pScenario);
				
			cmd.execute();


		}
		
		public static void pDeleteAllNbtorsf(NNumber pPidm,NString pSpexCode,NString pScenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKFLTR.P_DELETE_ALL_NBTORSF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SPEX_CODE", pSpexCode);
			cmd.addParameter("@P_SCENARIO", pScenario);
				
			cmd.execute();


		}
		
		public static void pInsertFilteredDataBenefit(NNumber pLoginPidm,NString pUserId,NString pSearchType,NString pLastName,NString pFirstName,NString pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKFLTR.P_INSERT_FILTERED_DATA_BENEFIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SEARCH_TYPE", pSearchType);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();


		}
		
		public static void pInsertNbtempf(NNumber pPidm,NString pSpexCode,NString pScenario,NNumber pSeqNo,NNumber pEmpPidm,NString pOrgnCode,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKFLTR.P_INSERT_NBTEMPF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SPEX_CODE", pSpexCode);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
		public static void pInsertNbtfprm(NNumber pPidm,NString pSpexCode,NString pScenario,NString pLabel,NString pValue,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKFLTR.P_INSERT_NBTFPRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SPEX_CODE", pSpexCode);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_LABEL", pLabel);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
//		public static void pInsertNbtfprmMultiple(NNumber pPidm,NString pSpexCode,NString pScenario,NString pLabel,List<Varchar2TabtypeRow> pTable,NString pUserId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKFLTR.P_INSERT_NBTFPRM_MULTIPLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_SPEX_CODE", pSpexCode);
//			cmd.addParameter("@P_SCENARIO", pScenario);
//			cmd.addParameter("@P_LABEL", pLabel);
//			// cmd.addParameter(DbTypes.getTableType("P_TABLE", "", pTable, object.class));
//			cmd.addParameter("@P_USER_ID", pUserId);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pInsertNbtorsf(NNumber pPidm,NString pSpexCode,NString pScenario,NString pOrgnCode,NString pCoasCode,NString pUserId,NString pOrgnSecurityType,NString pModuleType,NString pAccessType,NNumber pEmpPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKFLTR.P_INSERT_NBTORSF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SPEX_CODE", pSpexCode);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ORGN_SECURITY_TYPE", pOrgnSecurityType);
			cmd.addParameter("@P_MODULE_TYPE", pModuleType);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();


		}
		
	
	
	
}
