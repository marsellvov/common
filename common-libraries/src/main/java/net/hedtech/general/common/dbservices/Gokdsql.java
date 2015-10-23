package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokdsql {
		public static NString fConstraintExists(NString pOwner,NString pTableName,NString pConstraintName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.F_CONSTRAINT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_CONSTRAINT_NAME", pConstraintName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fIndexColumnCount(NString pTableOwner,NString pTableName,NString pIndexOwner,NString pIndexName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.F_INDEX_COLUMN_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_INDEX_OWNER", pIndexOwner);
			cmd.addParameter("@P_INDEX_NAME", pIndexName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fIndexExists(NString pTableOwner,NString pTableName,NString pIndexOwner,NString pIndexName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.F_INDEX_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_INDEX_OWNER", pIndexOwner);
			cmd.addParameter("@P_INDEX_NAME", pIndexName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSequenceExists(NString pOwner,NString pSequence) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.F_SEQUENCE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_SEQUENCE", pSequence);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTableExists(NString pOwner,NString pTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.F_TABLE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE", pTable);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAddAndDumpMessages(NString msgText1,NString msgText2,NString msgText3,NString msgText4,NString msgText5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_ADD_AND_DUMP_MESSAGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_TEXT1", msgText1);
			cmd.addParameter("@MSG_TEXT2", msgText2);
			cmd.addParameter("@MSG_TEXT3", msgText3);
			cmd.addParameter("@MSG_TEXT4", msgText4);
			cmd.addParameter("@MSG_TEXT5", msgText5);
				
			cmd.execute();


		}
		
		public static void pAddColumn(NString pTableOwner,NString pTableName,NString pColumnName,NString pDataType,NNumber pDataLength,NNumber pDataPrecision,NNumber pDataScale,NString pNullable,NString pSeedDataChar,NNumber pSeedDataNumber,NDate pSeedDataDate,NString pAuditOnly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_ADD_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_DATA_TYPE", pDataType);
			cmd.addParameter("@P_DATA_LENGTH", pDataLength);
			cmd.addParameter("@P_DATA_PRECISION", pDataPrecision);
			cmd.addParameter("@P_DATA_SCALE", pDataScale);
			cmd.addParameter("@P_NULLABLE", pNullable);
			cmd.addParameter("@P_SEED_DATA_CHAR", pSeedDataChar);
			cmd.addParameter("@P_SEED_DATA_NUMBER", pSeedDataNumber);
			cmd.addParameter("@P_SEED_DATA_DATE", pSeedDataDate);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
				
			cmd.execute();


		}
		
		public static void pAddStatusMessage(NString pMessageText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_ADD_STATUS_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MESSAGE_TEXT", pMessageText);
				
			cmd.execute();


		}
		
		public static void pColumnExists(NString pOwner,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_COLUMN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();


		}
		
		public static void pCreateFkConstraint(NString pSql,NString pOwner,NString pTableName,NString pConstraintName,NString pAuditOnly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_CREATE_FK_CONSTRAINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL", pSql);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_CONSTRAINT_NAME", pConstraintName);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
				
			cmd.execute();


		}
		
		public static void pCreateGtIndex(NString pSql,NString pTableOwner,NString pTableName,NString pIndexOwner,NString pIndexName,NString pIndexType,NString pAuditOnly,NString pDropIndex,NString pResetMessages) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_CREATE_GT_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL", pSql);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_INDEX_OWNER", pIndexOwner);
			cmd.addParameter("@P_INDEX_NAME", pIndexName);
			cmd.addParameter("@P_INDEX_TYPE", pIndexType);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
			cmd.addParameter("@P_DROP_INDEX", pDropIndex);
			cmd.addParameter("@P_RESET_MESSAGES", pResetMessages);
				
			cmd.execute();


		}
		
		public static void pCreateGtPkUkConstraint(NString pSql,NString pTableOwner,NString pTableName,NString pConstraintName,NString pConstraintType,NString pAuditOnly,NString pDropConstraint,NString pResetMessages,NString pCasadeConstraints) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_CREATE_GT_PK_UK_CONSTRAINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL", pSql);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_CONSTRAINT_NAME", pConstraintName);
			cmd.addParameter("@P_CONSTRAINT_TYPE", pConstraintType);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
			cmd.addParameter("@P_DROP_CONSTRAINT", pDropConstraint);
			cmd.addParameter("@P_RESET_MESSAGES", pResetMessages);
			cmd.addParameter("@P_CASADE_CONSTRAINTS", pCasadeConstraints);
				
			cmd.execute();


		}
		
		public static void pCreateGtTable(NString pSql,NString pTableOwner,NString pTableName,NString pAuditOnly,NString pDropTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_CREATE_GT_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL", pSql);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
			cmd.addParameter("@P_DROP_TABLE", pDropTable);
				
			cmd.execute();


		}
		
		public static void pCreateIndex(NString pSql,NString pTableOwner,NString pTableName,NString pIndexOwner,NString pIndexName,NString pSizeLikeIndexOwner,NString pSizeLikeIndex,NString pIndexType,NString pAuditOnly,NString pDropIndex,NString pStorageClause,NString pResetMessages) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_CREATE_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL", pSql);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_INDEX_OWNER", pIndexOwner);
			cmd.addParameter("@P_INDEX_NAME", pIndexName);
			cmd.addParameter("@P_SIZE_LIKE_INDEX_OWNER", pSizeLikeIndexOwner);
			cmd.addParameter("@P_SIZE_LIKE_INDEX", pSizeLikeIndex);
			cmd.addParameter("@P_INDEX_TYPE", pIndexType);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
			cmd.addParameter("@P_DROP_INDEX", pDropIndex);
			cmd.addParameter("@P_STORAGE_CLAUSE", pStorageClause);
			cmd.addParameter("@P_RESET_MESSAGES", pResetMessages);
				
			cmd.execute();


		}
		
		public static void pCreatePkUkConstraint(NString pSql,NString pTableOwner,NString pTableName,NString pConstraintName,NString pConstraintType,NString pSizeLikeIndexOwner,NString pSizeLikeIndex,NString pAuditOnly,NString pDropConstraint,NString pResetMessages,NString pCasadeConstraints) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_CREATE_PK_UK_CONSTRAINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL", pSql);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_CONSTRAINT_NAME", pConstraintName);
			cmd.addParameter("@P_CONSTRAINT_TYPE", pConstraintType);
			cmd.addParameter("@P_SIZE_LIKE_INDEX_OWNER", pSizeLikeIndexOwner);
			cmd.addParameter("@P_SIZE_LIKE_INDEX", pSizeLikeIndex);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
			cmd.addParameter("@P_DROP_CONSTRAINT", pDropConstraint);
			cmd.addParameter("@P_RESET_MESSAGES", pResetMessages);
			cmd.addParameter("@P_CASADE_CONSTRAINTS", pCasadeConstraints);
				
			cmd.execute();


		}
		
		public static void pCreateSequence(NString pSql,NString pSequenceOwner,NString pSequenceName,NString pAuditOnly,NString pDropSequence) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_CREATE_SEQUENCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL", pSql);
			cmd.addParameter("@P_SEQUENCE_OWNER", pSequenceOwner);
			cmd.addParameter("@P_SEQUENCE_NAME", pSequenceName);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
			cmd.addParameter("@P_DROP_SEQUENCE", pDropSequence);
				
			cmd.execute();


		}
		
		public static void pCreateTable(NString pSql,NString pTableOwner,NString pTableName,NString pSizeLikeTableOwner,NString pSizeLikeTable,NString pAuditOnly,NString pDropTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_CREATE_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL", pSql);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_SIZE_LIKE_TABLE_OWNER", pSizeLikeTableOwner);
			cmd.addParameter("@P_SIZE_LIKE_TABLE", pSizeLikeTable);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
			cmd.addParameter("@P_DROP_TABLE", pDropTable);
				
			cmd.execute();


		}
		
		public static void pDropColumn(NString pTableOwner,NString pTableName,NString pColumnName,NString pAuditOnly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_DROP_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
				
			cmd.execute();


		}
		
		public static void pDumpAndResetMessages() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_DUMP_AND_RESET_MESSAGES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDumpStatusMessages() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_DUMP_STATUS_MESSAGES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pModifyColumn(NString pTableOwner,NString pTableName,NString pColumnName,NString pDataType,NNumber pDataLength,NNumber pDataPrecision,NNumber pDataScale,NString pNullable,NString pSeedDataChar,NNumber pSeedDataNumber,NDate pSeedDataDate,NString pAuditOnly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_MODIFY_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_DATA_TYPE", pDataType);
			cmd.addParameter("@P_DATA_LENGTH", pDataLength);
			cmd.addParameter("@P_DATA_PRECISION", pDataPrecision);
			cmd.addParameter("@P_DATA_SCALE", pDataScale);
			cmd.addParameter("@P_NULLABLE", pNullable);
			cmd.addParameter("@P_SEED_DATA_CHAR", pSeedDataChar);
			cmd.addParameter("@P_SEED_DATA_NUMBER", pSeedDataNumber);
			cmd.addParameter("@P_SEED_DATA_DATE", pSeedDataDate);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
				
			cmd.execute();


		}
		
		public static void pResetStatusMessages() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_RESET_STATUS_MESSAGES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pRunSql(NString pSql,NString pAuditOnly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSQL.P_RUN_SQL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL", pSql);
			cmd.addParameter("@P_AUDIT_ONLY", pAuditOnly);
				
			cmd.execute();


		}
		
	
	
	
}
