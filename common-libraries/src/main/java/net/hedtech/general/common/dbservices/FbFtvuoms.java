package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbFtvuoms {
		public static NString fCodeExists(NString pCode,NDate pEffDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FTVUOMS.F_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDescription(NString pCode,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FTVUOMS.F_GET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
