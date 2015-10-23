package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoLrs {
//		public static FclipGeomSegment( geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CLIP_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FclipGeomSegment( geomSegment,NNumber startMeasure,NNumber endMeasure,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CLIP_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FclipGeomSegment3d( geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CLIP_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FclipGeomSegment3d( geomSegment,NNumber startMeasure,NNumber endMeasure,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CLIP_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconcatenateGeomSegments( geomSegment1,List<SdoDimArrayRow> dimArray1, geomSegment2,List<SdoDimArrayRow> dimArray2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONCATENATE_GEOM_SEGMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT_1", geomSegment1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_1", "", dimArray1, object.class));
//			cmd.addParameter("@GEOM_SEGMENT_2", geomSegment2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_2", "", dimArray2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconcatenateGeomSegments( geomSegment1, geomSegment2,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONCATENATE_GEOM_SEGMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT_1", geomSegment1);
//			cmd.addParameter("@GEOM_SEGMENT_2", geomSegment2);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconcatenateGeomSegments3d( geomSegment1,List<SdoDimArrayRow> dimArray1, geomSegment2,List<SdoDimArrayRow> dimArray2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONCATENATE_GEOM_SEGMENTS_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT_1", geomSegment1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_1", "", dimArray1, object.class));
//			cmd.addParameter("@GEOM_SEGMENT_2", geomSegment2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_2", "", dimArray2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconcatenateGeomSegments3d( geomSegment1, geomSegment2,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONCATENATE_GEOM_SEGMENTS_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT_1", geomSegment1);
//			cmd.addParameter("@GEOM_SEGMENT_2", geomSegment2);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NString FconnectedGeomSegments( geomSegment1,List<SdoDimArrayRow> dimArray1, geomSegment2,List<SdoDimArrayRow> dimArray2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONNECTED_GEOM_SEGMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT_1", geomSegment1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_1", "", dimArray1, object.class));
//			cmd.addParameter("@GEOM_SEGMENT_2", geomSegment2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_2", "", dimArray2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FconnectedGeomSegments( geomSegment1, geomSegment2,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONNECTED_GEOM_SEGMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT_1", geomSegment1);
//			cmd.addParameter("@GEOM_SEGMENT_2", geomSegment2);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FconnectedGeomSegments3d( geomSegment1,List<SdoDimArrayRow> dimArray1, geomSegment2,List<SdoDimArrayRow> dimArray2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONNECTED_GEOM_SEGMENTS_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT_1", geomSegment1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_1", "", dimArray1, object.class));
//			cmd.addParameter("@GEOM_SEGMENT_2", geomSegment2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_2", "", dimArray2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FconnectedGeomSegments3d( geomSegment1, geomSegment2,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONNECTED_GEOM_SEGMENTS_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT_1", geomSegment1);
//			cmd.addParameter("@GEOM_SEGMENT_2", geomSegment2);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static List<SdoDimArrayRow> FconvertToLrsDimArray(List<SdoDimArrayRow> dimArray,NString dimName,NNumber dimPos,NNumber lowerBound,NNumber upperBound,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_DIM_ARRAY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoDimArrayRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@DIM_NAME", dimName);
//			cmd.addParameter("@DIM_POS", dimPos);
//			cmd.addParameter("@LOWER_BOUND", lowerBound);
//			cmd.addParameter("@UPPER_BOUND", upperBound);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoDimArrayRow>.class);
//
//		}
//		
//		public static List<SdoDimArrayRow> FconvertToLrsDimArray(List<SdoDimArrayRow> dimArray,NString dimName,NNumber lowerBound,NNumber upperBound,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_DIM_ARRAY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoDimArrayRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@DIM_NAME", dimName);
//			cmd.addParameter("@LOWER_BOUND", lowerBound);
//			cmd.addParameter("@UPPER_BOUND", upperBound);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoDimArrayRow>.class);
//
//		}
//		
//		public static List<SdoDimArrayRow> FconvertToLrsDimArray(List<SdoDimArrayRow> dimArray,NNumber lowerBound,NNumber upperBound,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_DIM_ARRAY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoDimArrayRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@LOWER_BOUND", lowerBound);
//			cmd.addParameter("@UPPER_BOUND", upperBound);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoDimArrayRow>.class);
//
//		}
//		
//		public static List<SdoDimArrayRow> FconvertToLrsDimArray3d(List<SdoDimArrayRow> dimArray,NString dimName,NNumber lowerBound,NNumber upperBound,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_DIM_ARRAY_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoDimArrayRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@DIM_NAME", dimName);
//			cmd.addParameter("@LOWER_BOUND", lowerBound);
//			cmd.addParameter("@UPPER_BOUND", upperBound);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoDimArrayRow>.class);
//
//		}
		
//		public static  FconvertToLrsGeom( standardGeom,List<SdoDimArrayRow> dimArray,NNumber mPos,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_GEOM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@STANDARD_GEOM", standardGeom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@M_POS", mPos);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconvertToLrsGeom( standardGeom,List<SdoDimArrayRow> dimArray,NNumber mPos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_GEOM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@STANDARD_GEOM", standardGeom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@M_POS", mPos);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconvertToLrsGeom( standardGeom,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_GEOM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@STANDARD_GEOM", standardGeom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconvertToLrsGeom( standardGeom,NNumber mPos,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_GEOM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@STANDARD_GEOM", standardGeom);
//			cmd.addParameter("@M_POS", mPos);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconvertToLrsGeom( standardGeom,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_GEOM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@STANDARD_GEOM", standardGeom);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconvertToLrsGeom( standardGeom,NNumber mPos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_GEOM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@STANDARD_GEOM", standardGeom);
//			cmd.addParameter("@M_POS", mPos);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconvertToLrsGeom( standardGeom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_GEOM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@STANDARD_GEOM", standardGeom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconvertToLrsGeom3d( standardGeom,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_GEOM_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@STANDARD_GEOM", standardGeom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconvertToLrsGeom3d( standardGeom,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_GEOM_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@STANDARD_GEOM", standardGeom);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString FconvertToLrsLayer(NString tableName,NString columnName,NNumber lowerBound,NNumber upperBound,NNumber tolerance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_LAYER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
			cmd.addParameter("@UPPER_BOUND", upperBound);
			cmd.addParameter("@TOLERANCE", tolerance);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FconvertToLrsLayer(NString tableName,NString columnName,NString dimName,NNumber dimPos,NNumber lowerBound,NNumber upperBound,NNumber tolerance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_LAYER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
			cmd.addParameter("@DIM_NAME", dimName);
			cmd.addParameter("@DIM_POS", dimPos);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
			cmd.addParameter("@UPPER_BOUND", upperBound);
			cmd.addParameter("@TOLERANCE", tolerance);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FconvertToLrsLayer3d(NString tableName,NString columnName,NNumber lowerBound,NNumber upperBound,NNumber tolerance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_LAYER_3D", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
			cmd.addParameter("@UPPER_BOUND", upperBound);
			cmd.addParameter("@TOLERANCE", tolerance);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FconvertToLrsLayer3d(NString tableName,NString columnName,NString dimName,NNumber lowerBound,NNumber upperBound,NNumber tolerance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_LRS_LAYER_3D", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
			cmd.addParameter("@DIM_NAME", dimName);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
			cmd.addParameter("@UPPER_BOUND", upperBound);
			cmd.addParameter("@TOLERANCE", tolerance);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<SdoDimArrayRow> FconvertToStdDimArray(List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_STD_DIM_ARRAY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoDimArrayRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoDimArrayRow>.class);
//
//		}
//		
//		public static List<SdoDimArrayRow> FconvertToStdDimArray(List<SdoDimArrayRow> dimArray,NNumber mPos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_STD_DIM_ARRAY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoDimArrayRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@M_POS", mPos);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoDimArrayRow>.class);
//
//		}
//		
//		public static List<SdoDimArrayRow> FconvertToStdDimArray3d(List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_STD_DIM_ARRAY_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoDimArrayRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoDimArrayRow>.class);
//
//		}
		
//		public static  FconvertToStdGeom( lrsGeom,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_STD_GEOM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@LRS_GEOM", lrsGeom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconvertToStdGeom( lrsGeom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_STD_GEOM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@LRS_GEOM", lrsGeom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconvertToStdGeom3d( lrsGeom,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_STD_GEOM_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@LRS_GEOM", lrsGeom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FconvertToStdGeom3d( lrsGeom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_STD_GEOM_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@LRS_GEOM", lrsGeom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString FconvertToStdLayer(NString tableName,NString columnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_STD_LAYER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FconvertToStdLayer3d(NString tableName,NString columnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.CONVERT_TO_STD_LAYER_3D", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void defineGeomSegment(Ref<> geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.DEFINE_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
//		
//		public static void defineGeomSegment(Ref<> geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.DEFINE_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
		
//		public static void defineGeomSegment(Ref<> geomSegment,NNumber startMeasure,NNumber endMeasure,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.DEFINE_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
//		
//		public static void defineGeomSegment(Ref<> geomSegment,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.DEFINE_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
//		
//		public static void defineGeomSegment3d(Ref<> geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.DEFINE_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
//		
//		public static void defineGeomSegment3d(Ref<> geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.DEFINE_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
//		
//		public static void defineGeomSegment3d(Ref<> geomSegment,NNumber startMeasure,NNumber endMeasure,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.DEFINE_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
		
//		public static void defineGeomSegment3d(Ref<> geomSegment,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.DEFINE_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
		
//		public static  FdynamicSegment( geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.DYNAMIC_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FdynamicSegment( geomSegment,NNumber startMeasure,NNumber endMeasure,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.DYNAMIC_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FdynamicSegment3d( geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.DYNAMIC_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FdynamicSegment3d( geomSegment,NNumber startMeasure,NNumber endMeasure,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.DYNAMIC_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NNumber findLrsDimPos(NString tableName,NString columnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.FIND_LRS_DIM_POS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@COLUMN_NAME", columnName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NNumber findMeasure( geomSegment,List<SdoDimArrayRow> dimArray, point,List<SdoDimArrayRow> pointDimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.FIND_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("POINT_DIM_ARRAY", "", pointDimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber findMeasure( geomSegment, point,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.FIND_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber findMeasure3d( geomSegment,List<SdoDimArrayRow> dimArray, point,List<SdoDimArrayRow> pointDimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.FIND_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("POINT_DIM_ARRAY", "", pointDimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber findMeasure3d( geomSegment, point,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.FIND_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber findOffset( geomSegment,List<SdoDimArrayRow> dimArray, point,List<SdoDimArrayRow> pointDimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.FIND_OFFSET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("POINT_DIM_ARRAY", "", pointDimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber findOffset( geomSegment, point,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.FIND_OFFSET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgeomSegmentEndMeasure( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_END_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgeomSegmentEndMeasure( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_END_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgeomSegmentEndMeasure3d( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_END_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgeomSegmentEndMeasure3d( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_END_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  FgeomSegmentEndPt( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_END_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgeomSegmentEndPt( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_END_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgeomSegmentEndPt3d( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_END_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgeomSegmentEndPt3d( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_END_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NNumber FgeomSegmentLength( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_LENGTH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgeomSegmentLength( geomSegment,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_LENGTH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgeomSegmentLength3d( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_LENGTH_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgeomSegmentLength3d( geomSegment,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_LENGTH_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgeomSegmentStartMeasure( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_START_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgeomSegmentStartMeasure( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_START_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgeomSegmentStartMeasure3d( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_START_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgeomSegmentStartMeasure3d( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_START_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  FgeomSegmentStartPt( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_START_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgeomSegmentStartPt( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_START_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgeomSegmentStartPt3d( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_START_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgeomSegmentStartPt3d( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GEOM_SEGMENT_START_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NNumber FgetMeasure( point,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetMeasure( point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetMeasure3d( point,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetMeasure3d( point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  FgetNextShapePt( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetNextShapePt( geomSegment,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetNextShapePt( geomSegment,List<SdoDimArrayRow> dimArray, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetNextShapePt( geomSegment, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetNextShapePt3d( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetNextShapePt3d( geomSegment,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetNextShapePt3d( geomSegment,List<SdoDimArrayRow> dimArray, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetNextShapePt3d( geomSegment, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NNumber FgetNextShapePtMeasure( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetNextShapePtMeasure( geomSegment,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetNextShapePtMeasure( geomSegment,List<SdoDimArrayRow> dimArray, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetNextShapePtMeasure( geomSegment, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetNextShapePtMeasure3d( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetNextShapePtMeasure3d( geomSegment,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetNextShapePtMeasure3d( geomSegment,List<SdoDimArrayRow> dimArray, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetNextShapePtMeasure3d( geomSegment, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_NEXT_SHAPE_PT_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  FgetPrevShapePt( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetPrevShapePt( geomSegment,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetPrevShapePt( geomSegment,List<SdoDimArrayRow> dimArray, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetPrevShapePt( geomSegment, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetPrevShapePt3d( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetPrevShapePt3d( geomSegment,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetPrevShapePt3d( geomSegment,List<SdoDimArrayRow> dimArray, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgetPrevShapePt3d( geomSegment, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NNumber FgetPrevShapePtMeasure( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetPrevShapePtMeasure( geomSegment,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetPrevShapePtMeasure( geomSegment,List<SdoDimArrayRow> dimArray, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetPrevShapePtMeasure( geomSegment, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetPrevShapePtMeasure3d( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetPrevShapePtMeasure3d( geomSegment,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetPrevShapePtMeasure3d( geomSegment,List<SdoDimArrayRow> dimArray, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FgetPrevShapePtMeasure3d( geomSegment, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.GET_PREV_SHAPE_PT_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NString FisGeomSegmentDefined( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_GEOM_SEGMENT_DEFINED", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisGeomSegmentDefined( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_GEOM_SEGMENT_DEFINED", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisGeomSegmentDefined3d( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_GEOM_SEGMENT_DEFINED_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisGeomSegmentDefined3d( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_GEOM_SEGMENT_DEFINED_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisMeasureDecreasing( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_MEASURE_DECREASING", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisMeasureDecreasing( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_MEASURE_DECREASING", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisMeasureDecreasing3d( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_MEASURE_DECREASING_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisMeasureDecreasing3d( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_MEASURE_DECREASING_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisMeasureIncreasing( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_MEASURE_INCREASING", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisMeasureIncreasing( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_MEASURE_INCREASING", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisMeasureIncreasing3d( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_MEASURE_INCREASING_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisMeasureIncreasing3d( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_MEASURE_INCREASING_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisShapePtMeasure( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_SHAPE_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisShapePtMeasure( geomSegment,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_SHAPE_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisShapePtMeasure3d( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_SHAPE_PT_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FisShapePtMeasure3d( geomSegment,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.IS_SHAPE_PT_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static  FlocatePt( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure,NNumber offset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.LOCATE_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//			cmd.addParameter("@OFFSET", offset);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FlocatePt( geomSegment,NNumber measure,NNumber offset,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.LOCATE_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//			cmd.addParameter("@OFFSET", offset);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FlocatePt3d( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.LOCATE_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FlocatePt3d( geomSegment,NNumber measure,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.LOCATE_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FlrsIntersection( geom1,List<SdoDimArrayRow> dimArray1, geom2,List<SdoDimArrayRow> dimArray2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.LRS_INTERSECTION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_1", "", dimArray1, object.class));
//			cmd.addParameter("@GEOM_2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_2", "", dimArray2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FlrsIntersection( geom1, geom2,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.LRS_INTERSECTION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_1", geom1);
//			cmd.addParameter("@GEOM_2", geom2);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NNumber FmeasureRange( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.MEASURE_RANGE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FmeasureRange( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.MEASURE_RANGE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FmeasureRange3d( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.MEASURE_RANGE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FmeasureRange3d( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.MEASURE_RANGE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FmeasureToPercentage( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.MEASURE_TO_PERCENTAGE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FmeasureToPercentage( geomSegment,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.MEASURE_TO_PERCENTAGE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  FoffsetGeomSegment( geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure,NNumber offset,NString unit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.OFFSET_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@OFFSET", offset);
//			cmd.addParameter("@UNIT", unit);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FoffsetGeomSegment( geomSegment,NNumber startMeasure,NNumber endMeasure,NNumber offset,NNumber tolerance,NString unit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.OFFSET_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@OFFSET", offset);
//			cmd.addParameter("@TOLERANCE", tolerance);
//			cmd.addParameter("@UNIT", unit);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FoffsetGeomSegment( geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure,NNumber offset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.OFFSET_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@OFFSET", offset);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FoffsetGeomSegment( geomSegment,NNumber startMeasure,NNumber endMeasure,NNumber offset,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.OFFSET_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@OFFSET", offset);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FoffsetGeomSegment( geomSegment,NNumber startMeasure,NNumber endMeasure,NNumber offset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.OFFSET_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@OFFSET", offset);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NNumber FpercentageToMeasure( geomSegment,List<SdoDimArrayRow> dimArray,NNumber percentage) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.PERCENTAGE_TO_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@PERCENTAGE", percentage);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber FpercentageToMeasure( geomSegment,NNumber percentage) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.PERCENTAGE_TO_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@PERCENTAGE", percentage);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  FprojectPt( geomSegment,List<SdoDimArrayRow> dimArray, point,List<SdoDimArrayRow> pointDimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.PROJECT_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("POINT_DIM_ARRAY", "", pointDimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FprojectPt( geomSegment,List<SdoDimArrayRow> dimArray, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.PROJECT_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FprojectPt( geomSegment,List<SdoDimArrayRow> dimArray, point,List<SdoDimArrayRow> pointDimArray,Ref<NNumber> offset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.PROJECT_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("POINT_DIM_ARRAY", "", pointDimArray, object.class));
//			cmd.addParameter("@OFFSET", NNumber.class);
//				
//			cmd.execute();
//			offset.val = cmd.getParameterValue("@OFFSET", NNumber.class);
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FprojectPt( geomSegment, point,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.PROJECT_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FprojectPt( geomSegment, point,NNumber tolerance,Ref<NNumber> offset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.PROJECT_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//			cmd.addParameter("@TOLERANCE", tolerance);
//			cmd.addParameter("@OFFSET", NNumber.class);
//				
//			cmd.execute();
//			offset.val = cmd.getParameterValue("@OFFSET", NNumber.class);
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FprojectPt3d( geomSegment,List<SdoDimArrayRow> dimArray, point,List<SdoDimArrayRow> pointDimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.PROJECT_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("POINT_DIM_ARRAY", "", pointDimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FprojectPt3d( geomSegment,List<SdoDimArrayRow> dimArray, point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.PROJECT_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FprojectPt3d( geomSegment,List<SdoDimArrayRow> dimArray, point,List<SdoDimArrayRow> pointDimArray,Ref<NNumber> offset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.PROJECT_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("POINT_DIM_ARRAY", "", pointDimArray, object.class));
//			cmd.addParameter("@OFFSET", NNumber.class);
//				
//			cmd.execute();
//			offset.val = cmd.getParameterValue("@OFFSET", NNumber.class);
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FprojectPt3d( geomSegment, point,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.PROJECT_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FprojectPt3d( geomSegment, point,NNumber tolerance,Ref<NNumber> offset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.PROJECT_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@POINT", point);
//			cmd.addParameter("@TOLERANCE", tolerance);
//			cmd.addParameter("@OFFSET", NNumber.class);
//				
//			cmd.execute();
//			offset.val = cmd.getParameterValue("@OFFSET", NNumber.class);
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static void redefineGeomSegment(Ref<> geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REDEFINE_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
//		
//		public static void redefineGeomSegment(Ref<> geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REDEFINE_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
		
//		public static void redefineGeomSegment(Ref<> geomSegment,NNumber startMeasure,NNumber endMeasure,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REDEFINE_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
		
//		public static void redefineGeomSegment(Ref<> geomSegment,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REDEFINE_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
		
//		public static void redefineGeomSegment3d(Ref<> geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REDEFINE_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
		
//		public static void redefineGeomSegment3d(Ref<> geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REDEFINE_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
//		
//		public static void redefineGeomSegment3d(Ref<> geomSegment,NNumber startMeasure,NNumber endMeasure,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REDEFINE_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
//		
//		public static void redefineGeomSegment3d(Ref<> geomSegment,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REDEFINE_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
//		
//		public static void resetMeasure(Ref<> geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.RESET_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
//		
//		public static void resetMeasure(Ref<> geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.RESET_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
		
//		public static  FreverseGeometry( geom,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REVERSE_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FreverseGeometry( geom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REVERSE_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FreverseMeasure( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REVERSE_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FreverseMeasure( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REVERSE_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FreverseMeasure3d( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REVERSE_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FreverseMeasure3d( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.REVERSE_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FscaleGeomSegment( geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure,NNumber shiftMeasure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.SCALE_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@SHIFT_MEASURE", shiftMeasure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FscaleGeomSegment( geomSegment,NNumber startMeasure,NNumber endMeasure,NNumber shiftMeasure,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.SCALE_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@SHIFT_MEASURE", shiftMeasure);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NString FsetPtMeasure(Ref<> geomSegment,List<SdoDimArrayRow> dimArray, point,List<SdoDimArrayRow> ptDimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.SET_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("PT_DIM_ARRAY", "", ptDimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FsetPtMeasure(Ref<> point,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.SET_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POINT", point, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//			point.val = cmd.getParameterValue("@POINT", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FsetPtMeasure(Ref<> point,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.SET_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POINT", point, true);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//			point.val = cmd.getParameterValue("@POINT", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}

//		public static NString FsetPtMeasure(Ref<> geomSegment, point,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.SET_PT_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			cmd.addParameter("@POINT", point);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FsetPtMeasure3d(Ref<> geomSegment,List<SdoDimArrayRow> dimArray, point,List<SdoDimArrayRow> ptDimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.SET_PT_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("PT_DIM_ARRAY", "", ptDimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FsetPtMeasure3d(Ref<> geomSegment, point,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.SET_PT_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			cmd.addParameter("@POINT", point);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static void splitGeomSegment( geomSegment,List<SdoDimArrayRow> dimArray,NNumber splitMeasure,Ref<> segment1,Ref<> segment2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.SPLIT_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@SPLIT_MEASURE", splitMeasure);
//			cmd.addParameter("@SEGMENT_1", .class);
//			cmd.addParameter("@SEGMENT_2", .class);
//				
//			cmd.execute();
//			segment1.val = cmd.getParameterValue("@SEGMENT_1", .class);
//			segment2.val = cmd.getParameterValue("@SEGMENT_2", .class);
//
//
//		}
		
//		public static void splitGeomSegment( geomSegment,NNumber splitMeasure,Ref<> segment1,Ref<> segment2,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.SPLIT_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@SPLIT_MEASURE", splitMeasure);
//			cmd.addParameter("@SEGMENT_1", .class);
//			cmd.addParameter("@SEGMENT_2", .class);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//			segment1.val = cmd.getParameterValue("@SEGMENT_1", .class);
//			segment2.val = cmd.getParameterValue("@SEGMENT_2", .class);
//
//
//		}
		
//		public static void splitGeomSegment3d( geomSegment,List<SdoDimArrayRow> dimArray,NNumber splitMeasure,Ref<> segment1,Ref<> segment2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.SPLIT_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@SPLIT_MEASURE", splitMeasure);
//			cmd.addParameter("@SEGMENT_1", .class);
//			cmd.addParameter("@SEGMENT_2", .class);
//				
//			cmd.execute();
//			segment1.val = cmd.getParameterValue("@SEGMENT_1", .class);
//			segment2.val = cmd.getParameterValue("@SEGMENT_2", .class);
//
//
//		}
		
//		public static void splitGeomSegment3d( geomSegment,NNumber splitMeasure,Ref<> segment1,Ref<> segment2,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.SPLIT_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@SPLIT_MEASURE", splitMeasure);
//			cmd.addParameter("@SEGMENT_1", .class);
//			cmd.addParameter("@SEGMENT_2", .class);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//			segment1.val = cmd.getParameterValue("@SEGMENT_1", .class);
//			segment2.val = cmd.getParameterValue("@SEGMENT_2", .class);
//
//
//		}
		
//		public static  FtranslateMeasure( geomSegment,List<SdoDimArrayRow> dimArray,NNumber translateM) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.TRANSLATE_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@TRANSLATE_M", translateM);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FtranslateMeasure( geomSegment,NNumber translateM) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.TRANSLATE_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@TRANSLATE_M", translateM);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FtranslateMeasure3d( geomSegment,List<SdoDimArrayRow> dimArray,NNumber translateM) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.TRANSLATE_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@TRANSLATE_M", translateM);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FtranslateMeasure3d( geomSegment,NNumber translateM) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.TRANSLATE_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@TRANSLATE_M", translateM);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NString FvalidGeomSegment( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALID_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidGeomSegment( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALID_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidGeomSegment3d( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALID_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidGeomSegment3d( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALID_GEOM_SEGMENT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidLrsPt( point,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALID_LRS_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidLrsPt( point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALID_LRS_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidLrsPt3d( point,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALID_LRS_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidLrsPt3d( point) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALID_LRS_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POINT", point);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidMeasure( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALID_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidMeasure( geomSegment,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALID_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidMeasure3d( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALID_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidMeasure3d( geomSegment,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALID_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidateLrsGeometry( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALIDATE_LRS_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidateLrsGeometry( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALIDATE_LRS_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidateLrsGeometry3d( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALIDATE_LRS_GEOMETRY_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidateLrsGeometry3d( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_LRS.VALIDATE_LRS_GEOMETRY_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
	
	
	
}
