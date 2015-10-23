package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Smkmxml {
		public static void pAppendclob(Ref<NString> destClob,Ref<NString> srcClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKMXML.P_APPENDCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEST_CLOB", destClob, true);
			cmd.addParameter("@SRC_CLOB", srcClob, true);
				
			cmd.execute();
			destClob.val = cmd.getParameterValue("@DEST_CLOB", NString.class);
			srcClob.val = cmd.getParameterValue("@SRC_CLOB", NString.class);


		}
		
		public static void pGetXmlclob(DataCursor rcursorIn,NString tableNameIn,Ref<NString> resultClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKMXML.P_GET_XMLCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RCURSOR_IN", DataCursor.class);
			cmd.addParameter("@TABLE_NAME_IN", tableNameIn);
			cmd.addParameter("@RESULT_CLOB", NString.class);
				
			cmd.execute();
			resultClob.val = cmd.getParameterValue("@RESULT_CLOB", NString.class);


		}
		
		public static void pGetXmlclob(DataCursor rcursorIn,Ref<NString> resultClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKMXML.P_GET_XMLCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RCURSOR_IN", DataCursor.class);
			cmd.addParameter("@RESULT_CLOB", NString.class);
				
			cmd.execute();
			resultClob.val = cmd.getParameterValue("@RESULT_CLOB", NString.class);


		}
		
		public static void pHtpclob(NString resultClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKMXML.P_HTPCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESULT_CLOB", resultClob);
				
			cmd.execute();


		}
		
		public static void pInitClob(Ref<NString> resultClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKMXML.P_INIT_CLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESULT_CLOB", resultClob, true);
				
			cmd.execute();
			resultClob.val = cmd.getParameterValue("@RESULT_CLOB", NString.class);


		}
		
		public static void pLoadxsl(NString pDir,NString pFilename,Ref<NString> smrcrltXsl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKMXML.P_LOADXSL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIR", pDir);
			cmd.addParameter("@P_FILENAME", pFilename);
			cmd.addParameter("@SMRCRLT_XSL", NString.class);
				
			cmd.execute();
			smrcrltXsl.val = cmd.getParameterValue("@SMRCRLT_XSL", NString.class);


		}
		
		public static void pPrintclob(NString resultClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKMXML.P_PRINTCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESULT_CLOB", resultClob);
				
			cmd.execute();


		}
		
	
	
	
}
