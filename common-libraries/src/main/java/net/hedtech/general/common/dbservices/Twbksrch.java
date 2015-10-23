package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbksrch {
		public static void pShowresults(NString keywrdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSRCH.P_SHOWRESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@KEYWRD_IN", keywrdIn);
				
			cmd.execute();


		}
		
	
	
	
}
