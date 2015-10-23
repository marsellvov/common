package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class MdLrs {
//		public static void adjustMeasure( geomSegment,List<SdoDimArrayRow> dimArray,Ref<NNumber> startMeasure,Ref<NNumber> endMeasure,NNumber funType) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.ADJUST_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure, true);
//			cmd.addParameter("@END_MEASURE", endMeasure, true);
//			cmd.addParameter("@FUN_TYPE", funType);
//				
//			cmd.execute();
//			startMeasure.val = cmd.getParameterValue("@START_MEASURE", NNumber.class);
//			endMeasure.val = cmd.getParameterValue("@END_MEASURE", NNumber.class);
//
//
//		}
		
//		public static void adjustMeasure( geomSegment,List<SdoDimArrayRow> dimArray,NNumber oldMs,NNumber oldMe,Ref<NNumber> newMs,Ref<NNumber> newMe) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.ADJUST_MEASURE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@OLD_MS", oldMs);
//			cmd.addParameter("@OLD_ME", oldMe);
//			cmd.addParameter("@NEW_MS", NNumber.class);
//			cmd.addParameter("@NEW_ME", NNumber.class);
//				
//			cmd.execute();
//			newMs.val = cmd.getParameterValue("@NEW_MS", NNumber.class);
//			newMe.val = cmd.getParameterValue("@NEW_ME", NNumber.class);
//
//
//		}
		
//		public static void adjustMeasure3d( geomSegment,List<SdoDimArrayRow> dimArray,Ref<NNumber> startMeasure,Ref<NNumber> endMeasure,NNumber funType) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.ADJUST_MEASURE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure, true);
//			cmd.addParameter("@END_MEASURE", endMeasure, true);
//			cmd.addParameter("@FUN_TYPE", funType);
//				
//			cmd.execute();
//			startMeasure.val = cmd.getParameterValue("@START_MEASURE", NNumber.class);
//			endMeasure.val = cmd.getParameterValue("@END_MEASURE", NNumber.class);
//
//
//		}
		
//		public static  FappendToGeomSegment( baseGeomSegment, newGeomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.APPEND_TO_GEOM_SEGMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@BASE_GEOM_SEGMENT", baseGeomSegment);
//			cmd.addParameter("@NEW_GEOM_SEGMENT", newGeomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FcleanGeometry( geom,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.CLEAN_GEOMETRY", DbManager.getDataBaseFactory());
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
		
//		public static  FcleanGeometry( geom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.CLEAN_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FcleanGeometryFun( geom,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.CLEAN_GEOMETRY_FUN", DbManager.getDataBaseFactory());
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
		
//		public static  FclipGeomSegmentFun( geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure,NNumber use3d) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.CLIP_GEOM_SEGMENT_FUN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@USE_3D", use3d);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FconcatenateGeomSegmentsFun( geomSegment1,List<SdoDimArrayRow> dimArray1, geomSegment2,List<SdoDimArrayRow> dimArray2,NNumber shiftSegment2,NNumber use3d) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.CONCATENATE_GEOM_SEGMENTS_FUN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT_1", geomSegment1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_1", "", dimArray1, object.class));
//			cmd.addParameter("@GEOM_SEGMENT_2", geomSegment2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_2", "", dimArray2, object.class));
//			cmd.addParameter("@SHIFT_SEGMENT_2", shiftSegment2);
//			cmd.addParameter("@USE_3D", use3d);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NNumber FconnectionTypeFun( geomSegment1,List<SdoDimArrayRow> dimArray1, geomSegment2,List<SdoDimArrayRow> dimArray2,NNumber use3d) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.CONNECTION_TYPE_FUN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT_1", geomSegment1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_1", "", dimArray1, object.class));
//			cmd.addParameter("@GEOM_SEGMENT_2", geomSegment2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_2", "", dimArray2, object.class));
//			cmd.addParameter("@USE_3D", use3d);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static List<SdoDimArrayRow> FconstructDimArray( geometry,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.CONSTRUCT_DIM_ARRAY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoDimArrayRow>.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoDimArrayRow>.class);
//
//		}
		
//		public static NNumber FconstructLrsGtype( geometry,NNumber measureDimPos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.CONSTRUCT_LRS_GTYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@MEASURE_DIM_POS", measureDimPos);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NString FcontainMeasureDim(List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.CONTAIN_MEASURE_DIM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FcontainMeasureDim3d(List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.CONTAIN_MEASURE_DIM_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FcontainsUnknownElem( geom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.CONTAINS_UNKNOWN_ELEM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM", geom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static void defineGeomSegmentProc(Ref<> geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure,NNumber use3d) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.DEFINE_GEOM_SEGMENT_PROC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@START_MEASURE", startMeasure);
//			cmd.addParameter("@END_MEASURE", endMeasure);
//			cmd.addParameter("@USE_3D", use3d);
//				
//			cmd.execute();
//			geomSegment.val = cmd.getParameterValue("@GEOM_SEGMENT", .class);
//
//
//		}
		
//		public static NString FelemEndPt( geom,List<SdoDimArrayRow> dimArray,NNumber vNo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.ELEM_END_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@V_NO", vNo);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FgeodeticGeometry( geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.GEODETIC_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString FgeodeticSrid(NNumber srid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.GEODETIC_SRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SRID", srid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NNumber FgeomSegmentsConType( geomSegment1,List<SdoDimArrayRow> dimArray1, geomSegment2,List<SdoDimArrayRow> dimArray2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.GEOM_SEGMENTS_CON_TYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT_1", geomSegment1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_1", "", dimArray1, object.class));
//			cmd.addParameter("@GEOM_SEGMENT_2", geomSegment2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_2", "", dimArray2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FgeomSegmentsConType3d( geomSegment1,List<SdoDimArrayRow> dimArray1, geomSegment2,List<SdoDimArrayRow> dimArray2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.GEOM_SEGMENTS_CON_TYPE_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT_1", geomSegment1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_1", "", dimArray1, object.class));
//			cmd.addParameter("@GEOM_SEGMENT_2", geomSegment2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY_2", "", dimArray2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FgetLrsDimPos( geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.GET_LRS_DIM_POS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FgetMValue( geometry,NNumber vertexNo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.GET_M_VALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@VERTEX_NO", vertexNo);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FgetMValue( geometry,NNumber vertexNo,NNumber dimNo,NNumber mPos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.GET_M_VALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@VERTEX_NO", vertexNo);
//			cmd.addParameter("@DIM_NO", dimNo);
//			cmd.addParameter("@M_POS", mPos);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static NNumber FgtypeFilter(NNumber gtype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.GTYPE_FILTER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GTYPE", gtype);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NNumber FisDefinedFun( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.IS_DEFINED_FUN", DbManager.getDataBaseFactory());
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
		
//		public static NString FlinestringGeom( geom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.LINESTRING_GEOM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM", geom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static  FlocatePtFun( geomSegment,List<SdoDimArrayRow> dimArray,NNumber measure,NNumber offset,NNumber use3d) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.LOCATE_PT_FUN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@MEASURE", measure);
//			cmd.addParameter("@OFFSET", offset);
//			cmd.addParameter("@USE_3D", use3d);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NString FlrsGeomByGtype( geom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.LRS_GEOM_BY_GTYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM", geom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NNumber FlrsGeomLength3d( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.LRS_GEOM_LENGTH_3D", DbManager.getDataBaseFactory());
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
		
//		public static NString FlrsGeometry( geom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.LRS_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM", geom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString FlrsMultiSegmentsGtype(NNumber gtype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.LRS_MULTI_SEGMENTS_GTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GTYPE", gtype);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FlrsPolygonGtype(NNumber gtype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.LRS_POLYGON_GTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GTYPE", gtype);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FlrsPtGtype(NNumber gtype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.LRS_PT_GTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GTYPE", gtype);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FlrsSegmentGtype(NNumber gtype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.LRS_SEGMENT_GTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GTYPE", gtype);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  FmakePointGeom( point,NNumber dimNo,NNumber ptDimNo,NNumber mPos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.MAKE_POINT_GEOM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@POINT", point);
//			cmd.addParameter("@DIM_NO", dimNo);
//			cmd.addParameter("@PT_DIM_NO", ptDimNo);
//			cmd.addParameter("@M_POS", mPos);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NNumber FmonotonicMeasure( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.MONOTONIC_MEASURE", DbManager.getDataBaseFactory());
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
		
//		public static NNumber FnextNonNullOrdinate( geomSegment,Ref<NNumber> idx,NNumber dimNo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.NEXT_NON_NULL_ORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			cmd.addParameter("@IDX", idx, true);
//			cmd.addParameter("@DIM_NO", dimNo);
//				
//			cmd.execute();
//			idx.val = cmd.getParameterValue("@IDX", NNumber.class);
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static NNumber FnoOfDimensions(NNumber gtype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.NO_OF_DIMENSIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GTYPE", gtype);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NNumber FnoOfElements( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.NO_OF_ELEMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FnoOfVertices( geomSegment) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.NO_OF_VERTICES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FnoOfVertices( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.NO_OF_VERTICES", DbManager.getDataBaseFactory());
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
		
//		public static  FoffsetGeomSegmentFun( geomSegment,List<SdoDimArrayRow> dimArray,NNumber startMeasure,NNumber endMeasure,NNumber offset,NString unit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.OFFSET_GEOM_SEGMENT_FUN", DbManager.getDataBaseFactory());
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
		
//		public static  FprojectPtFun( geomSegment,List<SdoDimArrayRow> dimArray, point,Ref<NNumber> offset,NNumber use3d) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.PROJECT_PT_FUN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//			cmd.addParameter("@OFFSET", NNumber.class);
//			cmd.addParameter("@USE_3D", use3d);
//				
//			cmd.execute();
//			offset.val = cmd.getParameterValue("@OFFSET", NNumber.class);
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NString FprojectedGeometry( geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.PROJECTED_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString FprojectedSrid(NNumber srid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.PROJECTED_SRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SRID", srid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  FreverseGeometryFun( geom,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.REVERSE_GEOMETRY_FUN", DbManager.getDataBaseFactory());
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
		
//		public static  FreverseM( geomSegment,List<SdoDimArrayRow> dimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.REVERSE_M", DbManager.getDataBaseFactory());
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
		
//		public static NString FsameCs( geom1, geom2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.SAME_CS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FsameSdoOrdinateArray(List<SdoOrdinateArrayRow> array1,List<SdoOrdinateArrayRow> array2,List<SdoOrdinateArrayRow> toleranceArray,NNumber no) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.SAME_SDO_ORDINATE_ARRAY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getCollectionType("ARRAY_1", "", array1, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("ARRAY_2", "", array2, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("TOLERANCE_ARRAY", "", toleranceArray, object.class));
//			cmd.addParameter("@NO", no);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static void setLrsDimPos(Ref<> geometry,NNumber mPos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.SET_LRS_DIM_POS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOMETRY", geometry, true);
//			cmd.addParameter("@M_POS", mPos);
//				
//			cmd.execute();
//			geometry.val = cmd.getParameterValue("@GEOMETRY", .class);
//
//
//		}
		
//		public static void setMValue(Ref<> geometry,NNumber vertexNo,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.SET_M_VALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOMETRY", geometry, true);
//			cmd.addParameter("@VERTEX_NO", vertexNo);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//			geometry.val = cmd.getParameterValue("@GEOMETRY", .class);
//
//
//		}
		
//		public static void setMValue(Ref<> geometry,NNumber vertexNo,NNumber dimNo,NNumber mPos,NNumber measure) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.SET_M_VALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOMETRY", geometry, true);
//			cmd.addParameter("@VERTEX_NO", vertexNo);
//			cmd.addParameter("@DIM_NO", dimNo);
//			cmd.addParameter("@M_POS", mPos);
//			cmd.addParameter("@MEASURE", measure);
//				
//			cmd.execute();
//			geometry.val = cmd.getParameterValue("@GEOMETRY", .class);
//
//
//		}
		
//		public static NNumber FsnapToPt( geomSegment,List<SdoDimArrayRow> dimArray, point,List<SdoDimArrayRow> ptDimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.SNAP_TO_PT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("PT_DIM_ARRAY", "", ptDimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FsnapToPt3d( geomSegment,List<SdoDimArrayRow> dimArray, point,List<SdoDimArrayRow> ptDimArray) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MD_LRS.SNAP_TO_PT_3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_SEGMENT", geomSegment);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM_ARRAY", "", dimArray, object.class));
//			cmd.addParameter("@POINT", point);
//			// cmd.addParameter(DbTypes.getCollectionType("PT_DIM_ARRAY", "", ptDimArray, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
	
	
	
}
