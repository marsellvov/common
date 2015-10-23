package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoGeorAux {
//		public static void afterdelete( oldgeoraster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.AFTERDELETE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@OLDGEORASTER", oldgeoraster);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void afterinsert(NString tablename,NString columnname, newgeoraster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.AFTERINSERT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TABLENAME", tablename);
//			cmd.addParameter("@COLUMNNAME", columnname);
//			cmd.addParameter("@NEWGEORASTER", newgeoraster);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void afterupdate(NString tablename,NString columnname, oldgeoraster, newgeoraster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.AFTERUPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TABLENAME", tablename);
//			cmd.addParameter("@COLUMNNAME", columnname);
//			cmd.addParameter("@OLDGEORASTER", oldgeoraster);
//			cmd.addParameter("@NEWGEORASTER", newgeoraster);
//				
//			cmd.execute();
//
//
//		}
		
//		public static NString Fcompressdata(NString method,OraBlob src,Ref<OraBlob> dst,NNumber celldepth,NNumber width,NNumber height,NNumber numbands,NNumber interleaving,NNumber quality) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.COMPRESSDATA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@METHOD", method);
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@DST", dst, true);
//			cmd.addParameter("@CELLDEPTH", celldepth);
//			cmd.addParameter("@WIDTH", width);
//			cmd.addParameter("@HEIGHT", height);
//			cmd.addParameter("@NUMBANDS", numbands);
//			cmd.addParameter("@INTERLEAVING", interleaving);
//			cmd.addParameter("@QUALITY", quality);
//				
//			cmd.execute();
//			dst.val = cmd.getParameterValue("@DST", OraBlob.class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString Fcompressdata(NString method,NString rdt1,NNumber rid1,NString rdt2,NNumber rid2,NNumber plevel,NNumber celldepth,NNumber width,NNumber height,NNumber numbands,NNumber interleaving,NNumber quality,NNumber rowdim,NNumber coldim) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.COMPRESSDATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@METHOD", method);
			cmd.addParameter("@RDT1", rdt1);
			cmd.addParameter("@RID1", rid1);
			cmd.addParameter("@RDT2", rdt2);
			cmd.addParameter("@RID2", rid2);
			cmd.addParameter("@PLEVEL", plevel);
			cmd.addParameter("@CELLDEPTH", celldepth);
			cmd.addParameter("@WIDTH", width);
			cmd.addParameter("@HEIGHT", height);
			cmd.addParameter("@NUMBANDS", numbands);
			cmd.addParameter("@INTERLEAVING", interleaving);
			cmd.addParameter("@QUALITY", quality);
			cmd.addParameter("@ROWDIM", rowdim);
			cmd.addParameter("@COLDIM", coldim);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString Fcompressdatawithcratio(NString method,OraBlob src,Ref<OraBlob> dst,NNumber celldepth,NNumber width,NNumber height,NNumber numbands,NNumber interleaving,NNumber cratio,NString colorspace) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.COMPRESSDATAWITHCRATIO", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@METHOD", method);
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@DST", dst, true);
//			cmd.addParameter("@CELLDEPTH", celldepth);
//			cmd.addParameter("@WIDTH", width);
//			cmd.addParameter("@HEIGHT", height);
//			cmd.addParameter("@NUMBANDS", numbands);
//			cmd.addParameter("@INTERLEAVING", interleaving);
//			cmd.addParameter("@CRATIO", cratio);
//			cmd.addParameter("@COLORSPACE", colorspace);
//				
//			cmd.execute();
//			dst.val = cmd.getParameterValue("@DST", OraBlob.class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString Fcompressdatawithcratio(NString method,NString rdt1,NNumber rid1,NString rdt2,NNumber rid2,NNumber plevel,NNumber celldepth,NNumber width,NNumber height,NNumber numbands,NNumber interleaving,NNumber cratio,NString colorspace,NNumber rowdim,NNumber coldim) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.COMPRESSDATAWITHCRATIO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@METHOD", method);
			cmd.addParameter("@RDT1", rdt1);
			cmd.addParameter("@RID1", rid1);
			cmd.addParameter("@RDT2", rdt2);
			cmd.addParameter("@RID2", rid2);
			cmd.addParameter("@PLEVEL", plevel);
			cmd.addParameter("@CELLDEPTH", celldepth);
			cmd.addParameter("@WIDTH", width);
			cmd.addParameter("@HEIGHT", height);
			cmd.addParameter("@NUMBANDS", numbands);
			cmd.addParameter("@INTERLEAVING", interleaving);
			cmd.addParameter("@CRATIO", cratio);
			cmd.addParameter("@COLORSPACE", colorspace);
			cmd.addParameter("@ROWDIM", rowdim);
			cmd.addParameter("@COLDIM", coldim);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString Fdecompressdata(NString method,OraBlob src,Ref<OraBlob> dst,NNumber celldepth,NNumber numbands,NNumber interleaving,NNumber quality) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.DECOMPRESSDATA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@METHOD", method);
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@DST", dst, true);
//			cmd.addParameter("@CELLDEPTH", celldepth);
//			cmd.addParameter("@NUMBANDS", numbands);
//			cmd.addParameter("@INTERLEAVING", interleaving);
//			cmd.addParameter("@QUALITY", quality);
//				
//			cmd.execute();
//			dst.val = cmd.getParameterValue("@DST", OraBlob.class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString Fdecompressdata(NString method,NString rdt1,NNumber rid1,NString rdt2,NNumber rid2,NNumber plevel,NNumber celldepth,NNumber numbands,NNumber interleaving,NNumber quality) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.DECOMPRESSDATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@METHOD", method);
			cmd.addParameter("@RDT1", rdt1);
			cmd.addParameter("@RID1", rid1);
			cmd.addParameter("@RDT2", rdt2);
			cmd.addParameter("@RID2", rid2);
			cmd.addParameter("@PLEVEL", plevel);
			cmd.addParameter("@CELLDEPTH", celldepth);
			cmd.addParameter("@NUMBANDS", numbands);
			cmd.addParameter("@INTERLEAVING", interleaving);
			cmd.addParameter("@QUALITY", quality);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString Fdecompressdatawithcratio(NString method,OraBlob src,Ref<OraBlob> dst,NNumber celldepth,NNumber numbands,NNumber interleaving,NNumber cratio,NNumber resolution,NNumber startpixx,NNumber startpixy,NNumber endpixx,NNumber endpixy,NString bands) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.DECOMPRESSDATAWITHCRATIO", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@METHOD", method);
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@DST", dst, true);
//			cmd.addParameter("@CELLDEPTH", celldepth);
//			cmd.addParameter("@NUMBANDS", numbands);
//			cmd.addParameter("@INTERLEAVING", interleaving);
//			cmd.addParameter("@CRATIO", cratio);
//			cmd.addParameter("@RESOLUTION", resolution);
//			cmd.addParameter("@STARTPIXX", startpixx);
//			cmd.addParameter("@STARTPIXY", startpixy);
//			cmd.addParameter("@ENDPIXX", endpixx);
//			cmd.addParameter("@ENDPIXY", endpixy);
//			cmd.addParameter("@BANDS", bands);
//				
//			cmd.execute();
//			dst.val = cmd.getParameterValue("@DST", OraBlob.class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString Fdecompressdatawithcratio(NString method,OraBlob src,Ref<OraBlob> dst,NNumber celldepth,NNumber numbands,NNumber interleaving,NNumber cratio,NNumber resolution) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.DECOMPRESSDATAWITHCRATIO", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@METHOD", method);
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@DST", dst, true);
//			cmd.addParameter("@CELLDEPTH", celldepth);
//			cmd.addParameter("@NUMBANDS", numbands);
//			cmd.addParameter("@INTERLEAVING", interleaving);
//			cmd.addParameter("@CRATIO", cratio);
//			cmd.addParameter("@RESOLUTION", resolution);
//				
//			cmd.execute();
//			dst.val = cmd.getParameterValue("@DST", OraBlob.class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString Fdecompressdatawithcratio(NString method,NString rdt1,NNumber rid1,Ref<OraBlob> dst,NNumber plevel,NNumber celldepth,NNumber numbands,NNumber interleaving,NNumber cratio,NNumber resolution,NNumber startpixy,NNumber startpixx,NNumber endpixy,NNumber endpixx,NString bands,NNumber rowblocksize,NNumber columnblocksize,NNumber ultx,NNumber ulty) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.DECOMPRESSDATAWITHCRATIO", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@METHOD", method);
//			cmd.addParameter("@RDT1", rdt1);
//			cmd.addParameter("@RID1", rid1);
//			cmd.addParameter("@DST", dst, true);
//			cmd.addParameter("@PLEVEL", plevel);
//			cmd.addParameter("@CELLDEPTH", celldepth);
//			cmd.addParameter("@NUMBANDS", numbands);
//			cmd.addParameter("@INTERLEAVING", interleaving);
//			cmd.addParameter("@CRATIO", cratio);
//			cmd.addParameter("@RESOLUTION", resolution);
//			cmd.addParameter("@STARTPIXY", startpixy);
//			cmd.addParameter("@STARTPIXX", startpixx);
//			cmd.addParameter("@ENDPIXY", endpixy);
//			cmd.addParameter("@ENDPIXX", endpixx);
//			cmd.addParameter("@BANDS", bands);
//			cmd.addParameter("@ROWBLOCKSIZE", rowblocksize);
//			cmd.addParameter("@COLUMNBLOCKSIZE", columnblocksize);
//			cmd.addParameter("@ULTX", ultx);
//			cmd.addParameter("@ULTY", ulty);
//				
//			cmd.execute();
//			dst.val = cmd.getParameterValue("@DST", OraBlob.class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString Fdecompressdatawithcratio(NString method,NString rdt1,NNumber rid1,NString rdt2,NNumber rid2,NNumber plevel,NNumber celldepth,NNumber numbands,NNumber interleaving,NNumber cratio,NNumber resolution,NNumber startpixx,NNumber startpixy,NNumber endpixx,NNumber endpixy,NString bands) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.DECOMPRESSDATAWITHCRATIO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@METHOD", method);
			cmd.addParameter("@RDT1", rdt1);
			cmd.addParameter("@RID1", rid1);
			cmd.addParameter("@RDT2", rdt2);
			cmd.addParameter("@RID2", rid2);
			cmd.addParameter("@PLEVEL", plevel);
			cmd.addParameter("@CELLDEPTH", celldepth);
			cmd.addParameter("@NUMBANDS", numbands);
			cmd.addParameter("@INTERLEAVING", interleaving);
			cmd.addParameter("@CRATIO", cratio);
			cmd.addParameter("@RESOLUTION", resolution);
			cmd.addParameter("@STARTPIXX", startpixx);
			cmd.addParameter("@STARTPIXY", startpixy);
			cmd.addParameter("@ENDPIXX", endpixx);
			cmd.addParameter("@ENDPIXY", endpixy);
			cmd.addParameter("@BANDS", bands);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fdecompressdatawithcratio(NString method,NString rdt1,NNumber rid1,NString rdt2,NNumber rid2,NNumber plevel,NNumber celldepth,NNumber numbands,NNumber interleaving,NNumber cratio,NNumber resolution) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.DECOMPRESSDATAWITHCRATIO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@METHOD", method);
			cmd.addParameter("@RDT1", rdt1);
			cmd.addParameter("@RID1", rid1);
			cmd.addParameter("@RDT2", rdt2);
			cmd.addParameter("@RID2", rid2);
			cmd.addParameter("@PLEVEL", plevel);
			cmd.addParameter("@CELLDEPTH", celldepth);
			cmd.addParameter("@NUMBANDS", numbands);
			cmd.addParameter("@INTERLEAVING", interleaving);
			cmd.addParameter("@CRATIO", cratio);
			cmd.addParameter("@RESOLUTION", resolution);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void raiseerror(NNumber num) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.RAISEERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NUM", num);
				
			cmd.execute();


		}
		
		public static void raiseerrorwithmsg(NNumber num,NString msg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_AUX.RAISEERRORWITHMSG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NUM", num);
			cmd.addParameter("@MSG", msg);
				
			cmd.execute();


		}
		
	
	
	
}
