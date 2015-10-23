package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fpktdml {
		public static void pCheckKeys() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_CHECK_KEYS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pCheckKeys() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_CHECK_KEYS", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pCheckKeys() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_CHECK_KEYS", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pCheckKeys() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_CHECK_KEYS", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pCheckKeys() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_CHECK_KEYS", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pCheckKeys() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_CHECK_KEYS", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
		public static void pInsertFpbpohd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_INSERT_FPBPOHD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertFpbreqh() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_INSERT_FPBREQH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertFprpoda() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_INSERT_FPRPODA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertFprpodt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_INSERT_FPRPODT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertFprreqa() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_INSERT_FPRREQA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertFprreqd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_INSERT_FPRREQD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateFgrbakoCode(NNumber docType,NString tempDocCode,NString finalDocCode,Ref<NString> errorMesg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_UPDATE_FGRBAKO_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@TEMP_DOC_CODE", tempDocCode);
			cmd.addParameter("@FINAL_DOC_CODE", finalDocCode);
			cmd.addParameter("@ERROR_MESG", errorMesg, true);
				
			cmd.execute();
			errorMesg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);


		}
		
		public static void pUpdateFobtextCode(NNumber docType,NString tempDocCode,NString finalDocCode,Ref<NString> errorMesg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_UPDATE_FOBTEXT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@TEMP_DOC_CODE", tempDocCode);
			cmd.addParameter("@FINAL_DOC_CODE", finalDocCode);
			cmd.addParameter("@ERROR_MESG", errorMesg, true);
				
			cmd.execute();
			errorMesg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);


		}
		
		public static void pUpdateFpbpohd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_UPDATE_FPBPOHD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateFpbreqh() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_UPDATE_FPBREQH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateFprpoda() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_UPDATE_FPRPODA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateFprpodt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_UPDATE_FPRPODT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateFprreqa() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_UPDATE_FPRREQA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateFprreqd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_UPDATE_FPRREQD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdatePoCode(NString tempDocCode,NString finalDocCode,Ref<NString> errorMesg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_UPDATE_PO_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEMP_DOC_CODE", tempDocCode);
			cmd.addParameter("@FINAL_DOC_CODE", finalDocCode);
			cmd.addParameter("@ERROR_MESG", errorMesg, true);
				
			cmd.execute();
			errorMesg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);


		}
		
		public static void pUpdateReqCode(NString tempDocCode,NString finalDocCode,Ref<NString> errorMesg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKTDML.P_UPDATE_REQ_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEMP_DOC_CODE", tempDocCode);
			cmd.addParameter("@FINAL_DOC_CODE", finalDocCode);
			cmd.addParameter("@ERROR_MESG", errorMesg, true);
				
			cmd.execute();
			errorMesg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);


		}
		
	
	
	
}
