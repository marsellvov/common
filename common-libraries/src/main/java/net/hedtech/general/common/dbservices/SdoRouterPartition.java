package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoRouterPartition {
		public static NNumber FadjustM(NNumber startM,NNumber endM,NNumber m) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.ADJUST_M", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@START_M", startM);
			cmd.addParameter("@END_M", endM);
			cmd.addParameter("@M", m);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void buildTurnRestrictions(NString logdir,NString drivingside) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.BUILD_TURN_RESTRICTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOGDIR", logdir);
			cmd.addParameter("@DRIVINGSIDE", drivingside);
				
			cmd.execute();


		}
		
		public static void cleanupRouter(NBool allTables) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.CLEANUP_ROUTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ALL_TABLES", allTables);
				
			cmd.execute();


		}
		
		public static void dumpPartitions(NString logFileName,NNumber startPid,NNumber endPid,NBool verbose) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.DUMP_PARTITIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOG_FILE_NAME", logFileName);
			cmd.addParameter("@START_PID", startPid);
			cmd.addParameter("@END_PID", endPid);
			cmd.addParameter("@VERBOSE", verbose);
				
			cmd.execute();


		}
		
		public static void elocationDumpPartition(NString logfileName,NNumber startPid,NNumber endPid,NBool verbose,NBool is10g) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.ELOCATION_DUMP_PARTITION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOGFILE_NAME", logfileName);
			cmd.addParameter("@START_PID", startPid);
			cmd.addParameter("@END_PID", endPid);
			cmd.addParameter("@VERBOSE", verbose);
			cmd.addParameter("@IS10G", is10g);
				
			cmd.execute();


		}
		
		public static void elocationPartitionRouter(NString logfileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.ELOCATION_PARTITION_ROUTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOGFILE_NAME", logfileName);
				
			cmd.execute();


		}
		
		public static void elocationValidatePartition(NString logfileName,NNumber startPid,NNumber endPid,NBool verbose,NBool is10g) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.ELOCATION_VALIDATE_PARTITION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOGFILE_NAME", logfileName);
			cmd.addParameter("@START_PID", startPid);
			cmd.addParameter("@END_PID", endPid);
			cmd.addParameter("@VERBOSE", verbose);
			cmd.addParameter("@IS10G", is10g);
				
			cmd.execute();


		}
		
//		public static List<StringArrayRow> FgetEdgeInfo(List<SdoListTypeRow> edgeIds,Ref<List<SdoListTypeRow>> toEdgeIds,Ref<List<StringArrayRow>> rets,Ref<List<SdoListTypeRow>> angleSegments) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.GET_EDGE_INFO", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<StringArrayRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("EDGE_IDS", "", edgeIds, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("TO_EDGE_IDS", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("RETS", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("ANGLE_SEGMENTS", "", object.class));
//				
//			cmd.execute();
//			// toEdgeIds.val = cmd.getTableParameterValue("@TO_EDGE_IDS", object.class);
//			// rets.val = cmd.getTableParameterValue("@RETS", object.class);
//			// angleSegments.val = cmd.getTableParameterValue("@ANGLE_SEGMENTS", object.class);
//
//			return cmd.getReturnValue(List<StringArrayRow>.class);
//
//		}
		
//		public static NNumber FgetGeometryInfo(List<SdoListTypeRow> edgeIds,Ref<List<SdoListTypeRow>> mergedCoords) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.GET_GEOMETRY_INFO", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			// cmd.addParameter(DbTypes.getCollectionType("EDGE_IDS", "", edgeIds, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("MERGED_COORDS", "", object.class));
//				
//			cmd.execute();
//			// mergedCoords.val = cmd.getTableParameterValue("@MERGED_COORDS", object.class);
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static NNumber FgetPid(NNumber m,NNumber pid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.GET_PID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@M", m);
			cmd.addParameter("@PID", pid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void getVersion(NString logFileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.GET_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOG_FILE_NAME", logFileName);
				
			cmd.execute();


		}
		
		public static NNumber FminEigenvector(NNumber sumX2,NNumber sumY2,NNumber sumXy) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.MIN_EIGENVECTOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SUM_X2", sumX2);
			cmd.addParameter("@SUM_Y2", sumY2);
			cmd.addParameter("@SUM_XY", sumXy);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static List<NumArrayRow> FnodeInedges(NNumber nodeId,NString edgePartTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.NODE_INEDGES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<NumArrayRow>.class);
//			cmd.addParameter("@NODE_ID", nodeId);
//			cmd.addParameter("@EDGE_PART_TAB", edgePartTab);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<NumArrayRow>.class);
//
//		}
		
//		public static List<NumArrayRow> FnodeOutedges(NNumber nodeId,NString edgePartTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.NODE_OUTEDGES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<NumArrayRow>.class);
//			cmd.addParameter("@NODE_ID", nodeId);
//			cmd.addParameter("@EDGE_PART_TAB", edgePartTab);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<NumArrayRow>.class);
//
//		}
		
		public static void partitionRouter(NString logFileName,NNumber maxVNo,NString drivingSide,NBool cleanup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.PARTITION_ROUTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOG_FILE_NAME", logFileName);
			cmd.addParameter("@MAX_V_NO", maxVNo);
			cmd.addParameter("@DRIVING_SIDE", drivingSide);
			cmd.addParameter("@CLEANUP", cleanup);
				
			cmd.execute();


		}
		
		public static void validatePartitions(NString logFileName,NNumber startPid,NNumber endPid,NBool verbose) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ROUTER_PARTITION.VALIDATE_PARTITIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOG_FILE_NAME", logFileName);
			cmd.addParameter("@START_PID", startPid);
			cmd.addParameter("@END_PID", endPid);
			cmd.addParameter("@VERBOSE", verbose);
				
			cmd.execute();


		}
		
	
	
	
}
