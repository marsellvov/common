package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvImportRoeData {
		public static void pDisplayWebHeader(NString filename,NString target,NString button,NString directoryname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_IMPORT_ROE_DATA.P_DISPLAY_WEB_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FILENAME", filename);
			cmd.addParameter("@TARGET", target);
			cmd.addParameter("@BUTTON", button);
			cmd.addParameter("@DIRECTORYNAME", directoryname);
				
			cmd.execute();


		}
		
		public static void pProcessData() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_IMPORT_ROE_DATA.P_PROCESS_DATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSaveblobOradir(NString filename,NString pcDirectory,NString realFileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_IMPORT_ROE_DATA.P_SAVEBLOB_ORADIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FILENAME", filename);
			cmd.addParameter("@PC_DIRECTORY", pcDirectory);
			cmd.addParameter("@REAL_FILE_NAME", realFileName);
				
			cmd.execute();


		}
		
	
	
	
}
