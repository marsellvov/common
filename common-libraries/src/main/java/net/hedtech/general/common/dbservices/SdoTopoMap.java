package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoTopoMap {
//		public static NNumber FaddEdge(NString topology,NNumber nodeId1,NNumber nodeId2, geom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_EDGE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@NODE_ID1", nodeId1);
//			cmd.addParameter("@NODE_ID2", nodeId2);
//			cmd.addParameter("@GEOM", geom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FaddIsolatedNode(NString topology,NNumber faceId, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_ISOLATED_NODE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@FACE_ID", faceId);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
		public static NNumber FaddIsolatedNode(NString topology,NNumber faceId,NNumber x,NNumber y) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_ISOLATED_NODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@FACE_ID", faceId);
			cmd.addParameter("@X", x);
			cmd.addParameter("@Y", y);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NNumber FaddIsolatedNode(NString topology, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_ISOLATED_NODE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static NNumber FaddIsolatedNode(NString topology,NNumber x,NNumber y) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_ISOLATED_NODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@X", x);
			cmd.addParameter("@Y", y);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static List<SdoNumberArrayRow> FaddLinearGeometry(NString topology, curve) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_LINEAR_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@CURVE", curve);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FaddLinearGeometry(NString topology,List<SdoNumberArrayRow> coords) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_LINEAR_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			// cmd.addParameter(DbTypes.getCollectionType("COORDS", "", coords, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
		
//		public static NNumber FaddLoop(NString topology,NNumber nodeId, geom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_LOOP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@NODE_ID", nodeId);
//			cmd.addParameter("@GEOM", geom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static NNumber FaddNode(NString topology,NNumber edgeId,NNumber point,NNumber coordIndex,NString isNewShapePoint) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_NODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@EDGE_ID", edgeId);
			cmd.addParameter("@POINT", point);
			cmd.addParameter("@COORD_INDEX", coordIndex);
			cmd.addParameter("@IS_NEW_SHAPE_POINT", isNewShapePoint);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FaddNode(NString topology,NNumber edgeId,NNumber x,NNumber y,NNumber coordIndex,NString isNewShapePoint) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_NODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@EDGE_ID", edgeId);
			cmd.addParameter("@X", x);
			cmd.addParameter("@Y", y);
			cmd.addParameter("@COORD_INDEX", coordIndex);
			cmd.addParameter("@IS_NEW_SHAPE_POINT", isNewShapePoint);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NNumber FaddPointGeometry(NString topology, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_POINT_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FaddPointGeometry(NString topology,List<SdoNumberArrayRow> coord) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_POINT_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			// cmd.addParameter(DbTypes.getCollectionType("COORD", "", coord, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static List<SdoNumberArrayRow> FaddPolygonGeometry(NString topology, polygon) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_POLYGON_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@POLYGON", polygon);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
		
//		public static List<SdoNumberArrayRow> FaddPolygonGeometry(NString topology,List<SdoNumberArrayRow> coords) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ADD_POLYGON_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			// cmd.addParameter(DbTypes.getCollectionType("COORDS", "", coords, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
		
		public static void changeEdgeCoords(NString topology,NNumber edgeId, NNumber geom) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.CHANGE_EDGE_COORDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@EDGE_ID", edgeId);
			cmd.addParameter("@GEOM", geom);
				
			cmd.execute();


		}
		
//		public static void changeEdgeCoords(NString topology,NNumber edgeId, geom,Ref<List<SdoNumberArrayRow>> movedIsoNodes,Ref<List<SdoNumberArrayRow>> movedIsoEdges,NString allowIsoMoves) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.CHANGE_EDGE_COORDS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@EDGE_ID", edgeId);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("MOVED_ISO_NODES", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("MOVED_ISO_EDGES", "", object.class));
//			cmd.addParameter("@ALLOW_ISO_MOVES", allowIsoMoves);
//				
//			cmd.execute();
//			// movedIsoNodes.val = cmd.getTableParameterValue("@MOVED_ISO_NODES", object.class);
//			// movedIsoEdges.val = cmd.getTableParameterValue("@MOVED_ISO_EDGES", object.class);
//
//
//		}
		
		public static void clearTopoMap(NString topoMap) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.CLEAR_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPO_MAP", topoMap);
				
			cmd.execute();


		}
		
		public static void commitTopoMap() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.COMMIT_TOPO_MAP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createEdgeIndex(NString topoMap) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.CREATE_EDGE_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPO_MAP", topoMap);
				
			cmd.execute();


		}
		
		public static void createFaceIndex(NString topoMap) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.CREATE_FACE_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPO_MAP", topoMap);
				
			cmd.execute();


		}
		
