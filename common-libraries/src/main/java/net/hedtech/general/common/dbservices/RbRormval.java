package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbRormval {
		public static NString fCodeExists(NString pColumn,NString pKey1,NString pKey2,NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RORMVAL.F_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COLUMN", pColumn);
			cmd.addParameter("@P_KEY_1", pKey1);
			cmd.addParameter("@P_KEY_2", pKey2);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDescription(NString pColumn,NString pKey1,NString pKey2,NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RORMVAL.F_GET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COLUMN", pColumn);
			cmd.addParameter("@P_KEY_1", pKey1);
			cmd.addParameter("@P_KEY_2", pKey2);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTranslation(NString pColumn,NString pKey1,NString pKey2,NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_RORMVAL.F_GET_TRANSLATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COLUMN", pColumn);
			cmd.addParameter("@P_KEY_1", pKey1);
			cmd.addParameter("@P_KEY_2", pKey2);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
