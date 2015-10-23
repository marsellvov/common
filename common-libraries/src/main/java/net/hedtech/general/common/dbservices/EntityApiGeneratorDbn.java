package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class EntityApiGeneratorDbn {
		public static NString fErrormessageDoc(NString pPackageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.F_ERRORMESSAGE_DOC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormTrigger(NString pTableName,NString pOwnerName,NString pBlockName,NString pPackageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.F_FORM_TRIGGER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_OWNER_NAME", pOwnerName);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGenApi(NString pTabName,NString pOwnName,NString pProdName,NString pPackageName,NString pFileName,NString pVersionNumber,NString pDeveloperInitials) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.F_GEN_API", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TAB_NAME", pTabName);
			cmd.addParameter("@P_OWN_NAME", pOwnName);
			cmd.addParameter("@P_PROD_NAME", pProdName);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_FILE_NAME", pFileName);
			cmd.addParameter("@P_VERSION_NUMBER", pVersionNumber);
			cmd.addParameter("@P_DEVELOPER_INITIALS", pDeveloperInitials);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGenDml(NString pTabName,NString pOwnName,NString pProdName,NString pVersionNumber,NString pDeveloperInitials) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.F_GEN_DML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TAB_NAME", pTabName);
			cmd.addParameter("@P_OWN_NAME", pOwnName);
			cmd.addParameter("@P_PROD_NAME", pProdName);
			cmd.addParameter("@P_VERSION_NUMBER", pVersionNumber);
			cmd.addParameter("@P_DEVELOPER_INITIALS", pDeveloperInitials);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGenValidationPackage(NString pTabName,NString pOwnName,NString pProdName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.F_GEN_VALIDATION_PACKAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TAB_NAME", pTabName);
			cmd.addParameter("@P_OWN_NAME", pOwnName);
			cmd.addParameter("@P_PROD_NAME", pProdName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetConstraintTableName(NString pOwner,NString pConstraintName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.F_GET_CONSTRAINT_TABLE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_CONSTRAINT_NAME", pConstraintName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetParentTable(NString pOwnerName,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.F_GET_PARENT_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OWNER_NAME", pOwnerName);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fObsoleteErrors(NString pPackageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.F_OBSOLETE_ERRORS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUntestedErrors(NString pPackageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.F_UNTESTED_ERRORS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pErrormessageDoc(NString pPackageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.P_ERRORMESSAGE_DOC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
				
			cmd.execute();


		}
		
		public static void pFormTrigger(NString pTableName,NString pOwnerName,NString pBlockName,NString pPackageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.P_FORM_TRIGGER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_OWNER_NAME", pOwnerName);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
				
			cmd.execute();


		}
		
		public static void pGenApi(NString pTabName,NString pOwnName,NString pProdName,NString pPackageName,NString pFileName,NString pVersionNumber,NString pDeveloperInitials) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.P_GEN_API", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAB_NAME", pTabName);
			cmd.addParameter("@P_OWN_NAME", pOwnName);
			cmd.addParameter("@P_PROD_NAME", pProdName);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_FILE_NAME", pFileName);
			cmd.addParameter("@P_VERSION_NUMBER", pVersionNumber);
			cmd.addParameter("@P_DEVELOPER_INITIALS", pDeveloperInitials);
				
			cmd.execute();


		}
		
		public static void pGenDml(NString pTabName,NString pOwnName,NString pProdName,NString pVersionNumber,NString pDeveloperInitials) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.P_GEN_DML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAB_NAME", pTabName);
			cmd.addParameter("@P_OWN_NAME", pOwnName);
			cmd.addParameter("@P_PROD_NAME", pProdName);
			cmd.addParameter("@P_VERSION_NUMBER", pVersionNumber);
			cmd.addParameter("@P_DEVELOPER_INITIALS", pDeveloperInitials);
				
			cmd.execute();


		}
		
		public static void pGenValidationPackage(NString pTabName,NString pOwnName,NString pProdName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.P_GEN_VALIDATION_PACKAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAB_NAME", pTabName);
			cmd.addParameter("@P_OWN_NAME", pOwnName);
			cmd.addParameter("@P_PROD_NAME", pProdName);
				
			cmd.execute();


		}
		
		public static void pObsoleteErrors(NString pPackageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.P_OBSOLETE_ERRORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
				
			cmd.execute();


		}
		
		public static void pUntestedErrors(NString pPackageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ENTITY_API_GENERATOR_DBN.P_UNTESTED_ERRORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
				
			cmd.execute();


		}
		
	
	
	
}