//		public static  FcreateFeature(NString topology,NString tableName,NString columnName, geom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.CREATE_FEATURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@TABLE_NAME", tableName);
//			cmd.addParameter("@COLUMN_NAME", columnName);
//			cmd.addParameter("@GEOM", geom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString FcreateFeature(NString topology,NString tableName,NString columnName,NString dmlCondition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.CREATE_FEATURE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
			cmd.addParameter("@DML_CONDITION", dmlCondition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void createTopoMap(NString topology,NString topoMap,NNumber numberOfEdges,NNumber numberOfNodes,NNumber numberOfFaces) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.CREATE_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@NUMBER_OF_EDGES", numberOfEdges);
			cmd.addParameter("@NUMBER_OF_NODES", numberOfNodes);
			cmd.addParameter("@NUMBER_OF_FACES", numberOfFaces);
				
			cmd.execute();


		}
		
		public static void createTopoMap(NString topology,NString topoMap) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.CREATE_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TOPO_MAP", topoMap);
				
			cmd.execute();


		}
		
		public static void dropTopoMap(NString topoMap) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.DROP_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPO_MAP", topoMap);
				
			cmd.execute();


		}
		
		public static NNumber FgetContainingFace(NString topology,NString topoMap, NNumber point) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_CONTAINING_FACE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@POINT", point);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetContainingFace(NString topology,NString topoMap,NNumber x,NNumber y) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_CONTAINING_FACE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@X", x);
			cmd.addParameter("@Y", y);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static List<SdoNumberArrayRow> FgetEdgeAdditions() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_EDGE_ADDITIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetEdgeChanges() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_EDGE_CHANGES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetEdgeCoords(NString topology,NString topoMap,NNumber edgeId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_EDGE_COORDS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@TOPO_MAP", topoMap);
//			cmd.addParameter("@EDGE_ID", edgeId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetEdgeDeletions() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_EDGE_DELETIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetEdgeNodes(NString topology,NString topoMap,NNumber edgeId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_EDGE_NODES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@TOPO_MAP", topoMap);
//			cmd.addParameter("@EDGE_ID", edgeId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetFaceAdditions() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_FACE_ADDITIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetFaceBoundary(NString topology,NString topoMap,NNumber faceId,NNumber opiton) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_FACE_BOUNDARY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@TOPO_MAP", topoMap);
//			cmd.addParameter("@FACE_ID", faceId);
//			cmd.addParameter("@OPITON", opiton);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetFaceChanges() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_FACE_CHANGES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetFaceDeletions() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_FACE_DELETIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
		
		public static NNumber FgetNearestEdge(NString topology,NString topoMap,NNumber point) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NEAREST_EDGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@POINT", point);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNearestEdge(NString topology,NString topoMap,NNumber x,NNumber y) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NEAREST_EDGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@X", x);
			cmd.addParameter("@Y", y);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNearestEdgeInCache(NString topoMap,NNumber x,NNumber y) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NEAREST_EDGE_IN_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@X", x);
			cmd.addParameter("@Y", y);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNearestEdgeInCache(NString topoMap,NNumber point) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NEAREST_EDGE_IN_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@POINT", point);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNearestNode(NString topology,NString topoMap,NNumber point) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NEAREST_NODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@POINT", point);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNearestNode(NString topology,NString topoMap,NNumber x,NNumber y) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NEAREST_NODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@X", x);
			cmd.addParameter("@Y", y);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNearestNodeInCache(NString topoMap,NNumber x,NNumber y) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NEAREST_NODE_IN_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@X", x);
			cmd.addParameter("@Y", y);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNearestNodeInCache(NString topoMap,NNumber point) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NEAREST_NODE_IN_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@POINT", point);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static List<SdoNumberArrayRow> FgetNodeAdditions() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NODE_ADDITIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetNodeChanges() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NODE_CHANGES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
		
		public static NNumber FgetNodeCoord(NString topology,NString topoMap,NNumber nodeId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NODE_COORD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@NODE_ID", nodeId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static List<SdoNumberArrayRow> FgetNodeDeletions() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NODE_DELETIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetNodeFaceStar(NString topology,NString topoMap,NNumber nodeId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NODE_FACE_STAR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@TOPO_MAP", topoMap);
