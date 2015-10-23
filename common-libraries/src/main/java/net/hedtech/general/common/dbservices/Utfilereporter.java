package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utfilereporter {
		public static void close(NBool boolAbort) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTFILEREPORTER.CLOSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BOOL_ABORT", boolAbort);
				
			cmd.execute();


		}
		
		public static void closeFile() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTFILEREPORTER.CLOSE_FILE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void open() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTFILEREPORTER.OPEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void openFile(NString dir,NString filename,NString filemode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTFILEREPORTER.OPEN_FILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DIR", dir);
			cmd.addParameter("@FILENAME", filename);
			cmd.addParameter("@FILEMODE", filemode);
				
			cmd.execute();


		}
		
		public static void pl(NString str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTFILEREPORTER.PL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STR", str);
				
			cmd.execute();


		}
		
	
	
	
}
