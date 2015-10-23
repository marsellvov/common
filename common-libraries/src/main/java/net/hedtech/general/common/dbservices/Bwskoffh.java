package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskoffh {
		public static void pDisplayOfficeHours(NString termIn,NString crnIn,NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOFFH.P_DISPLAY_OFFICE_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();


		}
		
	
	
	
}
