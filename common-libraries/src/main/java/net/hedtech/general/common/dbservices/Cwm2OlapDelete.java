package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapDelete {
		public static void deleteCube(NString pCubeOwner,NString pCubeName,NString pReport,NString pDelete) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DELETE.DELETE_CUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_REPORT", pReport);
			cmd.addParameter("@P_DELETE", pDelete);
				
			cmd.execute();


		}
		
		public static void deleteDimension(NString pDimensionOwner,NString pDimensionName,NString pDeleteCwm1Dimension,NString pReport,NString pDelete) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DELETE.DELETE_DIMENSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DELETE_CWM1_DIMENSION", pDeleteCwm1Dimension);
			cmd.addParameter("@P_REPORT", pReport);
			cmd.addParameter("@P_DELETE", pDelete);
				
			cmd.execute();


		}
		
		public static void deleteMeasureCatalog(NString pMeasureCatalogName,NString pReport,NString pDelete) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DELETE.DELETE_MEASURE_CATALOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MEASURE_CATALOG_NAME", pMeasureCatalogName);
			cmd.addParameter("@P_REPORT", pReport);
			cmd.addParameter("@P_DELETE", pDelete);
				
			cmd.execute();


		}
		
		public static void deleteOlapCatalog(NString pDeleteCwm1Dimension,NString pReport,NString pDelete) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_DELETE.DELETE_OLAP_CATALOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DELETE_CWM1_DIMENSION", pDeleteCwm1Dimension);
			cmd.addParameter("@P_REPORT", pReport);
			cmd.addParameter("@P_DELETE", pDelete);
				
			cmd.execute();


		}
		
	
	
	
}
