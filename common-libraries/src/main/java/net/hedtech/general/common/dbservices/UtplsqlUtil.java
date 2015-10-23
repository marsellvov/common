package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class UtplsqlUtil {
		public static void executeDdl(NString stmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.EXECUTE_DDL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STMT", stmt);
				
			cmd.execute();


		}
		
//		public static NString FgetColnamesstr(List<SqldataTabRow> metadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.GET_COLNAMESSTR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getTableType("METADATA", "", metadata, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString FgetColtypeSyntax(NInteger colType,NInteger colLen) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.GET_COLTYPE_SYNTAX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COL_TYPE", colType);
			cmd.addParameter("@COL_LEN", colLen);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString FgetColtypesstr(List<SqldataTabRow> metadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.GET_COLTYPESSTR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getTableType("METADATA", "", metadata, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FgetCreateDdl(List<SqldataTabRow> metadata,NString tableName,NString ownerName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.GET_CREATE_DDL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getTableType("METADATA", "", metadata, object.class));
//			cmd.addParameter("@TABLE_NAME", tableName);
//			cmd.addParameter("@OWNER_NAME", ownerName);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static void getMetadataForCursor(NString procName,Ref<List<SqldataTabRow>> metadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.GET_METADATA_FOR_CURSOR", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PROC_NAME", procName);
//			// cmd.addParameter(DbTypes.getTableType("METADATA", "", object.class));
//				
//			cmd.execute();
//			// metadata.val = cmd.getTableParameterValue("@METADATA", object.class);
//
//
//		}
		
//		public static void getMetadataForProc(NString procName,NNumber position,Ref<NString> dataType,Ref<List<SqldataTabRow>> metadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.GET_METADATA_FOR_PROC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PROC_NAME", procName);
//			cmd.addParameter("@POSITION", position);
//			cmd.addParameter("@DATA_TYPE", NString.class);
//			// cmd.addParameter(DbTypes.getTableType("METADATA", "", object.class));
//				
//			cmd.execute();
//			dataType.val = cmd.getParameterValue("@DATA_TYPE", NString.class);
//			// metadata.val = cmd.getTableParameterValue("@METADATA", object.class);
//
//
//		}
		
//		public static void getMetadataForQuery(NString queryTxt,Ref<List<SqldataTabRow>> metadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.GET_METADATA_FOR_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@QUERY_TXT", queryTxt);
//			// cmd.addParameter(DbTypes.getTableType("METADATA", "", object.class));
//				
//			cmd.execute();
//			// metadata.val = cmd.getTableParameterValue("@METADATA", object.class);
//
//
//		}
		
//		public static void getMetadataForTable(NString tableName,Ref<List<SqldataTabRow>> metadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.GET_METADATA_FOR_TABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TABLE_NAME", tableName);
//			// cmd.addParameter(DbTypes.getTableType("METADATA", "", object.class));
//				
//			cmd.execute();
//			// metadata.val = cmd.getTableParameterValue("@METADATA", object.class);
//
//
//		}
		
		public static NString FgetProcName(NString pProcNm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.GET_PROC_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PROC_NM", pProcNm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void getTableForStr(Ref<List<V30TableRow>> pArr,NString pString,NString delim,NString encloseStr) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.GET_TABLE_FOR_STR", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_ARR", "", object.class));
//			cmd.addParameter("@P_STRING", pString);
//			cmd.addParameter("@DELIM", delim);
//			cmd.addParameter("@ENCLOSE_STR", encloseStr);
//				
//			cmd.execute();
//			// pArr.val = cmd.getTableParameterValue("@P_ARR", object.class);
//
//
//		}
		
		public static NString FgetTableName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.GET_TABLE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetValForTable(NString tableName,NString colName,Ref<NString> colVal,Ref<NNumber> colType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.GET_VAL_FOR_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COL_NAME", colName);
			cmd.addParameter("@COL_VAL", NString.class);
			cmd.addParameter("@COL_TYPE", NNumber.class);
				
			cmd.execute();
			colVal.val = cmd.getParameterValue("@COL_VAL", NString.class);
			colType.val = cmd.getParameterValue("@COL_TYPE", NNumber.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.GET_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FprepareAndFetchRc(NString procName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.PREPARE_AND_FETCH_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PROC_NAME", procName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString FprepareAndFetchRc(NString procName,List<UtplsqlParamsRow> _params,NInteger refcPosInProc,NInteger refcMetadataFrom,NString refcMetadataStr) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.PREPARE_AND_FETCH_RC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@PROC_NAME", procName);
//			// cmd.addParameter(DbTypes.getTableType("PARAMS", "", _params, object.class));
//			cmd.addParameter("@REFC_POS_IN_PROC", refcPosInProc);
//			cmd.addParameter("@REFC_METADATA_FROM", refcMetadataFrom);
//			cmd.addParameter("@REFC_METADATA_STR", refcMetadataStr);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static void prepareCursor1(Ref<NString> stmt,NString tableName,NString callProcName,List<SqldataTabRow> metadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.PREPARE_CURSOR_1", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@STMT", stmt, true);
//			cmd.addParameter("@TABLE_NAME", tableName);
//			cmd.addParameter("@CALL_PROC_NAME", callProcName);
//			// cmd.addParameter(DbTypes.getTableType("METADATA", "", metadata, object.class));
//				
//			cmd.execute();
//			stmt.val = cmd.getParameterValue("@STMT", NString.class);
//
//
//		}
		
		public static void print(NString str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.PRINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STR", str);
				
			cmd.execute();


		}
		
//		public static void printMetadata(List<SqldataTabRow> metadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.PRINT_METADATA", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("METADATA", "", metadata, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void regInArray(NInteger parPos,NString arrayName,List<VarcharArrayRow> arrayVals,Ref<List<UtplsqlParamsRow>> _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.REG_IN_ARRAY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PAR_POS", parPos);
//			cmd.addParameter("@ARRAY_NAME", arrayName);
//			// cmd.addParameter(DbTypes.getTableType("ARRAY_VALS", "", arrayVals, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PARAMS", "", _params.val, object.class , true));
//				
//			cmd.execute();
//			// _params.val = cmd.getTableParameterValue("@PARAMS", object.class);
//
//
//		}
		
//		public static void regInParam(NInteger parPos,NString parVal,Ref<List<UtplsqlParamsRow>> _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.REG_IN_PARAM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PAR_POS", parPos);
//			cmd.addParameter("@PAR_VAL", parVal);
//			// cmd.addParameter(DbTypes.getTableType("PARAMS", "", _params.val, object.class , true));
//				
//			cmd.execute();
//			// _params.val = cmd.getTableParameterValue("@PARAMS", object.class);
//
//
//		}
		
//		public static void regInParam(NInteger parPos,NNumber parVal,Ref<List<UtplsqlParamsRow>> _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.REG_IN_PARAM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PAR_POS", parPos);
//			cmd.addParameter("@PAR_VAL", parVal);
//			// cmd.addParameter(DbTypes.getTableType("PARAMS", "", _params.val, object.class , true));
//				
//			cmd.execute();
//			// _params.val = cmd.getTableParameterValue("@PARAMS", object.class);
//
//
//		}
		
//		public static void regInParam(NInteger parPos,NDate parVal,Ref<List<UtplsqlParamsRow>> _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.REG_IN_PARAM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PAR_POS", parPos);
//			cmd.addParameter("@PAR_VAL", parVal);
//			// cmd.addParameter(DbTypes.getTableType("PARAMS", "", _params.val, object.class , true));
//				
//			cmd.execute();
//			// _params.val = cmd.getTableParameterValue("@PARAMS", object.class);
//
//
//		}
		
//		public static void regInoutParam(NInteger parPos,NString parVal,Ref<List<UtplsqlParamsRow>> _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.REG_INOUT_PARAM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PAR_POS", parPos);
//			cmd.addParameter("@PAR_VAL", parVal);
//			// cmd.addParameter(DbTypes.getTableType("PARAMS", "", _params.val, object.class , true));
//				
//			cmd.execute();
//			// _params.val = cmd.getTableParameterValue("@PARAMS", object.class);
//
//
//		}
		
//		public static void regInoutParam(NInteger parPos,NNumber parVal,Ref<List<UtplsqlParamsRow>> _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.REG_INOUT_PARAM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PAR_POS", parPos);
//			cmd.addParameter("@PAR_VAL", parVal);
//			// cmd.addParameter(DbTypes.getTableType("PARAMS", "", _params.val, object.class , true));
//				
//			cmd.execute();
//			// _params.val = cmd.getTableParameterValue("@PARAMS", object.class);
//
//
//		}
		
//		public static void regInoutParam(NInteger parPos,NDate parVal,Ref<List<UtplsqlParamsRow>> _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.REG_INOUT_PARAM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PAR_POS", parPos);
//			cmd.addParameter("@PAR_VAL", parVal);
//			// cmd.addParameter(DbTypes.getTableType("PARAMS", "", _params.val, object.class , true));
//				
//			cmd.execute();
//			// _params.val = cmd.getTableParameterValue("@PARAMS", object.class);
//
//
//		}
		
//		public static void regOutParam(NInteger parPos,NString parType,Ref<List<UtplsqlParamsRow>> _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.REG_OUT_PARAM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PAR_POS", parPos);
//			cmd.addParameter("@PAR_TYPE", parType);
//			// cmd.addParameter(DbTypes.getTableType("PARAMS", "", _params.val, object.class , true));
//				
//			cmd.execute();
//			// _params.val = cmd.getTableParameterValue("@PARAMS", object.class);
//
//
//		}
		
		public static void testGetMetadataForCursor(NString procName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTPLSQL_UTIL.TEST_GET_METADATA_FOR_CURSOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROC_NAME", procName);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ParamsRecRow", dataSourceName="PARAMS_REC")
	public static class ParamsRecRow
	{
		@DbRecordField(dataSourceName="PAR_NAME")
		public NString ParName;
		@DbRecordField(dataSourceName="PAR_TYPE")
		public NString ParType;
		@DbRecordField(dataSourceName="PAR_SQL_TYPE")
		public NString ParSqlType;
		@DbRecordField(dataSourceName="PAR_INOUT")
		public NInteger ParInout;
		@DbRecordField(dataSourceName="PAR_POS")
		public NInteger ParPos;
		@DbRecordField(dataSourceName="PAR_VAL")
		public NString ParVal;
	}

	
	@DbRecordType(id="SqldataRow", dataSourceName="SQLDATA")
	public static class SqldataRow
	{
		@DbRecordField(dataSourceName="COL_NAME")
		public NString ColName;
		@DbRecordField(dataSourceName="COL_TYPE")
		public NInteger ColType;
		@DbRecordField(dataSourceName="COL_LEN")
		public NInteger ColLen;
	}

	
	
}
