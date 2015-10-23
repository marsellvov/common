package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pekdegr {
		public static void pBuildpetdegr(NDate selectDate,NString userId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKDEGR.P_BUILDPETDEGR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SELECT_DATE", selectDate);
			cmd.addParameter("@USER_ID", userId);
				
			cmd.execute();


		}
		
	
	
	
}
