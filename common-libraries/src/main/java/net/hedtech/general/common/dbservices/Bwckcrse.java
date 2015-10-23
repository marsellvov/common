package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckcrse {
		public static void pDispcrseschd(NString termIn,NNumber pidmIn,NString pScpIn,NString pType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCRSE.P_DISPCRSESCHD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@P_SCP_IN", pScpIn);
			cmd.addParameter("@P_TYPE", pType);
				
			cmd.execute();


		}
		
	
	
	
}
