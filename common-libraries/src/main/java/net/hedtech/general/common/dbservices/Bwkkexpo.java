package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwkkexpo {

	public static void pExportssenapptofile(NString pAppId,NString pDir,NString pFileName,Ref<NString> urlOut) {
		pExportssenapptofile(pAppId, pDir, pFileName, Types.toStr("w"), urlOut);
	}
	
	public static void pExportssenapptofile(NString pAppId,NString pDir,NString pFileName,NString pMode,Ref<NString> urlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWKKEXPO.P_EXPORTSSENAPPTOFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APP_ID", pAppId);
			cmd.addParameter("@P_DIR", pDir);
			cmd.addParameter("@P_FILE_NAME", pFileName);
			cmd.addParameter("@P_MODE", pMode);
			cmd.addParameter("@URL_OUT", urlOut, true);
				
			cmd.execute();
			urlOut.val = cmd.getParameterValue("@URL_OUT", NString.class);


		}
		
	
	public static void pExportssenpagetofile(NString pAppId,NString pDir,NString pFileName,Ref<NString> urlOut) {
		pExportssenpagetofile(pAppId, pDir, pFileName, Types.toStr("w"), urlOut);
	}
	

	
		public static void pExportssenpagetofile(NString pPageId,NString pDir,NString pFileName,NString pMode,Ref<NString> urlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWKKEXPO.P_EXPORTSSENPAGETOFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAGE_ID", pPageId);
			cmd.addParameter("@P_DIR", pDir);
			cmd.addParameter("@P_FILE_NAME", pFileName);
			cmd.addParameter("@P_MODE", pMode);
			cmd.addParameter("@URL_OUT", urlOut, true);
				
			cmd.execute();
			urlOut.val = cmd.getParameterValue("@URL_OUT", NString.class);


		}
		
		public static void pShowsql(NString pipeName,NString sessId,NString userName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWKKEXPO.P_SHOWSQL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIPE_NAME", pipeName);
			cmd.addParameter("@SESS_ID", sessId);
			cmd.addParameter("@USER_NAME", userName);
				
			cmd.execute();


		}
		
	
	
	
}
