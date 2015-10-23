package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowCollection {
		public static void addMember(NString pCollectionName,NString pC001,NString pC002,NString pC003,NString pC004,NString pC005,NString pC006,NString pC007,NString pC008,NString pC009,NString pC010,NString pC011,NString pC012,NString pC013,NString pC014,NString pC015,NString pC016,NString pC017,NString pC018,NString pC019,NString pC020,NString pC021,NString pC022,NString pC023,NString pC024,NString pC025,NString pC026,NString pC027,NString pC028,NString pC029,NString pC030,NString pC031,NString pC032,NString pC033,NString pC034,NString pC035,NString pC036,NString pC037,NString pC038,NString pC039,NString pC040,NString pC041,NString pC042,NString pC043,NString pC044,NString pC045,NString pC046,NString pC047,NString pC048,NString pC049,NString pC050,NString pClob001,NString pGenerateMd5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.ADD_MEMBER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
			cmd.addParameter("@P_C001", pC001);
			cmd.addParameter("@P_C002", pC002);
			cmd.addParameter("@P_C003", pC003);
			cmd.addParameter("@P_C004", pC004);
			cmd.addParameter("@P_C005", pC005);
			cmd.addParameter("@P_C006", pC006);
			cmd.addParameter("@P_C007", pC007);
			cmd.addParameter("@P_C008", pC008);
			cmd.addParameter("@P_C009", pC009);
			cmd.addParameter("@P_C010", pC010);
			cmd.addParameter("@P_C011", pC011);
			cmd.addParameter("@P_C012", pC012);
			cmd.addParameter("@P_C013", pC013);
			cmd.addParameter("@P_C014", pC014);
			cmd.addParameter("@P_C015", pC015);
			cmd.addParameter("@P_C016", pC016);
			cmd.addParameter("@P_C017", pC017);
			cmd.addParameter("@P_C018", pC018);
			cmd.addParameter("@P_C019", pC019);
			cmd.addParameter("@P_C020", pC020);
			cmd.addParameter("@P_C021", pC021);
			cmd.addParameter("@P_C022", pC022);
			cmd.addParameter("@P_C023", pC023);
			cmd.addParameter("@P_C024", pC024);
			cmd.addParameter("@P_C025", pC025);
			cmd.addParameter("@P_C026", pC026);
			cmd.addParameter("@P_C027", pC027);
			cmd.addParameter("@P_C028", pC028);
			cmd.addParameter("@P_C029", pC029);
			cmd.addParameter("@P_C030", pC030);
			cmd.addParameter("@P_C031", pC031);
			cmd.addParameter("@P_C032", pC032);
			cmd.addParameter("@P_C033", pC033);
			cmd.addParameter("@P_C034", pC034);
			cmd.addParameter("@P_C035", pC035);
			cmd.addParameter("@P_C036", pC036);
			cmd.addParameter("@P_C037", pC037);
			cmd.addParameter("@P_C038", pC038);
			cmd.addParameter("@P_C039", pC039);
			cmd.addParameter("@P_C040", pC040);
			cmd.addParameter("@P_C041", pC041);
			cmd.addParameter("@P_C042", pC042);
			cmd.addParameter("@P_C043", pC043);
			cmd.addParameter("@P_C044", pC044);
			cmd.addParameter("@P_C045", pC045);
			cmd.addParameter("@P_C046", pC046);
			cmd.addParameter("@P_C047", pC047);
			cmd.addParameter("@P_C048", pC048);
			cmd.addParameter("@P_C049", pC049);
			cmd.addParameter("@P_C050", pC050);
			cmd.addParameter("@P_CLOB001", pClob001);
			cmd.addParameter("@P_GENERATE_MD5", pGenerateMd5);
				
			cmd.execute();


		}
		
		public static NNumber FaddMember(NString pCollectionName,NString pC001,NString pC002,NString pC003,NString pC004,NString pC005,NString pC006,NString pC007,NString pC008,NString pC009,NString pC010,NString pC011,NString pC012,NString pC013,NString pC014,NString pC015,NString pC016,NString pC017,NString pC018,NString pC019,NString pC020,NString pC021,NString pC022,NString pC023,NString pC024,NString pC025,NString pC026,NString pC027,NString pC028,NString pC029,NString pC030,NString pC031,NString pC032,NString pC033,NString pC034,NString pC035,NString pC036,NString pC037,NString pC038,NString pC039,NString pC040,NString pC041,NString pC042,NString pC043,NString pC044,NString pC045,NString pC046,NString pC047,NString pC048,NString pC049,NString pC050,NString pClob001,NString pGenerateMd5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.ADD_MEMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
			cmd.addParameter("@P_C001", pC001);
			cmd.addParameter("@P_C002", pC002);
			cmd.addParameter("@P_C003", pC003);
			cmd.addParameter("@P_C004", pC004);
			cmd.addParameter("@P_C005", pC005);
			cmd.addParameter("@P_C006", pC006);
			cmd.addParameter("@P_C007", pC007);
			cmd.addParameter("@P_C008", pC008);
			cmd.addParameter("@P_C009", pC009);
			cmd.addParameter("@P_C010", pC010);
			cmd.addParameter("@P_C011", pC011);
			cmd.addParameter("@P_C012", pC012);
			cmd.addParameter("@P_C013", pC013);
			cmd.addParameter("@P_C014", pC014);
			cmd.addParameter("@P_C015", pC015);
			cmd.addParameter("@P_C016", pC016);
			cmd.addParameter("@P_C017", pC017);
			cmd.addParameter("@P_C018", pC018);
			cmd.addParameter("@P_C019", pC019);
			cmd.addParameter("@P_C020", pC020);
			cmd.addParameter("@P_C021", pC021);
			cmd.addParameter("@P_C022", pC022);
			cmd.addParameter("@P_C023", pC023);
			cmd.addParameter("@P_C024", pC024);
			cmd.addParameter("@P_C025", pC025);
			cmd.addParameter("@P_C026", pC026);
			cmd.addParameter("@P_C027", pC027);
			cmd.addParameter("@P_C028", pC028);
			cmd.addParameter("@P_C029", pC029);
			cmd.addParameter("@P_C030", pC030);
			cmd.addParameter("@P_C031", pC031);
			cmd.addParameter("@P_C032", pC032);
			cmd.addParameter("@P_C033", pC033);
			cmd.addParameter("@P_C034", pC034);
			cmd.addParameter("@P_C035", pC035);
			cmd.addParameter("@P_C036", pC036);
			cmd.addParameter("@P_C037", pC037);
			cmd.addParameter("@P_C038", pC038);
			cmd.addParameter("@P_C039", pC039);
			cmd.addParameter("@P_C040", pC040);
			cmd.addParameter("@P_C041", pC041);
			cmd.addParameter("@P_C042", pC042);
			cmd.addParameter("@P_C043", pC043);
			cmd.addParameter("@P_C044", pC044);
			cmd.addParameter("@P_C045", pC045);
			cmd.addParameter("@P_C046", pC046);
			cmd.addParameter("@P_C047", pC047);
			cmd.addParameter("@P_C048", pC048);
			cmd.addParameter("@P_C049", pC049);
			cmd.addParameter("@P_C050", pC050);
			cmd.addParameter("@P_CLOB001", pClob001);
			cmd.addParameter("@P_GENERATE_MD5", pGenerateMd5);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static void addMembers(NString pCollectionName,List<WwvFlowGlobal.VcArr2Row> pC001,List<WwvFlowGlobal.VcArr2Row> pC002,List<WwvFlowGlobal.VcArr2Row> pC003,List<WwvFlowGlobal.VcArr2Row> pC004,List<WwvFlowGlobal.VcArr2Row> pC005,List<WwvFlowGlobal.VcArr2Row> pC006,List<WwvFlowGlobal.VcArr2Row> pC007,List<WwvFlowGlobal.VcArr2Row> pC008,List<WwvFlowGlobal.VcArr2Row> pC009,List<WwvFlowGlobal.VcArr2Row> pC010,List<WwvFlowGlobal.VcArr2Row> pC011,List<WwvFlowGlobal.VcArr2Row> pC012,List<WwvFlowGlobal.VcArr2Row> pC013,List<WwvFlowGlobal.VcArr2Row> pC014,List<WwvFlowGlobal.VcArr2Row> pC015,List<WwvFlowGlobal.VcArr2Row> pC016,List<WwvFlowGlobal.VcArr2Row> pC017,List<WwvFlowGlobal.VcArr2Row> pC018,List<WwvFlowGlobal.VcArr2Row> pC019,List<WwvFlowGlobal.VcArr2Row> pC020,List<WwvFlowGlobal.VcArr2Row> pC021,List<WwvFlowGlobal.VcArr2Row> pC022,List<WwvFlowGlobal.VcArr2Row> pC023,List<WwvFlowGlobal.VcArr2Row> pC024,List<WwvFlowGlobal.VcArr2Row> pC025,List<WwvFlowGlobal.VcArr2Row> pC026,List<WwvFlowGlobal.VcArr2Row> pC027,List<WwvFlowGlobal.VcArr2Row> pC028,List<WwvFlowGlobal.VcArr2Row> pC029,List<WwvFlowGlobal.VcArr2Row> pC030,List<WwvFlowGlobal.VcArr2Row> pC031,List<WwvFlowGlobal.VcArr2Row> pC032,List<WwvFlowGlobal.VcArr2Row> pC033,List<WwvFlowGlobal.VcArr2Row> pC034,List<WwvFlowGlobal.VcArr2Row> pC035,List<WwvFlowGlobal.VcArr2Row> pC036,List<WwvFlowGlobal.VcArr2Row> pC037,List<WwvFlowGlobal.VcArr2Row> pC038,List<WwvFlowGlobal.VcArr2Row> pC039,List<WwvFlowGlobal.VcArr2Row> pC040,List<WwvFlowGlobal.VcArr2Row> pC041,List<WwvFlowGlobal.VcArr2Row> pC042,List<WwvFlowGlobal.VcArr2Row> pC043,List<WwvFlowGlobal.VcArr2Row> pC044,List<WwvFlowGlobal.VcArr2Row> pC045,List<WwvFlowGlobal.VcArr2Row> pC046,List<WwvFlowGlobal.VcArr2Row> pC047,List<WwvFlowGlobal.VcArr2Row> pC048,List<WwvFlowGlobal.VcArr2Row> pC049,List<WwvFlowGlobal.VcArr2Row> pC050,NString pGenerateMd5) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.ADD_MEMBERS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
//			// cmd.addParameter(DbTypes.getTableType("P_C001", "", pC001, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C002", "", pC002, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C003", "", pC003, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C004", "", pC004, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C005", "", pC005, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C006", "", pC006, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C007", "", pC007, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C008", "", pC008, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C009", "", pC009, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C010", "", pC010, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C011", "", pC011, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C012", "", pC012, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C013", "", pC013, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C014", "", pC014, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C015", "", pC015, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C016", "", pC016, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C017", "", pC017, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C018", "", pC018, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C019", "", pC019, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C020", "", pC020, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C021", "", pC021, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C022", "", pC022, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C023", "", pC023, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C024", "", pC024, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C025", "", pC025, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C026", "", pC026, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C027", "", pC027, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C028", "", pC028, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C029", "", pC029, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C030", "", pC030, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C031", "", pC031, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C032", "", pC032, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C033", "", pC033, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C034", "", pC034, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C035", "", pC035, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C036", "", pC036, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C037", "", pC037, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C038", "", pC038, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C039", "", pC039, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C040", "", pC040, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C041", "", pC041, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C042", "", pC042, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C043", "", pC043, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C044", "", pC044, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C045", "", pC045, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C046", "", pC046, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C047", "", pC047, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C048", "", pC048, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C049", "", pC049, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C050", "", pC050, object.class));
//			cmd.addParameter("@P_GENERATE_MD5", pGenerateMd5);
//				
//			cmd.execute();
//
//
//		}
		
		public static NBool FcollectionExists(NString pCollectionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.COLLECTION_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FcollectionHasChanged(NString pCollectionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.COLLECTION_HAS_CHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber FcollectionMemberCount(NString pCollectionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.COLLECTION_MEMBER_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void createCollection(NString pCollectionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.CREATE_COLLECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
				
			cmd.execute();


		}
		
		public static void createCollectionFromQuery(NString pCollectionName,NString pQuery,NString pGenerateMd5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.CREATE_COLLECTION_FROM_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_GENERATE_MD5", pGenerateMd5);
				
			cmd.execute();


		}
		
		public static void createCollectionFromQueryB(NString pCollectionName,NString pQuery) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.CREATE_COLLECTION_FROM_QUERY_B", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
			cmd.addParameter("@P_QUERY", pQuery);
				
			cmd.execute();


		}
		
		public static void createOrTruncateCollection(NString pCollectionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.CREATE_OR_TRUNCATE_COLLECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
				
			cmd.execute();


		}
		
		public static void deleteAllCollections() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.DELETE_ALL_COLLECTIONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void deleteAllCollectionsSession() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.DELETE_ALL_COLLECTIONS_SESSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void deleteCollection(NString pCollectionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.DELETE_COLLECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
				
			cmd.execute();


		}
		
		public static void deleteMember(NString pCollectionName,NString pSeq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.DELETE_MEMBER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
			cmd.addParameter("@P_SEQ", pSeq);
				
			cmd.execute();


		}
		
		public static void deleteMembers(NString pCollectionName,NString pAttrNumber,NString pAttrValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.DELETE_MEMBERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
			cmd.addParameter("@P_ATTR_NUMBER", pAttrNumber);
			cmd.addParameter("@P_ATTR_VALUE", pAttrValue);
				
			cmd.execute();


		}
		
		public static NString FgetMemberMd5(NString pCollectionName,NNumber pSeq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.GET_MEMBER_MD5", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
			cmd.addParameter("@P_SEQ", pSeq);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void mergeMembers(NString pCollectionName,List<WwvFlowGlobal.VcArr2Row> pSeq,List<WwvFlowGlobal.VcArr2Row> pC001,List<WwvFlowGlobal.VcArr2Row> pC002,List<WwvFlowGlobal.VcArr2Row> pC003,List<WwvFlowGlobal.VcArr2Row> pC004,List<WwvFlowGlobal.VcArr2Row> pC005,List<WwvFlowGlobal.VcArr2Row> pC006,List<WwvFlowGlobal.VcArr2Row> pC007,List<WwvFlowGlobal.VcArr2Row> pC008,List<WwvFlowGlobal.VcArr2Row> pC009,List<WwvFlowGlobal.VcArr2Row> pC010,List<WwvFlowGlobal.VcArr2Row> pC011,List<WwvFlowGlobal.VcArr2Row> pC012,List<WwvFlowGlobal.VcArr2Row> pC013,List<WwvFlowGlobal.VcArr2Row> pC014,List<WwvFlowGlobal.VcArr2Row> pC015,List<WwvFlowGlobal.VcArr2Row> pC016,List<WwvFlowGlobal.VcArr2Row> pC017,List<WwvFlowGlobal.VcArr2Row> pC018,List<WwvFlowGlobal.VcArr2Row> pC019,List<WwvFlowGlobal.VcArr2Row> pC020,List<WwvFlowGlobal.VcArr2Row> pC021,List<WwvFlowGlobal.VcArr2Row> pC022,List<WwvFlowGlobal.VcArr2Row> pC023,List<WwvFlowGlobal.VcArr2Row> pC024,List<WwvFlowGlobal.VcArr2Row> pC025,List<WwvFlowGlobal.VcArr2Row> pC026,List<WwvFlowGlobal.VcArr2Row> pC027,List<WwvFlowGlobal.VcArr2Row> pC028,List<WwvFlowGlobal.VcArr2Row> pC029,List<WwvFlowGlobal.VcArr2Row> pC030,List<WwvFlowGlobal.VcArr2Row> pC031,List<WwvFlowGlobal.VcArr2Row> pC032,List<WwvFlowGlobal.VcArr2Row> pC033,List<WwvFlowGlobal.VcArr2Row> pC034,List<WwvFlowGlobal.VcArr2Row> pC035,List<WwvFlowGlobal.VcArr2Row> pC036,List<WwvFlowGlobal.VcArr2Row> pC037,List<WwvFlowGlobal.VcArr2Row> pC038,List<WwvFlowGlobal.VcArr2Row> pC039,List<WwvFlowGlobal.VcArr2Row> pC040,List<WwvFlowGlobal.VcArr2Row> pC041,List<WwvFlowGlobal.VcArr2Row> pC042,List<WwvFlowGlobal.VcArr2Row> pC043,List<WwvFlowGlobal.VcArr2Row> pC044,List<WwvFlowGlobal.VcArr2Row> pC045,List<WwvFlowGlobal.VcArr2Row> pC046,List<WwvFlowGlobal.VcArr2Row> pC047,List<WwvFlowGlobal.VcArr2Row> pC048,List<WwvFlowGlobal.VcArr2Row> pC049,List<WwvFlowGlobal.VcArr2Row> pC050,NNumber pNullIndex,NString pNullValue,NString pInitQuery) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.MERGE_MEMBERS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ", "", pSeq, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C001", "", pC001, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C002", "", pC002, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C003", "", pC003, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C004", "", pC004, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C005", "", pC005, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C006", "", pC006, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C007", "", pC007, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C008", "", pC008, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C009", "", pC009, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C010", "", pC010, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C011", "", pC011, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C012", "", pC012, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C013", "", pC013, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C014", "", pC014, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C015", "", pC015, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C016", "", pC016, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C017", "", pC017, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C018", "", pC018, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C019", "", pC019, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C020", "", pC020, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C021", "", pC021, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C022", "", pC022, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C023", "", pC023, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C024", "", pC024, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C025", "", pC025, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C026", "", pC026, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C027", "", pC027, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C028", "", pC028, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C029", "", pC029, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C030", "", pC030, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C031", "", pC031, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C032", "", pC032, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C033", "", pC033, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C034", "", pC034, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C035", "", pC035, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C036", "", pC036, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C037", "", pC037, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C038", "", pC038, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C039", "", pC039, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C040", "", pC040, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C041", "", pC041, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C042", "", pC042, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C043", "", pC043, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C044", "", pC044, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C045", "", pC045, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C046", "", pC046, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C047", "", pC047, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C048", "", pC048, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C049", "", pC049, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C050", "", pC050, object.class));
//			cmd.addParameter("@P_NULL_INDEX", pNullIndex);
//			cmd.addParameter("@P_NULL_VALUE", pNullValue);
//			cmd.addParameter("@P_INIT_QUERY", pInitQuery);
//				
//			cmd.execute();
//
//
//		}
		
		public static void moveMemberDown(NString pCollectionName,NNumber pSeq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.MOVE_MEMBER_DOWN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
			cmd.addParameter("@P_SEQ", pSeq);
				
			cmd.execute();


		}
		
		public static void moveMemberUp(NString pCollectionName,NNumber pSeq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.MOVE_MEMBER_UP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
			cmd.addParameter("@P_SEQ", pSeq);
				
			cmd.execute();


		}
		
		public static void resequenceCollection(NString pCollectionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.RESEQUENCE_COLLECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
				
			cmd.execute();


		}
		
		public static void resetCollectionChanged(NString pCollectionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.RESET_COLLECTION_CHANGED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
				
			cmd.execute();


		}
		
		public static void resetCollectionChangedAll() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.RESET_COLLECTION_CHANGED_ALL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void sortMembers(NString pCollectionName,NNumber pSortOnColumnNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.SORT_MEMBERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
			cmd.addParameter("@P_SORT_ON_COLUMN_NUMBER", pSortOnColumnNumber);
				
			cmd.execute();


		}
		
		public static void truncateCollection(NString pCollectionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.TRUNCATE_COLLECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
				
			cmd.execute();


		}
		
		public static void updateMember(NString pCollectionName,NString pSeq,NString pC001,NString pC002,NString pC003,NString pC004,NString pC005,NString pC006,NString pC007,NString pC008,NString pC009,NString pC010,NString pC011,NString pC012,NString pC013,NString pC014,NString pC015,NString pC016,NString pC017,NString pC018,NString pC019,NString pC020,NString pC021,NString pC022,NString pC023,NString pC024,NString pC025,NString pC026,NString pC027,NString pC028,NString pC029,NString pC030,NString pC031,NString pC032,NString pC033,NString pC034,NString pC035,NString pC036,NString pC037,NString pC038,NString pC039,NString pC040,NString pC041,NString pC042,NString pC043,NString pC044,NString pC045,NString pC046,NString pC047,NString pC048,NString pC049,NString pC050,NString pClob001) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.UPDATE_MEMBER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
			cmd.addParameter("@P_SEQ", pSeq);
			cmd.addParameter("@P_C001", pC001);
			cmd.addParameter("@P_C002", pC002);
			cmd.addParameter("@P_C003", pC003);
			cmd.addParameter("@P_C004", pC004);
			cmd.addParameter("@P_C005", pC005);
			cmd.addParameter("@P_C006", pC006);
			cmd.addParameter("@P_C007", pC007);
			cmd.addParameter("@P_C008", pC008);
			cmd.addParameter("@P_C009", pC009);
			cmd.addParameter("@P_C010", pC010);
			cmd.addParameter("@P_C011", pC011);
			cmd.addParameter("@P_C012", pC012);
			cmd.addParameter("@P_C013", pC013);
			cmd.addParameter("@P_C014", pC014);
			cmd.addParameter("@P_C015", pC015);
			cmd.addParameter("@P_C016", pC016);
			cmd.addParameter("@P_C017", pC017);
			cmd.addParameter("@P_C018", pC018);
			cmd.addParameter("@P_C019", pC019);
			cmd.addParameter("@P_C020", pC020);
			cmd.addParameter("@P_C021", pC021);
			cmd.addParameter("@P_C022", pC022);
			cmd.addParameter("@P_C023", pC023);
			cmd.addParameter("@P_C024", pC024);
			cmd.addParameter("@P_C025", pC025);
			cmd.addParameter("@P_C026", pC026);
			cmd.addParameter("@P_C027", pC027);
			cmd.addParameter("@P_C028", pC028);
			cmd.addParameter("@P_C029", pC029);
			cmd.addParameter("@P_C030", pC030);
			cmd.addParameter("@P_C031", pC031);
			cmd.addParameter("@P_C032", pC032);
			cmd.addParameter("@P_C033", pC033);
			cmd.addParameter("@P_C034", pC034);
			cmd.addParameter("@P_C035", pC035);
			cmd.addParameter("@P_C036", pC036);
			cmd.addParameter("@P_C037", pC037);
			cmd.addParameter("@P_C038", pC038);
			cmd.addParameter("@P_C039", pC039);
			cmd.addParameter("@P_C040", pC040);
			cmd.addParameter("@P_C041", pC041);
			cmd.addParameter("@P_C042", pC042);
			cmd.addParameter("@P_C043", pC043);
			cmd.addParameter("@P_C044", pC044);
			cmd.addParameter("@P_C045", pC045);
			cmd.addParameter("@P_C046", pC046);
			cmd.addParameter("@P_C047", pC047);
			cmd.addParameter("@P_C048", pC048);
			cmd.addParameter("@P_C049", pC049);
			cmd.addParameter("@P_C050", pC050);
			cmd.addParameter("@P_CLOB001", pClob001);
				
			cmd.execute();


		}
		
//		public static void updateMemberAttribute(NString pCollectionName,NString pSeq,NString pAttrNumber,NString pAttrValue) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.UPDATE_MEMBER_ATTRIBUTE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
//			cmd.addParameter("@P_SEQ", pSeq);
//			cmd.addParameter("@P_ATTR_NUMBER", pAttrNumber);
//			cmd.addParameter("@P_ATTR_VALUE", pAttrValue);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void updateMemberAttribute(NString pCollectionName,NString pSeq,NString pClobNumber,NString pClobValue) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.UPDATE_MEMBER_ATTRIBUTE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
//			cmd.addParameter("@P_SEQ", pSeq);
//			cmd.addParameter("@P_CLOB_NUMBER", pClobNumber);
//			cmd.addParameter("@P_CLOB_VALUE", pClobValue);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void updateMembers(NString pCollectionName,List<WwvFlowGlobal.VcArr2Row> pSeq,List<WwvFlowGlobal.VcArr2Row> pC001,List<WwvFlowGlobal.VcArr2Row> pC002,List<WwvFlowGlobal.VcArr2Row> pC003,List<WwvFlowGlobal.VcArr2Row> pC004,List<WwvFlowGlobal.VcArr2Row> pC005,List<WwvFlowGlobal.VcArr2Row> pC006,List<WwvFlowGlobal.VcArr2Row> pC007,List<WwvFlowGlobal.VcArr2Row> pC008,List<WwvFlowGlobal.VcArr2Row> pC009,List<WwvFlowGlobal.VcArr2Row> pC010,List<WwvFlowGlobal.VcArr2Row> pC011,List<WwvFlowGlobal.VcArr2Row> pC012,List<WwvFlowGlobal.VcArr2Row> pC013,List<WwvFlowGlobal.VcArr2Row> pC014,List<WwvFlowGlobal.VcArr2Row> pC015,List<WwvFlowGlobal.VcArr2Row> pC016,List<WwvFlowGlobal.VcArr2Row> pC017,List<WwvFlowGlobal.VcArr2Row> pC018,List<WwvFlowGlobal.VcArr2Row> pC019,List<WwvFlowGlobal.VcArr2Row> pC020,List<WwvFlowGlobal.VcArr2Row> pC021,List<WwvFlowGlobal.VcArr2Row> pC022,List<WwvFlowGlobal.VcArr2Row> pC023,List<WwvFlowGlobal.VcArr2Row> pC024,List<WwvFlowGlobal.VcArr2Row> pC025,List<WwvFlowGlobal.VcArr2Row> pC026,List<WwvFlowGlobal.VcArr2Row> pC027,List<WwvFlowGlobal.VcArr2Row> pC028,List<WwvFlowGlobal.VcArr2Row> pC029,List<WwvFlowGlobal.VcArr2Row> pC030,List<WwvFlowGlobal.VcArr2Row> pC031,List<WwvFlowGlobal.VcArr2Row> pC032,List<WwvFlowGlobal.VcArr2Row> pC033,List<WwvFlowGlobal.VcArr2Row> pC034,List<WwvFlowGlobal.VcArr2Row> pC035,List<WwvFlowGlobal.VcArr2Row> pC036,List<WwvFlowGlobal.VcArr2Row> pC037,List<WwvFlowGlobal.VcArr2Row> pC038,List<WwvFlowGlobal.VcArr2Row> pC039,List<WwvFlowGlobal.VcArr2Row> pC040,List<WwvFlowGlobal.VcArr2Row> pC041,List<WwvFlowGlobal.VcArr2Row> pC042,List<WwvFlowGlobal.VcArr2Row> pC043,List<WwvFlowGlobal.VcArr2Row> pC044,List<WwvFlowGlobal.VcArr2Row> pC045,List<WwvFlowGlobal.VcArr2Row> pC046,List<WwvFlowGlobal.VcArr2Row> pC047,List<WwvFlowGlobal.VcArr2Row> pC048,List<WwvFlowGlobal.VcArr2Row> pC049,List<WwvFlowGlobal.VcArr2Row> pC050) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_COLLECTION.UPDATE_MEMBERS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_COLLECTION_NAME", pCollectionName);
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ", "", pSeq, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C001", "", pC001, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C002", "", pC002, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C003", "", pC003, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C004", "", pC004, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C005", "", pC005, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C006", "", pC006, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C007", "", pC007, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C008", "", pC008, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C009", "", pC009, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C010", "", pC010, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C011", "", pC011, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C012", "", pC012, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C013", "", pC013, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C014", "", pC014, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C015", "", pC015, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C016", "", pC016, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C017", "", pC017, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C018", "", pC018, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C019", "", pC019, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C020", "", pC020, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C021", "", pC021, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C022", "", pC022, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C023", "", pC023, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C024", "", pC024, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C025", "", pC025, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C026", "", pC026, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C027", "", pC027, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C028", "", pC028, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C029", "", pC029, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C030", "", pC030, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C031", "", pC031, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C032", "", pC032, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C033", "", pC033, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C034", "", pC034, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C035", "", pC035, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C036", "", pC036, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C037", "", pC037, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C038", "", pC038, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C039", "", pC039, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C040", "", pC040, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C041", "", pC041, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C042", "", pC042, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C043", "", pC043, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C044", "", pC044, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C045", "", pC045, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C046", "", pC046, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C047", "", pC047, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C048", "", pC048, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C049", "", pC049, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_C050", "", pC050, object.class));
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
