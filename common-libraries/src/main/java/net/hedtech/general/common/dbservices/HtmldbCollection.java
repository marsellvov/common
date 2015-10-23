package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class HtmldbCollection {
		public static void addMember() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.ADD_MEMBER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void addMember() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.ADD_MEMBER", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
		public static void addMembers() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.ADD_MEMBERS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void collectionExists() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.COLLECTION_EXISTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void collectionHasChanged() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.COLLECTION_HAS_CHANGED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void collectionMemberCount() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.COLLECTION_MEMBER_COUNT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createCollection() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.CREATE_COLLECTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createCollectionFromQuery() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.CREATE_COLLECTION_FROM_QUERY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createCollectionFromQueryB() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.CREATE_COLLECTION_FROM_QUERY_B", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createOrTruncateCollection() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.CREATE_OR_TRUNCATE_COLLECTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void deleteAllCollections() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.DELETE_ALL_COLLECTIONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void deleteAllCollectionsSession() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.DELETE_ALL_COLLECTIONS_SESSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void deleteCollection() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.DELETE_COLLECTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void deleteMember() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.DELETE_MEMBER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void deleteMembers() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.DELETE_MEMBERS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getMemberMd5() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.GET_MEMBER_MD5", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void mergeMembers() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.MERGE_MEMBERS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void moveMemberDown() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.MOVE_MEMBER_DOWN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void moveMemberUp() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.MOVE_MEMBER_UP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resequenceCollection() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.RESEQUENCE_COLLECTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetCollectionChanged() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.RESET_COLLECTION_CHANGED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetCollectionChangedAll() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.RESET_COLLECTION_CHANGED_ALL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void sortMembers() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.SORT_MEMBERS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void truncateCollection() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.TRUNCATE_COLLECTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void updateMember() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.UPDATE_MEMBER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void updateMemberAttribute() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.UPDATE_MEMBER_ATTRIBUTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void updateMemberAttribute() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.UPDATE_MEMBER_ATTRIBUTE", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
		public static void updateMembers() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("HTMLDB_COLLECTION.UPDATE_MEMBERS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
