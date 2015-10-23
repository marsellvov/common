package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoUtil {
//		public static  Faffinetransforms( geometry,NString translation,NNumber tx,NNumber ty,NNumber tz,NString scaling, psc1,NNumber sx,NNumber sy,NNumber sz,NString rotation, p1, line1,NNumber angle,NNumber dir,NString shearing,NNumber shxy,NNumber shyx,NNumber shxz,NNumber shzx,NNumber shyz,NNumber shzy,NString reflection, pref, liner,NNumber dirr,NString planer,List<SdoNumberArrayRow> n,List<SdoNumberArrayRow> bigd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.AFFINETRANSFORMS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@TRANSLATION", translation);
//			cmd.addParameter("@TX", tx);
//			cmd.addParameter("@TY", ty);
//			cmd.addParameter("@TZ", tz);
//			cmd.addParameter("@SCALING", scaling);
//			cmd.addParameter("@PSC1", psc1);
//			cmd.addParameter("@SX", sx);
//			cmd.addParameter("@SY", sy);
//			cmd.addParameter("@SZ", sz);
//			cmd.addParameter("@ROTATION", rotation);
//			cmd.addParameter("@P1", p1);
//			cmd.addParameter("@LINE1", line1);
//			cmd.addParameter("@ANGLE", angle);
//			cmd.addParameter("@DIR", dir);
//			cmd.addParameter("@SHEARING", shearing);
//			cmd.addParameter("@SHXY", shxy);
//			cmd.addParameter("@SHYX", shyx);
//			cmd.addParameter("@SHXZ", shxz);
//			cmd.addParameter("@SHZX", shzx);
//			cmd.addParameter("@SHYZ", shyz);
//			cmd.addParameter("@SHZY", shzy);
//			cmd.addParameter("@REFLECTION", reflection);
//			cmd.addParameter("@PREF", pref);
//			cmd.addParameter("@LINER", liner);
//			cmd.addParameter("@DIRR", dirr);
//			cmd.addParameter("@PLANER", planer);
//			// cmd.addParameter(DbTypes.getCollectionType("N", "", n, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("BIGD", "", bigd, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fappend( geometry1, geometry2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.APPEND", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY1", geometry1);
//			cmd.addParameter("@GEOMETRY2", geometry2);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void bearingTiltForPoints(NNumber startPoint,NNumber endPoint,NNumber tol,Ref<NNumber> bearing,Ref<NNumber> tilt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.BEARING_TILT_FOR_POINTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@START_POINT", startPoint);
			cmd.addParameter("@END_POINT", endPoint);
			cmd.addParameter("@TOL", tol);
			cmd.addParameter("@BEARING", NNumber.class);
			cmd.addParameter("@TILT", NNumber.class);
				
			cmd.execute();
			bearing.val = cmd.getParameterValue("@BEARING", NNumber.class);
			tilt.val = cmd.getParameterValue("@TILT", NNumber.class);


		}
		
		public static NNumber Fbuffer(NNumber geometry,NNumber bufferWidth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.BUFFER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOMETRY", geometry);
			cmd.addParameter("@BUFFER_WIDTH", bufferWidth);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FcirclePolygon(NNumber centerLongitude,NNumber centerLatitude,NNumber radius,NNumber arcTolerance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.CIRCLE_POLYGON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CENTER_LONGITUDE", centerLongitude);
			cmd.addParameter("@CENTER_LATITUDE", centerLatitude);
			cmd.addParameter("@RADIUS", radius);
			cmd.addParameter("@ARC_TOLERANCE", arcTolerance);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static  FconcatLines( geometry1, geometry2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.CONCAT_LINES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY1", geometry1);
//			cmd.addParameter("@GEOMETRY2", geometry2);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NNumber FconvertDistance(NNumber srid,NNumber distance,NString unitSpec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.CONVERT_DISTANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SRID", srid);
			cmd.addParameter("@DISTANCE", distance);
			cmd.addParameter("@UNIT_SPEC", unitSpec);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FconvertUnit(NNumber value,NString inUnit,NString outUnit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.CONVERT_UNIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@VALUE", value);
			cmd.addParameter("@IN_UNIT", inUnit);
			cmd.addParameter("@OUT_UNIT", outUnit);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void dropWorkTables(NString oidstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.DROP_WORK_TABLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OIDSTR", oidstr);
				
			cmd.execute();


		}
		
		public static NNumber FellipsePolygon(NNumber centerLongitude,NNumber centerLatitude,NNumber semiMajorAxis,NNumber semiMinorAxis,NNumber azimuth,NNumber arcTolerance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.ELLIPSE_POLYGON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CENTER_LONGITUDE", centerLongitude);
			cmd.addParameter("@CENTER_LATITUDE", centerLatitude);
			cmd.addParameter("@SEMI_MAJOR_AXIS", semiMajorAxis);
			cmd.addParameter("@SEMI_MINOR_AXIS", semiMinorAxis);
			cmd.addParameter("@AZIMUTH", azimuth);
			cmd.addParameter("@ARC_TOLERANCE", arcTolerance);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FexpandGeom(NNumber geometry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.EXPAND_GEOM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOMETRY", geometry);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FexpandMultiPoint(NNumber geometry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.EXPAND_MULTI_POINT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOMETRY", geometry);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fextract(NNumber geometry,NNumber element,NNumber ring) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.EXTRACT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOMETRY", geometry);
			cmd.addParameter("@ELEMENT", element);
			cmd.addParameter("@RING", ring);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fextract3d(NNumber geometry,NString label) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.EXTRACT3D", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOMETRY", geometry);
			cmd.addParameter("@LABEL", label);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static  Fextractvoids( geometry,List<SdoDimArrayRow> dim) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.EXTRACTVOIDS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fextrude( geometry,List<SdoNumberArrayRow> grdheight,List<SdoNumberArrayRow> height,NString cond,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.EXTRUDE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			// cmd.addParameter(DbTypes.getCollectionType("GRDHEIGHT", "", grdheight, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("HEIGHT", "", height, object.class));
//			cmd.addParameter("@COND", cond);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fextrude( geometry,List<SdoNumberArrayRow> grdheight,List<SdoNumberArrayRow> height,NNumber tol,NNumber optional3dsrid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.EXTRUDE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			// cmd.addParameter(DbTypes.getCollectionType("GRDHEIGHT", "", grdheight, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("HEIGHT", "", height, object.class));
//			cmd.addParameter("@TOL", tol);
//			cmd.addParameter("@OPTIONAL3DSRID", optional3dsrid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString fromClob(NString clobgeom) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_CLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CLOBGEOM", clobgeom);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString fromGml311geometry(NString geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_GML311GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static  fromGml311geometry(NString geometry,NString srsnamespace) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_GML311GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@SRSNAMESPACE", srsnamespace);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  fromGml311geometry(NString geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_GML311GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  fromGml311geometry(NString geometry,NString srsnamespace) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_GML311GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@SRSNAMESPACE", srsnamespace);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  fromGmlgeometry(NString geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_GMLGEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  fromGmlgeometry(NString geometry,NString srsnamespace) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_GMLGEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@SRSNAMESPACE", srsnamespace);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  fromGmlgeometry(NString geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_GMLGEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  fromGmlgeometry(NString geometry,NString srsnamespace) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_GMLGEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@SRSNAMESPACE", srsnamespace);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  fromKmlgeometry(NString geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_KMLGEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  fromKmlgeometry(NString geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_KMLGEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  fromWkbgeometry(BLOB geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_WKBGEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  fromWktgeometry(NString geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_WKTGEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  fromWktgeometry(NString geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.FROM_WKTGEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NNumber Fgetnumelem(NNumber geometry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.GETNUMELEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOMETRY", geometry);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fgetnumrings(NNumber geom) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.GETNUMRINGS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOM", geom);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fgetnumvertices(NNumber geometry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.GETNUMVERTICES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOMETRY", geometry);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static List<VertexSetTypeRow> Fgetvertices( geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.GETVERTICES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<VertexSetTypeRow>.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<VertexSetTypeRow>.class);
//
//		}
		
		public static void initializeIndexesForTts() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.INITIALIZE_INDEXES_FOR_TTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static  FinternalMakeLineOutOfElem( multilinestring,NNumber elementIndex) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.INTERNAL_MAKE_LINE_OUT_OF_ELEM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@MULTILINESTRING", multilinestring);
//			cmd.addParameter("@ELEMENT_INDEX", elementIndex);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NNumber FinternalMergeLinestrings(NNumber geometry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.INTERNAL_MERGE_LINESTRINGS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOMETRY", geometry);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static void internalOrdinateCopy(List<SdoOrdinateArrayRow> src,NNumber srcPosition,Ref<List<SdoOrdinateArrayRow>> dst,NNumber dstPosition,NNumber length) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.INTERNAL_ORDINATE_COPY", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("SRC", "", src, object.class));
//			cmd.addParameter("@SRC_POSITION", srcPosition);
//			// cmd.addParameter(DbTypes.getCollectionType("DST", "", dst.val, object.class , true));
//			cmd.addParameter("@DST_POSITION", dstPosition);
//			cmd.addParameter("@LENGTH", length);
//				
//			cmd.execute();
//			// dst.val = cmd.getTableParameterValue("@DST", object.class);
//
//
//		}
		
//		public static void internalReverseLinePoints(Ref<List<SdoOrdinateArrayRow>> ordinates) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.INTERNAL_REVERSE_LINE_POINTS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("ORDINATES", "", ordinates.val, object.class , true));
//				
//			cmd.execute();
//			// ordinates.val = cmd.getTableParameterValue("@ORDINATES", object.class);
//
//
//		}
		
//		public static  Fouterln( geometry,List<SdoDimArrayRow> dim) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.OUTERLN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void partitionTable(NString schemaname,NString tablename,NString outputDataTable,NString outputPtnTable,NNumber ptnCapacity,NNumber numdim,NString wrkTblspc,NString ptnType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.PARTITION_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SCHEMANAME", schemaname);
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@OUTPUT_DATA_TABLE", outputDataTable);
			cmd.addParameter("@OUTPUT_PTN_TABLE", outputPtnTable);
			cmd.addParameter("@PTN_CAPACITY", ptnCapacity);
			cmd.addParameter("@NUMDIM", numdim);
			cmd.addParameter("@WRK_TBLSPC", wrkTblspc);
			cmd.addParameter("@PTN_TYPE", ptnType);
				
			cmd.execute();


		}
		
		public static NNumber FpointAtBearing(NNumber startPoint,NNumber bearing,NNumber distance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.POINT_AT_BEARING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@START_POINT", startPoint);
			cmd.addParameter("@BEARING", bearing);
			cmd.addParameter("@DISTANCE", distance);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fpolygontoline(NNumber geometry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.POLYGONTOLINE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOMETRY", geometry);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void prepareForTts(NString tableSpace) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.PREPARE_FOR_TTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_SPACE", tableSpace);
				
			cmd.execute();


		}
		
		public static NNumber FrectifyGeometry(NNumber geometry,NNumber tolerance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.RECTIFY_GEOMETRY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOMETRY", geometry);
			cmd.addParameter("@TOLERANCE", tolerance);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static  Frefinemgon( mgon, gon,List<SdoDimArrayRow> dim) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.REFINEMGON", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@MGON", mgon);
//			cmd.addParameter("@GON", gon);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NNumber FremoveDuplicateVertices(NNumber geometry,NNumber tolerance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.REMOVE_DUPLICATE_VERTICES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOMETRY", geometry);
			cmd.addParameter("@TOLERANCE", tolerance);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static  FremoveDuplicates( geometry,List<SdoDimArrayRow> dim) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.REMOVE_DUPLICATES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NNumber FremoveInnerRings(NNumber inpgeom,NNumber inptol) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.REMOVE_INNER_RINGS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@INPGEOM", inpgeom);
			cmd.addParameter("@INPTOL", inptol);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FreverseLinestring(NNumber geometry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.REVERSE_LINESTRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOMETRY", geometry);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fsimplify(NNumber geometry,NNumber threshold,NNumber tolerance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.SIMPLIFY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GEOMETRY", geometry);
			cmd.addParameter("@THRESHOLD", threshold);
			cmd.addParameter("@TOLERANCE", tolerance);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FtoClob(NNumber geometry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.TO_CLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GEOMETRY", geometry);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FtoGml311geometry(NNumber geometry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.TO_GML311GEOMETRY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GEOMETRY", geometry);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FtoGml311geometry(NNumber geometry,NString srsnamespace,NString srsnsalias) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.TO_GML311GEOMETRY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GEOMETRY", geometry);
			cmd.addParameter("@SRSNAMESPACE", srsnamespace);
			cmd.addParameter("@SRSNSALIAS", srsnsalias);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FtoGmlgeometry(NNumber geometry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.TO_GMLGEOMETRY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GEOMETRY", geometry);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FtoGmlgeometry(NNumber geometry,NString srsnamespace,NString srsnsalias) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.TO_GMLGEOMETRY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GEOMETRY", geometry);
			cmd.addParameter("@SRSNAMESPACE", srsnamespace);
			cmd.addParameter("@SRSNSALIAS", srsnsalias);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FtoKmlgeometry(NNumber geometry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.TO_KMLGEOMETRY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GEOMETRY", geometry);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static BLOB FtoWkbgeometry( geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.TO_WKBGEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(BLOB.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(BLOB.class);
//
//		}
		
		public static NString FtoWktgeometry(NString geometry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.TO_WKTGEOMETRY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GEOMETRY", geometry);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FtoWktgeometryVarchar(NString geometry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.TO_WKTGEOMETRY_VARCHAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GEOMETRY", geometry);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FtruncateNumber(NNumber value,NNumber noOfDigits) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.TRUNCATE_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@VALUE", value);
			cmd.addParameter("@NO_OF_DIGITS", noOfDigits);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NString FvalidateWkbgeometry(BLOB geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.VALIDATE_WKBGEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FvalidateWktgeometry(NString geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.VALIDATE_WKTGEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidateWktgeometry(NString geometry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_UTIL.VALIDATE_WKTGEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
	
	
	
}
