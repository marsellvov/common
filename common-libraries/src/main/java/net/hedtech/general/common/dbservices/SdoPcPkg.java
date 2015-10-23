package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoPcPkg {
//		public static List<SdoPcBlkTypeRow> FclipPc( inp, indDimQry, otherDimQry,NNumber qryMinRes,NNumber qryMaxRes,NNumber blkno) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PC_PKG.CLIP_PC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoPcBlkTypeRow>.class);
//			cmd.addParameter("@INP", inp);
//			cmd.addParameter("@IND_DIM_QRY", indDimQry);
//			cmd.addParameter("@OTHER_DIM_QRY", otherDimQry);
//			cmd.addParameter("@QRY_MIN_RES", qryMinRes);
//			cmd.addParameter("@QRY_MAX_RES", qryMaxRes);
//			cmd.addParameter("@BLKNO", blkno);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoPcBlkTypeRow>.class);
//
//		}
		
		public static void createPc(NString inp,NString inptable,NString clstpcdatatbl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PC_PKG.CREATE_PC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INP", inp);
			cmd.addParameter("@INPTABLE", inptable);
			cmd.addParameter("@CLSTPCDATATBL", clstpcdatatbl);
				
			cmd.execute();


		}
		
		public static void dropDependencies(NString basetable,NString col) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PC_PKG.DROP_DEPENDENCIES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BASETABLE", basetable);
			cmd.addParameter("@COL", col);
				
			cmd.execute();


		}
		
//		public static List<SdoNumberArrayRow> FgetPtIds(BLOB pts,NNumber numPts,NNumber pcTotDim, blkDomain) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PC_PKG.GET_PT_IDS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@PTS", pts);
//			cmd.addParameter("@NUM_PTS", numPts);
//			cmd.addParameter("@PC_TOT_DIM", pcTotDim);
//			cmd.addParameter("@BLK_DOMAIN", blkDomain);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
		
//		public static  Finit(NString basetable,NString basecol,NString blktable,NString ptnParams, pcExtent,NNumber pcTol,NNumber pcTotDimensions, pcDomain,List<SdoStringArrayRow> pcValAttrTables, pcOtherAttrs) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PC_PKG.INIT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@BASETABLE", basetable);
//			cmd.addParameter("@BASECOL", basecol);
//			cmd.addParameter("@BLKTABLE", blktable);
//			cmd.addParameter("@PTN_PARAMS", ptnParams);
//			cmd.addParameter("@PC_EXTENT", pcExtent);
//			cmd.addParameter("@PC_TOL", pcTol);
//			cmd.addParameter("@PC_TOT_DIMENSIONS", pcTotDimensions);
//			cmd.addParameter("@PC_DOMAIN", pcDomain);
//			// cmd.addParameter(DbTypes.getCollectionType("PC_VAL_ATTR_TABLES", "", pcValAttrTables, object.class));
//			cmd.addParameter("@PC_OTHER_ATTRS", pcOtherAttrs);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FtoGeometry(BLOB pts,NNumber numPts,NNumber pcTotDim,NNumber srid, blkDomain) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_PC_PKG.TO_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@PTS", pts);
//			cmd.addParameter("@NUM_PTS", numPts);
//			cmd.addParameter("@PC_TOT_DIM", pcTotDim);
//			cmd.addParameter("@SRID", srid);
//			cmd.addParameter("@BLK_DOMAIN", blkDomain);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
	
	
	
}
