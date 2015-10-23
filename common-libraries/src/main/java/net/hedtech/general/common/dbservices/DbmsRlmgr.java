package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsRlmgr {
		public static void addElementaryAttribute(NString eventStruct,NString attrName,NString attrType,NString attrDefvl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.ADD_ELEMENTARY_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EVENT_STRUCT", eventStruct);
			cmd.addParameter("@ATTR_NAME", attrName);
			cmd.addParameter("@ATTR_TYPE", attrType);
			cmd.addParameter("@ATTR_DEFVL", attrDefvl);
				
			cmd.execute();


		}
		
//		public static void addElementaryAttribute(NString eventStruct,NString attrName, tabAlias) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.ADD_ELEMENTARY_ATTRIBUTE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EVENT_STRUCT", eventStruct);
//			cmd.addParameter("@ATTR_NAME", attrName);
//			cmd.addParameter("@TAB_ALIAS", tabAlias);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void addElementaryAttribute(NString eventStruct,NString attrName,NString attrType, textPref) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.ADD_ELEMENTARY_ATTRIBUTE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EVENT_STRUCT", eventStruct);
//			cmd.addParameter("@ATTR_NAME", attrName);
//			cmd.addParameter("@ATTR_TYPE", attrType);
//			cmd.addParameter("@TEXT_PREF", textPref);
//				
//			cmd.execute();
//
//
//		}
		
		public static void addEvent(NString ruleClass,NString eventInst,NString eventType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.ADD_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
			cmd.addParameter("@EVENT_INST", eventInst);
			cmd.addParameter("@EVENT_TYPE", eventType);
				
			cmd.execute();


		}
		
		public static void addEvent(NString ruleClass, Object eventInst) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.ADD_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
			cmd.addParameter("@EVENT_INST", eventInst);
				
			cmd.execute();


		}
		
		public static void addFunctions(NString eventStruct,NString funcsName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.ADD_FUNCTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EVENT_STRUCT", eventStruct);
			cmd.addParameter("@FUNCS_NAME", funcsName);
				
			cmd.execute();


		}
		
		public static void addRule(NString ruleClass,NString ruleId,NString ruleCond,NString actprfNml,NString actprfVall) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.ADD_RULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
			cmd.addParameter("@RULE_ID", ruleId);
			cmd.addParameter("@RULE_COND", ruleCond);
			cmd.addParameter("@ACTPRF_NML", actprfNml);
			cmd.addParameter("@ACTPRF_VALL", actprfVall);
				
			cmd.execute();


		}
		
		public static NString FconditionRef(NString rulecond,NString eventnm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.CONDITION_REF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@RULECOND", rulecond);
			cmd.addParameter("@EVENTNM", eventnm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FconsumeEvent(NString ruleClass,NString eventIdent) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.CONSUME_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@RULE_CLASS", ruleClass);
			cmd.addParameter("@EVENT_IDENT", eventIdent);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NNumber FconsumePrimEvents(NString ruleClass,List<RlmEventidsRow> eventIdents) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.CONSUME_PRIM_EVENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@RULE_CLASS", ruleClass);
//			// cmd.addParameter(DbTypes.getCollectionType("EVENT_IDENTS", "", eventIdents, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static void createConditionsTable(NString condTable,NString peventStruct,NString stgClause) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.CREATE_CONDITIONS_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COND_TABLE", condTable);
			cmd.addParameter("@PEVENT_STRUCT", peventStruct);
			cmd.addParameter("@STG_CLAUSE", stgClause);
				
			cmd.execute();


		}
		
//		public static void createConditionsTable(NString condTable, tabAlias,NString stgClause) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.CREATE_CONDITIONS_TABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COND_TABLE", condTable);
//			cmd.addParameter("@TAB_ALIAS", tabAlias);
//			cmd.addParameter("@STG_CLAUSE", stgClause);
//				
//			cmd.execute();
//
//
//		}
		
		public static void createEventStruct(NString eventStruct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.CREATE_EVENT_STRUCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EVENT_STRUCT", eventStruct);
				
			cmd.execute();


		}
		
		public static void createExpfilIndexes(NString ruleClass,NString collStats) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.CREATE_EXPFIL_INDEXES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
			cmd.addParameter("@COLL_STATS", collStats);
				
			cmd.execute();


		}
		
		public static void createInterface(NString ruleClass,NString interfaceNm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.CREATE_INTERFACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
			cmd.addParameter("@INTERFACE_NM", interfaceNm);
				
			cmd.execute();


		}
		
		public static void createRuleClass(NString ruleClass,NString eventStruct,NString actionCbk,NString actprfSpec,NString rsltViewnm,NString rlclsProp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.CREATE_RULE_CLASS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
			cmd.addParameter("@EVENT_STRUCT", eventStruct);
			cmd.addParameter("@ACTION_CBK", actionCbk);
			cmd.addParameter("@ACTPRF_SPEC", actprfSpec);
			cmd.addParameter("@RSLT_VIEWNM", rsltViewnm);
			cmd.addParameter("@RLCLS_PROP", rlclsProp);
				
			cmd.execute();


		}
		
		public static void deleteRule(NString ruleClass,NString ruleId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.DELETE_RULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
			cmd.addParameter("@RULE_ID", ruleId);
				
			cmd.execute();


		}
		
		public static void dropConditionsTable(NString condTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.DROP_CONDITIONS_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COND_TABLE", condTable);
				
			cmd.execute();


		}
		
		public static void dropEventStruct(NString eventStruct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.DROP_EVENT_STRUCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EVENT_STRUCT", eventStruct);
				
			cmd.execute();


		}
		
		public static void dropExpfilIndexes(NString ruleClass) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.DROP_EXPFIL_INDEXES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
				
			cmd.execute();


		}
		
		public static void dropInterface(NString interfaceNm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.DROP_INTERFACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INTERFACE_NM", interfaceNm);
				
			cmd.execute();


		}
		
		public static void dropRuleClass(NString ruleClass) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.DROP_RULE_CLASS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
				
			cmd.execute();


		}
		
		public static void extendEventStruct(NString eventStruct,NString attrName,NString attrType,NString attrDefvl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.EXTEND_EVENT_STRUCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EVENT_STRUCT", eventStruct);
			cmd.addParameter("@ATTR_NAME", attrName);
			cmd.addParameter("@ATTR_TYPE", attrType);
			cmd.addParameter("@ATTR_DEFVL", attrDefvl);
				
			cmd.execute();


		}
		
		public static NString FgetAggregateValue(NString ruleClass,NString eventIdent,NString aggrFunc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.GET_AGGREGATE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@RULE_CLASS", ruleClass);
			cmd.addParameter("@EVENT_IDENT", eventIdent);
			cmd.addParameter("@AGGR_FUNC", aggrFunc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void grantPrivilege(NString ruleClass,NString privType,NString toUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.GRANT_PRIVILEGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
			cmd.addParameter("@PRIV_TYPE", privType);
			cmd.addParameter("@TO_USER", toUser);
				
			cmd.execute();


		}
		
		public static void processRules(NString ruleClass,NString eventInst,NString eventType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.PROCESS_RULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
			cmd.addParameter("@EVENT_INST", eventInst);
			cmd.addParameter("@EVENT_TYPE", eventType);
				
			cmd.execute();


		}
		
		public static void processRules(NString ruleClass, Object eventInst) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.PROCESS_RULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
			cmd.addParameter("@EVENT_INST", eventInst);
				
			cmd.execute();


		}
		
		public static void purgeEvents(NString ruleClass) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.PURGE_EVENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
				
			cmd.execute();


		}
		
		public static void resetSession(NString ruleClass) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.RESET_SESSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
				
			cmd.execute();


		}
		
		public static void revokePrivilege(NString ruleClass,NString privType,NString fromUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.REVOKE_PRIVILEGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
			cmd.addParameter("@PRIV_TYPE", privType);
			cmd.addParameter("@FROM_USER", fromUser);
				
			cmd.execute();


		}
		
		public static void syncTextIndexes(NString ruleClass) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RLMGR.SYNC_TEXT_INDEXES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_CLASS", ruleClass);
				
			cmd.execute();


		}
		
	
	
	
}
