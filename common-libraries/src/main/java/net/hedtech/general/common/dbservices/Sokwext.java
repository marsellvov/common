package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokwext {
		public static void pExtractadmissions(NString termCode,NString recruitLevel,NString finaidInstalled,NString userid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKWEXT.P_EXTRACTADMISSIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@RECRUIT_LEVEL", recruitLevel);
			cmd.addParameter("@FINAID_INSTALLED", finaidInstalled);
			cmd.addParameter("@USERID", userid);
				
			cmd.execute();


		}
		
		public static void pExtractenrollment(NString termCode,NString finaidInstalled,NString userid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKWEXT.P_EXTRACTENROLLMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@FINAID_INSTALLED", finaidInstalled);
			cmd.addParameter("@USERID", userid);
				
			cmd.execute();


		}
		
		public static void pExtractgraduation(NString termCode,NString userid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKWEXT.P_EXTRACTGRADUATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@USERID", userid);
				
			cmd.execute();


		}
		
	
	
	
}
