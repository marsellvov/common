package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokainf {
		public static void pAssignAdmin(NNumber pidm,NString termCode,NNumber seqno,NString module) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKAINF.P_ASSIGN_ADMIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@SEQNO", seqno);
			cmd.addParameter("@MODULE", module);
				
			cmd.execute();


		}
		
	
	
	
}
