package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoTopo {
		public static void addTopoGeometryLayer(NString topology,NString tableName,NString columnName,NString topoGeometryLayerType,NString relationTableStorage,NNumber childLayerId,NNumber layerId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.ADD_TOPO_GEOMETRY_LAYER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
			cmd.addParameter("@TOPO_GEOMETRY_LAYER_TYPE", topoGeometryLayerType);
			cmd.addParameter("@RELATION_TABLE_STORAGE", relationTableStorage);
			cmd.addParameter("@CHILD_LAYER_ID", childLayerId);
			cmd.addParameter("@LAYER_ID", layerId);
				
			cmd.execute();


		}
		
		public static void createTopology(NString topology,NNumber tolerance,NNumber srid,NString nodeTableStorage,NString edgeTableStorage,NString faceTableStorage,NString historyTableStorage,NNumber digitsRightOfDecimal,NNumber topologyId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.CREATE_TOPOLOGY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TOLERANCE", tolerance);
			cmd.addParameter("@SRID", srid);
			cmd.addParameter("@NODE_TABLE_STORAGE", nodeTableStorage);
			cmd.addParameter("@EDGE_TABLE_STORAGE", edgeTableStorage);
			cmd.addParameter("@FACE_TABLE_STORAGE", faceTableStorage);
			cmd.addParameter("@HISTORY_TABLE_STORAGE", historyTableStorage);
			cmd.addParameter("@DIGITS_RIGHT_OF_DECIMAL", digitsRightOfDecimal);
			cmd.addParameter("@TOPOLOGY_ID", topologyId);
				
			cmd.execute();


		}
		
		public static void deleteTopoGeometryLayer(NString topology,NString tableName,NString columnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.DELETE_TOPO_GEOMETRY_LAYER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
				
			cmd.execute();


		}
		
		public static void dropTopology(NString topology) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.DROP_TOPOLOGY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
				
			cmd.execute();


		}
		
//		public static List<SdoListTypeRow> FgetFaceBoundary(NString topology,NNumber faceId,NString allEdges) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.GET_FACE_BOUNDARY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoListTypeRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@FACE_ID", faceId);
//			cmd.addParameter("@ALL_EDGES", allEdges);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoListTypeRow>.class);
//
//		}
		
//		public static List<SdoListTypeRow> FgetInteractingTgids(NNumber baseLayerId, qFeature,NString mask) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.GET_INTERACTING_TGIDS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoListTypeRow>.class);
//			cmd.addParameter("@BASE_LAYER_ID", baseLayerId);
//			cmd.addParameter("@Q_FEATURE", qFeature);
//			cmd.addParameter("@MASK", mask);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoListTypeRow>.class);
//
//		}
		
//		public static List<SdoListTypeRow> FgetInteractingTgids(NNumber tpId,NNumber baseLayerId,List<SdoTopoObjectArrayRow> topoElemArray,NString mask) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.GET_INTERACTING_TGIDS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoListTypeRow>.class);
//			cmd.addParameter("@TP_ID", tpId);
//			cmd.addParameter("@BASE_LAYER_ID", baseLayerId);
//			// cmd.addParameter(DbTypes.getCollectionType("TOPO_ELEM_ARRAY", "", topoElemArray, object.class));
//			cmd.addParameter("@MASK", mask);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoListTypeRow>.class);
//
//		}
		
//		public static List<SdoTopoObjectArrayRow> FgetTopoObjects(NString topology,NNumber topoGeometryLayerId,NNumber topoGeometryId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.GET_TOPO_OBJECTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoTopoObjectArrayRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@TOPO_GEOMETRY_LAYER_ID", topoGeometryLayerId);
//			cmd.addParameter("@TOPO_GEOMETRY_ID", topoGeometryId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoTopoObjectArrayRow>.class);
//
//		}
		
