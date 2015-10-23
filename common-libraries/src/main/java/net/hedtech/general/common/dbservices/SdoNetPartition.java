package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoNetPartition {
		public static void adjustFinalPid(NString pTabName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET_PARTITION.ADJUST_FINAL_PID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAB_NAME", pTabName);
				
			cmd.execute();


		}
		
		public static NNumber FadjustM(NNumber startM,NNumber endM,NNumber m) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET_PARTITION.ADJUST_M", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@START_M", startM);
			cmd.addParameter("@END_M", endM);
			cmd.addParameter("@M", m);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void cleanTables() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET_PARTITION.CLEAN_TABLES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NNumber FgetPid(NNumber m,NNumber pid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET_PARTITION.GET_PID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@M", m);
			cmd.addParameter("@PID", pid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void graphPartition(NString pTabName,NNumber maxNumNodes,NBool makeEqual) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET_PARTITION.GRAPH_PARTITION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAB_NAME", pTabName);
			cmd.addParameter("@MAX_NUM_NODES", maxNumNodes);
			cmd.addParameter("@MAKE_EQUAL", makeEqual);
				
			cmd.execute();


		}
		
		public static void logMessage(NString message,NBool showTime) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET_PARTITION.LOG_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MESSAGE", message);
			cmd.addParameter("@SHOW_TIME", showTime);
				
			cmd.execute();


		}
		
		public static void makePartitionEqual(NString tabName,NNumber pid,NNumber vNo,NNumber partCounter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET_PARTITION.MAKE_PARTITION_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TAB_NAME", tabName);
			cmd.addParameter("@PID", pid);
			cmd.addParameter("@V_NO", vNo);
			cmd.addParameter("@PART_COUNTER", partCounter);
				
			cmd.execute();


		}
		
//		public static  FminEigenvector(NNumber sumX2,NNumber sumY2,NNumber sumXy) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET_PARTITION.MIN_EIGENVECTOR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@SUM_X2", sumX2);
//			cmd.addParameter("@SUM_Y2", sumY2);
//			cmd.addParameter("@SUM_XY", sumXy);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void newPartitionProc(NString pTabName,NNumber maxNumNodes,NNumber partitionId,NBool makeEqual,Ref<NNumber> partCounter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET_PARTITION.NEW_PARTITION_PROC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAB_NAME", pTabName);
			cmd.addParameter("@MAX_NUM_NODES", maxNumNodes);
			cmd.addParameter("@PARTITION_ID", partitionId);
			cmd.addParameter("@MAKE_EQUAL", makeEqual);
			cmd.addParameter("@PART_COUNTER", partCounter, true);
				
			cmd.execute();
			partCounter.val = cmd.getParameterValue("@PART_COUNTER", NNumber.class);


		}
		
//		public static void setLogInfo(UtlFile.FileTypeRow file) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET_PARTITION.SET_LOG_INFO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("FILE", file, UtlFile.FileTypeRow.class ));
//				
//			cmd.execute();
//
//
//		}
		
		public static NString FtableExists(NString tabName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET_PARTITION.TABLE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TAB_NAME", tabName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FtableType(NString tableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_NET_PARTITION.TABLE_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
