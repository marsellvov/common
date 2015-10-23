//package net.hedtech.general.common.dbservices;
//
//import java.util.*;
//import morphis.foundations.core.appdatalayer.*;
//import morphis.foundations.core.appdatalayer.data.*;
//import morphis.foundations.core.appdatalayer.data.types.*;
//import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
//import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
//import morphis.foundations.core.types.*;
//import morphis.foundations.core.util.Ref;
//
//
//public class Sdo3gl {
////		public static NString Fanyinteract( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
////			
////			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.ANYINTERACT", DbManager.getDataBaseFactory());
////			
////			cmd.addReturnParameter(NString.class);
////			cmd.addParameter("@GEOM1", geom1);
////			cmd.addParameter("@GEOM2", geom2);
////			cmd.addParameter("@IDX_CTX", idxCtx);
////			cmd.addParameter("@SCTX", sctx, true);
////			cmd.addParameter("@SCNFLAG", scnflag);
////				
////			cmd.execute();
////			sctx.val = cmd.getParameterValue("@SCTX", .class);
////
////			return cmd.getReturnValue(NString.class);
////
////		}
//		
////		public static NString Fanyinteract( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
////			
////			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.ANYINTERACT", DbManager.getDataBaseFactory());
////			
////			cmd.addReturnParameter(NString.class);
////			cmd.addParameter("@GEOM1", geom1);
////			cmd.addParameter("@GEOM2", geom2);
////			cmd.addParameter("@IDX_CTX", idxCtx);
////			cmd.addParameter("@SCTX", sctx, true);
////			cmd.addParameter("@SCNFLAG", scnflag);
////				
////			cmd.execute();
////			sctx.val = cmd.getParameterValue("@SCTX", .class);
////
////			return cmd.getReturnValue(NString.class);
////
////		}
////		
////		public static NString Fanyinteract( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
////			
////			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.ANYINTERACT", DbManager.getDataBaseFactory());
////			
////			cmd.addReturnParameter(NString.class);
////			cmd.addParameter("@GEOM1", geom1);
////			cmd.addParameter("@GEOM2", geom2);
////			cmd.addParameter("@IDX_CTX", idxCtx);
////			cmd.addParameter("@SCTX", sctx, true);
////			cmd.addParameter("@SCNFLAG", scnflag);
////				
////			cmd.execute();
////			sctx.val = cmd.getParameterValue("@SCTX", .class);
////
////			return cmd.getReturnValue(NString.class);
////
////		}
////		
////		public static NString Fanyinteract( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
////			
////			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.ANYINTERACT", DbManager.getDataBaseFactory());
////			
////			cmd.addReturnParameter(NString.class);
////			cmd.addParameter("@GEOM1", geom1);
////			cmd.addParameter("@GEOM2", geom2);
////			cmd.addParameter("@IDX_CTX", idxCtx);
////			cmd.addParameter("@SCTX", sctx, true);
////			cmd.addParameter("@SCNFLAG", scnflag);
////				
////			cmd.execute();
////			sctx.val = cmd.getParameterValue("@SCTX", .class);
////
////			return cmd.getReturnValue(NString.class);
////
////		}
//		
//		public static NString Fanyinteract3d( geometry1, geometry2,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.ANYINTERACT3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOMETRY1", geometry1);
//			cmd.addParameter("@GEOMETRY2", geometry2);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static  FarcDensify(List<SdoDimArrayRow> dimobj, geomobj,NString _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.ARC_DENSIFY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ", "", dimobj, object.class));
//			cmd.addParameter("@GEOMOBJ", geomobj);
//			cmd.addParameter("@PARAMS", _params);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NNumber Farea3d( geometry,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.AREA3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static void bearing( startPoint, endPoint,Ref<NNumber> bearing) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.BEARING", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@START_POINT", startPoint);
//			cmd.addParameter("@END_POINT", endPoint);
//			cmd.addParameter("@BEARING", NNumber.class);
//				
//			cmd.execute();
//			bearing.val = cmd.getParameterValue("@BEARING", NNumber.class);
//
//
//		}
//		
//		public static  Fcentroid(List<SdoDimArrayRow> dimobj, geomobj) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.CENTROID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ", "", dimobj, object.class));
//			cmd.addParameter("@GEOMOBJ", geomobj);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  Fcentroid3d( geometry,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.CENTROID3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static void checkspatial() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.CHECKSPATIAL", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
//		
//		public static  FclosestPoints(List<SdoDimArrayRow> dimobj1, geom1,List<SdoDimArrayRow> dimobj2, geom2,NString unit,Ref<NNumber> dist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.CLOSEST_POINTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ1", "", dimobj1, object.class));
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ2", "", dimobj2, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@UNIT", unit);
//			cmd.addParameter("@DIST", NNumber.class);
//				
//			cmd.execute();
//			dist.val = cmd.getParameterValue("@DIST", NNumber.class);
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  Fclosestpoints3d( geometry1, geometry2,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.CLOSESTPOINTS3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMETRY1", geometry1);
//			cmd.addParameter("@GEOMETRY2", geometry2);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NString Fcontains( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.CONTAINS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fcontains( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.CONTAINS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fcontains( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.CONTAINS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fcontains( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.CONTAINS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static  Fconvexhull(List<SdoDimArrayRow> dimobj, geomobj) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.CONVEXHULL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ", "", dimobj, object.class));
//			cmd.addParameter("@GEOMOBJ", geomobj);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NString Fcoveredby( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.COVEREDBY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fcoveredby( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.COVEREDBY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fcoveredby( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.COVEREDBY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fcoveredby( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.COVEREDBY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fcovers( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.COVERS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fcovers( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.COVERS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fcovers( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.COVERS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fcovers( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.COVERS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void distance(List<SdoDimArrayRow> dimobj1, geom1,List<SdoDimArrayRow> dimobj2, geom2,Ref<NNumber> dist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.DISTANCE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ1", "", dimobj1, object.class));
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ2", "", dimobj2, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@DIST", NNumber.class);
//				
//			cmd.execute();
//			dist.val = cmd.getParameterValue("@DIST", NNumber.class);
//
//
//		}
//		
//		public static void distance(List<SdoDimArrayRow> dimobj1, geom1,List<SdoDimArrayRow> dimobj2, geom2,NString unit,Ref<NNumber> dist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.DISTANCE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ1", "", dimobj1, object.class));
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ2", "", dimobj2, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@UNIT", unit);
//			cmd.addParameter("@DIST", NNumber.class);
//				
//			cmd.execute();
//			dist.val = cmd.getParameterValue("@DIST", NNumber.class);
//
//
//		}
//		
//		public static NNumber Fdistance3d( geometry1, geometry2,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.DISTANCE3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOMETRY1", geometry1);
//			cmd.addParameter("@GEOMETRY2", geometry2);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static void divideRingByPoints( inpgeom, leftpt, rightpt,List<SdoDimArrayRow> dim,Ref<> topLine,Ref<> botLine) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.DIVIDE_RING_BY_POINTS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INPGEOM", inpgeom);
//			cmd.addParameter("@LEFTPT", leftpt);
//			cmd.addParameter("@RIGHTPT", rightpt);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@TOP_LINE", .class);
//			cmd.addParameter("@BOT_LINE", .class);
//				
//			cmd.execute();
//			topLine.val = cmd.getParameterValue("@TOP_LINE", .class);
//			botLine.val = cmd.getParameterValue("@BOT_LINE", .class);
//
//
//		}
//		
//		public static NString Fequal( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.EQUAL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fequal( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.EQUAL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fequal( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.EQUAL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fequal( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.EQUAL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void extentOfObject(List<SdoDimArrayRow> dimobj, geomobj,Ref<NNumber> minX,Ref<NNumber> maxX,Ref<NNumber> minY,Ref<NNumber> maxY) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.EXTENT_OF_OBJECT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ", "", dimobj, object.class));
//			cmd.addParameter("@GEOMOBJ", geomobj);
//			cmd.addParameter("@MIN_X", NNumber.class);
//			cmd.addParameter("@MAX_X", NNumber.class);
//			cmd.addParameter("@MIN_Y", NNumber.class);
//			cmd.addParameter("@MAX_Y", NNumber.class);
//				
//			cmd.execute();
//			minX.val = cmd.getParameterValue("@MIN_X", NNumber.class);
//			maxX.val = cmd.getParameterValue("@MAX_X", NNumber.class);
//			minY.val = cmd.getParameterValue("@MIN_Y", NNumber.class);
//			maxY.val = cmd.getParameterValue("@MAX_Y", NNumber.class);
//
//
//		}
//		
//		public static NString filter( geom1, geom2,NString mask, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.FILTER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString filter( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.FILTER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString filter( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.FILTER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString filter( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.FILTER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString filter( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.FILTER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString filter( geom1, geom2, rid,NString mask,NString tab1,NString tab2,NNumber sdoLevel,NNumber sdoNtiles,NNumber winNdim, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.FILTER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@RID", rid);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@TAB1", tab1);
//			cmd.addParameter("@TAB2", tab2);
//			cmd.addParameter("@SDO_LEVEL", sdoLevel);
//			cmd.addParameter("@SDO_NTILES", sdoNtiles);
//			cmd.addParameter("@WIN_NDIM", winNdim);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static  Fg3dconv( geom,List<SdoDimArrayRow> dim) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.G3DCONV", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgenerateBuffer(List<SdoDimArrayRow> dimobj, geomobj,NNumber dist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.GENERATE_BUFFER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ", "", dimobj, object.class));
//			cmd.addParameter("@GEOMOBJ", geomobj);
//			cmd.addParameter("@DIST", dist);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgenerateBuffer(List<SdoDimArrayRow> dimobj, geomobj,NNumber dist,NString _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.GENERATE_BUFFER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ", "", dimobj, object.class));
//			cmd.addParameter("@GEOMOBJ", geomobj);
//			cmd.addParameter("@DIST", dist);
//			cmd.addParameter("@PARAMS", _params);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgenerateBuffer( geomobj,NNumber dist,NNumber sma,NNumber iflat,NNumber arct) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.GENERATE_BUFFER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOMOBJ", geomobj);
//			cmd.addParameter("@DIST", dist);
//			cmd.addParameter("@SMA", sma);
//			cmd.addParameter("@IFLAT", iflat);
//			cmd.addParameter("@ARCT", arct);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static void geodextentOfObject(List<SdoDimArrayRow> dim, geom,NNumber srid,Ref<NNumber> ominX,Ref<NNumber> omaxX,Ref<NNumber> ominY,Ref<NNumber> omaxY) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.GEODEXTENT_OF_OBJECT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@SRID", srid);
//			cmd.addParameter("@OMIN_X", NNumber.class);
//			cmd.addParameter("@OMAX_X", NNumber.class);
//			cmd.addParameter("@OMIN_Y", NNumber.class);
//			cmd.addParameter("@OMAX_Y", NNumber.class);
//				
//			cmd.execute();
//			ominX.val = cmd.getParameterValue("@OMIN_X", NNumber.class);
//			omaxX.val = cmd.getParameterValue("@OMAX_X", NNumber.class);
//			ominY.val = cmd.getParameterValue("@OMIN_Y", NNumber.class);
//			omaxY.val = cmd.getParameterValue("@OMAX_Y", NNumber.class);
//
//
//		}
//		
//		public static  FgeomOperation(List<SdoDimArrayRow> dimobj1, geomobj1,NInteger operation,List<SdoDimArrayRow> dimobj2, geomobj2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.GEOM_OPERATION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ1", "", dimobj1, object.class));
//			cmd.addParameter("@GEOMOBJ1", geomobj1);
//			cmd.addParameter("@OPERATION", operation);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ2", "", dimobj2, object.class));
//			cmd.addParameter("@GEOMOBJ2", geomobj2);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NString Finside( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.INSIDE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Finside( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.INSIDE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Finside( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.INSIDE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Finside( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.INSIDE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Finside3d( geometry1, geometry2,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.INSIDE3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOMETRY1", geometry1);
//			cmd.addParameter("@GEOMETRY2", geometry2);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void lengthArea(List<SdoDimArrayRow> dimobj, geomobj,NInteger flag,Ref<NNumber> length,Ref<NNumber> area) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.LENGTH_AREA", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ", "", dimobj, object.class));
//			cmd.addParameter("@GEOMOBJ", geomobj);
//			cmd.addParameter("@FLAG", flag);
//			cmd.addParameter("@LENGTH", NNumber.class);
//			cmd.addParameter("@AREA", NNumber.class);
//				
//			cmd.execute();
//			length.val = cmd.getParameterValue("@LENGTH", NNumber.class);
//			area.val = cmd.getParameterValue("@AREA", NNumber.class);
//
//
//		}
//		
//		public static void lengthArea(List<SdoDimArrayRow> dimobj, geomobj,NInteger flag,NString unit,Ref<NNumber> length,Ref<NNumber> area) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.LENGTH_AREA", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ", "", dimobj, object.class));
//			cmd.addParameter("@GEOMOBJ", geomobj);
//			cmd.addParameter("@FLAG", flag);
//			cmd.addParameter("@UNIT", unit);
//			cmd.addParameter("@LENGTH", NNumber.class);
//			cmd.addParameter("@AREA", NNumber.class);
//				
//			cmd.execute();
//			length.val = cmd.getParameterValue("@LENGTH", NNumber.class);
//			area.val = cmd.getParameterValue("@AREA", NNumber.class);
//
//
//		}
//		
//		public static NNumber Flength3d( geometry,NNumber countSharedEdges,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.LENGTH3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@COUNT_SHARED_EDGES", countSharedEdges);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  FmakeRingFromLines( first, second) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.MAKE_RING_FROM_LINES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@FIRST", first);
//			cmd.addParameter("@SECOND", second);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FmbrGeometry( geom,List<SdoDimArrayRow> dim) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.MBR_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NString FmemoryLeak( geomobj) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.MEMORY_LEAK", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOMOBJ", geomobj);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Foverlap( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.OVERLAP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Foverlap( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.OVERLAP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Foverlap( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.OVERLAP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Foverlap( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.OVERLAP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Foverlapbdydisjoint( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.OVERLAPBDYDISJOINT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Foverlapbdydisjoint( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.OVERLAPBDYDISJOINT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Foverlapbdydisjoint( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.OVERLAPBDYDISJOINT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Foverlapbdydisjoint( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.OVERLAPBDYDISJOINT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Foverlapbdyintersect( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.OVERLAPBDYINTERSECT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Foverlapbdyintersect( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.OVERLAPBDYINTERSECT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Foverlapbdyintersect( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.OVERLAPBDYINTERSECT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Foverlapbdyintersect( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.OVERLAPBDYINTERSECT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static BLOB Fpctrclip( qry, otherQry,BLOB pts,NNumber npts,NNumber totdim,BLOB trs,NNumber ntrs,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.PCTRCLIP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(BLOB.class);
//			cmd.addParameter("@QRY", qry);
//			cmd.addParameter("@OTHER_QRY", otherQry);
//			cmd.addParameter("@PTS", pts);
//			cmd.addParameter("@NPTS", npts);
//			cmd.addParameter("@TOTDIM", totdim);
//			cmd.addParameter("@TRS", trs);
//			cmd.addParameter("@NTRS", ntrs);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(BLOB.class);
//
//		}
//		
//		public static  Fpointonsurface(List<SdoDimArrayRow> dimobj, geomobj) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.POINTONSURFACE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ", "", dimobj, object.class));
//			cmd.addParameter("@GEOMOBJ", geomobj);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static void registerUdt(NString idxtype,NString idxmethod,NString idxPackage,NString udt,NString udtFilter,NString udtRelate,NString udtWd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.REGISTER_UDT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@IDXTYPE", idxtype);
//			cmd.addParameter("@IDXMETHOD", idxmethod);
//			cmd.addParameter("@IDX_PACKAGE", idxPackage);
//			cmd.addParameter("@UDT", udt);
//			cmd.addParameter("@UDT_FILTER", udtFilter);
//			cmd.addParameter("@UDT_RELATE", udtRelate);
//			cmd.addParameter("@UDT_WD", udtWd);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static NString Frelate(List<SdoDimArrayRow> dimobj1, geomobj1,NInteger flag,List<SdoDimArrayRow> dimobj2, geomobj2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.RELATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ1", "", dimobj1, object.class));
//			cmd.addParameter("@GEOMOBJ1", geomobj1);
//			cmd.addParameter("@FLAG", flag);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ2", "", dimobj2, object.class));
//			cmd.addParameter("@GEOMOBJ2", geomobj2);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Frelate(List<SdoDimArrayRow> dimobj1, geomobj1,NString _params,List<SdoDimArrayRow> dimobj2, geomobj2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.RELATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ1", "", dimobj1, object.class));
//			cmd.addParameter("@GEOMOBJ1", geomobj1);
//			cmd.addParameter("@PARAMS", _params);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ2", "", dimobj2, object.class));
//			cmd.addParameter("@GEOMOBJ2", geomobj2);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Frelate( geom1, geom2,NString mask, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.RELATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Frelate( geom1, geom2,NString mask, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.RELATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Frelate( geom1, geom2,NString mask, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.RELATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Frelate( geom1, geom2,NString mask, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.RELATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Frelate( geom1, geom2, rid,NString mask,NString tab1,NString tab2,NNumber sdoLevel,NNumber sdoNtiles,NNumber winNdim, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.RELATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@RID", rid);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@TAB1", tab1);
//			cmd.addParameter("@TAB2", tab2);
//			cmd.addParameter("@SDO_LEVEL", sdoLevel);
//			cmd.addParameter("@SDO_NTILES", sdoNtiles);
//			cmd.addParameter("@WIN_NDIM", winNdim);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Frelate( geom1, geom2,NString mask,NString tab1,NString col1) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.RELATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@TAB1", tab1);
//			cmd.addParameter("@COL1", col1);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FrelateProcess(NString mask,NString result,NString lookup) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.RELATE_PROCESS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@RESULT", result);
//			cmd.addParameter("@LOOKUP", lookup);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Frelateg3d( geom1, geom2,NString mask,List<SdoDimArrayRow> dim) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.RELATEG3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@MASK", mask);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void removeDuplicateVertices(Ref<> geom,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.REMOVE_DUPLICATE_VERTICES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM", geom, true);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//			geom.val = cmd.getParameterValue("@GEOM", .class);
//
//
//		}
//		
//		public static  FringUnionApprox( geom,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.RING_UNION_APPROX", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FsdoCentroid( geom1,List<SdoDimArrayRow> dim1, geom2,List<SdoDimArrayRow> dim2,Ref<NNumber> opType,Ref<NNumber> opAreaVol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.SDO_CENTROID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//			cmd.addParameter("@OP_TYPE", opType, true);
//			cmd.addParameter("@OP_AREA_VOL", opAreaVol, true);
//				
//			cmd.execute();
//			opType.val = cmd.getParameterValue("@OP_TYPE", NNumber.class);
//			opAreaVol.val = cmd.getParameterValue("@OP_AREA_VOL", NNumber.class);
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FsdoConvexhull( geom1,List<SdoDimArrayRow> dim1, geom2,List<SdoDimArrayRow> dim2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.SDO_CONVEXHULL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FsdoMbr( geom1, geom2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.SDO_MBR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NString Fsdoon( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.SDOON", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fsdoon( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.SDOON", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fsdoon( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.SDOON", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fsdoon( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.SDOON", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Ftouch( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.TOUCH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Ftouch( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.TOUCH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Ftouch( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.TOUCH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Ftouch( geom1, geom2, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.TOUCH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FvalidateGeom( geomobj,List<SdoDimArrayRow> dimobj) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.VALIDATE_GEOM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOMOBJ", geomobj);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ", "", dimobj, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void validateGeomWithContext( geomobj,List<SdoDimArrayRow> dimobj,Ref<NString> rstr) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.VALIDATE_GEOM_WITH_CONTEXT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOMOBJ", geomobj);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ", "", dimobj, object.class));
//			cmd.addParameter("@RSTR", rstr, true);
//				
//			cmd.execute();
//			rstr.val = cmd.getParameterValue("@RSTR", NString.class);
//
//
//		}
//		
//		public static void validateLayerWithContext(NString geomTable,NString geomColumn,NString resultTable,NNumber commitInterval, indexinfo,NString resultColumn,NString resultRowid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.VALIDATE_LAYER_WITH_CONTEXT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM_TABLE", geomTable);
//			cmd.addParameter("@GEOM_COLUMN", geomColumn);
//			cmd.addParameter("@RESULT_TABLE", resultTable);
//			cmd.addParameter("@COMMIT_INTERVAL", commitInterval);
//			cmd.addParameter("@INDEXINFO", indexinfo);
//			cmd.addParameter("@RESULT_COLUMN", resultColumn);
//			cmd.addParameter("@RESULT_ROWID", resultRowid);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static NNumber FvalidateLayerWithContext3d(NString geomTable,NString geomColumn,NString resultTable,NNumber commitInterval,NString conditional,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.VALIDATE_LAYER_WITH_CONTEXT3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM_TABLE", geomTable);
//			cmd.addParameter("@GEOM_COLUMN", geomColumn);
//			cmd.addParameter("@RESULT_TABLE", resultTable);
//			cmd.addParameter("@COMMIT_INTERVAL", commitInterval);
//			cmd.addParameter("@CONDITIONAL", conditional);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NString Fvalidategeom3d( geometry,NString conditional,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.VALIDATEGEOM3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@CONDITIONAL", conditional);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NNumber Fvolume3d( geometry,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.VOLUME3D", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOMETRY", geometry);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NString FwithinDistance(List<SdoDimArrayRow> dimobj1, geomobj1,NNumber dist,List<SdoDimArrayRow> dimobj2, geomobj2,NString units) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.WITHIN_DISTANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ1", "", dimobj1, object.class));
//			cmd.addParameter("@GEOMOBJ1", geomobj1);
//			cmd.addParameter("@DIST", dist);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ2", "", dimobj2, object.class));
//			cmd.addParameter("@GEOMOBJ2", geomobj2);
//			cmd.addParameter("@UNITS", units);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FwithinDistance( geom1, geom2,NString mask, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.WITHIN_DISTANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FwithinDistance( geom1, geom2,NString mask, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.WITHIN_DISTANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FwithinDistance( geom1, geom2,NString mask, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.WITHIN_DISTANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FwithinDistance( geom1, geom2,NString mask, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.WITHIN_DISTANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@IDX_CTX", idxCtx);
//			cmd.addParameter("@SCTX", sctx, true);
//			cmd.addParameter("@SCNFLAG", scnflag);
//				
//			cmd.execute();
//			sctx.val = cmd.getParameterValue("@SCTX", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FwithinDistance(List<SdoDimArrayRow> dimobj1, geomobj1,NString _params,List<SdoDimArrayRow> dimobj2, geomobj2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_3GL.WITHIN_DISTANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ1", "", dimobj1, object.class));
//			cmd.addParameter("@GEOMOBJ1", geomobj1);
//			cmd.addParameter("@PARAMS", _params);
//			// cmd.addParameter(DbTypes.getCollectionType("DIMOBJ2", "", dimobj2, object.class));
//			cmd.addParameter("@GEOMOBJ2", geomobj2);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//	
//	
//	
//}
