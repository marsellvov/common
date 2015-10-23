package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoSam {
//		public static NNumber FaggregatesForGeometry(NString themeName,NString themeColname,NString aggrTypeString,NString aggrColString, geom,NString dstSpec,NNumber dstOffset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SAM.AGGREGATES_FOR_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@THEME_NAME", themeName);
//			cmd.addParameter("@THEME_COLNAME", themeColname);
//			cmd.addParameter("@AGGR_TYPE_STRING", aggrTypeString);
//			cmd.addParameter("@AGGR_COL_STRING", aggrColString);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@DST_SPEC", dstSpec);
//			cmd.addParameter("@DST_OFFSET", dstOffset);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static List<SdoRegaggrsetRow> FaggregatesForLayer(NString themeName,NString themeColname,NString aggrTypeString,NString aggrColString,NString tablename,NString colname,NString dstSpec,NNumber dstOffset,NNumber zeroAggRows) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SAM.AGGREGATES_FOR_LAYER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoRegaggrsetRow>.class);
//			cmd.addParameter("@THEME_NAME", themeName);
//			cmd.addParameter("@THEME_COLNAME", themeColname);
//			cmd.addParameter("@AGGR_TYPE_STRING", aggrTypeString);
//			cmd.addParameter("@AGGR_COL_STRING", aggrColString);
//			cmd.addParameter("@TABLENAME", tablename);
//			cmd.addParameter("@COLNAME", colname);
//			cmd.addParameter("@DST_SPEC", dstSpec);
//			cmd.addParameter("@DST_OFFSET", dstOffset);
//			cmd.addParameter("@ZERO_AGG_ROWS", zeroAggRows);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoRegaggrsetRow>.class);
//
//		}
		
//		public static NNumber FbinGeometry( geom,List<SdoDimArrayRow> dim,NString binTablename,NString binColname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SAM.BIN_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@BIN_TABLENAME", binTablename);
//			cmd.addParameter("@BIN_COLNAME", binColname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FbinGeometry( geom,NNumber tol,NString binTablename,NString binColname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SAM.BIN_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOL", tol);
//			cmd.addParameter("@BIN_TABLENAME", binTablename);
//			cmd.addParameter("@BIN_COLNAME", binColname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static void binLayer(NString tablename,NString colname,NString binTablename,NString binColname,NString binIdColname,NNumber commitInterval) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SAM.BIN_LAYER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@COLNAME", colname);
			cmd.addParameter("@BIN_TABLENAME", binTablename);
			cmd.addParameter("@BIN_COLNAME", binColname);
			cmd.addParameter("@BIN_ID_COLNAME", binIdColname);
			cmd.addParameter("@COMMIT_INTERVAL", commitInterval);
				
			cmd.execute();


		}
		
		public static void colocatedReferenceFeatures(NString themeTablename,NString themeColname,NString themePredicate,NString tablename,NString colname,NString refPredicate,NString dstSpec,NString resultTablename,NNumber commitInterval) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SAM.COLOCATED_REFERENCE_FEATURES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@THEME_TABLENAME", themeTablename);
			cmd.addParameter("@THEME_COLNAME", themeColname);
			cmd.addParameter("@THEME_PREDICATE", themePredicate);
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@COLNAME", colname);
			cmd.addParameter("@REF_PREDICATE", refPredicate);
			cmd.addParameter("@DST_SPEC", dstSpec);
			cmd.addParameter("@RESULT_TABLENAME", resultTablename);
			cmd.addParameter("@COMMIT_INTERVAL", commitInterval);
				
			cmd.execute();


		}
		
//		public static NNumber FintersectionRatio( location, thematicBoundary,List<SdoDimArrayRow> dim,NNumber dist,NString units) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SAM.INTERSECTION_RATIO", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@LOCATION", location);
//			cmd.addParameter("@THEMATIC_BOUNDARY", thematicBoundary);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@DIST", dist);
//			cmd.addParameter("@UNITS", units);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static  FsimplifyGeometry( geom,List<SdoDimArrayRow> dim,NNumber pctAreaChangeLimit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SAM.SIMPLIFY_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@PCT_AREA_CHANGE_LIMIT", pctAreaChangeLimit);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsimplifyGeometry( geom,NNumber tol,NNumber pctAreaChangeLimit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SAM.SIMPLIFY_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOL", tol);
//			cmd.addParameter("@PCT_AREA_CHANGE_LIMIT", pctAreaChangeLimit);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void simplifyLayer(NString themeTablename,NString themeColname,NString smplGeomColname,NNumber commitInterval,NNumber pctAreaChangeLimit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SAM.SIMPLIFY_LAYER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@THEME_TABLENAME", themeTablename);
			cmd.addParameter("@THEME_COLNAME", themeColname);
			cmd.addParameter("@SMPL_GEOM_COLNAME", smplGeomColname);
			cmd.addParameter("@COMMIT_INTERVAL", commitInterval);
			cmd.addParameter("@PCT_AREA_CHANGE_LIMIT", pctAreaChangeLimit);
				
			cmd.execute();


		}
		
//		public static List<SdoRegionsetRow> FspatialClusters(NString tablename,NString colname,NNumber maxClusters,NString allowOutliers,NString tablepartition) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SAM.SPATIAL_CLUSTERS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoRegionsetRow>.class);
//			cmd.addParameter("@TABLENAME", tablename);
//			cmd.addParameter("@COLNAME", colname);
//			cmd.addParameter("@MAX_CLUSTERS", maxClusters);
//			cmd.addParameter("@ALLOW_OUTLIERS", allowOutliers);
//			cmd.addParameter("@TABLEPARTITION", tablepartition);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoRegionsetRow>.class);
//
//		}
		
//		public static List<SdoRegaggrsetRow> FtiledAggregates(NString themeName,NString themeColname,NString aggrTypeString,NString aggrColString,NNumber tilingLevel,List<SdoDimArrayRow> tilingDomain,NNumber zeroAggTiles,NNumber xdivs,NNumber ydivs) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SAM.TILED_AGGREGATES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoRegaggrsetRow>.class);
//			cmd.addParameter("@THEME_NAME", themeName);
//			cmd.addParameter("@THEME_COLNAME", themeColname);
//			cmd.addParameter("@AGGR_TYPE_STRING", aggrTypeString);
//			cmd.addParameter("@AGGR_COL_STRING", aggrColString);
//			cmd.addParameter("@TILING_LEVEL", tilingLevel);
//			// cmd.addParameter(DbTypes.getCollectionType("TILING_DOMAIN", "", tilingDomain, object.class));
//			cmd.addParameter("@ZERO_AGG_TILES", zeroAggTiles);
//			cmd.addParameter("@XDIVS", xdivs);
//			cmd.addParameter("@YDIVS", ydivs);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoRegaggrsetRow>.class);
//
//		}
		
//		public static List<SdoRegionsetRow> FtiledBins(NNumber l1,NNumber u1,NNumber l2,NNumber u2,NNumber tilingLevel,NNumber srid,NNumber xdivs,NNumber ydivs) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SAM.TILED_BINS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoRegionsetRow>.class);
//			cmd.addParameter("@L1", l1);
//			cmd.addParameter("@U1", u1);
//			cmd.addParameter("@L2", l2);
//			cmd.addParameter("@U2", u2);
//			cmd.addParameter("@TILING_LEVEL", tilingLevel);
//			cmd.addParameter("@SRID", srid);
//			cmd.addParameter("@XDIVS", xdivs);
//			cmd.addParameter("@YDIVS", ydivs);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoRegionsetRow>.class);
//
//		}
		
	
	
	
}
