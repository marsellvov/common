package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokeprt {
		public static void pAddReport(NNumber pOneUpNo,NString pRptName,NString pBname,NString pDestination,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEPRT.P_ADD_REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
			cmd.addParameter("@P_RPT_NAME", pRptName);
			cmd.addParameter("@P_BNAME", pBname);
			cmd.addParameter("@P_DESTINATION", pDestination);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
