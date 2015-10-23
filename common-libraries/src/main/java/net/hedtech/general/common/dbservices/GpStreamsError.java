package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpStreamsError {
		public static void pPrintErrors() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_STREAMS_ERROR.P_PRINT_ERRORS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
