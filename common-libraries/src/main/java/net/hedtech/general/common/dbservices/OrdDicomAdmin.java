package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class OrdDicomAdmin {
		public static void deletedocument(NString docname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM_ADMIN.DELETEDOCUMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOCNAME", docname);
				
			cmd.execute();


		}
		
		public static void editdatamodel() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM_ADMIN.EDITDATAMODEL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void exportdocument(NString docname,NString dirname,NString filename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM_ADMIN.EXPORTDOCUMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOCNAME", docname);
			cmd.addParameter("@DIRNAME", dirname);
			cmd.addParameter("@FILENAME", filename);
				
			cmd.execute();


		}
		
//		public static  Fgetdocumentcontent(NString docname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM_ADMIN.GETDOCUMENTCONTENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@DOCNAME", docname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static void insertdocument(NString docname,NString doctype, xmldoc) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM_ADMIN.INSERTDOCUMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@DOCNAME", docname);
//			cmd.addParameter("@DOCTYPE", doctype);
//			cmd.addParameter("@XMLDOC", xmldoc);
//				
//			cmd.execute();
//
//
//		}
		
		public static void publishdatamodel() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM_ADMIN.PUBLISHDATAMODEL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void rollbackdatamodel() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ORD_DICOM_ADMIN.ROLLBACKDATAMODEL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
