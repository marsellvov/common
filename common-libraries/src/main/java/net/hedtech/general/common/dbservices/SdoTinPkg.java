package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoTinPkg {
//		public static List<SdoTinBlkTypeRow> FclipTin( inp, qry,NNumber qryMinRes,NNumber qryMaxRes,NNumber blkno) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TIN_PKG.CLIP_TIN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoTinBlkTypeRow>.class);
//			cmd.addParameter("@INP", inp);
//			cmd.addParameter("@QRY", qry);
//			cmd.addParameter("@QRY_MIN_RES", qryMinRes);
//			cmd.addParameter("@QRY_MAX_RES", qryMaxRes);
//			cmd.addParameter("@BLKNO", blkno);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoTinBlkTypeRow>.class);
//
//		}
//		
		public static void createTin(NString inp,NString inptable,NString clstpcdatatbl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TIN_PKG.CREATE_TIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INP", inp);
			cmd.addParameter("@INPTABLE", inptable);
			cmd.addParameter("@CLSTPCDATATBL", clstpcdatatbl);
				
			cmd.execute();


		}
		
		public static void dropDependencies(NString basetable,NString col) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TIN_PKG.DROP_DEPENDENCIES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BASETABLE", basetable);
			cmd.addParameter("@COL", col);
				
			cmd.execute();


		}
		
//		public static  Finit(NString basetable,NString basecol,NString blktable,NString ptnParams, tinExtent,NNumber tinTol,NNumber tinTotDimensions, tinDomain, tinBreakLines, tinStopLines, tinVoidRgns,List<SdoStringArrayRow> tinValAttrTables, tinOtherAttrs) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TIN_PKG.INIT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@BASETABLE", basetable);
//			cmd.addParameter("@BASECOL", basecol);
//			cmd.addParameter("@BLKTABLE", blktable);
//			cmd.addParameter("@PTN_PARAMS", ptnParams);
//			cmd.addParameter("@TIN_EXTENT", tinExtent);
//			cmd.addParameter("@TIN_TOL", tinTol);
//			cmd.addParameter("@TIN_TOT_DIMENSIONS", tinTotDimensions);
//			cmd.addParameter("@TIN_DOMAIN", tinDomain);
//			cmd.addParameter("@TIN_BREAK_LINES", tinBreakLines);
//			cmd.addParameter("@TIN_STOP_LINES", tinStopLines);
//			cmd.addParameter("@TIN_VOID_RGNS", tinVoidRgns);
//			// cmd.addParameter(DbTypes.getCollectionType("TIN_VAL_ATTR_TABLES", "", tinValAttrTables, object.class));
//			cmd.addParameter("@TIN_OTHER_ATTRS", tinOtherAttrs);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FtoGeometry(OraBlob pts,OraBlob trs,NNumber numPts,NNumber numTrs,NNumber tinIndDim,NNumber tinTotDim,NNumber srid, blkDomain) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_TIN_PKG.TO_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@PTS", pts);
//			cmd.addParameter("@TRS", trs);
//			cmd.addParameter("@NUM_PTS", numPts);
//			cmd.addParameter("@NUM_TRS", numTrs);
//			cmd.addParameter("@TIN_IND_DIM", tinIndDim);
//			cmd.addParameter("@TIN_TOT_DIM", tinTotDim);
//			cmd.addParameter("@SRID", srid);
//			cmd.addParameter("@BLK_DOMAIN", blkDomain);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
	
	
	
}
