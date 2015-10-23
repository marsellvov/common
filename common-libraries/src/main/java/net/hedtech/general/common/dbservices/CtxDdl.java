package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CtxDdl {
		public static void addAttrSection(NString groupName,NString sectionName,NString tag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_ATTR_SECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
			cmd.addParameter("@SECTION_NAME", sectionName);
			cmd.addParameter("@TAG", tag);
				
			cmd.execute();


		}
		
		public static void addFieldSection(NString groupName,NString sectionName,NString tag,NBool visible) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_FIELD_SECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
			cmd.addParameter("@SECTION_NAME", sectionName);
			cmd.addParameter("@TAG", tag);
			cmd.addParameter("@VISIBLE", visible);
				
			cmd.execute();


		}
		
		public static void addIndex(NString setName,NString columnList,NString storageClause) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SET_NAME", setName);
			cmd.addParameter("@COLUMN_LIST", columnList);
			cmd.addParameter("@STORAGE_CLAUSE", storageClause);
				
			cmd.execute();


		}
		
//		public static void addMdata(NString idxName,NString sectionName,NString mdataValue, mdataRowid,NString partName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_MDATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@IDX_NAME", idxName);
//			cmd.addParameter("@SECTION_NAME", sectionName);
//			cmd.addParameter("@MDATA_VALUE", mdataValue);
//			cmd.addParameter("@MDATA_ROWID", mdataRowid);
//			cmd.addParameter("@PART_NAME", partName);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void addMdata(NString idxName,NString sectionName,List<Odcivarchar2listRow> mdataValues,List<OdciridlistRow> mdataRowids,NString partName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_MDATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@IDX_NAME", idxName);
//			cmd.addParameter("@SECTION_NAME", sectionName);
//			// cmd.addParameter(DbTypes.getCollectionType("MDATA_VALUES", "", mdataValues, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("MDATA_ROWIDS", "", mdataRowids, object.class));
//			cmd.addParameter("@PART_NAME", partName);
//				
//			cmd.execute();
//
//
//		}
		
		public static void addMdataColumn(NString groupName,NString sectionName,NString columnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_MDATA_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
			cmd.addParameter("@SECTION_NAME", sectionName);
			cmd.addParameter("@COLUMN_NAME", columnName);
				
			cmd.execute();


		}
		
		public static void addMdataSection(NString groupName,NString sectionName,NString tag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_MDATA_SECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
			cmd.addParameter("@SECTION_NAME", sectionName);
			cmd.addParameter("@TAG", tag);
				
			cmd.execute();


		}
		
		public static void addNdataSection(NString groupName,NString sectionName,NString tag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_NDATA_SECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
			cmd.addParameter("@SECTION_NAME", sectionName);
			cmd.addParameter("@TAG", tag);
				
			cmd.execute();


		}
		
		public static void addSdataColumn(NString groupName,NString sectionName,NString columnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_SDATA_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
			cmd.addParameter("@SECTION_NAME", sectionName);
			cmd.addParameter("@COLUMN_NAME", columnName);
				
			cmd.execute();


		}
		
		public static void addSdataSection(NString groupName,NString sectionName,NString tag,NString datatype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_SDATA_SECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
			cmd.addParameter("@SECTION_NAME", sectionName);
			cmd.addParameter("@TAG", tag);
			cmd.addParameter("@DATATYPE", datatype);
				
			cmd.execute();


		}
		
		public static void addSpecialSection(NString groupName,NString sectionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_SPECIAL_SECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
			cmd.addParameter("@SECTION_NAME", sectionName);
				
			cmd.execute();


		}
		
		public static void addStopSection(NString groupName,NString tag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_STOP_SECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
			cmd.addParameter("@TAG", tag);
				
			cmd.execute();


		}
		
		public static void addStopclass(NString stoplistName,NString stopclass) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_STOPCLASS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STOPLIST_NAME", stoplistName);
			cmd.addParameter("@STOPCLASS", stopclass);
				
			cmd.execute();


		}
		
		public static void addStoptheme(NString stoplistName,NString stoptheme) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_STOPTHEME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STOPLIST_NAME", stoplistName);
			cmd.addParameter("@STOPTHEME", stoptheme);
				
			cmd.execute();


		}
		
		public static void addStopword(NString stoplistName,NString stopword,NString language) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_STOPWORD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STOPLIST_NAME", stoplistName);
			cmd.addParameter("@STOPWORD", stopword);
			cmd.addParameter("@LANGUAGE", language);
				
			cmd.execute();


		}
		
		public static void addSubLexer(NString lexerName,NString language,NString subLexer,NString altValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_SUB_LEXER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LEXER_NAME", lexerName);
			cmd.addParameter("@LANGUAGE", language);
			cmd.addParameter("@SUB_LEXER", subLexer);
			cmd.addParameter("@ALT_VALUE", altValue);
				
			cmd.execute();


		}
		
		public static void addZoneSection(NString groupName,NString sectionName,NString tag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.ADD_ZONE_SECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
			cmd.addParameter("@SECTION_NAME", sectionName);
			cmd.addParameter("@TAG", tag);
				
			cmd.execute();


		}
		
		public static void copyPolicy(NString sourcePolicy,NString policyName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.COPY_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SOURCE_POLICY", sourcePolicy);
			cmd.addParameter("@POLICY_NAME", policyName);
				
			cmd.execute();


		}
		
		public static void createIndexSet(NString setName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.CREATE_INDEX_SET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SET_NAME", setName);
				
			cmd.execute();


		}
		
		public static void createPolicy(NString policyName,NString filter,NString sectionGroup,NString lexer,NString stoplist,NString wordlist) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.CREATE_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POLICY_NAME", policyName);
			cmd.addParameter("@FILTER", filter);
			cmd.addParameter("@SECTION_GROUP", sectionGroup);
			cmd.addParameter("@LEXER", lexer);
			cmd.addParameter("@STOPLIST", stoplist);
			cmd.addParameter("@WORDLIST", wordlist);
				
			cmd.execute();


		}
		
		public static void createPreference(NString preferenceName,NString objectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.CREATE_PREFERENCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREFERENCE_NAME", preferenceName);
			cmd.addParameter("@OBJECT_NAME", objectName);
				
			cmd.execute();


		}
		
		public static void createSectionGroup(NString groupName,NString groupType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.CREATE_SECTION_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
			cmd.addParameter("@GROUP_TYPE", groupType);
				
			cmd.execute();


		}
		
		public static void createShadowIndex(NString idxName,NString parameterString,NNumber parallelDegree) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.CREATE_SHADOW_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IDX_NAME", idxName);
			cmd.addParameter("@PARAMETER_STRING", parameterString);
			cmd.addParameter("@PARALLEL_DEGREE", parallelDegree);
				
			cmd.execute();


		}
		
		public static void createStoplist(NString stoplistName,NString stoplistType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.CREATE_STOPLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STOPLIST_NAME", stoplistName);
			cmd.addParameter("@STOPLIST_TYPE", stoplistType);
				
			cmd.execute();


		}
		
		public static void dropIndexSet(NString setName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.DROP_INDEX_SET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SET_NAME", setName);
				
			cmd.execute();


		}
		
		public static void dropPolicy(NString policyName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.DROP_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POLICY_NAME", policyName);
				
			cmd.execute();


		}
		
		public static void dropPreference(NString preferenceName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.DROP_PREFERENCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREFERENCE_NAME", preferenceName);
				
			cmd.execute();


		}
		
		public static void dropSectionGroup(NString groupName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.DROP_SECTION_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
				
			cmd.execute();


		}
		
		public static void dropShadowIndex(NString idxName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.DROP_SHADOW_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IDX_NAME", idxName);
				
			cmd.execute();


		}
		
		public static void dropStoplist(NString stoplistName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.DROP_STOPLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STOPLIST_NAME", stoplistName);
				
			cmd.execute();


		}
		
		public static void exchangeShadowIndex(NString idxName,NString partitionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.EXCHANGE_SHADOW_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IDX_NAME", idxName);
			cmd.addParameter("@PARTITION_NAME", partitionName);
				
			cmd.execute();


		}
		
		public static void optimizeIndex(NString idxName,NString optlevel,NNumber maxtime,NString token,NString partName,NNumber tokenType,NNumber parallelDegree) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.OPTIMIZE_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IDX_NAME", idxName);
			cmd.addParameter("@OPTLEVEL", optlevel);
			cmd.addParameter("@MAXTIME", maxtime);
			cmd.addParameter("@TOKEN", token);
			cmd.addParameter("@PART_NAME", partName);
			cmd.addParameter("@TOKEN_TYPE", tokenType);
			cmd.addParameter("@PARALLEL_DEGREE", parallelDegree);
				
			cmd.execute();


		}
		
		public static void populatePending(NString idxName,NString partName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.POPULATE_PENDING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IDX_NAME", idxName);
			cmd.addParameter("@PART_NAME", partName);
				
			cmd.execute();


		}
		
		public static void recreateIndexOnline(NString idxName,NString parameterString,NNumber parallelDegree,NString partitionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.RECREATE_INDEX_ONLINE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IDX_NAME", idxName);
			cmd.addParameter("@PARAMETER_STRING", parameterString);
			cmd.addParameter("@PARALLEL_DEGREE", parallelDegree);
			cmd.addParameter("@PARTITION_NAME", partitionName);
				
			cmd.execute();


		}
		
		public static void removeIndex(NString setName,NString columnList) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.REMOVE_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SET_NAME", setName);
			cmd.addParameter("@COLUMN_LIST", columnList);
				
			cmd.execute();


		}
		
