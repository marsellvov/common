package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapOlapapiEnable {
		public static void awCubeCreateAccess(NString pCubeOwner,NString pCubeName,NString pAwOwner,NString pAwName,NString pPrefix,NString pAccessType,NString pScriptDirectory,NString pScriptName,NString pOpenmode,NString pCaller,NString pSpreadsheetmode,NString pAutoadtmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_OLAPAPI_ENABLE.AW_CUBE_CREATE_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_PREFIX", pPrefix);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SCRIPT_DIRECTORY", pScriptDirectory);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
			cmd.addParameter("@P_OPENMODE", pOpenmode);
			cmd.addParameter("@P_CALLER", pCaller);
			cmd.addParameter("@P_SPREADSHEETMODE", pSpreadsheetmode);
			cmd.addParameter("@P_AUTOADTMODE", pAutoadtmode);
				
			cmd.execute();


		}
		
		public static void awCubeCreateAccess(NNumber pRunid,NString pCubeOwner,NString pCubeName,NString pAwOwner,NString pAwName,NString pPrefix,NString pAccessType,NString pSpreadsheetmode,NString pAutoadtmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_OLAPAPI_ENABLE.AW_CUBE_CREATE_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUNID", pRunid);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_PREFIX", pPrefix);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SPREADSHEETMODE", pSpreadsheetmode);
			cmd.addParameter("@P_AUTOADTMODE", pAutoadtmode);
				
			cmd.execute();


		}
		
		public static void awCubeDropAccess(NString pTargetCubeName,NString pAwOwner,NString pAwName,NString pAccessType,NString pScriptDirectory,NString pScriptName,NString pOpenmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_OLAPAPI_ENABLE.AW_CUBE_DROP_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_CUBE_NAME", pTargetCubeName);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SCRIPT_DIRECTORY", pScriptDirectory);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
			cmd.addParameter("@P_OPENMODE", pOpenmode);
				
			cmd.execute();


		}
		
		public static void awCubeDropAccess(NNumber pRunid,NString pTargetCubeName,NString pAwOwner,NString pAwName,NString pAccessType,NString pCaller) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_OLAPAPI_ENABLE.AW_CUBE_DROP_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUNID", pRunid);
			cmd.addParameter("@P_TARGET_CUBE_NAME", pTargetCubeName);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_CALLER", pCaller);
				
			cmd.execute();


		}
		
		public static void awDimensionCreateAccess(NString pDimensionOwner,NString pDimensionName,NString pAwOwner,NString pAwName,NString pPrefix,NString pAccessType,NString pScriptDirectory,NString pScriptName,NString pOpenmode,NString pCaller,NString pSpreadsheetmode,NString pAutoadtmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_OLAPAPI_ENABLE.AW_DIMENSION_CREATE_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_PREFIX", pPrefix);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SCRIPT_DIRECTORY", pScriptDirectory);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
			cmd.addParameter("@P_OPENMODE", pOpenmode);
			cmd.addParameter("@P_CALLER", pCaller);
			cmd.addParameter("@P_SPREADSHEETMODE", pSpreadsheetmode);
			cmd.addParameter("@P_AUTOADTMODE", pAutoadtmode);
				
			cmd.execute();


		}
		
		public static void awDimensionCreateAccess(NNumber pRunid,NString pDimensionOwner,NString pDimensionName,NString pAwOwner,NString pAwName,NString pPrefix,NString pAccessType,NString pSpreadsheetmode,NString pAutoadtmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_OLAPAPI_ENABLE.AW_DIMENSION_CREATE_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUNID", pRunid);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_PREFIX", pPrefix);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SPREADSHEETMODE", pSpreadsheetmode);
			cmd.addParameter("@P_AUTOADTMODE", pAutoadtmode);
				
			cmd.execute();


		}
		
		public static void awDimensionDropAccess(NString pTargetDimName,NString pAwOwner,NString pAwName,NString pAccessType,NString pScriptDirectory,NString pScriptName,NString pOpenmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_OLAPAPI_ENABLE.AW_DIMENSION_DROP_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TARGET_DIM_NAME", pTargetDimName);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SCRIPT_DIRECTORY", pScriptDirectory);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
			cmd.addParameter("@P_OPENMODE", pOpenmode);
				
			cmd.execute();


		}
		
		public static void awDimensionDropAccess(NNumber pRunid,NString pTargetDimName,NString pAwOwner,NString pAwName,NString pAccessType,NString pCaller) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_OLAPAPI_ENABLE.AW_DIMENSION_DROP_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUNID", pRunid);
			cmd.addParameter("@P_TARGET_DIM_NAME", pTargetDimName);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_CALLER", pCaller);
				
			cmd.execute();


		}
		
		public static void updateEnabledCubeView(NString pAwowner,NString pAwname,NString pCubename,NNumber pHiercombonum,NString pUserviewname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_OLAPAPI_ENABLE.UPDATE_ENABLED_CUBE_VIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWOWNER", pAwowner);
			cmd.addParameter("@P_AWNAME", pAwname);
			cmd.addParameter("@P_CUBENAME", pCubename);
			cmd.addParameter("@P_HIERCOMBONUM", pHiercombonum);
			cmd.addParameter("@P_USERVIEWNAME", pUserviewname);
				
			cmd.execute();


		}
		
		public static void updateEnabledDimView(NString pAwowner,NString pAwname,NString pDimname,NString pHiername,NString pUserviewname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_OLAPAPI_ENABLE.UPDATE_ENABLED_DIM_VIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWOWNER", pAwowner);
			cmd.addParameter("@P_AWNAME", pAwname);
			cmd.addParameter("@P_DIMNAME", pDimname);
			cmd.addParameter("@P_HIERNAME", pHiername);
			cmd.addParameter("@P_USERVIEWNAME", pUserviewname);
				
			cmd.execute();


		}
		
	
	
	
}
