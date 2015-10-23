package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gkkpxml {
		public static NBool Fexportcell(NString pdirectory,NString pfilename,NString ptablename,NString pcolumnname,NString pcolumntype,NString prowid,Ref<NString> pmessage,Ref<NString> urlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.EXPORTCELL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PDIRECTORY", pdirectory);
			cmd.addParameter("@PFILENAME", pfilename);
			cmd.addParameter("@PTABLENAME", ptablename);
			cmd.addParameter("@PCOLUMNNAME", pcolumnname);
			cmd.addParameter("@PCOLUMNTYPE", pcolumntype);
			cmd.addParameter("@PROWID", prowid);
			cmd.addParameter("@PMESSAGE", NString.class);
			cmd.addParameter("@URL_OUT", urlOut, true);
				
			cmd.execute();
			pmessage.val = cmd.getParameterValue("@PMESSAGE", NString.class);
			urlOut.val = cmd.getParameterValue("@URL_OUT", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fnGkapunvTable(NString pTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.FN_GKAPUNV_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TABLE", pTable);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgenerateExtTable(NString pTableName,NString pDir,NString pFileName,NString pRecordDelimiter,NString pFieldDelimiter,NString pFields,NString pDropifexists,Ref<NString> messageout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.GENERATE_EXT_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_DIR", pDir);
			cmd.addParameter("@P_FILE_NAME", pFileName);
			cmd.addParameter("@P_RECORD_DELIMITER", pRecordDelimiter);
			cmd.addParameter("@P_FIELD_DELIMITER", pFieldDelimiter);
			cmd.addParameter("@P_FIELDS", pFields);
			cmd.addParameter("@P_DROPIFEXISTS", pDropifexists);
			cmd.addParameter("@MESSAGEOUT", messageout, true);
				
			cmd.execute();
			messageout.val = cmd.getParameterValue("@MESSAGEOUT", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FloadXmltablecontents(NString pDir,NString pFileName,NNumber verbose) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.LOAD_XMLTABLECONTENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DIR", pDir);
			cmd.addParameter("@P_FILE_NAME", pFileName);
			cmd.addParameter("@VERBOSE", verbose);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pShowxml(NString pipeName,NString sessId,NString userName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.P_SHOWXML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIPE_NAME", pipeName);
			cmd.addParameter("@SESS_ID", sessId);
			cmd.addParameter("@USER_NAME", userName);
				
			cmd.execute();


		}
		
		public static NNumber FprgnSavecoltofile(NString pDir,NString pFileName,NString pTable,NString pCol,NString pWhere) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.PRGN_SAVECOLTOFILE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DIR", pDir);
			cmd.addParameter("@P_FILE_NAME", pFileName);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COL", pCol);
			cmd.addParameter("@P_WHERE", pWhere);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FprgnSavecoltofile(NString pDir,NString pFileName,NString pTable,NString pCol,NString pWhere,Ref<NString> urlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.PRGN_SAVECOLTOFILE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DIR", pDir);
			cmd.addParameter("@P_FILE_NAME", pFileName);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COL", pCol);
			cmd.addParameter("@P_WHERE", pWhere);
			cmd.addParameter("@URL_OUT", urlOut, true);
				
			cmd.execute();
			urlOut.val = cmd.getParameterValue("@URL_OUT", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void printOut(NString inText,NNumber inTextLength,NString inDivider,NString inNewLine) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.PRINT_OUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TEXT", inText);
			cmd.addParameter("@IN_TEXT_LENGTH", inTextLength);
			cmd.addParameter("@IN_DIVIDER", inDivider);
			cmd.addParameter("@IN_NEW_LINE", inNewLine);
				
			cmd.execute();


		}
		
		public static NString FreformatClob(NString lLob,NNumber chunkSize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.REFORMAT_CLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@L_LOB", lLob);
			cmd.addParameter("@CHUNK_SIZE", chunkSize);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FsaveXmlactivity(NString pDir,NString pFileName,NString pActiCode,Ref<NString> urlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.SAVE_XMLACTIVITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DIR", pDir);
			cmd.addParameter("@P_FILE_NAME", pFileName);
			cmd.addParameter("@P_ACTI_CODE", pActiCode);
			cmd.addParameter("@URL_OUT", urlOut, true);
				
			cmd.execute();
			urlOut.val = cmd.getParameterValue("@URL_OUT", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FsaveXmlclob(NString pDir,NString pFileName,NString pClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.SAVE_XMLCLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DIR", pDir);
			cmd.addParameter("@P_FILE_NAME", pFileName);
			cmd.addParameter("@P_CLOB", pClob);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FsaveXmltablecontents(NString pDir,NString pFileName,NString tabName,NString pWhere,Ref<NString> messageout,Ref<NString> urlOut,NString pMode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.SAVE_XMLTABLECONTENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DIR", pDir);
			cmd.addParameter("@P_FILE_NAME", pFileName);
			cmd.addParameter("@TAB_NAME", tabName);
			cmd.addParameter("@P_WHERE", pWhere);
			cmd.addParameter("@MESSAGEOUT", messageout, true);
			cmd.addParameter("@URL_OUT", urlOut, true);
			cmd.addParameter("@P_MODE", pMode);
				
			cmd.execute();
			messageout.val = cmd.getParameterValue("@MESSAGEOUT", NString.class);
			urlOut.val = cmd.getParameterValue("@URL_OUT", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static  FsourceData(NString tabName,NNumber pMode,NString pWhere) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.SOURCE_DATA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@TAB_NAME", tabName);
//			cmd.addParameter("@P_MODE", pMode);
//			cmd.addParameter("@P_WHERE", pWhere);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString Fversion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static DomnodeRow FxmlChild(Xmldom.DomnodeRow pN,NString pSearchPattern,Ref<NBool> pFound,NNumber pChildno,NString pLevel,NNumber pDebug) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPXML.XML_CHILD", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(DomnodeRow.class));
//			cmd.addParameter(DbTypes.createStructType("P_N", pN, Xmldom.DomnodeRow.class ));
//			cmd.addParameter("@P_SEARCH_PATTERN", pSearchPattern);
//			cmd.addParameter("@P_FOUND", pFound, true);
//			cmd.addParameter("@P_CHILDNO", pChildno);
//			cmd.addParameter("@P_LEVEL", pLevel);
//			cmd.addParameter("@P_DEBUG", pDebug);
//				
//			cmd.execute();
//			pFound.val = cmd.getParameterValue("@P_FOUND", NBool.class);
//
//			return cmd.getReturnValue(DomnodeRow.class);
//
//		}
//		
	
	
	
}