//			cmd.addParameter("@NODE_ID", nodeId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetNodeStar(NString topology,NString topoMap,NNumber nodeId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_NODE_STAR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@TOPO_MAP", topoMap);
//			cmd.addParameter("@NODE_ID", nodeId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
		
		public static NString FgetTopoName(NString topoMap) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_TOPO_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPO_MAP", topoMap);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetTopoTransactionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.GET_TOPO_TRANSACTION_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FlistTopoMaps() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.LIST_TOPO_MAPS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FloadTopoMap(NString topoMap,NNumber xmin,NNumber ymin,NNumber xmax,NNumber ymax,NString allowUpdates) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.LOAD_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@XMIN", xmin);
			cmd.addParameter("@YMIN", ymin);
			cmd.addParameter("@XMAX", xmax);
			cmd.addParameter("@YMAX", ymax);
			cmd.addParameter("@ALLOW_UPDATES", allowUpdates);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void loadTopoMap(NString topoMap,NString allowUpdates,NString buildIndexes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.LOAD_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@ALLOW_UPDATES", allowUpdates);
			cmd.addParameter("@BUILD_INDEXES", buildIndexes);
				
			cmd.execute();


		}
		
		public static NString FloadTopoMap(NString topoMap,NNumber xmin,NNumber ymin,NNumber xmax,NNumber ymax,NString allowUpdates,NString buildIndexes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.LOAD_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@XMIN", xmin);
			cmd.addParameter("@YMIN", ymin);
			cmd.addParameter("@XMAX", xmax);
			cmd.addParameter("@YMAX", ymax);
			cmd.addParameter("@ALLOW_UPDATES", allowUpdates);
			cmd.addParameter("@BUILD_INDEXES", buildIndexes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FloadTopoMap(NString topoMap,NNumber xmin,NNumber ymin,NNumber xmax,NNumber ymax,NString allowUpdates,NString buildIndexes,NString nextLoad) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.LOAD_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@XMIN", xmin);
			cmd.addParameter("@YMIN", ymin);
			cmd.addParameter("@XMAX", xmax);
			cmd.addParameter("@YMAX", ymax);
			cmd.addParameter("@ALLOW_UPDATES", allowUpdates);
			cmd.addParameter("@BUILD_INDEXES", buildIndexes);
			cmd.addParameter("@NEXT_LOAD", nextLoad);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FloadTopoMap(NString topoMap,NString allowUpdates) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.LOAD_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@ALLOW_UPDATES", allowUpdates);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FloadTopoMap(NString topoMap,NString allowUpdates,NString buildIndexes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.LOAD_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@ALLOW_UPDATES", allowUpdates);
			cmd.addParameter("@BUILD_INDEXES", buildIndexes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void loadTopoMap(NString topoMap,NNumber xmin,NNumber ymin,NNumber xmax,NNumber ymax,NString allowUpdates) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.LOAD_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@XMIN", xmin);
			cmd.addParameter("@YMIN", ymin);
			cmd.addParameter("@XMAX", xmax);
			cmd.addParameter("@YMAX", ymax);
			cmd.addParameter("@ALLOW_UPDATES", allowUpdates);
				
			cmd.execute();


		}
		
		public static void loadTopoMap(NString topoMap,NNumber xmin,NNumber ymin,NNumber xmax,NNumber ymax,NString allowUpdates,NString buildIndexes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.LOAD_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@XMIN", xmin);
			cmd.addParameter("@YMIN", ymin);
			cmd.addParameter("@XMAX", xmax);
			cmd.addParameter("@YMAX", ymax);
			cmd.addParameter("@ALLOW_UPDATES", allowUpdates);
			cmd.addParameter("@BUILD_INDEXES", buildIndexes);
				
			cmd.execute();


		}
		
		public static void loadTopoMap(NString topoMap,NNumber xmin,NNumber ymin,NNumber xmax,NNumber ymax,NString allowUpdates,NString buildIndexes,NString nextLoad) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.LOAD_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@XMIN", xmin);
			cmd.addParameter("@YMIN", ymin);
			cmd.addParameter("@XMAX", xmax);
			cmd.addParameter("@YMAX", ymax);
			cmd.addParameter("@ALLOW_UPDATES", allowUpdates);
			cmd.addParameter("@BUILD_INDEXES", buildIndexes);
			cmd.addParameter("@NEXT_LOAD", nextLoad);
				
			cmd.execute();


		}
		
		public static void loadTopoMap(NString topoMap,NString allowUpdates) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.LOAD_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@ALLOW_UPDATES", allowUpdates);
				
			cmd.execute();


		}
		
