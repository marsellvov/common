package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CtxEntity {
		public static void addExtractRule(NString policyName,NNumber ruleId,NString extractionRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_ENTITY.ADD_EXTRACT_RULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POLICY_NAME", policyName);
			cmd.addParameter("@RULE_ID", ruleId);
			cmd.addParameter("@EXTRACTION_RULE", extractionRule);
				
			cmd.execute();


		}
		
		public static void addStopEntity(NString policyName,NString entityName,NString entityType,NString comments) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_ENTITY.ADD_STOP_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POLICY_NAME", policyName);
			cmd.addParameter("@ENTITY_NAME", entityName);
			cmd.addParameter("@ENTITY_TYPE", entityType);
			cmd.addParameter("@COMMENTS", comments);
				
			cmd.execute();


		}
		
		public static void compile(NString policyName,NNumber compileChoice,NNumber locking) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_ENTITY.COMPILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POLICY_NAME", policyName);
			cmd.addParameter("@COMPILE_CHOICE", compileChoice);
			cmd.addParameter("@LOCKING", locking);
				
			cmd.execute();


		}
		
		public static void createExtractPolicy(NString policyName,NString lexer,NBool includeSuppliedRules,NBool includeSuppliedDictionary) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_ENTITY.CREATE_EXTRACT_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POLICY_NAME", policyName);
			cmd.addParameter("@LEXER", lexer);
			cmd.addParameter("@INCLUDE_SUPPLIED_RULES", includeSuppliedRules);
			cmd.addParameter("@INCLUDE_SUPPLIED_DICTIONARY", includeSuppliedDictionary);
				
			cmd.execute();


		}
		
		public static void dropExtractPolicy(NString policyName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_ENTITY.DROP_EXTRACT_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POLICY_NAME", policyName);
				
			cmd.execute();


		}
		
		public static void extract(NString policyName,NString document,NString language,Ref<NString> result,NString entityTypeList,NNumber locking) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_ENTITY.EXTRACT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POLICY_NAME", policyName);
			cmd.addParameter("@DOCUMENT", document);
			cmd.addParameter("@LANGUAGE", language);
			cmd.addParameter("@RESULT", result, true);
			cmd.addParameter("@ENTITY_TYPE_LIST", entityTypeList);
			cmd.addParameter("@LOCKING", locking);
				
			cmd.execute();
			result.val = cmd.getParameterValue("@RESULT", NString.class);


		}
		
		public static void removeExtractRule(NString policyName,NNumber ruleId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_ENTITY.REMOVE_EXTRACT_RULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POLICY_NAME", policyName);
			cmd.addParameter("@RULE_ID", ruleId);
				
			cmd.execute();


		}
		
		public static void removeStopEntity(NString policyName,NString entityName,NString entityType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_ENTITY.REMOVE_STOP_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POLICY_NAME", policyName);
			cmd.addParameter("@ENTITY_NAME", entityName);
			cmd.addParameter("@ENTITY_TYPE", entityType);
				
			cmd.execute();


		}
		
	
	
	
}