//		public static void removeMdata(NString idxName,NString sectionName,NString mdataValue, mdataRowid,NString partName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.REMOVE_MDATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@IDX_NAME", idxName);
//			cmd.addParameter("@SECTION_NAME", sectionName);
//			cmd.addParameter("@MDATA_VALUE", mdataValue);
//			cmd.addParameter("@MDATA_ROWID", mdataRowid);
//			cmd.addParameter("@PART_NAME", partName);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void removeMdata(NString idxName,NString sectionName,List<Odcivarchar2listRow> mdataValues,List<OdciridlistRow> mdataRowids,NString partName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.REMOVE_MDATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@IDX_NAME", idxName);
//			cmd.addParameter("@SECTION_NAME", sectionName);
//			// cmd.addParameter(DbTypes.getCollectionType("MDATA_VALUES", "", mdataValues, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("MDATA_ROWIDS", "", mdataRowids, object.class));
//			cmd.addParameter("@PART_NAME", partName);
//				
//			cmd.execute();
//
//
//		}
		
		public static void removeSection(NString groupName,NString sectionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.REMOVE_SECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
			cmd.addParameter("@SECTION_NAME", sectionName);
				
			cmd.execute();


		}
		
		public static void removeSection(NString groupName,NNumber sectionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.REMOVE_SECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME", groupName);
			cmd.addParameter("@SECTION_ID", sectionId);
				
			cmd.execute();


		}
		
		public static void removeStopclass(NString stoplistName,NString stopclass) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.REMOVE_STOPCLASS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STOPLIST_NAME", stoplistName);
			cmd.addParameter("@STOPCLASS", stopclass);
				
			cmd.execute();


		}
		
		public static void removeStoptheme(NString stoplistName,NString stoptheme) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.REMOVE_STOPTHEME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STOPLIST_NAME", stoplistName);
			cmd.addParameter("@STOPTHEME", stoptheme);
				
			cmd.execute();


		}
		
		public static void removeStopword(NString stoplistName,NString stopword,NString language) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.REMOVE_STOPWORD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STOPLIST_NAME", stoplistName);
			cmd.addParameter("@STOPWORD", stopword);
			cmd.addParameter("@LANGUAGE", language);
				
			cmd.execute();


		}
		
		public static void removeSubLexer(NString lexerName,NString language) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.REMOVE_SUB_LEXER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LEXER_NAME", lexerName);
			cmd.addParameter("@LANGUAGE", language);
				
			cmd.execute();


		}
		
		public static void replaceIndexMetadata(NString idxName,NString parameterString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.REPLACE_INDEX_METADATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IDX_NAME", idxName);
			cmd.addParameter("@PARAMETER_STRING", parameterString);
				
			cmd.execute();


		}
		
		public static void setAttribute(NString preferenceName,NString attributeName,NString attributeValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.SET_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREFERENCE_NAME", preferenceName);
			cmd.addParameter("@ATTRIBUTE_NAME", attributeName);
			cmd.addParameter("@ATTRIBUTE_VALUE", attributeValue);
				
			cmd.execute();


		}
		
		public static void syncIndex(NString idxName,NString memory,NString partName,NNumber parallelDegree,NNumber maxtime,NNumber locking) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.SYNC_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IDX_NAME", idxName);
			cmd.addParameter("@MEMORY", memory);
			cmd.addParameter("@PART_NAME", partName);
			cmd.addParameter("@PARALLEL_DEGREE", parallelDegree);
			cmd.addParameter("@MAXTIME", maxtime);
			cmd.addParameter("@LOCKING", locking);
				
			cmd.execute();


		}
		
		public static void unsetAttribute(NString preferenceName,NString attributeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.UNSET_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREFERENCE_NAME", preferenceName);
			cmd.addParameter("@ATTRIBUTE_NAME", attributeName);
				
			cmd.execute();


		}
		
		public static void updatePolicy(NString policyName,NString filter,NString sectionGroup,NString lexer,NString stoplist,NString wordlist) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DDL.UPDATE_POLICY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POLICY_NAME", policyName);
			cmd.addParameter("@FILTER", filter);
			cmd.addParameter("@SECTION_GROUP", sectionGroup);
			cmd.addParameter("@LEXER", lexer);
			cmd.addParameter("@STOPLIST", stoplist);
			cmd.addParameter("@WORDLIST", wordlist);
				
			cmd.execute();


		}
		
	
	
	
}
