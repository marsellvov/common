package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokuser {
		public static DataCursor fQueryOne(NString pUserCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKUSER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER_CODE", pUserCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
	
	
	
}
