package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class OrdDicom {
//		public static void createdicomimage(NBlob src, metadata,Ref<BLOB> dest) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.CREATEDICOMIMAGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@METADATA", metadata);
//			cmd.addParameter("@DEST", dest, true);
//				
//			cmd.execute();
//			dest.val = cmd.getParameterValue("@DEST", BLOB.class);
//
//
//		}
		
//		public static void createdicomimage( src, metadata,Ref<BLOB> dest) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.CREATEDICOMIMAGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@METADATA", metadata);
//			cmd.addParameter("@DEST", dest, true);
//				
//			cmd.execute();
//			dest.val = cmd.getParameterValue("@DEST", BLOB.class);
//
//
//		}
		
//		public static void createdicomimage( src, metadata,Ref<BLOB> dest) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.CREATEDICOMIMAGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@METADATA", metadata);
//			cmd.addParameter("@DEST", dest, true);
//				
//			cmd.execute();
//			dest.val = cmd.getParameterValue("@DEST", BLOB.class);
//
//
//		}
		
		public static void export(NBlob src,NString destType,NString destLocation,NString destName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.EXPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRC", src);
			cmd.addParameter("@DEST_TYPE", destType);
			cmd.addParameter("@DEST_LOCATION", destLocation);
			cmd.addParameter("@DEST_NAME", destName);
				
			cmd.execute();


		}
		
//		public static  Fextractmetadata(BLOB data,NString extractoption,NString docname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.EXTRACTMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@DATA", data);
//			cmd.addParameter("@EXTRACTOPTION", extractoption);
//			cmd.addParameter("@DOCNAME", docname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fextractmetadata( data,NString extractoption,NString docname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.EXTRACTMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@DATA", data);
//			cmd.addParameter("@EXTRACTOPTION", extractoption);
//			cmd.addParameter("@DOCNAME", docname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fextractmetadata( data,NString extractoption,NString docname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.EXTRACTMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@DATA", data);
//			cmd.addParameter("@EXTRACTOPTION", extractoption);
//			cmd.addParameter("@DOCNAME", docname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString Fgetdictionarytag(NString attributename,NString definername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.GETDICTIONARYTAG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ATTRIBUTENAME", attributename);
			cmd.addParameter("@DEFINERNAME", definername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetmappingxpath(NString tag,NString docname,NString definername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.GETMAPPINGXPATH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TAG", tag);
			cmd.addParameter("@DOCNAME", docname);
			cmd.addParameter("@DEFINERNAME", definername);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void importfrom(Ref<NBlob> dest,NString sourceType,NString sourceLocation,NString sourceName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.IMPORTFROM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEST", dest, true);
			cmd.addParameter("@SOURCE_TYPE", sourceType);
			cmd.addParameter("@SOURCE_LOCATION", sourceLocation);
			cmd.addParameter("@SOURCE_NAME", sourceName);
				
			cmd.execute();
			dest.val = cmd.getParameterValue("@DEST", NBlob.class);


		}
		
		public static NNumber Fisanonymous(NBlob src,NString anonymitydocname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.ISANONYMOUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SRC", src);
			cmd.addParameter("@ANONYMITYDOCNAME", anonymitydocname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NNumber Fisanonymous( src,NString anonymitydocname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.ISANONYMOUS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@ANONYMITYDOCNAME", anonymitydocname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber Fisanonymous( src,NString anonymitydocname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.ISANONYMOUS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@ANONYMITYDOCNAME", anonymitydocname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static NNumber Fisconformancevalid(NBlob src,NString constraintname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.ISCONFORMANCEVALID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SRC", src);
			cmd.addParameter("@CONSTRAINTNAME", constraintname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NNumber Fisconformancevalid( src,NString constraintname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.ISCONFORMANCEVALID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@CONSTRAINTNAME", constraintname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber Fisconformancevalid( src,NString constraintname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.ISCONFORMANCEVALID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@CONSTRAINTNAME", constraintname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static void makeanonymous(NBlob src,NString destSopInstanceUid,Ref<NBlob> dest,NString anonymitydocname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.MAKEANONYMOUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRC", src);
			cmd.addParameter("@DEST_SOP_INSTANCE_UID", destSopInstanceUid);
			cmd.addParameter("@DEST", dest, true);
			cmd.addParameter("@ANONYMITYDOCNAME", anonymitydocname);
				
			cmd.execute();
			dest.val = cmd.getParameterValue("@DEST", NBlob.class);


		}
		
//		public static void makeanonymous( src,NString destSopInstanceUid,Ref<BLOB> dest,NString anonymitydocname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.MAKEANONYMOUS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@DEST_SOP_INSTANCE_UID", destSopInstanceUid);
//			cmd.addParameter("@DEST", dest, true);
//			cmd.addParameter("@ANONYMITYDOCNAME", anonymitydocname);
//				
//			cmd.execute();
//			dest.val = cmd.getParameterValue("@DEST", BLOB.class);
//
//
//		}
		
//		public static void makeanonymous( src,NString destSopInstanceUid,Ref<BLOB> dest,NString anonymitydocname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.MAKEANONYMOUS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@DEST_SOP_INSTANCE_UID", destSopInstanceUid);
//			cmd.addParameter("@DEST", dest, true);
//			cmd.addParameter("@ANONYMITYDOCNAME", anonymitydocname);
//				
//			cmd.execute();
//			dest.val = cmd.getParameterValue("@DEST", BLOB.class);
//
//
//		}
		
		public static void processcopy(NBlob src,NString command,Ref<NBlob> dest) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.PROCESSCOPY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRC", src);
			cmd.addParameter("@COMMAND", command);
			cmd.addParameter("@DEST", dest, true);
				
			cmd.execute();
			dest.val = cmd.getParameterValue("@DEST", NBlob.class);


		}
		
//		public static void processcopy( src,NString command,Ref<BLOB> dest) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.PROCESSCOPY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@COMMAND", command);
//			cmd.addParameter("@DEST", dest, true);
//				
//			cmd.execute();
//			dest.val = cmd.getParameterValue("@DEST", BLOB.class);
//
//
//		}
		
//		public static void processcopy( src,NString command,Ref<BLOB> dest) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.PROCESSCOPY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@COMMAND", command);
//			cmd.addParameter("@DEST", dest, true);
//				
//			cmd.execute();
//			dest.val = cmd.getParameterValue("@DEST", BLOB.class);
//
//
//		}
		
//		public static void processcopy(BLOB src,NString command,NString destSopInstanceUid,Ref<BLOB> dest, metadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.PROCESSCOPY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@COMMAND", command);
//			cmd.addParameter("@DEST_SOP_INSTANCE_UID", destSopInstanceUid);
//			cmd.addParameter("@DEST", dest, true);
//			cmd.addParameter("@METADATA", metadata);
//				
//			cmd.execute();
//			dest.val = cmd.getParameterValue("@DEST", BLOB.class);
//
//
//		}
		
//		public static void processcopy( src,NString command,NString destSopInstanceUid,Ref<BLOB> dest, metadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.PROCESSCOPY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@COMMAND", command);
//			cmd.addParameter("@DEST_SOP_INSTANCE_UID", destSopInstanceUid);
//			cmd.addParameter("@DEST", dest, true);
//			cmd.addParameter("@METADATA", metadata);
//				
//			cmd.execute();
//			dest.val = cmd.getParameterValue("@DEST", BLOB.class);
//
//
//		}
		
//		public static void processcopy( src,NString command,NString destSopInstanceUid,Ref<BLOB> dest, metadata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.PROCESSCOPY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@COMMAND", command);
//			cmd.addParameter("@DEST_SOP_INSTANCE_UID", destSopInstanceUid);
//			cmd.addParameter("@DEST", dest, true);
//			cmd.addParameter("@METADATA", metadata);
//				
//			cmd.execute();
//			dest.val = cmd.getParameterValue("@DEST", BLOB.class);
//
//
//		}
		
		public static void setdatamodel(NString modelname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.SETDATAMODEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MODELNAME", modelname);
				
			cmd.execute();


		}
		
		public static void setdatamodel(NString modelname,NNumber force) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.SETDATAMODEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MODELNAME", modelname);
			cmd.addParameter("@FORCE", force);
				
			cmd.execute();


		}
		
//		public static void writemetadata(BLOB src, metadata,Ref<BLOB> dest) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.WRITEMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@METADATA", metadata);
//			cmd.addParameter("@DEST", dest, true);
//				
//			cmd.execute();
//			dest.val = cmd.getParameterValue("@DEST", BLOB.class);
//
//
//		}
		
//		public static void writemetadata( src, metadata,Ref<BLOB> dest) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.WRITEMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@METADATA", metadata);
//			cmd.addParameter("@DEST", dest, true);
//				
//			cmd.execute();
//			dest.val = cmd.getParameterValue("@DEST", BLOB.class);
//
//
//		}
		
//		public static void writemetadata( src, metadata,Ref<BLOB> dest) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM.WRITEMETADATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SRC", src);
//			cmd.addParameter("@METADATA", metadata);
//			cmd.addParameter("@DEST", dest, true);
//				
//			cmd.execute();
//			dest.val = cmd.getParameterValue("@DEST", BLOB.class);
//
//
//		}
		
	
	
	
}
