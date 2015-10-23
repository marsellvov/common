package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbExperienceStrings {
		public static NString fGetError(NString pErrorname,NString pValue01,NString pValue02) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE_STRINGS.F_GET_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ERRORNAME", pErrorname);
			cmd.addParameter("@P_VALUE_01", pValue01);
			cmd.addParameter("@P_VALUE_02", pValue02);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
