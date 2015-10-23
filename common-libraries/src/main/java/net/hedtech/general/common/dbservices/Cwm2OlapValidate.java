package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapValidate {
		public static void validateAllCubes(NString pTypeOfValidation,NString pVerboseReport) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_VALIDATE.VALIDATE_ALL_CUBES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TYPE_OF_VALIDATION", pTypeOfValidation);
			cmd.addParameter("@P_VERBOSE_REPORT", pVerboseReport);
				
			cmd.execute();


		}
		
		public static void validateAllDimensions(NString pTypeOfValidation,NString pVerboseReport) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_VALIDATE.VALIDATE_ALL_DIMENSIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TYPE_OF_VALIDATION", pTypeOfValidation);
			cmd.addParameter("@P_VERBOSE_REPORT", pVerboseReport);
				
			cmd.execute();


		}
		
		public static void validateCube(NString pCubeOwner,NString pCubeName,NString pTypeOfValidation,NString pVerboseReport) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_VALIDATE.VALIDATE_CUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_TYPE_OF_VALIDATION", pTypeOfValidation);
			cmd.addParameter("@P_VERBOSE_REPORT", pVerboseReport);
				
			cmd.execute();


		}
		
		public static void validateDimension(NString pDimensionOwner,NString pDimensionName,NString pTypeOfValidation,NString pVerboseReport) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_VALIDATE.VALIDATE_DIMENSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_TYPE_OF_VALIDATION", pTypeOfValidation);
			cmd.addParameter("@P_VERBOSE_REPORT", pVerboseReport);
				
			cmd.execute();


		}
		
		public static void validateOlapCatalog(NString pTypeOfValidation,NString pVerboseReport) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_VALIDATE.VALIDATE_OLAP_CATALOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TYPE_OF_VALIDATION", pTypeOfValidation);
			cmd.addParameter("@P_VERBOSE_REPORT", pVerboseReport);
				
			cmd.execute();


		}
		
	
	
	
}
