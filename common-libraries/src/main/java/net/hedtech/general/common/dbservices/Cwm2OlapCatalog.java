package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapCatalog {
		public static void addCatalogEntity(NString pCatalogName,NString pCubeOwner,NString pCubeName,NString pMeasureName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CATALOG.ADD_CATALOG_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CATALOG_NAME", pCatalogName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEASURE_NAME", pMeasureName);
				
			cmd.execute();


		}
		
		public static void createCatalog(NString pCatalogName,NString pDescription,NString pParentCatalogName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CATALOG.CREATE_CATALOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CATALOG_NAME", pCatalogName);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_PARENT_CATALOG_NAME", pParentCatalogName);
				
			cmd.execute();


		}
		
		public static void dropCatalog(NString pCatalogName,NString pSilent) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CATALOG.DROP_CATALOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CATALOG_NAME", pCatalogName);
			cmd.addParameter("@P_SILENT", pSilent);
				
			cmd.execute();


		}
		
		public static void lockCatalog(NString pCatalogName,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CATALOG.LOCK_CATALOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CATALOG_NAME", pCatalogName);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();


		}
		
		public static void removeCatalogEntity(NString pCatalogName,NString pCubeOwner,NString pCubeName,NString pMeasureName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CATALOG.REMOVE_CATALOG_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CATALOG_NAME", pCatalogName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEASURE_NAME", pMeasureName);
				
			cmd.execute();


		}
		
		public static void setCatalogName(NString pCatalogName,NString pSetCatalogName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CATALOG.SET_CATALOG_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CATALOG_NAME", pCatalogName);
			cmd.addParameter("@P_SET_CATALOG_NAME", pSetCatalogName);
				
			cmd.execute();


		}
		
		public static void setDescription(NString pCatalogName,NString pDescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CATALOG.SET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CATALOG_NAME", pCatalogName);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
				
			cmd.execute();


		}
		
		public static void setParentCatalog(NString pCatalogName,NString pParentCatalogName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CATALOG.SET_PARENT_CATALOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CATALOG_NAME", pCatalogName);
			cmd.addParameter("@P_PARENT_CATALOG_NAME", pParentCatalogName);
				
			cmd.execute();


		}
		
	
	
	
}
