package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapCube {
		public static void addDimensionToCube(NString pCubeOwner,NString pCubeName,NString pDimensionOwner,NString pDimensionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CUBE.ADD_DIMENSION_TO_CUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
				
			cmd.execute();


		}
		
		public static void createCube(NString pCubeOwner,NString pCubeName,NString pDisplayName,NString pShortDescription,NString pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CUBE.CREATE_CUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_DISPLAY_NAME", pDisplayName);
			cmd.addParameter("@P_SHORT_DESCRIPTION", pShortDescription);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
				
			cmd.execute();


		}
		
		public static void dropCube(NString pCubeOwner,NString pCubeName,NString pSilent) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CUBE.DROP_CUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_SILENT", pSilent);
				
			cmd.execute();


		}
		
		public static void lockCube(NString pCubeOwner,NString pCubeName,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CUBE.LOCK_CUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();


		}
		
		public static void removeDimensionFromCube(NString pCubeOwner,NString pCubeName,NString pDimensionOwner,NString pDimensionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CUBE.REMOVE_DIMENSION_FROM_CUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
				
			cmd.execute();


		}
		
		public static void setAggregationOperator(NString pCubeOwner,NString pCubeName,NString pAggoperSpec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CUBE.SET_AGGREGATION_OPERATOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_AGGOPER_SPEC", pAggoperSpec);
				
			cmd.execute();


		}
		
		public static void setCubeName(NString pCubeOwner,NString pCubeName,NString pSetCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CUBE.SET_CUBE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_SET_CUBE_NAME", pSetCubeName);
				
			cmd.execute();


		}
		
		public static void setDefaultCubeDimCalcHier(NString pCubeOwner,NString pCubeName,NString pDimensionOwner,NString pDimensionName,NString pHierarchyName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CUBE.SET_DEFAULT_CUBE_DIM_CALC_HIER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
				
			cmd.execute();


		}
		
		public static void setDescription(NString pCubeOwner,NString pCubeName,NString pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CUBE.SET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
				
			cmd.execute();


		}
		
		public static void setDisplayName(NString pCubeOwner,NString pCubeName,NString pDisplayName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CUBE.SET_DISPLAY_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_DISPLAY_NAME", pDisplayName);
				
			cmd.execute();


		}
		
		public static void setMvSummaryCode(NString pCubeOwner,NString pCubeName,NString pSummaryCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CUBE.SET_MV_SUMMARY_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_SUMMARY_CODE", pSummaryCode);
				
			cmd.execute();


		}
		
		public static void setShortDescription(NString pCubeOwner,NString pCubeName,NString pShortDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CUBE.SET_SHORT_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_SHORT_DESCRIPTION", pShortDescription);
				
			cmd.execute();


		}
		
	
	
	
}
