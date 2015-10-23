package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokwext {
		public static void pExtractfinaid(NString termCode,NString userid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWEXT.P_EXTRACTFINAID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@USERID", userid);
				
			cmd.execute();


		}
		
	
	
	
}
