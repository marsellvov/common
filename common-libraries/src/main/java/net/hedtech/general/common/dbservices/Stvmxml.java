package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Stvmxml {
		public static void pAltprintclob(NString resultClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STVMXML.P_ALTPRINTCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESULT_CLOB", resultClob);
				
			cmd.execute();


		}
		
		public static void pAppendclob(Ref<NString> destClob,Ref<NString> srcClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STVMXML.P_APPENDCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEST_CLOB", destClob, true);
			cmd.addParameter("@SRC_CLOB", srcClob, true);
				
			cmd.execute();
			destClob.val = cmd.getParameterValue("@DEST_CLOB", NString.class);
			srcClob.val = cmd.getParameterValue("@SRC_CLOB", NString.class);


		}
		
		public static void pClob2varchar(Ref<NString> destVchar,Ref<NString> srcClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STVMXML.P_CLOB2VARCHAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEST_VCHAR", destVchar, true);
			cmd.addParameter("@SRC_CLOB", srcClob, true);
				
			cmd.execute();
			destVchar.val = cmd.getParameterValue("@DEST_VCHAR", NString.class);
			srcClob.val = cmd.getParameterValue("@SRC_CLOB", NString.class);


		}
		
		public static void pGetXmlclob(DataCursor rcursorIn,NString tableNameIn,Ref<NString> resultClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STVMXML.P_GET_XMLCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RCURSOR_IN", DataCursor.class);
			cmd.addParameter("@TABLE_NAME_IN", tableNameIn);
			cmd.addParameter("@RESULT_CLOB", NString.class);
				
			cmd.execute();
			resultClob.val = cmd.getParameterValue("@RESULT_CLOB", NString.class);


		}
		
		public static void pGetXmlclob(DataCursor rcursorIn,Ref<NString> resultClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STVMXML.P_GET_XMLCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RCURSOR_IN", DataCursor.class);
			cmd.addParameter("@RESULT_CLOB", NString.class);
				
			cmd.execute();
			resultClob.val = cmd.getParameterValue("@RESULT_CLOB", NString.class);


		}
		
		public static void pGetXmlvarchar(DataCursor rcursorIn,Ref<NString> resultXml) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STVMXML.P_GET_XMLVARCHAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RCURSOR_IN", DataCursor.class);
			cmd.addParameter("@RESULT_XML", NString.class);
				
			cmd.execute();
			resultXml.val = cmd.getParameterValue("@RESULT_XML", NString.class);


		}
		
		public static void pHtpclob(NString resultClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STVMXML.P_HTPCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESULT_CLOB", resultClob);
				
			cmd.execute();


		}
		
		public static void pInitClob(Ref<NString> resultClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STVMXML.P_INIT_CLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESULT_CLOB", resultClob, true);
				
			cmd.execute();
			resultClob.val = cmd.getParameterValue("@RESULT_CLOB", NString.class);


		}
		
		public static void pLoadxml(NString pDir,NString pFilename,Ref<NString> pXmlclob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STVMXML.P_LOADXML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIR", pDir);
			cmd.addParameter("@P_FILENAME", pFilename);
			cmd.addParameter("@P_XMLCLOB", NString.class);
				
			cmd.execute();
			pXmlclob.val = cmd.getParameterValue("@P_XMLCLOB", NString.class);


		}
		
//		public static void pLoadxsl(NString pDir,NString pFilename,Ref<> smrcrltXsl) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STVMXML.P_LOADXSL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_DIR", pDir);
//			cmd.addParameter("@P_FILENAME", pFilename);
//			cmd.addParameter("@SMRCRLT_XSL", .class);
//				
//			cmd.execute();
//			smrcrltXsl.val = cmd.getParameterValue("@SMRCRLT_XSL", .class);
//
//
//		}
		
		public static void pPrintVarcharXml(NString resultXml) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STVMXML.P_PRINT_VARCHAR_XML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESULT_XML", resultXml);
				
			cmd.execute();


		}
		
		public static void pPrintclob(NString resultClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STVMXML.P_PRINTCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESULT_CLOB", resultClob);
				
			cmd.execute();


		}
		
		public static void pWritexml(NString pDir,NString pFilename,NString pXmlclob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STVMXML.P_WRITEXML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIR", pDir);
			cmd.addParameter("@P_FILENAME", pFilename);
			cmd.addParameter("@P_XMLCLOB", pXmlclob);
				
			cmd.execute();


		}
		
	
	
	
}
