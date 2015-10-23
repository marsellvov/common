package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapDimension {
		public static void createDimension(NString pDimensionOwner,NString pDimensionName,NString pDisplayName,NString pPluralName,NString pShortDescription,NString pDescription,NString pDimensionType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION.CREATE_DIMENSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DISPLAY_NAME", pDisplayName);
			cmd.addParameter("@P_PLURAL_NAME", pPluralName);
			cmd.addParameter("@P_SHORT_DESCRIPTION", pShortDescription);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_DIMENSION_TYPE", pDimensionType);
				
			cmd.execute();


		}
		
		public static void dropDimension(NString pDimensionOwner,NString pDimensionName,NString pSilent) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION.DROP_DIMENSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_SILENT", pSilent);
				
			cmd.execute();


		}
		
		public static void lockDimension(NString pDimensionOwner,NString pDimensionName,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION.LOCK_DIMENSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();


		}
		
		public static void setDefaultDisplayHierarchy(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION.SET_DEFAULT_DISPLAY_HIERARCHY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
				
			cmd.execute();


		}
		
		public static void setDescription(NString pDimensionOwner,NString pDimensionName,NString pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION.SET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
				
			cmd.execute();


		}
		
		public static void setDimensionName(NString pDimensionOwner,NString pDimensionName,NString pSetDimensionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION.SET_DIMENSION_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_SET_DIMENSION_NAME", pSetDimensionName);
				
			cmd.execute();


		}
		
		public static void setDisplayName(NString pDimensionOwner,NString pDimensionName,NString pDisplayName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION.SET_DISPLAY_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DISPLAY_NAME", pDisplayName);
				
			cmd.execute();


		}
		
		public static void setPluralName(NString pDimensionOwner,NString pDimensionName,NString pPluralName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION.SET_PLURAL_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_PLURAL_NAME", pPluralName);
				
			cmd.execute();


		}
		
		public static void setShortDescription(NString pDimensionOwner,NString pDimensionName,NString pShortDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DIMENSION.SET_SHORT_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_SHORT_DESCRIPTION", pShortDescription);
				
			cmd.execute();


		}
		
	
	
	
}
