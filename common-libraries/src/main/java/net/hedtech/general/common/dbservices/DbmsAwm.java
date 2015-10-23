package net.hedtech.general.common.dbservices;

import java.util.*;

import oracle.sql.TIMESTAMP;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsAwm {
		public static void addAwcompSpecCompMember(NString pAwcompSpecName,NString pCubeOwner,NString pCubeName,NString pMemberName,NString pNestedMemberName,NString pNestedMemberType,NString pDimensionOwner,NString pDimensionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.ADD_AWCOMP_SPEC_COMP_MEMBER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCOMP_SPEC_NAME", pAwcompSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEMBER_NAME", pMemberName);
			cmd.addParameter("@P_NESTED_MEMBER_NAME", pNestedMemberName);
			cmd.addParameter("@P_NESTED_MEMBER_TYPE", pNestedMemberType);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
				
			cmd.execute();


		}
		
		public static void addAwcompSpecMember(NString pAwcompSpecName,NString pCubeOwner,NString pCubeName,NString pMemberName,NString pMemberType,NString pDimensionOwner,NString pDimensionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.ADD_AWCOMP_SPEC_MEMBER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCOMP_SPEC_NAME", pAwcompSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEMBER_NAME", pMemberName);
			cmd.addParameter("@P_MEMBER_TYPE", pMemberType);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
				
			cmd.execute();


		}
		
		public static void addAwcubeaggSpecLevel(NString pAwcubeaggSpecName,NString pCubeOwner,NString pAwName,NString pCubeName,NString pDimensionName,NString pLevelName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.ADD_AWCUBEAGG_SPEC_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
				
			cmd.execute();


		}
		
		public static void addAwcubeaggSpecMeasure(NString pAwcubeaggSpecName,NString pCubeOwner,NString pAwName,NString pCubeName,NString pMeasureName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.ADD_AWCUBEAGG_SPEC_MEASURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEASURE_NAME", pMeasureName);
				
			cmd.execute();


		}
		
		public static void addAwcubeloadSpecComp(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName,NString pAwcompSpecName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.ADD_AWCUBELOAD_SPEC_COMP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_AWCOMP_SPEC_NAME", pAwcompSpecName);
				
			cmd.execute();


		}
		
		public static void addAwcubeloadSpecFilter(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName,NString pFactTableOwner,NString pFactTableName,NString pWhereClause) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.ADD_AWCUBELOAD_SPEC_FILTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_FACT_TABLE_OWNER", pFactTableOwner);
			cmd.addParameter("@P_FACT_TABLE_NAME", pFactTableName);
			cmd.addParameter("@P_WHERE_CLAUSE", pWhereClause);
				
			cmd.execute();


		}
		
		public static void addAwcubeloadSpecMeasure(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName,NString pMeasureName,NString pTargetname,NString pTargetdisplayname,NString pTargetdescription) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.ADD_AWCUBELOAD_SPEC_MEASURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEASURE_NAME", pMeasureName);
			cmd.addParameter("@P_TARGETNAME", pTargetname);
			cmd.addParameter("@P_TARGETDISPLAYNAME", pTargetdisplayname);
			cmd.addParameter("@P_TARGETDESCRIPTION", pTargetdescription);
				
			cmd.execute();


		}
		
		public static void addAwdimloadSpecFilter(NString pAwdimloadSpecName,NString pDimensionOwner,NString pDimensionName,NString pLookupTableOwner,NString pLookupTableName,NString pWhereClause) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.ADD_AWDIMLOAD_SPEC_FILTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWDIMLOAD_SPEC_NAME", pAwdimloadSpecName);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LOOKUP_TABLE_OWNER", pLookupTableOwner);
			cmd.addParameter("@P_LOOKUP_TABLE_NAME", pLookupTableName);
			cmd.addParameter("@P_WHERE_CLAUSE", pWhereClause);
				
			cmd.execute();


		}
		
		public static void addMvcubeaggSpecLevel(NString pAwcubeaggSpecName,NString pCubeOwner,NString pCubeName,NString pDimensionOwner,NString pDimensionName,NString pLevelName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.ADD_MVCUBEAGG_SPEC_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
				
			cmd.execute();


		}
		
		public static void addMvcubeaggSpecMeasure(NString pAwcubeaggSpecName,NString pCubeOwner,NString pCubeName,NString pMeasureName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.ADD_MVCUBEAGG_SPEC_MEASURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEASURE_NAME", pMeasureName);
				
			cmd.execute();


		}
		
		public static void addMvcubeloadSpecAgg(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName,NString pAwcubeaggSpecName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.ADD_MVCUBELOAD_SPEC_AGG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
				
			cmd.execute();


		}
		
		public static void aggregateAwcube(NString pAwOwner,NString pAwName,NString pTargetCubeName,NString pAwcubeaggSpecName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.AGGREGATE_AWCUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_CUBE_NAME", pTargetCubeName);
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
				
			cmd.execute();


		}
		
		public static void createAwcompSpec(NString pAwcompSpecName,NString pCubeOwner,NString pCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_AWCOMP_SPEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCOMP_SPEC_NAME", pAwcompSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
				
			cmd.execute();


		}
		
		public static void createAwcube(NString pSourceCubeOwner,NString pSourceCubeName,NString pAwOwner,NString pAwName,NString pTargetCubeName,NString pSkipchecks) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_AWCUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SOURCE_CUBE_OWNER", pSourceCubeOwner);
			cmd.addParameter("@P_SOURCE_CUBE_NAME", pSourceCubeName);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_CUBE_NAME", pTargetCubeName);
			cmd.addParameter("@P_SKIPCHECKS", pSkipchecks);
				
			cmd.execute();


		}
		
		public static void createAwcubeAccess(NString pAwOwner,NString pAwName,NString pTargetCubeName,NString pAccessType,NString pScriptDirectory,NString pScriptName,NString pOpenmode,NString pCaller,NString pSpreadsheetmode,NString pAutoadtmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_AWCUBE_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_CUBE_NAME", pTargetCubeName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SCRIPT_DIRECTORY", pScriptDirectory);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
			cmd.addParameter("@P_OPENMODE", pOpenmode);
			cmd.addParameter("@P_CALLER", pCaller);
			cmd.addParameter("@P_SPREADSHEETMODE", pSpreadsheetmode);
			cmd.addParameter("@P_AUTOADTMODE", pAutoadtmode);
				
			cmd.execute();


		}
		
		public static void createAwcubeAccess(NNumber pRunid,NString pAwOwner,NString pAwName,NString pTargetCubeName,NString pAccessType,NString pSpreadsheetmode,NString pAutoadtmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_AWCUBE_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUNID", pRunid);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_CUBE_NAME", pTargetCubeName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SPREADSHEETMODE", pSpreadsheetmode);
			cmd.addParameter("@P_AUTOADTMODE", pAutoadtmode);
				
			cmd.execute();


		}
		
		public static void createAwcubeAccessFull(NNumber pRunid,NString pAwOwner,NString pAwName,NString pTargetCubeName,NString pAccessType,NString pSpreadsheetmode,NString pAutoadtmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_AWCUBE_ACCESS_FULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUNID", pRunid);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_CUBE_NAME", pTargetCubeName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SPREADSHEETMODE", pSpreadsheetmode);
			cmd.addParameter("@P_AUTOADTMODE", pAutoadtmode);
				
			cmd.execute();


		}
		
		public static void createAwcubeaggSpec(NString pAwcubeaggSpecName,NString pCubeOwner,NString pAwName,NString pCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_AWCUBEAGG_SPEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
				
			cmd.execute();


		}
		
		public static void createAwcubeloadSpec(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName,NString pLoadtypeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_AWCUBELOAD_SPEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_LOADTYPE_NAME", pLoadtypeName);
				
			cmd.execute();


		}
		
		public static void createAwdimension(NString pSourceDimensionOwner,NString pSourceDimensionName,NString pAwOwner,NString pAwName,NString pTargetDimensionName,NString pSkipchecks) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_AWDIMENSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SOURCE_DIMENSION_OWNER", pSourceDimensionOwner);
			cmd.addParameter("@P_SOURCE_DIMENSION_NAME", pSourceDimensionName);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_DIMENSION_NAME", pTargetDimensionName);
			cmd.addParameter("@P_SKIPCHECKS", pSkipchecks);
				
			cmd.execute();


		}
		
		public static void createAwdimensionAccess(NString pAwOwner,NString pAwName,NString pTargetDimensionName,NString pAccessType,NString pScriptDirectory,NString pScriptName,NString pOpenmode,NString pCaller,NString pSpreadsheetmode,NString pAutoadtmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_AWDIMENSION_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_DIMENSION_NAME", pTargetDimensionName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SCRIPT_DIRECTORY", pScriptDirectory);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
			cmd.addParameter("@P_OPENMODE", pOpenmode);
			cmd.addParameter("@P_CALLER", pCaller);
			cmd.addParameter("@P_SPREADSHEETMODE", pSpreadsheetmode);
			cmd.addParameter("@P_AUTOADTMODE", pAutoadtmode);
				
			cmd.execute();


		}
		
		public static void createAwdimensionAccess(NNumber pRunid,NString pAwOwner,NString pAwName,NString pTargetDimensionName,NString pAccessType,NString pSpreadsheetmode,NString pAutoadtmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_AWDIMENSION_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUNID", pRunid);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_DIMENSION_NAME", pTargetDimensionName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SPREADSHEETMODE", pSpreadsheetmode);
			cmd.addParameter("@P_AUTOADTMODE", pAutoadtmode);
				
			cmd.execute();


		}
		
		public static void createAwdimensionAccessFull(NNumber pRunid,NString pAwOwner,NString pAwName,NString pTargetDimensionName,NString pAccessType,NString pSpreadsheetmode,NString pAutoadtmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_AWDIMENSION_ACCESS_FULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUNID", pRunid);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_DIMENSION_NAME", pTargetDimensionName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SPREADSHEETMODE", pSpreadsheetmode);
			cmd.addParameter("@P_AUTOADTMODE", pAutoadtmode);
				
			cmd.execute();


		}
		
		public static void createAwdimloadSpec(NString pAwdimloadSpecName,NString pDimensionOwner,NString pDimensionName,NString pLoadtypeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_AWDIMLOAD_SPEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWDIMLOAD_SPEC_NAME", pAwdimloadSpecName);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LOADTYPE_NAME", pLoadtypeName);
				
			cmd.execute();


		}
		
		public static void createDynamicAwAccess(NString pAwOwner,NString pAwName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_DYNAMIC_AW_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
				
			cmd.execute();


		}
		
		public static void createMvcubeaggSpec(NString pAwcubeaggSpecName,NString pCubeOwner,NString pCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_MVCUBEAGG_SPEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
				
			cmd.execute();


		}
		
		public static void createScheduleJob(NString pJobname,NString pJobaction,NNumber pNumberofargs,TIMESTAMP pStarttime,NString pComments) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.CREATE_SCHEDULE_JOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOBNAME", pJobname);
			cmd.addParameter("@P_JOBACTION", pJobaction);
			cmd.addParameter("@P_NUMBEROFARGS", pNumberofargs);
			cmd.addParameter("@P_STARTTIME", pStarttime);
			cmd.addParameter("@P_COMMENTS", pComments);
				
			cmd.execute();


		}
		
		public static void deleteAllAwAccess(NNumber pRunid,NString pAwowner,NString pAwname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_ALL_AW_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUNID", pRunid);
			cmd.addParameter("@P_AWOWNER", pAwowner);
			cmd.addParameter("@P_AWNAME", pAwname);
				
			cmd.execute();


		}
		
		public static void deleteAwcompSpec(NString pAwcompSpecName,NString pCubeOwner,NString pCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWCOMP_SPEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCOMP_SPEC_NAME", pAwcompSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
				
			cmd.execute();


		}
		
		public static void deleteAwcompSpecMember(NString pAwcompSpecName,NString pCubeOwner,NString pCubeName,NString pMemberName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWCOMP_SPEC_MEMBER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCOMP_SPEC_NAME", pAwcompSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEMBER_NAME", pMemberName);
				
			cmd.execute();


		}
		
		public static void deleteAwcubeAccess(NString pAwOwner,NString pAwName,NString pTargetCubeName,NString pAccessType,NString pScriptDirectory,NString pScriptName,NString pOpenmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWCUBE_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_CUBE_NAME", pTargetCubeName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SCRIPT_DIRECTORY", pScriptDirectory);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
			cmd.addParameter("@P_OPENMODE", pOpenmode);
				
			cmd.execute();


		}
		
		public static void deleteAwcubeAccess(NNumber pRunid,NString pAwOwner,NString pAwName,NString pTargetCubeName,NString pAccessType,NString pCaller) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWCUBE_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUNID", pRunid);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_CUBE_NAME", pTargetCubeName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_CALLER", pCaller);
				
			cmd.execute();


		}
		
		public static void deleteAwcubeAccessAll(NNumber pRunid,NString pAwOwner,NString pAwName,NString pTargetCubeName,NString pAccessType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWCUBE_ACCESS_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUNID", pRunid);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_CUBE_NAME", pTargetCubeName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
				
			cmd.execute();


		}
		
		public static void deleteAwcubeaggSpec(NString pAwcubeaggSpecName,NString pCubeOwner,NString pAwName,NString pCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWCUBEAGG_SPEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
				
			cmd.execute();


		}
		
		public static void deleteAwcubeaggSpecLevel(NString pAwcubeaggSpecName,NString pCubeOwner,NString pAwName,NString pCubeName,NString pDimensionName,NString pLevelName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWCUBEAGG_SPEC_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
				
			cmd.execute();


		}
		
		public static void deleteAwcubeaggSpecMeasure(NString pAwcubeaggSpecName,NString pCubeOwner,NString pAwName,NString pCubeName,NString pMeasureName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWCUBEAGG_SPEC_MEASURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEASURE_NAME", pMeasureName);
				
			cmd.execute();


		}
		
		public static void deleteAwcubeloadSpec(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWCUBELOAD_SPEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
				
			cmd.execute();


		}
		
		public static void deleteAwcubeloadSpecComp(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName,NString pAwcompSpecName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWCUBELOAD_SPEC_COMP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_AWCOMP_SPEC_NAME", pAwcompSpecName);
				
			cmd.execute();


		}
		
		public static void deleteAwcubeloadSpecFilter(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName,NString pFactTableOwner,NString pFactTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWCUBELOAD_SPEC_FILTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_FACT_TABLE_OWNER", pFactTableOwner);
			cmd.addParameter("@P_FACT_TABLE_NAME", pFactTableName);
				
			cmd.execute();


		}
		
		public static void deleteAwcubeloadSpecMeasure(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName,NString pMeasureName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWCUBELOAD_SPEC_MEASURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEASURE_NAME", pMeasureName);
				
			cmd.execute();


		}
		
		public static void deleteAwdimensionAccess(NString pAwOwner,NString pAwName,NString pTargetDimensionName,NString pAccessType,NString pScriptDirectory,NString pScriptName,NString pOpenmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWDIMENSION_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_DIMENSION_NAME", pTargetDimensionName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_SCRIPT_DIRECTORY", pScriptDirectory);
			cmd.addParameter("@P_SCRIPT_NAME", pScriptName);
			cmd.addParameter("@P_OPENMODE", pOpenmode);
				
			cmd.execute();


		}
		
		public static void deleteAwdimensionAccess(NNumber pRunid,NString pAwOwner,NString pAwName,NString pTargetDimName,NString pAccessType,NString pCaller) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWDIMENSION_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUNID", pRunid);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_DIM_NAME", pTargetDimName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_CALLER", pCaller);
				
			cmd.execute();


		}
		
		public static void deleteAwdimensionAccessAll(NNumber pRunid,NString pAwOwner,NString pAwName,NString pTargetDimName,NString pAccessType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWDIMENSION_ACCESS_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUNID", pRunid);
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_DIM_NAME", pTargetDimName);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
				
			cmd.execute();


		}
		
		public static void deleteAwdimloadSpec(NString pAwdimloadSpecName,NString pDimensionOwner,NString pDimensionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWDIMLOAD_SPEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWDIMLOAD_SPEC_NAME", pAwdimloadSpecName);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
				
			cmd.execute();


		}
		
		public static void deleteAwdimloadSpecFilter(NString pAwdimloadSpecName,NString pDimensionOwner,NString pDimensionName,NString pLookupTableOwner,NString pLookupTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_AWDIMLOAD_SPEC_FILTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWDIMLOAD_SPEC_NAME", pAwdimloadSpecName);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LOOKUP_TABLE_OWNER", pLookupTableOwner);
			cmd.addParameter("@P_LOOKUP_TABLE_NAME", pLookupTableName);
				
			cmd.execute();


		}
		
		public static void deleteMvcubeaggSpec(NString pAwcubeaggSpecName,NString pCubeOwner,NString pCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_MVCUBEAGG_SPEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
				
			cmd.execute();


		}
		
		public static void deleteMvcubeaggSpecLevel(NString pAwcubeaggSpecName,NString pCubeOwner,NString pCubeName,NString pDimensionOwner,NString pDimensionName,NString pLevelName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_MVCUBEAGG_SPEC_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
				
			cmd.execute();


		}
		
		public static void deleteMvcubeaggSpecMeasure(NString pAwcubeaggSpecName,NString pCubeOwner,NString pCubeName,NString pMeasureName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_MVCUBEAGG_SPEC_MEASURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEASURE_NAME", pMeasureName);
				
			cmd.execute();


		}
		
		public static void deleteMvcubeloadSpecAgg(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName,NString pAwcubeaggSpecName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.DELETE_MVCUBELOAD_SPEC_AGG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
				
			cmd.execute();


		}
		
		public static void refreshAwcube(NString pAwOwner,NString pAwName,NString pTargetCubeName,NString pAwcubeloadSpecName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.REFRESH_AWCUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_CUBE_NAME", pTargetCubeName);
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
				
			cmd.execute();


		}
		
		public static void refreshAwcubeViewName(NString pAwOwner,NString pAwName,NString pCubename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.REFRESH_AWCUBE_VIEW_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_CUBENAME", pCubename);
				
			cmd.execute();


		}
		
		public static void refreshAwdimension(NString pAwOwner,NString pAwName,NString pTargetDimensionName,NString pAwdimloadSpecName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.REFRESH_AWDIMENSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_TARGET_DIMENSION_NAME", pTargetDimensionName);
			cmd.addParameter("@P_AWDIMLOAD_SPEC_NAME", pAwdimloadSpecName);
				
			cmd.execute();


		}
		
		public static void refreshAwdimensionViewName(NString pAwOwner,NString pAwName,NString pDimname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.REFRESH_AWDIMENSION_VIEW_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_DIMNAME", pDimname);
				
			cmd.execute();


		}
		
		public static void setAwcompSpecCube(NString pAwcompSpecName,NString pCubeOwner,NString pCubeName,NString pSetCubeOwner,NString pSetCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWCOMP_SPEC_CUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCOMP_SPEC_NAME", pAwcompSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_SET_CUBE_OWNER", pSetCubeOwner);
			cmd.addParameter("@P_SET_CUBE_NAME", pSetCubeName);
				
			cmd.execute();


		}
		
		public static void setAwcompSpecMemberName(NString pAwcompSpecName,NString pCubeOwner,NString pCubeName,NString pMemberName,NString pSetMemberName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWCOMP_SPEC_MEMBER_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCOMP_SPEC_NAME", pAwcompSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEMBER_NAME", pMemberName);
			cmd.addParameter("@P_SET_MEMBER_NAME", pSetMemberName);
				
			cmd.execute();


		}
		
		public static void setAwcompSpecMemberPos(NString pAwcompSpecName,NString pCubeOwner,NString pCubeName,NString pMemberName,NNumber pMemberPosistion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWCOMP_SPEC_MEMBER_POS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCOMP_SPEC_NAME", pAwcompSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEMBER_NAME", pMemberName);
			cmd.addParameter("@P_MEMBER_POSISTION", pMemberPosistion);
				
			cmd.execute();


		}
		
		public static void setAwcompSpecMemberSeg(NString pAwcompSpecName,NString pCubeOwner,NString pCubeName,NString pMemberName,NNumber pMemberSegwidth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWCOMP_SPEC_MEMBER_SEG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCOMP_SPEC_NAME", pAwcompSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEMBER_NAME", pMemberName);
			cmd.addParameter("@P_MEMBER_SEGWIDTH", pMemberSegwidth);
				
			cmd.execute();


		}
		
		public static void setAwcompSpecName(NString pAwcompSpecName,NString pCubeOwner,NString pCubeName,NString pSetAwcompSpecName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWCOMP_SPEC_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCOMP_SPEC_NAME", pAwcompSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_SET_AWCOMP_SPEC_NAME", pSetAwcompSpecName);
				
			cmd.execute();


		}
		
		public static void setAwcubeViewName(NString pAwowner,NString pAwname,NString pCubename,NNumber pHiercombonum,NString pUserviewname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWCUBE_VIEW_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWOWNER", pAwowner);
			cmd.addParameter("@P_AWNAME", pAwname);
			cmd.addParameter("@P_CUBENAME", pCubename);
			cmd.addParameter("@P_HIERCOMBONUM", pHiercombonum);
			cmd.addParameter("@P_USERVIEWNAME", pUserviewname);
				
			cmd.execute();


		}
		
		public static void setAwcubeaggSpecAggop(NString pAwcubeaggSpecName,NString pCubeOwner,NString pAwName,NString pCubeName,NString pMeasureName,NString pDimensionName,NString pOperator) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWCUBEAGG_SPEC_AGGOP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEASURE_NAME", pMeasureName);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_OPERATOR", pOperator);
				
			cmd.execute();


		}
		
		public static void setAwcubeloadSpecCube(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName,NString pSetCubeOwner,NString pSetCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWCUBELOAD_SPEC_CUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_SET_CUBE_OWNER", pSetCubeOwner);
			cmd.addParameter("@P_SET_CUBE_NAME", pSetCubeName);
				
			cmd.execute();


		}
		
		public static void setAwcubeloadSpecLoadtype(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName,NString pLoadtypeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWCUBELOAD_SPEC_LOADTYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_LOADTYPE_NAME", pLoadtypeName);
				
			cmd.execute();


		}
		
		public static void setAwcubeloadSpecName(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName,NString pSetAwcubeloadSpecName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWCUBELOAD_SPEC_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_SET_AWCUBELOAD_SPEC_NAME", pSetAwcubeloadSpecName);
				
			cmd.execute();


		}
		
		public static void setAwcubeloadSpecParameter(NString pAwcubeloadSpecName,NString pCubeOwner,NString pCubeName,NString pParameterName,NString pParameterValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWCUBELOAD_SPEC_PARAMETER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBELOAD_SPEC_NAME", pAwcubeloadSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_PARAMETER_NAME", pParameterName);
			cmd.addParameter("@P_PARAMETER_VALUE", pParameterValue);
				
			cmd.execute();


		}
		
		public static void setAwdimensionViewName(NString pAwowner,NString pAwname,NString pDimname,NString pHiername,NString pUserviewname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWDIMENSION_VIEW_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWOWNER", pAwowner);
			cmd.addParameter("@P_AWNAME", pAwname);
			cmd.addParameter("@P_DIMNAME", pDimname);
			cmd.addParameter("@P_HIERNAME", pHiername);
			cmd.addParameter("@P_USERVIEWNAME", pUserviewname);
				
			cmd.execute();


		}
		
		public static void setAwdimloadSpecDimension(NString pAwdimloadSpecName,NString pDimensionOwner,NString pDimensionName,NString pSetDimensionOwner,NString pSetDimensionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWDIMLOAD_SPEC_DIMENSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWDIMLOAD_SPEC_NAME", pAwdimloadSpecName);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_SET_DIMENSION_OWNER", pSetDimensionOwner);
			cmd.addParameter("@P_SET_DIMENSION_NAME", pSetDimensionName);
				
			cmd.execute();


		}
		
		public static void setAwdimloadSpecLoadtype(NString pAwdimloadSpecName,NString pDimensionOwner,NString pDimensionName,NString pLoadtypeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWDIMLOAD_SPEC_LOADTYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWDIMLOAD_SPEC_NAME", pAwdimloadSpecName);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LOADTYPE_NAME", pLoadtypeName);
				
			cmd.execute();


		}
		
		public static void setAwdimloadSpecName(NString pAwdimloadSpecName,NString pDimensionOwner,NString pDimensionName,NString pSetAwdimloadSpecName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWDIMLOAD_SPEC_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWDIMLOAD_SPEC_NAME", pAwdimloadSpecName);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_SET_AWDIMLOAD_SPEC_NAME", pSetAwdimloadSpecName);
				
			cmd.execute();


		}
		
		public static void setAwdimloadSpecParameter(NString pAwdimloadSpecName,NString pDimensionOwner,NString pDimensionName,NString pParameterName,NString pParameterValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_AWDIMLOAD_SPEC_PARAMETER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWDIMLOAD_SPEC_NAME", pAwdimloadSpecName);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_PARAMETER_NAME", pParameterName);
			cmd.addParameter("@P_PARAMETER_VALUE", pParameterValue);
				
			cmd.execute();


		}
		
		public static void setMvcubeaggSpecCube(NString pAwcubeaggSpecName,NString pCubeOwner,NString pCubeName,NString pSetCubeOwner,NString pSetCubeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_MVCUBEAGG_SPEC_CUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_SET_CUBE_OWNER", pSetCubeOwner);
			cmd.addParameter("@P_SET_CUBE_NAME", pSetCubeName);
				
			cmd.execute();


		}
		
		public static void setMvcubeaggSpecName(NString pAwcubeaggSpecName,NString pCubeOwner,NString pCubeName,NString pSetAwcubeaggSpecName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.SET_MVCUBEAGG_SPEC_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AWCUBEAGG_SPEC_NAME", pAwcubeaggSpecName);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_SET_AWCUBEAGG_SPEC_NAME", pSetAwcubeaggSpecName);
				
			cmd.execute();


		}
		
		public static void upgradeAwTo102(NString pAwOwner,NString pAwName,NString pAwmCaller) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_AWM.UPGRADE_AW_TO_10_2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AW_OWNER", pAwOwner);
			cmd.addParameter("@P_AW_NAME", pAwName);
			cmd.addParameter("@P_AWM_CALLER", pAwmCaller);
				
			cmd.execute();


		}
		
	
	
	
}
