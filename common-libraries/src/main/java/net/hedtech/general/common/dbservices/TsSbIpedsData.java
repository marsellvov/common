package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TsSbIpedsData {
		public static void pTsStudent(NString pTermCheck) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TS_SB_IPEDS_DATA.P_TS_STUDENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CHECK", pTermCheck);
				
			cmd.execute();


		}
		
	
	
	
}
