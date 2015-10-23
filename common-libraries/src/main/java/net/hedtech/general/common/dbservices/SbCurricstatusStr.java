package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCurricstatusStr {
		public static void fGetError() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICSTATUS_STR.F_GET_ERROR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
