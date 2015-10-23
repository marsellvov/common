package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbProjParmConfigStrings {
		public static NString fGetError(NString pErrorname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG_STRINGS.F_GET_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ERRORNAME", pErrorname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetErrorWithValue(NString pErrorname,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG_STRINGS.F_GET_ERROR_WITH_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ERRORNAME", pErrorname);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
