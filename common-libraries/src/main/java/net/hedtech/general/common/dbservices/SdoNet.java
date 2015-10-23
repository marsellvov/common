package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoNet {
//		public static  FcomputePathGeometry(NString network,NNumber pathId,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.COMPUTE_PATH_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@PATH_ID", pathId);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void copyNetwork(NString sourceNetwork,NString targetNetwork,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.COPY_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SOURCE_NETWORK", sourceNetwork);
			cmd.addParameter("@TARGET_NETWORK", targetNetwork);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createComponentTable(NString tableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_COMPONENT_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
				
			cmd.execute();


		}
		
		public static void createDeleteTrigger(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_DELETE_TRIGGER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();


		}
		
		public static void createLinkTable(NString tableName,NString geomType,NString geomColumn,NString costColumn,NNumber noOfHierarchyLevels,NBool addBidirectedColumn,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_LINK_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@GEOM_TYPE", geomType);
			cmd.addParameter("@GEOM_COLUMN", geomColumn);
			cmd.addParameter("@COST_COLUMN", costColumn);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@ADD_BIDIRECTED_COLUMN", addBidirectedColumn);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createLogicalNetwork(NString network,NNumber noOfHierarchyLevels,NBool isDirected,NString nodeTableName,NString nodeCostColumn,NString linkTableName,NString linkCostColumn,NString pathTableName,NString pathLinkTableName,NString subpathTableName,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_LOGICAL_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_TABLE_NAME", nodeTableName);
			cmd.addParameter("@NODE_COST_COLUMN", nodeCostColumn);
			cmd.addParameter("@LINK_TABLE_NAME", linkTableName);
			cmd.addParameter("@LINK_COST_COLUMN", linkCostColumn);
			cmd.addParameter("@PATH_TABLE_NAME", pathTableName);
			cmd.addParameter("@PATH_LINK_TABLE_NAME", pathLinkTableName);
			cmd.addParameter("@SUBPATH_TABLE_NAME", subpathTableName);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createLogicalNetwork(NString network,NNumber noOfHierarchyLevels,NBool isDirected,NString nodeTableName,NString nodeCostColumn,NString linkTableName,NString linkCostColumn,NString pathTableName,NString pathLinkTableName,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_LOGICAL_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_TABLE_NAME", nodeTableName);
			cmd.addParameter("@NODE_COST_COLUMN", nodeCostColumn);
			cmd.addParameter("@LINK_TABLE_NAME", linkTableName);
			cmd.addParameter("@LINK_COST_COLUMN", linkCostColumn);
			cmd.addParameter("@PATH_TABLE_NAME", pathTableName);
			cmd.addParameter("@PATH_LINK_TABLE_NAME", pathLinkTableName);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createLogicalNetwork(NString network,NNumber noOfHierarchyLevels,NBool isDirected,NBool nodeWithCost,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_LOGICAL_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_WITH_COST", nodeWithCost);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createLrsNetwork(NString network,NNumber noOfHierarchyLevels,NBool isDirected,NString nodeTableName,NString nodeCostColumn,NString linkTableName,NString linkCostColumn,NString lrsTableName,NString lrsGeomColumn,NString pathTableName,NString pathGeomColumn,NString pathLinkTableName,NString subpathTableName,NString subpathGeomColumn,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_LRS_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_TABLE_NAME", nodeTableName);
			cmd.addParameter("@NODE_COST_COLUMN", nodeCostColumn);
			cmd.addParameter("@LINK_TABLE_NAME", linkTableName);
			cmd.addParameter("@LINK_COST_COLUMN", linkCostColumn);
			cmd.addParameter("@LRS_TABLE_NAME", lrsTableName);
			cmd.addParameter("@LRS_GEOM_COLUMN", lrsGeomColumn);
			cmd.addParameter("@PATH_TABLE_NAME", pathTableName);
			cmd.addParameter("@PATH_GEOM_COLUMN", pathGeomColumn);
			cmd.addParameter("@PATH_LINK_TABLE_NAME", pathLinkTableName);
			cmd.addParameter("@SUBPATH_TABLE_NAME", subpathTableName);
			cmd.addParameter("@SUBPATH_GEOM_COLUMN", subpathGeomColumn);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createLrsNetwork(NString network,NNumber noOfHierarchyLevels,NBool isDirected,NString nodeTableName,NString nodeCostColumn,NString linkTableName,NString linkCostColumn,NString lrsTableName,NString lrsGeomColumn,NString pathTableName,NString pathGeomColumn,NString pathLinkTableName,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_LRS_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_TABLE_NAME", nodeTableName);
			cmd.addParameter("@NODE_COST_COLUMN", nodeCostColumn);
			cmd.addParameter("@LINK_TABLE_NAME", linkTableName);
			cmd.addParameter("@LINK_COST_COLUMN", linkCostColumn);
			cmd.addParameter("@LRS_TABLE_NAME", lrsTableName);
			cmd.addParameter("@LRS_GEOM_COLUMN", lrsGeomColumn);
			cmd.addParameter("@PATH_TABLE_NAME", pathTableName);
			cmd.addParameter("@PATH_GEOM_COLUMN", pathGeomColumn);
			cmd.addParameter("@PATH_LINK_TABLE_NAME", pathLinkTableName);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createLrsNetwork(NString network,NString lrsTableName,NString lrsGeomColumn,NNumber noOfHierarchyLevels,NBool isDirected,NBool nodeWithCost,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_LRS_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@LRS_TABLE_NAME", lrsTableName);
			cmd.addParameter("@LRS_GEOM_COLUMN", lrsGeomColumn);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_WITH_COST", nodeWithCost);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createLrsTable(NString tableName,NString geomColumn,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_LRS_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@GEOM_COLUMN", geomColumn);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createNetwork(NString network,NString geomType,NNumber noOfHierarchyLevels,NBool isDirected,NString nodeTableName,NString nodeGeomColumn,NString nodeCostColumn,NString linkTableName,NString linkGeomColumn,NString linkCostColumn,NString lrsTableName,NString lrsGeomColumn,NString pathTableName,NString pathGeomColumn,NString pathLinkTableName,NString subpathTableName,NString subpathGeomColumn,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@GEOM_TYPE", geomType);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_TABLE_NAME", nodeTableName);
			cmd.addParameter("@NODE_GEOM_COLUMN", nodeGeomColumn);
			cmd.addParameter("@NODE_COST_COLUMN", nodeCostColumn);
			cmd.addParameter("@LINK_TABLE_NAME", linkTableName);
			cmd.addParameter("@LINK_GEOM_COLUMN", linkGeomColumn);
			cmd.addParameter("@LINK_COST_COLUMN", linkCostColumn);
			cmd.addParameter("@LRS_TABLE_NAME", lrsTableName);
			cmd.addParameter("@LRS_GEOM_COLUMN", lrsGeomColumn);
			cmd.addParameter("@PATH_TABLE_NAME", pathTableName);
			cmd.addParameter("@PATH_GEOM_COLUMN", pathGeomColumn);
			cmd.addParameter("@PATH_LINK_TABLE_NAME", pathLinkTableName);
			cmd.addParameter("@SUBPATH_TABLE_NAME", subpathTableName);
			cmd.addParameter("@SUBPATH_GEOM_COLUMN", subpathGeomColumn);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createNetwork(NString network,NString geomType,NNumber noOfHierarchyLevels,NBool isDirected,NString nodeTableName,NString nodeGeomColumn,NString nodeCostColumn,NString linkTableName,NString linkGeomColumn,NString linkCostColumn,NString lrsTableName,NString lrsGeomColumn,NString pathTableName,NString pathGeomColumn,NString pathLinkTableName,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@GEOM_TYPE", geomType);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_TABLE_NAME", nodeTableName);
			cmd.addParameter("@NODE_GEOM_COLUMN", nodeGeomColumn);
			cmd.addParameter("@NODE_COST_COLUMN", nodeCostColumn);
			cmd.addParameter("@LINK_TABLE_NAME", linkTableName);
			cmd.addParameter("@LINK_GEOM_COLUMN", linkGeomColumn);
			cmd.addParameter("@LINK_COST_COLUMN", linkCostColumn);
			cmd.addParameter("@LRS_TABLE_NAME", lrsTableName);
			cmd.addParameter("@LRS_GEOM_COLUMN", lrsGeomColumn);
			cmd.addParameter("@PATH_TABLE_NAME", pathTableName);
			cmd.addParameter("@PATH_GEOM_COLUMN", pathGeomColumn);
			cmd.addParameter("@PATH_LINK_TABLE_NAME", pathLinkTableName);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createNetwork(NString network,NString geomType,NNumber noOfHierarchyLevels,NBool isDirected,NBool nodeWithCost,NString lrsTableName,NString lrsGeomColumn,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@GEOM_TYPE", geomType);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_WITH_COST", nodeWithCost);
			cmd.addParameter("@LRS_TABLE_NAME", lrsTableName);
			cmd.addParameter("@LRS_GEOM_COLUMN", lrsGeomColumn);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createNodeTable(NString tableName,NString geomType,NString geomColumn,NString costColumn,NString partitionColumn,NNumber noOfHierarchyLevels,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_NODE_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@GEOM_TYPE", geomType);
			cmd.addParameter("@GEOM_COLUMN", geomColumn);
			cmd.addParameter("@COST_COLUMN", costColumn);
			cmd.addParameter("@PARTITION_COLUMN", partitionColumn);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createNodeTable(NString tableName,NString geomType,NString geomColumn,NString costColumn,NNumber noOfHierarchyLevels,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_NODE_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@GEOM_TYPE", geomType);
			cmd.addParameter("@GEOM_COLUMN", geomColumn);
			cmd.addParameter("@COST_COLUMN", costColumn);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createPartitionBlobTable(NString tableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_PARTITION_BLOB_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
				
			cmd.execute();


		}
		
		public static void createPartitionTable(NString tableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_PARTITION_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
				
			cmd.execute();


		}
		
		public static void createPathLinkTable(NString tableName,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_PATH_LINK_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createPathTable(NString tableName,NString geomColumn,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_PATH_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@GEOM_COLUMN", geomColumn);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createRefConstraints(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_REF_CONSTRAINTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();


		}
		
		public static void createSdoNetwork(NString network,NNumber noOfHierarchyLevels,NBool isDirected,NString nodeTableName,NString nodeGeomColumn,NString nodeCostColumn,NString linkTableName,NString linkGeomColumn,NString linkCostColumn,NString pathTableName,NString pathGeomColumn,NString pathLinkTableName,NString subpathTableName,NString subpathGeomColumn,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_SDO_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_TABLE_NAME", nodeTableName);
			cmd.addParameter("@NODE_GEOM_COLUMN", nodeGeomColumn);
			cmd.addParameter("@NODE_COST_COLUMN", nodeCostColumn);
			cmd.addParameter("@LINK_TABLE_NAME", linkTableName);
			cmd.addParameter("@LINK_GEOM_COLUMN", linkGeomColumn);
			cmd.addParameter("@LINK_COST_COLUMN", linkCostColumn);
			cmd.addParameter("@PATH_TABLE_NAME", pathTableName);
			cmd.addParameter("@PATH_GEOM_COLUMN", pathGeomColumn);
			cmd.addParameter("@PATH_LINK_TABLE_NAME", pathLinkTableName);
			cmd.addParameter("@SUBPATH_TABLE_NAME", subpathTableName);
			cmd.addParameter("@SUBPATH_GEOM_COLUMN", subpathGeomColumn);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createSdoNetwork(NString network,NNumber noOfHierarchyLevels,NBool isDirected,NString nodeTableName,NString nodeGeomColumn,NString nodeCostColumn,NString linkTableName,NString linkGeomColumn,NString linkCostColumn,NString pathTableName,NString pathGeomColumn,NString pathLinkTableName,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_SDO_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_TABLE_NAME", nodeTableName);
			cmd.addParameter("@NODE_GEOM_COLUMN", nodeGeomColumn);
			cmd.addParameter("@NODE_COST_COLUMN", nodeCostColumn);
			cmd.addParameter("@LINK_TABLE_NAME", linkTableName);
			cmd.addParameter("@LINK_GEOM_COLUMN", linkGeomColumn);
			cmd.addParameter("@LINK_COST_COLUMN", linkCostColumn);
			cmd.addParameter("@PATH_TABLE_NAME", pathTableName);
			cmd.addParameter("@PATH_GEOM_COLUMN", pathGeomColumn);
			cmd.addParameter("@PATH_LINK_TABLE_NAME", pathLinkTableName);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createSdoNetwork(NString network,NNumber noOfHierarchyLevels,NBool isDirected,NBool nodeWithCost,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_SDO_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_WITH_COST", nodeWithCost);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createSubpathTable(NString tableName,NString geomColumn,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_SUBPATH_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@GEOM_COLUMN", geomColumn);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createTopoNetwork(NString network,NNumber noOfHierarchyLevels,NBool isDirected,NString nodeTableName,NString nodeGeomColumn,NString nodeCostColumn,NString linkTableName,NString linkGeomColumn,NString linkCostColumn,NString pathTableName,NString pathGeomColumn,NString pathLinkTableName,NString subpathTableName,NString subpathGeomColumn,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_TOPO_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_TABLE_NAME", nodeTableName);
			cmd.addParameter("@NODE_GEOM_COLUMN", nodeGeomColumn);
			cmd.addParameter("@NODE_COST_COLUMN", nodeCostColumn);
			cmd.addParameter("@LINK_TABLE_NAME", linkTableName);
			cmd.addParameter("@LINK_GEOM_COLUMN", linkGeomColumn);
			cmd.addParameter("@LINK_COST_COLUMN", linkCostColumn);
			cmd.addParameter("@PATH_TABLE_NAME", pathTableName);
			cmd.addParameter("@PATH_GEOM_COLUMN", pathGeomColumn);
			cmd.addParameter("@PATH_LINK_TABLE_NAME", pathLinkTableName);
			cmd.addParameter("@SUBPATH_TABLE_NAME", subpathTableName);
			cmd.addParameter("@SUBPATH_GEOM_COLUMN", subpathGeomColumn);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createTopoNetwork(NString network,NNumber noOfHierarchyLevels,NBool isDirected,NString nodeTableName,NString nodeGeomColumn,NString nodeCostColumn,NString linkTableName,NString linkGeomColumn,NString linkCostColumn,NString pathTableName,NString pathGeomColumn,NString pathLinkTableName,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_TOPO_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_TABLE_NAME", nodeTableName);
			cmd.addParameter("@NODE_GEOM_COLUMN", nodeGeomColumn);
			cmd.addParameter("@NODE_COST_COLUMN", nodeCostColumn);
			cmd.addParameter("@LINK_TABLE_NAME", linkTableName);
			cmd.addParameter("@LINK_GEOM_COLUMN", linkGeomColumn);
			cmd.addParameter("@LINK_COST_COLUMN", linkCostColumn);
			cmd.addParameter("@PATH_TABLE_NAME", pathTableName);
			cmd.addParameter("@PATH_GEOM_COLUMN", pathGeomColumn);
			cmd.addParameter("@PATH_LINK_TABLE_NAME", pathLinkTableName);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createTopoNetwork(NString network,NNumber noOfHierarchyLevels,NBool isDirected,NString nodeTableName,NString nodeCostColumn,NString linkTableName,NString linkCostColumn,NString pathTableName,NString pathGeomColumn,NString pathLinkTableName,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_TOPO_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_TABLE_NAME", nodeTableName);
			cmd.addParameter("@NODE_COST_COLUMN", nodeCostColumn);
			cmd.addParameter("@LINK_TABLE_NAME", linkTableName);
			cmd.addParameter("@LINK_COST_COLUMN", linkCostColumn);
			cmd.addParameter("@PATH_TABLE_NAME", pathTableName);
			cmd.addParameter("@PATH_GEOM_COLUMN", pathGeomColumn);
			cmd.addParameter("@PATH_LINK_TABLE_NAME", pathLinkTableName);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createTopoNetwork(NString network,NNumber noOfHierarchyLevels,NBool isDirected,NBool nodeWithCost,NBool isComplex,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_TOPO_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_WITH_COST", nodeWithCost);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void createTopoNetwork(NString network,NNumber noOfHierarchyLevels,NBool isDirected,NBool nodeWithCost,NBool isComplex,NString topology,NString storageParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.CREATE_TOPO_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NO_OF_HIERARCHY_LEVELS", noOfHierarchyLevels);
			cmd.addParameter("@IS_DIRECTED", isDirected);
			cmd.addParameter("@NODE_WITH_COST", nodeWithCost);
			cmd.addParameter("@IS_COMPLEX", isComplex);
			cmd.addParameter("@TOPOLOGY", topology);
			cmd.addParameter("@STORAGE_PARAMETERS", storageParameters);
				
			cmd.execute();


		}
		
		public static void deleteLink(NString network,NNumber linkId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.DELETE_LINK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@LINK_ID", linkId);
				
			cmd.execute();


		}
		
		public static void deleteNode(NString network,NNumber nodeId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.DELETE_NODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NODE_ID", nodeId);
				
			cmd.execute();


		}
		
		public static void deletePath(NString network,NNumber pathId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.DELETE_PATH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@PATH_ID", pathId);
				
			cmd.execute();


		}
		
		public static void deleteSubpath(NString network,NNumber subpathId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.DELETE_SUBPATH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@SUBPATH_ID", subpathId);
				
			cmd.execute();


		}
		
		public static void deregisterConstraint(NString constraintName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.DEREGISTER_CONSTRAINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONSTRAINT_NAME", constraintName);
				
			cmd.execute();


		}
		
		public static void disableRefConstraints(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.DISABLE_REF_CONSTRAINTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();


		}
		
		public static void dropNetwork(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.DROP_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();


		}
		
		public static void dropRefConstraints(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.DROP_REF_CONSTRAINTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();


		}
		
		public static void enableRefConstraints(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.ENABLE_REF_CONSTRAINTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();


		}
		
		public static void findConnectedComponents(NString network,NNumber linkLevel,NString componentTableName,NString logLoc,NString logFile,NString openMode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.FIND_CONNECTED_COMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@LINK_LEVEL", linkLevel);
			cmd.addParameter("@COMPONENT_TABLE_NAME", componentTableName);
			cmd.addParameter("@LOG_LOC", logLoc);
			cmd.addParameter("@LOG_FILE", logFile);
			cmd.addParameter("@OPEN_MODE", openMode);
				
			cmd.execute();


		}
		
		public static void generatePartitionBlob(NString network,NNumber linkLevel,NNumber partitionId,NBool includeUserData,NString logLoc,NString logFile,NString openMode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GENERATE_PARTITION_BLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@LINK_LEVEL", linkLevel);
			cmd.addParameter("@PARTITION_ID", partitionId);
			cmd.addParameter("@INCLUDE_USER_DATA", includeUserData);
			cmd.addParameter("@LOG_LOC", logLoc);
			cmd.addParameter("@LOG_FILE", logFile);
			cmd.addParameter("@OPEN_MODE", openMode);
				
			cmd.execute();


		}
		
		public static void generatePartitionBlobs(NString network,NNumber linkLevel,NString partitionBlobTableName,NBool includeUserData,NBool commitForEachBlob,NString logLoc,NString logFile,NString openMode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GENERATE_PARTITION_BLOBS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@LINK_LEVEL", linkLevel);
			cmd.addParameter("@PARTITION_BLOB_TABLE_NAME", partitionBlobTableName);
			cmd.addParameter("@INCLUDE_USER_DATA", includeUserData);
			cmd.addParameter("@COMMIT_FOR_EACH_BLOB", commitForEachBlob);
			cmd.addParameter("@LOG_LOC", logLoc);
			cmd.addParameter("@LOG_FILE", logFile);
			cmd.addParameter("@OPEN_MODE", openMode);
				
			cmd.execute();


		}
		
//		public static List<SdoNumberArrayRow> FgetChildLinks(NString network,NNumber linkId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_CHILD_LINKS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@LINK_ID", linkId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetChildNodes(NString network,NNumber nodeId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_CHILD_NODES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@NODE_ID", nodeId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
		
//		public static  FgetGeometry(NString network,NNumber linkId,NNumber startPercentage,NNumber endPercentage) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@LINK_ID", linkId);
//			cmd.addParameter("@START_PERCENTAGE", startPercentage);
//			cmd.addParameter("@END_PERCENTAGE", endPercentage);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString FgetGeometryType(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_GEOMETRY_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<SdoNumberArrayRow> FgetInLinks(NString network,NNumber nodeId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_IN_LINKS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@NODE_ID", nodeId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetInvalidLinks(NString network) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_INVALID_LINKS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@NETWORK", network);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetInvalidNodes(NString network) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_INVALID_NODES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@NETWORK", network);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetInvalidPaths(NString network) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_INVALID_PATHS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@NETWORK", network);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetIsolatedNodes(NString network) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_ISOLATED_NODES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@NETWORK", network);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
		
		public static NString FgetLinkCostColumn(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_LINK_COST_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetLinkDirection(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_LINK_DIRECTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetLinkGeomColumn(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_LINK_GEOM_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  FgetLinkGeometry(NString network,NNumber linkId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_LINK_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@LINK_ID", linkId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString FgetLinkPartitionColumn(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_LINK_PARTITION_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetLinkTableName(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_LINK_TABLE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<SdoNumberArrayRow> FgetLinksInPath(NString network,NNumber pathId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_LINKS_IN_PATH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@PATH_ID", pathId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
		
		public static NString FgetLrsGeomColumn(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_LRS_GEOM_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  FgetLrsLinkGeometry(NString network,NNumber linkId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_LRS_LINK_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@LINK_ID", linkId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetLrsNodeGeometry(NString network,NNumber nodeId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_LRS_NODE_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@NODE_ID", nodeId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString FgetLrsTableName(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_LRS_TABLE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetNetworkCategory(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NETWORK_CATEGORY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetNetworkId(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NETWORK_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetNetworkName(NNumber networkId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NETWORK_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK_ID", networkId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetNetworkName(NNumber networkId,Ref<NString> owner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NETWORK_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK_ID", networkId);
			cmd.addParameter("@OWNER", NString.class);
				
			cmd.execute();
			owner.val = cmd.getParameterValue("@OWNER", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetNetworkOwner(NNumber networkId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NETWORK_OWNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK_ID", networkId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetNetworkType(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NETWORK_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetNoOfHierarchyLevels(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NO_OF_HIERARCHY_LEVELS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNoOfLinks(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NO_OF_LINKS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNoOfLinks(NString network,NNumber hierarchyLevel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NO_OF_LINKS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@HIERARCHY_LEVEL", hierarchyLevel);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNoOfLinksInPath(NString network,NNumber pathId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NO_OF_LINKS_IN_PATH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@PATH_ID", pathId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNoOfNodes(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NO_OF_NODES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNoOfNodes(NString network,NNumber hierarchyLevel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NO_OF_NODES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@HIERARCHY_LEVEL", hierarchyLevel);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNoOfNodesInPath(NString network,NNumber pathId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NO_OF_NODES_IN_PATH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@PATH_ID", pathId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNoOfPartitions(NString network,NNumber linkLevel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NO_OF_PARTITIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@LINK_LEVEL", linkLevel);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetNodeCostColumn(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NODE_COST_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetNodeDegree(NString network,NNumber nodeId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NODE_DEGREE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NODE_ID", nodeId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetNodeGeomColumn(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NODE_GEOM_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  FgetNodeGeometry(NString network,NNumber nodeId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NODE_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@NODE_ID", nodeId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NNumber FgetNodeHierarchyLevel(NString network,NNumber nodeId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NODE_HIERARCHY_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NODE_ID", nodeId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNodeInDegree(NString network,NNumber nodeId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NODE_IN_DEGREE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NODE_ID", nodeId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetNodeOutDegree(NString network,NNumber nodeId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NODE_OUT_DEGREE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NODE_ID", nodeId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetNodePartitionColumn(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NODE_PARTITION_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetNodeTableName(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NODE_TABLE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<SdoNumberArrayRow> FgetNodesInPath(NString network,NNumber pathId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_NODES_IN_PATH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@PATH_ID", pathId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> FgetOutLinks(NString network,NNumber nodeId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_OUT_LINKS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@NODE_ID", nodeId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
		
		public static NString FgetPartitionBlobTableName(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_PARTITION_BLOB_TABLE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetPartitionSize(NString network,NNumber partitionId,NNumber linkLevel,NString includeUserData,NString includeSpatialData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_PARTITION_SIZE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@PARTITION_ID", partitionId);
			cmd.addParameter("@LINK_LEVEL", linkLevel);
			cmd.addParameter("@INCLUDE_USER_DATA", includeUserData);
			cmd.addParameter("@INCLUDE_SPATIAL_DATA", includeSpatialData);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetPartitionTableName(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_PARTITION_TABLE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetPathGeomColumn(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_PATH_GEOM_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetPathLinkTableName(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_PATH_LINK_TABLE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetPathTableName(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_PATH_TABLE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NNumber FgetPercentage(NString network,NNumber linkId, ptGeom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_PERCENTAGE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@LINK_ID", linkId);
//			cmd.addParameter("@PT_GEOM", ptGeom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  FgetPt(NString network,NNumber linkId,NNumber percentage) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@LINK_ID", linkId);
//			cmd.addParameter("@PERCENTAGE", percentage);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString FgetSubpathGeomColumn(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_SUBPATH_GEOM_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetSubpathTableName(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_SUBPATH_TABLE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  FgetTopoLinkGeometry(NString network,NNumber linkId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_TOPO_LINK_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@LINK_ID", linkId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetTopoNodeGeometry(NString network,NNumber nodeId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_TOPO_NODE_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@NODE_ID", nodeId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString FgetTopology(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_TOPOLOGY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetUserDefinedData(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.GET_USER_DEFINED_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void insertGeomMetadata(NString geomTableName,NString geomColumnName,List<SdoDimArrayRow> diminfo,NNumber srid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.INSERT_GEOM_METADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_TABLE_NAME", geomTableName);
//			cmd.addParameter("@GEOM_COLUMN_NAME", geomColumnName);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMINFO", "", diminfo, object.class));
//			cmd.addParameter("@SRID", srid);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void insertGeomMetadata(NString network,List<SdoDimArrayRow> diminfo,NNumber srid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.INSERT_GEOM_METADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@NETWORK", network);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMINFO", "", diminfo, object.class));
//			cmd.addParameter("@SRID", srid);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void insertPathLinkInfo(NString network,NNumber pathId,List<SdoNumberArrayRow> links,NBool isSimple) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.INSERT_PATH_LINK_INFO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@NETWORK", network);
//			cmd.addParameter("@PATH_ID", pathId);
//			// cmd.addParameter(DbTypes.getCollectionType("LINKS", "", links, object.class));
//			cmd.addParameter("@IS_SIMPLE", isSimple);
//				
//			cmd.execute();
//
//
//		}
		
		public static NString FisComplex(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.IS_COMPLEX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FisHierarchical(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.IS_HIERARCHICAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FisLinkInPath(NString network,NNumber pathId,NNumber linkId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.IS_LINK_IN_PATH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@PATH_ID", pathId);
			cmd.addParameter("@LINK_ID", linkId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FisLogical(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.IS_LOGICAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FisNodeInPath(NString network,NNumber pathId,NNumber nodeId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.IS_NODE_IN_PATH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@PATH_ID", pathId);
			cmd.addParameter("@NODE_ID", nodeId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FisSimple(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.IS_SIMPLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FisSimple(NString network,NNumber pathId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.IS_SIMPLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@PATH_ID", pathId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FisSpatial(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.IS_SPATIAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void loadConfig(NString fileDirectory,NString fileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.LOAD_CONFIG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FILE_DIRECTORY", fileDirectory);
			cmd.addParameter("@FILE_NAME", fileName);
				
			cmd.execute();


		}
		
		public static NString FlrsGeometryNetwork(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.LRS_GEOMETRY_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FnetworkExists(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.NETWORK_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void registerConstraint(NString constraintName,NString className,NString directoryName,NString description) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.REGISTER_CONSTRAINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONSTRAINT_NAME", constraintName);
			cmd.addParameter("@CLASS_NAME", className);
			cmd.addParameter("@DIRECTORY_NAME", directoryName);
			cmd.addParameter("@DESCRIPTION", description);
				
			cmd.execute();


		}
		
		public static NString FsdoGeometryNetwork(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.SDO_GEOMETRY_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void setLoggingLevel(NNumber level) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.SET_LOGGING_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LEVEL", level);
				
			cmd.execute();


		}
		
		public static void setMaxJavaHeapSize(NNumber bytes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.SET_MAX_JAVA_HEAP_SIZE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BYTES", bytes);
				
			cmd.execute();


		}
		
		public static void spatialPartition(NString network,NString partitionTableName,NNumber maxNumNodes,NString logLoc,NString logFile,NString openMode,NNumber linkLevel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.SPATIAL_PARTITION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@PARTITION_TABLE_NAME", partitionTableName);
			cmd.addParameter("@MAX_NUM_NODES", maxNumNodes);
			cmd.addParameter("@LOG_LOC", logLoc);
			cmd.addParameter("@LOG_FILE", logFile);
			cmd.addParameter("@OPEN_MODE", openMode);
			cmd.addParameter("@LINK_LEVEL", linkLevel);
				
			cmd.execute();


		}
		
		public static void switchToLogicalNetwork(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.SWITCH_TO_LOGICAL_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();


		}
		
		public static void switchToSpatialNetwork(NString network,NString nodeGeomCol,NString linkGeomCol,NString pathGeomCol,NString subpathGeomCol) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.SWITCH_TO_SPATIAL_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@NODE_GEOM_COL", nodeGeomCol);
			cmd.addParameter("@LINK_GEOM_COL", linkGeomCol);
			cmd.addParameter("@PATH_GEOM_COL", pathGeomCol);
			cmd.addParameter("@SUBPATH_GEOM_COL", subpathGeomCol);
				
			cmd.execute();


		}
		
		public static NString FtopoGeometryNetwork(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.TOPO_GEOMETRY_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidateComponentSchema(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.VALIDATE_COMPONENT_SCHEMA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidateLinkSchema(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.VALIDATE_LINK_SCHEMA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidateLrsSchema(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.VALIDATE_LRS_SCHEMA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidateNetwork(NString network,NString checkData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.VALIDATE_NETWORK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
			cmd.addParameter("@CHECK_DATA", checkData);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidateNodeSchema(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.VALIDATE_NODE_SCHEMA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidatePartitionBlobSchema(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.VALIDATE_PARTITION_BLOB_SCHEMA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidatePartitionSchema(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.VALIDATE_PARTITION_SCHEMA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidatePathSchema(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.VALIDATE_PATH_SCHEMA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FvalidateSubpathSchema(NString network) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET.VALIDATE_SUBPATH_SCHEMA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NETWORK", network);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
