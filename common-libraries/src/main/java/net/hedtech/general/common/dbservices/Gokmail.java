package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokmail {
		public static void pPinChangedNotification(NNumber pidm,NString insertSource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMAIL.P_PIN_CHANGED_NOTIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@INSERT_SOURCE", insertSource);
				
			cmd.execute();


		}
		
	
	
	
}
