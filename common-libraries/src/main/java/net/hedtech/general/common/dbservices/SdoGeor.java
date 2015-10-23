package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoGeor {
//		public static void addnodata(Ref<> georaster,NNumber layernumber,NNumber nodata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.ADDNODATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@NODATA", nodata);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
		
//		public static void addnodata(Ref<> georaster,NNumber layernumber,List<SdoRangeArrayRow> nodata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.ADDNODATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			// cmd.addParameter(DbTypes.getCollectionType("NODATA", "", nodata, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
		
//		public static void addsourceinfo(Ref<> georaster,NString sourceinfo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.ADDSOURCEINFO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@SOURCEINFO", sourceinfo);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
		
//		public static NNumber Fcalccompressionratio( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.CALCCOMPRESSIONRATIO", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static void changecellvalue(Ref<> georaster,List<SdoNumberArrayRow> window,NString bandnumbers,NNumber newcellvalue,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.CHANGECELLVALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			// cmd.addParameter(DbTypes.getCollectionType("WINDOW", "", window, object.class));
//			cmd.addParameter("@BANDNUMBERS", bandnumbers);
//			cmd.addParameter("@NEWCELLVALUE", newcellvalue);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
		
//		public static void changecellvalue(Ref<> georaster, window,NString layernumbers,NNumber newcellvalue,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.CHANGECELLVALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@WINDOW", window);
//			cmd.addParameter("@LAYERNUMBERS", layernumbers);
//			cmd.addParameter("@NEWCELLVALUE", newcellvalue);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
		
//		public static void changeformat(Ref<> georaster,NString storageparam,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.CHANGEFORMAT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
		
//		public static void changeformatcopy( ingeoraster,NString storageparam,Ref<> outgeoraster,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.CHANGEFORMATCOPY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INGEORASTER", ingeoraster);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			cmd.addParameter("@OUTGEORASTER", outgeoraster, true);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			outgeoraster.val = cmd.getParameterValue("@OUTGEORASTER", .class);
//
//
//		}
		
//		public static void changeformatcopy( ingeoraster,NNumber pyramidlevel,NString storageparam,Ref<> outgeoraster,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.CHANGEFORMATCOPY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INGEORASTER", ingeoraster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			cmd.addParameter("@OUTGEORASTER", outgeoraster, true);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			outgeoraster.val = cmd.getParameterValue("@OUTGEORASTER", .class);
//
//
//		}
		
//		public static void copy( ingeoraster,Ref<> outgeoraster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.COPY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INGEORASTER", ingeoraster);
//			cmd.addParameter("@OUTGEORASTER", outgeoraster, true);
//				
//			cmd.execute();
//			outgeoraster.val = cmd.getParameterValue("@OUTGEORASTER", .class);
//
//
//		}
		
//		public static  Fcreateblank(NNumber rastertype,List<SdoNumberArrayRow> ultcoord,List<SdoNumberArrayRow> dimsizes,NNumber cellvalue,NString rasterdatatable,NNumber rasterid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.CREATEBLANK", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@RASTERTYPE", rastertype);
//			// cmd.addParameter(DbTypes.getCollectionType("ULTCOORD", "", ultcoord, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("DIMSIZES", "", dimsizes, object.class));
//			cmd.addParameter("@CELLVALUE", cellvalue);
//			cmd.addParameter("@RASTERDATATABLE", rasterdatatable);
//			cmd.addParameter("@RASTERID", rasterid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static void createtemplate(georaster,NNumber rastertype,NString rasterspec,NString masklayers,NString initrdtentry) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.CREATETEMPLATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@RASTERTYPE", rastertype);
//			cmd.addParameter("@RASTERSPEC", rasterspec);
//			cmd.addParameter("@MASKLAYERS", masklayers);
//			cmd.addParameter("@INITRDTENTRY", initrdtentry);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void deletenodata(Ref<> georaster,NNumber layernumber,NNumber nodata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.DELETENODATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@NODATA", nodata);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void deletenodata(Ref<> georaster,NNumber layernumber,List<SdoRangeArrayRow> nodata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.DELETENODATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			// cmd.addParameter(DbTypes.getCollectionType("NODATA", "", nodata, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void deletepyramid(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.DELETEPYRAMID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void exportto( georaster,NString subsetparam,NString rDestformat,NString rDesttype,NString rDestname,NString hDestformat,NString hDesttype,NString hDestname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.EXPORTTO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@SUBSETPARAM", subsetparam);
//			cmd.addParameter("@R_DESTFORMAT", rDestformat);
//			cmd.addParameter("@R_DESTTYPE", rDesttype);
//			cmd.addParameter("@R_DESTNAME", rDestname);
//			cmd.addParameter("@H_DESTFORMAT", hDestformat);
//			cmd.addParameter("@H_DESTTYPE", hDesttype);
//			cmd.addParameter("@H_DESTNAME", hDestname);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void exportto( georaster,NString subsetparam,NString destformat,Ref<BLOB> destblob) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.EXPORTTO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@SUBSETPARAM", subsetparam);
//			cmd.addParameter("@DESTFORMAT", destformat);
//			cmd.addParameter("@DESTBLOB", destblob, true);
//				
//			cmd.execute();
//			destblob.val = cmd.getParameterValue("@DESTBLOB", BLOB.class);
//
//
//		}
		
//		public static void exportto( georaster,NString subsetparam,NString rDestformat,Ref<BLOB> rDestblob,NString hDestformat,Ref<NString> hDestclob) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.EXPORTTO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@SUBSETPARAM", subsetparam);
//			cmd.addParameter("@R_DESTFORMAT", rDestformat);
//			cmd.addParameter("@R_DESTBLOB", rDestblob, true);
//			cmd.addParameter("@H_DESTFORMAT", hDestformat);
//			cmd.addParameter("@H_DESTCLOB", hDestclob, true);
//				
//			cmd.execute();
//			rDestblob.val = cmd.getParameterValue("@R_DESTBLOB", BLOB.class);
//			hDestclob.val = cmd.getParameterValue("@H_DESTCLOB", NString.class);
//
//
//		}
		
//		public static void generateblockmbr( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GENERATEBLOCKMBR", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void generatepyramid(Ref<> georaster,NString pyramidparams,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GENERATEPYRAMID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@PYRAMIDPARAMS", pyramidparams);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
////		public static  Fgeneratespatialextent( georaster,NNumber height) {
////			
////			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GENERATESPATIALEXTENT", DbManager.getDataBaseFactory());
////			
////			cmd.addReturnParameter(.class);
////			cmd.addParameter("@GEORASTER", georaster);
////			cmd.addParameter("@HEIGHT", height);
////				
////			cmd.execute();
////
////			return cmd.getReturnValue(.class);
////
////		}
//		
//		public static NString Fgeneratestatistics(Ref<> georaster,NString samplingfactor,List<SdoNumberArrayRow> samplingwindow,NString histogram,NString layernumbers,NString usebin,List<SdoNumberArrayRow> binfunction,NString nodata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GENERATESTATISTICS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@SAMPLINGFACTOR", samplingfactor);
//			cmd.addParameter("@SAMPLINGWINDOW", samplingwindow);
//			cmd.addParameter("@HISTOGRAM", histogram);
//			cmd.addParameter("@LAYERNUMBERS", layernumbers);
//			cmd.addParameter("@USEBIN", usebin);
//			// cmd.addParameter(DbTypes.getCollectionType("BINFUNCTION", "", binfunction, object.class));
//			cmd.addParameter("@NODATA", nodata);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fgeneratestatistics(Ref<> georaster,NString samplingfactor,List<SdoNumberArrayRow> samplingwindow,NString histogram,NString layernumbers,NString usebin,List<SdoNumberArrayRow> binfunction,NString nodata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GENERATESTATISTICS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@SAMPLINGFACTOR", samplingfactor);
//			// cmd.addParameter(DbTypes.getCollectionType("SAMPLINGWINDOW", "", samplingwindow, object.class));
//			cmd.addParameter("@HISTOGRAM", histogram);
//			cmd.addParameter("@LAYERNUMBERS", layernumbers);
//			cmd.addParameter("@USEBIN", usebin);
//			// cmd.addParameter(DbTypes.getCollectionType("BINFUNCTION", "", binfunction, object.class));
//			cmd.addParameter("@NODATA", nodata);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void georeference(Ref<> georaster,NNumber srid,NNumber modelcoordinatelocation,List<SdoNumberArrayRow> xcoefficients,List<SdoNumberArrayRow> ycoefficients) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GEOREFERENCE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@SRID", srid);
//			cmd.addParameter("@MODELCOORDINATELOCATION", modelcoordinatelocation);
//			// cmd.addParameter(DbTypes.getCollectionType("XCOEFFICIENTS", "", xcoefficients, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("YCOEFFICIENTS", "", ycoefficients, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static NNumber Fgetbanddimsize(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBANDDIMSIZE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  Fgetbegindatetime(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBEGINDATETIME", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> Fgetbinfunction(Ref<> georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBINFUNCTION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static NString Fgetbintable(Ref<> georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBINTABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fgetbintype(Ref<> georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBINTYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void getbitmapmask(Ref<> georaster,NNumber layernumber,NString storageparam,Ref<> mask) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBITMAPMASK", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			cmd.addParameter("@MASK", mask, true);
//				
//			cmd.execute();
//			mask.val = cmd.getParameterValue("@MASK", .class);
//
//
//		}
//		
//		public static void getbitmapmasksubset(Ref<> georaster,NNumber layernumber,NNumber pyramidlevel,List<SdoNumberArrayRow> window,Ref<BLOB> rasterblob,NString storageparam) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBITMAPMASKSUBSET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			// cmd.addParameter(DbTypes.getCollectionType("WINDOW", "", window, object.class));
//			cmd.addParameter("@RASTERBLOB", rasterblob, true);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//				
//			cmd.execute();
//			rasterblob.val = cmd.getParameterValue("@RASTERBLOB", BLOB.class);
//
//
//		}
//		
//		public static void getbitmapmasksubset(Ref<> georaster,NNumber layernumber,NNumber pyramidlevel,List<SdoNumberArrayRow> window,Ref<BLOB> rasterblob,NString storageparam) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBITMAPMASKSUBSET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@WINDOW", window);
//			cmd.addParameter("@RASTERBLOB", rasterblob, true);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//				
//			cmd.execute();
//			rasterblob.val = cmd.getParameterValue("@RASTERBLOB", BLOB.class);
//
//
//		}
//		
//		public static void getbitmapmasksubset(Ref<> georaster,NNumber layernumber,NNumber pyramidlevel,List<SdoNumberArrayRow> inwindow,Ref<BLOB> rasterblob,Ref<List<SdoNumberArrayRow>> outwindow,NString storageparam) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBITMAPMASKSUBSET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			// cmd.addParameter(DbTypes.getCollectionType("INWINDOW", "", inwindow, object.class));
//			cmd.addParameter("@RASTERBLOB", rasterblob, true);
//			// cmd.addParameter(DbTypes.getCollectionType("OUTWINDOW", "", object.class));
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//				
//			cmd.execute();
//			rasterblob.val = cmd.getParameterValue("@RASTERBLOB", BLOB.class);
//			// outwindow.val = cmd.getTableParameterValue("@OUTWINDOW", object.class);
//
//
//		}
//		
//		public static void getbitmapmasksubset(Ref<> georaster,NNumber layernumber,NNumber pyramidlevel,List<SdoNumberArrayRow> inwindow,Ref<BLOB> rasterblob,Ref<List<SdoNumberArrayRow>> outwindow,NString storageparam) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBITMAPMASKSUBSET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@INWINDOW", inwindow);
//			cmd.addParameter("@RASTERBLOB", rasterblob, true);
//			// cmd.addParameter(DbTypes.getCollectionType("OUTWINDOW", "", object.class));
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//				
//			cmd.execute();
//			rasterblob.val = cmd.getParameterValue("@RASTERBLOB", BLOB.class);
//			// outwindow.val = cmd.getTableParameterValue("@OUTWINDOW", object.class);
//
//
//		}
//		
//		public static NNumber Fgetbitmapmaskvalue(Ref<> georaster,NNumber layernumber,NNumber pyramidlevel,NNumber rownumber,NNumber colnumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBITMAPMASKVALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@ROWNUMBER", rownumber);
//			cmd.addParameter("@COLNUMBER", colnumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber Fgetbitmapmaskvalue(Ref<> georaster,NNumber layernumber,NNumber pyramidlevel, ptgeom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBITMAPMASKVALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@PTGEOM", ptgeom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber Fgetblankcellvalue(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBLANKCELLVALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NString Fgetblockingtype(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBLOCKINGTYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> Fgetblocksize(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETBLOCKSIZE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> Fgetcellcoordinate(Ref<> georaster,NNumber pyramidlevel,Ref<> modelcoordinate,NString subcell,NNumber height,NNumber vertId,NString ellipsoidal) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETCELLCOORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@MODELCOORDINATE", modelcoordinate);
//			cmd.addParameter("@SUBCELL", subcell);
//			cmd.addParameter("@HEIGHT", height);
//			cmd.addParameter("@VERT_ID", vertId);
//			cmd.addParameter("@ELLIPSOIDAL", ellipsoidal);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static void getcellcoordinate(Ref<> georaster,NNumber pyramidlevel,Ref<> modelcoordinate,Ref<> cellcoordinate,NString subcell,NNumber height,NNumber vertId,NString ellipsoidal) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETCELLCOORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@MODELCOORDINATE", modelcoordinate);
//			cmd.addParameter("@CELLCOORDINATE", .class);
//			cmd.addParameter("@SUBCELL", subcell);
//			cmd.addParameter("@HEIGHT", height);
//			cmd.addParameter("@VERT_ID", vertId);
//			cmd.addParameter("@ELLIPSOIDAL", ellipsoidal);
//				
//			cmd.execute();
//			cellcoordinate.val = cmd.getParameterValue("@CELLCOORDINATE", .class);
//
//
//		}
//		
//		public static List<SdoNumberArrayRow> Fgetcellcoordinate(Ref<> georaster,NNumber sourcepyramidlevel,List<SdoNumberArrayRow> sourcecellcoordinate,NNumber targetpyramidlevel,NString subcell) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETCELLCOORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@SOURCEPYRAMIDLEVEL", sourcepyramidlevel);
//			// cmd.addParameter(DbTypes.getCollectionType("SOURCECELLCOORDINATE", "", sourcecellcoordinate, object.class));
//			cmd.addParameter("@TARGETPYRAMIDLEVEL", targetpyramidlevel);
//			cmd.addParameter("@SUBCELL", subcell);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static  Fgetcellcoordinate(Ref<> georaster,NNumber sourcepyramidlevel,List<SdoNumberArrayRow> sourcecellcoordinate,NNumber targetpyramidlevel,NString subcell) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETCELLCOORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@SOURCEPYRAMIDLEVEL", sourcepyramidlevel);
//			cmd.addParameter("@SOURCECELLCOORDINATE", sourcecellcoordinate);
//			cmd.addParameter("@TARGETPYRAMIDLEVEL", targetpyramidlevel);
//			cmd.addParameter("@SUBCELL", subcell);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NNumber Fgetcelldepth(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETCELLDEPTH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber Fgetcellvalue(Ref<> georaster,NNumber pyramidlevel,NNumber rownumber,NNumber colnumber,NNumber bandnumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETCELLVALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@ROWNUMBER", rownumber);
//			cmd.addParameter("@COLNUMBER", colnumber);
//			cmd.addParameter("@BANDNUMBER", bandnumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber Fgetcellvalue(Ref<> georaster,NNumber pyramidlevel, ptgeom,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETCELLVALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@PTGEOM", ptgeom);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static  Fgetcolormap(Ref<> georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETCOLORMAP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NString Fgetcolormaptable(Ref<> georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETCOLORMAPTABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fgetcompressiontype(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETCOMPRESSIONTYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NNumber Fgetdefaultblue(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETDEFAULTBLUE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> Fgetdefaultcolorlayer(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETDEFAULTCOLORLAYER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static NNumber Fgetdefaultgreen(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETDEFAULTGREEN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber Fgetdefaultred(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETDEFAULTRED", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  Fgetenddatetime(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETENDDATETIME", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NNumber Fgetgeoreferencetype(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETGEOREFERENCETYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  Fgetgrayscale(Ref<> georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETGRAYSCALE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NString Fgetgrayscaletable(Ref<> georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETGRAYSCALETABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static  Fgethistogram(Ref<> georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETHISTOGRAM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NString Fgethistogramtable(Ref<> georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETHISTOGRAMTABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fgetid(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fgetinterleavingtype(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETINTERLEAVINGTYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static List<SdoStringArrayRow> Fgetlayerdimension(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETLAYERDIMENSION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoStringArrayRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoStringArrayRow>.class);
//
//		}
//		
//		public static NString Fgetlayerid(Ref<> georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETLAYERID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NNumber Fgetlayerordinate(Ref<> georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETLAYERORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static  Fgetmodelcoordinate(Ref<> georaster,NNumber pyramidlevel,List<SdoNumberArrayRow> cellcoordinate,NNumber height) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETMODELCOORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			// cmd.addParameter(DbTypes.getCollectionType("CELLCOORDINATE", "", cellcoordinate, object.class));
//			cmd.addParameter("@HEIGHT", height);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static void getmodelcoordinate(Ref<> georaster,NNumber pyramidlevel,List<SdoNumberArrayRow> cellcoordinate,Ref<> modelcoordinate,NNumber height) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETMODELCOORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@CELLCOORDINATE", cellcoordinate);
//			cmd.addParameter("@MODELCOORDINATE", .class);
//			cmd.addParameter("@HEIGHT", height);
//				
//			cmd.execute();
//			modelcoordinate.val = cmd.getParameterValue("@MODELCOORDINATE", .class);
//
//
//		}
//		
//		public static NString Fgetmodelcoordlocation(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETMODELCOORDLOCATION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NNumber Fgetmodelsrid(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETMODELSRID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber Fgetnodata(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETNODATA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static List<SdoRangeArrayRow> Fgetnodata(Ref<> georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETNODATA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoRangeArrayRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoRangeArrayRow>.class);
//
//		}
//		
//		public static NNumber Fgetpyramidmaxlevel(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETPYRAMIDMAXLEVEL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NString Fgetpyramidtype(Ref<> georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETPYRAMIDTYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void getrasterblocklocator(Ref<> georaster,NNumber pyramidlevel,NNumber bandblocknumber,NNumber rowblocknumber,NNumber columnblocknumber,Ref<BLOB> loc,NString isbitmapmask,NString lockForWrite) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETRASTERBLOCKLOCATOR", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@BANDBLOCKNUMBER", bandblocknumber);
//			cmd.addParameter("@ROWBLOCKNUMBER", rowblocknumber);
//			cmd.addParameter("@COLUMNBLOCKNUMBER", columnblocknumber);
//			cmd.addParameter("@LOC", loc, true);
//			cmd.addParameter("@ISBITMAPMASK", isbitmapmask);
//			cmd.addParameter("@LOCK_FOR_WRITE", lockForWrite);
//				
//			cmd.execute();
//			loc.val = cmd.getParameterValue("@LOC", BLOB.class);
//
//
//		}
//		
//		public static List<SdoRastersetRow> Fgetrasterblocks(Ref<> georaster,NNumber pyramidlevel,List<SdoNumberArrayRow> window) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETRASTERBLOCKS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoRastersetRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			// cmd.addParameter(DbTypes.getCollectionType("WINDOW", "", window, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoRastersetRow>.class);
//
//		}
//		
//		public static List<SdoRastersetRow> Fgetrasterblocks(Ref<> georaster,NNumber pyramidlevel,List<SdoNumberArrayRow> window) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETRASTERBLOCKS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoRastersetRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@WINDOW", window);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoRastersetRow>.class);
//
//		}
//		
//		public static void getrasterdata(Ref<> georaster,NNumber pyramidlevel,Ref<BLOB> rasterblob,NString storageparam,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETRASTERDATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@RASTERBLOB", rasterblob, true);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			rasterblob.val = cmd.getParameterValue("@RASTERBLOB", BLOB.class);
//
//
//		}
		
//		public static void getrastersubset(Ref<> georaster,NNumber pyramidlevel,List<SdoNumberArrayRow> window,NString bandnumbers,Ref<BLOB> rasterblob,NString storageparam,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETRASTERSUBSET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			// cmd.addParameter(DbTypes.getCollectionType("WINDOW", "", window, object.class));
//			cmd.addParameter("@BANDNUMBERS", bandnumbers);
//			cmd.addParameter("@RASTERBLOB", rasterblob, true);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			rasterblob.val = cmd.getParameterValue("@RASTERBLOB", BLOB.class);
//
//
//		}
		
//		public static void getrastersubset(Ref<> georaster,NNumber pyramidlevel,List<SdoNumberArrayRow> inwindow,NString bandnumbers,Ref<BLOB> rasterblob,Ref<List<SdoNumberArrayRow>> outwindow,NString storageparam,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETRASTERSUBSET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			// cmd.addParameter(DbTypes.getCollectionType("INWINDOW", "", inwindow, object.class));
//			cmd.addParameter("@BANDNUMBERS", bandnumbers);
//			cmd.addParameter("@RASTERBLOB", rasterblob, true);
//			// cmd.addParameter(DbTypes.getCollectionType("OUTWINDOW", "", object.class));
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			rasterblob.val = cmd.getParameterValue("@RASTERBLOB", BLOB.class);
//			// outwindow.val = cmd.getTableParameterValue("@OUTWINDOW", object.class);
//
//
//		}
		
//		public static void getrastersubset( georaster,NNumber pyramidlevel, window,NString layernumbers,Ref<BLOB> rasterblob,NString storageparam,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETRASTERSUBSET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@WINDOW", window);
//			cmd.addParameter("@LAYERNUMBERS", layernumbers);
//			cmd.addParameter("@RASTERBLOB", rasterblob, true);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			rasterblob.val = cmd.getParameterValue("@RASTERBLOB", BLOB.class);
//
//
//		}
		
//		public static void getrastersubset( georaster,NNumber pyramidlevel, inwindow,NString layernumbers,Ref<BLOB> rasterblob,Ref<List<SdoNumberArrayRow>> outwindow,NString storageparam,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETRASTERSUBSET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@INWINDOW", inwindow);
//			cmd.addParameter("@LAYERNUMBERS", layernumbers);
//			cmd.addParameter("@RASTERBLOB", rasterblob, true);
//			// cmd.addParameter(DbTypes.getCollectionType("OUTWINDOW", "", object.class));
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			rasterblob.val = cmd.getParameterValue("@RASTERBLOB", BLOB.class);
//			// outwindow.val = cmd.getTableParameterValue("@OUTWINDOW", object.class);
//
//
//		}
//		
//		public static List<SdoNumberArrayRow> Fgetscaling( georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETSCALING", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoString2ArrayRow> Fgetsourceinfo( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETSOURCEINFO", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoString2ArrayRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoString2ArrayRow>.class);
//
//		}
		
//		public static NNumber Fgetspatialdimnumber( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETSPATIALDIMNUMBER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> Fgetspatialdimsizes( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETSPATIALDIMSIZES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> Fgetspatialresolutions( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETSPATIALRESOLUTIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static NNumber Fgetspectralresolution( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETSPECTRALRESOLUTION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NString Fgetspectralunit( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETSPECTRALUNIT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static  Fgetsrs( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETSRS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> Fgetstatistics( georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETSTATISTICS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static NNumber Fgettotallayernumber( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETTOTALLAYERNUMBER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static List<SdoNumberArrayRow> Fgetultcoordinate( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETULTCOORDINATE", DbManager.getDataBaseFactory());
			
//			cmd.addReturnParameter(List<SdoNumberArrayRow>.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoNumberArrayRow>.class);
//
//		}
//		
//		public static NString Fgetvat( georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETVAT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fgetversion( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.GETVERSION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fhasbitmapmask( georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.HASBITMAPMASK", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fhasgrayscale( georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.HASGRAYSCALE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fhasnodatamask( georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.HASNODATAMASK", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fhaspseudocolor( georaster,NNumber layernumber) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.HASPSEUDOCOLOR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void importfrom(Ref<> georaster,NString storageparam,NString rSourceformat,NString rSourcetype,NString rSourcename,NString hSourceformat,NString hSourcetype,NString hSourcename) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.IMPORTFROM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			cmd.addParameter("@R_SOURCEFORMAT", rSourceformat);
//			cmd.addParameter("@R_SOURCETYPE", rSourcetype);
//			cmd.addParameter("@R_SOURCENAME", rSourcename);
//			cmd.addParameter("@H_SOURCEFORMAT", hSourceformat);
//			cmd.addParameter("@H_SOURCETYPE", hSourcetype);
//			cmd.addParameter("@H_SOURCENAME", hSourcename);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void importfrom(Ref<> georaster,NString storageparam,NString rSourceformat,BLOB rSourceblob,NString hSourceformat,NString hSourceclob) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.IMPORTFROM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			cmd.addParameter("@R_SOURCEFORMAT", rSourceformat);
//			cmd.addParameter("@R_SOURCEBLOB", rSourceblob);
//			cmd.addParameter("@H_SOURCEFORMAT", hSourceformat);
//			cmd.addParameter("@H_SOURCECLOB", hSourceclob);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static  Finit(NString rasterdatatable,NNumber rasterid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.INIT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@RASTERDATATABLE", rasterdatatable);
//			cmd.addParameter("@RASTERID", rasterid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NString Fisblank( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.ISBLANK", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fislossless( geor) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.ISLOSSLESS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOR", geor);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fisorthorectified( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.ISORTHORECTIFIED", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fisrectified( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.ISRECTIFIED", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString Fisspatialreferenced( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.ISSPATIALREFERENCED", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void mergelayers(Ref<> targetgeoraster, sourcegeoraster,NString sourcelayernumbers,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.MERGELAYERS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TARGETGEORASTER", targetgeoraster, true);
//			cmd.addParameter("@SOURCEGEORASTER", sourcegeoraster);
//			cmd.addParameter("@SOURCELAYERNUMBERS", sourcelayernumbers);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			targetgeoraster.val = cmd.getParameterValue("@TARGETGEORASTER", .class);
//
//
//		}
//		
//		public static void mergelayers( source1georaster,NString source1layernumbers, source2georaster,NString source2layernumbers,NString storageparam,Ref<> outgeoraster,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.MERGELAYERS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SOURCE1GEORASTER", source1georaster);
//			cmd.addParameter("@SOURCE1LAYERNUMBERS", source1layernumbers);
//			cmd.addParameter("@SOURCE2GEORASTER", source2georaster);
//			cmd.addParameter("@SOURCE2LAYERNUMBERS", source2layernumbers);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			cmd.addParameter("@OUTGEORASTER", outgeoraster, true);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			outgeoraster.val = cmd.getParameterValue("@OUTGEORASTER", .class);
//
//
//		}
//		
//		public static void mosaic(NString georastertablename,NString georastercolumnname,Ref<> georaster,NString storageparam,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.MOSAIC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTERTABLENAME", georastertablename);
//			cmd.addParameter("@GEORASTERCOLUMNNAME", georastercolumnname);
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void scale(Ref<> ingeoraster,NString scaleparam,NString resampleparam,NString storageparam,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SCALE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INGEORASTER", ingeoraster, true);
//			cmd.addParameter("@SCALEPARAM", scaleparam);
//			cmd.addParameter("@RESAMPLEPARAM", resampleparam);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			ingeoraster.val = cmd.getParameterValue("@INGEORASTER", .class);
//
//
//		}
//		
//		public static void scalecopy( ingeoraster,NString scaleparam,NString resampleparam,NString storageparam,Ref<> outgeoraster,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SCALECOPY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INGEORASTER", ingeoraster);
//			cmd.addParameter("@SCALEPARAM", scaleparam);
//			cmd.addParameter("@RESAMPLEPARAM", resampleparam);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			cmd.addParameter("@OUTGEORASTER", outgeoraster, true);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			outgeoraster.val = cmd.getParameterValue("@OUTGEORASTER", .class);
//
//
//		}
//		
//		public static void scalecopy( ingeoraster,NNumber pyramidlevel,NString scaleparam,NString resampleparam,NString storageparam,Ref<> outgeoraster,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SCALECOPY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INGEORASTER", ingeoraster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@SCALEPARAM", scaleparam);
//			cmd.addParameter("@RESAMPLEPARAM", resampleparam);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			cmd.addParameter("@OUTGEORASTER", outgeoraster, true);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			outgeoraster.val = cmd.getParameterValue("@OUTGEORASTER", .class);
//
//
//		}
//		
//		public static NString Fschemavalidate( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SCHEMAVALIDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void setbegindatetime(Ref<> georaster, begintime) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETBEGINDATETIME", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@BEGINTIME", begintime);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setbinfunction(Ref<> georaster,NNumber layernumber,List<SdoNumberArrayRow> binfunction) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETBINFUNCTION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			// cmd.addParameter(DbTypes.getCollectionType("BINFUNCTION", "", binfunction, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setbintable(Ref<> georaster,NNumber layernumber,NString tablename) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETBINTABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@TABLENAME", tablename);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setbitmapmask(Ref<> georaster,NNumber layernumber, mask,NString nodatamask) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETBITMAPMASK", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@NODATAMASK", nodatamask);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setblankcellvalue(Ref<> georaster,NNumber value) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETBLANKCELLVALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@VALUE", value);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setcolormap(Ref<> georaster,NNumber layernumber, colormap) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETCOLORMAP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@COLORMAP", colormap);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setcolormaptable(Ref<> georaster,NNumber layernumber,NString tablename) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETCOLORMAPTABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@TABLENAME", tablename);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setdefaultblue(Ref<> georaster,NNumber defaultblue) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETDEFAULTBLUE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@DEFAULTBLUE", defaultblue);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setdefaultcolorlayer(Ref<> georaster,List<SdoNumberArrayRow> defaultrgb) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETDEFAULTCOLORLAYER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			// cmd.addParameter(DbTypes.getCollectionType("DEFAULTRGB", "", defaultrgb, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setdefaultgreen(Ref<> georaster,NNumber defaultgreen) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETDEFAULTGREEN", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@DEFAULTGREEN", defaultgreen);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setdefaultred(Ref<> georaster,NNumber defaultred) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETDEFAULTRED", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@DEFAULTRED", defaultred);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setenddatetime(Ref<> georaster, endtime) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETENDDATETIME", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@ENDTIME", endtime);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setgrayscale(Ref<> georaster,NNumber layernumber, grayscale) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETGRAYSCALE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@GRAYSCALE", grayscale);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setgrayscaletable(Ref<> georaster,NNumber layernumber,NString tablename) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETGRAYSCALETABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@TABLENAME", tablename);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void sethistogramtable(Ref<> georaster,NNumber layernumber,NString tablename) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETHISTOGRAMTABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@TABLENAME", tablename);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setid(Ref<> georaster,NString id) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@ID", id);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
		
//		public static void setlayerid(Ref<> georaster,NNumber layernumber,NString id) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETLAYERID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@ID", id);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setlayerordinate(Ref<> georaster,NNumber layernumber,NNumber ordinate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETLAYERORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@ORDINATE", ordinate);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setmodelsrid(Ref<> georaster,NNumber srid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETMODELSRID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@SRID", srid);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setorthorectified(Ref<> georaster,NString isorthorectified) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETORTHORECTIFIED", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@ISORTHORECTIFIED", isorthorectified);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setrastertype(Ref<> georaster,NNumber rastertype) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETRASTERTYPE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@RASTERTYPE", rastertype);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setrectified(Ref<> georaster,NString isrectified) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETRECTIFIED", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@ISRECTIFIED", isrectified);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setscaling(Ref<> georaster,NNumber layernumber,List<SdoNumberArrayRow> scalingfunc) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETSCALING", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			// cmd.addParameter(DbTypes.getCollectionType("SCALINGFUNC", "", scalingfunc, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setsourceinfo(Ref<> georaster,NString sourceinfo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETSOURCEINFO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@SOURCEINFO", sourceinfo);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setspatialreferenced(Ref<> georaster,NString isreferenced) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETSPATIALREFERENCED", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@ISREFERENCED", isreferenced);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setspatialresolutions(Ref<> georaster,List<SdoNumberArrayRow> resolutions) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETSPATIALRESOLUTIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			// cmd.addParameter(DbTypes.getCollectionType("RESOLUTIONS", "", resolutions, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setspectralresolution(Ref<> georaster,NNumber resolution) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETSPECTRALRESOLUTION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@RESOLUTION", resolution);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setspectralunit(Ref<> georaster,NString unit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETSPECTRALUNIT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@UNIT", unit);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setsrs(Ref<> georaster, srs) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETSRS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@SRS", srs);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setstatistics(Ref<> georaster,NNumber layernumber,List<SdoNumberArrayRow> statistics) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETSTATISTICS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			// cmd.addParameter(DbTypes.getCollectionType("STATISTICS", "", statistics, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setstatistics(Ref<> georaster,NNumber layernumber,List<SdoNumberArrayRow> statistics, histogram,NNumber samplingfactor,List<SdoNumberArrayRow> samplingwindow) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETSTATISTICS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			// cmd.addParameter(DbTypes.getCollectionType("STATISTICS", "", statistics, object.class));
//			cmd.addParameter("@HISTOGRAM", histogram);
//			cmd.addParameter("@SAMPLINGFACTOR", samplingfactor);
//			// cmd.addParameter(DbTypes.getCollectionType("SAMPLINGWINDOW", "", samplingwindow, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setstatistics(Ref<> georaster,NNumber layernumber,List<SdoNumberArrayRow> statistics,NString histogramtable,NNumber samplingfactor,List<SdoNumberArrayRow> samplingwindow) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETSTATISTICS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			// cmd.addParameter(DbTypes.getCollectionType("STATISTICS", "", statistics, object.class));
//			cmd.addParameter("@HISTOGRAMTABLE", histogramtable);
//			cmd.addParameter("@SAMPLINGFACTOR", samplingfactor);
//			// cmd.addParameter(DbTypes.getCollectionType("SAMPLINGWINDOW", "", samplingwindow, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setultcoordinate(Ref<> georaster,List<SdoNumberArrayRow> ultcoord) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETULTCOORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			// cmd.addParameter(DbTypes.getCollectionType("ULTCOORD", "", ultcoord, object.class));
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setvat(Ref<> georaster,NNumber layernumber,NString vatname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETVAT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@LAYERNUMBER", layernumber);
//			cmd.addParameter("@VATNAME", vatname);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void setversion(Ref<> georaster,NString majorversion,NString minorversion) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SETVERSION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTER", georaster, true);
//			cmd.addParameter("@MAJORVERSION", majorversion);
//			cmd.addParameter("@MINORVERSION", minorversion);
//				
//			cmd.execute();
//			georaster.val = cmd.getParameterValue("@GEORASTER", .class);
//
//
//		}
//		
//		public static void subset( ingeoraster, croparea,NString layernumbers,NString storageparam,Ref<> outgeoraster,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SUBSET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INGEORASTER", ingeoraster);
//			cmd.addParameter("@CROPAREA", croparea);
//			cmd.addParameter("@LAYERNUMBERS", layernumbers);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			cmd.addParameter("@OUTGEORASTER", outgeoraster, true);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			outgeoraster.val = cmd.getParameterValue("@OUTGEORASTER", .class);
//
//
//		}
//		
//		public static void subset( ingeoraster,List<SdoNumberArrayRow> croparea,NString bandnumbers,NString storageparam,Ref<> outgeoraster,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SUBSET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INGEORASTER", ingeoraster);
//			// cmd.addParameter(DbTypes.getCollectionType("CROPAREA", "", croparea, object.class));
//			cmd.addParameter("@BANDNUMBERS", bandnumbers);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			cmd.addParameter("@OUTGEORASTER", outgeoraster, true);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			outgeoraster.val = cmd.getParameterValue("@OUTGEORASTER", .class);
//
//
//		}
//		
//		public static void subset( ingeoraster,NNumber pyramidlevel, croparea,NString layernumbers,NString storageparam,Ref<> outgeoraster,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SUBSET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INGEORASTER", ingeoraster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			cmd.addParameter("@CROPAREA", croparea);
//			cmd.addParameter("@LAYERNUMBERS", layernumbers);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			cmd.addParameter("@OUTGEORASTER", outgeoraster, true);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			outgeoraster.val = cmd.getParameterValue("@OUTGEORASTER", .class);
//
//
//		}
//		
//		public static void subset( ingeoraster,NNumber pyramidlevel,List<SdoNumberArrayRow> croparea,NString bandnumbers,NString storageparam,Ref<> outgeoraster,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.SUBSET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INGEORASTER", ingeoraster);
//			cmd.addParameter("@PYRAMIDLEVEL", pyramidlevel);
//			// cmd.addParameter(DbTypes.getCollectionType("CROPAREA", "", croparea, object.class));
//			cmd.addParameter("@BANDNUMBERS", bandnumbers);
//			cmd.addParameter("@STORAGEPARAM", storageparam);
//			cmd.addParameter("@OUTGEORASTER", outgeoraster, true);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			outgeoraster.val = cmd.getParameterValue("@OUTGEORASTER", .class);
//
//
//		}
//		
//		public static void updateraster(Ref<> targetgeoraster,NNumber targetpyramidlevel,NString targetlayernumbers, targetarea, sourcegeoraster,NNumber sourcepyramidlevel,NString sourcelayernumbers,NString updateupperpyramids,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.UPDATERASTER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TARGETGEORASTER", targetgeoraster, true);
//			cmd.addParameter("@TARGETPYRAMIDLEVEL", targetpyramidlevel);
//			cmd.addParameter("@TARGETLAYERNUMBERS", targetlayernumbers);
//			cmd.addParameter("@TARGETAREA", targetarea);
//			cmd.addParameter("@SOURCEGEORASTER", sourcegeoraster);
//			cmd.addParameter("@SOURCEPYRAMIDLEVEL", sourcepyramidlevel);
//			cmd.addParameter("@SOURCELAYERNUMBERS", sourcelayernumbers);
//			cmd.addParameter("@UPDATEUPPERPYRAMIDS", updateupperpyramids);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			targetgeoraster.val = cmd.getParameterValue("@TARGETGEORASTER", .class);
//
//
//		}
//		
//		public static void updateraster(Ref<> targetgeoraster,NNumber targetpyramidlevel,NString targetbandnumbers,List<SdoNumberArrayRow> targetarea, sourcegeoraster,NNumber sourcepyramidlevel,NString sourcebandnumbers,NString updateupperpyramids,List<SdoNumberArrayRow> bgvalues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.UPDATERASTER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TARGETGEORASTER", targetgeoraster, true);
//			cmd.addParameter("@TARGETPYRAMIDLEVEL", targetpyramidlevel);
//			cmd.addParameter("@TARGETBANDNUMBERS", targetbandnumbers);
//			// cmd.addParameter(DbTypes.getCollectionType("TARGETAREA", "", targetarea, object.class));
//			cmd.addParameter("@SOURCEGEORASTER", sourcegeoraster);
//			cmd.addParameter("@SOURCEPYRAMIDLEVEL", sourcepyramidlevel);
//			cmd.addParameter("@SOURCEBANDNUMBERS", sourcebandnumbers);
//			cmd.addParameter("@UPDATEUPPERPYRAMIDS", updateupperpyramids);
//			// cmd.addParameter(DbTypes.getCollectionType("BGVALUES", "", bgvalues, object.class));
//				
//			cmd.execute();
//			targetgeoraster.val = cmd.getParameterValue("@TARGETGEORASTER", .class);
//
//
//		}
//		
//		public static NString Fvalidateblockmbr( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.VALIDATEBLOCKMBR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void validateformosaic(NString georastertablename,NString georastercolumnname,NString resulttablename) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.VALIDATEFORMOSAIC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEORASTERTABLENAME", georastertablename);
//			cmd.addParameter("@GEORASTERCOLUMNNAME", georastercolumnname);
//			cmd.addParameter("@RESULTTABLENAME", resulttablename);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static NString Fvalidategeoraster( georaster) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR.VALIDATEGEORASTER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEORASTER", georaster);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
	
	
	
}
