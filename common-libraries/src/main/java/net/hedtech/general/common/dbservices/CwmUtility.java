package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CwmUtility {
		public static void addArgument() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.ADD_ARGUMENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void collectGarbage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.COLLECT_GARBAGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void createFunctionUsage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.CREATE_FUNCTION_USAGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void dropFunctionUsage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.DROP_FUNCTION_USAGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void dumpError() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.DUMP_ERROR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void emptyAllMetadata() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.EMPTY_ALL_METADATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void exportAll() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.EXPORT_ALL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void exportCatalog() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.EXPORT_CATALOG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getFirstValidateError() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.GET_FIRST_VALIDATE_ERROR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getFunctionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.GET_FUNCTION_ID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getLastErrorDescription() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.GET_LAST_ERROR_DESCRIPTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getNextValidateError() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.GET_NEXT_VALIDATE_ERROR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getObjectInError() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.GET_OBJECT_IN_ERROR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.GET_VERSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void isOlapDba() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.IS_OLAP_DBA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setArgument() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.SET_ARGUMENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setObjectInError() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.SET_OBJECT_IN_ERROR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void validateCube() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.VALIDATE_CUBE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void validateDimension() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM_UTILITY.VALIDATE_DIMENSION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
