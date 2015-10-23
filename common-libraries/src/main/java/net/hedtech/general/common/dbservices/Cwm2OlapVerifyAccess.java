package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapVerifyAccess {
		public static void verifyCubeAccess(NString pCubeOwner,NString pCubeName,NString pTypeOfAccess,NString pVerboseReport) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_VERIFY_ACCESS.VERIFY_CUBE_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_TYPE_OF_ACCESS", pTypeOfAccess);
			cmd.addParameter("@P_VERBOSE_REPORT", pVerboseReport);
				
			cmd.execute();


		}
		
	
	
	
}
