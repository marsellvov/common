package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokbevn {
		public static NString fGetspridenid(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKBEVN.F_GETSPRIDENID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pMessageproc(NString sessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKBEVN.P_MESSAGEPROC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID", sessionid);
				
			cmd.execute();


		}
		
	
	
	
}
