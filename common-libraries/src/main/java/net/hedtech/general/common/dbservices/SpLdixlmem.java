package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SpLdixlmem {
		public static NString fGetEventData(NString pXt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SP_LDIXLMEM.F_GET_EVENT_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_XT", pXt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetQueue(NString pXt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SP_LDIXLMEM.F_GET_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_XT", pXt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetQueueCreateall(NString pXt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SP_LDIXLMEM.F_GET_QUEUE_CREATEALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_XT", pXt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
