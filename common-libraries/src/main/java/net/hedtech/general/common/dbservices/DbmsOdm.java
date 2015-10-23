package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsOdm {
		public static void createcubeleveltuple(NString pCubeOwner,NString pCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATECUBELEVELTUPLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
				
			cmd.execute();


		}
		
		public static void createcubeleveltuple(NString pCubeOwner,NString pCubeName,NString pLevelsTableOwner,NString pLevelsTableName,NString pTuplesTableOwner,NString pTuplesTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATECUBELEVELTUPLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_LEVELS_TABLE_OWNER", pLevelsTableOwner);
			cmd.addParameter("@P_LEVELS_TABLE_NAME", pLevelsTableName);
			cmd.addParameter("@P_TUPLES_TABLE_OWNER", pTuplesTableOwner);
			cmd.addParameter("@P_TUPLES_TABLE_NAME", pTuplesTableName);
				
			cmd.execute();


		}
		
		public static void createdimlevtuple(NString pCubeOwner,NString pCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATEDIMLEVTUPLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
				
			cmd.execute();


		}
		
		public static void createdimlevtuple(NString pCubeOwner,NString pCubeName,NString pLevelsTableOwner,NString pLevelsTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATEDIMLEVTUPLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_LEVELS_TABLE_OWNER", pLevelsTableOwner);
			cmd.addParameter("@P_LEVELS_TABLE_NAME", pLevelsTableName);
				
			cmd.execute();


		}
		
		public static void createdimmvGs(NString pDimensionOwner,NString pDimensionName,NString pOutputFile,NString pOutputPath,NString pTablespaceMv,NString pTablespaceIndex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATEDIMMV_GS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_OUTPUT_FILE", pOutputFile);
			cmd.addParameter("@P_OUTPUT_PATH", pOutputPath);
			cmd.addParameter("@P_TABLESPACE_MV", pTablespaceMv);
			cmd.addParameter("@P_TABLESPACE_INDEX", pTablespaceIndex);
				
			cmd.execute();


		}
		
		public static void createdimmvGs(NString pDimensionOwner,NString pDimensionName,NString pOutputFile,NString pOutputPath,NBool pPartitioning,NString pTablespaceMv,NString pTablespaceIndex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATEDIMMV_GS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_OUTPUT_FILE", pOutputFile);
			cmd.addParameter("@P_OUTPUT_PATH", pOutputPath);
			cmd.addParameter("@P_PARTITIONING", pPartitioning);
			cmd.addParameter("@P_TABLESPACE_MV", pTablespaceMv);
			cmd.addParameter("@P_TABLESPACE_INDEX", pTablespaceIndex);
				
			cmd.execute();


		}
		
		public static void createdimmvGs(NString pDimensionOwner,NString pDimensionName,NString pOutputFile,NString pOutputPath,NBool pPartitioning,NString pTablespaceMv,NString pTablespaceIndex,NString pRefreshMethod,NString pRefreshOn,NBool pExecute) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATEDIMMV_GS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_OUTPUT_FILE", pOutputFile);
			cmd.addParameter("@P_OUTPUT_PATH", pOutputPath);
			cmd.addParameter("@P_PARTITIONING", pPartitioning);
			cmd.addParameter("@P_TABLESPACE_MV", pTablespaceMv);
			cmd.addParameter("@P_TABLESPACE_INDEX", pTablespaceIndex);
			cmd.addParameter("@P_REFRESH_METHOD", pRefreshMethod);
			cmd.addParameter("@P_REFRESH_ON", pRefreshOn);
			cmd.addParameter("@P_EXECUTE", pExecute);
				
			cmd.execute();


		}
		
		public static void createdimowb(NNumber pRunId,NString pDimensionOwner,NString pDimensionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATEDIMOWB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUN_ID", pRunId);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
				
			cmd.execute();


		}
		
		public static void createdimowb(NNumber pRunId,NString pDimensionOwner,NString pDimensionName,NBool pPartitioning,NString pTablespaceMv,NString pTablespaceIndex,NString pRefreshMethod,NString pRefreshOn,NBool pExecute) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATEDIMOWB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUN_ID", pRunId);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_PARTITIONING", pPartitioning);
			cmd.addParameter("@P_TABLESPACE_MV", pTablespaceMv);
			cmd.addParameter("@P_TABLESPACE_INDEX", pTablespaceIndex);
			cmd.addParameter("@P_REFRESH_METHOD", pRefreshMethod);
			cmd.addParameter("@P_REFRESH_ON", pRefreshOn);
			cmd.addParameter("@P_EXECUTE", pExecute);
				
			cmd.execute();


		}
		
		public static void createfactmvGs(NString pCubeOwner,NString pCubeName,NString pOutputFile,NString pOutputPath,NBool pPartitioning,NString pTablespaceMv,NString pTablespaceIndex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATEFACTMV_GS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_OUTPUT_FILE", pOutputFile);
			cmd.addParameter("@P_OUTPUT_PATH", pOutputPath);
			cmd.addParameter("@P_PARTITIONING", pPartitioning);
			cmd.addParameter("@P_TABLESPACE_MV", pTablespaceMv);
			cmd.addParameter("@P_TABLESPACE_INDEX", pTablespaceIndex);
				
			cmd.execute();


		}
		
		public static void createfactmvGs(NString pCubeOwner,NString pCubeName,NString pOutputFile,NString pOutputPath,NString pTuplesTableOwner,NString pTuplesTableName,NBool pPartitioning,NString pTablespaceMv,NString pTablespaceIndex,NString pRefreshMethod,NString pRefreshOn,NBool pExecute) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATEFACTMV_GS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_OUTPUT_FILE", pOutputFile);
			cmd.addParameter("@P_OUTPUT_PATH", pOutputPath);
			cmd.addParameter("@P_TUPLES_TABLE_OWNER", pTuplesTableOwner);
			cmd.addParameter("@P_TUPLES_TABLE_NAME", pTuplesTableName);
			cmd.addParameter("@P_PARTITIONING", pPartitioning);
			cmd.addParameter("@P_TABLESPACE_MV", pTablespaceMv);
			cmd.addParameter("@P_TABLESPACE_INDEX", pTablespaceIndex);
			cmd.addParameter("@P_REFRESH_METHOD", pRefreshMethod);
			cmd.addParameter("@P_REFRESH_ON", pRefreshOn);
			cmd.addParameter("@P_EXECUTE", pExecute);
				
			cmd.execute();


		}
		
		public static void createfactowb(NNumber pRunId,NString pCubeOwner,NString pCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATEFACTOWB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUN_ID", pRunId);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
				
			cmd.execute();


		}
		
		public static void createfactowb(NNumber pRunId,NString pCubeOwner,NString pCubeName,NString pTuplesTableOwner,NString pTuplesTableName,NBool pPartitioning,NString pTablespaceMv,NString pTablespaceIndex,NString pRefreshMethod,NString pRefreshOn,NBool pExecute) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATEFACTOWB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUN_ID", pRunId);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_TUPLES_TABLE_OWNER", pTuplesTableOwner);
			cmd.addParameter("@P_TUPLES_TABLE_NAME", pTuplesTableName);
			cmd.addParameter("@P_PARTITIONING", pPartitioning);
			cmd.addParameter("@P_TABLESPACE_MV", pTablespaceMv);
			cmd.addParameter("@P_TABLESPACE_INDEX", pTablespaceIndex);
			cmd.addParameter("@P_REFRESH_METHOD", pRefreshMethod);
			cmd.addParameter("@P_REFRESH_ON", pRefreshOn);
			cmd.addParameter("@P_EXECUTE", pExecute);
				
			cmd.execute();


		}
		
		public static void createstdfactmv(NString pCubeOwner,NString pCubeName,NString pOutputFile,NString pOutputPath,NBool pPartitioning,NString pMaterializationLevel,NNumber pMaterializationPct,NString pTablespaceMv,NString pTablespaceIndex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATESTDFACTMV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_OUTPUT_FILE", pOutputFile);
			cmd.addParameter("@P_OUTPUT_PATH", pOutputPath);
			cmd.addParameter("@P_PARTITIONING", pPartitioning);
			cmd.addParameter("@P_MATERIALIZATION_LEVEL", pMaterializationLevel);
			cmd.addParameter("@P_MATERIALIZATION_PCT", pMaterializationPct);
			cmd.addParameter("@P_TABLESPACE_MV", pTablespaceMv);
			cmd.addParameter("@P_TABLESPACE_INDEX", pTablespaceIndex);
				
			cmd.execute();


		}
		
		public static void createstdfactmv(NString pCubeOwner,NString pCubeName,NString pOutputFile,NString pOutputPath,NBool pPartitioning,NString pMaterializationLevel,NNumber pMaterializationPct,NString pTablespaceMv,NString pTablespaceIndex,NString pRefreshMethod,NString pRefreshOn,NBool pExecute) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATESTDFACTMV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_OUTPUT_FILE", pOutputFile);
			cmd.addParameter("@P_OUTPUT_PATH", pOutputPath);
			cmd.addParameter("@P_PARTITIONING", pPartitioning);
			cmd.addParameter("@P_MATERIALIZATION_LEVEL", pMaterializationLevel);
			cmd.addParameter("@P_MATERIALIZATION_PCT", pMaterializationPct);
			cmd.addParameter("@P_TABLESPACE_MV", pTablespaceMv);
			cmd.addParameter("@P_TABLESPACE_INDEX", pTablespaceIndex);
			cmd.addParameter("@P_REFRESH_METHOD", pRefreshMethod);
			cmd.addParameter("@P_REFRESH_ON", pRefreshOn);
			cmd.addParameter("@P_EXECUTE", pExecute);
				
			cmd.execute();


		}
		
		public static void createstdfactmvowb(NNumber pRunId,NString pCubeOwner,NString pCubeName,NString pMaterializationLevel,NNumber pMaterializationPct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATESTDFACTMVOWB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUN_ID", pRunId);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MATERIALIZATION_LEVEL", pMaterializationLevel);
			cmd.addParameter("@P_MATERIALIZATION_PCT", pMaterializationPct);
				
			cmd.execute();


		}
		
		public static void createstdfactmvowb(NNumber pRunId,NString pCubeOwner,NString pCubeName,NBool pPartitioning,NString pMaterializationLevel,NNumber pMaterializationPct,NString pTablespaceMv,NString pTablespaceIndex,NString pRefreshMethod,NString pRefreshOn,NBool pExecute) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.CREATESTDFACTMVOWB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUN_ID", pRunId);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_PARTITIONING", pPartitioning);
			cmd.addParameter("@P_MATERIALIZATION_LEVEL", pMaterializationLevel);
			cmd.addParameter("@P_MATERIALIZATION_PCT", pMaterializationPct);
			cmd.addParameter("@P_TABLESPACE_MV", pTablespaceMv);
			cmd.addParameter("@P_TABLESPACE_INDEX", pTablespaceIndex);
			cmd.addParameter("@P_REFRESH_METHOD", pRefreshMethod);
			cmd.addParameter("@P_REFRESH_ON", pRefreshOn);
			cmd.addParameter("@P_EXECUTE", pExecute);
				
			cmd.execute();


		}
		
		public static void odmVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.ODM_VERSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString Fodmversion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_ODM.ODMVERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
