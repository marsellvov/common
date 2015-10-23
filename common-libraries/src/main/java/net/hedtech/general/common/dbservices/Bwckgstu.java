package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckgstu {
		public static void pStuinfo(NString term,NNumber stupidm,NString sourceIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKGSTU.P_STUINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@STUPIDM", stupidm);
			cmd.addParameter("@SOURCE_IN", sourceIn);
				
			cmd.execute();


		}
		
	
	
	
}
