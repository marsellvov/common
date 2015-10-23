package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkvets {
		public static void pDispclass() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKVETS.P_DISPCLASS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateclass(NString pSeprDate,NString pDisabledVeteran,NString pVietnamVeteran,NString pServiceMedalVeteran,NString pOtherProtectedVeteran,NString pButtonIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKVETS.P_UPDATECLASS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEPR_DATE", pSeprDate);
			cmd.addParameter("@P_DISABLED_VETERAN", pDisabledVeteran);
			cmd.addParameter("@P_VIETNAM_VETERAN", pVietnamVeteran);
			cmd.addParameter("@P_SERVICE_MEDAL_VETERAN", pServiceMedalVeteran);
			cmd.addParameter("@P_OTHER_PROTECTED_VETERAN", pOtherProtectedVeteran);
			cmd.addParameter("@P_BUTTON_IN", pButtonIn);
				
			cmd.execute();


		}
		
	
	
	
}
