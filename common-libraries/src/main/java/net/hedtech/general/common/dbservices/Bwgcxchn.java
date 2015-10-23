package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgcxchn {
		public static NString fGetEthnicityAndRaceXml(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGCXCHN.F_GET_ETHNICITY_AND_RACE_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetReportsXml(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGCXCHN.F_GET_REPORTS_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPersBanner(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGCXCHN.F_PERS_BANNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
