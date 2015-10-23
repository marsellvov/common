package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapTableMap {
		public static void addAwview(NString pViewOwner,NString pViewName,NString pRowtocellColName,NString pAwowner,NString pAwname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.ADD_AWVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VIEW_OWNER", pViewOwner);
			cmd.addParameter("@P_VIEW_NAME", pViewName);
			cmd.addParameter("@P_ROWTOCELL_COL_NAME", pRowtocellColName);
			cmd.addParameter("@P_AWOWNER", pAwowner);
			cmd.addParameter("@P_AWNAME", pAwname);
				
			cmd.execute();


		}
		
		public static void mapAwviewColumn(NString pViewOwner,NString pViewName,NString pColumn,NString pAwobject) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.MAP_AWVIEW_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VIEW_OWNER", pViewOwner);
			cmd.addParameter("@P_VIEW_NAME", pViewName);
			cmd.addParameter("@P_COLUMN", pColumn);
			cmd.addParameter("@P_AWOBJECT", pAwobject);
				
			cmd.execute();


		}
		
		public static void mapDimtblHierlevel(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName,NString pLevelName,NString pTableOwner,NString pTableName,NString pKeycol,NString pParentcol) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.MAP_DIMTBL_HIERLEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_KEYCOL", pKeycol);
			cmd.addParameter("@P_PARENTCOL", pParentcol);
				
			cmd.execute();


		}
		
		public static void mapDimtblHierlevelattr(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName,NString pHierarchyName,NString pLevelName,NString pLevelAttributeName,NString pTableOwner,NString pTableName,NString pAttrcol) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.MAP_DIMTBL_HIERLEVELATTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_LEVEL_ATTRIBUTE_NAME", pLevelAttributeName);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ATTRCOL", pAttrcol);
				
			cmd.execute();


		}
		
		public static void mapDimtblHiersortkey(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName,NString pSortcol) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.MAP_DIMTBL_HIERSORTKEY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_SORTCOL", pSortcol);
				
			cmd.execute();


		}
		
		public static void mapDimtblLevel(NString pDimensionOwner,NString pDimensionName,NString pLevelName,NString pTableOwner,NString pTableName,NString pKeycol) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.MAP_DIMTBL_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_KEYCOL", pKeycol);
				
			cmd.execute();


		}
		
		public static void mapDimtblLevelattr(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName,NString pLevelName,NString pLevelAttributeName,NString pTableOwner,NString pTableName,NString pAttrcol) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.MAP_DIMTBL_LEVELATTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_LEVEL_ATTRIBUTE_NAME", pLevelAttributeName);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ATTRCOL", pAttrcol);
				
			cmd.execute();


		}
		
		public static void mapFacttblLevelkey(NString pCubeOwner,NString pCubeName,NString pFacttableOwner,NString pFacttableName,NString pStoretype,NString pDimkeymap,NString pDimktype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.MAP_FACTTBL_LEVELKEY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_FACTTABLE_OWNER", pFacttableOwner);
			cmd.addParameter("@P_FACTTABLE_NAME", pFacttableName);
			cmd.addParameter("@P_STORETYPE", pStoretype);
			cmd.addParameter("@P_DIMKEYMAP", pDimkeymap);
			cmd.addParameter("@P_DIMKTYPE", pDimktype);
				
			cmd.execute();


		}
		
		public static void mapFacttblMeasure(NString pCubeOwner,NString pCubeName,NString pMeasureName,NString pFacttableOwner,NString pFacttableName,NString pColumnName,NString pDimkeymap) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.MAP_FACTTBL_MEASURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEASURE_NAME", pMeasureName);
			cmd.addParameter("@P_FACTTABLE_OWNER", pFacttableOwner);
			cmd.addParameter("@P_FACTTABLE_NAME", pFacttableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_DIMKEYMAP", pDimkeymap);
				
			cmd.execute();


		}
		
		public static void removeAwview(NString pViewOwner,NString pViewName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.REMOVE_AWVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VIEW_OWNER", pViewOwner);
			cmd.addParameter("@P_VIEW_NAME", pViewName);
				
			cmd.execute();


		}
		
		public static void removemapDimtblHierlevel(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName,NString pLevelName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.REMOVEMAP_DIMTBL_HIERLEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
				
			cmd.execute();


		}
		
		public static void removemapDimtblHierlevelattr(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName,NString pHierarchyName,NString pLevelName,NString pLevelAttributeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.REMOVEMAP_DIMTBL_HIERLEVELATTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_LEVEL_ATTRIBUTE_NAME", pLevelAttributeName);
				
			cmd.execute();


		}
		
		public static void removemapDimtblHiersortkey(NString pDimensionOwner,NString pDimensionName,NString pHierarchyName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.REMOVEMAP_DIMTBL_HIERSORTKEY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
				
			cmd.execute();


		}
		
		public static void removemapDimtblLevel(NString pDimensionOwner,NString pDimensionName,NString pLevelName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.REMOVEMAP_DIMTBL_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
				
			cmd.execute();


		}
		
		public static void removemapDimtblLevelattr(NString pDimensionOwner,NString pDimensionName,NString pDimensionAttributeName,NString pLevelName,NString pLevelAttributeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.REMOVEMAP_DIMTBL_LEVELATTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_DIMENSION_ATTRIBUTE_NAME", pDimensionAttributeName);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_LEVEL_ATTRIBUTE_NAME", pLevelAttributeName);
				
			cmd.execute();


		}
		
		public static void removemapFacttblLevelkey(NString pCubeOwner,NString pCubeName,NString pFacttableOwner,NString pFacttableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.REMOVEMAP_FACTTBL_LEVELKEY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_FACTTABLE_OWNER", pFacttableOwner);
			cmd.addParameter("@P_FACTTABLE_NAME", pFacttableName);
				
			cmd.execute();


		}
		
		public static void removemapFacttblMeasure(NString pCubeOwner,NString pCubeName,NString pMeasureName,NString pFacttableOwner,NString pFacttableName,NString pColumnName,NString pDimkeymap) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_TABLE_MAP.REMOVEMAP_FACTTBL_MEASURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_MEASURE_NAME", pMeasureName);
			cmd.addParameter("@P_FACTTABLE_OWNER", pFacttableOwner);
			cmd.addParameter("@P_FACTTABLE_NAME", pFacttableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_DIMKEYMAP", pDimkeymap);
				
			cmd.execute();


		}
		
	
	
	
}