//		public static List<SdoTopoObjectArrayRow> FgetTopoObjects(NString topology, geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.GET_TOPO_OBJECTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoTopoObjectArrayRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoTopoObjectArrayRow>.class);
//
//		}
		
		public static void initializeAfterImport(NString topology,NString tgLayerOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.INITIALIZE_AFTER_IMPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TG_LAYER_OWNER", tgLayerOwner);
				
			cmd.execute();


		}
		
		public static void initializeMetadata(NString topology) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.INITIALIZE_METADATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
				
			cmd.execute();


		}
		
//		public static List<SdoListTypeRow> FinternalGetTgids(NString topology, geometry,NNumber inTgLayerId,NString _operator) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.INTERNAL_GET_TGIDS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoListTypeRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@IN_TG_LAYER_ID", inTgLayerId);
//			cmd.addParameter("@OPERATOR", _operator);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoListTypeRow>.class);
//
//		}
		
//		public static List<SdoListTypeRow> FinternalGetTgids(NString topology,NNumber qTgLayerId,NNumber qTgId,NNumber inTgLayerId,NString _operator) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.INTERNAL_GET_TGIDS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoListTypeRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@Q_TG_LAYER_ID", qTgLayerId);
//			cmd.addParameter("@Q_TG_ID", qTgId);
//			cmd.addParameter("@IN_TG_LAYER_ID", inTgLayerId);
//			cmd.addParameter("@OPERATOR", _operator);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoListTypeRow>.class);
//
//		}
		
		public static void lockrowUniverseface(NNumber topologyid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.LOCKROW_UNIVERSEFACE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGYID", topologyid);
				
			cmd.execute();


		}
		
		public static void prepareForExport(NString topology) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.PREPARE_FOR_EXPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
				
			cmd.execute();


		}
		
		public static NString Frelate(NString geom1,NString geom2,NString mask) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.RELATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GEOM1", geom1);
			cmd.addParameter("@GEOM2", geom2);
			cmd.addParameter("@MASK", mask);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString Frelate( geom,List<SdoTopoObjectArrayRow> topoElemArray,NString mask) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.RELATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("TOPO_ELEM_ARRAY", "", topoElemArray, object.class));
//			cmd.addParameter("@MASK", mask);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString Frelate( feature1, feature2,NString mask) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.RELATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@FEATURE1", feature1);
//			cmd.addParameter("@FEATURE2", feature2);
//			cmd.addParameter("@MASK", mask);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static void sdoTopoCrtRlidsView(NString topology,NNumber topoId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.SDO_TOPO_CRT_RLIDS_VIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TOPO_ID", topoId);
				
			cmd.execute();


		}
		
//		public static NNumber FtgInsertRelation(NString topology,NNumber tgLayerId,List<SdoTopoObjectArrayRow> topoIds,NNumber gtype,NNumber inputTgId,NString inputTgAttribute) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.TG_INSERT_RELATION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@TG_LAYER_ID", tgLayerId);
//			// cmd.addParameter(DbTypes.getCollectionType("TOPO_IDS", "", topoIds, object.class));
//			cmd.addParameter("@GTYPE", gtype);
//			cmd.addParameter("@INPUT_TG_ID", inputTgId);
//			cmd.addParameter("@INPUT_TG_ATTRIBUTE", inputTgAttribute);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FtgInsertRelation(NString topology,NNumber tgLayerId,List<SdoTglObjectArrayRow> topoIds,NNumber gtype,NNumber inputTgId,NString inputTgAttribute,NNumber childLid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO.TG_INSERT_RELATION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@TG_LAYER_ID", tgLayerId);
//			// cmd.addParameter(DbTypes.getCollectionType("TOPO_IDS", "", topoIds, object.class));
//			cmd.addParameter("@GTYPE", gtype);
//			cmd.addParameter("@INPUT_TG_ID", inputTgId);
//			cmd.addParameter("@INPUT_TG_ATTRIBUTE", inputTgAttribute);
//			cmd.addParameter("@CHILD_LID", childLid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
	
	
	
}
