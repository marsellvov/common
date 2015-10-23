package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoRtreeAdmin {
		public static NNumber FdataCount(NString schemaname,NString tabname,NString indexname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_RTREE_ADMIN.DATA_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SCHEMANAME", schemaname);
			cmd.addParameter("@TABNAME", tabname);
			cmd.addParameter("@INDEXNAME", indexname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NString filter( geom, geom2,NString mask, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_RTREE_ADMIN.FILTER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM", geom);
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
		
//		public static NString Fnn( geom, geom2,NString mask, idxCtx,Ref<> sctx,NNumber scnflag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_RTREE_ADMIN.NN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM", geom);
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
		
		public static void populateRootMbrs(NString schemaname,NString indexname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_RTREE_ADMIN.POPULATE_ROOT_MBRS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SCHEMANAME", schemaname);
			cmd.addParameter("@INDEXNAME", indexname);
				
			cmd.execute();


		}
		
		public static void rtreeAnalyze(NString schemaname,NString indexname,Ref<NString> idxTab,Ref<NNumber> prevQlty,Ref<NNumber> qlty) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_RTREE_ADMIN.RTREE_ANALYZE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SCHEMANAME", schemaname);
			cmd.addParameter("@INDEXNAME", indexname);
			cmd.addParameter("@IDX_TAB", NString.class);
			cmd.addParameter("@PREV_QLTY", NNumber.class);
			cmd.addParameter("@QLTY", NNumber.class);
				
			cmd.execute();
			idxTab.val = cmd.getParameterValue("@IDX_TAB", NString.class);
			prevQlty.val = cmd.getParameterValue("@PREV_QLTY", NNumber.class);
			qlty.val = cmd.getParameterValue("@QLTY", NNumber.class);


		}
		
//		public static  FsdoRtreeChildmbrs(NString schemaname,NString indextable,NNumber dim,NString rid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_RTREE_ADMIN.SDO_RTREE_CHILDMBRS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@SCHEMANAME", schemaname);
//			cmd.addParameter("@INDEXTABLE", indextable);
//			cmd.addParameter("@DIM", dim);
//			cmd.addParameter("@RID", rid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static List<OdciridlistRow> FsdoRtreeChildrids(NString schemaname,NString indextable,NNumber dim,NString rid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_RTREE_ADMIN.SDO_RTREE_CHILDRIDS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<OdciridlistRow>.class);
//			cmd.addParameter("@SCHEMANAME", schemaname);
//			cmd.addParameter("@INDEXTABLE", indextable);
//			cmd.addParameter("@DIM", dim);
//			cmd.addParameter("@RID", rid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<OdciridlistRow>.class);
//
//		}
		
//		public static List<SdoridlistRow> FsdoRtreeDescrids(NString schemaname,NString indexname,NNumber descLevel,NString indexpartition) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_RTREE_ADMIN.SDO_RTREE_DESCRIDS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoridlistRow>.class);
//			cmd.addParameter("@SCHEMANAME", schemaname);
//			cmd.addParameter("@INDEXNAME", indexname);
//			cmd.addParameter("@DESC_LEVEL", descLevel);
//			cmd.addParameter("@INDEXPARTITION", indexpartition);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoridlistRow>.class);
//
//		}
//		
//		public static  FsdoRtreeNdextent(NString schemaname,NString indextable,NNumber dim,NString rid,NNumber srid,NNumber isgeodetic) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_RTREE_ADMIN.SDO_RTREE_NDEXTENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@SCHEMANAME", schemaname);
//			cmd.addParameter("@INDEXTABLE", indextable);
//			cmd.addParameter("@DIM", dim);
//			cmd.addParameter("@RID", rid);
//			cmd.addParameter("@SRID", srid);
//			cmd.addParameter("@ISGEODETIC", isgeodetic);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
	
	
	
}
