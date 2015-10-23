package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapLevel {
		public static void addLevelToHierarchy(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName,NString pChildLevelName,NString pParentLevelName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_LEVEL.ADD_LEVEL_TO_HIERARCHY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_CHILD_LEVEL_NAME", pChildLevelName);
			cmd.addParameter("@P_PARENT_LEVEL_NAME", pParentLevelName);
				
			cmd.execute();


		}
		
		public static void createLevel(NString pDimensionOwner,NString pDimensionName,NString pLevelName,NString pDisplayName,NString pPluralName,NString pShortDescription,NString pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_LEVEL.CREATE_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_DISPLAY_NAME", pDisplayName);
			cmd.addParameter("@P_PLURAL_NAME", pPluralName);
			cmd.addParameter("@P_SHORT_DESCRIPTION", pShortDescription);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
				
			cmd.execute();


		}
		
		public static void dropLevel(NString pDimensionOwner,NString pDimensionName,NString pLevelName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_LEVEL.DROP_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
				
			cmd.execute();


		}
		
		public static void lockLevel(NString pDimensionOwner,NString pDimensionName,NString pLevelName,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_LEVEL.LOCK_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();


		}
		
		public static void removeLevelFromHierarchy(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName,NString pChildLevelName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_LEVEL.REMOVE_LEVEL_FROM_HIERARCHY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_CHILD_LEVEL_NAME", pChildLevelName);
				
			cmd.execute();


		}
		
		public static void setDescription(NString pDimensionOwner,NString pDimensionName,NString pLevelName,NString pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_LEVEL.SET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
				
			cmd.execute();


		}
		
		public static void setDisplayName(NString pDimensionOwner,NString pDimensionName,NString pLevelName,NString pDisplayName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_LEVEL.SET_DISPLAY_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_DISPLAY_NAME", pDisplayName);
				
			cmd.execute();


		}
		
		public static void setLevelName(NString pDimensionOwner,NString pDimensionName,NString pLevelName,NString pSetLevelName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_LEVEL.SET_LEVEL_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_SET_LEVEL_NAME", pSetLevelName);
				
			cmd.execute();


		}
		
		public static void setPluralName(NString pDimensionOwner,NString pDimensionName,NString pLevelName,NString pPluralName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_LEVEL.SET_PLURAL_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_PLURAL_NAME", pPluralName);
				
			cmd.execute();


		}
		
		public static void setShortDescription(NString pDimensionOwner,NString pDimensionName,NString pLevelName,NString pShortDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_LEVEL.SET_SHORT_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_SHORT_DESCRIPTION", pShortDescription);
				
			cmd.execute();


		}
		
	
	
	
}
