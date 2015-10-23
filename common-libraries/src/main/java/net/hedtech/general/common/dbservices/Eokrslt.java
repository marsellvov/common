package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eokrslt {
		public static void pInsertExrrslt(NString errorSourceTypeIn,NString errorLocationIn,NString errorFuncTypeIn,NString errorMessageIn,NString usernameIn,NDate activityDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRSLT.P_INSERT_EXRRSLT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ERROR_SOURCE_TYPE_IN", errorSourceTypeIn);
			cmd.addParameter("@ERROR_LOCATION_IN", errorLocationIn);
			cmd.addParameter("@ERROR_FUNC_TYPE_IN", errorFuncTypeIn);
			cmd.addParameter("@ERROR_MESSAGE_IN", errorMessageIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
				
			cmd.execute();


		}
		
	
	
	
}
