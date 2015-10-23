package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapExport {
		public static void exportCube(NString pCubeOwner,NString pCubeName,NString pDirectoryName,NString pCommandFileName,NString pTableFileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_EXPORT.EXPORT_CUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_DIRECTORY_NAME", pDirectoryName);
			cmd.addParameter("@P_COMMAND_FILE_NAME", pCommandFileName);
			cmd.addParameter("@P_TABLE_FILE_NAME", pTableFileName);
				
			cmd.execute();


		}
		
		public static void exportDimension(NString pDimensionOwner,NString pDimensionName,NString pDirectoryName,NString pCommandFileName,NString pTableFileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_EXPORT.EXPORT_DIMENSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIRECTORY_NAME", pDirectoryName);
			cmd.addParameter("@P_COMMAND_FILE_NAME", pCommandFileName);
			cmd.addParameter("@P_TABLE_FILE_NAME", pTableFileName);
				
			cmd.execute();


		}
		
		public static void exportOlapCatalog(NString pDirectoryName,NString pCommandFileName,NString pTableFileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_EXPORT.EXPORT_OLAP_CATALOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIRECTORY_NAME", pDirectoryName);
			cmd.addParameter("@P_COMMAND_FILE_NAME", pCommandFileName);
			cmd.addParameter("@P_TABLE_FILE_NAME", pTableFileName);
				
			cmd.execute();


		}
		
	
	
	
}