//		public static void moveEdge(NString topology,NNumber edgeId,NNumber sNodeId,NNumber tNodeId,List<SdoNumberArrayRow> edgeCoords) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.MOVE_EDGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@EDGE_ID", edgeId);
//			cmd.addParameter("@S_NODE_ID", sNodeId);
//			cmd.addParameter("@T_NODE_ID", tNodeId);
//			// cmd.addParameter(DbTypes.getCollectionType("EDGE_COORDS", "", edgeCoords, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void moveEdge(NString topology,NNumber edgeId,NNumber sNodeId,NNumber tNodeId,List<SdoNumberArrayRow> edgeCoords,Ref<List<SdoNumberArrayRow>> movedIsoNodes,Ref<List<SdoNumberArrayRow>> movedIsoEdges,NString allowIsoMoves) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.MOVE_EDGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@EDGE_ID", edgeId);
//			cmd.addParameter("@S_NODE_ID", sNodeId);
//			cmd.addParameter("@T_NODE_ID", tNodeId);
//			// cmd.addParameter(DbTypes.getCollectionType("EDGE_COORDS", "", edgeCoords, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("MOVED_ISO_NODES", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("MOVED_ISO_EDGES", "", object.class));
//			cmd.addParameter("@ALLOW_ISO_MOVES", allowIsoMoves);
//				
//			cmd.execute();
//			// movedIsoNodes.val = cmd.getTableParameterValue("@MOVED_ISO_NODES", object.class);
//			// movedIsoEdges.val = cmd.getTableParameterValue("@MOVED_ISO_EDGES", object.class);
//
//
//		}
		
		public static void moveIsolatedNode(NString topology,NNumber nodeId, NNumber point) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.MOVE_ISOLATED_NODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@NODE_ID", nodeId);
			cmd.addParameter("@POINT", point);
				
			cmd.execute();


		}
		
		public static void moveIsolatedNode(NString topology,NNumber nodeId,NNumber x,NNumber y) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.MOVE_ISOLATED_NODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@NODE_ID", nodeId);
			cmd.addParameter("@X", x);
			cmd.addParameter("@Y", y);
				
			cmd.execute();


		}
		
//		public static void moveNode(NString topology,NNumber nodeId,List<SdoEdgeArrayRow> edgesCoords) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.MOVE_NODE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@NODE_ID", nodeId);
//			// cmd.addParameter(DbTypes.getCollectionType("EDGES_COORDS", "", edgesCoords, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void moveNode(NString topology,NNumber nodeId,List<SdoEdgeArrayRow> edgesCoords,Ref<List<SdoNumberArrayRow>> movedIsoNodes,Ref<List<SdoNumberArrayRow>> movedIsoEdges,NString allowIsoMoves) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.MOVE_NODE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TOPOLOGY", topology);
//			cmd.addParameter("@NODE_ID", nodeId);
//			// cmd.addParameter(DbTypes.getCollectionType("EDGES_COORDS", "", edgesCoords, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("MOVED_ISO_NODES", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("MOVED_ISO_EDGES", "", object.class));
//			cmd.addParameter("@ALLOW_ISO_MOVES", allowIsoMoves);
//				
//			cmd.execute();
//			// movedIsoNodes.val = cmd.getTableParameterValue("@MOVED_ISO_NODES", object.class);
//			// movedIsoEdges.val = cmd.getTableParameterValue("@MOVED_ISO_EDGES", object.class);
//
//
//		}
		
		public static void removeEdge(NString topology,NNumber edgeId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.REMOVE_EDGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@EDGE_ID", edgeId);
				
			cmd.execute();


		}
		
		public static void removeNode(NString topology,NNumber nodeId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.REMOVE_NODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@NODE_ID", nodeId);
				
			cmd.execute();


		}
		
		public static void removeObsoleteNodes(NString topology) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.REMOVE_OBSOLETE_NODES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOPOLOGY", topology);
				
			cmd.execute();


		}
		
		public static void rollbackTopoMap() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.ROLLBACK_TOPO_MAP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static List<SdoNumberArrayRow> FsearchEdgeRtreeTopoMap(NString topoMap,NNumber xmin,NNumber ymin,NNumber xmax,NNumber ymax,NNumber capacity) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.SEARCH_EDGE_RTREE_TOPO_MAP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@TOPO_MAP", topoMap);
