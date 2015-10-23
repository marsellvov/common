package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Papi {
		public static NString fOwnerIsValid(NString pOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PAPI.F_OWNER_IS_VALID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OWNER", pOwner);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void testcases() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PAPI.TESTCASES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void testcases2(NString freeformTableName,NString listedTableName,NString apiRelease,NString insertMode,NString insertDuplicate,NString insertWithEmptyFields,NString insertWithLargeValues,NString insertWithInvalidValues,NString updateWithEmptyKeys,NString updateWithInvalidKeys,NString deleteWhileChildrenExist,NString deleteWithEmptyKeys,NString deleteWithInvalidKeys,NString showApiErrors) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PAPI.TESTCASES2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FREEFORM_TABLE_NAME", freeformTableName);
			cmd.addParameter("@LISTED_TABLE_NAME", listedTableName);
			cmd.addParameter("@API_RELEASE", apiRelease);
			cmd.addParameter("@INSERT_MODE", insertMode);
			cmd.addParameter("@INSERT_DUPLICATE", insertDuplicate);
			cmd.addParameter("@INSERT_WITH_EMPTY_FIELDS", insertWithEmptyFields);
			cmd.addParameter("@INSERT_WITH_LARGE_VALUES", insertWithLargeValues);
			cmd.addParameter("@INSERT_WITH_INVALID_VALUES", insertWithInvalidValues);
			cmd.addParameter("@UPDATE_WITH_EMPTY_KEYS", updateWithEmptyKeys);
			cmd.addParameter("@UPDATE_WITH_INVALID_KEYS", updateWithInvalidKeys);
			cmd.addParameter("@DELETE_WHILE_CHILDREN_EXIST", deleteWhileChildrenExist);
			cmd.addParameter("@DELETE_WITH_EMPTY_KEYS", deleteWithEmptyKeys);
			cmd.addParameter("@DELETE_WITH_INVALID_KEYS", deleteWithInvalidKeys);
			cmd.addParameter("@SHOW_API_ERRORS", showApiErrors);
				
			cmd.execute();


		}
		
//		public static void testcases3(NString tableName,NString apiRelease,List<OwaUtil.IdentArrRow> indexColumn,List<OwaUtil.IdentArrRow> indexValue,NString insertMode,NString insertDuplicate,NString insertWithEmptyFields,NString insertWithLargeValues,NString insertWithInvalidValues,NString updateWithEmptyKeys,NString updateWithInvalidKeys,NString deleteWhileChildrenExist,NString deleteWithEmptyKeys,NString deleteWithInvalidKeys,NString showApiErrors) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PAPI.TESTCASES3", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TABLE_NAME", tableName);
//			cmd.addParameter("@API_RELEASE", apiRelease);
//			// cmd.addParameter(DbTypes.getTableType("INDEX_COLUMN", "", indexColumn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("INDEX_VALUE", "", indexValue, object.class));
//			cmd.addParameter("@INSERT_MODE", insertMode);
//			cmd.addParameter("@INSERT_DUPLICATE", insertDuplicate);
//			cmd.addParameter("@INSERT_WITH_EMPTY_FIELDS", insertWithEmptyFields);
//			cmd.addParameter("@INSERT_WITH_LARGE_VALUES", insertWithLargeValues);
//			cmd.addParameter("@INSERT_WITH_INVALID_VALUES", insertWithInvalidValues);
//			cmd.addParameter("@UPDATE_WITH_EMPTY_KEYS", updateWithEmptyKeys);
//			cmd.addParameter("@UPDATE_WITH_INVALID_KEYS", updateWithInvalidKeys);
//			cmd.addParameter("@DELETE_WHILE_CHILDREN_EXIST", deleteWhileChildrenExist);
//			cmd.addParameter("@DELETE_WITH_EMPTY_KEYS", deleteWithEmptyKeys);
//			cmd.addParameter("@DELETE_WITH_INVALID_KEYS", deleteWithInvalidKeys);
//			cmd.addParameter("@SHOW_API_ERRORS", showApiErrors);
//				
//			cmd.execute();
//
//
//		}
		
		public static void testcases4(NString tableName,NString apiRelease,NString insertMode,NString insertDuplicate,NString insertWithEmptyFields,NString insertWithLargeValues,NString insertWithInvalidValues,NString updateWithEmptyKeys,NString updateWithInvalidKeys,NString deleteWhileChildrenExist,NString deleteWithEmptyKeys,NString deleteWithInvalidKeys,NString showApiErrors) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PAPI.TESTCASES4", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@API_RELEASE", apiRelease);
			cmd.addParameter("@INSERT_MODE", insertMode);
			cmd.addParameter("@INSERT_DUPLICATE", insertDuplicate);
			cmd.addParameter("@INSERT_WITH_EMPTY_FIELDS", insertWithEmptyFields);
			cmd.addParameter("@INSERT_WITH_LARGE_VALUES", insertWithLargeValues);
			cmd.addParameter("@INSERT_WITH_INVALID_VALUES", insertWithInvalidValues);
			cmd.addParameter("@UPDATE_WITH_EMPTY_KEYS", updateWithEmptyKeys);
			cmd.addParameter("@UPDATE_WITH_INVALID_KEYS", updateWithInvalidKeys);
			cmd.addParameter("@DELETE_WHILE_CHILDREN_EXIST", deleteWhileChildrenExist);
			cmd.addParameter("@DELETE_WITH_EMPTY_KEYS", deleteWithEmptyKeys);
			cmd.addParameter("@DELETE_WITH_INVALID_KEYS", deleteWithInvalidKeys);
			cmd.addParameter("@SHOW_API_ERRORS", showApiErrors);
				
			cmd.execute();


		}
		
		public static void testcases5(NString mySql,NString apiRelease,NString insertMode,NString insertDuplicate,NString insertWithEmptyFields,NString insertWithLargeValues,NString insertWithInvalidValues,NString updateWithEmptyKeys,NString updateWithInvalidKeys,NString deleteWhileChildrenExist,NString deleteWithEmptyKeys,NString deleteWithInvalidKeys,NString showApiErrors) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PAPI.TESTCASES5", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MY_SQL", mySql);
			cmd.addParameter("@API_RELEASE", apiRelease);
			cmd.addParameter("@INSERT_MODE", insertMode);
			cmd.addParameter("@INSERT_DUPLICATE", insertDuplicate);
			cmd.addParameter("@INSERT_WITH_EMPTY_FIELDS", insertWithEmptyFields);
			cmd.addParameter("@INSERT_WITH_LARGE_VALUES", insertWithLargeValues);
			cmd.addParameter("@INSERT_WITH_INVALID_VALUES", insertWithInvalidValues);
			cmd.addParameter("@UPDATE_WITH_EMPTY_KEYS", updateWithEmptyKeys);
			cmd.addParameter("@UPDATE_WITH_INVALID_KEYS", updateWithInvalidKeys);
			cmd.addParameter("@DELETE_WHILE_CHILDREN_EXIST", deleteWhileChildrenExist);
			cmd.addParameter("@DELETE_WITH_EMPTY_KEYS", deleteWithEmptyKeys);
			cmd.addParameter("@DELETE_WITH_INVALID_KEYS", deleteWithInvalidKeys);
			cmd.addParameter("@SHOW_API_ERRORS", showApiErrors);
				
			cmd.execute();


		}
		
		public static void testcasesfaq() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PAPI.TESTCASESFAQ", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
