package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokisql {
//		public static NString fCheckRole(NString pProcessCd,NString pRuleCd,NString pPidm,List<ParamTabtypeRow> pParamTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKISQL.F_CHECK_ROLE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@P_PROCESS_CD", pProcessCd);
//			cmd.addParameter("@P_RULE_CD", pRuleCd);
//			cmd.addParameter("@P_PIDM", pPidm);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PARAM_TAB", "", pParamTab, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString fExtractSelectValue(NString sqlString,NString searchValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKISQL.F_EXTRACT_SELECT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SQL_STRING", sqlString);
			cmd.addParameter("@SEARCH_VALUE", searchValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static DataCursor fGetAllRoles(NString pProcessCd,List<RuleTabtypeRow> pRuleCd,List<ParamTabtypeRow> pParamTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKISQL.F_GET_ALL_ROLES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DataCursor.class);
//			cmd.addParameter("@P_PROCESS_CD", pProcessCd);
//			// cmd.addParameter(DbTypes.getCollectionType("P_RULE_CD", "", pRuleCd, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_PARAM_TAB", "", pParamTab, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(DataCursor.class);
//
//		}
		
//		public static List<RuleTabtypeRow> fGetRoles(NString pProcessCd,NString pPidm,List<ParamTabtypeRow> pParamTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKISQL.F_GET_ROLES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<RuleTabtypeRow>.class);
//			cmd.addParameter("@P_PROCESS_CD", pProcessCd);
//			cmd.addParameter("@P_PIDM", pPidm);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PARAM_TAB", "", pParamTab, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<RuleTabtypeRow>.class);
//
//		}
		
	
	
	@DbRecordType(id="GotisqlTypeRow", dataSourceName="GOTISQL_TYPE")
	public static class GotisqlTypeRow
	{
		@DbRecordField(dataSourceName="GOTISQL_APPL_CODE")
		public NString GotisqlApplCode;
		@DbRecordField(dataSourceName="GOTISQL_RULE_CODE")
		public NString GotisqlRuleCode;
		@DbRecordField(dataSourceName="GOTISQL_PIDM")
		public NNumber GotisqlPidm;
		@DbRecordField(dataSourceName="GOTISQL_TEXT")
		public NString GotisqlText;
	}

	
	@DbRecordType(id="ParamRecRow", dataSourceName="PARAM_REC")
	public static class ParamRecRow
	{
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_VALUE")
		public NString RValue;
	}

	
	
}