//			cmd.addParameter("@XMIN", xmin);
//			cmd.addParameter("@YMIN", ymin);
//			cmd.addParameter("@XMAX", xmax);
//			cmd.addParameter("@YMAX", ymax);
//			cmd.addParameter("@CAPACITY", capacity);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FsearchFaceRtreeTopoMap(NString topoMap,NNumber xmin,NNumber ymin,NNumber xmax,NNumber ymax,NNumber capacity) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.SEARCH_FACE_RTREE_TOPO_MAP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@TOPO_MAP", topoMap);
//			cmd.addParameter("@XMIN", xmin);
//			cmd.addParameter("@YMIN", ymin);
//			cmd.addParameter("@XMAX", xmax);
//			cmd.addParameter("@YMAX", ymax);
//			cmd.addParameter("@CAPACITY", capacity);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
		
		public static void setMaxMemorySize(NNumber bytes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.SET_MAX_MEMORY_SIZE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BYTES", bytes);
				
			cmd.execute();


		}
		
		public static void updateTopoMap() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.UPDATE_TOPO_MAP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString FvalidateTopoMap(NString topoMap) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.VALIDATE_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPO_MAP", topoMap);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidateTopoMap(NString topoMap,NNumber level) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.VALIDATE_TOPO_MAP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPO_MAP", topoMap);
			cmd.addParameter("@LEVEL", level);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidateTopology(NString topology) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.VALIDATE_TOPOLOGY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPOLOGY", topology);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidateTopology(NString topology,NString preventUpdates) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.VALIDATE_TOPOLOGY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@PREVENT_UPDATES", preventUpdates);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidateTopology(NString topology,NString preventUpdates,NNumber level) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.VALIDATE_TOPOLOGY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@PREVENT_UPDATES", preventUpdates);
			cmd.addParameter("@LEVEL", level);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidateTopology(NString topology,NNumber xmin,NNumber ymin,NNumber xmax,NNumber ymax) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.VALIDATE_TOPOLOGY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@XMIN", xmin);
			cmd.addParameter("@YMIN", ymin);
			cmd.addParameter("@XMAX", xmax);
			cmd.addParameter("@YMAX", ymax);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidateTopology(NString topology,NNumber xmin,NNumber ymin,NNumber xmax,NNumber ymax,NString preventUpdates) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.VALIDATE_TOPOLOGY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@XMIN", xmin);
			cmd.addParameter("@YMIN", ymin);
			cmd.addParameter("@XMAX", xmax);
			cmd.addParameter("@YMAX", ymax);
			cmd.addParameter("@PREVENT_UPDATES", preventUpdates);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidateTopology(NString topology,NNumber xmin,NNumber ymin,NNumber xmax,NNumber ymax,NString preventUpdates,NNumber level) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TOPO_MAP.VALIDATE_TOPOLOGY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@XMIN", xmin);
			cmd.addParameter("@YMIN", ymin);
			cmd.addParameter("@XMAX", xmax);
			cmd.addParameter("@YMAX", ymax);
			cmd.addParameter("@PREVENT_UPDATES", preventUpdates);
			cmd.addParameter("@LEVEL", level);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
