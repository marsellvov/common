package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Xchapers {
		public static NString fGetAwardsXml(NString idIn,NString msgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XCHAPERS.F_GET_AWARDS_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@MSG_IN", msgIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPersonXml(NString idIn,NString tokenIn,NString msgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XCHAPERS.F_GET_PERSON_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@TOKEN_IN", tokenIn);
			cmd.addParameter("@MSG_IN", msgIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetProspectsXml(NString idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XCHAPERS.F_GET_PROSPECTS_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSetAwardsXml(NString idIn,NString tokenIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XCHAPERS.F_SET_AWARDS_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@TOKEN_IN", tokenIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
