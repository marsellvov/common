package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoTune {
		public static void analyzeRtree(NString schemaname,NString indexname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.ANALYZE_RTREE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SCHEMANAME", schemaname);
			cmd.addParameter("@INDEXNAME", indexname);
				
			cmd.execute();


		}
		
		public static void averageMbr(NString layer,Ref<NNumber> width,Ref<NNumber> height) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.AVERAGE_MBR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@WIDTH", NNumber.class);
			cmd.addParameter("@HEIGHT", NNumber.class);
				
			cmd.execute();
			width.val = cmd.getParameterValue("@WIDTH", NNumber.class);
			height.val = cmd.getParameterValue("@HEIGHT", NNumber.class);


		}
		
		public static void averageMbr(NString tableName,NString columnName,Ref<NNumber> width,Ref<NNumber> height) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.AVERAGE_MBR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
			cmd.addParameter("@WIDTH", NNumber.class);
			cmd.addParameter("@HEIGHT", NNumber.class);
				
			cmd.execute();
			width.val = cmd.getParameterValue("@WIDTH", NNumber.class);
			height.val = cmd.getParameterValue("@HEIGHT", NNumber.class);


		}
		
		public static NNumber FestimateRtreeIndexSize(NNumber numberOfGeoms,NNumber dbBlockSize,NNumber sdoRtrPctfree,NNumber numDimensions,NNumber isGeodetic) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.ESTIMATE_RTREE_INDEX_SIZE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NUMBER_OF_GEOMS", numberOfGeoms);
			cmd.addParameter("@DB_BLOCK_SIZE", dbBlockSize);
			cmd.addParameter("@SDO_RTR_PCTFREE", sdoRtrPctfree);
			cmd.addParameter("@NUM_DIMENSIONS", numDimensions);
			cmd.addParameter("@IS_GEODETIC", isGeodetic);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FestimateRtreeIndexSize(NString schema,NString tabname,NString colname,NString partname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.ESTIMATE_RTREE_INDEX_SIZE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SCHEMA", schema);
			cmd.addParameter("@TABNAME", tabname);
			cmd.addParameter("@COLNAME", colname);
			cmd.addParameter("@PARTNAME", partname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void extentOf(NString layer,Ref<NNumber> minX,Ref<NNumber> maxX,Ref<NNumber> minY,Ref<NNumber> maxY) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.EXTENT_OF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@MIN_X", NNumber.class);
			cmd.addParameter("@MAX_X", NNumber.class);
			cmd.addParameter("@MIN_Y", NNumber.class);
			cmd.addParameter("@MAX_Y", NNumber.class);
				
			cmd.execute();
			minX.val = cmd.getParameterValue("@MIN_X", NNumber.class);
			maxX.val = cmd.getParameterValue("@MAX_X", NNumber.class);
			minY.val = cmd.getParameterValue("@MIN_Y", NNumber.class);
			maxY.val = cmd.getParameterValue("@MAX_Y", NNumber.class);


		}
		
//		public static  FextentOf(NString tableName,NString columnName,NString useIndex) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.EXTENT_OF", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@TABLE_NAME", tableName);
//			cmd.addParameter("@COLUMN_NAME", columnName);
//			cmd.addParameter("@USE_INDEX", useIndex);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void mixInfo(NString layer,Ref<NNumber> totalGeom,Ref<NNumber> pointGeom,Ref<NNumber> lineGeom,Ref<NNumber> polyGeom,Ref<NNumber> complexGeom) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.MIX_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@TOTAL_GEOM", NNumber.class);
			cmd.addParameter("@POINT_GEOM", NNumber.class);
			cmd.addParameter("@LINE_GEOM", NNumber.class);
			cmd.addParameter("@POLY_GEOM", NNumber.class);
			cmd.addParameter("@COMPLEX_GEOM", NNumber.class);
				
			cmd.execute();
			totalGeom.val = cmd.getParameterValue("@TOTAL_GEOM", NNumber.class);
			pointGeom.val = cmd.getParameterValue("@POINT_GEOM", NNumber.class);
			lineGeom.val = cmd.getParameterValue("@LINE_GEOM", NNumber.class);
			polyGeom.val = cmd.getParameterValue("@POLY_GEOM", NNumber.class);
			complexGeom.val = cmd.getParameterValue("@COMPLEX_GEOM", NNumber.class);


		}
		
		public static void mixInfo(NString layer) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.MIX_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
				
			cmd.execute();


		}
		
		public static void mixInfo(NString tableName,NString columnName,Ref<NNumber> totalGeom,Ref<NNumber> pointGeom,Ref<NNumber> curveGeom,Ref<NNumber> polyGeom,Ref<NNumber> complexGeom) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.MIX_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
			cmd.addParameter("@TOTAL_GEOM", NNumber.class);
			cmd.addParameter("@POINT_GEOM", NNumber.class);
			cmd.addParameter("@CURVE_GEOM", NNumber.class);
			cmd.addParameter("@POLY_GEOM", NNumber.class);
			cmd.addParameter("@COMPLEX_GEOM", NNumber.class);
				
			cmd.execute();
			totalGeom.val = cmd.getParameterValue("@TOTAL_GEOM", NNumber.class);
			pointGeom.val = cmd.getParameterValue("@POINT_GEOM", NNumber.class);
			curveGeom.val = cmd.getParameterValue("@CURVE_GEOM", NNumber.class);
			polyGeom.val = cmd.getParameterValue("@POLY_GEOM", NNumber.class);
			complexGeom.val = cmd.getParameterValue("@COMPLEX_GEOM", NNumber.class);


		}
		
		public static void mixInfo(NString tableName,NString columnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.MIX_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
				
			cmd.execute();


		}
		
		public static NNumber FqualityDegradation(NString schemaname,NString indexname,NString indextable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.QUALITY_DEGRADATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SCHEMANAME", schemaname);
			cmd.addParameter("@INDEXNAME", indexname);
			cmd.addParameter("@INDEXTABLE", indextable);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FqualityDegradation(NString schemaname,NString indexname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.QUALITY_DEGRADATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SCHEMANAME", schemaname);
			cmd.addParameter("@INDEXNAME", indexname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FrtreeQuality(NString schemaname,NString indexname,NString indextable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.RTREE_QUALITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SCHEMANAME", schemaname);
			cmd.addParameter("@INDEXNAME", indexname);
			cmd.addParameter("@INDEXTABLE", indextable);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FrtreeQuality(NString schemaname,NString indexname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TUNE.RTREE_QUALITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SCHEMANAME", schemaname);
			cmd.addParameter("@INDEXNAME", indexname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
