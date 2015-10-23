package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwrkelig {
		public static void pDispeligreq(NString aidyIn,NString callingProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKELIG.P_DISPELIGREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
				
			cmd.execute();


		}
		
		public static void pDisplaytabs(NString tabType,NString aidyIn,NString callingProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKELIG.P_DISPLAYTABS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TAB_TYPE", tabType);
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
				
			cmd.execute();


		}
		
	
	
	
}
