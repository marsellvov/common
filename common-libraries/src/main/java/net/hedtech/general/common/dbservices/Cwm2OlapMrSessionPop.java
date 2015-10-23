package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapMrSessionPop {
		public static void popMrSession(NString fullDimPrivs,NString fullCubePrivs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_MR_SESSION_POP.POP_MR_SESSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FULL_DIM_PRIVS", fullDimPrivs);
			cmd.addParameter("@FULL_CUBE_PRIVS", fullCubePrivs);
				
			cmd.execute();


		}
		
	
	
	
}
