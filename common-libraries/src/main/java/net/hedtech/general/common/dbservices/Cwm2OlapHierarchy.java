package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapHierarchy {
		public static void createHierarchy(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName,NString pDisplayName,NString pShortDescription,NString pDescription,NString pSolvedCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_HIERARCHY.CREATE_HIERARCHY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_DISPLAY_NAME", pDisplayName);
			cmd.addParameter("@P_SHORT_DESCRIPTION", pShortDescription);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_SOLVED_CODE", pSolvedCode);
				
			cmd.execute();


		}
		
		public static void dropHierarchy(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_HIERARCHY.DROP_HIERARCHY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
				
			cmd.execute();


		}
		
		public static void lockHierarchy(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_HIERARCHY.LOCK_HIERARCHY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();


		}
		
		public static void setDescription(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName,NString pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_HIERARCHY.SET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
				
			cmd.execute();


		}
		
		public static void setDisplayName(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName,NString pDisplayName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_HIERARCHY.SET_DISPLAY_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_DISPLAY_NAME", pDisplayName);
				
			cmd.execute();


		}
		
		public static void setHierarchyName(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName,NString pSetHierarchyName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_HIERARCHY.SET_HIERARCHY_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_SET_HIERARCHY_NAME", pSetHierarchyName);
				
			cmd.execute();


		}
		
		public static void setShortDescription(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName,NString pShortDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_HIERARCHY.SET_SHORT_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_SHORT_DESCRIPTION", pShortDescription);
				
			cmd.execute();


		}
		
		public static void setSolvedCode(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName,NString pSolvedCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_HIERARCHY.SET_SOLVED_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_SOLVED_CODE", pSolvedCode);
				
			cmd.execute();


		}
		
	
	
	
}
